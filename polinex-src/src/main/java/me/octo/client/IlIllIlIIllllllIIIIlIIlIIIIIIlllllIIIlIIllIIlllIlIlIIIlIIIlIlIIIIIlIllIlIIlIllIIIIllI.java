package me.octo.client;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

public abstract class IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI
   extends llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl {
   @Override
   public void c(char var1, int var2) {
      int var3 = llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl.ak();
      int var10000 = 0;
      boolean var10000x = this.ag()
         .a(
            var2,
            () -> a(this),
            () -> b(this)
         );
      if (var3 == 0) {
         if (var10000x) {
            this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
            return;
         }

         var10000 = var2;
      }

      if (var3 == 0) {
         switch (var10000) {
            case 259:
               if (var3 == 0) {
                  if (this.ag().a(() -> c(this))) {
                     this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
                     if (var3 == 0) {
                        return;
                     }
                  }

                  var10000 = this.ad().length();
               }

               if (var3 == 0) {
                  var10000 = var10000 > 0 ? 1 : 0;
               }

               if (var10000 == 0) {
                  return;
               }

               this.am();
               this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
               if (var3 == 0) {
                  return;
               }
            case 256:
               this.ag().b();
               this.ai();
               this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
               if (var3 == 0) {
                  return;
               }
            case 257:
            case 258:
            default:
               var10000 = ((me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var2)) ? 1 : 0);
         }
      }

      if (var3 == 0) {
         if (var10000 != 0) {
            this.ag().b(() -> d(this));
            this.a(
               me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a()
            );
            this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
            if (var3 == 0) {
               return;
            }
         }

         var10000 = ((me.octo.client.utils.llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .a(var1)) ? 1 : 0);
      }

      if (var10000 != 0) {
         this.ag().b(() -> e(this));
         this.a(String.valueOf(var1));
         this.a(me.octo.client.utils.lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.a());
      }
   }

   public void al() {
      int var1 = llIIlIlIlIIIlIIIIlIllIlIllIllIIlIlIIllllIllIlllIlIIIllllllllllIlIllIIlllIlIIlIIIlllIl.aj();

      do {
         boolean var10000;
         if (this.ad().length() > 0) {
            var10000 = true;
            if (var1 != 0) {
            }
         } else {
            var10000 = false;
         }

         if (!var10000) {
            break;
         }

         this.am();
      } while (var1 != 0);
   }

   @NotNull
   @Override
   public abstract String ad();

   @Override
   public abstract void ai();

   public abstract void a(@NotNull String var1);

   public abstract void am();

   private static final String a(IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI var0) {
      return var0.ad();
   }

   private static final Unit b(IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI var0) {
      var0.al();
      return Unit.INSTANCE;
   }

   private static final Unit c(IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI var0) {
      var0.al();
      return Unit.INSTANCE;
   }

   private static final Unit d(IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI var0) {
      var0.al();
      return Unit.INSTANCE;
   }

   private static final Unit e(IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI var0) {
      var0.al();
      return Unit.INSTANCE;
   }
}
