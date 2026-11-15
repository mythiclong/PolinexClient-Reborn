package me.octo.client;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll {
   @NotNull
   public static IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private volatile boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private volatile boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @Nullable
   private volatile String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private ScheduledFuture<?> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private ScheduledFuture<?> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] a;
   private static String[] b;

   @Nullable
   public final String a() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final void a(@Nullable String var1) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
   }

   public final void a(@NotNull List<? extends IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl> var1) {
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      short var10002 = 6029;
      short var10003 = -20628;
      Intrinsics.checkNotNullParameter(var1, "actions");
      String var2 = var10000;
      IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll var3 = this;
      if (var2 != null) {
         if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            short var4 = 6028;
            short var10001 = -32428;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "[Reaction] Already executing, ignoring start request"
            );
            return;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = false;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(0L, null);
         var3 = this;
      }

      var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = me.octo.client.utils.IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(60000L, null);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void b(List<? extends IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl> var1) {
      Object var18 = null; // PX-FIX
      int var16 = 0; // PX-FIX
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var3 = new lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI(
         0L, 1, null
      );
      String var2 = var10000;
      boolean var9 = false /* VF: Semaphore variable */;

      try {
         var9 = true;
         int var14 = var1.size();
         short var10001 = 6016;
         short var10002 = -29401;
         var10002 = 6022;
         short var10003 = 18815;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            "[Reaction] Starting sequence with " + var14 + " actions"
         );
         this.a(var3);
         Iterator var4 = var1.iterator();
         int var5 = 0;

         while (var4.hasNext()) {
            int var6 = var5++;
            IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl var7 = (IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl)var4.next();
            if (var2 == null) {
               var9 = false;
               return;
            }

            label158: {
               label157: {
                  int var15 = ((Thread.currentThread().isInterrupted()) ? 1 : 0);
                  if (var2 != null) {
                     if (var15 == 0) {
                        var16 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ? 1 : 0;
                        if (var2 == null) {
                           break label158;
                        }

                        if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
                           break label157;
                        }
                     }

                     var15 = var6;
                  }

                  var10001 = 6017;
                  var10002 = -18327;
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                     "[Reaction] Interrupted at action " + var15
                  );
                  if (var2 != null) {
                     break;
                  }
               }

               IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a();
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7.b();
               var10001 = 6023;
               var10002 = 20564;
               me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
                  "[Reaction] Executing: " + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
               );
               var16 = var7.a() ? 1 : 0;
            }

            if (var2 != null) {
               if (var16 == 0) {
                  label172: {
                     boolean var17 = Thread.currentThread().isInterrupted();
                     if (var2 != null) {
                        if (var17) {
                           break;
                        }

                        var18 = this;
                        if (var2 == null) {
                           break label172;
                        }

                        var17 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                     }

                     if (!var17) {
                        break;
                     }

                     var18 = this;
                  }

                  this.b(var3);
               }

               var16 = Thread.currentThread().isInterrupted() ? 1 : 0;
            }

            if (var2 != null) {
               if (var16 == 0) {
                  break;
               }

               var16 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ? 1 : 0;
            }

            label174: {
               if (var2 != null) {
                  if (var16 != 0) {
                     break;
                  }

                  var7.a(var3);
                  if (var2 == null) {
                     break label174;
                  }

                  var16 = var6;
               }

               if (var16 >= (((var1.size() != 0) ? 1 : 0)) - 1) {
                  continue;
               }

               this.c(var3);
            }

            if (var2 == null) {
               break;
            }
         }

         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = null;
         short var19 = 6019;
         var10001 = -19969;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("[Reaction] Sequence complete");
         var9 = false;
      } finally {
         if (var9) {
            this.d(var3);
         }
      }

      this.d(var3);
   }

   private final void a(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      String var2 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      int var10000 = ((lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()
         .al()) ? 1 : 0);
      if (var2 != null) {
         var10000 = var10000 != 0
            ? lIlIIIIIIlllIllIlIlIlIIIIIlIlllllllIIIIIIlIlIIllIlIllIllIIIIIIIlIIIIIllIllllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b()
               .M()
            : 0;
      }

      int var3 = var10000;
      int var4 = 150 + var1.a(0, 150) + var3;
      try {
         var1.a((long)var4);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
      IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a(true);
      var1.n();
      try {
         var1.a((long)30 + var1.a(0, 60));
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
   }

   private final void b(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      String var2;
      label77: {
         var2 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         boolean var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         if (var2 != null) {
            if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return;
            }

            short var10001 = 6025;
            short var10002 = -3137;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .a("sneak", true);
            try {
               var1.a(50L);
            }
            catch (InterruptedException interruptedException) {
               throw new RuntimeException(interruptedException);
            }
            if (var2 == null) {
               break label77;
            }

            var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (!var10000) {
            return;
         }

         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .r();
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .t();
         short var11 = 6021;
         short var13 = 11709;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sneak", true);
      }

      long var3 = System.currentTimeMillis();

      int var10;
      while (true) {
         if (System.currentTimeMillis() - var3 < 600L) {
            var10 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
            if (var2 == null || var2 == null) {
               break;
            }

            label62:
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                  != null) {
               LocalPlayer var5 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player;
               double var6 = Math.abs(var5.getDeltaMovement().x);
               double var8 = Math.abs(var5.getDeltaMovement().z);
               if (var2 != null) {
                  if (var6 < 0.02) {
                     double var15;
                     var10 = (var15 = var8 - 0.02) == 0.0 ? 0 : (var15 < 0.0 ? -1 : 1);
                     if (var2 == null) {
                        break;
                     }

                     if (var10 < 0) {
                        break label62;
                     }
                  }

                  try {
                     var1.a(50L);
                  }
                  catch (InterruptedException interruptedException) {
                     throw new RuntimeException(interruptedException);
                  }
               }

               if (var2 != null) {
                  continue;
               }
            }
         }

         var10 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
         break;
      }

      if (var2 != null) {
         if (var10 == 0) {
            return;
         }

         try {
            var1.a((long)50 + var1.a(0, 50));
         }
         catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
         }
         if (var2 == null) {
            return;
         }

         var10 = ((this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) ? 1 : 0);
      }

      if (var10 != 0) {
         short var12 = 6021;
         short var14 = 11709;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sneak", false);
         try {
            var1.a((long)30 + var1.a(0, 40));
         }
         catch (InterruptedException interruptedException) {
            throw new RuntimeException(interruptedException);
         }
      }
   }

   private final void c(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      int var4;
      label14: {
         String var2 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         float var5;
         var4 = (var5 = var1.h() - 0.15F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
         if (var2 != null) {
            if (var4 < 0) {
               var4 = 400 + var1.a(0, 600);
               break label14;
            }

            var4 = 50;
         }

         var4 += var1.a(0, 100);
      }

      int var3 = var4;
      try {
         var1.a((long)var3);
      }
      catch (InterruptedException interruptedException) {
         throw new RuntimeException(interruptedException);
      }
   }

   private final void d(lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI var1) {
      Object var11 = null; // PX-FIX
      Thread.interrupted();
      String var10000 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
      var1.q();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .r();
      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .t();
      String var2 = var10000;
      long var3 = System.currentTimeMillis();

      while (true) {
         if (System.currentTimeMillis() - var3 < 500L) {
            var11 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == null || var2 == null) {
               break;
            }

            label42:
            if (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               && me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .player
                  != null) {
               LocalPlayer var5 = me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .player;
               double var6 = Math.abs(var5.getDeltaMovement().x);
               double var8 = Math.abs(var5.getDeltaMovement().z);
               byte var10 = ((byte)((lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()) ? 1 : 0));
               if (var2 != null) {
                  label36:
                  if (var6 < 0.02) {
                     double var12;
                     var11 = (var12 = var8 - 0.02) == 0.0 ? 0 : (var12 < 0.0 ? -1 : 1);
                     if (var2 != null) {
                        if ((me.octo.client.PxTruth.truth(var11))) {
                           break label36;
                        }

                        var11 = var10;
                     }

                     if (var2 == null) {
                        break;
                     }

                     if ((me.octo.client.PxTruth.truth(var11))) {
                        break label42;
                     }
                  }

                  try {
                     Thread.sleep(50L);
                  }
                  catch (InterruptedException interruptedException) {
                     throw new RuntimeException(interruptedException);
                  }
               }

               if (var2 != null) {
                  continue;
               }
            }
         }

         short var10001 = 6021;
         short var10002 = 11709;
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .a("sneak", false);
         var11 = 0;
         break;
      }

      me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.a((boolean)var11);
   }

   private final void b() {
      short var10000 = 6024;
      short var10001 = 1914;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
         "[Reaction] Complete, re-enabling failsafes"
      );
      me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .execute(IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll::e);
   }

   public final boolean c() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void d() {
      label26: {
         String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
         IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll var10000 = this;
         if (var1 != null) {
            if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
               return;
            }

            short var2 = 6020;
            short var10001 = 17983;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "[Reaction] Cancelling execution"
            );
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .r();
            me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .t();
            if (var1 == null) {
               break label26;
            }

            var10000 = this;
         }

         if (var10000.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null) {
            var10000.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.cancel(true);
         }
      }

      if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.cancel(false);
      }
   }

   private static final Unit a(IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll param0, List param1) {
      String var2 = me.octo.client.lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      try {
         param0.b(param1);
      } catch (Exception var3) {
         if (var3 instanceof InterruptedException) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("[Reaction] Execution interrupted");
         } else {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("[Reaction] Execution failed:" + var3.getMessage());
            var3.printStackTrace();
         }
      } finally {
         param0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = false;
         if (var2 != null) {
            if (param0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI != null) {
               param0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.cancel(false);
            }
         }
         param0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
         param0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;
         if (var2 != null) {
            if (!param0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
               param0.b();
            }
         } else {
            param0.b();
         }
      }
      return Unit.INSTANCE;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r ()Ljava/lang/String;
      // 003: astore 2
      // 004: nop
      // 005: aload 0
      // 006: aload 1
      // 007: invokespecial me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.b (Ljava/util/List;)V
      // 00a: aload 0
      // 00b: bipush 0
      // 00c: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 00f: aload 2
      // 010: ifnull 029
      // 013: aload 0
      // 014: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 017: dup
      // 018: ifnull 02c
      // 01b: bipush 0
      // 01c: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 021: pop
      // 022: goto 029
      // 025: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 028: athrow
      // 029: goto 02d
      // 02c: pop
      // 02d: aload 0
      // 02e: aconst_null
      // 02f: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 032: aload 0
      // 033: aconst_null
      // 034: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Ljava/util/concurrent/ScheduledFuture;
      // 037: aload 0
      // 038: aload 2
      // 039: ifnull 051
      // 03c: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 03f: ifne 054
      // 042: goto 049
      // 045: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 048: athrow
      // 049: aload 0
      // 04a: goto 051
      // 04d: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 050: athrow
      // 051: invokespecial me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.b ()V
      // 054: goto 16f
      // 057: astore 3
      // 058: sipush 6018
      // 05b: sipush -14590
      // 05e: pop2
      // 05f: ldc_w "[Reaction] Execution interrupted"
      // 062: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 065: aload 0
      // 066: bipush 0
      // 067: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 06a: aload 2
      // 06b: ifnull 084
      // 06e: aload 0
      // 06f: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 072: dup
      // 073: ifnull 087
      // 076: bipush 0
      // 077: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 07c: pop
      // 07d: goto 084
      // 080: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 083: athrow
      // 084: goto 088
      // 087: pop
      // 088: aload 0
      // 089: aconst_null
      // 08a: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 08d: aload 0
      // 08e: aconst_null
      // 08f: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Ljava/util/concurrent/ScheduledFuture;
      // 092: aload 0
      // 093: aload 2
      // 094: ifnull 0ac
      // 097: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 09a: ifne 0af
      // 09d: goto 0a4
      // 0a0: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0a3: athrow
      // 0a4: aload 0
      // 0a5: goto 0ac
      // 0a8: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ab: athrow
      // 0ac: invokespecial me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.b ()V
      // 0af: goto 16f
      // 0b2: astore 3
      // 0b3: aload 3
      // 0b4: invokevirtual java/lang/Exception.getMessage ()Ljava/lang/String;
      // 0b7: sipush 6031
      // 0ba: sipush 16483
      // 0bd: pop2
      // 0be: ldc_w "[Reaction] Execution failed: "
      // 0c1: swap
      // 0c2: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0c7: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0ca: aload 3
      // 0cb: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0ce: aload 0
      // 0cf: bipush 0
      // 0d0: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 0d3: aload 2
      // 0d4: ifnull 0ed
      // 0d7: aload 0
      // 0d8: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 0db: dup
      // 0dc: ifnull 0f0
      // 0df: bipush 0
      // 0e0: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 0e5: pop
      // 0e6: goto 0ed
      // 0e9: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 0ec: athrow
      // 0ed: goto 0f1
      // 0f0: pop
      // 0f1: aload 0
      // 0f2: aconst_null
      // 0f3: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 0f6: aload 0
      // 0f7: aconst_null
      // 0f8: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Ljava/util/concurrent/ScheduledFuture;
      // 0fb: aload 0
      // 0fc: aload 2
      // 0fd: ifnull 115
      // 100: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 103: ifne 118
      // 106: goto 10d
      // 109: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 10c: athrow
      // 10d: aload 0
      // 10e: goto 115
      // 111: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 114: athrow
      // 115: invokespecial me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.b ()V
      // 118: goto 16f
      // 11b: astore 3
      // 11c: aload 0
      // 11d: bipush 0
      // 11e: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Z
      // 121: aload 2
      // 122: ifnull 142
      // 125: aload 0
      // 126: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 129: dup
      // 12a: ifnull 145
      // 12d: goto 134
      // 130: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 133: athrow
      // 134: bipush 0
      // 135: invokeinterface java/util/concurrent/ScheduledFuture.cancel (Z)Z 2
      // 13a: pop
      // 13b: goto 142
      // 13e: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 141: athrow
      // 142: goto 146
      // 145: pop
      // 146: aload 0
      // 147: aconst_null
      // 148: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/concurrent/ScheduledFuture;
      // 14b: aload 0
      // 14c: aconst_null
      // 14d: putfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Ljava/util/concurrent/ScheduledFuture;
      // 150: aload 0
      // 151: aload 2
      // 152: ifnull 16a
      // 155: getfield me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Z
      // 158: ifne 16d
      // 15b: goto 162
      // 15e: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 161: athrow
      // 162: aload 0
      // 163: goto 16a
      // 166: invokestatic me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.a (Ljava/lang/InterruptedException;)Ljava/lang/InterruptedException;
      // 169: athrow
      // 16a: invokespecial me/octo/client/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.b ()V
      // 16d: aload 3
      // 16e: athrow
      // 16f: getstatic kotlin/Unit.INSTANCE Lkotlin/Unit;
      // 172: areturn
   }

   private static final Unit a(IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll var0) {
      String var1 = lllIlIIlIIIIlIlIlIllllllIIIllllIIlIllIIllllllIIlIllIllIllllllllIIlIIIIIlIIllllIlllIlI.r();
      IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll var10000 = var0;
      if (var1 != null) {
         if (!var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
            return Unit.INSTANCE;
         }

         short var2 = 6030;
         short var10001 = -8736;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "[Reaction] Execution timeout (60s), forcefully cancelling"
         );
         var10000 = var0;
      }

      var10000.d();
      return Unit.INSTANCE;
   }

   private static final void e() {
      IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.a(
         IIIlIIIIlIlIIllIIIIIlIlllIIIIlllIllllIllllIllllIIllllIlIIIlIlIIIIIIlllIIIlllIllIIIlII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .a(),
         false,
         1,
         null
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[14];
      int var3 = 0;
      String var2 = "½f\u0087\u0080ä\u001fÁ\u0087%\u0007¸¤Euè9\u0010$:õ\u001d\u0012\u0088i/ßò\fÚ\u0095y\u0010îM\u001bV\u0001\u0016Y\u001a6´ÚÒ\t»aà!\u0019\u0005\u009fÀ%+\u0098GMEv\b\u0004e\u008f\u001b!\u008b:ô!Z¶V!Ö`\u0088íQ*'LÓ©È×ê=§uÛDøIÁòÞ-\u0096©\u000f\u0091õ\"ë^`<\u0010ÃP\u0099J¤D\u0087¥\u009cHÀ\u0014\u0002\u0017¾.âÃ¨Ì\u0016N0\u0092ÒW9p\u0080\u001c\u001d\u0090¾åËø+þ%H©\u001a\t?é·ÀÒh\b\u0093>z}m\u0002EØ DF\u0095?®£\u0087\u0095°%\u001b¡B\u0088(Ç6ÄåÏ*Ge\u0090ä,ZøsÚ=K\u0007@Óy\u0092\f\u0005D4\b:\u001c°\u009fR¡«tâ\u0083]E\u0084X§îN£\u0087\u001c(ýñJ: PïËu´2\u000f£~L¤\u0084Ú½\u0013K1= P4\u0082È\u0092ì\u001d¬\u0016\u00885\râó½> Ê\u0001x\u009coEÞ\u0094øÅ\u0089\t\u001eªlÂu\u009f\u00129\u0091Á/Ïù½mVí]°®7i\u0086ûãC_?}D\u0088W¾ó\u0016¼M/óvK¬lÍ(ºS\u0000N]\u0001\u0007ßö\u008c\u0096àÇXvæÝ)\u0000r";
      int var4 = "½f\u0087\u0080ä\u001fÁ\u0087%\u0007¸¤Euè9\u0010$:õ\u001d\u0012\u0088i/ßò\fÚ\u0095y\u0010îM\u001bV\u0001\u0016Y\u001a6´ÚÒ\t»aà!\u0019\u0005\u009fÀ%+\u0098GMEv\b\u0004e\u008f\u001b!\u008b:ô!Z¶V!Ö`\u0088íQ*'LÓ©È×ê=§uÛDøIÁòÞ-\u0096©\u000f\u0091õ\"ë^`<\u0010ÃP\u0099J¤D\u0087¥\u009cHÀ\u0014\u0002\u0017¾.âÃ¨Ì\u0016N0\u0092ÒW9p\u0080\u001c\u001d\u0090¾åËø+þ%H©\u001a\t?é·ÀÒh\b\u0093>z}m\u0002EØ DF\u0095?®£\u0087\u0095°%\u001b¡B\u0088(Ç6ÄåÏ*Ge\u0090ä,ZøsÚ=K\u0007@Óy\u0092\f\u0005D4\b:\u001c°\u009fR¡«tâ\u0083]E\u0084X§îN£\u0087\u001c(ýñJ: PïËu´2\u000f£~L¤\u0084Ú½\u0013K1= P4\u0082È\u0092ì\u001d¬\u0016\u00885\râó½> Ê\u0001x\u009coEÞ\u0094øÅ\u0089\t\u001eªlÂu\u009f\u00129\u0091Á/Ïù½mVí]°®7i\u0086ûãC_?}D\u0088W¾ó\u0016¼M/óvK¬lÍ(ºS\u0000N]\u0001\u0007ßö\u008c\u0096àÇXvæÝ)\u0000r"
         .length();
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 67;
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
                     case 0 -> 48;
                     case 1 -> 102;
                     case 2 -> 101;
                     case 3 -> 105;
                     case 4 -> 49;
                     case 5 -> 123;
                     default -> 57;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
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

                  var2 = "\u0015ªhãã*\u00ad}R¢¬ê=F\u001d¥TMF!´\u0018?â\u0007\rÇô)=ý\r\u0090®½\u0002\u008a\u0017\u009e\u0088X\\º\u000e£öÛÉ";
                  var4 = "\u0015ªhãã*\u00ad}R¢¬ê=F\u001d¥TMF!´\u0018?â\u0007\rÇô)=ý\r\u0090®½\u0002\u008a\u0017\u009e\u0088X\\º\u000e£öÛÉ".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 55;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static InterruptedException a(InterruptedException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 6021) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 106;
            case 1 -> 234;
            case 2 -> 133;
            case 3 -> 176;
            case 4 -> 114;
            case 5 -> 221;
            case 6 -> 84;
            case 7 -> 237;
            case 8 -> 206;
            case 9 -> 9;
            case 10 -> 19;
            case 11 -> 134;
            case 12 -> 155;
            case 13 -> 92;
            case 14 -> 68;
            case 15 -> 245;
            case 16 -> 139;
            case 17 -> 129;
            case 18 -> 94;
            case 19 -> 142;
            case 20 -> 49;
            case 21 -> 145;
            case 22 -> 208;
            case 23 -> 239;
            case 24 -> 187;
            case 25 -> 38;
            case 26 -> 20;
            case 27 -> 204;
            case 28 -> 152;
            case 29 -> 108;
            case 30 -> 135;
            case 31 -> 127;
            case 32 -> 63;
            case 33 -> 230;
            case 34 -> 45;
            case 35 -> 196;
            case 36 -> 4;
            case 37 -> 205;
            case 38 -> 195;
            case 39 -> 171;
            case 40 -> 57;
            case 41 -> 247;
            case 42 -> 227;
            case 43 -> 186;
            case 44 -> 219;
            case 45 -> 35;
            case 46 -> 110;
            case 47 -> 21;
            case 48 -> 163;
            case 49 -> 125;
            case 50 -> 146;
            case 51 -> 26;
            case 52 -> 197;
            case 53 -> 126;
            case 54 -> 25;
            case 55 -> 150;
            case 56 -> 225;
            case 57 -> 112;
            case 58 -> 73;
            case 59 -> 166;
            case 60 -> 138;
            case 61 -> 5;
            case 62 -> 246;
            case 63 -> 81;
            case 64 -> 209;
            case 65 -> 144;
            case 66 -> 51;
            case 67 -> 232;
            case 68 -> 192;
            case 69 -> 120;
            case 70 -> 222;
            case 71 -> 91;
            case 72 -> 76;
            case 73 -> 96;
            case 74 -> 131;
            case 75 -> 98;
            case 76 -> 61;
            case 77 -> 200;
            case 78 -> 66;
            case 79 -> 23;
            case 80 -> 167;
            case 81 -> 210;
            case 82 -> 191;
            case 83 -> 124;
            case 84 -> 55;
            case 85 -> 88;
            case 86 -> 58;
            case 87 -> 194;
            case 88 -> 46;
            case 89 -> 141;
            case 90 -> 90;
            case 91 -> 37;
            case 92 -> 159;
            case 93 -> 60;
            case 94 -> 248;
            case 95 -> 252;
            case 96 -> 79;
            case 97 -> 130;
            case 98 -> 240;
            case 99 -> 229;
            case 100 -> 250;
            case 101 -> 136;
            case 102 -> 34;
            case 103 -> 226;
            case 104 -> 185;
            case 105 -> 42;
            case 106 -> 169;
            case 107 -> 177;
            case 108 -> 59;
            case 109 -> 33;
            case 110 -> 202;
            case 111 -> 41;
            case 112 -> 218;
            case 113 -> 15;
            case 114 -> 122;
            case 115 -> 213;
            case 116 -> 255;
            case 117 -> 43;
            case 118 -> 190;
            case 119 -> 40;
            case 120 -> 242;
            case 121 -> 17;
            case 122 -> 118;
            case 123 -> 52;
            case 124 -> 154;
            case 125 -> 165;
            case 126 -> 95;
            case 127 -> 13;
            case 128 -> 157;
            case 129 -> 151;
            case 130 -> 207;
            case 131 -> 249;
            case 132 -> 113;
            case 133 -> 82;
            case 134 -> 47;
            case 135 -> 109;
            case 136 -> 72;
            case 137 -> 2;
            case 138 -> 243;
            case 139 -> 65;
            case 140 -> 211;
            case 141 -> 220;
            case 142 -> 56;
            case 143 -> 71;
            case 144 -> 83;
            case 145 -> 123;
            case 146 -> 75;
            case 147 -> 119;
            case 148 -> 174;
            case 149 -> 32;
            case 150 -> 22;
            case 151 -> 18;
            case 152 -> 100;
            case 153 -> 104;
            case 154 -> 8;
            case 155 -> 153;
            case 156 -> 193;
            case 157 -> 199;
            case 158 -> 156;
            case 159 -> 111;
            case 160 -> 67;
            case 161 -> 7;
            case 162 -> 164;
            case 163 -> 116;
            case 164 -> 30;
            case 165 -> 184;
            case 166 -> 87;
            case 167 -> 217;
            case 168 -> 236;
            case 169 -> 11;
            case 170 -> 137;
            case 171 -> 27;
            case 172 -> 178;
            case 173 -> 160;
            case 174 -> 36;
            case 175 -> 143;
            case 176 -> 215;
            case 177 -> 101;
            case 178 -> 86;
            case 179 -> 53;
            case 180 -> 228;
            case 181 -> 188;
            case 182 -> 251;
            case 183 -> 77;
            case 184 -> 231;
            case 185 -> 170;
            case 186 -> 182;
            case 187 -> 189;
            case 188 -> 241;
            case 189 -> 201;
            case 190 -> 6;
            case 191 -> 214;
            case 192 -> 69;
            case 193 -> 105;
            case 194 -> 29;
            case 195 -> 148;
            case 196 -> 161;
            case 197 -> 158;
            case 198 -> 62;
            case 199 -> 64;
            case 200 -> 78;
            case 201 -> 179;
            case 202 -> 85;
            case 203 -> 121;
            case 204 -> 224;
            case 205 -> 80;
            case 206 -> 0;
            case 207 -> 31;
            case 208 -> 140;
            case 209 -> 97;
            case 210 -> 183;
            case 211 -> 147;
            case 212 -> 172;
            case 213 -> 28;
            case 214 -> 238;
            case 215 -> 24;
            case 216 -> 212;
            case 217 -> 107;
            case 218 -> 244;
            case 219 -> 233;
            case 220 -> 235;
            case 221 -> 181;
            case 222 -> 180;
            case 223 -> 223;
            case 224 -> 48;
            case 225 -> 70;
            case 226 -> 39;
            case 227 -> 168;
            case 228 -> 117;
            case 229 -> 103;
            case 230 -> 12;
            case 231 -> 254;
            case 232 -> 50;
            case 233 -> 89;
            case 234 -> 175;
            case 235 -> 1;
            case 236 -> 54;
            case 237 -> 128;
            case 238 -> 10;
            case 239 -> 162;
            case 240 -> 3;
            case 241 -> 99;
            case 242 -> 216;
            case 243 -> 132;
            case 244 -> 16;
            case 245 -> 149;
            case 246 -> 44;
            case 247 -> 173;
            case 248 -> 14;
            case 249 -> 74;
            case 250 -> 198;
            case 251 -> 203;
            case 252 -> 93;
            case 253 -> 102;
            case 254 -> 253;
            default -> 115;
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
   }
}
