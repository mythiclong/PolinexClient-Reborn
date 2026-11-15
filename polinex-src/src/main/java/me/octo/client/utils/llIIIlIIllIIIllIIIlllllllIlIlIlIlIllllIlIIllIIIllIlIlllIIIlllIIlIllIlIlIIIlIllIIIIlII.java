package me.octo.client.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.ClickEvent.RunCommand;
import net.minecraft.network.chat.ClickEvent.SuggestCommand;
import net.minecraft.sounds.SoundEvents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII {
    public static <T> T withStyle(Object... args) { return null; } // PX-FIX ovld-var
   public static me.octo.client.PXDyn var13 = null; // PX-FIX missing field v2
   
   @NotNull
   public static llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static volatile boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private static volatile String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static volatile boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static volatile boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static volatile boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static volatile boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static volatile boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static volatile boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @Nullable
   private static JsonObject lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private static String lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private static String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static CopyOnWriteArrayList<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static ConcurrentHashMap<String, Long> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static CopyOnWriteArrayList<Function1<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, Unit>> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static CopyOnWriteArrayList<Function1<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, Unit>> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private static ConcurrentLinkedQueue<Long> IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] a;
   private static String[] b;

   private llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII() {
   }

   private final void a(Function0<Unit> var1) {
      boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      Minecraft var10001 = Minecraft.getInstance();
      short var10003 = 25973;
      short var10004 = -1959;
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      Minecraft var3 = var10001;
      boolean var2 = var10000;
      Minecraft var4 = var3;
      if (!var2) {
         if (var3.isSameThread()) {
            var1.invoke();
            return;
         }

         var4 = var3;
      }

      var4.execute(null);
   }

   @JvmStatic
   public static final boolean a() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @JvmStatic
   public static final void a(boolean var0) {
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
   }

   private final llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll b() {
      boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      long var2 = System.currentTimeMillis();
      boolean var1 = var10000;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.removeIf(
         null
      );
      Object var7 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      if (var1) {
         if (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.size()
            < IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
            return new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
               true, 0
            );
         }

         var7 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      }

      Long var8 = (Long)(Object)(CollectionsKt.minOrNull((Iterable<Double>)var7));
      long var4 = var8 != null ? var8 : var2;
      int var6 = (int)((var4 + llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI - var2) / 1000);
      return new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         false, var6
      );
   }

   @JvmStatic
   public static final boolean a(@Nullable String param0, @Nullable String param1) {
      boolean var2 = me.octo.client.utils.IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      boolean var3 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      if (var2) {
         return var3;
      }

      if (!var3) {
         d();
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§eGetting IRC information...");
         return true;
      }

      JsonObject var4 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      if (var4 != null) {
         JsonElement var5 = var4.get("banned");
         if (!var2 && var5 != null && var5.getAsBoolean()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cYou are banned from IRC. Contact support if you believe this is an error.");
            return false;
         }
      }

      boolean var6 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      if (var2) {
         return var6;
      }

      if (var6) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cYou're already connected to IRC!");
         return false;
      }

      boolean var8;
      try {
         java.util.Map<String, Object> var7 = new java.util.LinkedHashMap<>();
         switch (param0 == null ? "" : param0) {
            case "custom":
               if (param1 == null || StringsKt.isBlank(param1)) {
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cCustom nickname cannot be empty");
                  return false;
               }

               var7.put("nicknameType", "custom");
               var7.put("customNickname", param1);
               break;
            case "ign":
            case "username":
               var7.put("nicknameType", "username");
               break;
            default:
               var7.put("nicknameType", "username");
         }

         var8 = me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("irc_opt_in", var7, false, false, 12, (Object)null);
      } catch (Exception var9) {
         String var10 = "§cError joining IRC: ";
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(var10 + var9.getMessage());
         var8 = false;
      }

      return var8;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h ()Z
      // 003: istore 2
      // 004: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Z
      // 007: iload 2
      // 008: ifne 02d
      // 00b: ifne 02e
      // 00e: goto 015
      // 011: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.d ()Z
      // 018: pop
      // 019: sipush 25983
      // 01c: sipush 30886
      // 01f: pop2
      // 020: ldc "§eGetting IRC information..."
      // 022: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 025: bipush 1
      // 026: goto 02d
      // 029: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: ireturn
      // 02e: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl Lcom/google/gson/JsonObject;
      // 031: dup
      // 032: ifnull 097
      // 035: astore 5
      // 037: bipush 0
      // 038: istore 6
      // 03a: iload 2
      // 03b: ifne 07d
      // 03e: aload 5
      // 040: sipush 26073
      // 043: sipush -28840
      // 046: pop2
      // 047: ldc "banned"
      // 049: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 04c: dup
      // 04d: ifnull 07c
      // 050: goto 057
      // 053: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 05a: iload 2
      // 05b: ifne 079
      // 05e: goto 065
      // 061: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 064: athrow
      // 065: bipush 1
      // 066: if_icmpne 078
      // 069: goto 070
      // 06c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: bipush 1
      // 071: goto 07e
      // 074: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: bipush 0
      // 079: goto 07e
      // 07c: pop
      // 07d: bipush 0
      // 07e: ifeq 093
      // 081: sipush 25975
      // 084: sipush 10061
      // 087: pop2
      // 088: ldc "§cYou are banned from IRC. Contact support if you believe this is an error."
      // 08a: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 08d: bipush 0
      // 08e: ireturn
      // 08f: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: nop
      // 094: goto 099
      // 097: pop
      // 098: nop
      // 099: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 09c: iload 2
      // 09d: ifne 0be
      // 0a0: ifeq 0bf
      // 0a3: goto 0aa
      // 0a6: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: sipush 26093
      // 0ad: sipush -31483
      // 0b0: pop2
      // 0b1: ldc "§cYou're already connected to IRC!"
      // 0b3: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0b6: bipush 0
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: ireturn
      // 0bf: nop
      // 0c0: new java/util/LinkedHashMap
      // 0c3: dup
      // 0c4: invokespecial java/util/LinkedHashMap.<init> ()V
      // 0c7: checkcast java/util/Map
      // 0ca: astore 3
      // 0cb: aload 0
      // 0cc: astore 4
      // 0ce: aload 4
      // 0d0: iload 2
      // 0d1: ifne 23c
      // 0d4: ifnull 21c
      // 0d7: goto 0de
      // 0da: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: aload 4
      // 0e0: iload 2
      // 0e1: ifne 23c
      // 0e4: goto 0eb
      // 0e7: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: invokevirtual java/lang/String.hashCode ()I
      // 0ee: lookupswitch 302 3 -1349088399 79 -265713450 114 104208 38
      // 110: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: aload 4
      // 116: iload 2
      // 117: ifne 217
      // 11a: goto 121
      // 11d: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: sipush 26090
      // 124: bipush -62
      // 126: pop2
      // 127: ldc "ign"
      // 129: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 12c: ifne 1f7
      // 12f: goto 136
      // 132: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 135: athrow
      // 136: goto 21c
      // 139: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13c: athrow
      // 13d: aload 4
      // 13f: iload 2
      // 140: ifne 187
      // 143: sipush 25988
      // 146: sipush -20846
      // 149: pop2
      // 14a: ldc "custom"
      // 14c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 14f: ifne 183
      // 152: goto 159
      // 155: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 158: athrow
      // 159: goto 21c
      // 15c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15f: athrow
      // 160: aload 4
      // 162: iload 2
      // 163: ifne 217
      // 166: sipush 26046
      // 169: sipush -27023
      // 16c: pop2
      // 16d: ldc "username"
      // 16f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 172: ifne 1f7
      // 175: goto 17c
      // 178: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: goto 21c
      // 17f: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 182: athrow
      // 183: aload 1
      // 184: checkcast java/lang/CharSequence
      // 187: astore 5
      // 189: aload 5
      // 18b: iload 2
      // 18c: ifne 19b
      // 18f: ifnull 1ac
      // 192: goto 199
      // 195: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 198: athrow
      // 199: aload 5
      // 19b: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 19e: iload 2
      // 19f: ifne 1ad
      // 1a2: ifeq 1b0
      // 1a5: goto 1ac
      // 1a8: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ab: athrow
      // 1ac: bipush 1
      // 1ad: goto 1b1
      // 1b0: bipush 0
      // 1b1: ifeq 1c7
      // 1b4: sipush 25955
      // 1b7: sipush -23056
      // 1ba: pop2
      // 1bb: ldc_w "§cCustom nickname cannot be empty"
      // 1be: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 1c1: bipush 0
      // 1c2: ireturn
      // 1c3: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c6: athrow
      // 1c7: aload 3
      // 1c8: sipush 26076
      // 1cb: sipush -25247
      // 1ce: pop2
      // 1cf: ldc_w "nicknameType"
      // 1d2: sipush 25988
      // 1d5: sipush -20846
      // 1d8: pop2
      // 1d9: ldc "custom"
      // 1db: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1e0: pop
      // 1e1: aload 3
      // 1e2: sipush 26082
      // 1e5: sipush -7920
      // 1e8: pop2
      // 1e9: ldc_w "customNickname"
      // 1ec: aload 1
      // 1ed: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 1f2: pop
      // 1f3: iload 2
      // 1f4: ifeq 23d
      // 1f7: aload 3
      // 1f8: sipush 26076
      // 1fb: sipush -25247
      // 1fe: pop2
      // 1ff: ldc_w "nicknameType"
      // 202: sipush 26046
      // 205: sipush -27023
      // 208: pop2
      // 209: ldc "username"
      // 20b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 210: goto 217
      // 213: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 216: athrow
      // 217: pop
      // 218: iload 2
      // 219: ifeq 23d
      // 21c: aload 3
      // 21d: sipush 26076
      // 220: sipush -25247
      // 223: pop2
      // 224: ldc_w "nicknameType"
      // 227: sipush 26046
      // 22a: sipush -27023
      // 22d: pop2
      // 22e: ldc "username"
      // 230: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 235: goto 23c
      // 238: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23b: athrow
      // 23c: pop
      // 23d: sipush 26081
      // 240: sipush 20648
      // 243: pop2
      // 244: ldc_w "irc_opt_in"
      // 247: aload 3
      // 248: bipush 0
      // 249: bipush 0
      // 24a: bipush 12
      // 24c: aconst_null
      // 24d: invokestatic me/octo/client/utils/lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a (Ljava/lang/String;Ljava/util/Map;ZZILjava/lang/Object;)Z
      // 250: istore 3
      // 251: goto 270
      // 254: astore 4
      // 256: aload 4
      // 258: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 25b: sipush 26006
      // 25e: sipush 20918
      // 261: pop2
      // 262: ldc_w "§cError joining IRC: "
      // 265: swap
      // 266: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 26b: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 26e: bipush 0
      // 26f: istore 3
      // 270: iload 3
      // 271: ireturn
   }

   @JvmStatic
   public static final boolean c() {
      boolean var0;
      try {
         short var3 = 26043;
         short var4 = -11604;
         var0 = lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a(
            "irc_opt_out", MapsKt.emptyMap(), false, false, 12, null
         );
      } catch (Exception var2) {
         String var10000 = var2.getMessage();
         short var10001 = 26003;
         short var10002 = -19741;
         System.out.println("Error leaving IRC: " + var10000);
         var0 = false;
      }

      return var0;
   }

   @JvmStatic
   public static final boolean a(@NotNull String param0) {
      Intrinsics.checkNotNullParameter(param0, "message");
      if (!IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
         System.out.println("Not connected to IRC");
         return false;
      }
      if (StringsKt.isBlank((CharSequence)param0)) {
         System.out.println("Message cannot be empty");
         return false;
      }
      if (param0.length() > 150) {
         System.out.println("Message too long (max 50 characters)");
         return false;
      }
      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
      if (!var2.a()) {
         System.out.println("Rate limit exceeded - please wait " + var2.b() + " seconds");
         return false;
      }
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.offer(System.currentTimeMillis());
      String var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      if (var5 != null) {
         IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var7 = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var5, param0, 0L, false, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, 4, null);
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var7);
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(var5, param0, lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl, (String)null, (String)null, 48, (Object)null);
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var7);
      }
      java.util.Map<String, String> var3 = MapsKt.mapOf(kotlin.TuplesKt.to("content", param0));
      try {
         return me.octo.client.utils.lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("irc_message", var3, false, false, 12, (Object)null);
      } catch (Exception var4) {
         System.out.println("Error sending IRC message: " + var4.getMessage());
         return false;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h ()Z
      // 003: aload 0
      // 004: sipush 25967
      // 007: sipush 25454
      // 00a: pop2
      // 00b: ldc_w "message"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 1
      // 012: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 015: iload 1
      // 016: ifne 041
      // 019: ifne 03a
      // 01c: goto 023
      // 01f: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: sipush 26080
      // 026: sipush 23068
      // 029: pop2
      // 02a: ldc_w "Not connected to IRC"
      // 02d: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 030: swap
      // 031: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 034: bipush 0
      // 035: ireturn
      // 036: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: aload 0
      // 03b: checkcast java/lang/CharSequence
      // 03e: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 041: iload 1
      // 042: ifne 06a
      // 045: ifeq 066
      // 048: goto 04f
      // 04b: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04e: athrow
      // 04f: sipush 26060
      // 052: sipush -19822
      // 055: pop2
      // 056: ldc_w "Message cannot be empty"
      // 059: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 05c: swap
      // 05d: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 060: bipush 0
      // 061: ireturn
      // 062: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 065: athrow
      // 066: aload 0
      // 067: invokevirtual java/lang/String.length ()I
      // 06a: iload 1
      // 06b: ifne 094
      // 06e: sipush 150
      // 071: if_icmple 095
      // 074: goto 07b
      // 077: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07a: athrow
      // 07b: sipush 26040
      // 07e: sipush -14450
      // 081: pop2
      // 082: ldc_w "Message too long (max 50 characters)"
      // 085: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 088: swap
      // 089: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 08c: bipush 0
      // 08d: goto 094
      // 090: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 093: athrow
      // 094: ireturn
      // 095: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII;
      // 098: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b ()Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
      // 09b: astore 2
      // 09c: aload 2
      // 09d: invokevirtual me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a ()Z
      // 0a0: iload 1
      // 0a1: ifne 0e5
      // 0a4: ifne 0d9
      // 0a7: goto 0ae
      // 0aa: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 2
      // 0af: invokevirtual me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.b ()I
      // 0b2: sipush 26016
      // 0b5: sipush -22643
      // 0b8: pop2
      // 0b9: ldc_w "Rate limit exceeded - please wait "
      // 0bc: swap
      // 0bd: sipush 26048
      // 0c0: sipush 11224
      // 0c3: pop2
      // 0c4: ldc_w " seconds"
      // 0c7: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0cc: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0cf: swap
      // 0d0: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 0d3: bipush 0
      // 0d4: ireturn
      // 0d5: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d8: athrow
      // 0d9: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl Ljava/util/concurrent/ConcurrentLinkedQueue;
      // 0dc: invokestatic java/lang/System.currentTimeMillis ()J
      // 0df: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0e2: invokevirtual java/util/concurrent/ConcurrentLinkedQueue.offer (Ljava/lang/Object;)Z
      // 0e5: pop
      // 0e6: iload 1
      // 0e7: ifne 139
      // 0ea: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Ljava/lang/String;
      // 0ed: dup
      // 0ee: ifnull 138
      // 0f1: goto 0f8
      // 0f4: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f7: athrow
      // 0f8: astore 5
      // 0fa: bipush 0
      // 0fb: istore 6
      // 0fd: new me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 100: dup
      // 101: aload 5
      // 103: aload 0
      // 104: lconst_0
      // 105: bipush 0
      // 106: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 109: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 10c: bipush 4
      // 10d: aconst_null
      // 10e: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 111: astore 7
      // 113: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII;
      // 116: aload 7
      // 118: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 11b: aload 5
      // 11d: aload 0
      // 11e: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 121: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 124: aconst_null
      // 125: aconst_null
      // 126: bipush 48
      // 128: aconst_null
      // 129: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
      // 12c: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII;
      // 12f: aload 7
      // 131: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b (Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 134: nop
      // 135: goto 13a
      // 138: pop
      // 139: nop
      // 13a: nop
      // 13b: sipush 25962
      // 13e: sipush 1598
      // 141: pop2
      // 142: ldc_w "content"
      // 145: aload 0
      // 146: invokestatic kotlin/TuplesKt.to (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 149: invokestatic kotlin/collections/MapsKt.mapOf (Lkotlin/Pair;)Ljava/util/Map;
      // 14c: astore 3
      // 14d: sipush 26007
      // 150: sipush 28983
      // 153: pop2
      // 154: ldc_w "irc_message"
      // 157: aload 3
      // 158: bipush 0
      // 159: bipush 0
      // 15a: bipush 12
      // 15c: aconst_null
      // 15d: invokestatic me/octo/client/utils/lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a (Ljava/lang/String;Ljava/util/Map;ZZILjava/lang/Object;)Z
      // 160: istore 3
      // 161: goto 184
      // 164: astore 4
      // 166: aload 4
      // 168: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 16b: sipush 26039
      // 16e: sipush 991
      // 171: pop2
      // 172: ldc_w "Error sending IRC message: "
      // 175: swap
      // 176: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 17b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 17e: swap
      // 17f: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 182: bipush 0
      // 183: istore 3
      // 184: iload 3
      // 185: ireturn
   }

   @JvmStatic
   public static final boolean b(@NotNull String param0, @Nullable String param1) {
      Intrinsics.checkNotNullParameter(param0, "nicknameType");
      boolean var4;
      try {
         java.util.LinkedHashMap var3 = new java.util.LinkedHashMap();
         var3.put("nicknameType", param0);
         if (Intrinsics.areEqual(param0, "custom")) {
            CharSequence var5 = (CharSequence)param1;
            if (var5 == null || StringsKt.isBlank(var5)) {
               System.out.println("Custom nickname cannot be empty");
               return false;
            }
            if (param1.length() < 3 || param1.length() > 30) {
               System.out.println("Nickname must be 3-30 characters");
               return false;
            }
            var3.put("customNickname", param1);
         }
         var4 = lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("irc_set_nickname", var3, false, false, 12, (Object)null);
      } catch (Exception var6) {
         System.out.println("Error setting IRC nickname: " + var6.getMessage());
         var4 = false;
      }
      return var4;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i ()Z
      // 003: aload 0
      // 004: sipush 26004
      // 007: sipush 14046
      // 00a: pop2
      // 00b: ldc_w "nicknameType"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: nop
      // 013: new java/util/LinkedHashMap
      // 016: dup
      // 017: invokespecial java/util/LinkedHashMap.<init> ()V
      // 01a: checkcast java/util/Map
      // 01d: astore 3
      // 01e: aload 3
      // 01f: sipush 26076
      // 022: sipush -25247
      // 025: pop2
      // 026: ldc_w "nicknameType"
      // 029: aload 0
      // 02a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 02f: pop
      // 030: aload 0
      // 031: sipush 26078
      // 034: sipush -31892
      // 037: pop2
      // 038: ldc "custom"
      // 03a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 03d: iload 2
      // 03e: ifeq 100
      // 041: ifeq 0ed
      // 044: goto 04b
      // 047: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04a: athrow
      // 04b: aload 1
      // 04c: checkcast java/lang/CharSequence
      // 04f: astore 4
      // 051: aload 4
      // 053: iload 2
      // 054: ifeq 063
      // 057: ifnull 074
      // 05a: goto 061
      // 05d: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 060: athrow
      // 061: aload 4
      // 063: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 066: iload 2
      // 067: ifeq 075
      // 06a: ifeq 078
      // 06d: goto 074
      // 070: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 073: athrow
      // 074: bipush 1
      // 075: goto 079
      // 078: bipush 0
      // 079: ifeq 093
      // 07c: sipush 26096
      // 07f: sipush -32674
      // 082: pop2
      // 083: ldc_w "Custom nickname cannot be empty"
      // 086: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 089: swap
      // 08a: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 08d: bipush 0
      // 08e: ireturn
      // 08f: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 092: athrow
      // 093: aload 1
      // 094: invokevirtual java/lang/String.length ()I
      // 097: iload 2
      // 098: ifeq 0da
      // 09b: bipush 3
      // 09c: if_icmplt 0c1
      // 09f: goto 0a6
      // 0a2: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a5: athrow
      // 0a6: aload 1
      // 0a7: iload 2
      // 0a8: ifeq 0ec
      // 0ab: goto 0b2
      // 0ae: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: invokevirtual java/lang/String.length ()I
      // 0b5: bipush 30
      // 0b7: if_icmple 0db
      // 0ba: goto 0c1
      // 0bd: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c0: athrow
      // 0c1: sipush 25961
      // 0c4: sipush 24825
      // 0c7: pop2
      // 0c8: ldc_w "Nickname must be 3-30 characters"
      // 0cb: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 0ce: swap
      // 0cf: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 0d2: bipush 0
      // 0d3: goto 0da
      // 0d6: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: ireturn
      // 0db: aload 3
      // 0dc: sipush 25996
      // 0df: sipush -26937
      // 0e2: pop2
      // 0e3: ldc_w "customNickname"
      // 0e6: aload 1
      // 0e7: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0ec: pop
      // 0ed: sipush 25965
      // 0f0: sipush -29816
      // 0f3: pop2
      // 0f4: ldc_w "irc_set_nickname"
      // 0f7: aload 3
      // 0f8: bipush 0
      // 0f9: bipush 0
      // 0fa: bipush 12
      // 0fc: aconst_null
      // 0fd: invokestatic me/octo/client/utils/lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a (Ljava/lang/String;Ljava/util/Map;ZZILjava/lang/Object;)Z
      // 100: istore 3
      // 101: goto 124
      // 104: astore 4
      // 106: aload 4
      // 108: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 10b: sipush 26011
      // 10e: sipush 10477
      // 111: pop2
      // 112: ldc_w "Error setting IRC nickname: "
      // 115: swap
      // 116: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 11b: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 11e: swap
      // 11f: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 122: bipush 0
      // 123: istore 3
      // 124: iload 3
      // 125: ireturn
   }

   @JvmStatic
   public static final boolean d() {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      if (!var1) {
         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
         return true;
      }

      try {
         return lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a("irc_init", MapsKt.emptyMap(), false, false, 12, (Object)null);
      } catch (Exception var2) {
         System.out.println("Error requesting IRC init: " + var2.getMessage());
         return false;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i ()Z
      // 03: istore 0
      // 04: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Z
      // 07: iload 0
      // 08: ifeq 31
      // 0b: ifeq 1b
      // 0e: goto 15
      // 11: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: bipush 1
      // 16: ireturn
      // 17: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a: athrow
      // 1b: nop
      // 1c: sipush 26021
      // 1f: sipush 14454
      // 22: pop2
      // 23: ldc_w "irc_init"
      // 26: invokestatic kotlin/collections/MapsKt.emptyMap ()Ljava/util/Map;
      // 29: bipush 0
      // 2a: bipush 0
      // 2b: bipush 12
      // 2d: aconst_null
      // 2e: invokestatic me/octo/client/utils/lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.a (Ljava/lang/String;Ljava/util/Map;ZZILjava/lang/Object;)Z
      // 31: istore 1
      // 32: goto 52
      // 35: astore 2
      // 36: aload 2
      // 37: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 3a: sipush 26079
      // 3d: bipush -49
      // 3f: pop2
      // 40: ldc_w "Error requesting IRC init: "
      // 43: swap
      // 44: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 49: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 4c: swap
      // 4d: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 50: bipush 0
      // 51: istore 1
      // 52: iload 1
      // 53: ireturn
   }

   private final boolean b(String var1) {
      String var10000 = var1.toLowerCase(Locale.ROOT);
      short var10002 = 25974;
      short var10003 = 2470;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      String var3 = var10000;
      boolean var7 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      long var4 = System.currentTimeMillis();
      Long var6 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var3);
      boolean var2 = var7;
      if (var2) {
         if (var6 != null) {
            long var9;
            int var8 = (var9 = var4 - var6 - IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) == 0L
               ? 0
               : (var9 < 0L ? -1 : 1);
            if (!var2) {
               return (var8 != 0);
            }

            if (var8 < 0) {
               return false;
            }
         }

         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.put(var3, var4);
      }

      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.entrySet()
         .removeIf(null);
      return (1 != 0);
   }

   public final void a(@NotNull JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i ()Z
      // 003: aload 1
      // 004: sipush 26047
      // 007: sipush 32077
      // 00a: pop2
      // 00b: ldc_w "json"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: nop
      // 013: iload 2
      // 014: ifeq 078
      // 017: aload 1
      // 018: sipush 26062
      // 01b: sipush 22306
      // 01e: pop2
      // 01f: ldc_w "event"
      // 022: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 025: dup
      // 026: ifnull 070
      // 029: goto 030
      // 02c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: astore 6
      // 032: aload 6
      // 034: astore 7
      // 036: bipush 0
      // 037: istore 8
      // 039: aload 7
      // 03b: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 03e: iload 2
      // 03f: ifeq 04d
      // 042: ifne 050
      // 045: goto 04c
      // 048: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04b: athrow
      // 04c: bipush 1
      // 04d: goto 051
      // 050: bipush 0
      // 051: ifeq 05d
      // 054: aload 6
      // 056: goto 05e
      // 059: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05c: athrow
      // 05d: aconst_null
      // 05e: dup
      // 05f: ifnull 070
      // 062: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 065: dup
      // 066: ifnonnull 079
      // 069: goto 070
      // 06c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06f: athrow
      // 070: pop
      // 071: goto 078
      // 074: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 077: athrow
      // 078: return
      // 079: astore 3
      // 07a: iload 2
      // 07b: ifeq 0df
      // 07e: aload 1
      // 07f: sipush 25952
      // 082: sipush 1870
      // 085: pop2
      // 086: ldc_w "status"
      // 089: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 08c: dup
      // 08d: ifnull 0d7
      // 090: goto 097
      // 093: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: astore 7
      // 099: aload 7
      // 09b: astore 8
      // 09d: bipush 0
      // 09e: istore 9
      // 0a0: aload 8
      // 0a2: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 0a5: iload 2
      // 0a6: ifeq 0b4
      // 0a9: ifne 0b7
      // 0ac: goto 0b3
      // 0af: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b2: athrow
      // 0b3: bipush 1
      // 0b4: goto 0b8
      // 0b7: bipush 0
      // 0b8: ifeq 0c4
      // 0bb: aload 7
      // 0bd: goto 0c5
      // 0c0: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c3: athrow
      // 0c4: aconst_null
      // 0c5: dup
      // 0c6: ifnull 0d7
      // 0c9: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 0cc: dup
      // 0cd: ifnonnull 0e2
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: pop
      // 0d8: goto 0df
      // 0db: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0de: athrow
      // 0df: ldc_w ""
      // 0e2: astore 4
      // 0e4: iload 2
      // 0e5: ifeq 149
      // 0e8: aload 1
      // 0e9: sipush 25957
      // 0ec: sipush 8250
      // 0ef: pop2
      // 0f0: ldc_w "message"
      // 0f3: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0f6: dup
      // 0f7: ifnull 141
      // 0fa: goto 101
      // 0fd: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: astore 8
      // 103: aload 8
      // 105: astore 9
      // 107: bipush 0
      // 108: istore 10
      // 10a: aload 9
      // 10c: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 10f: iload 2
      // 110: ifeq 11e
      // 113: ifne 121
      // 116: goto 11d
      // 119: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: bipush 1
      // 11e: goto 122
      // 121: bipush 0
      // 122: ifeq 12e
      // 125: aload 8
      // 127: goto 12f
      // 12a: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12d: athrow
      // 12e: aconst_null
      // 12f: dup
      // 130: ifnull 141
      // 133: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 136: dup
      // 137: ifnonnull 14c
      // 13a: goto 141
      // 13d: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 140: athrow
      // 141: pop
      // 142: goto 149
      // 145: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 148: athrow
      // 149: ldc_w ""
      // 14c: astore 5
      // 14e: aload 4
      // 150: sipush 26019
      // 153: sipush -24879
      // 156: pop2
      // 157: ldc_w "success"
      // 15a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 15d: istore 6
      // 15f: aload 3
      // 160: astore 7
      // 162: aload 7
      // 164: invokevirtual java/lang/String.hashCode ()I
      // 167: iload 2
      // 168: ifeq 1b6
      // 16b: lookupswitch 269 5 -907571786 53 -667046443 156 -160217822 81 1373151088 131 1930051805 106
      // 19c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19f: athrow
      // 1a0: aload 7
      // 1a2: sipush 26101
      // 1a5: sipush -20189
      // 1a8: pop2
      // 1a9: ldc_w "irc_opt_in"
      // 1ac: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1af: goto 1b6
      // 1b2: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b5: athrow
      // 1b6: ifne 220
      // 1b9: goto 29b
      // 1bc: aload 7
      // 1be: sipush 26109
      // 1c1: sipush 25936
      // 1c4: pop2
      // 1c5: ldc_w "irc_message"
      // 1c8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1cb: ifne 240
      // 1ce: goto 29b
      // 1d1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d4: athrow
      // 1d5: aload 7
      // 1d7: sipush 25979
      // 1da: sipush 2358
      // 1dd: pop2
      // 1de: ldc_w "irc_opt_out"
      // 1e1: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e4: ifne 22d
      // 1e7: goto 29b
      // 1ea: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ed: athrow
      // 1ee: aload 7
      // 1f0: sipush 26105
      // 1f3: sipush 5764
      // 1f6: pop2
      // 1f7: ldc_w "irc_set_nickname"
      // 1fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1fd: ifne 254
      // 200: goto 29b
      // 203: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 206: athrow
      // 207: aload 7
      // 209: sipush 26054
      // 20c: sipush -16343
      // 20f: pop2
      // 210: ldc_w "irc_init"
      // 213: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 216: ifne 268
      // 219: goto 29b
      // 21c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: aload 0
      // 221: iload 6
      // 223: aload 5
      // 225: aload 1
      // 226: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (ZLjava/lang/String;Lcom/google/gson/JsonObject;)V
      // 229: iload 2
      // 22a: ifne 29b
      // 22d: aload 0
      // 22e: iload 6
      // 230: aload 5
      // 232: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (ZLjava/lang/String;)V
      // 235: iload 2
      // 236: ifne 29b
      // 239: goto 240
      // 23c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23f: athrow
      // 240: aload 0
      // 241: iload 6
      // 243: aload 5
      // 245: aload 1
      // 246: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b (ZLjava/lang/String;Lcom/google/gson/JsonObject;)V
      // 249: iload 2
      // 24a: ifne 29b
      // 24d: goto 254
      // 250: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 253: athrow
      // 254: aload 0
      // 255: iload 6
      // 257: aload 5
      // 259: aload 1
      // 25a: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.c (ZLjava/lang/String;Lcom/google/gson/JsonObject;)V
      // 25d: iload 2
      // 25e: ifne 29b
      // 261: goto 268
      // 264: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 267: athrow
      // 268: aload 0
      // 269: iload 6
      // 26b: aload 5
      // 26d: aload 1
      // 26e: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.d (ZLjava/lang/String;Lcom/google/gson/JsonObject;)V
      // 271: goto 278
      // 274: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 277: athrow
      // 278: goto 29b
      // 27b: astore 3
      // 27c: aload 3
      // 27d: invokevirtual java/lang/Exception.printStackTrace ()V
      // 280: aload 3
      // 281: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 284: sipush 26077
      // 287: sipush -27533
      // 28a: pop2
      // 28b: ldc_w "Error handling IRC server response: "
      // 28e: swap
      // 28f: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 294: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 297: swap
      // 298: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 29b: return
   }

   public final void b(@NotNull JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/utils/IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h ()Z
      // 003: aload 1
      // 004: sipush 26033
      // 007: sipush 24166
      // 00a: pop2
      // 00b: ldc_w "json"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: nop
      // 013: iload 2
      // 014: ifne 03b
      // 017: aload 1
      // 018: sipush 26099
      // 01b: sipush -27250
      // 01e: pop2
      // 01f: ldc_w "event"
      // 022: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 025: dup
      // 026: ifnull 03a
      // 029: goto 030
      // 02c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02f: athrow
      // 030: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 033: goto 03c
      // 036: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: pop
      // 03b: aconst_null
      // 03c: astore 3
      // 03d: aload 3
      // 03e: checkcast java/lang/CharSequence
      // 041: astore 4
      // 043: aload 4
      // 045: iload 2
      // 046: ifne 055
      // 049: ifnull 068
      // 04c: goto 053
      // 04f: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 4
      // 055: invokeinterface java/lang/CharSequence.length ()I 1
      // 05a: iload 2
      // 05b: ifne 069
      // 05e: ifne 06c
      // 061: goto 068
      // 064: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 067: athrow
      // 068: bipush 1
      // 069: goto 06d
      // 06c: bipush 0
      // 06d: ifeq 086
      // 070: sipush 26094
      // 073: sipush -18556
      // 076: pop2
      // 077: ldc_w "Event type is null/empty, returning"
      // 07a: getstatic java/lang/System.out Ljava/io/PrintStream;
      // 07d: swap
      // 07e: invokevirtual java/io/PrintStream.println (Ljava/lang/Object;)V
      // 081: return
      // 082: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 085: athrow
      // 086: aload 3
      // 087: sipush 26007
      // 08a: sipush 28983
      // 08d: pop2
      // 08e: ldc_w "irc_message"
      // 091: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 094: iload 2
      // 095: ifne 10c
      // 098: ifne 10b
      // 09b: goto 0a2
      // 09e: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a1: athrow
      // 0a2: aload 3
      // 0a3: sipush 26089
      // 0a6: sipush -16288
      // 0a9: pop2
      // 0aa: ldc_w "irc_user_joined"
      // 0ad: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0b0: iload 2
      // 0b1: ifne 10c
      // 0b4: goto 0bb
      // 0b7: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ba: athrow
      // 0bb: ifne 10b
      // 0be: goto 0c5
      // 0c1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c4: athrow
      // 0c5: aload 3
      // 0c6: sipush 25963
      // 0c9: sipush -18530
      // 0cc: pop2
      // 0cd: ldc_w "irc_user_left"
      // 0d0: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0d3: iload 2
      // 0d4: ifne 10c
      // 0d7: goto 0de
      // 0da: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dd: athrow
      // 0de: ifne 10b
      // 0e1: goto 0e8
      // 0e4: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e7: athrow
      // 0e8: aload 3
      // 0e9: sipush 25940
      // 0ec: sipush -19189
      // 0ef: pop2
      // 0f0: ldc_w "irc_system_message"
      // 0f3: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 0f6: iload 2
      // 0f7: ifne 10c
      // 0fa: goto 101
      // 0fd: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: ifeq 10f
      // 104: goto 10b
      // 107: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10a: athrow
      // 10b: bipush 1
      // 10c: goto 110
      // 10f: bipush 0
      // 110: istore 4
      // 112: iload 4
      // 114: iload 2
      // 115: ifne 125
      // 118: ifeq 129
      // 11b: goto 122
      // 11e: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 121: athrow
      // 122: getstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 125: ifne 129
      // 128: return
      // 129: aload 3
      // 12a: astore 5
      // 12c: aload 5
      // 12e: invokevirtual java/lang/String.hashCode ()I
      // 131: iload 2
      // 132: ifne 182
      // 135: lookupswitch 1452 5 -2048569220 133 -1866170794 108 -1276070255 83 -160217822 55 1858260440 158
      // 168: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16b: athrow
      // 16c: aload 5
      // 16e: sipush 26007
      // 171: sipush 28983
      // 174: pop2
      // 175: ldc_w "irc_message"
      // 178: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 17b: goto 182
      // 17e: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 181: athrow
      // 182: ifne 1ec
      // 185: goto 6e9
      // 188: aload 5
      // 18a: sipush 26092
      // 18d: sipush 1078
      // 190: pop2
      // 191: ldc_w "irc_status_update"
      // 194: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 197: ifne 6d5
      // 19a: goto 6e9
      // 19d: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a0: athrow
      // 1a1: aload 5
      // 1a3: sipush 26063
      // 1a6: sipush -31424
      // 1a9: pop2
      // 1aa: ldc_w "irc_user_left"
      // 1ad: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1b0: ifne 6b5
      // 1b3: goto 6e9
      // 1b6: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b9: athrow
      // 1ba: aload 5
      // 1bc: sipush 26027
      // 1bf: sipush -26236
      // 1c2: pop2
      // 1c3: ldc_w "irc_system_message"
      // 1c6: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1c9: ifne 6c5
      // 1cc: goto 6e9
      // 1cf: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 5
      // 1d5: sipush 26067
      // 1d8: sipush 10325
      // 1db: pop2
      // 1dc: ldc_w "irc_user_joined"
      // 1df: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e2: ifne 6a5
      // 1e5: goto 6e9
      // 1e8: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: aload 1
      // 1ed: sipush 26002
      // 1f0: sipush -20601
      // 1f3: pop2
      // 1f4: ldc_w "sender"
      // 1f7: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 1fa: dup
      // 1fb: ifnull 20c
      // 1fe: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 201: dup
      // 202: ifnonnull 21e
      // 205: goto 20c
      // 208: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20b: athrow
      // 20c: pop
      // 20d: sipush 25953
      // 210: sipush -6620
      // 213: pop2
      // 214: ldc_w "Unknown"
      // 217: goto 21e
      // 21a: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21d: athrow
      // 21e: astore 6
      // 220: iload 2
      // 221: ifne 253
      // 224: aload 1
      // 225: sipush 25962
      // 228: sipush 1598
      // 22b: pop2
      // 22c: ldc_w "content"
      // 22f: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 232: dup
      // 233: ifnull 24b
      // 236: goto 23d
      // 239: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23c: athrow
      // 23d: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 240: dup
      // 241: ifnonnull 256
      // 244: goto 24b
      // 247: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24a: athrow
      // 24b: pop
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: ldc_w ""
      // 256: astore 7
      // 258: aload 1
      // 259: sipush 26035
      // 25c: sipush 7946
      // 25f: pop2
      // 260: ldc_w "roleColor"
      // 263: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 266: astore 8
      // 268: aload 1
      // 269: sipush 25972
      // 26c: sipush -2265
      // 26f: pop2
      // 270: ldc_w "prefix"
      // 273: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 276: astore 9
      // 278: iload 2
      // 279: ifne 2c6
      // 27c: aload 8
      // 27e: dup
      // 27f: ifnull 2c5
      // 282: goto 289
      // 285: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 288: athrow
      // 289: astore 12
      // 28b: aload 12
      // 28d: astore 13
      // 28f: bipush 0
      // 290: istore 14
      // 292: aload 13
      // 294: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 297: iload 2
      // 298: ifne 2a6
      // 29b: ifne 2a9
      // 29e: goto 2a5
      // 2a1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a4: athrow
      // 2a5: bipush 1
      // 2a6: goto 2aa
      // 2a9: bipush 0
      // 2aa: ifeq 2b6
      // 2ad: aload 12
      // 2af: goto 2b7
      // 2b2: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2b5: athrow
      // 2b6: aconst_null
      // 2b7: dup
      // 2b8: ifnull 2c5
      // 2bb: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 2be: goto 2c7
      // 2c1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c4: athrow
      // 2c5: pop
      // 2c6: aconst_null
      // 2c7: astore 10
      // 2c9: iload 2
      // 2ca: ifne 317
      // 2cd: aload 9
      // 2cf: dup
      // 2d0: ifnull 316
      // 2d3: goto 2da
      // 2d6: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: astore 13
      // 2dc: aload 13
      // 2de: astore 14
      // 2e0: bipush 0
      // 2e1: istore 15
      // 2e3: aload 14
      // 2e5: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 2e8: iload 2
      // 2e9: ifne 2f7
      // 2ec: ifne 2fa
      // 2ef: goto 2f6
      // 2f2: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f5: athrow
      // 2f6: bipush 1
      // 2f7: goto 2fb
      // 2fa: bipush 0
      // 2fb: ifeq 307
      // 2fe: aload 13
      // 300: goto 308
      // 303: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 306: athrow
      // 307: aconst_null
      // 308: dup
      // 309: ifnull 316
      // 30c: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 30f: goto 318
      // 312: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 315: athrow
      // 316: pop
      // 317: aconst_null
      // 318: astore 11
      // 31a: aload 1
      // 31b: sipush 26045
      // 31e: sipush 2030
      // 321: pop2
      // 322: ldc_w "ownRoleColor"
      // 325: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 328: astore 12
      // 32a: aload 1
      // 32b: sipush 26091
      // 32e: sipush 18199
      // 331: pop2
      // 332: ldc_w "ownPrefix"
      // 335: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 338: astore 13
      // 33a: iload 2
      // 33b: ifne 388
      // 33e: aload 12
      // 340: dup
      // 341: ifnull 387
      // 344: goto 34b
      // 347: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34a: athrow
      // 34b: astore 16
      // 34d: aload 16
      // 34f: astore 17
      // 351: bipush 0
      // 352: istore 18
      // 354: aload 17
      // 356: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 359: iload 2
      // 35a: ifne 368
      // 35d: ifne 36b
      // 360: goto 367
      // 363: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 366: athrow
      // 367: bipush 1
      // 368: goto 36c
      // 36b: bipush 0
      // 36c: ifeq 378
      // 36f: aload 16
      // 371: goto 379
      // 374: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 377: athrow
      // 378: aconst_null
      // 379: dup
      // 37a: ifnull 387
      // 37d: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 380: goto 389
      // 383: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 386: athrow
      // 387: pop
      // 388: aconst_null
      // 389: astore 14
      // 38b: iload 2
      // 38c: ifne 3d9
      // 38f: aload 13
      // 391: dup
      // 392: ifnull 3d8
      // 395: goto 39c
      // 398: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39b: athrow
      // 39c: astore 17
      // 39e: aload 17
      // 3a0: astore 18
      // 3a2: bipush 0
      // 3a3: istore 19
      // 3a5: aload 18
      // 3a7: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 3aa: iload 2
      // 3ab: ifne 3b9
      // 3ae: ifne 3bc
      // 3b1: goto 3b8
      // 3b4: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3b7: athrow
      // 3b8: bipush 1
      // 3b9: goto 3bd
      // 3bc: bipush 0
      // 3bd: ifeq 3c9
      // 3c0: aload 17
      // 3c2: goto 3ca
      // 3c5: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c8: athrow
      // 3c9: aconst_null
      // 3ca: dup
      // 3cb: ifnull 3d8
      // 3ce: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 3d1: goto 3da
      // 3d4: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d7: athrow
      // 3d8: pop
      // 3d9: aconst_null
      // 3da: astore 15
      // 3dc: aload 14
      // 3de: iload 2
      // 3df: ifne 40f
      // 3e2: ifnonnull 403
      // 3e5: goto 3ec
      // 3e8: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3eb: athrow
      // 3ec: aload 15
      // 3ee: iload 2
      // 3ef: ifne 4c3
      // 3f2: goto 3f9
      // 3f5: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f8: athrow
      // 3f9: ifnull 4be
      // 3fc: goto 403
      // 3ff: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 402: athrow
      // 403: aload 14
      // 405: checkcast java/lang/CharSequence
      // 408: goto 40f
      // 40b: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40e: athrow
      // 40f: astore 16
      // 411: aload 16
      // 413: iload 2
      // 414: ifne 423
      // 417: ifnull 436
      // 41a: goto 421
      // 41d: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 420: athrow
      // 421: aload 16
      // 423: invokeinterface java/lang/CharSequence.length ()I 1
      // 428: iload 2
      // 429: ifne 437
      // 42c: ifne 43a
      // 42f: goto 436
      // 432: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 435: athrow
      // 436: bipush 1
      // 437: goto 43b
      // 43a: bipush 0
      // 43b: ifne 457
      // 43e: aload 14
      // 440: sipush 25999
      // 443: sipush 3951
      // 446: pop2
      // 447: ldc_w "null"
      // 44a: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 44d: ifeq 45f
      // 450: goto 457
      // 453: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 456: athrow
      // 457: aconst_null
      // 458: goto 461
      // 45b: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45e: athrow
      // 45f: aload 14
      // 461: putstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Ljava/lang/String;
      // 464: aload 15
      // 466: checkcast java/lang/CharSequence
      // 469: astore 16
      // 46b: aload 16
      // 46d: iload 2
      // 46e: ifne 47d
      // 471: ifnull 490
      // 474: goto 47b
      // 477: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47a: athrow
      // 47b: aload 16
      // 47d: invokeinterface java/lang/CharSequence.length ()I 1
      // 482: iload 2
      // 483: ifne 491
      // 486: ifne 494
      // 489: goto 490
      // 48c: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48f: athrow
      // 490: bipush 1
      // 491: goto 495
      // 494: bipush 0
      // 495: ifne 4b1
      // 498: aload 15
      // 49a: sipush 25999
      // 49d: sipush 3951
      // 4a0: pop2
      // 4a1: ldc_w "null"
      // 4a4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 4a7: ifeq 4b9
      // 4aa: goto 4b1
      // 4ad: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b0: athrow
      // 4b1: aconst_null
      // 4b2: goto 4bb
      // 4b5: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b8: athrow
      // 4b9: aload 15
      // 4bb: putstatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Ljava/lang/String;
      // 4be: aload 6
      // 4c0: checkcast java/lang/CharSequence
      // 4c3: invokeinterface java/lang/CharSequence.length ()I 1
      // 4c8: iload 2
      // 4c9: ifne 4d7
      // 4cc: ifle 4da
      // 4cf: goto 4d6
      // 4d2: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d5: athrow
      // 4d6: bipush 1
      // 4d7: goto 4db
      // 4da: bipush 0
      // 4db: ifeq 6e9
      // 4de: aload 7
      // 4e0: checkcast java/lang/CharSequence
      // 4e3: invokeinterface java/lang/CharSequence.length ()I 1
      // 4e8: iload 2
      // 4e9: ifne 4fe
      // 4ec: goto 4f3
      // 4ef: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f2: athrow
      // 4f3: ifle 501
      // 4f6: goto 4fd
      // 4f9: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4fc: athrow
      // 4fd: bipush 1
      // 4fe: goto 502
      // 501: bipush 0
      // 502: ifeq 6e9
      // 505: aload 10
      // 507: checkcast java/lang/CharSequence
      // 50a: astore 17
      // 50c: aload 17
      // 50e: iload 2
      // 50f: ifne 51e
      // 512: ifnull 531
      // 515: goto 51c
      // 518: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51b: athrow
      // 51c: aload 17
      // 51e: invokeinterface java/lang/CharSequence.length ()I 1
      // 523: iload 2
      // 524: ifne 532
      // 527: ifne 535
      // 52a: goto 531
      // 52d: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 530: athrow
      // 531: bipush 1
      // 532: goto 536
      // 535: bipush 0
      // 536: ifne 552
      // 539: aload 10
      // 53b: sipush 25999
      // 53e: sipush 3951
      // 541: pop2
      // 542: ldc_w "null"
      // 545: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 548: ifeq 55a
      // 54b: goto 552
      // 54e: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 551: athrow
      // 552: aconst_null
      // 553: goto 55c
      // 556: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 559: athrow
      // 55a: aload 10
      // 55c: astore 16
      // 55e: aload 11
      // 560: checkcast java/lang/CharSequence
      // 563: astore 18
      // 565: aload 18
      // 567: iload 2
      // 568: ifne 577
      // 56b: ifnull 58a
      // 56e: goto 575
      // 571: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 574: athrow
      // 575: aload 18
      // 577: invokeinterface java/lang/CharSequence.length ()I 1
      // 57c: iload 2
      // 57d: ifne 58b
      // 580: ifne 58e
      // 583: goto 58a
      // 586: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 589: athrow
      // 58a: bipush 1
      // 58b: goto 58f
      // 58e: bipush 0
      // 58f: ifne 5ab
      // 592: aload 11
      // 594: sipush 25999
      // 597: sipush 3951
      // 59a: pop2
      // 59b: ldc_w "null"
      // 59e: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 5a1: ifeq 5b3
      // 5a4: goto 5ab
      // 5a7: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5aa: athrow
      // 5ab: aconst_null
      // 5ac: goto 5b5
      // 5af: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b2: athrow
      // 5b3: aload 11
      // 5b5: astore 17
      // 5b7: new me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 5ba: dup
      // 5bb: aload 6
      // 5bd: aload 7
      // 5bf: lconst_0
      // 5c0: bipush 0
      // 5c1: aload 16
      // 5c3: aload 17
      // 5c5: bipush 4
      // 5c6: aconst_null
      // 5c7: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.<init> (Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
      // 5ca: astore 18
      // 5cc: aload 0
      // 5cd: aload 18
      // 5cf: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 5d2: iload 2
      // 5d3: ifne 62c
      // 5d6: aload 1
      // 5d7: sipush 26097
      // 5da: sipush -13345
      // 5dd: pop2
      // 5de: ldc_w "senderDiscordUsername"
      // 5e1: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 5e4: dup
      // 5e5: ifnull 62b
      // 5e8: goto 5ef
      // 5eb: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ee: athrow
      // 5ef: astore 21
      // 5f1: aload 21
      // 5f3: astore 22
      // 5f5: bipush 0
      // 5f6: istore 23
      // 5f8: aload 22
      // 5fa: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 5fd: iload 2
      // 5fe: ifne 60c
      // 601: ifne 60f
      // 604: goto 60b
      // 607: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 60a: athrow
      // 60b: bipush 1
      // 60c: goto 610
      // 60f: bipush 0
      // 610: ifeq 61c
      // 613: aload 21
      // 615: goto 61d
      // 618: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 61b: athrow
      // 61c: aconst_null
      // 61d: dup
      // 61e: ifnull 62b
      // 621: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 624: goto 62d
      // 627: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62a: athrow
      // 62b: pop
      // 62c: aconst_null
      // 62d: astore 19
      // 62f: iload 2
      // 630: ifne 689
      // 633: aload 1
      // 634: sipush 26038
      // 637: sipush -5987
      // 63a: pop2
      // 63b: ldc_w "senderDiscord"
      // 63e: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 641: dup
      // 642: ifnull 688
      // 645: goto 64c
      // 648: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64b: athrow
      // 64c: astore 22
      // 64e: aload 22
      // 650: astore 23
      // 652: bipush 0
      // 653: istore 24
      // 655: aload 23
      // 657: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 65a: iload 2
      // 65b: ifne 669
      // 65e: ifne 66c
      // 661: goto 668
      // 664: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 667: athrow
      // 668: bipush 1
      // 669: goto 66d
      // 66c: bipush 0
      // 66d: ifeq 679
      // 670: aload 22
      // 672: goto 67a
      // 675: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 678: athrow
      // 679: aconst_null
      // 67a: dup
      // 67b: ifnull 688
      // 67e: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 681: goto 68a
      // 684: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 687: athrow
      // 688: pop
      // 689: aconst_null
      // 68a: astore 20
      // 68c: aload 6
      // 68e: aload 7
      // 690: aload 16
      // 692: aload 17
      // 694: aload 19
      // 696: aload 20
      // 698: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      // 69b: aload 0
      // 69c: aload 18
      // 69e: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.b (Lme/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)V
      // 6a1: iload 2
      // 6a2: ifeq 6e9
      // 6a5: aload 0
      // 6a6: aload 1
      // 6a7: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.d (Lcom/google/gson/JsonObject;)V
      // 6aa: iload 2
      // 6ab: ifeq 6e9
      // 6ae: goto 6b5
      // 6b1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6b4: athrow
      // 6b5: aload 0
      // 6b6: aload 1
      // 6b7: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.e (Lcom/google/gson/JsonObject;)V
      // 6ba: iload 2
      // 6bb: ifeq 6e9
      // 6be: goto 6c5
      // 6c1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c4: athrow
      // 6c5: aload 0
      // 6c6: aload 1
      // 6c7: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.c (Lcom/google/gson/JsonObject;)V
      // 6ca: iload 2
      // 6cb: ifeq 6e9
      // 6ce: goto 6d5
      // 6d1: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6d4: athrow
      // 6d5: aload 0
      // 6d6: aload 1
      // 6d7: invokespecial me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f (Lcom/google/gson/JsonObject;)V
      // 6da: goto 6e1
      // 6dd: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6e0: athrow
      // 6e1: goto 6e9
      // 6e4: astore 3
      // 6e5: aload 3
      // 6e6: invokevirtual java/lang/Exception.printStackTrace ()V
      // 6e9: return
   }

   private final void a(boolean var1, String var2, JsonObject var3) {
      Object var14 = null; // PX-FIX
      boolean var4 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      if (!var4) {
         if (var1) {
            short var10001 = 25989;
            short var10002 = 625;
            JsonElement var10000 = var3.get("firstTime");
            boolean var5 = var10000 != null ? var10000.getAsBoolean() : false;
            boolean var12 = var5;
            if (!var4) {
               if (var5) {
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
                  var10001 = 25998;
                  var10002 = -6182;
                  JsonArray var11 = var3.getAsJsonArray("displayOptions");
                  if (var4) {
                     return;
                  }

                  if (var11 != null) {
                     this.a(var11);
                     return;
                  }

                  return;
               }

               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
               var12 = false;
            }

            label56: {
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var12;
               if (!var4) {
                  var10001 = 26046;
                  var10002 = -27023;
                  var10000 = var3.get("username");
                  if (var10000 != null) {
                     var14 = var10000.getAsString();
                     break label56;
                  }
               }

               var14 = null;
            }

            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI =((String)( var14));
            String var15 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            String var21 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (!var4) {
               if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  short var16 = 25953;
                  var10001 = -6620;
                  var15 = "Unknown";
               }

               var21 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }

            String var6 = a(var15, var21, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
            String var17 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            String var23 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            if (!var4) {
               if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  short var18 = 25953;
                  var10001 = -6620;
                  var17 = "Unknown";
               }

               var23 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }

            MutableComponent var7 = b(var17, var23, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
            short var19 = 26058;
            var10001 = 23562;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("§aConnected to IRC as ", var7);
            var10002 = 26034;
            short var10003 = 21504;
            this.e("Connected to IRC as " + var6);
            MutableComponent var8 = this.e();
            this.a((kotlin.jvm.functions.Function0)(llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII::a));
            llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var9 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               true, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, null, 4, null
            );
            this.a(var9);
            if (!var4) {
               return;
            }
         }

         short var26 = 25956;
         short var30 = 15794;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cFailed to join IRC: " + var2);
      }

      llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var10 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         false, null, var2
      );
      this.a(var10);
   }

   private final MutableComponent c(String var1) {
      String var2 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p();
      String var3 = a(
         var1,
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      short var10001 = 26030;
      short var10002 = 20139;
      MutableComponent var10000 = Component.literal("§aYou can reconnect to IRC as " + var3 + " ");
      var10001 = 26049;
      var10002 = 30286;
      var10000 = var10000.append(
         Component.literal("§b§l[CLICK TO RECONNECT]").withStyle((java.util.function.UnaryOperator<net.minecraft.network.chat.Style>)null)
      );
      var10002 = 26026;
      short var10003 = 1728;
      var10003 = 26032;
      short var10004 = 27670;
      var10000 = var10000.append(Component.literal(" §7or type §f/" + var2 + " join"));
      var10002 = 25984;
      var10003 = -17711;
      Intrinsics.checkNotNullExpressionValue(var10000, "append(...)");
      return var10000;
   }

   private final MutableComponent e() {
      short var10000 = 25954;
      String var1 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p();
      short var10001 = 21164;
      MutableComponent var2 = Component.literal("§7Click here to ");
      var10001 = 25941;
      short var10002 = -5390;
      MutableComponent var3 = var2.append(
         Component.literal("§c§l[DISCONNECT]").withStyle((java.util.function.UnaryOperator<net.minecraft.network.chat.Style>)null)
      );
      var10002 = 26025;
      short var10003 = -12185;
      var10003 = 26084;
      short var10004 = 20441;
      MutableComponent var4 = var3.append(Component.literal(" §7or type §f/" + var1 + " leave"));
      var10002 = 26009;
      var10003 = 7045;
      Intrinsics.checkNotNullExpressionValue(var4, "append(...)");
      return var4;
   }

   private final void a(JsonArray var1) { int var13 = 0; // PX-FIX hoist
        
      String var23 = null; // PX-FIX
      Object var19 = null; // PX-FIX
      Object var17 = null; // PX-FIX
      Object var15 = null; // PX-FIX
      short var10000 = 25969;
      short var10001 = 20823;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§d§lIRC Nickname Setup");
       var13 = ((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0);
      var10001 = 26008;
      short var10002 = -17350;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§7Choose your display name (This will be how other users see you in IRC):"
      );
      String var3 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p();
      int var4 = 0;
      int var5 = var1.size();
      boolean var2 = (var13 != 0);

      while (true) {
         if (var4 < var5) {
            JsonObject var6 = var1.get(var4).getAsJsonObject();
            if (!var2) {
               break;
            }

            label102: {
               if (var2) {
                  var10001 = 26104;
                  var10002 = -8857;
                  JsonElement var14 = var6.get("type");
                  if (var14 != null) {
                     var15 = var14.getAsString();
                     if (var15 != null) {
                        break label102;
                     }
                  }
               }

               var15 = "";
            }

            String var7;
            label95: {
               var7 =((String)( var15));
               if (var2) {
                  var10001 = 26017;
                  var10002 = 23950;
                  JsonElement var16 = var6.get("display");
                  if (var16 != null) {
                     var17 = var16.getAsString();
                     if (var17 != null) {
                        break label95;
                     }
                  }
               }

               var17 = "";
            }

            String var8;
            label88: {
               var8 =((String)( var17));
               if (var2) {
                  var10001 = 26102;
                  var10002 = -30018;
                  JsonElement var18 = var6.get("description");
                  if (var18 != null) {
                     var19 = var18.getAsString();
                     if (var19 != null) {
                        break label88;
                     }
                  }
               }

               var19 = "";
            }

            String var9;
            label81: {
               var9 =((String)( var19));
               if (var2) {
                  var10001 = 25997;
                  var10002 = 21839;
                  JsonElement var20 = var6.get("requiresCustomInput");
                  if (var20 != null) {
                     var13 = ((var20.getAsBoolean()) ? 1 : 0);
                     break label81;
                  }
               }

               var13 = (int)((0 != 0) ? 1 : 0);
            }

            boolean var10;
            label75: {
               label74: {
                  var10 =( var13 != 0);
                  var13 = var7.hashCode();
                  if (var2) {
                     switch (var13) {
                        case -1349088399:
                           var23 = var7;
                           if (!var2) {
                              break label75;
                           }

                           var10001 = 25988;
                           var10002 = -20846;
                           if (var7.equals("custom")) {
                              short var28 = 25970;
                              var10001 = -26624;
                              var23 = "§e⚬";
                              break label75;
                           }
                           break label74;
                        case -804061201:
                           var23 = var7;
                           if (!var2) {
                              break label75;
                           }

                           var10001 = 26087;
                           var10002 = 27552;
                           if (var7.equals("discord-nickname")) {
                              short var26 = 26014;
                              var10001 = -22078;
                              var23 = "§9⚬";
                              break label75;
                           }
                           break label74;
                        case 1383105854:
                           var23 = var7;
                           if (!var2) {
                              break label75;
                           }

                           var10001 = 25992;
                           var10002 = 8173;
                           if (var7.equals("polinex-username")) {
                              short var25 = 26059;
                              var10001 = -999;
                              var23 = "§b⚬";
                              break label75;
                           }
                           break label74;
                        case 1671380268:
                           var23 = var7;
                           if (!var2) {
                              break label75;
                           }

                           var10001 = 26086;
                           var10002 = 20701;
                           var13 = ((var7.equals("discord")) ? 1 : 0);
                           break;
                        default:
                           break label74;
                     }
                  }

                  if (var13 != 0) {
                     short var24 = 25959;
                     var10001 = 5027;
                     var23 = "§9⚬";
                     break label75;
                  }
               }

               short var27 = 26010;
               var10001 = -7582;
               var23 = "§f⚬";
            }

            String var11 = var23;
            var10002 = 26106;
            short var10003 = 18828;
            MutableComponent var29 = Component.literal(var11 + " §f" + var8);
            var10002 = 26051;
            var10003 = -13408;
            MutableComponent var30 = var29.append(Component.literal(" §8- §7" + var9))
               .withStyle((java.util.function.UnaryOperator<net.minecraft.network.chat.Style>)null);
            var10002 = 26056;
            var10003 = -11662;
            Intrinsics.checkNotNullExpressionValue(var30, "withStyle(...)");
            MutableComponent var12 = var30;
            this.a((kotlin.jvm.functions.Function1)null);
            var4++;
            if (var2) {
               continue;
            }
         }

         short var31 = 25966;
         var10001 = -27534;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§7Click any option above to select it"
         );
         break;
      }
   }

   private final void a(boolean var1, String var2) {
      label16: {
         boolean var3 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         short var10000 =((short)(( var1) ? 1 : 0));
         if (!var3) {
            if (!var1) {
               break label16;
            }

            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
            var10000 = 0;
         }

         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (var10000 != 0);
         var10000 = 26031;
         short var10001 = -27015;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aDisconnected from IRC.");
         var10001 = 26013;
         short var10002 = 12611;
         this.e("Disconnected from IRC");
         n();
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            false, null, null, 4, null
         );
         this.a(var4);
         if (!var3) {
            return;
         }
      }

      short var7 = 26088;
      short var8 = -12934;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cFailed to leave IRC: " + var2);
   }

   // $VF: Extended synchronized range to monitorexit
   private final void b(boolean var1, String var2, JsonObject var3) { llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = null; // PX-FIX hoist
        
      boolean var4 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      if (var1) {
         String var21;
         label189: {
            short var10001 = 26053;
            short var10002 = 131;
            JsonElement var10000 = var3.get("roleColor");
            if (var10000 != null) {
               JsonElement var8 = var10000;
               boolean var10 = false;
               boolean var19 = var8.isJsonNull();
               if (var4) {
                  var19 = !var19;
               }

               JsonElement var20 = var19 ? var8 : null;
               if ((var19 ? var8 : null) != null) {
                  var21 = var20.getAsString();
                  break label189;
               }
            }

            var21 = null;
         }

         String var5;
         label181: {
            var5 = var21;
            if (var4) {
               short var38 = 26022;
               short var46 = 5891;
               JsonElement var22 = var3.get("prefix");
               if (var22 != null) {
                  JsonElement var9 = var22;
                  boolean var11 = false;
                  boolean var23 = var9.isJsonNull();
                  if (var4) {
                     var23 = !var23;
                  }

                  JsonElement var24 = var23 ? var9 : null;
                  if ((var23 ? var9 : null) != null) {
                     var21 = var24.getAsString();
                     break label181;
                  }
               }
            }

            var21 = null;
         }

         String var6 = var21;
         String var26 = var5;
         if (var4) {
            if (var5 != null) {
               int var27 = var5.length();
               if (var4) {
                  var27 = var27 == 0 ? 1 : 0;
               }

               label166: {
                  if (var27 == 0) {
                     short var39 = 26110;
                     short var47 = -5821;
                     if (!Intrinsics.areEqual(var5, "null")) {
                        var26 = var5;
                        break label166;
                     }
                  }

                  var26 = null;
               }

               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var26;
            }

            var26 = var6;
         }

         label198: {
            if (var4) {
               if (var26 == null) {
                  break label198;
               }

               var26 = var6;
            }

            int var29 = var26.length();
            if (var4) {
               var29 = var29 == 0 ? 1 : 0;
            }

            label155: {
               if (var29 == 0) {
                  short var40 = 25999;
                  short var48 = 3951;
                  if (!Intrinsics.areEqual(var6, "null")) {
                     var26 = var6;
                     break label155;
                  }
               }

               var26 = null;
            }

            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var26;
         }

         label147: {
            label199: {
               String var42;
               label200: {
                  short var41 = 26098;
                  short var49 = 6003;
                  JsonElement var31 = var3.get("sender");
                  if (var31 != null) {
                     var26 = var31.getAsString();
                     var42 = var26;
                     if (!var4) {
                        break label200;
                     }

                     if (var26 != null) {
                        break label147;
                     }
                  }

                  if (!var4) {
                     break label199;
                  }

                  var26 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
                  var42 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               }

               if (var42 != null) {
                  break label147;
               }
            }

            short var33 = 26000;
            short var43 = 15649;
            var26 = "Unknown";
         }

         String var7;
         label132: {
            var7 = var26;
            if (var4) {
               short var44 = 26012;
               short var50 = -31737;
               JsonElement var34 = var3.get("content");
               if (var34 != null) {
                  var26 = var34.getAsString();
                  if (var26 != null) {
                     break label132;
                  }
               }
            }

            var26 = "";
         }

         String var15 = var26;
         int var36 = var15.length();
         if (var4) {
            var36 = var36 > 0 ? 1 : 0;
         }

         if (var36 != 0) {
            llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var7,
               var15,
               0L,
               false,
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               4,
               null
            );
            CopyOnWriteArrayList var17 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
            synchronized (var17) {
               boolean var12 = false;
               boolean var37 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.isEmpty();
               if (var4) {
                  var37 = !var37;
               }

               if (var37) {
                   var13 = (llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)CollectionsKt.last(
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
                  );
                  if (var4 && Intrinsics.areEqual(var13.a(), var7) && var4 && Intrinsics.areEqual(var13.b(), var15)) {
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.set(
                        lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size() - 1, var16
                     );
                  }
               }

               Unit var18 = Unit.INSTANCE;
            }
         }
      } else {
         short var45 = 25977;
         short var51 = -26792;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "§cFailed to send message: " + var2
         );
      }
   }

   private final void c(boolean var1, String var2, JsonObject var3) { String var13 = null; // PX-FIX hoist
        
      boolean var4 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      if (var1) {
         boolean var5;
         String var21;
         label168: {
            short var10001 = 26107;
            short var10002 = -15857;
            JsonElement var10000 = var3.get("autoJoined");
            var5 = var10000 != null ? var10000.getAsBoolean() : false;
            if (!var4) {
               var10001 = 26046;
               var10002 = -27023;
               JsonElement var18 = var3.get("username");
               if (var18 != null) {
                  JsonElement var8 = var18;
                  boolean var10 = false;
                  boolean var19 = var8.isJsonNull();
                  if (!var4) {
                     var19 = !var19;
                  }

                  JsonElement var20 = var19 ? var8 : null;
                  if ((var19 ? var8 : null) != null) {
                     var21 = var20.getAsString();
                     break label168;
                  }
               }
            }

            var21 = null;
         }

         label158: {
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var21;
            if (!var4) {
               short var41 = 26035;
               short var53 = 7946;
               JsonElement var22 = var3.get("roleColor");
               if (var22 != null) {
                  JsonElement var9 = var22;
                  boolean var11 = false;
                  boolean var23 = var9.isJsonNull();
                  if (!var4) {
                     var23 = !var23;
                  }

                  JsonElement var24 = var23 ? var9 : null;
                  if ((var23 ? var9 : null) != null) {
                     var21 = var24.getAsString();
                     break label158;
                  }
               }
            }

            var21 = null;
         }

         String var6;
         label148: {
            var6 = var21;
            if (!var4) {
               short var42 = 25972;
               short var54 = -2265;
               JsonElement var26 = var3.get("prefix");
               if (var26 != null) {
                  JsonElement var15 = var26;
                  boolean var12 = false;
                  boolean var27 = var15.isJsonNull();
                  if (!var4) {
                     var27 = !var27;
                  }

                  JsonElement var28 = var27 ? var15 : null;
                  if ((var27 ? var15 : null) != null) {
                     var21 = var28.getAsString();
                     break label148;
                  }
               }
            }

            var21 = null;
         }

         String var7 = var21;
         var21 = var6;
         if (!var4) {
            if (var6 != null) {
               int var31 = var6.length();
               if (!var4) {
                  var31 = var31 == 0 ? 1 : 0;
               }

               label133: {
                  if (var31 == 0) {
                     short var43 = 25999;
                     short var55 = 3951;
                     if (!Intrinsics.areEqual(var6, "null")) {
                        var21 = var6;
                        break label133;
                     }
                  }

                  var21 = null;
               }

               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var21;
            }

            var21 = var7;
         }

         if (!var4) {
            if (var21 != null) {
               int var33 = var7.length();
               if (!var4) {
                  var33 = var33 == 0 ? 1 : 0;
               }

               label121: {
                  if (var33 == 0) {
                     short var44 = 25999;
                     short var56 = 3951;
                     if (!Intrinsics.areEqual(var7, "null")) {
                        var21 = var7;
                        break label121;
                     }
                  }

                  var21 = null;
               }

               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var21;
            }

            var21 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         String var45 = var21;
         if (!var4) {
            if (var21 == null) {
               short var35 = 25953;
               short var46 = -6620;
               var21 = "Unknown";
            }

            var45 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

          var13 = a(var21, var45, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         var21 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         var45 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (!var4) {
            if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
               short var37 = 25953;
               short var48 = -6620;
               var21 = "Unknown";
            }

            var45 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         }

         MutableComponent var14 = b(var21, var45, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         if (!var4) {
            if (var5) {
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
               short var38 = 26070;
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = false;
               short var49 = -7185;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(
                  "§aNickname set! Connected to IRC as ", var14
               );
               short var57 = 25986;
               short var10003 = -21909;
               this.e("Nickname set! Successfully joined IRC as " + var13);
               MutableComponent var16 = this.e();
               this.a((kotlin.jvm.functions.Function0)(llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII::c));
               llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var17 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                  true, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, null, 4, null
               );
               this.a(var17);
               if (!var4) {
                  return;
               }
            }

            short var39 = 25968;
            short var50 = -32567;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("§aNickname set to ", var14);
            short var58 = 26029;
            short var60 = 17680;
            this.e("Nickname successfully set to " + var13);
         }

         if (!var4) {
            return;
         }
      }

      short var51 = 26068;
      short var59 = 12412;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         "§cFailed to change nickname: " + var2
      );
   }

   private final void d(boolean var1, String var2, JsonObject var3) { JsonElement var13 = null; // PX-FIX hoist
        
      String var43 = null; // PX-FIX
      String var40 = null; // PX-FIX
      Object var37 = null; // PX-FIX
      Object var33 = null; // PX-FIX
      Object var23 = null; // PX-FIX
      boolean var4 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      int var10000 =(( var1) ? 1 : 0);
      if (!var4) {
         if (!var1) {
            return;
         }

         var10000 = 1;
      }

      label217: {
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = (var10000 != 0);
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var3;
         if (!var4) {
            short var10001 = 26046;
            short var10002 = -27023;
            JsonElement var22 = var3.get("username");
            if (var22 != null) {
               var23 = var22.getAsString();
               break label217;
            }
         }

         var23 = null;
      }

      String var5;
      label211: {
         var5 =((String)( var23));
         if (!var4) {
            short var52 = 25964;
            short var64 = 24446;
            JsonElement var24 = var3.get("isOptedIn");
            if (var24 != null) {
               var10000 = ((var24.getAsBoolean()) ? 1 : 0);
               break label211;
            }
         }

         var10000 = (int)((0 != 0) ? 1 : 0);
      }

      boolean var6;
      label205: {
         var6 =( var10000 != 0);
         if (!var4) {
            short var53 = 26073;
            short var65 = -28840;
            JsonElement var26 = var3.get("banned");
            if (var26 != null) {
               var26.getAsBoolean();
               break label205;
            }
         }

         var10000 = (int)((0 != 0) ? 1 : 0);
      }

      label199: {
         if (!var4) {
            short var54 = 26071;
            short var66 = 6054;
            JsonElement var28 = var3.get("autoOptedIn");
            if (var28 != null) {
               var10000 = ((var28.getAsBoolean()) ? 1 : 0);
               break label199;
            }
         }

         var10000 = (int)((0 != 0) ? 1 : 0);
      }

      boolean var8;
      label193: {
         var8 =( var10000 != 0);
         if (!var4) {
            short var55 = 26035;
            short var67 = 7946;
            JsonElement var30 = var3.get("roleColor");
            if (var30 != null) {
               JsonElement var12 = var30;
               boolean var14 = false;
               var10000 = ((var12.isJsonNull()) ? 1 : 0);
               if (!var4) {
                  var10000 = (((var10000 == 0) ? 1 : 0));
               }

               JsonElement var32 =( (var10000 != 0) ? var12 : null);
               if ((((var10000 != 0) ? var12 : null)) != null) {
                  var33 = var32.getAsString();
                  break label193;
               }
            }
         }

         var33 = null;
      }

      String var9;
      label183: {
         var9 =((String)( var33));
         if (!var4) {
            short var56 = 25972;
            short var68 = -2265;
            JsonElement var34 = var3.get("prefix");
            if (var34 != null) {
                var13 = var34;
               boolean var15 = false;
               var10000 = ((var13.isJsonNull()) ? 1 : 0);
               if (!var4) {
                  var10000 = (((var10000 == 0) ? 1 : 0));
               }

               JsonElement var36 =( (var10000 != 0) ? var13 : null);
               if ((((var10000 != 0) ? var13 : null)) != null) {
                  var37 = var36.getAsString();
                  break label183;
               }
            }
         }

         var37 = null;
      }

      String var10;
      label173: {
         label228: {
            var10 =((String)( var37));
            CharSequence var11 = var9;
            CharSequence var38 = var11;
            if (!var4) {
               if (var11 == null) {
                  break label228;
               }

               var38 = var11;
            }

            var10000 = var38.length();
            if (var4) {
               break label173;
            }

            if (var10000 != 0) {
               var10000 = 0;
               break label173;
            }
         }

         var10000 = 1;
      }

      label162: {
         if (var10000 == 0) {
            short var57 = 25999;
            short var69 = 3951;
            if (!Intrinsics.areEqual(var9, "null")) {
               var40 = var9;
               break label162;
            }
         }

         var40 = null;
      }

      CharSequence var16;
      label157: {
         label229: {
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var40;
            var16 = var10;
            CharSequence var41 = var16;
            if (!var4) {
               if (var16 == null) {
                  break label229;
               }

               var41 = var16;
            }

            var10000 = var41.length();
            if (var4) {
               break label157;
            }

            if (var10000 != 0) {
               var10000 = 0;
               break label157;
            }
         }

         var10000 = 1;
      }

      label146: {
         if (var10000 == 0) {
            short var58 = 25999;
            short var70 = 3951;
            if (!Intrinsics.areEqual(var10, "null")) {
               var43 = var10;
               break label146;
            }
         }

         var43 = null;
      }

      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var43;
      if (!var4) {
         label138:
         if (var8) {
            short var44 =((short)(( IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) ? 1 : 0));
            if (!var4) {
               if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                  break label138;
               }

               var44 = 1;
            }

            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (var44 != 0);
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
            String var45 = var5;
            String var59 = var5;
            if (!var4) {
               if (var5 == null) {
                  var44 = 25953;
                  short var60 = -6620;
                  var45 = "Unknown";
               }

               var59 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }

            String var17 = a(var45, var59, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
            String var47 = var5;
            var59 = var5;
            if (!var4) {
               if (var5 == null) {
                  var44 = 25953;
                  short var62 = -6620;
                  var47 = "Unknown";
               }

               var59 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }

            MutableComponent var19 = b(var47, var59, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
            var44 = 25980;
            short var63 = 19442;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(
               "§aAuto-connected to IRC as ", var19
            );
            short var71 = 26024;
            short var10003 = -21988;
            this.e("Connected to IRC as " + var17);
            MutableComponent var20 = this.e();
            this.a((kotlin.jvm.functions.Function0)(llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII::d));
            llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var21 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               true, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, null, 4, null
            );
            this.a(var21);
            if (!var4) {
               return;
            }
         }

         var16 = var5;
      }

      label126: {
         label231: {
            CharSequence var50 = var16;
            if (!var4) {
               if (var16 == null) {
                  break label231;
               }

               var50 = var16;
            }

            var10000 = var50.length();
            if (var4) {
               break label126;
            }

            if (var10000 != 0) {
               var10000 = 0;
               break label126;
            }
         }

         var10000 = 1;
      }

      if (var10000 == 0 && !var6) {
         MutableComponent var18 = this.c(var5);
         this.a((kotlin.jvm.functions.Function1)null);
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1) {
      short var10000 = ((short)((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0));
      Intrinsics.checkNotNullParameter(var1, "e");
      boolean var2 = (var10000 != 0);
      var10000 =((short)(( llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) ? 1 : 0));
      if (var2) {
         if (!llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
            var10000 = 26103;
            short var10001 = -7686;
            System.out.println("[IRC] onJoinServer fired but no init data yet");
            return;
         }

         var10000 =((short)(( IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) ? 1 : 0));
      }

      if (var2) {
         if ((var10000 != 0)) {
            return;
         }

         var10000 = (short)((1 != 0) ? 1 : 0);
      }

      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII =( var10000 != 0);
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(2000L, 2000L, llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII::o);
   }

   private final void a(boolean var1, boolean var2, String var3) {
      this.a((kotlin.jvm.functions.Function1)null);
   }

   @JvmStatic
   @NotNull
   public static final String a(@NotNull String var0, @Nullable String var1, @Nullable String var2) { short var13 = (short)0; // PX-FIX hoist
        
      boolean var3;
      String var4;
      int var11;
      label37: {
         label40: {
            boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
            short var10002 = 26046;
            short var10003 = -27023;
            Intrinsics.checkNotNullParameter(var0, "username");
            var4 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var1);
            var3 = var10000;
            CharSequence var5 = var2;
            CharSequence var10 = var5;
            if (!var3) {
               if (var5 == null) {
                  break label40;
               }

               var10 = var5;
            }

            var11 = var10.length();
            if (var3) {
               break label37;
            }

            if (var11 != 0) {
               var11 = 0;
               break label37;
            }
         }

         var11 = 1;
      }

      if (var11 == 0) {
         short var10001 = 25999;
         short var17 = 3951;
         if (var3) {
            return var2 + "null";
         }

         if (!Intrinsics.areEqual(var2, "null")) {
             var13 = 26111;
            var10001 = -21698;
            short var18 = 25982;
            short var10004 = 4635;
            return "§l" + var4 + var2 + " §r" + var4 + var0;
         }
      }

      return var4 + var0;
   }

   @JvmStatic
   @NotNull
   public static final MutableComponent b(@NotNull String var0, @Nullable String var1, @Nullable String var2) { short var13 = (short)0; // PX-FIX hoist
        
      Object var12 = null; // PX-FIX
      boolean var3;
      String var4;
      int var11;
      label37: {
         label40: {
            boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
            short var10002 = 26046;
            short var10003 = -27023;
            Intrinsics.checkNotNullParameter(var0, "username");
            var3 = var10000;
            var4 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.d(var1);
            CharSequence var5 = var2;
            CharSequence var10 = var5;
            if (var3) {
               if (var5 == null) {
                  break label40;
               }

               var10 = var5;
            }

            var11 = var10.length();
            if (!var3) {
               break label37;
            }

            if (var11 != 0) {
               var11 = 0;
               break label37;
            }
         }

         var11 = 1;
      }

      String var15;
      label25: {
         if (var11 == 0) {
            var12 = var2;
            short var10001 = 25999;
            short var17 = 3951;
            var15 = "null";
            if (!var3) {
               break label25;
            }

            if (!Intrinsics.areEqual(var2, "null")) {
                var13 = 25971;
               short var16 = -20925;
               MutableComponent var8 = Component.literal("§l" + var4 + var2 + " ").append(Component.literal(var4 + var0));
               Intrinsics.checkNotNull(var8);
               return var8;
            }
         }

         var12 = var4;
         var15 = var0;
      }

      MutableComponent var9 = Component.literal(var12 + var15);
      Intrinsics.checkNotNull(var9);
      return var9;
   }

   private final String d(String var1) {
      boolean var2;
      int var11;
      label54: {
         label57: {
            var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
            CharSequence var3 = var1;
            CharSequence var10000 = var3;
            if (var2) {
               if (var3 == null) {
                  break label57;
               }

               var10000 = var3;
            }

            var11 = var10000.length();
            if (!var2) {
               break label54;
            }

            if (var11 != 0) {
               var11 = 0;
               break label54;
            }
         }

         var11 = 1;
      }

      label34:
      if (var11 == 0) {
         String var20;
         label59: {
            short var10001 = 25999;
            short var10002 = 3951;
            boolean var12 = Intrinsics.areEqual(var1, "null");
            if (var2) {
               if (var12) {
                  break label34;
               }

               var13 = ((me.octo.client.PXDyn)(Object)(Object)(var1));
               var20 = "#";
               if (!var2) {
                  break label59;
               }

               var12 = StringsKt.startsWith(var1, "#", false);
            }

            if (!var12) {
               return var1;
            }

            String var14 = var1.substring(1);
            var10002 = 26020;
            short var10003 = 28978;
            Intrinsics.checkNotNullExpressionValue(var14, "substring(...)");
            var13 = ((me.octo.client.PXDyn)(Object)(Object)(var14.toLowerCase(Locale.ROOT)));
            var20 = ((String)(Object)(var13));
         }

         short var26 = 26108;
         short var28 = -9658;
         Intrinsics.checkNotNullExpressionValue(var20, "toLowerCase(...)");
         String var10 = ((String)(Object)(var13));
         if (var2) {
            String var15;
            if (var10.length() == 6) {
               char var16 = var10.charAt(0);
               char var21 = var10.charAt(1);
               char var27 = var10.charAt(2);
               char var29 = var10.charAt(3);
               char var10004 = var10.charAt(4);
               char var4 = var10.charAt(5);
               char var5 = var10004;
               char var6 = var29;
               char var7 = var27;
               char var8 = var21;
               char var9 = var16;
               short var17 = 26023;
               short var22 = 17330;
               var15 = "§x§" + var9 + "§" + var8 + "§" + var7 + "§" + var6 + "§" + var5 + "§" + var4;
            } else {
               short var18 = 25991;
               short var23 = 20136;
               var15 = "§f";
            }

            return var15;
         }

         return var10;
      }

      short var19 = 26072;
      short var24 = 11220;
      return "§f";
   }

   private final void c(JsonObject var1) {
      String var4;
      label15: {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
         if (var2) {
            short var10001 = 25967;
            short var10002 = 25454;
            JsonElement var10000 = var1.get("message");
            if (var10000 != null) {
               var4 = var10000.getAsString();
               if (var4 != null) {
                  break label15;
               }
            }
         }

         var4 = "";
      }

      String var3 = var4;
      this.e(var3);
   }

   private final void d(JsonObject var1) {
      String var4;
      label15: {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         if (!var2) {
            short var10001 = 25985;
            short var10002 = -25266;
            JsonElement var10000 = var1.get("nickname");
            if (var10000 != null) {
               var4 = var10000.getAsString();
               if (var4 != null) {
                  break label15;
               }
            }
         }

         short var5 = 25953;
         short var6 = -6620;
         var4 = "Unknown";
      }

      String var3 = var4;
      short var7 = 26001;
      short var10003 = -26444;
      this.e(var3 + " joined the chat");
   }

   private final void e(JsonObject var1) {
      String var4;
      label15: {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         if (!var2) {
            short var10001 = 26018;
            short var10002 = -22591;
            JsonElement var10000 = var1.get("nickname");
            if (var10000 != null) {
               var4 = var10000.getAsString();
               if (var4 != null) {
                  break label15;
               }
            }
         }

         short var5 = 25953;
         short var6 = -6620;
         var4 = "Unknown";
      }

      String var3 = var4;
      short var7 = 26095;
      short var10003 = 2226;
      this.e(var3 + " left the chat");
   }

   private final void f(JsonObject var1) {
      llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         null,
         4,
         null
      );
      this.a(var2);
   }

   private final void a(
      llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.add(var1);
      boolean var2 = var10000;

      while (
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size()
            > IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
      ) {
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.remove(0);
         if (var2) {
            break;
         }
      }
   }

   private final void e(String var1) {
      short var10002 = 26066;
      short var10003 = 19902;
      llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2 = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         "System", var1, 0L, true, null, null, 52, null
      );
      this.a(var2);
   }

   private final void b(
      llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
   ) {
      boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      Iterable var3 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      boolean var2 = var10000;
      boolean var4 = false;

      for (Object var6 : var3) {
         Function1 var7 = (Function1)var6;
         boolean var8 = false;

         label21: {
            try {
               var7.invoke(var1);
            } catch (Exception var10) {
               String var11 = var10.getMessage();
               short var10001 = 26005;
               short var10002 = -22105;
               System.out.println("Error in message handler: " + var11);
               break label21;
            }

            if (!var2) {
               break;
            }
         }

         if (!var2) {
            break;
         }
      }
   }

   private final void a(
      llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      Iterable var3 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      boolean var4 = false;
      boolean var2 = var10000;

      for (Object var6 : var3) {
         Function1 var7 = (Function1)var6;
         boolean var8 = false;

         label21: {
            try {
               var7.invoke(var1);
            } catch (Exception var10) {
               String var11 = var10.getMessage();
               short var10001 = 26015;
               short var10002 = 18092;
               System.out.println("Error in status handler: " + var11);
               break label21;
            }

            if (var2) {
               break;
            }
         }

         if (var2) {
            break;
         }
      }
   }

   @JvmStatic
   public static final boolean f() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @JvmStatic
   @Nullable
   public static final String g() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @JvmStatic
   @NotNull
   public static final List<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> h() {
      return CollectionsKt.toList(lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
   }

   @JvmStatic
   @NotNull
   public static final List<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> a(
      int var0
   ) {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      Object var10000 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      if (var1) {
         if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size() <= var0) {
            return CollectionsKt.toList(lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
         }

         var10000 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.subList(
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size() - var0,
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.size()
         );
      }

      Object var2 = var10000;
      Intrinsics.checkNotNull(var2);
      return (List<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>)var2;
   }

   // PX-FIX PhaseA TOP3g2: Kotlin static default-args bridge (a$default renamed to a by the
   // obfuscator). Mask bit 0 selects the default 50 for var0, then delegates to a(int).
   public static List<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> a(
      int var0, int var1, Object var2
   ) {
      if ((var1 & 1) != 0) {
         var0 = 50;
      }

      return a(var0);
   }

   @JvmStatic
   @Nullable
   public static final String i() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @JvmStatic
   @Nullable
   public static final String j() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @JvmStatic
   public static final boolean k() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @JvmStatic
   @Nullable
   public static final JsonObject l() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @JvmStatic
   public static final void a(
      @NotNull Function1<? super llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, Unit> var0
   ) {
      short var10001 = 26100;
      short var10002 = 16095;
      Intrinsics.checkNotNullParameter(var0, "handler");
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.add((Function1<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, Unit>)var0);
   }

   @JvmStatic
   public static final void b(
      @NotNull Function1<? super llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, Unit> var0
   ) {
      short var10001 = 26100;
      short var10002 = 16095;
      Intrinsics.checkNotNullParameter(var0, "handler");
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.remove(var0);
   }

   @JvmStatic
   public static final void c(
      @NotNull Function1<? super llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, Unit> var0
   ) {
      short var10001 = 26100;
      short var10002 = 16095;
      Intrinsics.checkNotNullParameter(var0, "handler");
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.add((Function1<llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, Unit>)var0);
   }

   @JvmStatic
   public static final void d(
      @NotNull Function1<? super llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll, Unit> var0
   ) {
      short var10001 = 26074;
      short var10002 = -15147;
      Intrinsics.checkNotNullParameter(var0, "handler");
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.remove(var0);
   }

   @JvmStatic
   public static final void m() {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = false;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = null;
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = null;
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.clear();
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.clear();
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
   }

   @JvmStatic
   public static final void n() {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.clear();
   }

   private static final void b(Function0 var0) {
      var0.invoke();
   }

   private static final boolean a(long var0, Long var2) {
      boolean var3 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      Intrinsics.checkNotNull(var2);
      long var4;
      int var10000 = (var4 = var0 - var2 - llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI) == 0L
         ? 0
         : (var4 < 0L ? -1 : 1);
      if (var3) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit g(JsonObject var0) { short var13 = (short)0; // PX-FIX hoist
        
      boolean var1;
      String var5;
      label58: {
         boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         short var10002 = 26033;
         short var10003 = 24166;
         Intrinsics.checkNotNullParameter(var0, "json");
         var1 = var10000;
         if (!var1) {
            short var10001 = 25981;
            var10002 = 11531;
            JsonElement var4 = var0.get("type");
            if (var4 != null) {
               var5 = var4.getAsString();
               break label58;
            }
         }

         var5 = null;
      }

      String var2 = var5;
      var5 = var2;
      if (!var1) {
         if (var2 == null) {
            return Unit.INSTANCE;
         }

         var5 = var2;
      }

      label46: {
         label45: {
            int var7 = var5.hashCode();
            if (!var1) {
               switch (var7) {
                  case -1297866682:
                      var13 = 26041;
                     short var20 = -931;
                     var7 = ((var2.equals("event_response")) ? 1 : 0);
                     break;
                  case 96784904:
                     short var12 = 26061;
                     short var19 = 2260;
                     if (!var2.equals("error")) {
                        return Unit.INSTANCE;
                     }
                     break label46;
                  case 96891546:
                     short var11 = 26099;
                     short var18 = -27250;
                     if (var2.equals("event")) {
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var0);
                        if (!var1) {
                           return Unit.INSTANCE;
                        }
                        break label45;
                     }

                     return Unit.INSTANCE;
                  default:
                     return Unit.INSTANCE;
               }
            }

            if (var7 == 0) {
               return Unit.INSTANCE;
            }
         }

         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
         if (!var1) {
            return Unit.INSTANCE;
         }
      }

      label31: {
         short var14 = 25967;
         short var21 = 25454;
         JsonElement var8 = var0.get("message");
         if (var8 != null) {
            var5 = var8.getAsString();
            if (var5 != null) {
               break label31;
            }
         }

         short var10 = 26057;
         var14 = 5289;
         var5 = "Unknown error";
      }

      String var3 = var5;
      short var16 = 26028;
      short var22 = -7464;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§c" + var3);
      return Unit.INSTANCE;
   }

   private static final boolean a(long var0, Entry var2) {
      int var10000 = ((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h()) ? 1 : 0);
      short var10002 = 26085;
      short var10003 = 31329;
      Intrinsics.checkNotNullParameter(var2, "it");
      boolean var3 = (var10000 != 0);
      Object var10001 = var2.getValue();
      var10003 = 26055;
      short var10004 = 26000;
      Intrinsics.checkNotNullExpressionValue(var10001, "<get-value>(...)");
      long var6;
      var10000 = (var6 = var0 - ((Number)var10001).longValue() - IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) == 0L
         ? 0
         : (var6 < 0L ? -1 : 1);
      if (!var3) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      return (var10000 != 0);
   }

   private static final boolean b(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit a(MutableComponent var0) {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      if (!var1) {
         LocalPlayer var10000 = Minecraft.getInstance().player;
         if (var10000 != null) {
            var10000.sendSystemMessage(var0);
         }
      }

      return Unit.INSTANCE;
   }

   private static final Style a(String var0, Style var1) {
      short var10001 = 26075;
      short var10002 = -31514;
      Intrinsics.checkNotNullParameter(var1, "style");
      short var10005 = 25995;
      short var10006 = 32538;
      return var1.withClickEvent(new RunCommand("/" + var0 + " join"));
   }

   private static final Style b(String var0, Style var1) {
      short var10001 = 25958;
      short var10002 = -22418;
      Intrinsics.checkNotNullParameter(var1, "style");
      short var10005 = 26084;
      short var10006 = 20441;
      return var1.withClickEvent(new RunCommand("/" + var0 + " leave"));
   }

   // PX-FIX $default 形态补全（jar: a:(String,String,int,Object)Z → a(String,String)）
   public static boolean a(@Nullable String var0, @Nullable String var1, int var2, Object var3) {
      boolean var4 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      if ((var2 & 1) != 0) {
         if (var4) {
            var0 = null;
         }
      }

      if ((var2 & 2) != 0) {
         if (var4) {
            var1 = null;
         }
      }

      return a(var0, var1);
   }

   // PX-FIX PhaseA TOP3g2: Kotlin static default-args bridge (b$default renamed to b by the
   // obfuscator). Mask bit 2 selects the default null for var1, then delegates to b(String,String).
   public static boolean b(@Nullable String var0, @Nullable String var1, int var2, Object var3) {
      if ((var2 & 2) != 0) {
         var1 = null;
      }

      return b(var0, var1);
   }

   private static final Style a(boolean var0, String var1, String var2, Style var3) {
      boolean var4 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      Style var10000 = var3;
      if (!var4) {
         short var10001 = 25958;
         short var10002 = -22418;
         Intrinsics.checkNotNullParameter(var3, "style");
         if (var0) {
            short var10005 = 25976;
            short var6 = 14374;
            return var3.withClickEvent(new SuggestCommand("." + var1 + " nickname custom "));
         }

         var10000 = var3;
      }

      short var10006 = 26042;
      short var10007 = 23245;
      return var10000.withClickEvent(new RunCommand("." + var1 + " nickname " + var2));
   }

   private static final Unit b(MutableComponent var0) {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      if (!var1) {
         LocalPlayer var10000 = Minecraft.getInstance().player;
         if (var10000 != null) {
            var10000.sendSystemMessage(var0);
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit c(MutableComponent var0) {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      if (!var1) {
         LocalPlayer var10000 = Minecraft.getInstance().player;
         if (var10000 != null) {
            var10000.sendSystemMessage(var0);
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit d(MutableComponent var0) {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      if (!var1) {
         LocalPlayer var10000 = Minecraft.getInstance().player;
         if (var10000 != null) {
            var10000.sendSystemMessage(var0);
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit e(MutableComponent var0) {
      boolean var1 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
      if (var1) {
         LocalPlayer var10000 = Minecraft.getInstance().player;
         if (var10000 != null) {
            var10000.sendSystemMessage(var0);
         }
      }

      return Unit.INSTANCE;
   }

   private static final Unit o() {
      Object var11 = null; // PX-FIX
      boolean var0;
      boolean var9;
      var9 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
      boolean var1 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .h();
      var0 = var9;
      var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      label74:
      if (!var0) {
         if (!lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
            var9 = var1;
            if (var0) {
               break label74;
            }

            if (var1) {
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
            }
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
         var9 = var1;
      }

      if (!var0) {
         if (!var9) {
            return Unit.INSTANCE;
         }

         var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      if (!var9) {
         if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl != null) {
            JsonObject var2;
            label58: {
               label78: {
                  var2 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  boolean var3 = false;
                  short var10001 = 26050;
                  short var10002 = -23941;
                  JsonElement var4 = var2.get("username");
                  JsonElement var10 = var4;
                  if (!var0) {
                     if (var4 == null) {
                        break label78;
                     }

                     var10 = var4;
                  }

                  if (!var0) {
                     if (var10.isJsonNull()) {
                        break label78;
                     }

                     var10 = var4;
                  }

                  var11 = var10.getAsString();
                  break label58;
               }

               var11 = null;
            }

            String var5;
            label46: {
               label79: {
                  var5 =((String)( var11));
                  short var14 = 26037;
                  short var15 = -28839;
                  JsonElement var6 = var2.get("banned");
                  JsonElement var12 = var6;
                  if (!var0) {
                     if (var6 == null) {
                        break label79;
                     }

                     var12 = var6;
                  }

                  if (!var0) {
                     if (var12.isJsonNull()) {
                        break label79;
                     }

                     var12 = var6;
                  }

                  var9 = var12.getAsBoolean();
                  break label46;
               }

               var9 = false;
            }

            boolean var7 = var9;
            boolean var8 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var7, var8, var5);
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
         }

         return Unit.INSTANCE;
      } else {
         return Unit.INSTANCE;
      }
   }

   private static final Style c(String var0, Style var1) {
      short var10001 = 25958;
      short var10002 = -22418;
      Intrinsics.checkNotNullParameter(var1, "style");
      short var10005 = 26065;
      short var10006 = -26428;
      return var1.withClickEvent(new RunCommand("/" + var0 + " leave"));
   }

   private static final Style d(String var0, Style var1) {
      short var10001 = 25958;
      short var10002 = -22418;
      Intrinsics.checkNotNullParameter(var1, "style");
      short var10005 = 26032;
      short var10006 = 27670;
      return var1.withClickEvent(new RunCommand("/" + var0 + " join"));
   }

   private static final Unit b(boolean var0, boolean var1, String var2) { Object var13 = null; // PX-FIX hoist
        
       var13 = null; // PX-FIX
      short var10000 = ((short)((IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i()) ? 1 : 0));
      String var4 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .p();
      boolean var3 = (var10000 != 0);
      if (var3) {
         LocalPlayer var10 = Minecraft.getInstance().player;
         if (var10 != null) {
            LocalPlayer var5 = var10;
            var10000 =((short)(( var0) ? 1 : 0));
            if (var3) {
               if (var0) {
                  var10000 = 26064;
                  short var10001 = -26633;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                     "§cYou are banned from IRC. Contact support if you believe this is an error."
                  );
                  if (var3) {
                     return Unit.INSTANCE;
                  }
               }

               var10000 =((short)(( var1) ? 1 : 0));
            }

            label38: {
               if ((var10000 != 0)) {
                  var13 = var2;
                  if (!var3) {
                     break label38;
                  }

                  if (var2 != null) {
                     MutableComponent var6 = b(
                        var2,
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                     );
                     var10000 = 26083;
                     short var24 = -22928;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(
                        "§aConnected to IRC as ", var6
                     );
                     var10000 = 26044;
                     var24 = 29523;
                     MutableComponent var16 = Component.literal("§7Disconnect: ");
                     var24 = 25990;
                     short var10002 = -2169;
                     MutableComponent var17 = var16.append(
                        Component.literal("§c[Click]").withStyle((java.util.function.UnaryOperator<net.minecraft.network.chat.Style>)null)
                     );
                     var10002 = 26026;
                     short var10003 = 1728;
                     var10003 = 26084;
                     short var10004 = 20441;
                     MutableComponent var18 = var17.append(Component.literal(" §7or type §f/" + var4 + " leave"));
                     var10002 = 25984;
                     var10003 = -17711;
                     Intrinsics.checkNotNullExpressionValue(var18, "append(...)");
                     MutableComponent var7 = var18;
                     var5.sendSystemMessage(var7);
                     var24 = 25993;
                     var10002 = 14246;
                     var10002 = 25978;
                     var10003 = 22248;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
                        "§7IRC help: §f/" + var4 + " help"
                     );
                     var5.playSound(SoundEvents.NOTE_BLOCK_PLING.value(), 1.0F, 1.0F);
                     if (var3) {
                        return Unit.INSTANCE;
                     }
                  }
               }

               var13 = var2;
            }

            label29: {
               if (var3) {
                  if (var13 != null) {
                     MutableComponent var8 = b(
                        var2,
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                     );
                     var10000 = 25960;
                     short var28 = 21964;
                     me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a("§7Join IRC as ", var8);
                     var10000 = 26069;
                     var28 = -6243;
                     MutableComponent var21 = Component.literal("§7Connect: ");
                     var28 = 26036;
                     short var37 = -8829;
                     MutableComponent var22 = var21.append(
                        Component.literal("§a[Click]").withStyle((java.util.function.UnaryOperator<net.minecraft.network.chat.Style>)null)
                     );
                     var37 = 26026;
                     short var47 = 1728;
                     var47 = 26032;
                     short var52 = 27670;
                     MutableComponent var23 = var22.append(Component.literal(" §7or type §f/" + var4 + " join"));
                     var37 = 25984;
                     var47 = -17711;
                     Intrinsics.checkNotNullExpressionValue(var23, "append(...)");
                     MutableComponent var9 = var23;
                     var5.sendSystemMessage(var9);
                     if (var3) {
                        break label29;
                     }
                  }

                  short var31 = 25987;
                  short var40 = 13421;
                  var40 = 26032;
                  short var50 = 27670;
                  var13 = "§7Join IRC: §f/" + var4 + " join";
               }

               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(String.valueOf(var13));
            }

            short var32 = 26052;
            short var42 = -17626;
            var42 = 25994;
            short var51 = 13791;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "§7IRC help: §f/" + var4 + " help"
            );
            return Unit.INSTANCE;
         }
      }

      return Unit.INSTANCE;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[162];
      int var3 = 0;
      String var2 = "ôh\u008d÷±\u0003×\n÷JÁù\u0097\u008bv¢6\u0096\u000béè¾dw\u009aÐ\u0091f¿5-ªë/\u008doÊ\u0006ácèÕ>Ýs\u0002º\u0001N\u0006ãÿVµ\u008a\u008c\u0014°ª\u001fª°\u00052\u009a\u0019v,H\u0013Z>ã\u0001V\u001a\u001f\tíaÁ\u0091ßâ§z,³+aÙö°l\u0080#CÚM\u0092)ÀäÄ§Ó+e\u0015O\u0099\u0082MYCÔÏNÆhj\u009bV\u001a;4\u0013\u0014ÜØ\u0006ËM\u0012×K\u0010\u0005^b\u007fI\u009d\u0010ù:\u0091yO¸po8\u00adüO\b\u00986º\u000bòÈa©\u0081\u0094ñÚ)9Þ\u0004+j²)\u0002Î¬\u0004\u001f¬qu\u0010Ñl\u0005=\u0013\u0006y¤ÐQ\tÊ0L:Ê\u0003w\u0081´\n\u009a\rrÆ1E>¶\u008d\t\u0006ñ?g´\u009cÎ\u0002b\"\u0007ß\u0091xÆ²ÕÂ\u00108T\u0084~-Â1»Ë\u008ej1\\3·%\u0014É\u009eÒ¢\fo\u0092óÿ¦\u0091qÜµõ\u0096|Ê6\n\n´ã©Ì\u009a-×v\u0002\f\u000e\u0014gæ\u0090aõ\u0092åÝ\u008b\tÙ\u009fa\u0016\u000eªÉ¤³\bÂ3\u008e\u0014\u009c¤\u007f\u00adÇ\u0015\u0096R%p\u0081\u0091\u0011@\u00917\u0082Uà¤`Ç\u009d¯\u0014AOÅ\u001e\u0088\"F6Úu\u0093{©;B×Ó\n\u008en\u008e\u0092\u0001´¤\u0087\nÄê=äö\u00050\u0019·ðSò##\u0019Ó³\u007f\u0004\u001c|,n®@º/Ad\u0012[&j0\u0098MÌ¶\u009co8Þ½\f'ç~A\u009e\u000e6\u0014\u009fÖ\u0081 Ìºm\nÔÂ\u0084;\u0017á¬1(\u000eT\u0092ýÐ;\u0082rÎ}«{E$ç\u0082\u00ad\u0080Õ\u000f\u0096Yí\u009b\bÄÍ\u0005Dî\u0080\\\u008cØ¤\u0003S*X\tz&»Þi\u0094\u0005À\u0019\u001dS\u001fg^Ä\u009aË$û\u0000ç\u0015m\u009c1ó\u0014kæºãe8Õ³».ÿÞ\u000b\u0093}zÂÅÄ\fªWxã$å\u0003¹\u0097\u001c\u00ad\u0090 ·4Åó\u0089e+\u001d;;íû\tM÷Û³]\u009a\u0092{ò\u0001®×ïßb\u000b\u008890@|\u008a/¸\u0010\u008fWK,<\u00974:T\u008f.²Á.²õ\u0007\u008aL Ô\u008d/\u0092µ°Øæâ§\u0086MþGÎ¾\u0090\u008aikX\u0015ÕÞ>5?üP\u00831!vö\u0097O\u009d\u001dóý\u008d\u001a.\u001f£õò\u0082\"ÿÁâ\u008cøATµé\u00067\u0093¿!\u0087|\u0006²#\u0004\u00957U\u000fK\u0091V\u0082\u007fç#a\u0099b;ÍûêJ\f5Ê~¥a£\u0090®í}ÀS$\rí&=Eu\u008e\u0019±\u0012*\fºÐ&³ª\u0086¢øg\u00828\u0011\u001e\u0004ý³\u0002¤*W{\\:\u0090\u0006\u0087\u009c\u0094ï/\u001a\u001b-þ\"_Å9\u0084\u0094¶6?¡*2#\u000eÿÐFI\u0082\u0099q\u0006*qï\u0002tZ\u0006\rñùÎ6n\u0007\u000b%r^N6(\u0005ÙHGL\u0014\u000fã8~W#¢UçÈ]\u0011:\u0088w\u009f\tÄnÐùwéÛ\"\u0083\bÈP&ºmýò\u009a\u0010\u009e\n\u0015m\u0089Qª\f\u0006\u001dö\u008dyÀ\u0018±\b¿w®C¼y\u0003\r\u0018Ä\u001dt2I\u0094'\u0002\tsù×$v\u0082Ä\u0013éÈ¥©\u0082ç>\bWLL5á\u008b\u0080«\u0007\u008adU!z{.\u0017\u0087{\u007f\u0006\\ÊÑ\u0000û]ÍG\u0005MðZG\u0096\u008bëº;;\u0005²mõ-?\u0005\u0084v$Ëö\rH\"6ôs)¢¸©_7£+\u000e/¥\u0010Kd\b¾e\u008f}Åc\rÜ\rMÿ%á\u0002\u0098ÞXvE¦4ê\u0016òÒV«@é¼\u000fA\u0093eT@³ Öj*º\u007frp\u0003¦t☳\tGOø4\u008c´aK\u0015\u0006r3\u0016\u0096Ëe\ryæD¢\u0081¾Ïp-1\u0004\u0094\u0016\u001b·\u0090q\u0092¯\u0080È£\u0001Á9qtß¾æì7\u0014×C²\u007f4\u0014ø\u001b\u0005\r\u001dò>}\u0004ÔñÊ\u009e\u0014ßk¦RÝútÇ{\t ¥®\rQé\n¤Ù\u0089\t\u0082¼\u0018£n¢øKç\u000e¿{ø\u0004o×íi:óT\fÏ)\f\u0090\u0095æªßQnz\u0000\u0010>^\b×Î\\eã\u0081Àê\u0004ÓÎ*y$³hùd\u008c\u0086Ë\u0089¯b³!è\u001d`-\u0097Õt\u0086DO¡åT&¶Ø3\\!a\u0081Ôø}\u000eb¦øÑm¶WõÎ\u001fx<\u008e3\n¸]B¸¨\u0006\u0000üCg\u000b¼}¨\u001fºWÓ9\u0084þµ\u000eE6Ï½l¨lµÅ%Îhl½\b\u0087ÖÏjPçUÙ\u0006Ãá{µ\u0000\u0014\u0003\u007f\u0007\u0003\"\u0016ë¶\u0086Ã\u0005GÞ®wb¾`\u000fìà(cFõ\u007fH|YGd\"Ö\u008b\u000f,ÂsL\u0007ó\u0019ýÄ\u0001÷Ê\b\u0002/\u0098\u0019½4\u000b\\\u0007m\u008cËúÜSS\u0002õ\u000b\u001d¯i\tÑ\u008f-M\u007f\"MÆ\u0018\u0010\u001b\u008c²òíWz\u0000|NÖsü\u0090¦:\u001eO\u0018ûò·\u008c<&\u008d±³¸YÃ¸ÿÉìKÂ\u0095á\u0003ïÅ\u0011ð\u001a»E\u0018¯2ú±/aå¿;)tW\u0094\u0006\u0089%\u007f²q\u0084Õ\u0014ò¬\u0014ât\u0001±)\u0086êH¨øZ\u009báÊ¸\u00117»~j\u000evrÅ¡Ôæ sõE3\tT/\u000eT)\u0081Ê\\\u008b±Þ×ðw¿Üù\u0012ÛïDM;\u0014{R|ÅÊÚø\u009aWD\u0088s\f!ºü«1b\u009a\u0096¬zè³\u001a\u0089\u0088¶\u0091WàÍ¤¶BD4B\u0088ÀR«8ÿ|¤²rÝnh\u0015Ü\u0083\u0095Þâø`O1º»t*1\u0094ÎH|åÝÅ\u000b>×øJ²è\u0097UåÈG\u0007?\u001ck\u009dË\u0017ç\u0010L.ÚXxZºP ^XAÑ\u0016¦¸\u0006ÐÚq%'N\u0013¹ë°ý\u0097mÐ\u001eñdÉ\u0095jC}u\u0094_V\u0007fÛµ^¿/8\u0015\u0084³7\u0082[Aõ\u001c\u0015&\u001b\u0095úNûg6\u009d\u0080µA\u0003/\u009c☂\u0019Ä=\u001f'b6k~b\u0007ÏS\u0007 \u009b\u0094\u001e\u0004\u0007Ù]DSc¥IÅç°\u0096\u009d¨0\u0000P¨\u0092ùÒ¶ðð\u009dù\rPK\u0095:ïZ\u001aÛÐù4\u0090C¹r\bIBð\u0018\u0090}Á\u0016Ax\r\u0090;ÿ\u0082}\u0001+Qzâ¡Ym\u0080\u008bÐHËÀÓ\u0081Ñª>\u0084\u009d\u0099\u000bËD\\@TÕs\u008e\u0006\fÑ\u0003)\\⛂\u001cd<\u000b\u0007à2!õ&\u001b\u00848ÃöHÃ2\u0093ÌO+4oùðØ\u0094\u0080\u0006ÄÂü$\"c\t\u0013¹¢ÓÓC\u009b)9\t\u0080à\u0000\u0083\u0093B\u0082\u0095i\u0002\u0087Ô\u000b!/\u0001-ÿx\u0006;¨º\u0004\bw\u001b6\u009fhä±F)\u0018Êÿ¥Q£\u0096®Yw¹H¯¡Q\u000ehª¨YÝ¢¸\u008as\u0006ß\u008eBô¼l\u009f\u0014 \u0006Là\u0010\u0084\u001f\u000fp\u009f\u000f\u009eDO\u009eñÎ\u0005(d¯¼{\u000eG\u0094\u008cî,:;\u001cè´¯>K\u009d\u0013ØÁNW03UÛK\u000bâ\u0001^Åò}Vª\u000f\u000e&ìGzV  ôITíÐç\u0099\u0004\u0087\b'e\u00101È,!Åu\u0011¸Kô\u0004>WèÖ^\u000f\u0019\u0012!\u0012È\n(ògÿän6ýH\u0005ÚL\u0002S6\u0005IÒzÇl\u0006tr\u008dÇÞZ\u0010CÔ\u008fÉªZðÅá\u008e)9²Vac\u0010,¦+ê\u0018Ê\u009a!edWv}¿\u0098^K2\u0018T°BÄ\u0080<S\u0083\u0012úr\u000ezm¾ðN«ê%¿Ê\u0007 \u009bÎÊ÷·ï ´Ií\u0013È\u001aÇ?|\tw{Ys\u0010?R5\u00137\r\u0012á\u001cÏ&f\u0098ª\u0005Ó\u009c\u0006<E\u009a\u001c÷Sµ÷Õ\u0012\u0089²4¡\u00adk¦øq/\u001d\u0090\u0092\tIÄz\u0091\u0016\u0091`Þ[\u000e¨\u0090ß\u001c®´5\u0087³Ì5aï¢À\u009a`\u0003Â\u008c⚿\u0002\u009b\u0011\u001b\u008f\u0016û)\u00adá\u0010/\u008e\u009cî\u009am\u009c5fW\u0083nÚtßÆÛAã5\u0004«lçm\u0003=\u0081é\u001c\u0019\u0001/_ñ&ß¢³Ïg@¿BGiÒ2MÙ\u0086}\u009f\"\n'¼S\u0011|\u0014Ú\u0091»#bX\u000fó\u0098à\u001fÁcÄÖ\u001a\u001d¬®(ýTìý\u001f;{rî}\\i\u0010{\u008c¬Y\u001b:S%L\u0005p¢W\u008e\u009c\u000b@\u009c7#IÐ\u00adÉKàL\u0016¬£\u0098É;h4z\u0004Ë\u0018l\u009b´Ï\u0011\u0085\u001b\t0qÿ\u0007º¬üü,\u0095ß\u0005Å°ÄSd\u0003|f♨\u0006Ø\"\u007f\u0019\u0018Ú\u0007\u0007Nl×+^û\u0010ÕÛ²\u0015ÛP&×Á£ü\u0017ó-Ç\u0014!¶³ÞßL$\u0089áø\u008a\u0081^oØx¾?ä\u0082©CäÏS\u0088= ÛZYêL\u0095\tûòlà\u0090wþ\u009c2\u0010q[\u0011Û\u0091Ú)?Ú\"H¤\u0018\u0081?s%.èÍs4\u009cÛNw\u009b\t?hÁ\tD¬qø\u009c+CV\u0097\u0081\u0080\u000b¸b=%ØéÖ`»7\u0007Jkâ\u0004ï\u008a§\u000e[djáè \u000b\f|ºdÒ«E )ÑÙÆ\u0095Ï\u000e#JØËg¦£¾^ÁâþJ\u0015Î\u009c\u008d.i\u0099\u0000ø\u0001\u008fI\u0007\tIX\f\u0002e\u008f\r\u0088\u009e.cpÛÂæ¥\u0094¶Ú\u001b";
      int var4 = "ôh\u008d÷±\u0003×\n÷JÁù\u0097\u008bv¢6\u0096\u000béè¾dw\u009aÐ\u0091f¿5-ªë/\u008doÊ\u0006ácèÕ>Ýs\u0002º\u0001N\u0006ãÿVµ\u008a\u008c\u0014°ª\u001fª°\u00052\u009a\u0019v,H\u0013Z>ã\u0001V\u001a\u001f\tíaÁ\u0091ßâ§z,³+aÙö°l\u0080#CÚM\u0092)ÀäÄ§Ó+e\u0015O\u0099\u0082MYCÔÏNÆhj\u009bV\u001a;4\u0013\u0014ÜØ\u0006ËM\u0012×K\u0010\u0005^b\u007fI\u009d\u0010ù:\u0091yO¸po8\u00adüO\b\u00986º\u000bòÈa©\u0081\u0094ñÚ)9Þ\u0004+j²)\u0002Î¬\u0004\u001f¬qu\u0010Ñl\u0005=\u0013\u0006y¤ÐQ\tÊ0L:Ê\u0003w\u0081´\n\u009a\rrÆ1E>¶\u008d\t\u0006ñ?g´\u009cÎ\u0002b\"\u0007ß\u0091xÆ²ÕÂ\u00108T\u0084~-Â1»Ë\u008ej1\\3·%\u0014É\u009eÒ¢\fo\u0092óÿ¦\u0091qÜµõ\u0096|Ê6\n\n´ã©Ì\u009a-×v\u0002\f\u000e\u0014gæ\u0090aõ\u0092åÝ\u008b\tÙ\u009fa\u0016\u000eªÉ¤³\bÂ3\u008e\u0014\u009c¤\u007f\u00adÇ\u0015\u0096R%p\u0081\u0091\u0011@\u00917\u0082Uà¤`Ç\u009d¯\u0014AOÅ\u001e\u0088\"F6Úu\u0093{©;B×Ó\n\u008en\u008e\u0092\u0001´¤\u0087\nÄê=äö\u00050\u0019·ðSò##\u0019Ó³\u007f\u0004\u001c|,n®@º/Ad\u0012[&j0\u0098MÌ¶\u009co8Þ½\f'ç~A\u009e\u000e6\u0014\u009fÖ\u0081 Ìºm\nÔÂ\u0084;\u0017á¬1(\u000eT\u0092ýÐ;\u0082rÎ}«{E$ç\u0082\u00ad\u0080Õ\u000f\u0096Yí\u009b\bÄÍ\u0005Dî\u0080\\\u008cØ¤\u0003S*X\tz&»Þi\u0094\u0005À\u0019\u001dS\u001fg^Ä\u009aË$û\u0000ç\u0015m\u009c1ó\u0014kæºãe8Õ³».ÿÞ\u000b\u0093}zÂÅÄ\fªWxã$å\u0003¹\u0097\u001c\u00ad\u0090 ·4Åó\u0089e+\u001d;;íû\tM÷Û³]\u009a\u0092{ò\u0001®×ïßb\u000b\u008890@|\u008a/¸\u0010\u008fWK,<\u00974:T\u008f.²Á.²õ\u0007\u008aL Ô\u008d/\u0092µ°Øæâ§\u0086MþGÎ¾\u0090\u008aikX\u0015ÕÞ>5?üP\u00831!vö\u0097O\u009d\u001dóý\u008d\u001a.\u001f£õò\u0082\"ÿÁâ\u008cøATµé\u00067\u0093¿!\u0087|\u0006²#\u0004\u00957U\u000fK\u0091V\u0082\u007fç#a\u0099b;ÍûêJ\f5Ê~¥a£\u0090®í}ÀS$\rí&=Eu\u008e\u0019±\u0012*\fºÐ&³ª\u0086¢øg\u00828\u0011\u001e\u0004ý³\u0002¤*W{\\:\u0090\u0006\u0087\u009c\u0094ï/\u001a\u001b-þ\"_Å9\u0084\u0094¶6?¡*2#\u000eÿÐFI\u0082\u0099q\u0006*qï\u0002tZ\u0006\rñùÎ6n\u0007\u000b%r^N6(\u0005ÙHGL\u0014\u000fã8~W#¢UçÈ]\u0011:\u0088w\u009f\tÄnÐùwéÛ\"\u0083\bÈP&ºmýò\u009a\u0010\u009e\n\u0015m\u0089Qª\f\u0006\u001dö\u008dyÀ\u0018±\b¿w®C¼y\u0003\r\u0018Ä\u001dt2I\u0094'\u0002\tsù×$v\u0082Ä\u0013éÈ¥©\u0082ç>\bWLL5á\u008b\u0080«\u0007\u008adU!z{.\u0017\u0087{\u007f\u0006\\ÊÑ\u0000û]ÍG\u0005MðZG\u0096\u008bëº;;\u0005²mõ-?\u0005\u0084v$Ëö\rH\"6ôs)¢¸©_7£+\u000e/¥\u0010Kd\b¾e\u008f}Åc\rÜ\rMÿ%á\u0002\u0098ÞXvE¦4ê\u0016òÒV«@é¼\u000fA\u0093eT@³ Öj*º\u007frp\u0003¦t☳\tGOø4\u008c´aK\u0015\u0006r3\u0016\u0096Ëe\ryæD¢\u0081¾Ïp-1\u0004\u0094\u0016\u001b·\u0090q\u0092¯\u0080È£\u0001Á9qtß¾æì7\u0014×C²\u007f4\u0014ø\u001b\u0005\r\u001dò>}\u0004ÔñÊ\u009e\u0014ßk¦RÝútÇ{\t ¥®\rQé\n¤Ù\u0089\t\u0082¼\u0018£n¢øKç\u000e¿{ø\u0004o×íi:óT\fÏ)\f\u0090\u0095æªßQnz\u0000\u0010>^\b×Î\\eã\u0081Àê\u0004ÓÎ*y$³hùd\u008c\u0086Ë\u0089¯b³!è\u001d`-\u0097Õt\u0086DO¡åT&¶Ø3\\!a\u0081Ôø}\u000eb¦øÑm¶WõÎ\u001fx<\u008e3\n¸]B¸¨\u0006\u0000üCg\u000b¼}¨\u001fºWÓ9\u0084þµ\u000eE6Ï½l¨lµÅ%Îhl½\b\u0087ÖÏjPçUÙ\u0006Ãá{µ\u0000\u0014\u0003\u007f\u0007\u0003\"\u0016ë¶\u0086Ã\u0005GÞ®wb¾`\u000fìà(cFõ\u007fH|YGd\"Ö\u008b\u000f,ÂsL\u0007ó\u0019ýÄ\u0001÷Ê\b\u0002/\u0098\u0019½4\u000b\\\u0007m\u008cËúÜSS\u0002õ\u000b\u001d¯i\tÑ\u008f-M\u007f\"MÆ\u0018\u0010\u001b\u008c²òíWz\u0000|NÖsü\u0090¦:\u001eO\u0018ûò·\u008c<&\u008d±³¸YÃ¸ÿÉìKÂ\u0095á\u0003ïÅ\u0011ð\u001a»E\u0018¯2ú±/aå¿;)tW\u0094\u0006\u0089%\u007f²q\u0084Õ\u0014ò¬\u0014ât\u0001±)\u0086êH¨øZ\u009báÊ¸\u00117»~j\u000evrÅ¡Ôæ sõE3\tT/\u000eT)\u0081Ê\\\u008b±Þ×ðw¿Üù\u0012ÛïDM;\u0014{R|ÅÊÚø\u009aWD\u0088s\f!ºü«1b\u009a\u0096¬zè³\u001a\u0089\u0088¶\u0091WàÍ¤¶BD4B\u0088ÀR«8ÿ|¤²rÝnh\u0015Ü\u0083\u0095Þâø`O1º»t*1\u0094ÎH|åÝÅ\u000b>×øJ²è\u0097UåÈG\u0007?\u001ck\u009dË\u0017ç\u0010L.ÚXxZºP ^XAÑ\u0016¦¸\u0006ÐÚq%'N\u0013¹ë°ý\u0097mÐ\u001eñdÉ\u0095jC}u\u0094_V\u0007fÛµ^¿/8\u0015\u0084³7\u0082[Aõ\u001c\u0015&\u001b\u0095úNûg6\u009d\u0080µA\u0003/\u009c☂\u0019Ä=\u001f'b6k~b\u0007ÏS\u0007 \u009b\u0094\u001e\u0004\u0007Ù]DSc¥IÅç°\u0096\u009d¨0\u0000P¨\u0092ùÒ¶ðð\u009dù\rPK\u0095:ïZ\u001aÛÐù4\u0090C¹r\bIBð\u0018\u0090}Á\u0016Ax\r\u0090;ÿ\u0082}\u0001+Qzâ¡Ym\u0080\u008bÐHËÀÓ\u0081Ñª>\u0084\u009d\u0099\u000bËD\\@TÕs\u008e\u0006\fÑ\u0003)\\⛂\u001cd<\u000b\u0007à2!õ&\u001b\u00848ÃöHÃ2\u0093ÌO+4oùðØ\u0094\u0080\u0006ÄÂü$\"c\t\u0013¹¢ÓÓC\u009b)9\t\u0080à\u0000\u0083\u0093B\u0082\u0095i\u0002\u0087Ô\u000b!/\u0001-ÿx\u0006;¨º\u0004\bw\u001b6\u009fhä±F)\u0018Êÿ¥Q£\u0096®Yw¹H¯¡Q\u000ehª¨YÝ¢¸\u008as\u0006ß\u008eBô¼l\u009f\u0014 \u0006Là\u0010\u0084\u001f\u000fp\u009f\u000f\u009eDO\u009eñÎ\u0005(d¯¼{\u000eG\u0094\u008cî,:;\u001cè´¯>K\u009d\u0013ØÁNW03UÛK\u000bâ\u0001^Åò}Vª\u000f\u000e&ìGzV  ôITíÐç\u0099\u0004\u0087\b'e\u00101È,!Åu\u0011¸Kô\u0004>WèÖ^\u000f\u0019\u0012!\u0012È\n(ògÿän6ýH\u0005ÚL\u0002S6\u0005IÒzÇl\u0006tr\u008dÇÞZ\u0010CÔ\u008fÉªZðÅá\u008e)9²Vac\u0010,¦+ê\u0018Ê\u009a!edWv}¿\u0098^K2\u0018T°BÄ\u0080<S\u0083\u0012úr\u000ezm¾ðN«ê%¿Ê\u0007 \u009bÎÊ÷·ï ´Ií\u0013È\u001aÇ?|\tw{Ys\u0010?R5\u00137\r\u0012á\u001cÏ&f\u0098ª\u0005Ó\u009c\u0006<E\u009a\u001c÷Sµ÷Õ\u0012\u0089²4¡\u00adk¦øq/\u001d\u0090\u0092\tIÄz\u0091\u0016\u0091`Þ[\u000e¨\u0090ß\u001c®´5\u0087³Ì5aï¢À\u009a`\u0003Â\u008c⚿\u0002\u009b\u0011\u001b\u008f\u0016û)\u00adá\u0010/\u008e\u009cî\u009am\u009c5fW\u0083nÚtßÆÛAã5\u0004«lçm\u0003=\u0081é\u001c\u0019\u0001/_ñ&ß¢³Ïg@¿BGiÒ2MÙ\u0086}\u009f\"\n'¼S\u0011|\u0014Ú\u0091»#bX\u000fó\u0098à\u001fÁcÄÖ\u001a\u001d¬®(ýTìý\u001f;{rî}\\i\u0010{\u008c¬Y\u001b:S%L\u0005p¢W\u008e\u009c\u000b@\u009c7#IÐ\u00adÉKàL\u0016¬£\u0098É;h4z\u0004Ë\u0018l\u009b´Ï\u0011\u0085\u001b\t0qÿ\u0007º¬üü,\u0095ß\u0005Å°ÄSd\u0003|f♨\u0006Ø\"\u007f\u0019\u0018Ú\u0007\u0007Nl×+^û\u0010ÕÛ²\u0015ÛP&×Á£ü\u0017ó-Ç\u0014!¶³ÞßL$\u0089áø\u008a\u0081^oØx¾?ä\u0082©CäÏS\u0088= ÛZYêL\u0095\tûòlà\u0090wþ\u009c2\u0010q[\u0011Û\u0091Ú)?Ú\"H¤\u0018\u0081?s%.èÍs4\u009cÛNw\u009b\t?hÁ\tD¬qø\u009c+CV\u0097\u0081\u0080\u000b¸b=%ØéÖ`»7\u0007Jkâ\u0004ï\u008a§\u000e[djáè \u000b\f|ºdÒ«E )ÑÙÆ\u0095Ï\u000e#JØËg¦£¾^ÁâþJ\u0015Î\u009c\u008d.i\u0099\u0000ø\u0001\u008fI\u0007\tIX\f\u0002e\u008f\r\u0088\u009e.cpÛÂæ¥\u0094¶Ú\u001b"
         .length();
      char var1 = 7;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 114;
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
                     case 0 -> 67;
                     case 1 -> 119;
                     case 2 -> 76;
                     case 3 -> 1;
                     case 4 -> 122;
                     case 5 -> 108;
                     default -> 1;
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
                     b = new String[162];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new GsonBuilder().create();
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new CopyOnWriteArrayList<>();
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 100;
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new ConcurrentHashMap<>();
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 5000L;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new CopyOnWriteArrayList<>();
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new CopyOnWriteArrayList<>();
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new ConcurrentLinkedQueue<>();
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 60000L;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 45;
                     me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                        .a(IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
                     // PX-FIX removed: llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII::g;
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

                  var2 = "¨ñÖr\u0095\u000fRÍ¥Ê\rÇüÅ+Sûm\u0010\u0090h\u0002A{\u0001\u0098±§¤¾O\u0099£\u0084\u0095";
                  var4 = "¨ñÖr\u0095\u000fRÍ¥Ê\rÇüÅ+Sûm\u0010\u0090h\u0002A{\u0001\u0098±§¤¾O\u0099£\u0084\u0095".length();
                  var1 = 18;
                  var8 = -1;
            }

            var10000 = 109;
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
      int var2 = (var0 ^ 26100) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 125;
            case 1 -> 229;
            case 2 -> 142;
            case 3 -> 169;
            case 4 -> 247;
            case 5 -> 223;
            case 6 -> 158;
            case 7 -> 139;
            case 8 -> 176;
            case 9 -> 51;
            case 10 -> 65;
            case 11 -> 99;
            case 12 -> 239;
            case 13 -> 60;
            case 14 -> 198;
            case 15 -> 209;
            case 16 -> 96;
            case 17 -> 171;
            case 18 -> 31;
            case 19 -> 248;
            case 20 -> 55;
            case 21 -> 97;
            case 22 -> 89;
            case 23 -> 103;
            case 24 -> 163;
            case 25 -> 92;
            case 26 -> 207;
            case 27 -> 203;
            case 28 -> 118;
            case 29 -> 61;
            case 30 -> 9;
            case 31 -> 186;
            case 32 -> 182;
            case 33 -> 144;
            case 34 -> 45;
            case 35 -> 150;
            case 36 -> 192;
            case 37 -> 202;
            case 38 -> 112;
            case 39 -> 24;
            case 40 -> 23;
            case 41 -> 4;
            case 42 -> 59;
            case 43 -> 137;
            case 44 -> 205;
            case 45 -> 62;
            case 46 -> 13;
            case 47 -> 147;
            case 48 -> 122;
            case 49 -> 195;
            case 50 -> 52;
            case 51 -> 100;
            case 52 -> 228;
            case 53 -> 212;
            case 54 -> 193;
            case 55 -> 17;
            case 56 -> 227;
            case 57 -> 25;
            case 58 -> 131;
            case 59 -> 15;
            case 60 -> 250;
            case 61 -> 164;
            case 62 -> 160;
            case 63 -> 216;
            case 64 -> 95;
            case 65 -> 135;
            case 66 -> 41;
            case 67 -> 56;
            case 68 -> 70;
            case 69 -> 242;
            case 70 -> 38;
            case 71 -> 0;
            case 72 -> 98;
            case 73 -> 154;
            case 74 -> 145;
            case 75 -> 243;
            case 76 -> 86;
            case 77 -> 185;
            case 78 -> 201;
            case 79 -> 57;
            case 80 -> 67;
            case 81 -> 34;
            case 82 -> 37;
            case 83 -> 39;
            case 84 -> 44;
            case 85 -> 221;
            case 86 -> 101;
            case 87 -> 211;
            case 88 -> 107;
            case 89 -> 14;
            case 90 -> 226;
            case 91 -> 254;
            case 92 -> 162;
            case 93 -> 246;
            case 94 -> 133;
            case 95 -> 148;
            case 96 -> 12;
            case 97 -> 143;
            case 98 -> 183;
            case 99 -> 85;
            case 100 -> 167;
            case 101 -> 123;
            case 102 -> 104;
            case 103 -> 161;
            case 104 -> 93;
            case 105 -> 165;
            case 106 -> 255;
            case 107 -> 63;
            case 108 -> 46;
            case 109 -> 237;
            case 110 -> 175;
            case 111 -> 132;
            case 112 -> 224;
            case 113 -> 30;
            case 114 -> 68;
            case 115 -> 236;
            case 116 -> 43;
            case 117 -> 156;
            case 118 -> 178;
            case 119 -> 53;
            case 120 -> 194;
            case 121 -> 48;
            case 122 -> 66;
            case 123 -> 88;
            case 124 -> 128;
            case 125 -> 87;
            case 126 -> 210;
            case 127 -> 225;
            case 128 -> 33;
            case 129 -> 196;
            case 130 -> 191;
            case 131 -> 238;
            case 132 -> 168;
            case 133 -> 188;
            case 134 -> 28;
            case 135 -> 208;
            case 136 -> 22;
            case 137 -> 36;
            case 138 -> 27;
            case 139 -> 84;
            case 140 -> 72;
            case 141 -> 200;
            case 142 -> 42;
            case 143 -> 71;
            case 144 -> 119;
            case 145 -> 19;
            case 146 -> 199;
            case 147 -> 179;
            case 148 -> 109;
            case 149 -> 220;
            case 150 -> 90;
            case 151 -> 233;
            case 152 -> 106;
            case 153 -> 204;
            case 154 -> 29;
            case 155 -> 58;
            case 156 -> 81;
            case 157 -> 120;
            case 158 -> 64;
            case 159 -> 78;
            case 160 -> 80;
            case 161 -> 32;
            case 162 -> 152;
            case 163 -> 6;
            case 164 -> 184;
            case 165 -> 7;
            case 166 -> 10;
            case 167 -> 146;
            case 168 -> 155;
            case 169 -> 130;
            case 170 -> 54;
            case 171 -> 69;
            case 172 -> 47;
            case 173 -> 187;
            case 174 -> 244;
            case 175 -> 253;
            case 176 -> 40;
            case 177 -> 113;
            case 178 -> 94;
            case 179 -> 73;
            case 180 -> 134;
            case 181 -> 82;
            case 182 -> 151;
            case 183 -> 214;
            case 184 -> 170;
            case 185 -> 206;
            case 186 -> 240;
            case 187 -> 5;
            case 188 -> 127;
            case 189 -> 77;
            case 190 -> 217;
            case 191 -> 115;
            case 192 -> 249;
            case 193 -> 141;
            case 194 -> 232;
            case 195 -> 166;
            case 196 -> 117;
            case 197 -> 50;
            case 198 -> 116;
            case 199 -> 18;
            case 200 -> 138;
            case 201 -> 159;
            case 202 -> 219;
            case 203 -> 136;
            case 204 -> 110;
            case 205 -> 114;
            case 206 -> 126;
            case 207 -> 49;
            case 208 -> 3;
            case 209 -> 111;
            case 210 -> 177;
            case 211 -> 140;
            case 212 -> 124;
            case 213 -> 76;
            case 214 -> 91;
            case 215 -> 189;
            case 216 -> 2;
            case 217 -> 21;
            case 218 -> 218;
            case 219 -> 213;
            case 220 -> 241;
            case 221 -> 26;
            case 222 -> 16;
            case 223 -> 74;
            case 224 -> 251;
            case 225 -> 245;
            case 226 -> 197;
            case 227 -> 8;
            case 228 -> 105;
            case 229 -> 215;
            case 230 -> 222;
            case 231 -> 157;
            case 232 -> 75;
            case 233 -> 180;
            case 234 -> 1;
            case 235 -> 20;
            case 236 -> 174;
            case 237 -> 108;
            case 238 -> 83;
            case 239 -> 121;
            case 240 -> 181;
            case 241 -> 11;
            case 242 -> 129;
            case 243 -> 172;
            case 244 -> 231;
            case 245 -> 252;
            case 246 -> 149;
            case 247 -> 235;
            case 248 -> 102;
            case 249 -> 153;
            case 250 -> 234;
            case 251 -> 173;
            case 252 -> 190;
            case 253 -> 79;
            case 254 -> 35;
            default -> 230;
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
public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(boolean var1, String var2, String var3, int var4, kotlin.jvm.internal.DefaultConstructorMarker var5) {
   this(var1, var2, (var4 & 4) != 0 ? null : var3);
}
public static me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1, boolean var2, String var3, String var4, int var5, Object var6) {
   if ((var5 & 1) != 0) {
      var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   if ((var5 & 2) != 0) {
      var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }
   if ((var5 & 4) != 0) {
      var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }
   return var1.a(var2, var3, var4);
}
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
           this(false, null, null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @Nullable
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(boolean var1, @Nullable String var2, @Nullable String var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final String c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String e() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final String f() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         boolean var1, @Nullable String var2, @Nullable String var3
      ) {
         return new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -6557;
         String var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -6333;
         short var10002 = -6559;
         short var10003 = 26510;
         short var10004 = -6560;
         short var10005 = -23189;
         return "IRCStatus(connected=" + var3 + ", nickname=" + var2 + ", error=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         boolean var1;
         int var4;
         int var6;
         label25: {
            boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
            int var2 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            var1 = var10000;
            var4 = var2 * 31;
            String var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (!var1) {
               if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  var6 = 0;
                  break label25;
               }

               var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }

            var6 = var10001.hashCode();
         }

         int var3 = var4 + var6;
         var4 = var3 * 31;
         String var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         if (!var1) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == null) {
               return var4 + 0;
            }

            var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         return var4 + var7.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.h();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = (llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;
         boolean var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (!var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            );
         }

         if (!var2) {
            if (!var4) {
               return false;
            }

            var4 = Intrinsics.areEqual(
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            );
         }

         if (!var2) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { byte var13 = (byte)0; // PX-FIX hoist
        
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "»¨xÆGbæ¡#Ô\u0007\bV,ÎMêo|Ø\u0014Æ\u00893ä±Q×\u0098B(¨Ïázp¾{#y\u0005";
         int var4 = "»¨xÆGbæ¡#Ô\u0007\bV,ÎMêo|Ø\u0014Æ\u00893ä±Q×\u0098B(¨Ïázp¾{#y\u0005".length();
         char var1 = 11;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
                var13 = 4;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 4;
                  var10006 = var6;
               } else {
                  var13 = 4;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 4;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 104;
                     case 1 -> 88;
                     case 2 -> 65;
                     case 3 -> 17;
                     case 4 -> 36;
                     case 5 -> 51;
                     default -> 111;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -6559) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 173;
               case 1 -> 16;
               case 2 -> 97;
               case 3 -> 236;
               case 4 -> 110;
               case 5 -> 177;
               case 6 -> 211;
               case 7 -> 237;
               case 8 -> 222;
               case 9 -> 61;
               case 10 -> 58;
               case 11 -> 10;
               case 12 -> 226;
               case 13 -> 209;
               case 14 -> 130;
               case 15 -> 46;
               case 16 -> 247;
               case 17 -> 245;
               case 18 -> 30;
               case 19 -> 249;
               case 20 -> 169;
               case 21 -> 114;
               case 22 -> 89;
               case 23 -> 73;
               case 24 -> 121;
               case 25 -> 93;
               case 26 -> 107;
               case 27 -> 218;
               case 28 -> 156;
               case 29 -> 255;
               case 30 -> 204;
               case 31 -> 133;
               case 32 -> 145;
               case 33 -> 79;
               case 34 -> 94;
               case 35 -> 63;
               case 36 -> 191;
               case 37 -> 98;
               case 38 -> 84;
               case 39 -> 233;
               case 40 -> 150;
               case 41 -> 40;
               case 42 -> 254;
               case 43 -> 143;
               case 44 -> 190;
               case 45 -> 108;
               case 46 -> 167;
               case 47 -> 127;
               case 48 -> 206;
               case 49 -> 164;
               case 50 -> 244;
               case 51 -> 39;
               case 52 -> 57;
               case 53 -> 82;
               case 54 -> 12;
               case 55 -> 175;
               case 56 -> 106;
               case 57 -> 132;
               case 58 -> 85;
               case 59 -> 59;
               case 60 -> 103;
               case 61 -> 49;
               case 62 -> 228;
               case 63 -> 139;
               case 64 -> 101;
               case 65 -> 219;
               case 66 -> 178;
               case 67 -> 11;
               case 68 -> 56;
               case 69 -> 124;
               case 70 -> 115;
               case 71 -> 120;
               case 72 -> 152;
               case 73 -> 28;
               case 74 -> 41;
               case 75 -> 38;
               case 76 -> 70;
               case 77 -> 48;
               case 78 -> 188;
               case 79 -> 112;
               case 80 -> 9;
               case 81 -> 122;
               case 82 -> 246;
               case 83 -> 207;
               case 84 -> 44;
               case 85 -> 100;
               case 86 -> 118;
               case 87 -> 95;
               case 88 -> 240;
               case 89 -> 1;
               case 90 -> 231;
               case 91 -> 51;
               case 92 -> 135;
               case 93 -> 230;
               case 94 -> 75;
               case 95 -> 20;
               case 96 -> 146;
               case 97 -> 165;
               case 98 -> 72;
               case 99 -> 181;
               case 100 -> 66;
               case 101 -> 18;
               case 102 -> 252;
               case 103 -> 203;
               case 104 -> 210;
               case 105 -> 201;
               case 106 -> 6;
               case 107 -> 33;
               case 108 -> 129;
               case 109 -> 37;
               case 110 -> 187;
               case 111 -> 208;
               case 112 -> 192;
               case 113 -> 7;
               case 114 -> 217;
               case 115 -> 21;
               case 116 -> 174;
               case 117 -> 138;
               case 118 -> 189;
               case 119 -> 239;
               case 120 -> 168;
               case 121 -> 50;
               case 122 -> 45;
               case 123 -> 80;
               case 124 -> 34;
               case 125 -> 153;
               case 126 -> 14;
               case 127 -> 125;
               case 128 -> 4;
               case 129 -> 126;
               case 130 -> 3;
               case 131 -> 131;
               case 132 -> 117;
               case 133 -> 113;
               case 134 -> 35;
               case 135 -> 205;
               case 136 -> 223;
               case 137 -> 55;
               case 138 -> 251;
               case 139 -> 241;
               case 140 -> 99;
               case 141 -> 81;
               case 142 -> 186;
               case 143 -> 136;
               case 144 -> 180;
               case 145 -> 32;
               case 146 -> 90;
               case 147 -> 176;
               case 148 -> 68;
               case 149 -> 225;
               case 150 -> 142;
               case 151 -> 111;
               case 152 -> 65;
               case 153 -> 161;
               case 154 -> 155;
               case 155 -> 235;
               case 156 -> 182;
               case 157 -> 163;
               case 158 -> 13;
               case 159 -> 158;
               case 160 -> 151;
               case 161 -> 215;
               case 162 -> 234;
               case 163 -> 195;
               case 164 -> 22;
               case 165 -> 248;
               case 166 -> 227;
               case 167 -> 123;
               case 168 -> 47;
               case 169 -> 60;
               case 170 -> 96;
               case 171 -> 159;
               case 172 -> 91;
               case 173 -> 88;
               case 174 -> 212;
               case 175 -> 5;
               case 176 -> 29;
               case 177 -> 31;
               case 178 -> 157;
               case 179 -> 196;
               case 180 -> 214;
               case 181 -> 25;
               case 182 -> 86;
               case 183 -> 242;
               case 184 -> 26;
               case 185 -> 141;
               case 186 -> 149;
               case 187 -> 0;
               case 188 -> 170;
               case 189 -> 67;
               case 190 -> 144;
               case 191 -> 92;
               case 192 -> 83;
               case 193 -> 224;
               case 194 -> 102;
               case 195 -> 199;
               case 196 -> 194;
               case 197 -> 221;
               case 198 -> 54;
               case 199 -> 69;
               case 200 -> 179;
               case 201 -> 36;
               case 202 -> 253;
               case 203 -> 183;
               case 204 -> 148;
               case 205 -> 184;
               case 206 -> 23;
               case 207 -> 160;
               case 208 -> 27;
               case 209 -> 140;
               case 210 -> 202;
               case 211 -> 154;
               case 212 -> 109;
               case 213 -> 250;
               case 214 -> 104;
               case 215 -> 147;
               case 216 -> 171;
               case 217 -> 2;
               case 218 -> 220;
               case 219 -> 119;
               case 220 -> 19;
               case 221 -> 116;
               case 222 -> 185;
               case 223 -> 74;
               case 224 -> 128;
               case 225 -> 216;
               case 226 -> 43;
               case 227 -> 134;
               case 228 -> 15;
               case 229 -> 64;
               case 230 -> 243;
               case 231 -> 87;
               case 232 -> 213;
               case 233 -> 232;
               case 234 -> 76;
               case 235 -> 24;
               case 236 -> 137;
               case 237 -> 77;
               case 238 -> 53;
               case 239 -> 193;
               case 240 -> 78;
               case 241 -> 200;
               case 242 -> 42;
               case 243 -> 172;
               case 244 -> 166;
               case 245 -> 71;
               case 246 -> 8;
               case 247 -> 197;
               case 248 -> 17;
               case 249 -> 162;
               case 250 -> 105;
               case 251 -> 52;
               case 252 -> 62;
               case 253 -> 238;
               case 254 -> 229;
               default -> 198;
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

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
public static me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1, boolean var2, int var3, int var4, Object var5) {
   if ((var4 & 1) != 0) {
      var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   if ((var4 & 2) != 0) {
      var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }
   return var1.a(var2, var3);
}
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(boolean var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final boolean a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         boolean var1, int var2
      ) {
         return new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -27490;
         short var10003 = 23331;
         var10003 = -27489;
         short var10004 = 23419;
         return "RateLimitResult(allowed="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", secondsUntilReset="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = ((this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         int var10001 = ((var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) ? 1 : 0);
         if (var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (!var2) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { byte var13 = (byte)0; // PX-FIX hoist
        
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "°\f\nkÙ\u009fS±\u0098PNO'X$\u0084o\u0013â¾\n_úo\u0014\\7!etX/\u0082s\u009dß\u0016c\u0094\u0015P¹dp*";
         int var4 = "°\f\nkÙ\u009fS±\u0098PNO'X$\u0084o\u0013â¾\n_úo\u0014\\7!etX/\u0082s\u009dß\u0016c\u0094\u0015P¹dp*".length();
         char var1 = 24;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
                var13 = 12;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 12;
                  var10006 = var6;
               } else {
                  var13 = 12;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 12;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 5;
                     case 1 -> 66;
                     case 2 -> 93;
                     case 3 -> 7;
                     case 4 -> 8;
                     case 5 -> 63;
                     default -> 76;
                  });
                  var6++;
                  if (var13 == 0) {
                     var10006 = var13;
                     var10005 = var10002;
                     var16 = var13;
                  } else {
                     if (var8 <= var6) {
                        break;
                     }

                     var10005 = var10002;
                     var16 = var13;
                     var10006 = var6;
                  }
               }
            }

            String var15 = new String(var10002).intern();
            byte var10 = -1;
            var5[var3++] = var15;
            if ((var0 += var1) >= var4) {
               a = var5;
               b = new String[2];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -27490) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 140;
               case 1 -> 21;
               case 2 -> 253;
               case 3 -> 22;
               case 4 -> 220;
               case 5 -> 222;
               case 6 -> 78;
               case 7 -> 110;
               case 8 -> 210;
               case 9 -> 246;
               case 10 -> 129;
               case 11 -> 59;
               case 12 -> 206;
               case 13 -> 138;
               case 14 -> 3;
               case 15 -> 77;
               case 16 -> 251;
               case 17 -> 245;
               case 18 -> 63;
               case 19 -> 7;
               case 20 -> 184;
               case 21 -> 111;
               case 22 -> 244;
               case 23 -> 189;
               case 24 -> 1;
               case 25 -> 228;
               case 26 -> 131;
               case 27 -> 100;
               case 28 -> 241;
               case 29 -> 4;
               case 30 -> 201;
               case 31 -> 147;
               case 32 -> 142;
               case 33 -> 146;
               case 34 -> 18;
               case 35 -> 211;
               case 36 -> 98;
               case 37 -> 82;
               case 38 -> 97;
               case 39 -> 108;
               case 40 -> 151;
               case 41 -> 165;
               case 42 -> 57;
               case 43 -> 61;
               case 44 -> 176;
               case 45 -> 133;
               case 46 -> 83;
               case 47 -> 8;
               case 48 -> 117;
               case 49 -> 88;
               case 50 -> 235;
               case 51 -> 92;
               case 52 -> 25;
               case 53 -> 89;
               case 54 -> 43;
               case 55 -> 163;
               case 56 -> 53;
               case 57 -> 216;
               case 58 -> 90;
               case 59 -> 205;
               case 60 -> 218;
               case 61 -> 213;
               case 62 -> 28;
               case 63 -> 119;
               case 64 -> 15;
               case 65 -> 152;
               case 66 -> 44;
               case 67 -> 236;
               case 68 -> 112;
               case 69 -> 51;
               case 70 -> 118;
               case 71 -> 132;
               case 72 -> 62;
               case 73 -> 167;
               case 74 -> 148;
               case 75 -> 192;
               case 76 -> 49;
               case 77 -> 166;
               case 78 -> 10;
               case 79 -> 54;
               case 80 -> 144;
               case 81 -> 171;
               case 82 -> 160;
               case 83 -> 193;
               case 84 -> 229;
               case 85 -> 2;
               case 86 -> 80;
               case 87 -> 134;
               case 88 -> 11;
               case 89 -> 202;
               case 90 -> 45;
               case 91 -> 85;
               case 92 -> 52;
               case 93 -> 237;
               case 94 -> 168;
               case 95 -> 173;
               case 96 -> 150;
               case 97 -> 215;
               case 98 -> 115;
               case 99 -> 38;
               case 100 -> 42;
               case 101 -> 227;
               case 102 -> 252;
               case 103 -> 175;
               case 104 -> 204;
               case 105 -> 195;
               case 106 -> 239;
               case 107 -> 169;
               case 108 -> 126;
               case 109 -> 158;
               case 110 -> 55;
               case 111 -> 95;
               case 112 -> 191;
               case 113 -> 94;
               case 114 -> 91;
               case 115 -> 26;
               case 116 -> 106;
               case 117 -> 234;
               case 118 -> 99;
               case 119 -> 170;
               case 120 -> 27;
               case 121 -> 136;
               case 122 -> 242;
               case 123 -> 157;
               case 124 -> 114;
               case 125 -> 48;
               case 126 -> 156;
               case 127 -> 243;
               case 128 -> 181;
               case 129 -> 249;
               case 130 -> 9;
               case 131 -> 197;
               case 132 -> 41;
               case 133 -> 12;
               case 134 -> 84;
               case 135 -> 174;
               case 136 -> 64;
               case 137 -> 58;
               case 138 -> 74;
               case 139 -> 122;
               case 140 -> 162;
               case 141 -> 104;
               case 142 -> 186;
               case 143 -> 23;
               case 144 -> 207;
               case 145 -> 232;
               case 146 -> 109;
               case 147 -> 103;
               case 148 -> 209;
               case 149 -> 47;
               case 150 -> 139;
               case 151 -> 172;
               case 152 -> 199;
               case 153 -> 39;
               case 154 -> 221;
               case 155 -> 17;
               case 156 -> 182;
               case 157 -> 214;
               case 158 -> 31;
               case 159 -> 13;
               case 160 -> 60;
               case 161 -> 238;
               case 162 -> 177;
               case 163 -> 16;
               case 164 -> 24;
               case 165 -> 113;
               case 166 -> 247;
               case 167 -> 194;
               case 168 -> 198;
               case 169 -> 19;
               case 170 -> 223;
               case 171 -> 137;
               case 172 -> 155;
               case 173 -> 68;
               case 174 -> 125;
               case 175 -> 255;
               case 176 -> 225;
               case 177 -> 231;
               case 178 -> 33;
               case 179 -> 240;
               case 180 -> 159;
               case 181 -> 101;
               case 182 -> 36;
               case 183 -> 183;
               case 184 -> 93;
               case 185 -> 56;
               case 186 -> 120;
               case 187 -> 130;
               case 188 -> 73;
               case 189 -> 149;
               case 190 -> 50;
               case 191 -> 67;
               case 192 -> 250;
               case 193 -> 224;
               case 194 -> 230;
               case 195 -> 14;
               case 196 -> 164;
               case 197 -> 71;
               case 198 -> 66;
               case 199 -> 107;
               case 200 -> 179;
               case 201 -> 128;
               case 202 -> 123;
               case 203 -> 105;
               case 204 -> 46;
               case 205 -> 29;
               case 206 -> 5;
               case 207 -> 127;
               case 208 -> 121;
               case 209 -> 32;
               case 210 -> 190;
               case 211 -> 208;
               case 212 -> 217;
               case 213 -> 180;
               case 214 -> 185;
               case 215 -> 116;
               case 216 -> 37;
               case 217 -> 203;
               case 218 -> 135;
               case 219 -> 6;
               case 220 -> 254;
               case 221 -> 200;
               case 222 -> 141;
               case 223 -> 145;
               case 224 -> 178;
               case 225 -> 76;
               case 226 -> 69;
               case 227 -> 81;
               case 228 -> 124;
               case 229 -> 70;
               case 230 -> 196;
               case 231 -> 102;
               case 232 -> 79;
               case 233 -> 161;
               case 234 -> 87;
               case 235 -> 233;
               case 236 -> 219;
               case 237 -> 248;
               case 238 -> 212;
               case 239 -> 153;
               case 240 -> 143;
               case 241 -> 154;
               case 242 -> 20;
               case 243 -> 34;
               case 244 -> 30;
               case 245 -> 75;
               case 246 -> 35;
               case 247 -> 65;
               case 248 -> 187;
               case 249 -> 40;
               case 250 -> 72;
               case 251 -> 0;
               case 252 -> 188;
               case 253 -> 96;
               case 254 -> 86;
               default -> 226;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(String var1, String var2, long var3, boolean var4, String var5, String var6, int var7, kotlin.jvm.internal.DefaultConstructorMarker var8) {
   this(var1, var2, (var7 & 4) != 0 ? System.currentTimeMillis() : var3, (var7 & 8) != 0 ? false : var4, (var7 & 16) != 0 ? null : var5, (var7 & 32) != 0 ? null : var6);
}
public static me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, String var2, String var3, long var4, boolean var5, String var6, String var7, int var8, Object var9) {
   if ((var8 & 1) != 0) {
      var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }
   if ((var8 & 2) != 0) {
      var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }
   if ((var8 & 4) != 0) {
      var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }
   if ((var8 & 8) != 0) {
      var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }
   if ((var8 & 16) != 0) {
      var6 = var1.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }
   if ((var8 & 32) != 0) {
      var7 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }
   return var1.a(var2, var3, var4, var5, var6, var7);
}
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
           this("", "", 0L, false, null, null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @Nullable
      private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull String var1, @NotNull String var2, long var3, boolean var5, @Nullable String var6, @Nullable String var7
      ) {
         short var10001 = 12604;
         short var10002 = -12516;
         Intrinsics.checkNotNullParameter(var1, "nickname");
         var10001 = 12593;
         var10002 = -23831;
         Intrinsics.checkNotNullParameter(var2, "message");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var5;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final String e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final String g() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String h() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long i() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean j() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final String k() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String l() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @NotNull String var1, @NotNull String var2, long var3, boolean var5, @Nullable String var6, @Nullable String var7
      ) {
         short var10001 = 12592;
         short var10002 = 32576;
         Intrinsics.checkNotNullParameter(var1, "nickname");
         var10001 = 12597;
         var10002 = 29883;
         Intrinsics.checkNotNullParameter(var2, "message");
         return new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 12599;
         String var1 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         long var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var6 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         String var7 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -7246;
         short var10002 = 12596;
         short var10003 = -28806;
         short var10004 = 12598;
         short var10005 = 12237;
         short var10006 = 12594;
         short var10007 = -8321;
         short var10008 = 12595;
         short var10009 = 20300;
         short var10010 = 12605;
         short var10011 = -16112;
         return "IRCMessage(nickname="
            + var7
            + ", message="
            + var6
            + ", timestamp="
            + var4
            + ", isSystem="
            + var3
            + ", roleColor="
            + var2
            + ", prefix="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         boolean var1;
         int var7;
         int var9;
         label25: {
            boolean var10000 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
            int var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            var1 = var10000;
            var2 = var2 * 31 + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
            var2 = var2 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var2 = var2 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            var7 = var2 * 31;
            String var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            if (var1) {
               if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII == null) {
                  var9 = 0;
                  break label25;
               }

               var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            var9 = var10001.hashCode();
         }

         int var6 = var7 + var9;
         var7 = var6 * 31;
         String var10 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         if (var1) {
            if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
               return var7 + 0;
            }

            var10 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }

         return var7 + var10.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = IllIIIIIIIllIlIlIllIlIlllllllIlIIlIllIlIlIIIIlIlIllllIIIIIllIllIIlIIIllllIIlllllIIllI.i();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = ((Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         )) ? 1 : 0);
         if (var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
               var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            )) ? 1 : 0);
         }

         if (var2) {
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

         if (var2) {
            if ((var4 != 0)) {
               return false;
            }

            var4 = ((this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0);
         }

         if (var2) {
            if (var4 !=( (!var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) ? 1 : 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2) {
            if ((var4 == 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )) ? 1 : 0);
         }

         if (var2) {
            if ((var4 == 0)) {
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
         String[] var5 = new String[10];
         int var3 = 0;
         String var2 = "%~Ó\u0004¾¿¼Q¨/\u0007Ãúxo\u0004\u0012¿\fL\u008aç\u0096\u001cv'¯\u008fÑF°\u0014²¾Æ\bá\u0013\u0091Â_ÃÂ¨\u0099ÂÀ.Ì\u0081ÆH\b\u0000,s xæÖ(\u0007·nöýÕ@\u0085\u000b:¾4\næ \u0081ê_y\u0095\f\u001ddËM^Ë~\u0003\u009f>ê\u000f";
         int var4 = "%~Ó\u0004¾¿¼Q¨/\u0007Ãúxo\u0004\u0012¿\fL\u008aç\u0096\u001cv'¯\u008fÑF°\u0014²¾Æ\bá\u0013\u0091Â_ÃÂ¨\u0099ÂÀ.Ì\u0081ÆH\b\u0000,s xæÖ(\u0007·nöýÕ@\u0085\u000b:¾4\næ \u0081ê_y\u0095\f\u001ddËM^Ë~\u0003\u009f>ê\u000f"
            .length();
         char var1 = '\n';
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
                        case 0 -> 36;
                        case 1 -> 76;
                        case 2 -> 64;
                        case 3 -> 116;
                        case 4 -> 8;
                        case 5 -> 124;
                        default -> 97;
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
                        b = new String[10];
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

                     var2 = "\"\u0018zë\u0014Ò\u0016ã\t\u0089<\u0016\u0016ãP\u0086Ió";
                     var4 = "\"\u0018zë\u0014Ò\u0016ã\t\u0089<\u0016\u0016ãP\u0086Ió".length();
                     var1 = '\b';
                     var8 = -1;
               }

               var10000 = 25;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 12596) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 188;
               case 1 -> 44;
               case 2 -> 132;
               case 3 -> 146;
               case 4 -> 243;
               case 5 -> 245;
               case 6 -> 50;
               case 7 -> 40;
               case 8 -> 153;
               case 9 -> 114;
               case 10 -> 6;
               case 11 -> 100;
               case 12 -> 71;
               case 13 -> 96;
               case 14 -> 113;
               case 15 -> 8;
               case 16 -> 145;
               case 17 -> 30;
               case 18 -> 165;
               case 19 -> 192;
               case 20 -> 248;
               case 21 -> 54;
               case 22 -> 75;
               case 23 -> 207;
               case 24 -> 45;
               case 25 -> 126;
               case 26 -> 59;
               case 27 -> 211;
               case 28 -> 216;
               case 29 -> 183;
               case 30 -> 158;
               case 31 -> 171;
               case 32 -> 170;
               case 33 -> 164;
               case 34 -> 204;
               case 35 -> 22;
               case 36 -> 196;
               case 37 -> 195;
               case 38 -> 198;
               case 39 -> 203;
               case 40 -> 84;
               case 41 -> 214;
               case 42 -> 0;
               case 43 -> 107;
               case 44 -> 17;
               case 45 -> 112;
               case 46 -> 2;
               case 47 -> 209;
               case 48 -> 39;
               case 49 -> 140;
               case 50 -> 134;
               case 51 -> 7;
               case 52 -> 179;
               case 53 -> 168;
               case 54 -> 46;
               case 55 -> 102;
               case 56 -> 191;
               case 57 -> 93;
               case 58 -> 38;
               case 59 -> 57;
               case 60 -> 69;
               case 61 -> 219;
               case 62 -> 236;
               case 63 -> 215;
               case 64 -> 80;
               case 65 -> 223;
               case 66 -> 231;
               case 67 -> 217;
               case 68 -> 24;
               case 69 -> 239;
               case 70 -> 221;
               case 71 -> 42;
               case 72 -> 160;
               case 73 -> 1;
               case 74 -> 10;
               case 75 -> 133;
               case 76 -> 177;
               case 77 -> 251;
               case 78 -> 225;
               case 79 -> 141;
               case 80 -> 64;
               case 81 -> 90;
               case 82 -> 237;
               case 83 -> 187;
               case 84 -> 193;
               case 85 -> 89;
               case 86 -> 20;
               case 87 -> 41;
               case 88 -> 77;
               case 89 -> 104;
               case 90 -> 95;
               case 91 -> 137;
               case 92 -> 14;
               case 93 -> 250;
               case 94 -> 72;
               case 95 -> 172;
               case 96 -> 213;
               case 97 -> 247;
               case 98 -> 148;
               case 99 -> 28;
               case 100 -> 33;
               case 101 -> 212;
               case 102 -> 53;
               case 103 -> 157;
               case 104 -> 76;
               case 105 -> 218;
               case 106 -> 135;
               case 107 -> 70;
               case 108 -> 73;
               case 109 -> 13;
               case 110 -> 189;
               case 111 -> 205;
               case 112 -> 61;
               case 113 -> 21;
               case 114 -> 62;
               case 115 -> 162;
               case 116 -> 156;
               case 117 -> 147;
               case 118 -> 26;
               case 119 -> 144;
               case 120 -> 31;
               case 121 -> 37;
               case 122 -> 123;
               case 123 -> 200;
               case 124 -> 63;
               case 125 -> 163;
               case 126 -> 152;
               case 127 -> 92;
               case 128 -> 94;
               case 129 -> 32;
               case 130 -> 202;
               case 131 -> 124;
               case 132 -> 130;
               case 133 -> 67;
               case 134 -> 117;
               case 135 -> 255;
               case 136 -> 86;
               case 137 -> 253;
               case 138 -> 238;
               case 139 -> 81;
               case 140 -> 142;
               case 141 -> 199;
               case 142 -> 29;
               case 143 -> 229;
               case 144 -> 186;
               case 145 -> 233;
               case 146 -> 52;
               case 147 -> 242;
               case 148 -> 181;
               case 149 -> 222;
               case 150 -> 119;
               case 151 -> 173;
               case 152 -> 131;
               case 153 -> 249;
               case 154 -> 34;
               case 155 -> 66;
               case 156 -> 228;
               case 157 -> 206;
               case 158 -> 154;
               case 159 -> 201;
               case 160 -> 138;
               case 161 -> 91;
               case 162 -> 227;
               case 163 -> 16;
               case 164 -> 88;
               case 165 -> 240;
               case 166 -> 143;
               case 167 -> 115;
               case 168 -> 252;
               case 169 -> 97;
               case 170 -> 83;
               case 171 -> 244;
               case 172 -> 108;
               case 173 -> 234;
               case 174 -> 48;
               case 175 -> 5;
               case 176 -> 185;
               case 177 -> 121;
               case 178 -> 55;
               case 179 -> 166;
               case 180 -> 120;
               case 181 -> 87;
               case 182 -> 129;
               case 183 -> 167;
               case 184 -> 109;
               case 185 -> 60;
               case 186 -> 180;
               case 187 -> 19;
               case 188 -> 110;
               case 189 -> 136;
               case 190 -> 161;
               case 191 -> 79;
               case 192 -> 151;
               case 193 -> 226;
               case 194 -> 116;
               case 195 -> 176;
               case 196 -> 127;
               case 197 -> 241;
               case 198 -> 169;
               case 199 -> 232;
               case 200 -> 235;
               case 201 -> 178;
               case 202 -> 111;
               case 203 -> 220;
               case 204 -> 175;
               case 205 -> 101;
               case 206 -> 51;
               case 207 -> 98;
               case 208 -> 35;
               case 209 -> 194;
               case 210 -> 118;
               case 211 -> 12;
               case 212 -> 210;
               case 213 -> 9;
               case 214 -> 246;
               case 215 -> 43;
               case 216 -> 78;
               case 217 -> 105;
               case 218 -> 174;
               case 219 -> 74;
               case 220 -> 122;
               case 221 -> 159;
               case 222 -> 47;
               case 223 -> 208;
               case 224 -> 139;
               case 225 -> 27;
               case 226 -> 25;
               case 227 -> 4;
               case 228 -> 23;
               case 229 -> 58;
               case 230 -> 182;
               case 231 -> 149;
               case 232 -> 197;
               case 233 -> 150;
               case 234 -> 106;
               case 235 -> 99;
               case 236 -> 85;
               case 237 -> 65;
               case 238 -> 11;
               case 239 -> 103;
               case 240 -> 3;
               case 241 -> 68;
               case 242 -> 82;
               case 243 -> 56;
               case 244 -> 125;
               case 245 -> 224;
               case 246 -> 184;
               case 247 -> 15;
               case 248 -> 36;
               case 249 -> 155;
               case 250 -> 49;
               case 251 -> 128;
               case 252 -> 18;
               case 253 -> 230;
               case 254 -> 254;
               default -> 190;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      public static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      public static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      public static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      public static String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      public static String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var0 = new String[5];
         int var4 = 0;
         String var3 = "\u000f\u0001mfLfV9\u001c{M\u0010\u000f\u0001mfPsV9\u001dgZHxC\u000b\u0016\b\u000f\u0001mfJxK\u0012";
         int var5 = "\u000f\u0001mfLfV9\u001c{M\u0010\u000f\u0001mfPsV9\u001dgZHxC\u000b\u0016\b\u000f\u0001mfJxK\u0012".length();
         char var2 = 11;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 127;
            String var10001 = var3.substring(++var8, var8 + var2);
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
                        case 0 -> 25;
                        case 1 -> 12;
                        case 2 -> 113;
                        case 3 -> 70;
                        case 4 -> 92;
                        case 5 -> 105;
                        default -> 93;
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
                     var0[var4++] = var29;
                     if ((var8 += var2) >= var5) {
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0[0];
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0[1];
                        lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0[4];
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0[2];
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0[3];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                        break pxClinit;
                     }

                     var2 = var3.charAt(var8);
                     break;
                  default:
                     var0[var4++] = var29;
                     if ((var8 += var2) < var5) {
                        var2 = var3.charAt(var8);
                        continue label52;
                     }

                     var3 = "{u\u0019\u00128\u0012\"Mn\u0014\u000b{u\u0019\u0012:\u0007%af\u001d(";
                     var5 = "{u\u0019\u00128\u0012\"Mn\u0014\u000b{u\u0019\u0012:\u0007%af\u001d(".length();
                     var2 = '\n';
                     var8 = -1;
               }

               var10000 = 11;
               var10001 = var3.substring(++var8, var8 + var2);
               var10002 = 0;
            }
         }
      }
}
   }
}
