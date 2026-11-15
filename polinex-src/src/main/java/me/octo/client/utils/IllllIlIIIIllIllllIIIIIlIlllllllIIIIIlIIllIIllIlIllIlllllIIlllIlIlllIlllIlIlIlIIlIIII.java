package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32;

public final class IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII {
   @NotNull
   private final int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new int[3];
   @NotNull
   private final int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new int[3];
   @NotNull
   private final long[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new long[3];
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 1;
   private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 2;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final ReentrantLock lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ReentrantLock();
   private final Condition IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      .newCondition();
   @NotNull
   private final ArrayList<IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new ArrayList<>();
   private static String[] a;
   private static String[] b;

   public final void a(int var1, int var2) {
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = GL30.glGenFramebuffers();
      this.b(this.a(var1), this.a(var2));
   }

   private final void b(int var1, int var2) {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
      int var4 = 0;
      int[] var3 = var10000;

      while (true) {
         if (var4 < 3) {
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var4] = this.c(var1, var2);
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var4] = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36009, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var4]);
            GL30.glFramebufferTexture2D(36009, 36064, 3553, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var4], 0);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glClear(16384);
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var4] = 0L;
            var4++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         GL30.glBindFramebuffer(36009, 0);
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 1;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 2;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
         break;
      }
   }

   private final int c(int var1, int var2) {
      int var3 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var3);
      GL11.glTexImage2D(3553, 0, 32849, var1, var2, 0, 6407, 5121, 0L);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
      GL11.glBindTexture(3553, 0);
      return var3;
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      int[] var6 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var10000 = var1;
      if (var6 != null) {
         if (var1 <= 0) {
            return;
         }

         var10000 = var2;
      }

      if (var6 != null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = var3;
      }

      if (var6 != null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = var4;
      }

      if (var6 != null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = var5;
      }

      if (var6 != null) {
         if (var10000 <= 0) {
            return;
         }

         var10000 = GL11.glGetInteger(36010);
      }

      int var7 = var10000;
      int var8 = GL11.glGetInteger(36006);
      int var9 = GL11.glGetInteger(32873);

      try {
         int var10001;
         label257: {
            label256: {
               label294: {
                  this.b();
                  var10000 = var4;
                  var10001 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                  label254:
                  if (var6 != null) {
                     if (var4 == this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                        var10000 = var5;
                        var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
                        if (var6 == null) {
                           break label254;
                        }

                        if (var5 == this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
                           break label294;
                        }
                     }

                     var10000 = var4;
                     var10001 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                  }

                  label295: {
                     if (var6 != null) {
                        if (var10000 != var10001) {
                           break label295;
                        }

                        var10000 = var5;
                        var10001 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     }

                     if (var6 != null) {
                        if (var10000 != var10001) {
                           break label295;
                        }

                        this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII++;
                        var10000 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        var10001 = 4;
                     }

                     if (var6 == null) {
                        break label257;
                     }

                     if (var10000 < var10001) {
                        break label256;
                     }

                     this.d(this.a(var4), this.a(var5));
                     this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
                     if (var6 != null) {
                        break label256;
                     }
                  }

                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var4;
                  this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var5;
                  this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
                  if (var6 != null) {
                     break label256;
                  }
               }

               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0;
            }

            GL30.glBindFramebuffer(36008, this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, var1, 0);
            var10000 = GL30.glCheckFramebufferStatus(36008);
            var10001 = 36053;
         }

         if (var6 != null) {
            if (var10000 != var10001) {
               return;
            }

            GL30.glBindFramebuffer(
               36009,
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI]
            );
            var10000 = 0;
            var10001 = 0;
         }

         GL30.glBlitFramebuffer(
            var10000,
            var10001,
            var2,
            var3,
            0,
            0,
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
            16384,
            9729
         );
         long[] var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         var10001 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         if (var6 != null) {
            if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI]
               != 0L) {
               GL32.glDeleteSync(
                  this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI]
               );
            }

            var21 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10001 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         }

         var21[var10001] = GL32.glFenceSync(37143, 0);
         GL11.glFlush();
         Lock var10 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         var10.lock();

         try {
            boolean var11 = false;
            int var12 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var12;
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.signalAll();
            Unit var19 = Unit.INSTANCE;
         } finally {
            var10.unlock();
         }
      } finally {
         GL30.glBindFramebuffer(36008, var7);
         GL30.glBindFramebuffer(36009, var8);
         GL11.glBindTexture(3553, var9);
      }
   }

   public final int a(long var1) {
      int var4 = 0;
      var4 = -1;
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      long var8 = 0L;
      int[] var3 = var10000;
      Lock var5 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      var5.lock();

      try {
         boolean var6 = false;
         int var14 = ((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
         if (var3 != null) {
            if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
               try {
                  this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.await(var1, TimeUnit.MILLISECONDS);
               }
               catch (InterruptedException exception) {
                  throw new RuntimeException(exception);
               }
            }

            var14 = ((this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) ? 1 : 0);
         }

         label69: {
            if (var3 != null) {
               if (var14 == 0) {
                  break label69;
               }

               var14 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
            }

            int var7 = var14;
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var7;
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
            var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI];
            var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI];
         }

         Unit var13 = Unit.INSTANCE;
      } finally {
         var5.unlock();
      }

      int var15 = var4;
      if (var3 != null) {
         if (var4 <= 0) {
            return -1;
         }

         long var16;
         var15 = (var16 = var8 - 0L) == 0L ? 0 : (var16 < 0L ? -1 : 1);
      }

      if (var3 != null) {
         if (var15 != 0) {
            GL32.glClientWaitSync(var8, 1, 100000000L);
         }

         var15 = var4;
      }

      return var15;
   }

   public final void a() {
      Lock var1 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      var1.lock();

      try {
         boolean var2 = false;
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.signalAll();
         Unit var6 = Unit.INSTANCE;
      } finally {
         var1.unlock();
      }
   }

   private final void d(int var1, int var2) {
      int[] var4 = (int[])this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clone();
      long[] var5 = (long[])this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clone();
      int[] var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var7 = 0;
      int[] var3 = var10000;
      int[] var8 = new int[3];

      while (true) {
         if (var7 < 3) {
            var10000 = var8;
            if (var3 == null) {
               break;
            }

            var8[var7] = this.c(var1, var2);
            var7++;
            if (var3 != null) {
               continue;
            }
         }

         var10000 = var8;
         break;
      }

      int[] var6 = var10000;
      var7 = 0;

      while (true) {
         if (var7 < 3) {
            GL30.glBindFramebuffer(36009, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var7]);
            GL30.glFramebufferTexture2D(36009, 36064, 3553, var6[var7], 0);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glClear(16384);
            var7++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         GL30.glBindFramebuffer(36009, 0);
         break;
      }

      Lock var13 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      var13.lock();

      try {
         boolean var14 = false;
         int var9 = 0;

         while (true) {
            if (var9 < 3) {
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var9] = var6[var9];
               this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var9] = 0L;
               var9++;
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            }

            this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0;
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 1;
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 2;
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
            break;
         }

         Unit var15 = Unit.INSTANCE;
      } finally {
         var13.unlock();
      }

      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         .add(
            new IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               var4, var5, 3
            )
         );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2;
   }

   private final void b() {
      Object var10000 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      Iterator var10001 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.iterator();
      short var10003 = 20741;
      short var10004 = 29731;
      Intrinsics.checkNotNullExpressionValue(var10001, "iterator(...)");
      Iterator var2 = var10001;
      Object var1 = var10000;

      label65:
      while (true) {
         int var14 = ((var2.hasNext()) ? 1 : 0);

         label63:
         while (var14 != 0) {
            var10000 = var2.next();
            short var10002 = 20737;
            var10003 = 14824;
            Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
            IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
            int var4 = var3.c();
            var3.a(var4 + -1);
            IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = var3;
            if (var1 != null) {
               if (var3.c() > 0) {
                  continue label65;
               }

               var16 = var3;
            }

            int[] var9 = var16.a();
            int var5 = 0;
            int var6 = var9.length;

            while (var5 < var6) {
               int var7 = var9[var5];
               if (var1 != null) {
                  var14 = var7;
                  if (var1 == null) {
                     continue label63;
                  }

                  if (var7 != 0) {
                     GL11.glDeleteTextures(var7);
                  }

                  var5++;
               }

               if (var1 == null) {
                  break;
               }
            }

            long[] var10 = var3.b();
            var5 = 0;
            var6 = var10.length;

            while (var5 < var6) {
               long var13 = var10[var5];
               if (var1 != null) {
                  long var18;
                  var14 = (var18 = var13 - 0L) == 0L ? 0 : (var18 < 0L ? -1 : 1);
                  if (var1 == null) {
                     continue label63;
                  }

                  if (var14 != 0) {
                     GL32.glDeleteSync(var13);
                  }

                  var5++;
               }

               if (var1 == null) {
                  break;
               }
            }

            var2.remove();
            if (var1 == null) {
               return;
            }
            continue label65;
         }

         return;
      }
   }

   public final void c() {
      int[] var1 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      try {
         Iterator var2 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.iterator();
         Intrinsics.checkNotNullExpressionValue(var2, "iterator(...)");
         label0:
         while (true) {
            int var14 = ((var2.hasNext()) ? 1 : 0);
            label1:
            while (var14 != 0) {
               Object var10000 = var2.next();
               Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
               IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (IllllIlIIIIllIllllIIIIIlIlllllllIIIIIlIIllIIllIlIllIlllllIIlllIlIlllIlllIlIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) var10000;
               int[] var4 = var3.a();
               int var5 = 0;
               int var6 = var4.length;
               while (var5 < var6) {
                  int var7 = var4[var5];
                  if (var1 != null) {
                     var14 = var7;
                     if (var1 == null) {
                        continue label1;
                     }
                     if (var7 != 0) {
                        GL11.glDeleteTextures(var7);
                     }
                     var5++;
                  }
                  if (var1 == null) {
                     break;
                  }
               }
               long[] var10 = var3.b();
               var5 = 0;
               var6 = var10.length;
               while (var5 < var6) {
                  long var13 = var10[var5];
                  if (var1 != null) {
                     int var9 = (var13 == 0L) ? 0 : (var13 < 0L ? -1 : 1);
                     if (var1 == null) {
                        var6 = var9;
                        continue;
                     }
                     var14 = var9;
                     if (var1 == null) {
                        continue label1;
                     }
                     if (var9 != 0) {
                        GL32.glDeleteSync(var13);
                     }
                     var5++;
                  }
                  if (var1 == null) {
                     break label0;
                  }
               }
               continue label0;
            }
            break;
         }
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.clear();
         for (int var15 = 0; var15 < 3; var15++) {
            long var11l = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var15];
            int var11 = (var11l == 0L) ? 0 : (var11l < 0L ? -1 : 1);
            if (var1 != null) {
               if (var1 != null) {
                  if (var11 != 0) {
                     GL32.glDeleteSync(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var15]);
                     this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var15] = 0L;
                  }
               }
               int var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var15];
               if (var1 != null) {
                  if (var12 != 0) {
                     GL30.glDeleteFramebuffers(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var15]);
                     this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var15] = 0;
                  }
               }
               int var17 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var15];
               if (var1 == null) {
                  GL11.glDeleteTextures(var17);
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var15] = 0;
               } else if (var17 != 0) {
                  GL11.glDeleteTextures(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var15]);
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var15] = 0;
               }
            }
            if (var1 == null) {
               break;
            }
         }
         int var18 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         if (var1 == null) {
            GL30.glDeleteFramebuffers(var18);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0;
         } else if (var18 != 0) {
            GL30.glDeleteFramebuffers(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 0;
         }
      } catch (Exception var16) {
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("PiP relay destroy error: " + var16.getMessage());
      }
   }

   private final int a(int var1) {
      int[] var2 = lIllllIIlllIIIlIIlIIlllIllllllIIlIlIlIIlIIIlIlIIllllIllllIllIIIIIIIIllIIlIllIIllIllIl.o();
      int var10000 = var1;
      if (var2 != null) {
         var10000 = var1 < 1 ? 1 : var1;
      }

      return var10000;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "(\u000f\r\u0000a\u0006Z{sT\u0004'\f\t³Ó\u0084®§O£\u001f$\rÏçñ\u001dþ¥©\u000f\rÚËöõ";
      int var4 = "(\u000f\r\u0000a\u0006Z{sT\u0004'\f\t³Ó\u0084®§O£\u001f$\rÏçñ\u001dþ¥©\u000f\rÚËöõ".length();
      char var1 = '\r';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 119;
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
                     case 1 -> 111;
                     case 2 -> 52;
                     case 3 -> 29;
                     case 4 -> 119;
                     case 5 -> 116;
                     default -> 35;
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

                  var2 = "¸áFCú\u0015)K]_\u0082°÷\u008dÐÄ\u0004!©N¨Û»\u0098p\t¬=\u0015\u0001çÈÙ\u009d\u0019";
                  var4 = "¸áFCú\u0015)K]_\u0082°÷\u008dÐÄ\u0004!©N¨Û»\u0098p\t¬=\u0015\u0001çÈÙ\u009d\u0019".length();
                  var1 = 25;
                  var8 = -1;
            }

            var10000 = 46;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String e(int var0, int var1) {
      int var2 = (var0 ^ 20741) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 223;
            case 1 -> 24;
            case 2 -> 122;
            case 3 -> 8;
            case 4 -> 188;
            case 5 -> 247;
            case 6 -> 81;
            case 7 -> 117;
            case 8 -> 20;
            case 9 -> 89;
            case 10 -> 113;
            case 11 -> 97;
            case 12 -> 107;
            case 13 -> 35;
            case 14 -> 30;
            case 15 -> 103;
            case 16 -> 10;
            case 17 -> 245;
            case 18 -> 78;
            case 19 -> 64;
            case 20 -> 23;
            case 21 -> 86;
            case 22 -> 255;
            case 23 -> 61;
            case 24 -> 91;
            case 25 -> 175;
            case 26 -> 44;
            case 27 -> 225;
            case 28 -> 59;
            case 29 -> 216;
            case 30 -> 74;
            case 31 -> 135;
            case 32 -> 242;
            case 33 -> 83;
            case 34 -> 27;
            case 35 -> 105;
            case 36 -> 99;
            case 37 -> 100;
            case 38 -> 96;
            case 39 -> 1;
            case 40 -> 110;
            case 41 -> 201;
            case 42 -> 128;
            case 43 -> 158;
            case 44 -> 19;
            case 45 -> 176;
            case 46 -> 41;
            case 47 -> 76;
            case 48 -> 12;
            case 49 -> 22;
            case 50 -> 37;
            case 51 -> 181;
            case 52 -> 68;
            case 53 -> 244;
            case 54 -> 194;
            case 55 -> 217;
            case 56 -> 209;
            case 57 -> 18;
            case 58 -> 108;
            case 59 -> 16;
            case 60 -> 60;
            case 61 -> 187;
            case 62 -> 104;
            case 63 -> 231;
            case 64 -> 102;
            case 65 -> 204;
            case 66 -> 42;
            case 67 -> 235;
            case 68 -> 93;
            case 69 -> 3;
            case 70 -> 213;
            case 71 -> 195;
            case 72 -> 196;
            case 73 -> 131;
            case 74 -> 39;
            case 75 -> 211;
            case 76 -> 240;
            case 77 -> 180;
            case 78 -> 171;
            case 79 -> 220;
            case 80 -> 157;
            case 81 -> 82;
            case 82 -> 130;
            case 83 -> 58;
            case 84 -> 55;
            case 85 -> 101;
            case 86 -> 62;
            case 87 -> 121;
            case 88 -> 40;
            case 89 -> 67;
            case 90 -> 6;
            case 91 -> 115;
            case 92 -> 167;
            case 93 -> 254;
            case 94 -> 206;
            case 95 -> 249;
            case 96 -> 226;
            case 97 -> 15;
            case 98 -> 36;
            case 99 -> 52;
            case 100 -> 129;
            case 101 -> 28;
            case 102 -> 73;
            case 103 -> 149;
            case 104 -> 139;
            case 105 -> 137;
            case 106 -> 13;
            case 107 -> 118;
            case 108 -> 133;
            case 109 -> 123;
            case 110 -> 227;
            case 111 -> 191;
            case 112 -> 197;
            case 113 -> 21;
            case 114 -> 233;
            case 115 -> 7;
            case 116 -> 178;
            case 117 -> 72;
            case 118 -> 159;
            case 119 -> 164;
            case 120 -> 198;
            case 121 -> 5;
            case 122 -> 90;
            case 123 -> 17;
            case 124 -> 192;
            case 125 -> 132;
            case 126 -> 179;
            case 127 -> 143;
            case 128 -> 174;
            case 129 -> 0;
            case 130 -> 253;
            case 131 -> 250;
            case 132 -> 177;
            case 133 -> 212;
            case 134 -> 152;
            case 135 -> 183;
            case 136 -> 168;
            case 137 -> 120;
            case 138 -> 238;
            case 139 -> 222;
            case 140 -> 109;
            case 141 -> 148;
            case 142 -> 48;
            case 143 -> 85;
            case 144 -> 243;
            case 145 -> 147;
            case 146 -> 77;
            case 147 -> 50;
            case 148 -> 38;
            case 149 -> 145;
            case 150 -> 229;
            case 151 -> 92;
            case 152 -> 189;
            case 153 -> 205;
            case 154 -> 210;
            case 155 -> 162;
            case 156 -> 69;
            case 157 -> 14;
            case 158 -> 84;
            case 159 -> 142;
            case 160 -> 138;
            case 161 -> 54;
            case 162 -> 2;
            case 163 -> 56;
            case 164 -> 29;
            case 165 -> 150;
            case 166 -> 32;
            case 167 -> 116;
            case 168 -> 160;
            case 169 -> 134;
            case 170 -> 248;
            case 171 -> 215;
            case 172 -> 190;
            case 173 -> 87;
            case 174 -> 63;
            case 175 -> 165;
            case 176 -> 33;
            case 177 -> 185;
            case 178 -> 80;
            case 179 -> 237;
            case 180 -> 230;
            case 181 -> 141;
            case 182 -> 53;
            case 183 -> 4;
            case 184 -> 153;
            case 185 -> 193;
            case 186 -> 106;
            case 187 -> 127;
            case 188 -> 199;
            case 189 -> 26;
            case 190 -> 184;
            case 191 -> 155;
            case 192 -> 202;
            case 193 -> 65;
            case 194 -> 79;
            case 195 -> 94;
            case 196 -> 119;
            case 197 -> 200;
            case 198 -> 136;
            case 199 -> 169;
            case 200 -> 125;
            case 201 -> 246;
            case 202 -> 186;
            case 203 -> 219;
            case 204 -> 66;
            case 205 -> 228;
            case 206 -> 43;
            case 207 -> 170;
            case 208 -> 221;
            case 209 -> 45;
            case 210 -> 51;
            case 211 -> 207;
            case 212 -> 224;
            case 213 -> 25;
            case 214 -> 173;
            case 215 -> 208;
            case 216 -> 252;
            case 217 -> 239;
            case 218 -> 214;
            case 219 -> 156;
            case 220 -> 88;
            case 221 -> 112;
            case 222 -> 47;
            case 223 -> 114;
            case 224 -> 111;
            case 225 -> 126;
            case 226 -> 46;
            case 227 -> 49;
            case 228 -> 163;
            case 229 -> 144;
            case 230 -> 203;
            case 231 -> 151;
            case 232 -> 218;
            case 233 -> 98;
            case 234 -> 71;
            case 235 -> 95;
            case 236 -> 232;
            case 237 -> 234;
            case 238 -> 251;
            case 239 -> 146;
            case 240 -> 124;
            case 241 -> 241;
            case 242 -> 31;
            case 243 -> 172;
            case 244 -> 182;
            case 245 -> 161;
            case 246 -> 75;
            case 247 -> 57;
            case 248 -> 34;
            case 249 -> 166;
            case 250 -> 236;
            case 251 -> 70;
            case 252 -> 154;
            case 253 -> 140;
            case 254 -> 11;
            default -> 9;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final long[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull int[] var1, @NotNull long[] var2, int var3) {
         short var10001 = 9438;
         short var10002 = -17251;
         Intrinsics.checkNotNullParameter(var1, "textures");
         var10001 = 9439;
         var10002 = -18622;
         Intrinsics.checkNotNullParameter(var2, "fences");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      @NotNull
      public final int[] a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final long[] b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void a(int var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "K\u008b\u0005\u0018Õ\u0093\bÖ¨ðk¯\tÞ\u0095";
         int var4 = "K\u008b\u0005\u0018Õ\u0093\bÖ¨ðk¯\tÞ\u0095".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 86;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 86;
                  var10006 = var6;
               } else {
                  var13 = 86;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 86;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 32;
                     case 1 -> 104;
                     case 2 -> 48;
                     case 3 -> 82;
                     case 4 -> 41;
                     case 5 -> 58;
                     default -> 44;
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
         int var2 = (var0 ^ 9439) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 170;
               case 1 -> 160;
               case 2 -> 202;
               case 3 -> 173;
               case 4 -> 49;
               case 5 -> 175;
               case 6 -> 177;
               case 7 -> 31;
               case 8 -> 243;
               case 9 -> 131;
               case 10 -> 53;
               case 11 -> 38;
               case 12 -> 222;
               case 13 -> 68;
               case 14 -> 176;
               case 15 -> 223;
               case 16 -> 137;
               case 17 -> 50;
               case 18 -> 91;
               case 19 -> 25;
               case 20 -> 60;
               case 21 -> 85;
               case 22 -> 191;
               case 23 -> 24;
               case 24 -> 18;
               case 25 -> 34;
               case 26 -> 4;
               case 27 -> 221;
               case 28 -> 213;
               case 29 -> 188;
               case 30 -> 63;
               case 31 -> 5;
               case 32 -> 76;
               case 33 -> 105;
               case 34 -> 78;
               case 35 -> 87;
               case 36 -> 206;
               case 37 -> 46;
               case 38 -> 212;
               case 39 -> 40;
               case 40 -> 83;
               case 41 -> 48;
               case 42 -> 154;
               case 43 -> 119;
               case 44 -> 210;
               case 45 -> 65;
               case 46 -> 233;
               case 47 -> 26;
               case 48 -> 238;
               case 49 -> 184;
               case 50 -> 143;
               case 51 -> 144;
               case 52 -> 124;
               case 53 -> 159;
               case 54 -> 0;
               case 55 -> 165;
               case 56 -> 237;
               case 57 -> 100;
               case 58 -> 32;
               case 59 -> 242;
               case 60 -> 208;
               case 61 -> 231;
               case 62 -> 146;
               case 63 -> 251;
               case 64 -> 22;
               case 65 -> 246;
               case 66 -> 82;
               case 67 -> 59;
               case 68 -> 178;
               case 69 -> 153;
               case 70 -> 113;
               case 71 -> 121;
               case 72 -> 27;
               case 73 -> 181;
               case 74 -> 10;
               case 75 -> 107;
               case 76 -> 33;
               case 77 -> 155;
               case 78 -> 139;
               case 79 -> 116;
               case 80 -> 225;
               case 81 -> 23;
               case 82 -> 17;
               case 83 -> 12;
               case 84 -> 123;
               case 85 -> 164;
               case 86 -> 94;
               case 87 -> 58;
               case 88 -> 56;
               case 89 -> 14;
               case 90 -> 200;
               case 91 -> 227;
               case 92 -> 122;
               case 93 -> 125;
               case 94 -> 205;
               case 95 -> 52;
               case 96 -> 47;
               case 97 -> 16;
               case 98 -> 77;
               case 99 -> 253;
               case 100 -> 79;
               case 101 -> 220;
               case 102 -> 36;
               case 103 -> 166;
               case 104 -> 35;
               case 105 -> 228;
               case 106 -> 126;
               case 107 -> 152;
               case 108 -> 44;
               case 109 -> 37;
               case 110 -> 71;
               case 111 -> 192;
               case 112 -> 145;
               case 113 -> 138;
               case 114 -> 114;
               case 115 -> 204;
               case 116 -> 51;
               case 117 -> 102;
               case 118 -> 128;
               case 119 -> 118;
               case 120 -> 120;
               case 121 -> 20;
               case 122 -> 254;
               case 123 -> 98;
               case 124 -> 193;
               case 125 -> 96;
               case 126 -> 62;
               case 127 -> 28;
               case 128 -> 97;
               case 129 -> 219;
               case 130 -> 9;
               case 131 -> 70;
               case 132 -> 21;
               case 133 -> 224;
               case 134 -> 133;
               case 135 -> 15;
               case 136 -> 171;
               case 137 -> 161;
               case 138 -> 248;
               case 139 -> 247;
               case 140 -> 163;
               case 141 -> 29;
               case 142 -> 203;
               case 143 -> 142;
               case 144 -> 239;
               case 145 -> 93;
               case 146 -> 67;
               case 147 -> 196;
               case 148 -> 42;
               case 149 -> 245;
               case 150 -> 167;
               case 151 -> 197;
               case 152 -> 234;
               case 153 -> 88;
               case 154 -> 147;
               case 155 -> 117;
               case 156 -> 183;
               case 157 -> 252;
               case 158 -> 140;
               case 159 -> 236;
               case 160 -> 201;
               case 161 -> 72;
               case 162 -> 132;
               case 163 -> 80;
               case 164 -> 7;
               case 165 -> 180;
               case 166 -> 216;
               case 167 -> 241;
               case 168 -> 195;
               case 169 -> 169;
               case 170 -> 104;
               case 171 -> 90;
               case 172 -> 186;
               case 173 -> 215;
               case 174 -> 41;
               case 175 -> 190;
               case 176 -> 168;
               case 177 -> 8;
               case 178 -> 207;
               case 179 -> 108;
               case 180 -> 95;
               case 181 -> 136;
               case 182 -> 54;
               case 183 -> 174;
               case 184 -> 232;
               case 185 -> 129;
               case 186 -> 43;
               case 187 -> 209;
               case 188 -> 198;
               case 189 -> 130;
               case 190 -> 226;
               case 191 -> 101;
               case 192 -> 81;
               case 193 -> 3;
               case 194 -> 109;
               case 195 -> 194;
               case 196 -> 151;
               case 197 -> 2;
               case 198 -> 19;
               case 199 -> 150;
               case 200 -> 89;
               case 201 -> 158;
               case 202 -> 255;
               case 203 -> 75;
               case 204 -> 86;
               case 205 -> 1;
               case 206 -> 157;
               case 207 -> 156;
               case 208 -> 162;
               case 209 -> 229;
               case 210 -> 240;
               case 211 -> 185;
               case 212 -> 64;
               case 213 -> 217;
               case 214 -> 6;
               case 215 -> 92;
               case 216 -> 55;
               case 217 -> 141;
               case 218 -> 66;
               case 219 -> 211;
               case 220 -> 149;
               case 221 -> 182;
               case 222 -> 115;
               case 223 -> 45;
               case 224 -> 244;
               case 225 -> 187;
               case 226 -> 189;
               case 227 -> 103;
               case 228 -> 134;
               case 229 -> 235;
               case 230 -> 39;
               case 231 -> 106;
               case 232 -> 61;
               case 233 -> 135;
               case 234 -> 74;
               case 235 -> 148;
               case 236 -> 249;
               case 237 -> 250;
               case 238 -> 179;
               case 239 -> 218;
               case 240 -> 99;
               case 241 -> 214;
               case 242 -> 57;
               case 243 -> 13;
               case 244 -> 199;
               case 245 -> 230;
               case 246 -> 127;
               case 247 -> 69;
               case 248 -> 73;
               case 249 -> 11;
               case 250 -> 84;
               case 251 -> 111;
               case 252 -> 30;
               case 253 -> 172;
               case 254 -> 112;
               default -> 110;
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
}
