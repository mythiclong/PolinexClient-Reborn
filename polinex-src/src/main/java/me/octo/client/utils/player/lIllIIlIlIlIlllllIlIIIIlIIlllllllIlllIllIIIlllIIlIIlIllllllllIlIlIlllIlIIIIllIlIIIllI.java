package me.octo.client.utils.player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI {
   @NotNull
   public static lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final ArrayList<float[]> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final float[][] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private boolean IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private boolean llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private boolean lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private boolean IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private boolean IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private boolean lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private boolean lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private boolean IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private boolean IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private long IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private long IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private long IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private float lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   public static float lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   public static float lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private static String[] a;
   private static String[] b;

   public lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1
   ) {
      short var10001 = -9062;
      short var10002 = -29845;
      Intrinsics.checkNotNullParameter(var1, "core");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new ArrayList<>(8);
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 1.0F;
      int var2 = 0;

      float[][] var3;
      for (var3 = new float[4][]; var2 < 4; var2++) {
         var3[var2] = new float[2];
      }

      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var3;
   }

   private final Random a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.g();
   }

   public final void b() {
      int var1;
      label27: {
         this.e();
         this.i();
         int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
         var1 = var10000;
         this.h();
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var6 = this;
         if (var1 != 0) {
            if (this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
               long var2 = (long)(
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * 0.2F
                     + this.a().nextFloat() * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * 0.3F
               );
               long var4 = (long)(30 + this.a().nextFloat() * 100.0F);
               this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  + var2
                  + var4;
               if (var1 != 0) {
                  break label27;
               }
            }

            var6 = this;
         }

         var6.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = 0L;
      }

      label20: {
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var7 = this;
         if (var1 != 0) {
            if (this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) {
               this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  + (long)(
                     this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * 0.1F
                        + this.a().nextFloat() * this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII * 0.6F
                  );
               this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = (long)(30 + this.a().nextFloat() * 90.0F);
               this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = 0.5F + this.a().nextFloat() * 0.2F;
               if (var1 != 0) {
                  break label20;
               }
            }

            this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = 0L;
            var7 = this;
         }

         var7.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = 0L;
      }

      this.g();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = System.currentTimeMillis();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         + (long)this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 50L + this.a().nextInt(30);
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 75L + this.a().nextInt(50);
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.a().nextFloat() * 1000.0F;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = this.a().nextFloat() * 1000.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0F;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .j();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .k();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 1.0F;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .b(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .f(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c(false);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.b(false);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a(true);
   }

   public final void c() { Pair var11 = null; // PX-FIX hoist
        
      Object var37 = null; // PX-FIX
      Object var35 = null; // PX-FIX
      Object var34 = null; // PX-FIX
      long var32 = 0; // PX-FIX
      Object var31 = null; // PX-FIX
      Object var30 = null; // PX-FIX
      Object var28 = null; // PX-FIX
      int var1 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      if (var1 == 0) {
         LocalPlayer var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a().player;
         if (var10000 != null) {
            LocalPlayer var2 = var10000;
            long var3 = System.currentTimeMillis();
            if (var1 == 0) {
               if (var3 < this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                  label121: {
                     Vec3 var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.t();
                     if (var5 != null) {
                        float var39;
                        var28 = (
                                 var39 = (float)(var3 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)
                                       / this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                                    - 0.85F
                              )
                              == 0.0F
                           ? 0
                           : (var39 < 0.0F ? -1 : 1);
                        if (var1 != 0) {
                           break label121;
                        }

                        if (((Boolean)var28)) {
                           float var7;
                           label116: {
                              lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var6 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .a(var5);
                              var7 = RangesKt.coerceIn(
                                 var2.getXRot()
                                    + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .c(var6.b() - var2.getXRot()),
                                 -89.9F,
                                 89.9F
                              );
                              float var29 = Math.abs(var7);
                              float var10001 = 87.5F;
                              if (var1 == 0) {
                                 if (var29 > 87.5F) {
                                    var30 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l();
                                    break label116;
                                 }

                                 var29 = var2.getYRot();
                                 var10001 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                    .c(var6.a() - var2.getYRot());
                              }

                              var30 = var29 + var10001;
                           }

                           float var8;
                           label110: {
                              var8 =((Float)( var30));
                              float var9 = Math.abs(
                                    lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                       .c(var8 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l())
                                 )
                                 + Math.abs(var7 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m());
                              float var40;
                              var31 = (var40 = 0.02F - var9) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
                              if (var1 == 0) {
                                 if (((Boolean)var31)) {
                                    var31 = 0;
                                    break label110;
                                 }

                                 float var41;
                                 var31 = (var41 = var9 - 1.5F) == 0.0F ? 0 : (var41 < 0.0F ? -1 : 1);
                              }

                              if (var1 == 0) {
                                 var31 = ((Boolean)var31) ? 1 : 0;
                              }
                           }

                           if (!((Boolean)var31)) {
                              this.b(var8, var7);
                           }
                        }
                     }

                     var28 = this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
                  }

                  long var38;
                  label102: {
                     label101: {
                        if (var1 == 0) {
                           if (((Boolean)(var28))) {
                              break label101;
                           }

                           var32 = var3;
                           var38 = this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
                           if (var1 != 0) {
                              break label102;
                           }

                           long var42;
                           var28 = (var42 = var3 - this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI) == 0L
                              ? 0
                              : (var42 < 0L ? -1 : 1);
                        }

                        if (((Boolean)var28)) {
                           float var23 = 0.05F
                              + 0.1F
                                 * (
                                    1.0F
                                       - RangesKt.coerceIn(
                                          (float)(var3 - this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)
                                             / this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                                          0.0F,
                                          1.0F
                                       )
                                 );
                           this.a(var2.getYRot() + this.a().nextFloat() * var23 - var23 / 2.0F, var2.getXRot() + this.a().nextFloat() * var23 - var23 / 2.0F);
                           this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2.getYRot();
                           this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2.getXRot();
                           return;
                        }
                     }

                     var32 = var3;
                     var38 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  }

                  float var24 = RangesKt.coerceIn(
                     (float)(var32 - var38) / this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, 0.0F, 1.0F
                  );
                  float var25 = this.h(var24);
                  long var43;
                  int var33 = (
                           var43 = var3
                              - this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                              - this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
                        )
                        == 0L
                     ? 0
                     : (var43 < 0L ? -1 : 1);
                  if (var1 == 0) {
                     if (var33 >= 0) {
                        this.c(var24);
                     }

                     long var44;
                     var33 = (
                              var44 = var3
                                 - this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
                                 - this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
                           )
                           == 0L
                        ? 0
                        : (var44 < 0L ? -1 : 1);
                  }

                  label91: {
                     label135: {
                        if (var1 == 0) {
                           if (var33 >= 0) {
                              this.d(var24);
                           }

                           var34 = this;
                           if (var1 != 0) {
                              break label135;
                           }

                           var33 = ((this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) ? 1 : 0);
                        }

                        if (var33 != 0) {
                           var35 = this.g(var25);
                           break label91;
                        }

                        var34 = this;
                     }

                     var35 = TuplesKt.to(
                        (Double)((me.octo.client.PXDyn)(Object)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII).j()
                           + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .c(
                                    this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l()
                                       - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()
                                 )
                              * var25,
                        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()
                           + (
                                 this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m()
                                    - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()
                              )
                              * var25
                     );
                  }

                  float var12;
                  float var13;
                  label80: {
                     Pair var26 =((Pair)( var35));
                     float var27 = ((Number)var26.component1()).floatValue();
                     float var10 = ((Number)var26.component2()).floatValue();
                      var11 = this.e(var24);
                     var12 = var27 + ((Number)var11.getFirst()).floatValue();
                     var13 = var10 + ((Number)var11.getSecond()).floatValue();
                     lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var36 = this;
                     if (var1 == 0) {
                        if (!this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) {
                           var37 = TuplesKt.to(0.0F, 0.0F);
                           break label80;
                        }

                        var36 = this;
                     }

                     var37 = var36.a(var3);
                  }

                  Pair var14 =((Pair)( var37));
                  Pair var15 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII
                     ? TuplesKt.to(
                        lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .b(),
                        lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .c()
                     )
                     : TuplesKt.to(1.0F, 1.0F);
                  float var16 = ((Number)var15.component1()).floatValue();
                  float var17 = ((Number)var15.component2()).floatValue();
                  float var18 = (
                        lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 .c(var12 - this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)
                              * this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                              * var16
                           + this.a(true, var24)
                     )
                     * (1.0F - ((Number)var14.getFirst()).floatValue());
                  float var19 = (
                        (var13 - this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll)
                              * this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                              * var17
                           + this.a(false, var24)
                     )
                     * (1.0F - ((Number)var14.getSecond()).floatValue());
                  Pair var20 = this.f(var24);
                  float var21 = ((Number)var20.component1()).floatValue();
                  float var22 = ((Number)var20.component2()).floatValue();
                  this.a(var2.getYRot() + var18 + var21, var2.getXRot() + var19 + var22);
                  this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2.getYRot();
                  this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2.getXRot();
                  if (var1 == 0) {
                     return;
                  }
               }

               this.a(
                  var2.getYRot()
                     + lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .c(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l() - var2.getYRot()),
                  var2.getXRot() + (this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m() - var2.getXRot())
               );
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var2.getYRot();
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2.getXRot();
            }

            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y();
            return;
         }
      }
   }

   private final void a(float var1, float var2) {
      int var3 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      if (var3 != 0) {
         LocalPlayer var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.a().player;
         if (var10000 != null) {
            LocalPlayer var4 = var10000;
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var5 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .b(var1, var2);
            var4.setYRot(var5.a());
            var4.setXRot(var5.b());
            return;
         }
      }
   }

   public final void b(float var1, float var2) {
      float var4 = var1 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l();
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var5 = var2 - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m();
      int var3 = var10000;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.c(var1);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.d(var2);
      lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var8 = this;
      if (var3 != 0) {
         if (!this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
            return;
         }

         var8 = this;
      }

      float[] var6 = var8.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2];
      var6[0] += var4;
      var6 = this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2];
      var6[1] += var5;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0] = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .l();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1] = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .m();
   }

   public final void d() {
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.clear();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0F;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0F;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
      this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = 0L;
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = 0L;
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = 0L;
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = 0.0F;
   }

   private final void e() {
      int var1 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var12;
      int var10000 = (var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.T() - 0.0F) == 0.0F
         ? 0
         : (var12 < 0.0F ? -1 : 1);
      if (var1 != 0) {
         var10000 = var10000 > 0 ? 1 : 0;
      }

      int var2;
      int var10001;
      label216: {
         label220: {
            var2 = var10000;
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label220;
               }

               float var13;
               var10001 = (var13 = this.a().nextFloat() - 0.85F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label216;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label216;
            }
         }

         var10001 = 0;
      }

      label221: {
         this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = (var10001 != 0);
         var10001 = ((this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl) ? 1 : 0);
         if (var1 != 0) {
            if (!this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl) {
               var10001 = 0;
               break label221;
            }

            float var14;
            var10001 = (var14 = this.a().nextFloat() - 0.6F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
         }

         if (var1 != 0) {
            if (var10001 < 0) {
               var10001 = 0;
               break label221;
            }

            float var15;
            var10001 = (var15 = this.a().nextFloat() - 0.5F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
         }

         if (var1 != 0) {
            if (var10001 < 0) {
               var10001 = 1;
               break label221;
            }

            float var16;
            var10001 = (var16 = this.a().nextFloat() - 0.7F) == 0.0F ? 0 : (var16 < 0.0F ? -1 : 1);
         }

         if (var1 != 0) {
            var10001 = var10001 < 0 ? 2 : 3;
         }
      }

      label189: {
         label222: {
            this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var10001;
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label222;
               }

               float var17;
               var10001 = (var17 = this.a().nextFloat() - 0.85F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label189;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label189;
            }
         }

         var10001 = 0;
      }

      label178: {
         label223: {
            this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = (var10001 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label223;
               }

               float var18;
               var10001 = (var18 = this.a().nextFloat() - 0.18F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label178;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label178;
            }
         }

         var10001 = 0;
      }

      label167: {
         label224: {
            this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = (var10001 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label224;
               }

               float var19;
               var10001 = (var19 = this.a().nextFloat() - 0.55F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label167;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label167;
            }
         }

         var10001 = 0;
      }

      label156: {
         label225: {
            this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = (var10001 != 0);
            this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = (var2 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label225;
               }

               float var20;
               var10001 = (var20 = this.a().nextFloat() - 0.75F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label156;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label156;
            }
         }

         var10001 = 0;
      }

      label145: {
         label226: {
            this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = (var10001 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label226;
               }

               float var21;
               var10001 = (var21 = this.a().nextFloat() - 0.95F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label145;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label145;
            }
         }

         var10001 = 0;
      }

      label134: {
         label227: {
            this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = (var10001 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label227;
               }

               float var22;
               var10001 = (var22 = this.a().nextFloat() - 0.7F) == 0.0F ? 0 : (var22 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label134;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label134;
            }
         }

         var10001 = 0;
      }

      label123: {
         label228: {
            this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = (var10001 != 0);
            this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = (var2 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label228;
               }

               float var23;
               var10001 = (var23 = this.a().nextFloat() - 0.75F) == 0.0F ? 0 : (var23 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label123;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label123;
            }
         }

         var10001 = 0;
      }

      label112: {
         label229: {
            this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = (var10001 != 0);
            var10001 = var2;
            if (var1 != 0) {
               if (var2 == 0) {
                  break label229;
               }

               float var24;
               var10001 = (var24 = this.a().nextFloat() - 0.22F) == 0.0F ? 0 : (var24 < 0.0F ? -1 : 1);
            }

            if (var1 == 0) {
               break label112;
            }

            if (var10001 < 0) {
               var10001 = 1;
               break label112;
            }
         }

         var10001 = 0;
      }

      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = (var10001 != 0);
      this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = (var2 != 0);
   }

   private final float f() {
      float var1 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l()
               - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()
         );
      float var2 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m()
         - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k();
      float var3 = var2 * 1.1F;
      return (float)Math.sqrt(var1 * var1 + var3 * var3);
   }

   private final void g() {
      float var2;
      float var3;
      float var4;
      float var8;
      label21: {
         int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
         var2 = this.f();
         int var1 = var10000;
         var3 = 13.0F + this.a().nextFloat() * 2.0F + var2 * 0.2F;
         var4 = this.a(var2);
         int var7 = ((this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) ? 1 : 0);
         if (var1 != 0) {
            if (!this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
               var8 = 1.0F;
               break label21;
            }

            var8 = var2;
            if (var1 == 0) {
               break label21;
            }

            float var9;
            var7 = (var9 = var2 - 18.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
         }

         var8 = var7 < 0
            ? lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .g()
            : lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .h();
      }

      float var5 = var8;
      float var6 = RangesKt.coerceAtLeast(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.G()
            * this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k(var2),
         0.1F
      );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3 * var4 * var5 * (1.0F / var6) * 12.0F;
   }

   private final float a(float var1) {
      int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var5;
      int var10000 = (var5 = var1 - 7.5F) == 0.0F ? 0 : (var5 < 0.0F ? -1 : 1);
      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.75F + this.a().nextFloat() * 0.15F;
         }

         float var6;
         var10000 = (var6 = var1 - 12.5F) == 0.0F ? 0 : (var6 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.9F + this.a().nextFloat() * 0.05F;
         }

         float var7;
         var10000 = (var7 = var1 - 25.0F) == 0.0F ? 0 : (var7 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.85F + this.a().nextFloat() * 0.05F;
         }

         float var8;
         var10000 = (var8 = var1 - 40.0F) == 0.0F ? 0 : (var8 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 1.05F + this.a().nextFloat() * 0.05F;
         }

         float var9;
         var10000 = (var9 = var1 - 60.0F) == 0.0F ? 0 : (var9 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 1.0F + this.a().nextFloat() * 0.05F;
         }

         float var10;
         var10000 = (var10 = var1 - 85.0F) == 0.0F ? 0 : (var10 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.95F + this.a().nextFloat() * 0.1F;
         }

         float var11;
         var10000 = (var11 = var1 - 110.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
      }

      if (var2 != 0) {
         if (var10000 < 0) {
            return 0.95F + this.a().nextFloat() * 0.05F;
         }

         if (var2 == 0) {
            return var1 + 160.0F;
         }

         float var12;
         var10000 = (var12 = var1 - 160.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
      }

      return var10000 < 0 ? 0.85F + this.a().nextFloat() * 0.05F : 0.8F + this.a().nextFloat() * 0.05F;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private final void h() { float[] var11 = null; // PX-FIX hoist
        
      float var13 = 0; // PX-FIX
      int var2 = 2 + this.a().nextInt(3);
      float var3 = 0.0F;
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      float var4 = 1.0F;
      int var5 = 0;
      int var1 = var10000;
      var10000 = var5;
      int var10001 = var2;
      if (var1 == 0) {
         if (var5 > var2) {
            return;
         }

         var10000 = var5;
         var10001 = var2;
      }

      while (true) {
         label32: {
            if (var10000 == var10001) {
               var13 = 1.0F;
               if (var1 == 0) {
                  break label32;
               }
            } else {
               var13 = 0.15F;
            }

            float var7 = var13;
            float var8 = 1.0F - (var2 - var5) * var7;
            var13 = RangesKt.coerceIn(var3 + var7 + this.a().nextFloat() * (var8 - var3 - var7), var3 + var7, var8);
         }

         float var6 = var13;
         float var14;
         if (var5 == var2) {
            var14 = 1.0F;
         } else {
            float var10 = 0.4F;
            var14 = RangesKt.coerceIn(var4 + (-var10 + this.a().nextFloat() * var10 * 2.0F), 0.65F, 1.4F);
         }

         float var9 = var14;
          var11 = new float[]{var6, var9};
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.add(var11);
         var3 = var6;
         var4 = var9;
         if (var1 == 0) {
            if (var5 == var2) {
               break;
            }

            var5++;
         }

         if (var1 != 0) {
            break;
         }

         var10000 = var5;
         var10001 = var2;
      }
   }

   private final float b(float var1) {
       float var11 = 0.0F; // PX-FIX decl var11
      int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      Object var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      if (var2 == 0) {
         if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.isEmpty()) {
            return 1.0F;
         }

         var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(0);
         short var10002 = -9061;
         short var10003 = -28749;
         Intrinsics.checkNotNullExpressionValue(var10000, "get(...)");
      }

      float[] var3 = (float[])var10000;
      float var8 = var1;
      if (var2 == 0) {
         if (!(var1 <= var3[0])) {
            var10000 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.iterator();
            short var13 = -9064;
            short var15 = 10866;
            Intrinsics.checkNotNullExpressionValue(var10000, "iterator(...)");
            Iterator var4 = (Iterator)var10000;

            while (true) {
               if (var4.hasNext()) {
                  var10000 = var4.next();
                  var13 = -9063;
                  var15 = 562;
                  Intrinsics.checkNotNullExpressionValue(var10000, "next(...)");
                  float[] var5 = (float[])var10000;
                  if (var2 == 0) {
                     var11 = var1;
                     if (var2 != 0) {
                        break;
                     }

                     if (var1 <= var5[0]) {
                        float var6 = var5[0] - var3[0];
                        float var12 = var6;
                        float var10001 = 1.0E-6F;
                        if (var2 == 0) {
                           if (var6 < 1.0E-6F) {
                              return var3[1];
                           }

                           var12 = (var1 - var3[0]) / var6;
                           var10001 = 0.0F;
                        }

                        float var7 = RangesKt.coerceIn(var12, var10001, 1.0F);
                        return var3[1] + (var5[1] - var3[1]) * var7;
                     }

                     var3 = var5;
                  }

                  if (var2 == 0) {
                     continue;
                  }
               }

               var11 = ((float[])CollectionsKt.last(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll))[1];
               break;
            }

            return var11;
         }

         var8 = var3[1];
      }

      return var8;
   }

   private final void c(float var1) {
      int var2;
      float var3;
      float var17;
      label59: {
         float var10001;
         label58: {
            label57: {
               int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
               var3 = this.b(var1);
               var2 = var10000;
               int var15 = ((this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) ? 1 : 0);
               if (var2 == 0) {
                  if (!this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI) {
                     break label57;
                  }

                  var17 = var1;
                  var10001 = 0.15F;
                  if (var2 != 0) {
                     break label58;
                  }

                  float var26;
                  var15 = (var26 = var1 - 0.15F) == 0.0F ? 0 : (var26 < 0.0F ? -1 : 1);
               }

               if (var15 < 0) {
                  var17 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .e()
                     * 0.7F;
                  var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.G();
                  break label58;
               }
            }

            var17 = 1.0F;
            break label59;
         }

         float var5 = var17 * var10001;
         float var6 = RangesKt.coerceIn(var1 / 0.15F, 0.0F, 1.0F);
         var17 = 1.0F - var5 * (1.0F - var6) * 0.2F;
      }

      float var4;
      label63: {
         label45: {
            float var24;
            label64: {
               var4 = var17;
               int var18 = ((this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI) ? 1 : 0);
               if (var2 == 0) {
                  if (!this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI) {
                     var17 = 1.0F;
                     break label63;
                  }

                  var17 = var1;
                  var24 = 0.8F;
                  if (var2 != 0) {
                     break label64;
                  }

                  float var27;
                  var18 = (var27 = var1 - 0.8F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
               }

               if (var18 <= 0) {
                  var17 = 1.0F;
                  break label45;
               }

               var17 = (
                     lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .d()
                        - 1.0F
                  )
                  * 0.07F;
               var24 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.G();
            }

            float var7 = var17 * var24;
            float var8 = RangesKt.coerceIn((var1 - 0.8F) / 0.2F, 0.0F, 1.0F);
            var17 = 1.0F + var7 * (1.0F - var8);
         }

         float var11;
         label32: {
            var11 = var17;
            var17 = var1;
            float var25 = 0.2F;
            if (var2 == 0) {
               if (!(var1 < 0.2F)) {
                  var17 = 1.0F;
                  break label32;
               }

               var17 = (
                     lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .d()
                        - 1.0F
                  )
                  * 0.1F;
               var25 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.G();
            }

            float var14 = var17 * var25;
            float var9 = RangesKt.coerceIn(var1 / 0.2F, 0.0F, 1.0F);
            var17 = 1.0F - var14 * (1.0F - var9);
         }

         float var13 = var17;
         var17 = var13 * var11;
      }

      float var10 = var17;
      float var12 = 1.0F + (this.a().nextFloat() * 0.06F - 0.03F);
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var3 * var4 * var10 * var12;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = System.currentTimeMillis();
   }

   private final void d(float var1) {
      int var2;
      float var12;
      label39: {
         float var10001;
         label43: {
            int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
            float var3 = this.f();
            var2 = var10000;
            float var4 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl ? 0.25F : 1.0F;
            int var10 = ((this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) ? 1 : 0);
            if (var2 != 0) {
               if (!this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
                  var12 = (1.0F - var1) * 0.02F * RangesKt.coerceAtMost(1.1F + var3 * 0.002F, 1.2F) * var4;
                  break label39;
               }

               var12 = var3;
               var10001 = 18.0F;
               if (var2 == 0) {
                  break label43;
               }

               float var15;
               var10 = (var15 = var3 - 18.0F) == 0.0F ? 0 : (var15 < 0.0F ? -1 : 1);
            }

            if (var10 < 0) {
               var12 = (1.0F - var1) * 0.015F * (1.0F + var3 * 0.001F) * var4;
               break label39;
            }

            var12 = (1.0F - var1) * 0.025F * RangesKt.coerceAtMost(1.05F + var3 * 0.002F, 1.5F);
            var10001 = var4;
         }

         var12 *= var10001;
      }

      float var5;
      label27: {
         var5 = var12;
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var13 = this;
         if (var2 != 0) {
            if (!this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll) {
               var12 = 1.0F;
               break label27;
            }

            var13 = this;
         }

         float var7 = (float)(
            IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.a(
                  var13.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll * 2.0,
                  this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl * 2.0
               )
               * lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .f()
               * 0.7
         );
         var12 = 1.0F + var7 * 0.5F;
      }

      float var6 = var12;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll += 0.1F;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl += 0.1F;
      float var9 = (float)(
         IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.a(
                  this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, 0.0
               )
               * 2.0
            - 1.0
      );
      float var8 = (float)(
         IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.a(
                  0.0, this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
               )
               * 2.0
            - 1.0
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var9 * var5 * var6 * (1.0F - var1 * 0.7F);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var8 * var5 * var6 * (1.0F - var1 * 0.7F);
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = System.currentTimeMillis();
   }

   private final Pair<Float, Float> e(float var1) { float var11 = 0.0f; // PX-FIX hoist
        
      int var14 = 0; // PX-FIX
      Object var12 = null; // PX-FIX
      Object var10000 = null; // PX-FIX
      int var2;
      Pair var13;
      label89: {
         label92: {
            var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
            var10000 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
            label87:
            if (var2 != 0) {
               if (this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl) {
                  float var17;
                  var10000 = (var17 = var1 - 0.1F) == 0.0F ? 0 : (var17 < 0.0F ? -1 : 1);
                  if (var2 == 0) {
                     break label87;
                  }

                  if (((Boolean)var10000)) {
                     float var18;
                     var10000 = (var18 = var1 - 0.9F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
                     if (var2 == 0) {
                        break label87;
                     }

                     if (((Boolean)var10000)) {
                        return TuplesKt.to(
                           this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl * 0.3F,
                           this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI * 0.3F
                        );
                     }
                  }
               }

               var12 = this;
               if (var2 == 0) {
                  break label92;
               }

               var10000 = this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
            }

            if (!((Boolean)var10000)) {
               label71: {
                  label94: {
                     float var4 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .c(
                           this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l()
                              - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()
                        );
                     int var5 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     var14 = var5;
                     if (var2 != 0) {
                        if (var5 > 0) {
                           float var19;
                           var14 = (var19 = var4 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
                           if (var2 == 0) {
                              break label71;
                           }

                           if (var14 > 0) {
                              break label94;
                           }
                        }

                        var14 = var5;
                     }

                     label95: {
                        if (var2 != 0) {
                           if (var14 >= 0) {
                              break label95;
                           }

                           float var20;
                           var14 = (var20 = var4 - 0.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
                        }

                        if (var2 == 0) {
                           break label71;
                        }

                        if (var14 < 0) {
                           break label94;
                        }
                     }

                     var14 = 0;
                     break label71;
                  }

                  var14 = 1;
               }

               int var6 = var14;
               var13 = var6 != 0
                  ? TuplesKt.to(
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl * 0.9F,
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI * 0.9F
                  )
                  : TuplesKt.to(
                     this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl * 1.1F,
                     this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI * 1.1F
                  );
               break label89;
            }

            var12 = this;
         }

         var13 = TuplesKt.to(
            this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl,
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
         );
      }

      Pair var3 = var13;
      float var9 = ((Number)var3.component1()).floatValue();
      float var10 = ((Number)var3.component2()).floatValue();
      int var15 = ((this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI) ? 1 : 0);
      if (var2 != 0) {
         if (!this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI) {
            return TuplesKt.to(var9 * (1.0F - var1 * var1), var10 * (1.0F - var1 * var1));
         }

         float var16 = this.a().nextFloat();
         if (var2 == 0) {
            return TuplesKt.to(var16 * 0.2F, var10 * (1.0F - var1 * var1));
         }

         float var21;
         var15 = (var21 = var16 - 0.2F) == 0.0F ? 0 : (var21 < 0.0F ? -1 : 1);
      }

      if (var15 < 0) {
          var11 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII * (1.0F - var1 * 0.8F) * 0.2F;
         float var7 = (this.a().nextFloat() * 2.0F - 1.0F) * var11;
         float var8 = (this.a().nextFloat() * 2.0F - 1.0F) * var11 * 0.6F;
         return TuplesKt.to((var9 + var7) * (1.0F - var1 * var1), (var10 + var8) * (1.0F - var1 * var1));
      } else {
         return TuplesKt.to(var9 * (1.0F - var1 * var1), var10 * (1.0F - var1 * var1));
      }
   }

   private final float a(boolean var1, float var2) {
      int var3 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      float var10000 = this.a().nextFloat();
      if (var3 == 0) {
         if (!(var10000 > 0.3F)) {
            long var4 = System.currentTimeMillis();
            float var6 = 1.0F - var2;
            long var10;
            int var8 = (var10 = var4 - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll - 175L) == 0L
               ? 0
               : (var10 < 0L ? -1 : 1);
            if (var3 == 0) {
               label42:
               if (var8 >= 0) {
                  this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var4;
                  int var9 = this.a().nextInt(10);
                  if (var3 == 0) {
                     if (var9 == 0) {
                        float var7 = (this.a().nextFloat() - 0.5F) * 0.1F * var6 * 0.5F;
                        if (var3 == 0) {
                           if (!var1) {
                              this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var7;
                              if (var3 == 0) {
                                 break label42;
                              }
                           }

                           this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
                        }

                        if (var3 == 0) {
                           break label42;
                        }
                     }

                     var9 =(( var1) ? 1 : 0);
                  }

                  if (var9 != 0) {
                     this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI *= 0.5F;
                     if (var3 == 0) {
                        break label42;
                     }
                  }

                  this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl *= 0.5F;
               }

               var8 =(( var1) ? 1 : 0);
            }

            return var8 != 0
               ? this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
               : this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }

         var10000 = 0.0F;
      }

      return var10000;
   }

   private final Pair<Float, Float> f(float var1) {
      int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      if (!this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII) {
         return TuplesKt.to(0.0F, 0.0F);
      } else {
         float var3 = 0.16F * (1.0F - var1 * 0.8F);
         float var10000 = this.a().nextFloat();
         if (var2 != 0) {
            if (var10000 < 0.13F * (1.0F - var1 * 0.7F)) {
               return TuplesKt.to((this.a().nextFloat() - 0.5F) * var3, (this.a().nextFloat() - 0.5F) * var3 * 0.7F);
            }

            var10000 = 0.0F;
         }

         return TuplesKt.to(var10000, 0.0F);
      }
   }

   private final Pair<Float, Float> a(long var1) { Object var11 = null; // PX-FIX hoist
        
      Object var9 = null; // PX-FIX
       var11 = null; // PX-FIX
      int var3 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      int var10000 = ((this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) ? 1 : 0);
      if (var3 != 0) {
         if (!this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI) {
            return TuplesKt.to(0.0F, 0.0F);
         }

         long var16;
         var10000 = (var16 = var1 - this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII) == 0L
            ? 0
            : (var16 < 0L ? -1 : 1);
      }

      long var10001;
      label57: {
         if (var3 != 0) {
            if (var10000 < 0) {
               return TuplesKt.to(0.0F, 0.0F);
            }

            var9 = var1;
            var10001 = this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII
               + this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
            if (var3 == 0) {
               break label57;
            }

            long var17;
            var10000 = (var17 = var1 - var10001) == 0L ? 0 : (var17 < 0L ? -1 : 1);
         }

         if (var10000 > 0) {
            return TuplesKt.to(0.0F, 0.0F);
         }

         var9 = var1;
         var10001 = this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      }

      label39: {
         float var4 = RangesKt.coerceIn(
            (float)(((Long)var9) - var10001) / (float)this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII, 0.0F, 1.0F
         );
         float var10 = var4;
         float var14 = 0.3F;
         if (var3 != 0) {
            if (var4 < 0.3F) {
               var11 = var4 / 0.3F;
               break label39;
            }

            var10 = 1.0F;
            var14 = (var4 - 0.3F) / 0.7F;
         }

         var11 = var10 - var14;
      }

      float var5 =((Float)( var11));
      float var6 = var5
         * this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII
         * this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.G();
      float var7 = Math.abs(
         lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .c(
               this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l()
                  - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()
            )
      );
      float var8 = Math.abs(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m()
            - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k()
      );
      float var12 = var7;
      float var15 = var8;
      if (var3 != 0) {
         if (var7 > var8) {
            return TuplesKt.to(var6, var6 * 0.4F);
         }

         var12 = var6;
         var15 = 0.4F;
      }

      return TuplesKt.to(var12 * var15, var6);
   }

   private final void i() {
      float var28 = 0; // PX-FIX
      float var27 = 0; // PX-FIX
      Object var26 = null; // PX-FIX
      float var23 = 0.0F; // PX-FIX
      float var22 = 0; // PX-FIX
      float var2 = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .c(
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.l()
               - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j()
         );
      float var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.m()
         - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k();
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      float var4 = (float)Math.sqrt(var2 * var2 + var3 * var3);
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][0] = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .j();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][1] = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .k();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0] = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .l();
      int var1 = var10000;
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1] = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         .m();
      if (var1 == 0) {
         label149:
         if (!(var4 < 12.0F)) {
            lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var20 = this;
            if (var1 == 0) {
               if (!this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI) {
                  break label149;
               }

               this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = true;
               var20 = this;
            }

            int var10001;
            label156: {
               float var5 = var20.a().nextFloat();
               float var30;
               var10001 = (var30 = var5 - 0.35F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
               if (var1 == 0) {
                  if (var10001 < 0) {
                     var10001 = 0;
                     break label156;
                  }

                  float var31;
                  var10001 = (var31 = var5 - 0.6F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
               }

               if (var1 == 0) {
                  if (var10001 < 0) {
                     var10001 = 1;
                     break label156;
                  }

                  float var32;
                  var10001 = (var32 = var5 - 0.75F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
               }

               if (var1 == 0) {
                  if (var10001 < 0) {
                     var10001 = 2;
                     break label156;
                  }

                  float var33;
                  var10001 = (var33 = var5 - 0.9F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
               }

               if (var1 == 0) {
                  var10001 = var10001 < 0 ? 3 : 4;
               }
            }

            label157: {
               this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var10001;
               float var34;
               var10000 = (var34 = var4 - 30.0F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
               if (var1 == 0) {
                  if (var10000 < 0) {
                     var23 = 0.045F + this.a().nextFloat() * 0.025F;
                     break label157;
                  }

                  float var35;
                  var10000 = (var35 = var4 - 55.0F) == 0.0F ? 0 : (var35 < 0.0F ? -1 : 1);
               }

               label158: {
                  if (var1 == 0) {
                     if (var10000 < 0) {
                        var23 = 0.07F + this.a().nextFloat() * 0.04F;
                        break label157;
                     }

                     var22 = var4;
                     var28 = 120.0F;
                     if (var1 != 0) {
                        break label158;
                     }

                     float var36;
                     var10000 = (var36 = var4 - 120.0F) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     var23 = 0.06F + this.a().nextFloat() * 0.035F;
                     break label157;
                  }

                  var22 = 0.065F;
                  var28 = this.a().nextFloat() * 0.025F;
               }

               var23 = var22 + var28;
            }

            float var6 = RangesKt.coerceIn(var23, 0.01F, 0.2F);
            float var7 = this.a().nextFloat() * 0.2F + 0.25F;
            float var8 = this.a().nextFloat() * 0.2F + 0.55F;
            float var24 = var7;
            float var29 = var8 - 0.1F;
            if (var1 == 0) {
               if (var7 >= var29) {
                  var7 = RangesKt.coerceAtLeast(var8 - 0.1F, 0.1F);
               }

               var24 = var6;
               var29 = 0.8F + this.a().nextFloat() * 0.4F;
            }

            float var9;
            float var10;
            label105: {
               var9 = var24 * var29;
               var10 = var6 * (0.8F + this.a().nextFloat() * 0.4F);
               var10000 = ((this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) ? 1 : 0);
               label104:
               if (var1 == 0) {
                  if (this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll) {
                     var10000 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .a();
                     if (var1 != 0) {
                        break label104;
                     }

                     if (var10000 != 0) {
                        var26 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .a()
                              > 0
                           ? 1.0F
                           : -1.0F;
                        break label105;
                     }
                  }

                  var10000 = ((this.a().nextBoolean()) ? 1 : 0);
               }

               var26 = var10000 != 0 ? 1.0F : -1.0F;
            }

            float var11;
            float var12;
            label95: {
               label160: {
                  label93: {
                     label92: {
                        label91: {
                           var11 =((Float)( var26));
                           var12 = var11;
                           if (var1 == 0) {
                              switch (this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll) {
                                 case 1:
                                    var12 = -var11;
                                    var9 *= 1.0F + this.a().nextFloat() * 0.2F;
                                    var10 *= 1.0F + this.a().nextFloat() * 0.2F;
                                    break;
                                 case 2:
                                    break label91;
                                 case 3:
                                    break label92;
                                 case 4:
                                    break label93;
                                 default:
                                    break label160;
                              }
                           }

                           if (var1 == 0) {
                              break label160;
                           }
                        }

                        var9 *= 1.1F + this.a().nextFloat() * 0.3F;
                        var10 *= 0.7F + this.a().nextFloat() * 0.2F;
                        if (var1 == 0) {
                           break label160;
                        }
                     }

                     var9 *= 0.7F + this.a().nextFloat() * 0.2F;
                     var10 *= 1.1F + this.a().nextFloat() * 0.3F;
                     if (var1 == 0) {
                        break label160;
                     }
                  }

                  var9 *= 0.3F + this.a().nextFloat() * 0.3F;
                  var10 *= 0.3F + this.a().nextFloat() * 0.3F;
                  var7 = this.a().nextFloat() * 0.1F + 0.4F;
                  var8 = this.a().nextFloat() * 0.1F + 0.5F;
                  var27 = var7;
                  if (var1 != 0) {
                     break label95;
                  }

                  if (var7 >= var8 - 0.05F) {
                     var7 = RangesKt.coerceAtLeast(var8 - 0.05F, 0.1F);
                  }
               }

               var27 = -var3;
            }

            float var13 = var27;
            float var15 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j() + var2 * var7 + var13 * var9 * var11;
            float var16 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k() + var3 * var7 + var2 * var9 * var11;
            float var17 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.j() + var2 * var8 + var13 * var10 * var12;
            float var18 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.k() + var3 * var8 + var2 * var10 * var12;
            float var19 = RangesKt.coerceAtMost(var6 * 0.2F, 0.025F) * var4;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][0] = var15
               + (this.a().nextFloat() - 0.5F) * 2.0F * var19;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][1] = var16
               + (this.a().nextFloat() - 0.5F) * 2.0F * var19 * 0.7F;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][0] = var17
               + (this.a().nextFloat() - 0.5F) * 2.0F * var19;
            this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][1] = var18
               + (this.a().nextFloat() - 0.5F) * 2.0F * var19 * 0.7F;
            return;
         }

         this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = false;
      }
   }

   private final Pair<Float, Float> g(float var1) {
      float var10;
      float var10001;
      label23: {
         int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
         float var11;
         int var10000 = (var11 = var1 - 0.0F) == 0.0F ? 0 : (var11 < 0.0F ? -1 : 1);
         if (var2 == 0) {
            if (var10000 <= 0) {
               return TuplesKt.to(
                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][0],
                  this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][1]
               );
            }

            var10 = var1;
            var10001 = 1.0F;
            if (var2 != 0) {
               break label23;
            }

            float var12;
            var10000 = (var12 = var1 - 1.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
         }

         if (var10000 >= 0) {
            return TuplesKt.to(
               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0],
               this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1]
            );
         }

         var10 = 1.0F;
         var10001 = var1;
      }

      float var3 = var10 - var10001;
      float var4 = var3 * var3;
      float var5 = var4 * var3;
      float var6 = var1 * var1;
      float var7 = var6 * var1;
      float var8 = var5 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][0]
         + 3.0F * var4 * var1 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][0]
         + 3.0F * var3 * var6 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][0]
         + var7 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][0];
      float var9 = var5 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[0][1]
         + 3.0F * var4 * var1 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[1][1]
         + 3.0F * var3 * var6 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[2][1]
         + var7 * this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[3][1];
      return TuplesKt.to(var8, var9);
   }

   private final float h(float var1) {
      int var2 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      int var10000 = ((this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl) ? 1 : 0);
      if (var2 == 0) {
         if (!this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl) {
            return this.s(var1);
         }

         if (var2 != 0) {
            return this.s(var1);
         }

         var10000 = this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      }

      switch (var10000) {
         case 1:
            return this.t(var1);
         case 2:
            return this.u(var1);
         case 3:
            return this.v(var1);
         default:
            return this.s(var1);
      }
   }

   private final float i(float var1) {
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private final float j(float var1) {
      return 6.0F * var1 - 6.0F * var1 * var1;
   }

   private final float k(float var1) {
      return 1.0F - (1.0F - var1) * (1.0F - var1);
   }

   private final float l(float var1) {
      return 2.0F * (1.0F - var1);
   }

   private final float m(float var1) {
      return (float)Math.sin((float)(var1 * Math.PI / 2.0));
   }

   private final float n(float var1) {
      return (float)((Math.PI / 2) * Math.cos(var1 * Math.PI / 2.0));
   }

   private final float o(float var1) {
      return 1.0F - (float)Math.pow(1.0F - var1, 3.0F);
   }

   private final float p(float var1) {
      return 3.0F * (float)Math.pow(1.0F - var1, 2.0F);
   }

   private final float q(float var1) {
      return 1.0F - (float)Math.pow(1.0F - var1, 4.0F);
   }

   private final float r(float var1) {
      return 4.0F * (float)Math.pow(1.0F - var1, 3.0F);
   }

   private final float s(float var1) {
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var3 = 0.8F;
      int var2 = var10000;
      float var10 = var1;
      if (var2 != 0) {
         if (var1 > var3) {
            float var9 = this.i(var3);
            float var5 = this.k(var9);
            float var6 = var5 * (1.0F - var3 * 0.2F) + var3 * var3 * 0.2F;
            float var7 = this.l(var9) * this.j(var3);
            float var8 = var7 * (1.0F - var3 * 0.2F) - var5 * 0.2F + 0.4F * var3;
            return RangesKt.coerceAtMost(var6 + var8 * (var1 - var3), 1.0F);
         }

         var10 = this.i(var1);
      }

      float var4 = var10;
      return RangesKt.coerceAtMost(this.k(var4) * (1.0F - var1 * 0.2F) + var1 * var1 * 0.2F, 1.0F);
   }

   private final float t(float var1) {
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      float var3 = 0.85F;
      int var2 = var10000;
      float var10 = var1;
      if (var2 == 0) {
         if (var1 > var3) {
            float var9 = this.i(var3);
            float var5 = this.m(var9);
            float var6 = var5 * (1.0F - var3 * 0.2F) + var3 * var3 * 0.2F;
            float var7 = this.n(var9) * this.j(var3);
            float var8 = var7 * (1.0F - var3 * 0.2F) - var5 * 0.2F + 0.4F * var3;
            return RangesKt.coerceAtMost(var6 + var8 * (var1 - var3), 1.0F);
         }

         var10 = this.i(var1);
      }

      float var4 = var10;
      return RangesKt.coerceAtMost(this.m(var4) * (1.0F - var1 * 0.2F) + var1 * var1 * 0.2F, 1.0F);
   }

   private final float u(float var1) {
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.e();
      float var3 = 0.75F;
      int var2 = var10000;
      float var10 = var1;
      if (var2 != 0) {
         if (var1 > var3) {
            float var9 = this.i(var3);
            float var5 = this.o(var9);
            float var6 = var5 * (1.0F - var3 * 0.2F) + var3 * var3 * 0.2F;
            float var7 = this.p(var9) * this.j(var3);
            float var8 = var7 * (1.0F - var3 * 0.2F) - var5 * 0.2F + 0.4F * var3;
            return RangesKt.coerceAtMost(var6 + var8 * (var1 - var3), 1.0F);
         }

         var10 = this.i(var1);
      }

      float var4 = var10;
      return RangesKt.coerceAtMost(this.o(var4) * (1.0F - var1 * 0.2F) + var1 * var1 * 0.2F, 1.0F);
   }

   private final float v(float var1) {
      int var10000 = IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.f();
      float var3 = 0.6F;
      int var2 = var10000;
      float var10 = var1;
      if (var2 == 0) {
         if (var1 > var3) {
            float var9 = this.i(var3);
            float var5 = this.q(var9);
            float var6 = var5 * (1.0F - var3 * 0.2F) + var3 * var3 * 0.2F;
            float var7 = this.r(var9) * this.j(var3);
            float var8 = var7 * (1.0F - var3 * 0.2F) - var5 * 0.2F + 0.5F * var3;
            return RangesKt.coerceAtMost(var6 + var8 * (var1 - var3), 1.0F);
         }

         var10 = this.i(var1);
      }

      float var4 = var10;
      return RangesKt.coerceAtMost(this.q(var4) * (1.0F - var1 * 0.25F) + var1 * var1 * 0.25F, 1.0F);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "\u0014\u0013<\buá\u008a11«Çê\u0092\t¦¿\u0090¨\u0017içmô";
      int var4 = "\u0014\u0013<\buá\u008a11«Çê\u0092\t¦¿\u0090¨\u0017içmô".length();
      char var1 = '\r';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 35;
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
                     case 0 -> 15;
                     case 1 -> 77;
                     case 2 -> 57;
                     case 3 -> 12;
                     case 4 -> 58;
                     case 5 -> 110;
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
                     b = new String[4];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
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

                  var2 = "\u0088æª\u0080\b7Sß0,ô\u001f\u0080";
                  var4 = "\u0088æª\u0080\b7Sß0,ô\u001f\u0080".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 57;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -9064) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 40;
            case 1 -> 77;
            case 2 -> 192;
            case 3 -> 196;
            case 4 -> 48;
            case 5 -> 246;
            case 6 -> 99;
            case 7 -> 87;
            case 8 -> 12;
            case 9 -> 206;
            case 10 -> 121;
            case 11 -> 218;
            case 12 -> 223;
            case 13 -> 210;
            case 14 -> 14;
            case 15 -> 135;
            case 16 -> 190;
            case 17 -> 49;
            case 18 -> 130;
            case 19 -> 138;
            case 20 -> 37;
            case 21 -> 71;
            case 22 -> 193;
            case 23 -> 184;
            case 24 -> 244;
            case 25 -> 140;
            case 26 -> 10;
            case 27 -> 95;
            case 28 -> 145;
            case 29 -> 168;
            case 30 -> 172;
            case 31 -> 119;
            case 32 -> 110;
            case 33 -> 183;
            case 34 -> 89;
            case 35 -> 143;
            case 36 -> 94;
            case 37 -> 234;
            case 38 -> 222;
            case 39 -> 159;
            case 40 -> 220;
            case 41 -> 25;
            case 42 -> 58;
            case 43 -> 187;
            case 44 -> 151;
            case 45 -> 188;
            case 46 -> 173;
            case 47 -> 160;
            case 48 -> 163;
            case 49 -> 141;
            case 50 -> 101;
            case 51 -> 60;
            case 52 -> 42;
            case 53 -> 35;
            case 54 -> 194;
            case 55 -> 221;
            case 56 -> 33;
            case 57 -> 146;
            case 58 -> 50;
            case 59 -> 198;
            case 60 -> 207;
            case 61 -> 28;
            case 62 -> 227;
            case 63 -> 200;
            case 64 -> 96;
            case 65 -> 171;
            case 66 -> 98;
            case 67 -> 79;
            case 68 -> 104;
            case 69 -> 0;
            case 70 -> 162;
            case 71 -> 166;
            case 72 -> 237;
            case 73 -> 249;
            case 74 -> 84;
            case 75 -> 75;
            case 76 -> 61;
            case 77 -> 54;
            case 78 -> 46;
            case 79 -> 9;
            case 80 -> 53;
            case 81 -> 203;
            case 82 -> 45;
            case 83 -> 21;
            case 84 -> 254;
            case 85 -> 131;
            case 86 -> 170;
            case 87 -> 185;
            case 88 -> 225;
            case 89 -> 155;
            case 90 -> 59;
            case 91 -> 17;
            case 92 -> 7;
            case 93 -> 255;
            case 94 -> 44;
            case 95 -> 5;
            case 96 -> 118;
            case 97 -> 201;
            case 98 -> 205;
            case 99 -> 137;
            case 100 -> 174;
            case 101 -> 65;
            case 102 -> 235;
            case 103 -> 27;
            case 104 -> 97;
            case 105 -> 252;
            case 106 -> 240;
            case 107 -> 92;
            case 108 -> 202;
            case 109 -> 175;
            case 110 -> 178;
            case 111 -> 113;
            case 112 -> 153;
            case 113 -> 161;
            case 114 -> 125;
            case 115 -> 24;
            case 116 -> 214;
            case 117 -> 186;
            case 118 -> 64;
            case 119 -> 212;
            case 120 -> 169;
            case 121 -> 90;
            case 122 -> 167;
            case 123 -> 81;
            case 124 -> 123;
            case 125 -> 233;
            case 126 -> 6;
            case 127 -> 133;
            case 128 -> 88;
            case 129 -> 134;
            case 130 -> 82;
            case 131 -> 230;
            case 132 -> 251;
            case 133 -> 128;
            case 134 -> 157;
            case 135 -> 74;
            case 136 -> 241;
            case 137 -> 122;
            case 138 -> 78;
            case 139 -> 13;
            case 140 -> 219;
            case 141 -> 26;
            case 142 -> 91;
            case 143 -> 52;
            case 144 -> 132;
            case 145 -> 103;
            case 146 -> 149;
            case 147 -> 55;
            case 148 -> 105;
            case 149 -> 68;
            case 150 -> 108;
            case 151 -> 102;
            case 152 -> 114;
            case 153 -> 243;
            case 154 -> 34;
            case 155 -> 111;
            case 156 -> 107;
            case 157 -> 129;
            case 158 -> 177;
            case 159 -> 152;
            case 160 -> 41;
            case 161 -> 182;
            case 162 -> 72;
            case 163 -> 154;
            case 164 -> 229;
            case 165 -> 228;
            case 166 -> 245;
            case 167 -> 39;
            case 168 -> 38;
            case 169 -> 22;
            case 170 -> 29;
            case 171 -> 16;
            case 172 -> 93;
            case 173 -> 66;
            case 174 -> 67;
            case 175 -> 36;
            case 176 -> 80;
            case 177 -> 136;
            case 178 -> 69;
            case 179 -> 86;
            case 180 -> 63;
            case 181 -> 164;
            case 182 -> 117;
            case 183 -> 165;
            case 184 -> 150;
            case 185 -> 1;
            case 186 -> 3;
            case 187 -> 215;
            case 188 -> 56;
            case 189 -> 19;
            case 190 -> 142;
            case 191 -> 199;
            case 192 -> 213;
            case 193 -> 57;
            case 194 -> 32;
            case 195 -> 179;
            case 196 -> 124;
            case 197 -> 216;
            case 198 -> 43;
            case 199 -> 112;
            case 200 -> 83;
            case 201 -> 211;
            case 202 -> 116;
            case 203 -> 204;
            case 204 -> 232;
            case 205 -> 248;
            case 206 -> 147;
            case 207 -> 180;
            case 208 -> 238;
            case 209 -> 115;
            case 210 -> 18;
            case 211 -> 208;
            case 212 -> 31;
            case 213 -> 148;
            case 214 -> 176;
            case 215 -> 156;
            case 216 -> 209;
            case 217 -> 47;
            case 218 -> 76;
            case 219 -> 127;
            case 220 -> 106;
            case 221 -> 4;
            case 222 -> 247;
            case 223 -> 139;
            case 224 -> 144;
            case 225 -> 8;
            case 226 -> 250;
            case 227 -> 217;
            case 228 -> 197;
            case 229 -> 85;
            case 230 -> 224;
            case 231 -> 126;
            case 232 -> 236;
            case 233 -> 11;
            case 234 -> 226;
            case 235 -> 181;
            case 236 -> 23;
            case 237 -> 189;
            case 238 -> 51;
            case 239 -> 239;
            case 240 -> 62;
            case 241 -> 30;
            case 242 -> 2;
            case 243 -> 70;
            case 244 -> 20;
            case 245 -> 100;
            case 246 -> 231;
            case 247 -> 73;
            case 248 -> 253;
            case 249 -> 195;
            case 250 -> 15;
            case 251 -> 120;
            case 252 -> 242;
            case 253 -> 158;
            case 254 -> 109;
            default -> 191;
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
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
         this();
      }

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
