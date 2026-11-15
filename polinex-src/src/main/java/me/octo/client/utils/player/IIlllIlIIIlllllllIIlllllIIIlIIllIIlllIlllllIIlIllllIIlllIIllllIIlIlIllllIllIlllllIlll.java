package me.octo.client.utils.player;

import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
   extends me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] c;
   private static String[] d;

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   @NotNull
   public final List<Entity> a(@NotNull List<? extends Class<? extends Entity>> var1, @NotNull List<String> var2) {
       List<Entity> var43 = null; // PX-FIX decl var43
      boolean var45 = false; // PX-FIX
      Object var44 = null; // PX-FIX
      boolean var41 = false; // PX-FIX
      Object var39 = null; // PX-FIX
      short var10001 = 6752;
      short var10002 = 30374;
      Intrinsics.checkNotNullParameter(var1, "mobClasses");
      var10001 = 6755;
      var10002 = -10012;
      Intrinsics.checkNotNullParameter(var2, "mobNames");
      ClientLevel var10000 = this.a().level;
      Intrinsics.checkNotNull(var10000);
      Iterable var35 = var10000.entitiesForRendering();
      var10002 = 6763;
      short var10003 = -10836;
      Intrinsics.checkNotNullExpressionValue(var35, "entitiesForRendering(...)");
      Iterable var4 = var35;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var36 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      boolean var5 = false;
      Iterable var6 = var4;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var36;
      var var7 = new ArrayList();
      boolean var8 = false;
      Iterator var9 = var4.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            boolean var37 = var10 instanceof Entity;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               if (!var37) {
                  continue;
               }

               var7.add(var10);
            }

            if (var3 != null) {
               continue;
            }
         }

         var4 = var7;
         var5 = false;
         var6 = var4;
         var7 = new ArrayList();
         boolean var38 = false;
         break;
      }

      var9 = var6.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var25;
            label141: {
               Entity var11;
               var25 = var9.next();
               var11 = (Entity)var25;
               boolean var12 = false;
               var var13 = var1;
               boolean var14 = false;
               var39 = var13;
               label117:
               if (var3 != null) {
                  boolean var40 = var13 instanceof Collection;
                  if (var3 == null) {
                     break;
                  }

                  if (var40) {
                     var39 = (Collection)var13;
                     if (var3 == null) {
                        break label117;
                     }

                     if (((me.octo.client.PXDyn)var39).isEmpty()) {
                        var41 = false;
                        break label141;
                     }
                  }

                  var39 = var13;
               }

               Iterator var15 = ((me.octo.client.PXDyn)var39).iterator();

               label109:
               while (true) {
                  if (!var15.hasNext()) {
                     var41 = false;
                     break;
                  }

                  Object var16 = var15.next();
                  Class var17 = (Class)var16;
                  boolean var18 = false;
                  var41 = var17.isAssignableFrom(var11.getClass());

                  while (var41) {
                     var41 = true;
                     if (var3 != null) {
                        break label109;
                     }
                  }
               }
            }

            if (var3 != null) {
               if (!var41) {
                  continue;
               }

               var7.add(var25);
            }

            if (var3 != null) {
               continue;
            }
         }

         var4 = var7;
         var5 = false;
         var6 = var4;
         var7 = new ArrayList();
         boolean var42 = false;
         break;
      }

      var9 = var6.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var26 = var9.next();
            Entity var27 = (Entity)var26;
            boolean var28 = false;
            var43 = ((List<Entity>)(Object)(var2));
            if (var3 == null) {
               break;
            }

            label145: {
               var var29 = var2;
               boolean var30 = false;
               var44 = var29;
               label83:
               if (var3 != null) {
                  if (var29 instanceof Collection) {
                     var44 = (Collection)var29;
                     if (var3 == null) {
                        break label83;
                     }

                     if (((me.octo.client.PXDyn)var44).isEmpty()) {
                        var45 = false;
                        break label145;
                     }
                  }

                  var44 = var29;
               }

               Iterator var31 = ((me.octo.client.PXDyn)var44).iterator();

               label76:
               while (true) {
                  if (!var31.hasNext()) {
                     var45 = false;
                     break;
                  }

                  Object var32 = var31.next();
                  String var33 = (String)var32;
                  boolean var34 = false;
                  String var46 = var27.getName().getString();
                  var10002 = 6760;
                  var10003 = 14520;
                  Intrinsics.checkNotNullExpressionValue(var46, "getString(...)");
                  var45 = StringsKt.contains(var46, var33, false);

                  while (var45) {
                     var45 = true;
                     if (var3 != null) {
                        break label76;
                     }
                  }
               }
            }

            if (var3 != null) {
               if (!var45) {
                  continue;
               }

               var7.add(var26);
            }

            if (var3 != null) {
               continue;
            }
         }

         var43 = var7;
         break;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b(
            new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[2]
         );
      }

      return var43;
   }

   @Nullable
   public final Entity b(int var1) {
      Object var10 = null; // PX-FIX
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      if (var2 != null) {
         ClientLevel var10000 = this.a().level;
         if (var10000 != null) {
            Iterable var9 = var10000.entitiesForRendering();
            if (var9 != null) {
               Iterable var3 = var9;
               boolean var4 = false;
               Iterator var5 = var3.iterator();

               label41:
               while (true) {
                  if (var5.hasNext()) {
                     Object var6 = var5.next();
                     var10 = var6;

                     while (true) {
                        Entity var7 = (Entity)var10;
                        boolean var8 = false;
                        int var11 = var7.getId();
                        if (var2 != null) {
                           var11 = var11 == var1 ? 1 : 0;
                        }

                        if (var11 == 0) {
                           continue label41;
                        }

                        var10 = var6;
                        if (var2 != null) {
                           break label41;
                        }
                     }
                  }

                  var10 = null;
                  break;
               }

               Entity var12 = (Entity)var10;
               if (var2 != null) {
                  return var12;
               }
            }
         }
      }

      return null;
   }

   @JvmStatic
   @NotNull
   public static final HitResult a(@NotNull Entity var0, double var1, float var3, float var4, float var5) {
      short var10001 = 6764;
      short var10002 = -17501;
      Intrinsics.checkNotNullParameter(var0, "entity");
      Vec3 var10000 = var0.getEyePosition(var3);
      var10002 = 6759;
      short var10003 = -750;
      Intrinsics.checkNotNullExpressionValue(var10000, "getEyePosition(...)");
      Vec3 var6 = var10000;
      Vec3 var7 = a(var5, var4);
      var10000 = var6.add(var7.x * var1, var7.y * var1, var7.z * var1);
      var10002 = 6754;
      var10003 = 17265;
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      Vec3 var8 = var10000;
      ClientLevel var10 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().level;
      Intrinsics.checkNotNull(var10);
      BlockHitResult var11 = var10.clip(new ClipContext(var6, var8, Block.OUTLINE, Fluid.NONE, var0));
      var10002 = 6762;
      var10003 = 12736;
      Intrinsics.checkNotNullExpressionValue(var11, "clip(...)");
      return var11;
   }

   @JvmStatic
   @NotNull
   public static final HitResult a(@NotNull BlockPos var0) {
      short var10001 = 6761;
      short var10002 = 4448;
      Intrinsics.checkNotNullParameter(var0, "pos");
      Vec3 var1 = Vec3.atCenterOf(var0);
      LocalPlayer var10003 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a().player;
      Intrinsics.checkNotNull(var10003);
      return new BlockHitResult(var1, Direction.fromYRot(var10003.getYRot()), var0, false);
   }

   @JvmStatic
   @NotNull
   public static final Vec3 a(float var0, float var1) {
      double var2 = var0 * (float) (Math.PI / 180.0);
      double var4 = -var1 * (float) (Math.PI / 180.0);
      double var6 = Math.cos(var4);
      double var8 = Math.sin(var4);
      double var10 = Math.cos(var2);
      double var12 = Math.sin(var2);
      return new Vec3(var8 * var10, -var12, var6 * var10);
   }

   public final void g() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      List var2 = new ArrayList();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      ClientLevel var6 = this.a().level;
      Intrinsics.checkNotNull(var6);

      for (Object var7 : var6.entitiesForRendering()) {
         short var10002 = 6753;
         short var10003 = -19900;
         Intrinsics.checkNotNullExpressionValue(var7, "next(...)");
         Entity var4 = (Entity)var7;
         LocalPlayer var8 = this.a().player;
         Intrinsics.checkNotNull(var8);
         float var14;
         int var9 = (var14 = var8.distanceTo(var4) - 32.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         if (var1 != null) {
            if (var9 > 0) {
               continue;
            }

            var9 = ((var4 instanceof ArmorStand) ? 1 : 0);
         }

         if (var1 != null) {
            if (var9 == 0) {
               continue;
            }

            Component var10 = var4.getName();
            String var10001 = var4.getName().tryCollapseToString();
            var10002 = 6757;
            var10003 = -15316;
            var10003 = 6779;
            short var10004 = -16093;
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
               "found armour stand: " + var10 + " with literal text " + var10001
            );
            var2.add(var4);
         }

         if (var1 == null) {
            break;
         }
      }

      boolean var5 = false;
      if (var1 != null && var2.size() > 1) {
         CollectionsKt.sortWith(
            var2,
            new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final Vec3 a(@NotNull Entity var0) {
      short var10001 = 6765;
      short var10002 = 22050;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      return new Vec3(var0.getX(), var0.getY(), var0.getZ());
   }

   @JvmStatic
   @Nullable
   public static final String a(@NotNull RemotePlayer var0) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.h();
      short var10002 = 6758;
      short var10003 = -10303;
      Intrinsics.checkNotNullParameter(var0, "<this>");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      PropertyMap var6 = var0.getGameProfile().properties();
      short var10001 = 6778;
      var10002 = 17407;
      Collection var7 = var6.get("textures");
      var10002 = 6756;
      var10003 = 19554;
      Intrinsics.checkNotNullExpressionValue(var7, "get(...)");
      Property var2 = (Property)CollectionsKt.firstOrNull(var7);
      if (var2 == null) {
         return null;
      } else {
         byte[] var8 = Base64.getDecoder().decode(var2.value());
         var10002 = 6766;
         var10003 = 13682;
         Intrinsics.checkNotNullExpressionValue(var8, "decode(...)");
         byte[] var4 = var8;
         String var3 = new String(var4, Charsets.UTF_8);
         var10002 = 6767;
         var10003 = -23927;
         Regex var5 = new Regex("\"url\"\\s*:\\s*\"http://textures\\.minecraft\\.net/texture/([a-f0-9]+)\"");
         if (var1 != null) {
            MatchResult var9 = (var5).find( var3, 0);
            if (var9 != null) {
               Object var10 = var9.getGroupValues();
               if (var1 != null) {
                  if (var10 == null) {
                     return null;
                  }

                  var10 = ((me.octo.client.PXDyn)var10).get(1);
               }

               String var11 = (String)var10;
               if (var1 != null) {
                  return var11;
               }
            }
         }

         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[18];
      int var3 = 0;
      b(true);
      String var2 = "\u0087\u008c\u0095\u0099°< =ë\rCý\u0013`Bª\n7\u009fçÑÔY\u0087+\t\u0094%,÷e\u008c\u0006Ùb\u00033ú³\u000eÂi\u007fuíÇ\u0087'³·\u0011yÅDAôóR\u000bØþ§¯³\u001eº²JøÖn\u0088ÏÌ\u0089\u008e\u00133\u0007¦äHz\u0011\u001c@Ã*{,Y\u008b©\u008aO§ù÷\u0088À];\u000bsî\u0086»\u0001\u001a\u0093¦â\u009f<¶\u0004!\u001cv\u008f\u000bß\u008a¨5òc7\u0006\u0085Ý°\u0006\n¿J¦Ó\u008c\u0006\u0086¼µ\u009f´ì\béöGÐ+Òäd\bÎ´(\u0094O³\u00859\t 0\u0017y1Ù\u008cs3\n+Ð\u001f\u0019-K\u009eÚËí\u0013Å\u0099\u009f}ü\u00050\u008bOBBéÿ¾Ø:À@V\u0006\u0089Þ:\u008aÝ\t\u0014ÔL\u009d§\u0080U0qF¥¿È.ÿ\u0018ãO\u0097ü\u0018\b%8\u0083$(¥iû";
      int var4 = "\u0087\u008c\u0095\u0099°< =ë\rCý\u0013`Bª\n7\u009fçÑÔY\u0087+\t\u0094%,÷e\u008c\u0006Ùb\u00033ú³\u000eÂi\u007fuíÇ\u0087'³·\u0011yÅDAôóR\u000bØþ§¯³\u001eº²JøÖn\u0088ÏÌ\u0089\u008e\u00133\u0007¦äHz\u0011\u001c@Ã*{,Y\u008b©\u008aO§ù÷\u0088À];\u000bsî\u0086»\u0001\u001a\u0093¦â\u009f<¶\u0004!\u001cv\u008f\u000bß\u008a¨5òc7\u0006\u0085Ý°\u0006\n¿J¦Ó\u008c\u0006\u0086¼µ\u009f´ì\béöGÐ+Òäd\bÎ´(\u0094O³\u00859\t 0\u0017y1Ù\u008cs3\n+Ð\u001f\u0019-K\u009eÚËí\u0013Å\u0099\u009f}ü\u00050\u008bOBBéÿ¾Ø:À@V\u0006\u0089Þ:\u008aÝ\t\u0014ÔL\u009d§\u0080U0qF¥¿È.ÿ\u0018ãO\u0097ü\u0018\b%8\u0083$(¥iû"
         .length();
      char var1 = 25;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 29;
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
                     case 1 -> 80;
                     case 2 -> 73;
                     case 3 -> 118;
                     case 4 -> 27;
                     case 5 -> 82;
                     default -> 116;
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
                     c = var5;
                     d = new String[18];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "À\\t]×ª£lx\u008d¼l\u001c°bÎï_ß\b\u009fãPú}\fAº";
                  var4 = "À\\t]×ª£lx\u008d¼l\u001c°bÎï_ß\b\u009fãPú}\fAº".length();
                  var1 = 19;
                  var8 = -1;
            }

            var10000 = 35;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(boolean var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   public static boolean h() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static boolean i() {
      boolean var0 = h();
      return !var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 6763) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 96;
            case 1 -> 251;
            case 2 -> 235;
            case 3 -> 188;
            case 4 -> 81;
            case 5 -> 17;
            case 6 -> 65;
            case 7 -> 254;
            case 8 -> 138;
            case 9 -> 133;
            case 10 -> 222;
            case 11 -> 183;
            case 12 -> 248;
            case 13 -> 120;
            case 14 -> 29;
            case 15 -> 214;
            case 16 -> 40;
            case 17 -> 121;
            case 18 -> 88;
            case 19 -> 157;
            case 20 -> 221;
            case 21 -> 249;
            case 22 -> 217;
            case 23 -> 70;
            case 24 -> 48;
            case 25 -> 62;
            case 26 -> 128;
            case 27 -> 98;
            case 28 -> 193;
            case 29 -> 94;
            case 30 -> 206;
            case 31 -> 42;
            case 32 -> 159;
            case 33 -> 52;
            case 34 -> 174;
            case 35 -> 124;
            case 36 -> 126;
            case 37 -> 195;
            case 38 -> 136;
            case 39 -> 201;
            case 40 -> 203;
            case 41 -> 102;
            case 42 -> 169;
            case 43 -> 55;
            case 44 -> 129;
            case 45 -> 189;
            case 46 -> 22;
            case 47 -> 32;
            case 48 -> 84;
            case 49 -> 92;
            case 50 -> 191;
            case 51 -> 7;
            case 52 -> 170;
            case 53 -> 122;
            case 54 -> 97;
            case 55 -> 236;
            case 56 -> 205;
            case 57 -> 234;
            case 58 -> 155;
            case 59 -> 82;
            case 60 -> 66;
            case 61 -> 49;
            case 62 -> 252;
            case 63 -> 12;
            case 64 -> 182;
            case 65 -> 60;
            case 66 -> 24;
            case 67 -> 204;
            case 68 -> 186;
            case 69 -> 219;
            case 70 -> 245;
            case 71 -> 167;
            case 72 -> 142;
            case 73 -> 211;
            case 74 -> 23;
            case 75 -> 2;
            case 76 -> 171;
            case 77 -> 101;
            case 78 -> 192;
            case 79 -> 132;
            case 80 -> 199;
            case 81 -> 116;
            case 82 -> 46;
            case 83 -> 89;
            case 84 -> 213;
            case 85 -> 18;
            case 86 -> 177;
            case 87 -> 57;
            case 88 -> 134;
            case 89 -> 152;
            case 90 -> 229;
            case 91 -> 16;
            case 92 -> 131;
            case 93 -> 220;
            case 94 -> 30;
            case 95 -> 165;
            case 96 -> 151;
            case 97 -> 71;
            case 98 -> 200;
            case 99 -> 26;
            case 100 -> 20;
            case 101 -> 230;
            case 102 -> 168;
            case 103 -> 202;
            case 104 -> 139;
            case 105 -> 127;
            case 106 -> 107;
            case 107 -> 190;
            case 108 -> 19;
            case 109 -> 1;
            case 110 -> 208;
            case 111 -> 162;
            case 112 -> 56;
            case 113 -> 227;
            case 114 -> 143;
            case 115 -> 212;
            case 116 -> 253;
            case 117 -> 61;
            case 118 -> 10;
            case 119 -> 47;
            case 120 -> 41;
            case 121 -> 255;
            case 122 -> 161;
            case 123 -> 35;
            case 124 -> 146;
            case 125 -> 64;
            case 126 -> 216;
            case 127 -> 241;
            case 128 -> 68;
            case 129 -> 3;
            case 130 -> 0;
            case 131 -> 178;
            case 132 -> 218;
            case 133 -> 233;
            case 134 -> 149;
            case 135 -> 110;
            case 136 -> 115;
            case 137 -> 119;
            case 138 -> 79;
            case 139 -> 144;
            case 140 -> 231;
            case 141 -> 4;
            case 142 -> 103;
            case 143 -> 104;
            case 144 -> 215;
            case 145 -> 181;
            case 146 -> 118;
            case 147 -> 27;
            case 148 -> 141;
            case 149 -> 73;
            case 150 -> 210;
            case 151 -> 5;
            case 152 -> 137;
            case 153 -> 172;
            case 154 -> 105;
            case 155 -> 140;
            case 156 -> 91;
            case 157 -> 80;
            case 158 -> 6;
            case 159 -> 109;
            case 160 -> 114;
            case 161 -> 76;
            case 162 -> 77;
            case 163 -> 8;
            case 164 -> 145;
            case 165 -> 34;
            case 166 -> 247;
            case 167 -> 90;
            case 168 -> 51;
            case 169 -> 33;
            case 170 -> 166;
            case 171 -> 194;
            case 172 -> 184;
            case 173 -> 14;
            case 174 -> 164;
            case 175 -> 232;
            case 176 -> 86;
            case 177 -> 74;
            case 178 -> 112;
            case 179 -> 153;
            case 180 -> 100;
            case 181 -> 44;
            case 182 -> 197;
            case 183 -> 13;
            case 184 -> 237;
            case 185 -> 246;
            case 186 -> 198;
            case 187 -> 147;
            case 188 -> 39;
            case 189 -> 239;
            case 190 -> 250;
            case 191 -> 163;
            case 192 -> 243;
            case 193 -> 67;
            case 194 -> 95;
            case 195 -> 21;
            case 196 -> 154;
            case 197 -> 78;
            case 198 -> 228;
            case 199 -> 58;
            case 200 -> 11;
            case 201 -> 108;
            case 202 -> 176;
            case 203 -> 185;
            case 204 -> 85;
            case 205 -> 175;
            case 206 -> 111;
            case 207 -> 113;
            case 208 -> 9;
            case 209 -> 37;
            case 210 -> 179;
            case 211 -> 117;
            case 212 -> 50;
            case 213 -> 53;
            case 214 -> 87;
            case 215 -> 63;
            case 216 -> 225;
            case 217 -> 223;
            case 218 -> 160;
            case 219 -> 123;
            case 220 -> 224;
            case 221 -> 148;
            case 222 -> 99;
            case 223 -> 69;
            case 224 -> 156;
            case 225 -> 242;
            case 226 -> 28;
            case 227 -> 38;
            case 228 -> 135;
            case 229 -> 31;
            case 230 -> 72;
            case 231 -> 59;
            case 232 -> 25;
            case 233 -> 106;
            case 234 -> 187;
            case 235 -> 158;
            case 236 -> 173;
            case 237 -> 240;
            case 238 -> 196;
            case 239 -> 244;
            case 240 -> 45;
            case 241 -> 238;
            case 242 -> 93;
            case 243 -> 150;
            case 244 -> 207;
            case 245 -> 36;
            case 246 -> 15;
            case 247 -> 226;
            case 248 -> 83;
            case 249 -> 54;
            case 250 -> 125;
            case 251 -> 43;
            case 252 -> 180;
            case 253 -> 75;
            case 254 -> 209;
            default -> 130;
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
}
