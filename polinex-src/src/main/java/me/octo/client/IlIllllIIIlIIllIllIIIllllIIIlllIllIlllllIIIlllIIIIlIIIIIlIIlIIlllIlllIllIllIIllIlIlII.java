package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII {

   private int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final ArrayList<lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>(
      8
   );
   @NotNull
   private final HashSet<Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new HashSet<>(16);
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   public final int a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final void a(int var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @NotNull
   public final ArrayList<lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII> b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final HashSet<Integer> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = f();
      short var10002 = -23279;
      short var10003 = 20663;
      Intrinsics.checkNotNullParameter(var1, "event");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      ClientboundLevelParticlesPacket var3 = var1.k();
      IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII var10 = this;
      if (var2 != null) {
         if (!this.a(var3)) {
            return;
         }

         var10 = this;
      }

      Iterable var4 = var10.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var5 = false;

      for (Object var7 : var4) {
         lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var8 = (lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII)var7;
         boolean var9 = false;
         var8.a(new Vec3(var3.getX(), var3.getY(), var3.getZ()));
         if (var2 != null && var2 != null) {
            continue;
         }
         break;
      }
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1) {
      short var10001 = -23278;
      short var10002 = -13179;
      Intrinsics.checkNotNullParameter(var1, "event");
      int var3 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = f();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3 + 1;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII var11 = this;
      if (var2 != null) {
         if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl % 20 != 0) {
            return;
         }

         var11 = this;
      }

      var11.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 0;
      me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var12 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      List var14 = CollectionsKt.listOf(ArmorStand.class);
      var10002 = -23277;
      short var10003 = 30116;
      List var10 = var12.a(var14, CollectionsKt.listOf("HOTSPOT"));
      Iterable var4 = var10;
      boolean var5 = false;
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            Entity var8 = (Entity)var7;
            boolean var9 = false;
            if (var2 != null) {
               boolean var13 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(var8.getId());
               if (var2 == null) {
                  break;
               }

               if (var13) {
                  this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                     .add(
                        new lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII(
                           me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(var8),
                           var8.getId()
                        )
                     );
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .removeIf(null);
         break;
      }
   }

   public final boolean a(@NotNull ClientboundLevelParticlesPacket var1) {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = f();
      short var10002 = -23274;
      short var10003 = 5738;
      Intrinsics.checkNotNullParameter(var1, "particle");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      int var3 = ((int[])IlIllllIIIlIIllIllIIIllllIIIlllIllIlllllIIIlllIIIIlIIIIIlIIlIIlllIlllIllIllIIllIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)[IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .g()
         .ordinal()];
      if (var2 != null) {
         switch (var3) {
            case 1:
               var3 = ((Intrinsics.areEqual(var1.getParticle().getType(), ParticleTypes.DUST)) ? 1 : 0);
               break;
            case 2:
               boolean var8 = Intrinsics.areEqual(var1.getParticle().getType(), ParticleTypes.SMOKE);
               if (var2 != null) {
                  label86: {
                     if (var8) {
                        float var6;
                        int var4 = (var6 = var1.getMaxSpeed() - 0.0F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
                        if (var2 != null) {
                           var4 = (((var4 == 0) ? 1 : 0));
                        }

                        if ((var4 != 0)) {
                           int var9 = var1.getCount();
                           if (var2 == null) {
                              return (var9 != 0);
                           }

                           if (var9 == 5) {
                              break label86;
                           }

                           int var10 = var1.getCount();
                           if (var2 == null) {
                              return (var10 != 0);
                           }

                           if (var10 == 2) {
                              break label86;
                           }
                        }
                     }

                     return (0 != 0);
                  }

                  var8 = true;
               }

               return var8;
            default:
               return (0 != 0);
         }
      }

      if (var2 != null) {
         if (var3 != 0) {
            float var7;
            int var5 = (var7 = var1.getMaxSpeed() - 1.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
            if (var2 != null) {
               var5 = (((var5 == 0) ? 1 : 0));
            }

            if ((var5 != 0)) {
               int var11 = var1.getCount();
               if (var2 == null) {
                  return (var11 != 0);
               }

               if (var11 == 0) {
                  return (1 != 0);
               }
            }
         }

         var3 = 0;
      }

      return (var3 != 0);
   }

   public final void d() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .a(this);
   }

   public final void e() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this);
   }

   private static final boolean a(List var0, lIllIlllIIIlllllIIIIIllllIIlIIlIlIIIIIIIlIIlIIIlIlIIIIIIIIllIlIlIlIIlIIIlIlIIllIIllII var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2;
      Object var9;
      var9 = f();
      short var10002 = -23280;
      short var10003 = -31726;
      Intrinsics.checkNotNullParameter(var1, "it");
      var2 = (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[])var9;
      var var3 = var0;
      boolean var4 = false;
      var9 = var3;
      label44:
      if (var2 != null) {
         if (var3 instanceof Collection) {
            var9 = (Collection)var3;
            if (var2 == null) {
               break label44;
            }

            if (((me.octo.client.PXDyn)var9).isEmpty()) {
               return (1 != 0);
            }
         }

         var9 = var3;
      }

      label35:
      for (Object var6 : (Iterable<?>)(var9)) {
         Entity var7 = (Entity)var6;
         boolean var8 = false;
         int var10 = var1.b();

         do {
            if (var2 != null) {
               var10 = var10 == var7.getId() ? 1 : 0;
            }

            if (var10 == 0) {
               continue label35;
            }

            var10 = 0;
         } while (var2 == null);

         return (0 != 0);
      }

      return (1 != 0);
   }

   private static final boolean a(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] f() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[5];
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2];
      int var3 = 0;
      b(var10000);
      String var2 = "e\u00adÝa'\u0007¶\u0084\u001egl°º\u0002ê\u001d";
      int var4 = "e\u00adÝa'\u0007¶\u0084\u001egl°º\u0002ê\u001d".length();
      char var1 = 5;
      int var8 = -1;

      label52:
while (true) {
         byte var9 = 70;
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
                     case 0 -> 122;
                     case 1 -> 30;
                     case 2 -> 28;
                     case 3 -> 79;
                     case 4 -> 44;
                     case 5 -> 77;
                     default -> 50;
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
                     a = var5;
                     b = new String[5];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "jº\u009c#¯\b\u001e?²|\u0082\u009cá\u0004";
                  var4 = "jº\u009c#¯\b\u001e?²|\u0082\u009cá\u0004".length();
                  var1 = 5;
                  var8 = -1;
            }

            var9 = 98;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -23278) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 130;
            case 1 -> 249;
            case 2 -> 134;
            case 3 -> 101;
            case 4 -> 197;
            case 5 -> 7;
            case 6 -> 244;
            case 7 -> 35;
            case 8 -> 186;
            case 9 -> 169;
            case 10 -> 141;
            case 11 -> 171;
            case 12 -> 85;
            case 13 -> 100;
            case 14 -> 198;
            case 15 -> 230;
            case 16 -> 98;
            case 17 -> 164;
            case 18 -> 30;
            case 19 -> 11;
            case 20 -> 167;
            case 21 -> 200;
            case 22 -> 148;
            case 23 -> 227;
            case 24 -> 78;
            case 25 -> 49;
            case 26 -> 91;
            case 27 -> 144;
            case 28 -> 33;
            case 29 -> 207;
            case 30 -> 216;
            case 31 -> 215;
            case 32 -> 55;
            case 33 -> 104;
            case 34 -> 105;
            case 35 -> 113;
            case 36 -> 112;
            case 37 -> 123;
            case 38 -> 225;
            case 39 -> 90;
            case 40 -> 86;
            case 41 -> 170;
            case 42 -> 108;
            case 43 -> 41;
            case 44 -> 107;
            case 45 -> 137;
            case 46 -> 177;
            case 47 -> 36;
            case 48 -> 253;
            case 49 -> 13;
            case 50 -> 196;
            case 51 -> 236;
            case 52 -> 79;
            case 53 -> 27;
            case 54 -> 158;
            case 55 -> 155;
            case 56 -> 38;
            case 57 -> 242;
            case 58 -> 254;
            case 59 -> 195;
            case 60 -> 59;
            case 61 -> 23;
            case 62 -> 42;
            case 63 -> 252;
            case 64 -> 57;
            case 65 -> 125;
            case 66 -> 102;
            case 67 -> 218;
            case 68 -> 179;
            case 69 -> 28;
            case 70 -> 241;
            case 71 -> 211;
            case 72 -> 127;
            case 73 -> 243;
            case 74 -> 154;
            case 75 -> 51;
            case 76 -> 54;
            case 77 -> 184;
            case 78 -> 43;
            case 79 -> 180;
            case 80 -> 199;
            case 81 -> 133;
            case 82 -> 4;
            case 83 -> 175;
            case 84 -> 111;
            case 85 -> 245;
            case 86 -> 251;
            case 87 -> 75;
            case 88 -> 126;
            case 89 -> 73;
            case 90 -> 17;
            case 91 -> 22;
            case 92 -> 72;
            case 93 -> 32;
            case 94 -> 232;
            case 95 -> 14;
            case 96 -> 26;
            case 97 -> 80;
            case 98 -> 136;
            case 99 -> 119;
            case 100 -> 185;
            case 101 -> 6;
            case 102 -> 174;
            case 103 -> 182;
            case 104 -> 240;
            case 105 -> 235;
            case 106 -> 21;
            case 107 -> 188;
            case 108 -> 189;
            case 109 -> 201;
            case 110 -> 56;
            case 111 -> 15;
            case 112 -> 20;
            case 113 -> 139;
            case 114 -> 160;
            case 115 -> 5;
            case 116 -> 246;
            case 117 -> 161;
            case 118 -> 165;
            case 119 -> 168;
            case 120 -> 99;
            case 121 -> 76;
            case 122 -> 10;
            case 123 -> 222;
            case 124 -> 34;
            case 125 -> 233;
            case 126 -> 39;
            case 127 -> 203;
            case 128 -> 18;
            case 129 -> 53;
            case 130 -> 40;
            case 131 -> 118;
            case 132 -> 238;
            case 133 -> 212;
            case 134 -> 247;
            case 135 -> 187;
            case 136 -> 87;
            case 137 -> 166;
            case 138 -> 226;
            case 139 -> 151;
            case 140 -> 52;
            case 141 -> 60;
            case 142 -> 69;
            case 143 -> 228;
            case 144 -> 1;
            case 145 -> 124;
            case 146 -> 178;
            case 147 -> 2;
            case 148 -> 135;
            case 149 -> 128;
            case 150 -> 129;
            case 151 -> 149;
            case 152 -> 150;
            case 153 -> 204;
            case 154 -> 223;
            case 155 -> 48;
            case 156 -> 210;
            case 157 -> 239;
            case 158 -> 64;
            case 159 -> 214;
            case 160 -> 206;
            case 161 -> 143;
            case 162 -> 202;
            case 163 -> 153;
            case 164 -> 61;
            case 165 -> 209;
            case 166 -> 217;
            case 167 -> 94;
            case 168 -> 77;
            case 169 -> 219;
            case 170 -> 132;
            case 171 -> 140;
            case 172 -> 109;
            case 173 -> 224;
            case 174 -> 0;
            case 175 -> 250;
            case 176 -> 37;
            case 177 -> 24;
            case 178 -> 65;
            case 179 -> 248;
            case 180 -> 71;
            case 181 -> 172;
            case 182 -> 29;
            case 183 -> 121;
            case 184 -> 19;
            case 185 -> 162;
            case 186 -> 70;
            case 187 -> 229;
            case 188 -> 192;
            case 189 -> 44;
            case 190 -> 159;
            case 191 -> 147;
            case 192 -> 234;
            case 193 -> 12;
            case 194 -> 96;
            case 195 -> 117;
            case 196 -> 63;
            case 197 -> 74;
            case 198 -> 81;
            case 199 -> 194;
            case 200 -> 146;
            case 201 -> 181;
            case 202 -> 131;
            case 203 -> 97;
            case 204 -> 16;
            case 205 -> 110;
            case 206 -> 213;
            case 207 -> 173;
            case 208 -> 221;
            case 209 -> 152;
            case 210 -> 191;
            case 211 -> 88;
            case 212 -> 156;
            case 213 -> 3;
            case 214 -> 83;
            case 215 -> 89;
            case 216 -> 8;
            case 217 -> 45;
            case 218 -> 163;
            case 219 -> 47;
            case 220 -> 93;
            case 221 -> 66;
            case 222 -> 67;
            case 223 -> 114;
            case 224 -> 237;
            case 225 -> 157;
            case 226 -> 103;
            case 227 -> 46;
            case 228 -> 25;
            case 229 -> 116;
            case 230 -> 120;
            case 231 -> 193;
            case 232 -> 122;
            case 233 -> 9;
            case 234 -> 231;
            case 235 -> 115;
            case 236 -> 68;
            case 237 -> 58;
            case 238 -> 145;
            case 239 -> 31;
            case 240 -> 205;
            case 241 -> 183;
            case 242 -> 84;
            case 243 -> 82;
            case 244 -> 255;
            case 245 -> 176;
            case 246 -> 190;
            case 247 -> 62;
            case 248 -> 220;
            case 249 -> 142;
            case 250 -> 138;
            case 251 -> 50;
            case 252 -> 92;
            case 253 -> 95;
            case 254 -> 106;
            default -> 208;
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
