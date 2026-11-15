package me.octo.client;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.JNIC;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.network.protocol.Packet;
import org.jetbrains.annotations.NotNull;
import org.reflections.Reflections;

public final class IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl {
   @NotNull
   public static IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   @NotNull
   private final List<IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
   @NotNull
   private final String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   public static char lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   public static IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   public IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl() {
      String[] var1 = new String[1];
      short var10003 = 18623;
      short var10004 = -29516;
      var1[0] = "me.octo.client";
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      // PX-FIX r39: the dispatcher singleton is now initialised on the field itself; the command
      // factory registers with it, which is what the jar's native <clinit> does implicitly.
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this);
      // PX-FIX r44: the jar registers its command tree through Fabric's client-command callback
      // (BootstrapMethods #0 -> a(this, CommandDispatcher, CommandBuildContext)). Without this call the
      // commands never reach the chat dispatcher, which is why /pn and /polinex were unknown in game.
      ClientCommandRegistrationCallback.EVENT.register((dispatcher, context) -> a(this, dispatcher, context));
   }

   @NotNull
   public final List<IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI> a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void b() {
      this.c();
      this.d();
      int var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size();
      short var10001 = 18603;
      short var10002 = -22439;
      var10002 = 18561;
      short var10003 = 21118;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Commands initialized with " + var10000 + " commands"
      );
   }

   private final void c() {
      try {
         for (java.lang.Class var4 : this.e()) {
            if (var4.isAnnotationPresent(me.octo.client.lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI.class) && me.octo.client.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.class.isAssignableFrom(var4)) {
               try {
                  java.lang.reflect.Constructor var5 = var4.getDeclaredConstructor(new java.lang.Class[0]);
                  var5.setAccessible(true);
                  java.lang.Object var9 = var5.newInstance(new java.lang.Object[0]);
                  kotlin.jvm.internal.Intrinsics.checkNotNull(var9, "null cannot be cast to non-null type me.octo.client.commands.CommandProvider");
                  me.octo.client.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl var6 = (me.octo.client.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl) var9;
                  this.a(var6.a());
               } catch (java.lang.Exception var5) {
                  me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to instantiate command: " + var4.getSimpleName() + ", error: " + var5);
               }
            }
         }
      } catch (java.lang.Exception var2) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Failed to scan for commands: " + var2);
      }
   }

   private final void d() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = g();
      Iterator var2 = lIllllIIlIllIIlllIIlIllIIlIlIIllIlIlllIlIIlIIlllIIlIlllIlIlIIlllIllIlIIIIllIlIIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .iterator();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;

      while (var2.hasNext()) {
         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var3 = (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII)var2.next();

         try {
            if (var1 != null
               || !lIllllIIlIllIIlllIIlIllIIlIlIIllIlIlllIlIIlIIlllIIlIlllIlIlIIlllIllIlIIIIllIlIIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3)) {
               continue;
            }
         } catch (Exception var6) {
            throw (RuntimeException)a(var6);
         }

         try {
            this.a(
               IIIIIIIlllIIllIlllIlllIIlIIIIllIllIlllIlIIllllllIlIIlIIlllIllIllIIlIIlIlIllIlllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var3, true)
            );
         } catch (Exception var5) {
            String var7 = var3.f();
            short var10002 = 18620;
            short var10003 = 18712;
            var10003 = 18593;
            short var10004 = 28497;
            me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b(
               "Failed to register command for editor: " + var7 + ", error: " + var5
            );
            if (var1 != null) {
               break;
            }
         }
      }
   }

   private final List<Class<?>> e() {
      Object[] var2 = new Object[]{ArraysKt.toList(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)};
      Reflections var1 = new Reflections(var2);
      Set var10000 = var1.getTypesAnnotatedWith(lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI.class);
      short var10002 = 18566;
      short var10003 = -860;
      Intrinsics.checkNotNullExpressionValue(var10000, "getTypesAnnotatedWith(...)");
      return CollectionsKt.toList(var10000);
   }

   public final void a(@NotNull IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1) {
      // PX-FIX r61: the decompiler could not rebuild this method (310 lines of bytecode were left as a comment),
      // so it was an empty stub and the manager always logged "Commands initialized with 0 commands".
      // The list it feeds is the same List<Command> that b() counts and that the Fabric callback walks.
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(param1);
   }

   private final List<IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI> b(
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1
   ) {
      java.lang.Iterable<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var3 = param1.b();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = g();
      boolean var4 = var3 instanceof java.util.Collection && ((java.util.Collection<?>)var3).isEmpty();
      if (!var4) {
         var4 = true;
         for (java.lang.Object var5 : var3) {
            if (((me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll)var5).d()) {
               var4 = false;
               break;
            }
         }
      }
      if (var4) {
         return kotlin.collections.CollectionsKt.listOf(param1);
      }
      java.util.List<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var6 = param1.b();
      int var7 = 0;
      int var8 = -1;
      for (me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var9 : var6) {
         if (var9.d()) {
            var8 = var7;
            break;
         }
         var7++;
      }
      java.util.List<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var10 = kotlin.collections.CollectionsKt.take(param1.b(), var8);
      java.util.List<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var11 = kotlin.collections.CollectionsKt.drop(param1.b(), var8);
      java.util.List<me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI> var12 = new java.util.ArrayList<>();
      var12.add(new me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI(me.octo.client.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a(param1.a(), (java.lang.String)null, (java.lang.String)null, (java.util.List<java.lang.String>)null, 7, (java.lang.Object)null), var10, param1.c(), param1.d(), param1.e()));
      int var13 = 1;
      int var14 = var11.size();
      for (; var13 <= var14; var13++) {
         java.lang.Iterable<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var15 = kotlin.collections.CollectionsKt.take(var11, var13);
         java.util.Collection<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var16 = new java.util.ArrayList<>(kotlin.collections.CollectionsKt.collectionSizeOrDefault(var15, 10));
         for (me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var17 : var15) {
            var16.add(me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.a(var17, (java.lang.String)null, (me.octo.client.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)null, (me.octo.client.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII)null, false, 7, (java.lang.Object)null));
         }
         java.util.List<me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll> var18 = kotlin.collections.CollectionsKt.plus(var10, var16);
         var12.add(new me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI(me.octo.client.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a(param1.a(), (java.lang.String)null, (java.lang.String)null, (java.util.List<java.lang.String>)null, 7, (java.lang.Object)null), var18, param1.c(), param1.d(), param1.e()));
      }
      return var12;
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   @JNIC
   public final void a(@NotNull me.octo.client.events.impl.IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("event");
      } else {
         try {
            Class var2 = Class.forName("me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII");
            Object var3 = var2.getMethod("a").invoke(null);
            if (!(var3 instanceof Boolean) || !(Boolean)var3) {
               return;
            }

            Packet var4 = var1.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var4 == null) {
               return;
            }

            String var5 = var4.getClass().getName();
            if (var5.indexOf("Chat") < 0 && var5.indexOf("chat") < 0) {
               return;
            }

            String var6 = null;
            String[] var7 = new String[]{"message", "content", "chatMessage"};
            int var8 = 0;

            while (true) {
               if (var8 >= var7.length || var6 != null) {
                  if (var6 == null && var5.indexOf("Command") >= 0) {
                     try {
                        Method var12 = var4.getClass().getMethod("command");
                        Object var13 = var12.invoke(var4);
                        if (var13 != null) {
                           var6 = "/" + String.valueOf(var13);
                        }
                     } catch (Throwable var19) {
                     }
                  }
                  break;
               }

               try {
                  Method var9 = var4.getClass().getMethod(var7[var8]);
                  Object var10 = var9.invoke(var4);
                  if (var10 != null) {
                     var6 = String.valueOf(var10);
                  }
               } catch (Throwable var20) {
               }

               var8++;
            }

            if (var6 == null) {
               return;
            }

            var6 = var6.trim();
            if (var6.length() == 0) {
               return;
            }

            if (var6.startsWith("/") || var6.startsWith(".")) {
               return;
            }

            Object var15 = var2.getMethod("a", String.class).invoke(null, var6);
            if (var15 instanceof Boolean && (Boolean)var15) {
               var1.a(true);
            }
         } catch (Throwable var21) {
            Throwable var16 = var21;

            try {
               System.err.println("IRC packet redirect failed: " + var16);
            } catch (Throwable var18) {
            }
         }
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public final void a(@NotNull me.octo.client.events.impl.IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: sipush 18584
      // 004: sipush 25580
      // 007: pop2
      // 008: ldc_w "event"
      // 00b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 011: aload 1
      // 012: getfield me/octo/client/events/impl/IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/lang/String;
      // 015: dup
      // 016: sipush 18563
      // 019: sipush 18244
      // 01c: pop2
      // 01d: ldc "command"
      // 01f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 022: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 025: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 028: dup
      // 029: sipush 18678
      // 02c: sipush -22873
      // 02f: pop2
      // 030: ldc_w "toLowerCase(...)"
      // 033: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 036: astore 3
      // 037: astore 2
      // 038: aload 3
      // 039: sipush 18622
      // 03c: sipush 19939
      // 03f: pop2
      // 040: ldc_w "chat irc"
      // 043: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 046: aload 2
      // 047: ifnonnull 07e
      // 04a: ifeq 062
      // 04d: goto 054
      // 050: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: aload 1
      // 055: bipush 1
      // 056: invokevirtual me/octo/client/events/impl/IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.a (Z)V
      // 059: aload 0
      // 05a: invokespecial me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.f ()V
      // 05d: return
      // 05e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 061: athrow
      // 062: aload 3
      // 063: sipush 18588
      // 066: sipush 31366
      // 069: pop2
      // 06a: ldc_w "chat "
      // 06d: aload 2
      // 06e: ifnonnull 15c
      // 071: bipush 0
      // 072: bipush 2
      // 073: aconst_null
      // 074: invokestatic kotlin/text/StringsKt.startsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 077: goto 07e
      // 07a: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 07d: athrow
      // 07e: ifeq 157
      // 081: nop
      // 082: aload 3
      // 083: bipush 5
      // 084: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 087: dup
      // 088: sipush 18615
      // 08b: sipush 23345
      // 08e: pop2
      // 08f: ldc_w "substring(...)"
      // 092: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 095: checkcast java/lang/CharSequence
      // 098: invokestatic kotlin/text/StringsKt.trim (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
      // 09b: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 09e: astore 4
      // 0a0: bipush 10
      // 0a2: anewarray 38
      // 0a5: astore 5
      // 0a7: aload 5
      // 0a9: bipush 0
      // 0aa: sipush 18580
      // 0ad: sipush -27303
      // 0b0: pop2
      // 0b1: ldc_w "all"
      // 0b4: aastore
      // 0b5: aload 5
      // 0b7: bipush 1
      // 0b8: sipush 18591
      // 0bb: sipush -25753
      // 0be: pop2
      // 0bf: ldc_w "party"
      // 0c2: aastore
      // 0c3: aload 5
      // 0c5: bipush 2
      // 0c6: sipush 18585
      // 0c9: sipush 17865
      // 0cc: pop2
      // 0cd: ldc_w "guild"
      // 0d0: aastore
      // 0d1: aload 5
      // 0d3: bipush 3
      // 0d4: sipush 18562
      // 0d7: sipush -3022
      // 0da: pop2
      // 0db: ldc_w "officer"
      // 0de: aastore
      // 0df: aload 5
      // 0e1: bipush 4
      // 0e2: sipush 18598
      // 0e5: sipush 438
      // 0e8: pop2
      // 0e9: ldc_w "skyblock-coop"
      // 0ec: aastore
      // 0ed: aload 5
      // 0ef: bipush 5
      // 0f0: ldc_w "a"
      // 0f3: aastore
      // 0f4: aload 5
      // 0f6: bipush 6
      // 0f8: ldc_w "p"
      // 0fb: aastore
      // 0fc: aload 5
      // 0fe: bipush 7
      // 100: ldc_w "g"
      // 103: aastore
      // 104: aload 5
      // 106: bipush 8
      // 108: ldc_w "o"
      // 10b: aastore
      // 10c: aload 5
      // 10e: bipush 9
      // 110: sipush 18571
      // 113: sipush -31110
      // 116: pop2
      // 117: ldc_w "sbc"
      // 11a: aastore
      // 11b: aload 5
      // 11d: invokestatic kotlin/collections/CollectionsKt.listOf ([Ljava/lang/Object;)Ljava/util/List;
      // 120: aload 2
      // 121: ifnonnull 188
      // 124: aload 4
      // 126: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 12b: ifeq 157
      // 12e: goto 135
      // 131: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a ()Z
      // 138: aload 2
      // 139: ifnonnull 14e
      // 13c: goto 143
      // 13f: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: ifeq 157
      // 146: goto 14d
      // 149: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14c: athrow
      // 14d: bipush 0
      // 14e: invokestatic me/octo/client/utils/llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a (Z)V
      // 151: getstatic me/octo/client/lIIIlIllIIllIIlllIIIIIIlllIIIlIlIllIIllIlIIIIIllIlIllllIlIlIlIIllIIlIllIlIlIllllllIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll Lme/octo/client/lIIIlIllIIllIIlllIIIIIIlllIIIlIlIllIIllIlIIIIIllIlIllllIlIlIlIIllIIlIllIlIlIllllllIll;
      // 154: invokevirtual me/octo/client/lIIIlIllIIllIIlllIIIIIIlllIIIlIlIllIIllIlIIIIIllIlIllllIlIlIlIIllIIlIllIlIlIllllllIll.ag ()V
      // 157: aload 1
      // 158: getfield me/octo/client/events/impl/IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/lang/String;
      // 15b: dup
      // 15c: sipush 18563
      // 15f: sipush 18244
      // 162: pop2
      // 163: ldc "command"
      // 165: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 168: checkcast java/lang/CharSequence
      // 16b: bipush 1
      // 16c: anewarray 38
      // 16f: astore 5
      // 171: aload 5
      // 173: bipush 0
      // 174: ldc_w " "
      // 177: aastore
      // 178: aload 5
      // 17a: bipush 0
      // 17b: bipush 0
      // 17c: bipush 6
      // 17e: aconst_null
      // 17f: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
      // 182: bipush 0
      // 183: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 188: checkcast java/lang/String
      // 18b: astore 4
      // 18d: aload 0
      // 18e: aload 4
      // 190: invokespecial me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/String;)Lme/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
      // 193: astore 5
      // 195: aload 2
      // 196: ifnonnull 1b1
      // 199: aload 5
      // 19b: ifnull 207
      // 19e: goto 1a5
      // 1a1: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: aload 1
      // 1a6: bipush 1
      // 1a7: invokevirtual me/octo/client/events/impl/IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.a (Z)V
      // 1aa: goto 1b1
      // 1ad: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: aload 1
      // 1b2: getfield me/octo/client/events/impl/IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/lang/String;
      // 1b5: dup
      // 1b6: sipush 18563
      // 1b9: sipush 18244
      // 1bc: pop2
      // 1bd: ldc "command"
      // 1bf: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 1c2: checkcast java/lang/CharSequence
      // 1c5: bipush 1
      // 1c6: anewarray 38
      // 1c9: astore 7
      // 1cb: aload 7
      // 1cd: bipush 0
      // 1ce: ldc_w " "
      // 1d1: aastore
      // 1d2: aload 7
      // 1d4: bipush 0
      // 1d5: bipush 0
      // 1d6: bipush 6
      // 1d8: aconst_null
      // 1d9: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
      // 1dc: checkcast java/lang/Iterable
      // 1df: bipush 1
      // 1e0: invokestatic kotlin/collections/CollectionsKt.drop (Ljava/lang/Iterable;I)Ljava/util/List;
      // 1e3: checkcast java/util/Collection
      // 1e6: astore 7
      // 1e8: bipush 0
      // 1e9: istore 8
      // 1eb: aload 7
      // 1ed: astore 9
      // 1ef: aload 9
      // 1f1: bipush 0
      // 1f2: anewarray 38
      // 1f5: invokeinterface java/util/Collection.toArray ([Ljava/lang/Object;)[Ljava/lang/Object; 2
      // 1fa: checkcast [Ljava/lang/String;
      // 1fd: astore 6
      // 1ff: aload 0
      // 200: aload 4
      // 202: aload 6
      // 204: invokespecial me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/String;[Ljava/lang/String;)V
      // 207: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 20a: ifnonnull 21b
      // 20d: bipush 4
      // 20e: anewarray 276
      // 211: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.b ([Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;)V
      // 214: goto 21b
      // 217: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21a: athrow
      // 21b: return
   }

   private final void f() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = g();
      if (var1 != null) {
         if (me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aYou are already in IRC chat mode!");
         }
      } else {
         if (!me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.f()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cYou must connect to IRC first! Use §f/" + me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p() + " join");
            return;
         }
         if (me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a()) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aYou are already in IRC chat mode!");
            return;
         }
      }
      me.octo.client.utils.llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.a(true);
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§aYou are now chatting in: §fIRC");
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7All messages will now go to IRC. Use §f/chat all§7 to return to public chat.");
      me.octo.client.lIIIlIllIIllIIlllIIIIIIlllIIIlIlIllIIllIlIIIIIllIlIllllIlIlIlIIllIIlIllIlIlIllllllIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.ag();
   }

   private final void a(IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1, String[] param2) {
      // Restored from the original bytecode (0x000-0x31c): default executor, then
      // "Subcommand required" listing, then exact (name+arg count) match, then name-only
      // fallback with nested recursion / no-arg executor / wrong-argument message.
      if (param2.length == 0) {
         kotlin.jvm.functions.Function1 var20 = param1.e();
         if (var20 != null) {
            var20.invoke(new llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(param1, new Object[0], new String[0]));
            return;
         }

         java.util.List var6 = new java.util.ArrayList();
         for (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var11 : param1.c()) {
            var6.add(var11.a().a());
         }

         StringBuilder var7b = new StringBuilder();
         for (Object var12 : kotlin.collections.CollectionsKt.distinct((Iterable)var6)) {
            if (var7b.length() > 0) {
               var7b.append(", ");
            }
            var7b.append(var12);
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7cSubcommand required \u00a77(" + var7b.toString() + ")");
         return;
      }

      String var4 = param2[0];
      String[] var5 = (String[])((java.util.List)kotlin.collections.ArraysKt.drop(param2, 1)).toArray(new String[0]);

      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var6 = null;
      for (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var11 : param1.c()) {
         if (this.a(var11, var4, true) && var11.b().size() == var5.length) {
            var6 = var11;
            break;
         }
      }

      if (var6 != null) {
         this.b(var6, var5);
         return;
      }

      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var7 = null;
      for (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var12 : param1.c()) {
         if (this.a(var12, var4, true)) {
            var7 = var12;
            break;
         }
      }

      if (var7 == null) {
         kotlin.jvm.functions.Function1 var8 = param1.e();
         if (var8 != null) {
            var8.invoke(new llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(param1, new Object[0], param2));
            return;
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7cUnknown subcommand: \u00a7f" + var4);
         return;
      }

      if (!var7.c().isEmpty()) {
         this.a(var7, var5);
         return;
      }

      if (var7.b().isEmpty()) {
         kotlin.jvm.functions.Function1 var13 = var7.d();
         if (var13 != null) {
            var13.invoke(new llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(var7, new Object[0], var5));
            return;
         }
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("\u00a7cWrong number of arguments for \u00a7f" + var7.a().a() + "\u00a7c. Expected " + var7.b().size() + ", got " + var5.length);
   }

   private final void b(IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1, String[] param2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = g();
      if (param1.d() == null) {
         return;
      }

      kotlin.jvm.functions.Function1 var4 = param1.d();
      if (param2.length != param1.b().size()) {
         me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var5 =
            this.a(param1, param2.length);
         if (var5 != null) {
            this.b(var5, param2);
            return;
         }
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "\u00a7cExpected " + param1.b().size() + " arguments, got " + param2.length);
         return;
      }
      java.util.List var5 = new java.util.ArrayList();
      for (int var6 = 0; var6 < param1.b().size(); var6++) {
         me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var8 =
            (me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll) param1.b().get(var6);
         String var9 = param2[var6];
         if (!var8.b().b(var9)) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "\u00a7cInvalid argument '\u00a7f" + var9 + "\u00a7c' for \u00a7f" + var8.a());
            return;
         }
         var5.add(var8.b().a(var9));
      }
      var4.invoke(new me.octo.client.llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII(
         param1, var5.toArray(new java.lang.Object[0]), param2));
      return;
   }

   private final IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a(
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1, int param2
   ) {
      for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var8 : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         if (kotlin.text.StringsKt.equals(var8.a().a(), param1.a().a(), true) && var8.b().size() == param2 && var8.d() != null) {
            return var8;
         }
      }
      return null;
   }

   private final IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a(String param1) {
      String var2 = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p();
      if (StringsKt.equals(param1, var2, true) && !StringsKt.isBlank(var2)) {
         for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var4 : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            if (StringsKt.equals(var4.a().a(), "irc", true)) {
               return var4;
            }
         }
      } else {
         for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var4 : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            if (this.a(var4, param1, true)) {
               return var4;
            }
         }
      }

      return null;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: getstatic me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl;
      // 06: invokevirtual me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.p ()Ljava/lang/String;
      // 09: astore 3
      // 0a: astore 2
      // 0b: aload 1
      // 0c: aload 3
      // 0d: bipush 1
      // 0e: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 11: aload 2
      // 12: ifnonnull 2d
      // 15: ifeq 9c
      // 18: goto 1f
      // 1b: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e: athrow
      // 1f: aload 3
      // 20: checkcast java/lang/CharSequence
      // 23: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 26: goto 2d
      // 29: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c: athrow
      // 2d: aload 2
      // 2e: ifnonnull 3c
      // 31: ifne 3f
      // 34: goto 3b
      // 37: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a: athrow
      // 3b: bipush 1
      // 3c: goto 40
      // 3f: bipush 0
      // 40: ifeq 9c
      // 43: aload 0
      // 44: getfield me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/util/List;
      // 47: checkcast java/lang/Iterable
      // 4a: astore 4
      // 4c: bipush 0
      // 4d: istore 5
      // 4f: aload 4
      // 51: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 56: astore 6
      // 58: aload 6
      // 5a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5f: ifeq 97
      // 62: aload 6
      // 64: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 69: astore 7
      // 6b: aload 7
      // 6d: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 70: astore 8
      // 72: bipush 0
      // 73: istore 9
      // 75: aload 8
      // 77: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 7a: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 7d: sipush 18619
      // 80: sipush -12721
      // 83: pop2
      // 84: ldc_w "irc"
      // 87: bipush 1
      // 88: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 8b: ifeq 58
      // 8e: aload 7
      // 90: aload 2
      // 91: ifnonnull 6d
      // 94: goto 98
      // 97: aconst_null
      // 98: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 9b: areturn
      // 9c: aload 0
      // 9d: getfield me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/util/List;
      // a0: checkcast java/lang/Iterable
      // a3: astore 4
      // a5: bipush 0
      // a6: istore 5
      // a8: aload 4
      // aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // af: astore 6
      // b1: aload 6
      // b3: invokeinterface java/util/Iterator.hasNext ()Z 1
      // b8: ifeq e2
      // bb: aload 6
      // bd: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // c2: astore 7
      // c4: aload 7
      // c6: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // c9: astore 8
      // cb: bipush 0
      // cc: istore 9
      // ce: aload 0
      // cf: aload 8
      // d1: aload 1
      // d2: bipush 1
      // d3: invokespecial me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Lme/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;Ljava/lang/String;Z)Z
      // d6: ifeq b1
      // d9: aload 7
      // db: aload 2
      // dc: ifnonnull c6
      // df: goto e3
      // e2: aconst_null
      // e3: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // e6: areturn
   }

   private final boolean a(IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI param1, String param2, boolean param3) {
      String var5 = param1.a().a();
      List var6 = param1.a().c();
      if (param3) {
         if (kotlin.text.StringsKt.equals(var5, param2, true)) {
            return true;
         }
         for (Object var10 : var6) {
            String var11 = (String)var10;
            if (kotlin.text.StringsKt.equals(var11, param2, true)) {
               return true;
            }
         }
         return false;
      } else {
         if (kotlin.text.StringsKt.startsWith(var5, param2, true)) {
            return true;
         }
         for (Object var10 : var6) {
            String var11 = (String)var10;
            if (kotlin.text.StringsKt.startsWith(var11, param2, true)) {
               return true;
            }
         }
         return false;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 004: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 007: astore 5
      // 009: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 00c: aload 1
      // 00d: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 010: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.c ()Ljava/util/List;
      // 013: astore 6
      // 015: astore 4
      // 017: iload 3
      // 018: aload 4
      // 01a: ifnonnull 0ce
      // 01d: ifeq 0c7
      // 020: goto 027
      // 023: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 026: athrow
      // 027: aload 5
      // 029: aload 2
      // 02a: bipush 1
      // 02b: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 02e: aload 4
      // 030: ifnonnull 045
      // 033: goto 03a
      // 036: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 039: athrow
      // 03a: ifeq 046
      // 03d: goto 044
      // 040: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 043: athrow
      // 044: bipush 1
      // 045: ireturn
      // 046: aload 6
      // 048: checkcast java/lang/Iterable
      // 04b: astore 7
      // 04d: bipush 0
      // 04e: istore 8
      // 050: aload 7
      // 052: aload 4
      // 054: ifnonnull 08e
      // 057: instanceof java/util/Collection
      // 05a: ifeq 08c
      // 05d: goto 064
      // 060: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 063: athrow
      // 064: aload 7
      // 066: checkcast java/util/Collection
      // 069: aload 4
      // 06b: ifnonnull 08e
      // 06e: goto 075
      // 071: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 074: athrow
      // 075: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 07a: ifeq 08c
      // 07d: goto 084
      // 080: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: bipush 0
      // 085: goto 0c6
      // 088: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08b: athrow
      // 08c: aload 7
      // 08e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 093: astore 9
      // 095: aload 9
      // 097: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09c: ifeq 0c5
      // 09f: aload 9
      // 0a1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a6: astore 10
      // 0a8: aload 10
      // 0aa: checkcast java/lang/String
      // 0ad: astore 11
      // 0af: bipush 0
      // 0b0: istore 12
      // 0b2: aload 11
      // 0b4: aload 2
      // 0b5: bipush 1
      // 0b6: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 0b9: ifeq 095
      // 0bc: bipush 1
      // 0bd: aload 4
      // 0bf: ifnonnull 0b9
      // 0c2: goto 0c6
      // 0c5: bipush 0
      // 0c6: ireturn
      // 0c7: aload 5
      // 0c9: aload 2
      // 0ca: bipush 1
      // 0cb: invokestatic kotlin/text/StringsKt.startsWith (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 0ce: aload 4
      // 0d0: ifnonnull 0de
      // 0d3: ifeq 0df
      // 0d6: goto 0dd
      // 0d9: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0dc: athrow
      // 0dd: bipush 1
      // 0de: ireturn
      // 0df: aload 6
      // 0e1: checkcast java/lang/Iterable
      // 0e4: astore 7
      // 0e6: bipush 0
      // 0e7: istore 8
      // 0e9: aload 7
      // 0eb: aload 4
      // 0ed: ifnonnull 127
      // 0f0: instanceof java/util/Collection
      // 0f3: ifeq 125
      // 0f6: goto 0fd
      // 0f9: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fc: athrow
      // 0fd: aload 7
      // 0ff: checkcast java/util/Collection
      // 102: aload 4
      // 104: ifnonnull 127
      // 107: goto 10e
      // 10a: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 10d: athrow
      // 10e: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 113: ifeq 125
      // 116: goto 11d
      // 119: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11c: athrow
      // 11d: bipush 0
      // 11e: goto 15f
      // 121: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 124: athrow
      // 125: aload 7
      // 127: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 12c: astore 9
      // 12e: aload 9
      // 130: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 135: ifeq 15e
      // 138: aload 9
      // 13a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 13f: astore 10
      // 141: aload 10
      // 143: checkcast java/lang/String
      // 146: astore 11
      // 148: bipush 0
      // 149: istore 12
      // 14b: aload 11
      // 14d: aload 2
      // 14e: bipush 1
      // 14f: invokestatic kotlin/text/StringsKt.startsWith (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 152: ifeq 12e
      // 155: bipush 1
      // 156: aload 4
      // 158: ifnonnull 152
      // 15b: goto 15f
      // 15e: bipush 0
      // 15f: ireturn
   }

   private final void a(CommandDispatcher<FabricClientCommandSource> var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = g();
      Iterable var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var5 = false;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      HashSet var6 = new HashSet();
      ArrayList var7 = new ArrayList();

      for (Object var9 : var4) {
         IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var10 = (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI)var9;
         boolean var11 = false;
         String var20 = var10.a().a();

         label56: {
            try {
               boolean var22 = var6.add(var20);
               if (var2 != null) {
                  break label56;
               }

               if (!var22) {
                  continue;
               }
            } catch (RuntimeException var13) {
               throw (RuntimeException)a(var13);
            }

            var7.add(var9);
         }

         if (var2 != null) {
            break;
         }
      }

      List var3 = var7;

      label44:
      for (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var15 :(java.util.List<IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI>)(Object)var3) {
         List var16 = CollectionsKt.plus(CollectionsKt.listOf(var15.a().a()), var15.a().c());

         while (true) {
            Iterator var17 = var16.iterator();

            while (true) {
               if (!var17.hasNext()) {
                  continue label44;
               }

               String var18 = (String)var17.next();
               short var23 = 18581;
               LiteralArgumentBuilder var19 = LiteralArgumentBuilder.literal(var18);
               short var10001 = -18028;
               var var21 = (RequiredArgumentBuilder)RequiredArgumentBuilder.argument("args", (ArgumentType)StringArgumentType.greedyString()).executes((Command)(var1x -> a(this, var18, var1x)));
               var19.executes((Command)(var1x -> b(this, var18, var1x)));
               var19.then((ArgumentBuilder)var21);
               var1.register(var19);
               if (var2 != null) {
                  break;
               }

               try {
                  if (var2 != null) {
                     return;
                  }

                  if (var2 != null) {
                     break label44;
                  }
               } catch (RuntimeException var12) {
                  throw (RuntimeException)a(var12);
               }
            }
         }
      }

      int var24 = var3.size();
      short var25 = 18617;
      short var10002 = -20562;
      var10002 = 18595;
      short var10003 = -18584;
      me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
         "Registered " + var24 + " commands with Brigadier"
      );
   }

   private final void a(String param1, String[] param2) {
      me.octo.client.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g();
      me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var4 = null;

      try {
         var4 = this.a(param1);

         if (var4 == null) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cUnknown command. Use §e.help §cfor a list of commands.");
            return;
         }

         // Original bytecode 48-106: flag = !children.isEmpty(); if (flag) -> a(child,args)
         // (subcommand dispatch), else -> b(child,args) (execute). The previous source had
         // these two branches swapped, so every command with subcommands went to the executor
         // path and did nothing when d() was null.
         if (var4.c().isEmpty()) {
            this.b(var4, param2);
         } else {
            this.a(var4, param2);
         }
      } catch (Exception var5) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error executing command '" + var4.a().a() + "':" + var5);
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§cError: " + var5.getMessage());
      }
   }

    public static final CompletableFuture<Suggestions> a(IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var0, String var1, int var2) {
       return var0.a(var1, var2);
    }

   private final CompletableFuture<Suggestions> a(String param1, int param2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = g();

      try {
         if (param2 < 1 || param1.length() == 0) {
            return Suggestions.empty();
         }

         List<String> parts = new ArrayList<String>(java.util.Arrays.asList(param1.split(" ", -1)));
         char firstChar = param1.charAt(0);
         String name = parts.isEmpty() ? "" : ((String)parts.get(0)).substring(1);
         int idx = 0;
         int pos = 0;

         for (int i = 0; i < parts.size(); i++) {
            if (param2 >= pos && param2 <= pos + ((String)parts.get(i)).length()) {
               idx = i;
               break;
            }

            pos = pos + (((String)parts.get(i)).length() + 1);
         }

         if (param1.endsWith(" ") && param2 == param1.length()) {
            idx = parts.size();
         }

         String token = idx < parts.size() ? (String)parts.get(idx) : "";
         int start = 0;

         for (int j = 0; j < kotlin.ranges.RangesKt.coerceAtMost(idx, parts.size()); j++) {
            start += ((String)parts.get(j)).length() + 1;
         }

         if (idx == 0) {
            start = 1;
         }

         start = kotlin.ranges.RangesKt.coerceAtMost(start, param1.length());
         com.mojang.brigadier.suggestion.SuggestionsBuilder builder = new com.mojang.brigadier.suggestion.SuggestionsBuilder(param1, start);
         if (idx == 0) {
            String prefix = me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.p();
            if (!StringsKt.isBlank(prefix) && StringsKt.startsWith(prefix, name, true)) {
               builder.suggest(prefix);
            }

            for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI verb : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               if (StringsKt.startsWith(verb.a().a(), name, true)) {
                  builder.suggest(verb.a().a());
               }

               for (String alias : verb.a().c()) {
                  if (StringsKt.startsWith(alias, name, true)) {
                     builder.suggest(alias);
                  }
               }
            }

            return builder.buildFuture();
         }

         me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI command = this.a(name);
         if (command == null) {
            return Suggestions.empty();
         }

         if (!command.c().isEmpty()) {
            if (idx == 1) {
               String filter = parts.size() > 1 ? (String)parts.get(1) : "";
               List<String> names = new ArrayList<String>();

               for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI sub : command.c()) {
                  names.add(sub.a().a());
               }

               for (Object candidate : kotlin.collections.CollectionsKt.distinct(names)) {
                  if (StringsKt.startsWith((String)candidate, filter, true)) {
                     builder.suggest((String)candidate);
                  }
               }

               return builder.buildFuture();
            }

            if (idx > 1) {
               String filter = parts.size() > 1 ? (String)parts.get(1) : "";
               me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI best = null;
               int bestSize = -1;

               for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI sub : command.c()) {
                  if (StringsKt.equals(sub.a().a(), filter, true)) {
                     int size = sub.b().size();
                     if (size > bestSize) {
                        best = sub;
                        bestSize = size;
                     }
                  }
               }

               if (best == null) {
                  return Suggestions.empty();
               }

               int argIndex = idx - 2;
               if (argIndex < best.b().size()) {
                  me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll arg = best.b().get(argIndex);
                  me.octo.client.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII provider = arg.c();
                  if (provider != null) {
                     for (String suggestion : provider.a(token.toLowerCase(java.util.Locale.ROOT))) {
                        builder.suggest(suggestion);
                     }
                  }
               }
            }

            return builder.buildFuture();
         }

         int argIndex = idx - 1;
         me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI best = null;
         int bestSize = -1;

         for (me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI sub : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            if (StringsKt.equals(sub.a().a(), name, true)) {
               int size = sub.b().size();
               if (size > bestSize) {
                  best = sub;
                  bestSize = size;
               }
            }
         }

         me.octo.client.IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI target = best != null ? best : command;
         if (argIndex < target.b().size()) {
            me.octo.client.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll arg = target.b().get(argIndex);
            me.octo.client.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII provider = arg.c();
            if (provider != null) {
               for (String suggestion : provider.a(token.toLowerCase(java.util.Locale.ROOT))) {
                  builder.suggest(suggestion);
               }
            }
         }

         return builder.buildFuture();
      } catch (java.lang.Exception e) {
         me.octo.client.utils.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Error in completeSuggestionsImpl: " + e);
         e.printStackTrace();
         return Suggestions.empty();
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.code.cfg.ExceptionRangeCFG.isCircular()" because "range" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.graphToStatement(DomHelper.java:84)
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:203)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: astore 3
      // 004: nop
      // 005: iload 2
      // 006: aload 3
      // 007: ifnonnull 025
      // 00a: bipush 1
      // 00b: if_icmplt 03b
      // 00e: goto 015
      // 011: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 014: athrow
      // 015: aload 1
      // 016: checkcast java/lang/CharSequence
      // 019: invokeinterface java/lang/CharSequence.length ()I 1
      // 01e: goto 025
      // 021: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: aload 3
      // 026: ifnonnull 034
      // 029: ifne 037
      // 02c: goto 033
      // 02f: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: bipush 1
      // 034: goto 038
      // 037: bipush 0
      // 038: ifeq 051
      // 03b: invokestatic com/mojang/brigadier/suggestion/Suggestions.empty ()Ljava/util/concurrent/CompletableFuture;
      // 03e: dup
      // 03f: sipush 18676
      // 042: sipush 25339
      // 045: pop2
      // 046: ldc_w "empty(...)"
      // 049: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 04c: areturn
      // 04d: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 050: athrow
      // 051: aload 1
      // 052: checkcast java/lang/CharSequence
      // 055: bipush 1
      // 056: anewarray 38
      // 059: astore 5
      // 05b: aload 5
      // 05d: bipush 0
      // 05e: ldc_w " "
      // 061: aastore
      // 062: aload 5
      // 064: bipush 0
      // 065: bipush 0
      // 066: bipush 6
      // 068: aconst_null
      // 069: invokestatic kotlin/text/StringsKt.split$default (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
      // 06c: astore 4
      // 06e: aload 1
      // 06f: bipush 0
      // 070: invokevirtual java/lang/String.charAt (I)C
      // 073: istore 5
      // 075: aload 4
      // 077: checkcast java/util/Collection
      // 07a: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 07f: aload 3
      // 080: ifnonnull 08e
      // 083: ifne 091
      // 086: goto 08d
      // 089: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08c: athrow
      // 08d: bipush 1
      // 08e: goto 092
      // 091: bipush 0
      // 092: ifeq 0b9
      // 095: aload 4
      // 097: bipush 0
      // 098: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 09d: checkcast java/lang/String
      // 0a0: bipush 1
      // 0a1: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0a4: dup
      // 0a5: sipush 18615
      // 0a8: sipush 23345
      // 0ab: pop2
      // 0ac: ldc_w "substring(...)"
      // 0af: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0b2: goto 0bc
      // 0b5: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: ldc_w ""
      // 0bc: astore 6
      // 0be: bipush 0
      // 0bf: istore 7
      // 0c1: bipush 0
      // 0c2: istore 8
      // 0c4: bipush 0
      // 0c5: istore 9
      // 0c7: aload 4
      // 0c9: checkcast java/util/Collection
      // 0cc: invokeinterface java/util/Collection.size ()I 1
      // 0d1: istore 10
      // 0d3: iload 9
      // 0d5: iload 10
      // 0d7: if_icmpge 14a
      // 0da: iload 2
      // 0db: iload 8
      // 0dd: aload 3
      // 0de: ifnonnull 18e
      // 0e1: aload 3
      // 0e2: ifnonnull 140
      // 0e5: goto 0ec
      // 0e8: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0eb: athrow
      // 0ec: if_icmplt 126
      // 0ef: goto 0f6
      // 0f2: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f5: athrow
      // 0f6: iload 2
      // 0f7: iload 8
      // 0f9: aload 4
      // 0fb: iload 9
      // 0fd: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 102: checkcast java/lang/String
      // 105: invokevirtual java/lang/String.length ()I
      // 108: iadd
      // 109: aload 3
      // 10a: ifnonnull 140
      // 10d: goto 114
      // 110: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 113: athrow
      // 114: if_icmpgt 126
      // 117: goto 11e
      // 11a: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11d: athrow
      // 11e: iload 9
      // 120: istore 7
      // 122: aload 3
      // 123: ifnull 14a
      // 126: iload 8
      // 128: aload 4
      // 12a: iload 9
      // 12c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 131: checkcast java/lang/String
      // 134: invokevirtual java/lang/String.length ()I
      // 137: bipush 1
      // 138: iadd
      // 139: goto 140
      // 13c: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 13f: athrow
      // 140: iadd
      // 141: istore 8
      // 143: iinc 9 1
      // 146: aload 3
      // 147: ifnull 0d3
      // 14a: aload 1
      // 14b: ldc_w " "
      // 14e: bipush 0
      // 14f: bipush 2
      // 150: aconst_null
      // 151: invokestatic kotlin/text/StringsKt.endsWith$default (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
      // 154: aload 3
      // 155: ifnonnull 187
      // 158: ifeq 185
      // 15b: goto 162
      // 15e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 161: athrow
      // 162: iload 2
      // 163: aload 1
      // 164: invokevirtual java/lang/String.length ()I
      // 167: aload 3
      // 168: ifnonnull 18e
      // 16b: goto 172
      // 16e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 171: athrow
      // 172: if_icmpne 185
      // 175: goto 17c
      // 178: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17b: athrow
      // 17c: aload 4
      // 17e: invokeinterface java/util/List.size ()I 1
      // 183: istore 7
      // 185: iload 7
      // 187: aload 4
      // 189: invokeinterface java/util/List.size ()I 1
      // 18e: if_icmpge 1a4
      // 191: aload 4
      // 193: iload 7
      // 195: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 19a: checkcast java/lang/String
      // 19d: goto 1a7
      // 1a0: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a3: athrow
      // 1a4: ldc_w ""
      // 1a7: astore 9
      // 1a9: bipush 0
      // 1aa: istore 10
      // 1ac: bipush 0
      // 1ad: istore 11
      // 1af: iload 7
      // 1b1: aload 4
      // 1b3: invokeinterface java/util/List.size ()I 1
      // 1b8: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
      // 1bb: istore 12
      // 1bd: iload 11
      // 1bf: iload 12
      // 1c1: if_icmpge 1ec
      // 1c4: iload 10
      // 1c6: aload 4
      // 1c8: iload 11
      // 1ca: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1cf: checkcast java/lang/String
      // 1d2: invokevirtual java/lang/String.length ()I
      // 1d5: bipush 1
      // 1d6: iadd
      // 1d7: iadd
      // 1d8: istore 10
      // 1da: iinc 11 1
      // 1dd: aload 3
      // 1de: ifnonnull 20a
      // 1e1: aload 3
      // 1e2: ifnull 1bd
      // 1e5: goto 1ec
      // 1e8: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1eb: athrow
      // 1ec: iload 7
      // 1ee: aload 3
      // 1ef: ifnonnull 208
      // 1f2: ifne 1ff
      // 1f5: goto 1fc
      // 1f8: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fb: athrow
      // 1fc: bipush 1
      // 1fd: istore 10
      // 1ff: iload 10
      // 201: aload 1
      // 202: invokevirtual java/lang/String.length ()I
      // 205: invokestatic kotlin/ranges/RangesKt.coerceAtMost (II)I
      // 208: istore 10
      // 20a: new com/mojang/brigadier/suggestion/SuggestionsBuilder
      // 20d: dup
      // 20e: aload 1
      // 20f: iload 10
      // 211: invokespecial com/mojang/brigadier/suggestion/SuggestionsBuilder.<init> (Ljava/lang/String;I)V
      // 214: astore 11
      // 216: iload 7
      // 218: ifne 351
      // 21b: getstatic me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl;
      // 21e: invokevirtual me/octo/client/llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.p ()Ljava/lang/String;
      // 221: astore 12
      // 223: aload 12
      // 225: checkcast java/lang/CharSequence
      // 228: invokestatic kotlin/text/StringsKt.isBlank (Ljava/lang/CharSequence;)Z
      // 22b: aload 3
      // 22c: ifnonnull 23a
      // 22f: ifne 23d
      // 232: goto 239
      // 235: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 238: athrow
      // 239: bipush 1
      // 23a: goto 23e
      // 23d: bipush 0
      // 23e: ifeq 262
      // 241: aload 12
      // 243: aload 6
      // 245: bipush 1
      // 246: invokestatic kotlin/text/StringsKt.startsWith (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 249: ifeq 262
      // 24c: goto 253
      // 24f: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 252: athrow
      // 253: aload 11
      // 255: aload 12
      // 257: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest (Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
      // 25a: pop
      // 25b: goto 262
      // 25e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: aload 0
      // 263: getfield me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/util/List;
      // 266: checkcast java/lang/Iterable
      // 269: astore 13
      // 26b: bipush 0
      // 26c: istore 14
      // 26e: aload 13
      // 270: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 275: astore 15
      // 277: aload 15
      // 279: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 27e: ifeq 33c
      // 281: aload 15
      // 283: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 288: astore 16
      // 28a: aload 16
      // 28c: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 28f: astore 17
      // 291: bipush 0
      // 292: istore 18
      // 294: aload 3
      // 295: ifnonnull 33d
      // 298: aload 17
      // 29a: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 29d: aload 3
      // 29e: ifnonnull 2d5
      // 2a1: goto 2a8
      // 2a4: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a7: athrow
      // 2a8: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 2ab: aload 6
      // 2ad: bipush 1
      // 2ae: invokestatic kotlin/text/StringsKt.startsWith (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 2b1: ifeq 2d0
      // 2b4: goto 2bb
      // 2b7: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ba: athrow
      // 2bb: aload 11
      // 2bd: aload 17
      // 2bf: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 2c2: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 2c5: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest (Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
      // 2c8: pop
      // 2c9: goto 2d0
      // 2cc: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: aload 17
      // 2d2: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 2d5: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.c ()Ljava/util/List;
      // 2d8: checkcast java/lang/Iterable
      // 2db: astore 19
      // 2dd: bipush 0
      // 2de: istore 20
      // 2e0: aload 19
      // 2e2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 2e7: astore 21
      // 2e9: aload 21
      // 2eb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2f0: ifeq 335
      // 2f3: aload 21
      // 2f5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2fa: astore 22
      // 2fc: aload 22
      // 2fe: checkcast java/lang/String
      // 301: astore 23
      // 303: bipush 0
      // 304: istore 24
      // 306: aload 3
      // 307: ifnonnull 331
      // 30a: aload 23
      // 30c: aload 6
      // 30e: bipush 1
      // 30f: invokestatic kotlin/text/StringsKt.startsWith (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 312: aload 3
      // 313: ifnonnull 27e
      // 316: goto 31d
      // 319: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: ifeq 32f
      // 320: aload 11
      // 322: aload 23
      // 324: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest (Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
      // 327: pop
      // 328: goto 32f
      // 32b: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 32e: athrow
      // 32f: nop
      // 330: nop
      // 331: aload 3
      // 332: ifnull 2e9
      // 335: nop
      // 336: nop
      // 337: nop
      // 338: aload 3
      // 339: ifnull 277
      // 33c: nop
      // 33d: aload 11
      // 33f: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.buildFuture ()Ljava/util/concurrent/CompletableFuture;
      // 342: dup
      // 343: sipush 18576
      // 346: sipush -6858
      // 349: pop2
      // 34a: ldc_w "buildFuture(...)"
      // 34d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 350: areturn
      // 351: aload 0
      // 352: aload 6
      // 354: invokespecial me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/String;)Lme/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI;
      // 357: dup
      // 358: ifnonnull 372
      // 35b: pop
      // 35c: invokestatic com/mojang/brigadier/suggestion/Suggestions.empty ()Ljava/util/concurrent/CompletableFuture;
      // 35f: dup
      // 360: sipush 18560
      // 363: sipush -16969
      // 366: pop2
      // 367: ldc_w "empty(...)"
      // 36a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 36d: areturn
      // 36e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 371: athrow
      // 372: astore 12
      // 374: aload 12
      // 376: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.c ()Ljava/util/List;
      // 379: checkcast java/util/Collection
      // 37c: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 381: aload 3
      // 382: ifnonnull 390
      // 385: ifne 393
      // 388: goto 38f
      // 38b: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38e: athrow
      // 38f: bipush 1
      // 390: goto 394
      // 393: bipush 0
      // 394: ifeq 78c
      // 397: iload 7
      // 399: bipush 1
      // 39a: aload 3
      // 39b: ifnonnull 53a
      // 39e: goto 3a5
      // 3a1: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a4: athrow
      // 3a5: if_icmpne 537
      // 3a8: goto 3af
      // 3ab: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ae: athrow
      // 3af: aload 4
      // 3b1: aload 3
      // 3b2: ifnonnull 3db
      // 3b5: goto 3bc
      // 3b8: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3bb: athrow
      // 3bc: invokeinterface java/util/List.size ()I 1
      // 3c1: bipush 1
      // 3c2: if_icmple 3e1
      // 3c5: goto 3cc
      // 3c8: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3cb: athrow
      // 3cc: aload 4
      // 3ce: bipush 1
      // 3cf: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3d4: goto 3db
      // 3d7: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3da: athrow
      // 3db: checkcast java/lang/String
      // 3de: goto 3e4
      // 3e1: ldc_w ""
      // 3e4: astore 13
      // 3e6: aload 12
      // 3e8: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.c ()Ljava/util/List;
      // 3eb: checkcast java/lang/Iterable
      // 3ee: astore 14
      // 3f0: nop
      // 3f1: bipush 0
      // 3f2: istore 15
      // 3f4: aload 14
      // 3f6: astore 16
      // 3f8: new java/util/ArrayList
      // 3fb: dup
      // 3fc: aload 14
      // 3fe: bipush 10
      // 400: invokestatic kotlin/collections/CollectionsKt.collectionSizeOrDefault (Ljava/lang/Iterable;I)I
      // 403: invokespecial java/util/ArrayList.<init> (I)V
      // 406: checkcast java/util/Collection
      // 409: astore 17
      // 40b: bipush 0
      // 40c: istore 18
      // 40e: aload 16
      // 410: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 415: astore 19
      // 417: aload 19
      // 419: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 41e: ifeq 458
      // 421: aload 19
      // 423: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 428: astore 20
      // 42a: aload 17
      // 42c: aload 20
      // 42e: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 431: astore 21
      // 433: astore 28
      // 435: bipush 0
      // 436: istore 22
      // 438: aload 21
      // 43a: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 43d: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 440: aload 28
      // 442: swap
      // 443: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 448: pop
      // 449: aload 3
      // 44a: ifnonnull 480
      // 44d: aload 3
      // 44e: ifnull 417
      // 451: goto 458
      // 454: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 457: athrow
      // 458: aload 17
      // 45a: checkcast java/util/List
      // 45d: nop
      // 45e: checkcast java/lang/Iterable
      // 461: invokestatic kotlin/collections/CollectionsKt.distinct (Ljava/lang/Iterable;)Ljava/util/List;
      // 464: checkcast java/lang/Iterable
      // 467: astore 14
      // 469: nop
      // 46a: bipush 0
      // 46b: istore 15
      // 46d: aload 14
      // 46f: astore 16
      // 471: new java/util/ArrayList
      // 474: dup
      // 475: invokespecial java/util/ArrayList.<init> ()V
      // 478: checkcast java/util/Collection
      // 47b: astore 17
      // 47d: bipush 0
      // 47e: istore 18
      // 480: aload 16
      // 482: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 487: astore 19
      // 489: aload 19
      // 48b: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 490: ifeq 4d5
      // 493: aload 19
      // 495: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49a: astore 20
      // 49c: aload 20
      // 49e: checkcast java/lang/String
      // 4a1: astore 21
      // 4a3: bipush 0
      // 4a4: istore 22
      // 4a6: aload 21
      // 4a8: aload 13
      // 4aa: bipush 1
      // 4ab: invokestatic kotlin/text/StringsKt.startsWith (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 4ae: aload 3
      // 4af: ifnonnull 4e2
      // 4b2: aload 3
      // 4b3: ifnonnull 4d0
      // 4b6: goto 4bd
      // 4b9: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4bc: athrow
      // 4bd: ifeq 489
      // 4c0: goto 4c7
      // 4c3: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c6: athrow
      // 4c7: aload 17
      // 4c9: aload 20
      // 4cb: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 4d0: pop
      // 4d1: aload 3
      // 4d2: ifnull 489
      // 4d5: aload 17
      // 4d7: checkcast java/util/List
      // 4da: nop
      // 4db: checkcast java/lang/Iterable
      // 4de: astore 14
      // 4e0: nop
      // 4e1: bipush 0
      // 4e2: istore 15
      // 4e4: aload 14
      // 4e6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 4eb: astore 16
      // 4ed: aload 16
      // 4ef: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4f4: ifeq 522
      // 4f7: aload 16
      // 4f9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4fe: astore 17
      // 500: aload 17
      // 502: checkcast java/lang/String
      // 505: astore 18
      // 507: bipush 0
      // 508: istore 19
      // 50a: aload 11
      // 50c: aload 18
      // 50e: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest (Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
      // 511: pop
      // 512: nop
      // 513: aload 3
      // 514: ifnonnull 523
      // 517: aload 3
      // 518: ifnull 4ed
      // 51b: goto 522
      // 51e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 521: athrow
      // 522: nop
      // 523: aload 11
      // 525: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.buildFuture ()Ljava/util/concurrent/CompletableFuture;
      // 528: dup
      // 529: sipush 18616
      // 52c: sipush -32464
      // 52f: pop2
      // 530: ldc_w "buildFuture(...)"
      // 533: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 536: areturn
      // 537: iload 7
      // 539: bipush 1
      // 53a: aload 3
      // 53b: ifnonnull 562
      // 53e: if_icmple 98b
      // 541: goto 548
      // 544: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 547: athrow
      // 548: aload 4
      // 54a: aload 3
      // 54b: ifnonnull 574
      // 54e: goto 555
      // 551: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 554: athrow
      // 555: invokeinterface java/util/List.size ()I 1
      // 55a: bipush 1
      // 55b: goto 562
      // 55e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 561: athrow
      // 562: if_icmple 57a
      // 565: aload 4
      // 567: bipush 1
      // 568: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 56d: goto 574
      // 570: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 573: athrow
      // 574: checkcast java/lang/String
      // 577: goto 57d
      // 57a: ldc_w ""
      // 57d: astore 13
      // 57f: aload 12
      // 581: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.c ()Ljava/util/List;
      // 584: checkcast java/lang/Iterable
      // 587: astore 16
      // 589: nop
      // 58a: bipush 0
      // 58b: istore 17
      // 58d: aload 16
      // 58f: astore 18
      // 591: new java/util/ArrayList
      // 594: dup
      // 595: invokespecial java/util/ArrayList.<init> ()V
      // 598: checkcast java/util/Collection
      // 59b: astore 19
      // 59d: bipush 0
      // 59e: istore 20
      // 5a0: aload 18
      // 5a2: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 5a7: astore 21
      // 5a9: aload 21
      // 5ab: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5b0: ifeq 5fb
      // 5b3: aload 21
      // 5b5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5ba: astore 22
      // 5bc: aload 22
      // 5be: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 5c1: astore 23
      // 5c3: bipush 0
      // 5c4: istore 24
      // 5c6: aload 23
      // 5c8: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 5cb: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 5ce: aload 13
      // 5d0: bipush 1
      // 5d1: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 5d4: aload 3
      // 5d5: ifnonnull 608
      // 5d8: aload 3
      // 5d9: ifnonnull 5f6
      // 5dc: goto 5e3
      // 5df: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5e2: athrow
      // 5e3: ifeq 5a9
      // 5e6: goto 5ed
      // 5e9: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5ec: athrow
      // 5ed: aload 19
      // 5ef: aload 22
      // 5f1: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 5f6: pop
      // 5f7: aload 3
      // 5f8: ifnull 5a9
      // 5fb: aload 19
      // 5fd: checkcast java/util/List
      // 600: nop
      // 601: checkcast java/lang/Iterable
      // 604: astore 16
      // 606: nop
      // 607: bipush 0
      // 608: istore 17
      // 60a: aload 16
      // 60c: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 611: astore 18
      // 613: aload 18
      // 615: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 61a: aload 3
      // 61b: ifnonnull 64b
      // 61e: ifne 630
      // 621: goto 628
      // 624: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 627: athrow
      // 628: aconst_null
      // 629: goto 6ab
      // 62c: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 62f: athrow
      // 630: aload 18
      // 632: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 637: astore 19
      // 639: aload 18
      // 63b: aload 3
      // 63c: ifnonnull 659
      // 63f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 644: goto 64b
      // 647: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 64a: athrow
      // 64b: ifne 657
      // 64e: aload 19
      // 650: goto 6ab
      // 653: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 656: athrow
      // 657: aload 19
      // 659: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 65c: astore 20
      // 65e: bipush 0
      // 65f: istore 21
      // 661: aload 20
      // 663: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 666: invokeinterface java/util/List.size ()I 1
      // 66b: istore 20
      // 66d: aload 18
      // 66f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 674: astore 21
      // 676: aload 21
      // 678: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 67b: astore 22
      // 67d: bipush 0
      // 67e: istore 23
      // 680: aload 22
      // 682: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 685: invokeinterface java/util/List.size ()I 1
      // 68a: istore 22
      // 68c: iload 20
      // 68e: iload 22
      // 690: if_icmpge 69b
      // 693: aload 21
      // 695: astore 19
      // 697: iload 22
      // 699: istore 20
      // 69b: aload 18
      // 69d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6a2: ifne 66d
      // 6a5: aload 3
      // 6a6: ifnonnull 697
      // 6a9: aload 19
      // 6ab: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 6ae: dup
      // 6af: ifnonnull 6c9
      // 6b2: pop
      // 6b3: invokestatic com/mojang/brigadier/suggestion/Suggestions.empty ()Ljava/util/concurrent/CompletableFuture;
      // 6b6: dup
      // 6b7: sipush 18560
      // 6ba: sipush -16969
      // 6bd: pop2
      // 6be: ldc_w "empty(...)"
      // 6c1: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 6c4: areturn
      // 6c5: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6c8: athrow
      // 6c9: astore 14
      // 6cb: iload 7
      // 6cd: bipush 2
      // 6ce: isub
      // 6cf: istore 15
      // 6d1: iload 15
      // 6d3: aload 14
      // 6d5: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 6d8: invokeinterface java/util/List.size ()I 1
      // 6dd: if_icmpge 778
      // 6e0: aload 14
      // 6e2: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 6e5: iload 15
      // 6e7: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 6ec: checkcast me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
      // 6ef: astore 16
      // 6f1: aload 3
      // 6f2: ifnonnull 777
      // 6f5: aload 16
      // 6f7: invokevirtual me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.c ()Lme/octo/client/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII;
      // 6fa: dup
      // 6fb: ifnull 776
      // 6fe: goto 705
      // 701: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 704: athrow
      // 705: astore 19
      // 707: bipush 0
      // 708: istore 20
      // 70a: aload 19
      // 70c: aload 9
      // 70e: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 711: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 714: dup
      // 715: sipush 18614
      // 718: sipush 26235
      // 71b: pop2
      // 71c: ldc_w "toLowerCase(...)"
      // 71f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 722: invokeinterface me/octo/client/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.a (Ljava/lang/String;)Ljava/util/List; 2
      // 727: astore 21
      // 729: aload 21
      // 72b: checkcast java/lang/Iterable
      // 72e: astore 22
      // 730: bipush 0
      // 731: istore 23
      // 733: aload 22
      // 735: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 73a: astore 24
      // 73c: aload 24
      // 73e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 743: ifeq 771
      // 746: aload 24
      // 748: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 74d: astore 25
      // 74f: aload 25
      // 751: checkcast java/lang/String
      // 754: astore 26
      // 756: bipush 0
      // 757: istore 27
      // 759: aload 11
      // 75b: aload 26
      // 75d: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest (Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
      // 760: pop
      // 761: nop
      // 762: aload 3
      // 763: ifnonnull 773
      // 766: aload 3
      // 767: ifnull 73c
      // 76a: goto 771
      // 76d: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 770: athrow
      // 771: nop
      // 772: nop
      // 773: goto 778
      // 776: pop
      // 777: nop
      // 778: aload 11
      // 77a: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.buildFuture ()Ljava/util/concurrent/CompletableFuture;
      // 77d: dup
      // 77e: sipush 18616
      // 781: sipush -32464
      // 784: pop2
      // 785: ldc_w "buildFuture(...)"
      // 788: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 78b: areturn
      // 78c: iload 7
      // 78e: bipush 1
      // 78f: isub
      // 790: istore 13
      // 792: aload 0
      // 793: getfield me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/util/List;
      // 796: checkcast java/lang/Iterable
      // 799: astore 16
      // 79b: nop
      // 79c: bipush 0
      // 79d: istore 17
      // 79f: aload 16
      // 7a1: astore 18
      // 7a3: new java/util/ArrayList
      // 7a6: dup
      // 7a7: invokespecial java/util/ArrayList.<init> ()V
      // 7aa: checkcast java/util/Collection
      // 7ad: astore 19
      // 7af: bipush 0
      // 7b0: istore 20
      // 7b2: aload 18
      // 7b4: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 7b9: astore 21
      // 7bb: aload 21
      // 7bd: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 7c2: ifeq 80d
      // 7c5: aload 21
      // 7c7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 7cc: astore 22
      // 7ce: aload 22
      // 7d0: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 7d3: astore 23
      // 7d5: bipush 0
      // 7d6: istore 24
      // 7d8: aload 23
      // 7da: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.a ()Lme/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
      // 7dd: invokevirtual me/octo/client/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.a ()Ljava/lang/String;
      // 7e0: aload 6
      // 7e2: bipush 1
      // 7e3: invokestatic kotlin/text/StringsKt.equals (Ljava/lang/String;Ljava/lang/String;Z)Z
      // 7e6: aload 3
      // 7e7: ifnonnull 81a
      // 7ea: aload 3
      // 7eb: ifnonnull 808
      // 7ee: goto 7f5
      // 7f1: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7f4: athrow
      // 7f5: ifeq 7bb
      // 7f8: goto 7ff
      // 7fb: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 7fe: athrow
      // 7ff: aload 19
      // 801: aload 22
      // 803: invokeinterface java/util/Collection.add (Ljava/lang/Object;)Z 2
      // 808: pop
      // 809: aload 3
      // 80a: ifnull 7bb
      // 80d: aload 19
      // 80f: checkcast java/util/List
      // 812: nop
      // 813: checkcast java/lang/Iterable
      // 816: astore 16
      // 818: nop
      // 819: bipush 0
      // 81a: istore 17
      // 81c: aload 16
      // 81e: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 823: astore 18
      // 825: aload 18
      // 827: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 82c: aload 3
      // 82d: ifnonnull 85d
      // 830: ifne 842
      // 833: goto 83a
      // 836: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 839: athrow
      // 83a: aconst_null
      // 83b: goto 8bd
      // 83e: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 841: athrow
      // 842: aload 18
      // 844: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 849: astore 19
      // 84b: aload 18
      // 84d: aload 3
      // 84e: ifnonnull 86b
      // 851: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 856: goto 85d
      // 859: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 85c: athrow
      // 85d: ifne 869
      // 860: aload 19
      // 862: goto 8bd
      // 865: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 868: athrow
      // 869: aload 19
      // 86b: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 86e: astore 20
      // 870: bipush 0
      // 871: istore 21
      // 873: aload 20
      // 875: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 878: invokeinterface java/util/List.size ()I 1
      // 87d: istore 20
      // 87f: aload 18
      // 881: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 886: astore 21
      // 888: aload 21
      // 88a: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 88d: astore 22
      // 88f: bipush 0
      // 890: istore 23
      // 892: aload 22
      // 894: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 897: invokeinterface java/util/List.size ()I 1
      // 89c: istore 22
      // 89e: iload 20
      // 8a0: iload 22
      // 8a2: if_icmpge 8ad
      // 8a5: aload 21
      // 8a7: astore 19
      // 8a9: iload 22
      // 8ab: istore 20
      // 8ad: aload 18
      // 8af: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 8b4: ifne 87f
      // 8b7: aload 3
      // 8b8: ifnonnull 8a9
      // 8bb: aload 19
      // 8bd: checkcast me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI
      // 8c0: dup
      // 8c1: ifnonnull 8ce
      // 8c4: pop
      // 8c5: aload 12
      // 8c7: goto 8ce
      // 8ca: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 8cd: athrow
      // 8ce: astore 14
      // 8d0: iload 13
      // 8d2: aload 14
      // 8d4: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 8d7: invokeinterface java/util/List.size ()I 1
      // 8dc: if_icmpge 977
      // 8df: aload 14
      // 8e1: invokevirtual me/octo/client/IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.b ()Ljava/util/List;
      // 8e4: iload 13
      // 8e6: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 8eb: checkcast me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
      // 8ee: astore 15
      // 8f0: aload 3
      // 8f1: ifnonnull 976
      // 8f4: aload 15
      // 8f6: invokevirtual me/octo/client/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.c ()Lme/octo/client/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII;
      // 8f9: dup
      // 8fa: ifnull 975
      // 8fd: goto 904
      // 900: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 903: athrow
      // 904: astore 18
      // 906: bipush 0
      // 907: istore 19
      // 909: aload 18
      // 90b: aload 9
      // 90d: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 910: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 913: dup
      // 914: sipush 18614
      // 917: sipush 26235
      // 91a: pop2
      // 91b: ldc_w "toLowerCase(...)"
      // 91e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 921: invokeinterface me/octo/client/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.a (Ljava/lang/String;)Ljava/util/List; 2
      // 926: astore 20
      // 928: aload 20
      // 92a: checkcast java/lang/Iterable
      // 92d: astore 21
      // 92f: bipush 0
      // 930: istore 22
      // 932: aload 21
      // 934: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 939: astore 23
      // 93b: aload 23
      // 93d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 942: ifeq 970
      // 945: aload 23
      // 947: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 94c: astore 24
      // 94e: aload 24
      // 950: checkcast java/lang/String
      // 953: astore 25
      // 955: bipush 0
      // 956: istore 26
      // 958: aload 11
      // 95a: aload 25
      // 95c: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.suggest (Ljava/lang/String;)Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;
      // 95f: pop
      // 960: nop
      // 961: aload 3
      // 962: ifnonnull 972
      // 965: aload 3
      // 966: ifnull 93b
      // 969: goto 970
      // 96c: invokestatic me/octo/client/IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 96f: athrow
      // 970: nop
      // 971: nop
      // 972: goto 977
      // 975: pop
      // 976: nop
      // 977: aload 11
      // 979: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.buildFuture ()Ljava/util/concurrent/CompletableFuture;
      // 97c: dup
      // 97d: sipush 18616
      // 980: sipush -32464
      // 983: pop2
      // 984: ldc_w "buildFuture(...)"
      // 987: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 98a: areturn
      // 98b: aload 11
      // 98d: invokevirtual com/mojang/brigadier/suggestion/SuggestionsBuilder.buildFuture ()Ljava/util/concurrent/CompletableFuture;
      // 990: dup
      // 991: sipush 18616
      // 994: sipush -32464
      // 997: pop2
      // 998: ldc_w "buildFuture(...)"
      // 99b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 99e: areturn
      // 99f: astore 5
      // 9a1: aload 5
      // 9a3: sipush 18621
      // 9a6: sipush -26920
      // 9a9: pop2
      // 9aa: ldc_w "Error in completeSuggestionsImpl: "
      // 9ad: swap
      // 9ae: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 9b3: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
      // 9b6: aload 5
      // 9b8: invokevirtual java/lang/Exception.printStackTrace ()V
      // 9bb: invokestatic com/mojang/brigadier/suggestion/Suggestions.empty ()Ljava/util/concurrent/CompletableFuture;
      // 9be: dup
      // 9bf: sipush 18560
      // 9c2: sipush -16969
      // 9c5: pop2
      // 9c6: ldc_w "empty(...)"
      // 9c9: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 9cc: areturn
   }

   private static final void a(
      IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl param0, CommandDispatcher param1, CommandBuildContext param2
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = g();
      Intrinsics.checkNotNullParameter(param1, "dispatcher");
      Intrinsics.checkNotNullParameter(param2, "<unused var>");
      if (var3 == null) {
         if (param0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.isEmpty()) {
            param0.b();
         }
      }
      param0.a(param1);
   }

   private static final int a(IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var0, String var1, CommandContext var2) {
      short var10001 = 18567;
      short var10002 = 30264;
      String var3 = StringArgumentType.getString(var2, "args");
      Intrinsics.checkNotNull(var3);
      CharSequence var10000 = var3;
      String[] var5 = new String[]{" "};
      Collection var8 = (StringsKt.split(var10000, var5, false, 0));
      boolean var6 = false;
      String[] var4 = ((String[])(Object)(var8.toArray(new String[0])));
      var0.a(var1, var4);
      return 1;
   }

   private static final int b(IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var0, String var1, CommandContext var2) {
      var0.a(var1, new String[0]);
      return 1;
   }

   @JvmStatic
   @NotNull
   public static final CompletableFuture<Suggestions> b(@NotNull String var0, int var1) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0, var1);
   }

   @JvmStatic
   public static final boolean b(@NotNull String var0) {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var0);
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] g() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 18613) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 102;
            case 1 -> 247;
            case 2 -> 3;
            case 3 -> 146;
            case 4 -> 244;
            case 5 -> 198;
            case 6 -> 104;
            case 7 -> 145;
            case 8 -> 164;
            case 9 -> 55;
            case 10 -> 92;
            case 11 -> 95;
            case 12 -> 75;
            case 13 -> 9;
            case 14 -> 170;
            case 15 -> 189;
            case 16 -> 235;
            case 17 -> 37;
            case 18 -> 119;
            case 19 -> 112;
            case 20 -> 150;
            case 21 -> 2;
            case 22 -> 44;
            case 23 -> 69;
            case 24 -> 74;
            case 25 -> 210;
            case 26 -> 107;
            case 27 -> 147;
            case 28 -> 67;
            case 29 -> 188;
            case 30 -> 73;
            case 31 -> 245;
            case 32 -> 115;
            case 33 -> 242;
            case 34 -> 124;
            case 35 -> 68;
            case 36 -> 35;
            case 37 -> 65;
            case 38 -> 45;
            case 39 -> 82;
            case 40 -> 203;
            case 41 -> 233;
            case 42 -> 196;
            case 43 -> 238;
            case 44 -> 232;
            case 45 -> 63;
            case 46 -> 120;
            case 47 -> 116;
            case 48 -> 12;
            case 49 -> 1;
            case 50 -> 152;
            case 51 -> 136;
            case 52 -> 171;
            case 53 -> 225;
            case 54 -> 36;
            case 55 -> 21;
            case 56 -> 5;
            case 57 -> 6;
            case 58 -> 202;
            case 59 -> 149;
            case 60 -> 226;
            case 61 -> 94;
            case 62 -> 59;
            case 63 -> 42;
            case 64 -> 230;
            case 65 -> 38;
            case 66 -> 194;
            case 67 -> 30;
            case 68 -> 229;
            case 69 -> 251;
            case 70 -> 39;
            case 71 -> 173;
            case 72 -> 70;
            case 73 -> 86;
            case 74 -> 205;
            case 75 -> 53;
            case 76 -> 14;
            case 77 -> 78;
            case 78 -> 106;
            case 79 -> 43;
            case 80 -> 180;
            case 81 -> 10;
            case 82 -> 179;
            case 83 -> 154;
            case 84 -> 34;
            case 85 -> 135;
            case 86 -> 15;
            case 87 -> 66;
            case 88 -> 190;
            case 89 -> 183;
            case 90 -> 98;
            case 91 -> 201;
            case 92 -> 223;
            case 93 -> 153;
            case 94 -> 191;
            case 95 -> 20;
            case 96 -> 182;
            case 97 -> 192;
            case 98 -> 17;
            case 99 -> 50;
            case 100 -> 221;
            case 101 -> 8;
            case 102 -> 143;
            case 103 -> 144;
            case 104 -> 175;
            case 105 -> 47;
            case 106 -> 209;
            case 107 -> 158;
            case 108 -> 76;
            case 109 -> 214;
            case 110 -> 4;
            case 111 -> 96;
            case 112 -> 19;
            case 113 -> 32;
            case 114 -> 108;
            case 115 -> 130;
            case 116 -> 222;
            case 117 -> 132;
            case 118 -> 138;
            case 119 -> 193;
            case 120 -> 87;
            case 121 -> 134;
            case 122 -> 85;
            case 123 -> 122;
            case 124 -> 11;
            case 125 -> 212;
            case 126 -> 80;
            case 127 -> 249;
            case 128 -> 23;
            case 129 -> 220;
            case 130 -> 31;
            case 131 -> 0;
            case 132 -> 40;
            case 133 -> 79;
            case 134 -> 24;
            case 135 -> 169;
            case 136 -> 81;
            case 137 -> 46;
            case 138 -> 176;
            case 139 -> 185;
            case 140 -> 254;
            case 141 -> 199;
            case 142 -> 246;
            case 143 -> 7;
            case 144 -> 184;
            case 145 -> 129;
            case 146 -> 174;
            case 147 -> 49;
            case 148 -> 178;
            case 149 -> 160;
            case 150 -> 25;
            case 151 -> 155;
            case 152 -> 187;
            case 153 -> 140;
            case 154 -> 255;
            case 155 -> 250;
            case 156 -> 156;
            case 157 -> 157;
            case 158 -> 213;
            case 159 -> 133;
            case 160 -> 110;
            case 161 -> 139;
            case 162 -> 26;
            case 163 -> 228;
            case 164 -> 167;
            case 165 -> 123;
            case 166 -> 128;
            case 167 -> 151;
            case 168 -> 99;
            case 169 -> 91;
            case 170 -> 253;
            case 171 -> 239;
            case 172 -> 208;
            case 173 -> 100;
            case 174 -> 13;
            case 175 -> 206;
            case 176 -> 186;
            case 177 -> 113;
            case 178 -> 16;
            case 179 -> 197;
            case 180 -> 168;
            case 181 -> 166;
            case 182 -> 28;
            case 183 -> 131;
            case 184 -> 72;
            case 185 -> 148;
            case 186 -> 252;
            case 187 -> 90;
            case 188 -> 77;
            case 189 -> 241;
            case 190 -> 142;
            case 191 -> 165;
            case 192 -> 109;
            case 193 -> 22;
            case 194 -> 217;
            case 195 -> 234;
            case 196 -> 163;
            case 197 -> 231;
            case 198 -> 62;
            case 199 -> 101;
            case 200 -> 27;
            case 201 -> 137;
            case 202 -> 61;
            case 203 -> 117;
            case 204 -> 97;
            case 205 -> 52;
            case 206 -> 64;
            case 207 -> 127;
            case 208 -> 172;
            case 209 -> 141;
            case 210 -> 41;
            case 211 -> 105;
            case 212 -> 240;
            case 213 -> 18;
            case 214 -> 177;
            case 215 -> 161;
            case 216 -> 56;
            case 217 -> 71;
            case 218 -> 118;
            case 219 -> 248;
            case 220 -> 93;
            case 221 -> 33;
            case 222 -> 103;
            case 223 -> 48;
            case 224 -> 159;
            case 225 -> 204;
            case 226 -> 89;
            case 227 -> 215;
            case 228 -> 218;
            case 229 -> 88;
            case 230 -> 29;
            case 231 -> 219;
            case 232 -> 195;
            case 233 -> 54;
            case 234 -> 126;
            case 235 -> 51;
            case 236 -> 162;
            case 237 -> 125;
            case 238 -> 60;
            case 239 -> 58;
            case 240 -> 57;
            case 241 -> 207;
            case 242 -> 243;
            case 243 -> 121;
            case 244 -> 114;
            case 245 -> 216;
            case 246 -> 224;
            case 247 -> 111;
            case 248 -> 84;
            case 249 -> 227;
            case 250 -> 236;
            case 251 -> 200;
            case 252 -> 181;
            case 253 -> 211;
            case 254 -> 237;
            default -> 83;
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

   static {
      $jnicClinit();
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker pxMarker) {
         this();
      }


      @JvmStatic
      @NotNull
      public final CompletableFuture<Suggestions> a(@NotNull String var1, int var2) {
         short var10001 = -14385;
         short var10002 = 19096;
         Intrinsics.checkNotNullParameter(var1, "text");
         return this.a().a(var1, var2);
      }

      @JvmStatic
      public final boolean a(@NotNull String var1) {
      boolean var25 = false; // PX-FIX
      Object var24 = null; // PX-FIX
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g();
         short var10002 = -14391;
         short var10003 = 29028;
         Intrinsics.checkNotNullParameter(var1, "text");
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
         String var18 = var1;
         String var10001 = "/";
         if (var2 == null) {
            if (!StringsKt.startsWith(var1, "/", false)) {
               return false;
            }

            var18 = var1.substring(1);
            var10001 = var18;
         }

         var10002 = -14386;
         var10003 = 4347;
         Intrinsics.checkNotNullExpressionValue(var10001, "substring(...)");
         CharSequence var19 = var18;
         String[] var4 = new String[]{" "};
         String var3 = (String)StringsKt.split(var19, var4, false, 0).get(0);
         String var17 = llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .p();
         boolean var20 = StringsKt.isBlank(var17);
         if (var2 == null) {
            var20 = !var20;
         }

         if (var20) {
            boolean var21 = StringsKt.equals(var3, var17, true);
            if (var2 != null) {
               return var21;
            }

            if (var21) {
               return true;
            }
         }

         var var5 = this.a().a();
         boolean var6 = false;
         java.lang.Iterable<?> var1000b = (java.lang.Iterable<?>)(Object)(var5);
         label100:
         if (var2 == null) {
            if (var5 instanceof Collection) {
               java.util.Collection var1000a = (java.util.Collection)var5;
               if (var2 != null) {
                  break label100;
               }

               if ((var1000a.isEmpty())) {
                  return false;
               }
            }

            var1000b = (java.lang.Iterable<?>)(Object)(var5);
         }

         label91:
         for (Object var8 : var1000b) {
            IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI var9 = (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI)var8;
            boolean var10 = false;
            boolean var23 = StringsKt.startsWith(var9.a().a(), var3, true);

            do {
               label64:
               if (var2 == null) {
                  if (!var23) {
                     label120: {
                        var var11 = var9.a().c();
                        boolean var12 = false;
                        var24 = var11;
                        label82:
                        if (var2 == null) {
                           if (var11 instanceof Collection) {
                              var24 = (Collection)var11;
                              if (var2 != null) {
                                 break label82;
                              }

                              if (((java.util.Collection)var24).isEmpty()) {
                                 var25 = false;
                                 break label120;
                              }
                           }

                           var24 = var11;
                        }

                        Iterator var13 = ((java.util.Collection)var24).iterator();

                        label75:
                        while (true) {
                           if (!var13.hasNext()) {
                              var25 = false;
                              break;
                           }

                           Object var14 = var13.next();
                           String var15 = (String)var14;
                           boolean var16 = false;
                           var25 = StringsKt.startsWith(var15, var3, true);

                           while (var25) {
                              var25 = true;
                              if (var2 == null) {
                                 break label75;
                              }
                           }
                        }
                     }

                     if (!var25) {
                        var23 = false;
                        break label64;
                     }
                  }

                  var23 = true;
               }

               if (!var23) {
                  continue label91;
               }

               var23 = true;
            } while (var2 != null);

            return true;
         }

         return false;
      }

      @NotNull
      public final IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl a() {
         me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.g();
         if (var1 == null) {
            if (IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               != null) {
               return IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            }

            short var10000 = -14387;
            short var10001 = -25302;
            Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
         }

         return null;
      }

      public final void a(@NotNull IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var1) {
         short var10001 = -14388;
         short var10002 = -4106;
         Intrinsics.checkNotNullParameter(var1, "<set-?>");
         IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[5];
         int var3 = 0;
         String var2 = "¸\u001eJ°\u0082K\u0016\t\u00077GV!\u009d,i\u0004-\\I\u0096";
         int var4 = "¸\u001eJ°\u0082K\u0016\t\u00077GV!\u009d,i\u0004-\\I\u0096".length();
         char var1 = '\b';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 30;
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
                        case 0 -> 29;
                        case 1 -> 43;
                        case 2 -> 16;
                        case 3 -> 24;
                        case 4 -> 108;
                        case 5 -> 19;
                        default -> 60;
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
                        b = new String[5];
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

                     var2 = "=\u0018|Á¬P 0\u008c)^_\t\u008f\u0004\u0091©\u0014â";
                     var4 = "=\u0018|Á¬P 0\u008c)^_\t\u008f\u0004\u0091©\u0014â".length();
                     var1 = 14;
                     var8 = -1;
               }

               var10000 = 49;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -14387) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 230;
               case 1 -> 55;
               case 2 -> 23;
               case 3 -> 215;
               case 4 -> 232;
               case 5 -> 90;
               case 6 -> 218;
               case 7 -> 32;
               case 8 -> 164;
               case 9 -> 17;
               case 10 -> 89;
               case 11 -> 33;
               case 12 -> 219;
               case 13 -> 197;
               case 14 -> 112;
               case 15 -> 146;
               case 16 -> 119;
               case 17 -> 153;
               case 18 -> 82;
               case 19 -> 121;
               case 20 -> 6;
               case 21 -> 210;
               case 22 -> 34;
               case 23 -> 1;
               case 24 -> 13;
               case 25 -> 254;
               case 26 -> 2;
               case 27 -> 244;
               case 28 -> 80;
               case 29 -> 37;
               case 30 -> 67;
               case 31 -> 157;
               case 32 -> 83;
               case 33 -> 177;
               case 34 -> 172;
               case 35 -> 226;
               case 36 -> 109;
               case 37 -> 136;
               case 38 -> 118;
               case 39 -> 241;
               case 40 -> 105;
               case 41 -> 224;
               case 42 -> 8;
               case 43 -> 235;
               case 44 -> 192;
               case 45 -> 137;
               case 46 -> 62;
               case 47 -> 93;
               case 48 -> 149;
               case 49 -> 30;
               case 50 -> 150;
               case 51 -> 50;
               case 52 -> 238;
               case 53 -> 183;
               case 54 -> 114;
               case 55 -> 70;
               case 56 -> 168;
               case 57 -> 117;
               case 58 -> 42;
               case 59 -> 134;
               case 60 -> 3;
               case 61 -> 221;
               case 62 -> 47;
               case 63 -> 110;
               case 64 -> 69;
               case 65 -> 36;
               case 66 -> 27;
               case 67 -> 40;
               case 68 -> 131;
               case 69 -> 113;
               case 70 -> 63;
               case 71 -> 64;
               case 72 -> 178;
               case 73 -> 243;
               case 74 -> 35;
               case 75 -> 179;
               case 76 -> 194;
               case 77 -> 28;
               case 78 -> 86;
               case 79 -> 191;
               case 80 -> 151;
               case 81 -> 122;
               case 82 -> 11;
               case 83 -> 126;
               case 84 -> 240;
               case 85 -> 46;
               case 86 -> 216;
               case 87 -> 247;
               case 88 -> 233;
               case 89 -> 128;
               case 90 -> 39;
               case 91 -> 212;
               case 92 -> 124;
               case 93 -> 19;
               case 94 -> 180;
               case 95 -> 54;
               case 96 -> 170;
               case 97 -> 193;
               case 98 -> 182;
               case 99 -> 48;
               case 100 -> 125;
               case 101 -> 99;
               case 102 -> 68;
               case 103 -> 184;
               case 104 -> 92;
               case 105 -> 59;
               case 106 -> 196;
               case 107 -> 202;
               case 108 -> 161;
               case 109 -> 111;
               case 110 -> 227;
               case 111 -> 75;
               case 112 -> 104;
               case 113 -> 12;
               case 114 -> 65;
               case 115 -> 115;
               case 116 -> 132;
               case 117 -> 195;
               case 118 -> 7;
               case 119 -> 95;
               case 120 -> 72;
               case 121 -> 234;
               case 122 -> 20;
               case 123 -> 139;
               case 124 -> 220;
               case 125 -> 246;
               case 126 -> 96;
               case 127 -> 217;
               case 128 -> 141;
               case 129 -> 24;
               case 130 -> 147;
               case 131 -> 207;
               case 132 -> 4;
               case 133 -> 156;
               case 134 -> 41;
               case 135 -> 107;
               case 136 -> 43;
               case 137 -> 26;
               case 138 -> 189;
               case 139 -> 185;
               case 140 -> 208;
               case 141 -> 163;
               case 142 -> 245;
               case 143 -> 97;
               case 144 -> 166;
               case 145 -> 242;
               case 146 -> 129;
               case 147 -> 25;
               case 148 -> 173;
               case 149 -> 51;
               case 150 -> 84;
               case 151 -> 252;
               case 152 -> 236;
               case 153 -> 58;
               case 154 -> 120;
               case 155 -> 49;
               case 156 -> 186;
               case 157 -> 169;
               case 158 -> 127;
               case 159 -> 144;
               case 160 -> 214;
               case 161 -> 22;
               case 162 -> 94;
               case 163 -> 78;
               case 164 -> 250;
               case 165 -> 103;
               case 166 -> 140;
               case 167 -> 248;
               case 168 -> 18;
               case 169 -> 203;
               case 170 -> 74;
               case 171 -> 106;
               case 172 -> 231;
               case 173 -> 188;
               case 174 -> 167;
               case 175 -> 38;
               case 176 -> 21;
               case 177 -> 87;
               case 178 -> 61;
               case 179 -> 142;
               case 180 -> 81;
               case 181 -> 222;
               case 182 -> 73;
               case 183 -> 239;
               case 184 -> 15;
               case 185 -> 108;
               case 186 -> 60;
               case 187 -> 56;
               case 188 -> 213;
               case 189 -> 155;
               case 190 -> 0;
               case 191 -> 102;
               case 192 -> 204;
               case 193 -> 5;
               case 194 -> 130;
               case 195 -> 145;
               case 196 -> 228;
               case 197 -> 176;
               case 198 -> 29;
               case 199 -> 206;
               case 200 -> 152;
               case 201 -> 237;
               case 202 -> 158;
               case 203 -> 71;
               case 204 -> 16;
               case 205 -> 175;
               case 206 -> 200;
               case 207 -> 160;
               case 208 -> 162;
               case 209 -> 123;
               case 210 -> 159;
               case 211 -> 138;
               case 212 -> 57;
               case 213 -> 205;
               case 214 -> 171;
               case 215 -> 143;
               case 216 -> 76;
               case 217 -> 53;
               case 218 -> 88;
               case 219 -> 190;
               case 220 -> 66;
               case 221 -> 225;
               case 222 -> 198;
               case 223 -> 209;
               case 224 -> 98;
               case 225 -> 44;
               case 226 -> 77;
               case 227 -> 45;
               case 228 -> 91;
               case 229 -> 211;
               case 230 -> 174;
               case 231 -> 116;
               case 232 -> 181;
               case 233 -> 251;
               case 234 -> 187;
               case 235 -> 148;
               case 236 -> 255;
               case 237 -> 223;
               case 238 -> 79;
               case 239 -> 52;
               case 240 -> 229;
               case 241 -> 133;
               case 242 -> 101;
               case 243 -> 249;
               case 244 -> 14;
               case 245 -> 9;
               case 246 -> 135;
               case 247 -> 253;
               case 248 -> 199;
               case 249 -> 201;
               case 250 -> 31;
               case 251 -> 10;
               case 252 -> 165;
               case 253 -> 154;
               case 254 -> 100;
               default -> 85;
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

    // PX-FIX JNIC placeholder (Phase 2: Ghidra restore)
    public static void $jnicLoader() {
    }

    private static void $jnicClinit() {
    }
}