package me.octo.client;

import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.minecraft.client.Minecraft;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlllIlIlIlIIlIIIIIIIIIllIlllIlIlIlllllIlIllIlllIlIIIIIlIlllllIlIllllIIIlIIllIlIlllIIl {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private LevelRenderContext lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String a;

   public IlllIlIlIlIIlIIIIIIIIIllIlllIlIlIlllllIlIllIlllIlIIIIIlIlllllIlIllllIIIlIIllIlIlllIIl() {
      Minecraft var10001 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var10001, a);
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
   }

   @Nullable
   public final LevelRenderContext a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void a(@Nullable LevelRenderContext var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @Export
   public final int a(int var1, int var2, int var3) {
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1, var2, var3).o();
   }

   @Export
   public final int a(int var1, int var2, int var3, int var4) {
      return new me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll(var1, var2, var3, var4).o();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      char[] var10003 = "\u0018\u001fn/\t{\u000e\u001e\u0014y\u0003O&TQS".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 57;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 57;
         var10006 = var0;
      } else {
         var6 = 57;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            break pxClinit;
         }

         var10005 = var10003;
         var10 = 57;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10 ^ switch (var0 % 7) {
            case 0 -> 70;
            case 1 -> 67;
            case 2 -> 35;
            case 3 -> 95;
            case 4 -> 94;
            case 5 -> 49;
            default -> 67;
         });
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               break pxClinit;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
      }
   }
}
