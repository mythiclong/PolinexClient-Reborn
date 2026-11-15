package me.octo.client;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll;
import me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import kotlin.text.StringsKt;
import me.octo.client.utils.lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI;

public final class IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI
   extends llllIIllIIlIIlllllllIIlIIIIllllllllIIIIIlIlIlIIlllIlIIIIIIllIlIlIIlIlIIlllIIIlllllIll {
   @NotNull
   private IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 1;
   @Nullable
   private static me.octo.client.IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final ArrayList<IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ArrayList<>();
   @Nullable
   private float[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private float[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private float[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 7;
   private final int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 3;
   private final float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 54.0F;
   private final float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 56.0F;
   private final float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 2.0F;
   private final float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 32.0F;
   private final float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 16.0F;
   private final float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 58.0F;
   private final float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 30.0F;
   private static String[] e;
   private static String[] f;

   public IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI() {
      IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c();
   }

   private final int d() {
        int n;
        block6: {
            IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;
            block4: {
                block5: {
                    lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
                    try {
                        try {
                            iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI = this;
                            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block4;
                            if (iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) break block5;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a(noWhenBranchMatchedException);
                        }
                        n = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        break block6;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a(noWhenBranchMatchedException);
                    }
                }
                iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI = this;
            }
            n = iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
        }
        return n;
   }

   private final float e() {
        float f;
        block6: {
            IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;
            block4: {
                block5: {
                    lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
                    try {
                        try {
                            iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI = this;
                            if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block4;
                            if (iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) break block5;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a(noWhenBranchMatchedException);
                        }
                        f = (this.g() - this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI * (float)2) / (float)this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        break block6;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a(noWhenBranchMatchedException);
                    }
                }
                iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI = this;
            }
            f = iIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
        }
        return f;
   }

   private final int a(int param1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if (var2 == null) { return param1 > 0 ? (param1 + this.d() - 1) / this.d() : 1; }
      return param1 / this.d();
   }

   private final int f() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      int var3;
      try {
         var3 = me.octo.client.IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.ordinal()];
      } catch (NoWhenBranchMatchedException var5) {
         throw IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a(var5);
      }

      if (var2 != null) { return var3; }
      int var1;
      switch (var3) {
         case 1:
            var1 = 1;
            break;
         case 2:
            var1 = this.a(me.octo.client.IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b().size());
            break;
         case 3:
            var1 = this.a(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != null && this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.c() != null ? this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.c().size() : 0);
            break;
         default:
            throw new NoWhenBranchMatchedException();
      }
      return var1;
   }

   private final float g() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI * 2
         + this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
            * this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   private final float h() {
      return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         + this.f() * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         + this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor param1, int param2, int param3, float param4) {
      kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param1, "context");
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var5 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      float var6 = (float) this.a().getWindow().getGuiScale();
      float var7 = (float) this.a().getWindow().getGuiScaledWidth();
      float var8 = (float) this.a().getWindow().getGuiScaledHeight();
      float var9 = this.g();
      float var10 = this.h();
      float var11 = (var7 - var9) / 2.0F;
      float var12 = (var8 - var10) / 2.0F;
      this.a(var11, var12);
      me.octo.client.utils.llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1, 0, 0, param1.guiWidth(), param1.guiHeight(), (kotlin.jvm.functions.Function0) () -> a(this, var6, var11, var12, var9, var10, param2, param3));
      for (Object var14o : this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         me.octo.client.IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 = (me.octo.client.IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) var14o;
         net.minecraft.world.item.ItemStack var15 = var14.i();
         if (var15 == null) {
            continue;
         }
         this.a(param1, var15, var14.e(), var14.f(), this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
      }
      super.extractRenderState(param1, param2, param3, param4);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[4]);
      }
   }

   private final void a(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 003: aload 0
      // 004: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/ArrayList;
      // 007: invokevirtual java/util/ArrayList.clear ()V
      // 00a: astore 3
      // 00b: fload 1
      // 00c: aload 0
      // 00d: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 010: fadd
      // 011: fstore 4
      // 013: fload 2
      // 014: aload 0
      // 015: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 018: fadd
      // 019: fstore 5
      // 01b: aload 0
      // 01c: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 01f: getstatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 022: swap
      // 023: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 026: iaload
      // 027: aload 3
      // 028: ifnonnull 049
      // 02b: tableswitch 743 1 3 29 374 561
      // 044: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 047: athrow
      // 048: bipush 0
      // 049: istore 6
      // 04b: iload 6
      // 04d: bipush 7
      // 04f: if_icmpge 31a
      // 052: iload 6
      // 054: bipush 1
      // 055: iadd
      // 056: istore 7
      // 058: getstatic me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
      // 05b: iload 7
      // 05d: invokevirtual me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.a (I)Ljava/lang/String;
      // 060: astore 8
      // 062: aload 3
      // 063: ifnonnull 084
      // 066: aload 8
      // 068: dup
      // 069: ifnull 083
      // 06c: goto 073
      // 06f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 072: athrow
      // 073: astore 11
      // 075: bipush 0
      // 076: istore 12
      // 078: getstatic me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl;
      // 07b: aload 11
      // 07d: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.a (Ljava/lang/String;)Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
      // 080: goto 085
      // 083: pop
      // 084: aconst_null
      // 085: astore 9
      // 087: aload 3
      // 088: ifnonnull 0a3
      // 08b: aload 9
      // 08d: dup
      // 08e: ifnull 0a2
      // 091: goto 098
      // 094: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 097: athrow
      // 098: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Lnet/minecraft/world/item/ItemStack;
      // 09b: goto 0a4
      // 09e: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0a1: athrow
      // 0a2: pop
      // 0a3: aconst_null
      // 0a4: astore 10
      // 0a6: getstatic me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
      // 0a9: iload 7
      // 0ab: invokevirtual me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.b (I)Z
      // 0ae: istore 11
      // 0b0: nop
      // 0b1: iload 11
      // 0b3: aload 3
      // 0b4: ifnonnull 0c3
      // 0b7: ifeq 0e0
      // 0ba: goto 0c1
      // 0bd: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0c0: athrow
      // 0c1: iload 7
      // 0c3: sipush 6328
      // 0c6: sipush -9412
      // 0c9: pop2
      // 0ca: ldc_w "Slot #"
      // 0cd: swap
      // 0ce: sipush 6332
      // 0d1: sipush -22832
      // 0d4: pop2
      // 0d5: ldc_w "  →  disabled (right-click to enable)"
      // 0d8: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0dd: goto 135
      // 0e0: aload 9
      // 0e2: ifnull 119
      // 0e5: iload 7
      // 0e7: aload 9
      // 0e9: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 0ec: sipush 6304
      // 0ef: sipush 23284
      // 0f2: pop2
      // 0f3: ldc_w "Slot #"
      // 0f6: dup_x2
      // 0f7: pop
      // 0f8: sipush 6323
      // 0fb: sipush -11589
      // 0fe: pop2
      // 0ff: ldc_w "  →  "
      // 102: swap
      // 103: sipush 6329
      // 106: sipush 8674
      // 109: pop2
      // 10a: ldc_w "  ·  right-click to disable"
      // 10d: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 112: goto 135
      // 115: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 118: athrow
      // 119: iload 7
      // 11b: sipush 6304
      // 11e: sipush 23284
      // 121: pop2
      // 122: ldc_w "Slot #"
      // 125: swap
      // 126: sipush 6326
      // 129: sipush 7867
      // 12c: pop2
      // 12d: ldc_w "  →  empty (click to set)"
      // 130: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 135: astore 12
      // 137: aload 0
      // 138: fload 4
      // 13a: fload 5
      // 13c: iload 6
      // 13e: bipush 0
      // 13f: iload 7
      // 141: invokedynamic makeConcatWithConstants (I)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "#\u0001" ]
      // 146: aload 12
      // 148: iload 11
      // 14a: ifeq 155
      // 14d: aconst_null
      // 14e: goto 157
      // 151: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 154: athrow
      // 155: aload 10
      // 157: aload 9
      // 159: ifnull 177
      // 15c: iload 11
      // 15e: aload 3
      // 15f: ifnonnull 174
      // 162: goto 169
      // 165: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 168: athrow
      // 169: ifne 177
      // 16c: goto 173
      // 16f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 172: athrow
      // 173: bipush 1
      // 174: goto 178
      // 177: bipush 0
      // 178: aload 9
      // 17a: ifnonnull 185
      // 17d: bipush 1
      // 17e: goto 186
      // 181: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 184: athrow
      // 185: bipush 0
      // 186: iload 11
      // 188: iload 7
      // 18a: invokedynamic invoke (I)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.b (I)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 18f: aload 0
      // 190: iload 7
      // 192: invokedynamic invoke (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;I)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;I)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 197: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;FFIILjava/lang/String;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
      // 19a: iinc 6 1
      // 19d: aload 3
      // 19e: ifnull 04b
      // 1a1: getstatic me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl;
      // 1a4: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.b ()Ljava/util/List;
      // 1a7: checkcast java/lang/Iterable
      // 1aa: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 1af: astore 6
      // 1b1: bipush 0
      // 1b2: istore 7
      // 1b4: aload 6
      // 1b6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1bb: ifeq 31a
      // 1be: iload 7
      // 1c0: istore 8
      // 1c2: iload 7
      // 1c4: bipush 1
      // 1c5: iadd
      // 1c6: istore 7
      // 1c8: aload 6
      // 1ca: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1cf: checkcast me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      // 1d2: astore 9
      // 1d4: aload 3
      // 1d5: ifnonnull 1f9
      // 1d8: aload 9
      // 1da: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Ljava/util/List;
      // 1dd: invokestatic kotlin/collections/CollectionsKt.firstOrNull (Ljava/util/List;)Ljava/lang/Object;
      // 1e0: checkcast me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 1e3: dup
      // 1e4: ifnull 1f8
      // 1e7: goto 1ee
      // 1ea: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1ed: athrow
      // 1ee: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Lnet/minecraft/world/item/ItemStack;
      // 1f1: goto 1fa
      // 1f4: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f7: athrow
      // 1f8: pop
      // 1f9: aconst_null
      // 1fa: astore 10
      // 1fc: aload 0
      // 1fd: fload 4
      // 1ff: fload 5
      // 201: iload 8
      // 203: aload 0
      // 204: invokespecial me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.d ()I
      // 207: irem
      // 208: iload 8
      // 20a: aload 0
      // 20b: invokespecial me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.d ()I
      // 20e: idiv
      // 20f: aload 0
      // 210: aload 9
      // 212: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/lang/String;
      // 215: bipush 16
      // 217: invokespecial me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Ljava/lang/String;I)Ljava/lang/String;
      // 21a: aload 9
      // 21c: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/lang/String;
      // 21f: aload 9
      // 221: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Ljava/util/List;
      // 224: invokeinterface java/util/List.size ()I 1
      // 229: sipush 6322
      // 22c: sipush 29704
      // 22f: pop2
      // 230: ldc_w "  ·  "
      // 233: swap
      // 234: sipush 6331
      // 237: sipush -21939
      // 23a: pop2
      // 23b: ldc_w " items"
      // 23e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 243: aload 10
      // 245: bipush 0
      // 246: bipush 0
      // 247: bipush 0
      // 248: aconst_null
      // 249: aload 0
      // 24a: aload 9
      // 24c: invokedynamic invoke (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 251: sipush 3072
      // 254: aconst_null
      // 255: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;FFIILjava/lang/String;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
      // 258: aload 3
      // 259: ifnull 1b4
      // 25c: aload 0
      // 25d: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 260: dup
      // 261: ifnonnull 26a
      // 264: pop
      // 265: return
      // 266: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 269: athrow
      // 26a: astore 6
      // 26c: aload 6
      // 26e: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Ljava/util/List;
      // 271: checkcast java/lang/Iterable
      // 274: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 279: astore 7
      // 27b: bipush 0
      // 27c: istore 8
      // 27e: aload 7
      // 280: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 285: ifeq 31a
      // 288: iload 8
      // 28a: istore 9
      // 28c: iload 8
      // 28e: bipush 1
      // 28f: iadd
      // 290: istore 8
      // 292: aload 7
      // 294: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 299: checkcast me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 29c: astore 10
      // 29e: aload 10
      // 2a0: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Lnet/minecraft/world/item/ItemStack;
      // 2a3: astore 11
      // 2a5: getstatic me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
      // 2a8: aload 0
      // 2a9: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI I
      // 2ac: invokevirtual me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.a (I)Ljava/lang/String;
      // 2af: aload 10
      // 2b1: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()Ljava/lang/String;
      // 2b4: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 2b7: istore 12
      // 2b9: iload 12
      // 2bb: ifeq 2d9
      // 2be: aload 10
      // 2c0: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 2c3: sipush 6307
      // 2c6: sipush 20213
      // 2c9: pop2
      // 2ca: ldc_w "  ·  click to unbind"
      // 2cd: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 2d2: goto 2de
      // 2d5: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d8: athrow
      // 2d9: aload 10
      // 2db: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()Ljava/lang/String;
      // 2de: astore 13
      // 2e0: aload 0
      // 2e1: fload 4
      // 2e3: fload 5
      // 2e5: iload 9
      // 2e7: aload 0
      // 2e8: invokespecial me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.d ()I
      // 2eb: irem
      // 2ec: iload 9
      // 2ee: aload 0
      // 2ef: invokespecial me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.d ()I
      // 2f2: idiv
      // 2f3: aconst_null
      // 2f4: aload 13
      // 2f6: aload 11
      // 2f8: iload 12
      // 2fa: bipush 0
      // 2fb: bipush 0
      // 2fc: aconst_null
      // 2fd: iload 12
      // 2ff: aload 0
      // 300: aload 10
      // 302: invokedynamic invoke (ZLme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/jvm/functions/Function0; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Ljava/lang/Object;, me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (ZLme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;)Lkotlin/Unit;, ()Lkotlin/Unit; ]
      // 307: sipush 3072
      // 30a: aconst_null
      // 30b: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI;FFIILjava/lang/String;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
      // 30e: aload 3
      // 30f: ifnull 27e
      // 312: new kotlin/NoWhenBranchMatchedException
      // 315: dup
      // 316: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 319: athrow
      // 31a: return
   }

   private final void a(float param1, float param2, float param3, float param4, int param5, int param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 4
      // 002: newarray 6
      // 004: astore 8
      // 006: aload 8
      // 008: bipush 0
      // 009: fload 1
      // 00a: fastore
      // 00b: aload 8
      // 00d: bipush 1
      // 00e: fload 2
      // 00f: fastore
      // 010: aload 8
      // 012: bipush 2
      // 013: fload 3
      // 014: fastore
      // 015: aload 8
      // 017: bipush 3
      // 018: fload 4
      // 01a: fastore
      // 01b: aload 8
      // 01d: putfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII [F
      // 020: fload 1
      // 021: fload 2
      // 022: fload 3
      // 023: fload 4
      // 025: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 028: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.e ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 02b: ldc_w 0.98
      // 02e: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 031: ldc_w 14.0
      // 034: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 037: fload 1
      // 038: fload 2
      // 039: fload 3
      // 03a: fload 4
      // 03c: fconst_1
      // 03d: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 040: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 043: ldc_w 0.6
      // 046: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 049: ldc_w 14.0
      // 04c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 04f: invokestatic me/octo/client/IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 052: aconst_null
      // 053: astore 8
      // 055: astore 7
      // 057: aconst_null
      // 058: astore 9
      // 05a: aload 0
      // 05b: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 05e: getstatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 061: swap
      // 062: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 065: iaload
      // 066: tableswitch 177 1 3 26 53 100
      // 080: sipush 6306
      // 083: sipush 13394
      // 086: pop2
      // 087: ldc_w "The Forge"
      // 08a: astore 8
      // 08c: sipush 6309
      // 08f: sipush -1989
      // 092: pop2
      // 093: ldc_w "Left-click a slot to set it · right-click to disable."
      // 096: astore 9
      // 098: goto 11f
      // 09b: sipush 6325
      // 09e: sipush -17885
      // 0a1: pop2
      // 0a2: ldc_w "Select Category"
      // 0a5: astore 8
      // 0a7: aload 0
      // 0a8: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI I
      // 0ab: sipush 6304
      // 0ae: sipush 23284
      // 0b1: pop2
      // 0b2: ldc_w "Slot #"
      // 0b5: swap
      // 0b6: sipush 6334
      // 0b9: sipush -319
      // 0bc: pop2
      // 0bd: ldc_w " — choose a category."
      // 0c0: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0c5: astore 9
      // 0c7: goto 11f
      // 0ca: aload 0
      // 0cb: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0ce: dup
      // 0cf: ifnull 0e0
      // 0d2: invokevirtual me/octo/client/IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a ()Ljava/lang/String;
      // 0d5: dup
      // 0d6: ifnonnull 0f2
      // 0d9: goto 0e0
      // 0dc: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0df: athrow
      // 0e0: pop
      // 0e1: sipush 6321
      // 0e4: sipush 18216
      // 0e7: pop2
      // 0e8: ldc_w "Forge"
      // 0eb: goto 0f2
      // 0ee: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 0f1: athrow
      // 0f2: astore 8
      // 0f4: aload 0
      // 0f5: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI I
      // 0f8: sipush 6304
      // 0fb: sipush 23284
      // 0fe: pop2
      // 0ff: ldc_w "Slot #"
      // 102: swap
      // 103: sipush 6333
      // 106: sipush 18165
      // 109: pop2
      // 10a: ldc_w " — click an item to assign it."
      // 10d: invokedynamic makeConcatWithConstants (Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 112: astore 9
      // 114: goto 11f
      // 117: new kotlin/NoWhenBranchMatchedException
      // 11a: dup
      // 11b: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 11e: athrow
      // 11f: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 122: aload 8
      // 124: fload 1
      // 125: aload 0
      // 126: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 129: fadd
      // 12a: f2d
      // 12b: fload 2
      // 12c: ldc_w 12.0
      // 12f: fadd
      // 130: f2d
      // 131: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 134: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 137: bipush 0
      // 138: bipush 16
      // 13a: aconst_null
      // 13b: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 13e: pop2
      // 13f: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 142: aload 9
      // 144: fload 1
      // 145: aload 0
      // 146: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 149: fadd
      // 14a: f2d
      // 14b: fload 2
      // 14c: ldc 30.0
      // 14e: fadd
      // 14f: f2d
      // 150: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 153: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 156: bipush 0
      // 157: bipush 16
      // 159: aconst_null
      // 15a: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 15d: pop2
      // 15e: fload 1
      // 15f: aload 0
      // 160: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 163: fadd
      // 164: fload 2
      // 165: aload 0
      // 166: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl F
      // 169: fadd
      // 16a: ldc_w 8.0
      // 16d: fsub
      // 16e: fload 3
      // 16f: aload 0
      // 170: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 173: fconst_2
      // 174: fmul
      // 175: fsub
      // 176: fconst_1
      // 177: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 17a: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.A ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 17d: ldc_w 0.6
      // 180: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 183: ldc_w 0.5
      // 186: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 189: ldc_w 18.0
      // 18c: fstore 10
      // 18e: fload 1
      // 18f: fload 3
      // 190: fadd
      // 191: aload 0
      // 192: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 195: fsub
      // 196: fload 10
      // 198: fsub
      // 199: fstore 11
      // 19b: fload 2
      // 19c: ldc_w 12.0
      // 19f: fadd
      // 1a0: fstore 12
      // 1a2: iload 5
      // 1a4: i2f
      // 1a5: fload 11
      // 1a7: fcmpl
      // 1a8: aload 7
      // 1aa: ifnonnull 1c7
      // 1ad: iflt 215
      // 1b0: goto 1b7
      // 1b3: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1b6: athrow
      // 1b7: iload 5
      // 1b9: i2f
      // 1ba: fload 11
      // 1bc: fload 10
      // 1be: fadd
      // 1bf: fcmpg
      // 1c0: goto 1c7
      // 1c3: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1c6: athrow
      // 1c7: aload 7
      // 1c9: ifnonnull 1e3
      // 1cc: ifgt 215
      // 1cf: goto 1d6
      // 1d2: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1d5: athrow
      // 1d6: iload 6
      // 1d8: i2f
      // 1d9: fload 12
      // 1db: fcmpl
      // 1dc: goto 1e3
      // 1df: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1e2: athrow
      // 1e3: aload 7
      // 1e5: ifnonnull 202
      // 1e8: iflt 215
      // 1eb: goto 1f2
      // 1ee: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 1f1: athrow
      // 1f2: iload 6
      // 1f4: i2f
      // 1f5: fload 12
      // 1f7: fload 10
      // 1f9: fadd
      // 1fa: fcmpg
      // 1fb: goto 202
      // 1fe: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 201: athrow
      // 202: aload 7
      // 204: ifnonnull 212
      // 207: ifgt 215
      // 20a: goto 211
      // 20d: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 210: athrow
      // 211: bipush 1
      // 212: goto 216
      // 215: bipush 0
      // 216: istore 13
      // 218: fload 11
      // 21a: fload 12
      // 21c: fload 10
      // 21e: fload 10
      // 220: iload 13
      // 222: ifeq 232
      // 225: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 228: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.g ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 22b: goto 238
      // 22e: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 231: athrow
      // 232: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 235: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.j ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 238: ldc_w 5.0
      // 23b: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 23e: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 241: ldc_w "x"
      // 244: fload 11
      // 246: fload 10
      // 248: fconst_2
      // 249: fdiv
      // 24a: fadd
      // 24b: f2d
      // 24c: fload 12
      // 24e: fload 10
      // 250: fconst_2
      // 251: fdiv
      // 252: fadd
      // 253: f2d
      // 254: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 257: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.b ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 25a: bipush 0
      // 25b: bipush 16
      // 25d: aconst_null
      // 25e: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.e (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 261: pop2
      // 262: aload 0
      // 263: bipush 4
      // 264: newarray 6
      // 266: astore 14
      // 268: aload 14
      // 26a: bipush 0
      // 26b: fload 11
      // 26d: fastore
      // 26e: aload 14
      // 270: bipush 1
      // 271: fload 12
      // 273: fastore
      // 274: aload 14
      // 276: bipush 2
      // 277: fload 10
      // 279: fastore
      // 27a: aload 14
      // 27c: bipush 3
      // 27d: fload 10
      // 27f: fastore
      // 280: aload 14
      // 282: putfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll [F
      // 285: aload 0
      // 286: aconst_null
      // 287: putfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll [F
      // 28a: aload 0
      // 28b: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 28e: getstatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 291: if_acmpeq 38e
      // 294: ldc_w 46.0
      // 297: fstore 14
      // 299: fload 11
      // 29b: ldc_w 8.0
      // 29e: fsub
      // 29f: fload 14
      // 2a1: fsub
      // 2a2: fstore 15
      // 2a4: iload 5
      // 2a6: i2f
      // 2a7: fload 15
      // 2a9: fcmpl
      // 2aa: aload 7
      // 2ac: ifnonnull 2c9
      // 2af: iflt 317
      // 2b2: goto 2b9
      // 2b5: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2b8: athrow
      // 2b9: iload 5
      // 2bb: i2f
      // 2bc: fload 15
      // 2be: fload 14
      // 2c0: fadd
      // 2c1: fcmpg
      // 2c2: goto 2c9
      // 2c5: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2c8: athrow
      // 2c9: aload 7
      // 2cb: ifnonnull 2e5
      // 2ce: ifgt 317
      // 2d1: goto 2d8
      // 2d4: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2d7: athrow
      // 2d8: iload 6
      // 2da: i2f
      // 2db: fload 12
      // 2dd: fcmpl
      // 2de: goto 2e5
      // 2e1: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2e4: athrow
      // 2e5: aload 7
      // 2e7: ifnonnull 304
      // 2ea: iflt 317
      // 2ed: goto 2f4
      // 2f0: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 2f3: athrow
      // 2f4: iload 6
      // 2f6: i2f
      // 2f7: fload 12
      // 2f9: fload 10
      // 2fb: fadd
      // 2fc: fcmpg
      // 2fd: goto 304
      // 300: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 303: athrow
      // 304: aload 7
      // 306: ifnonnull 314
      // 309: ifgt 317
      // 30c: goto 313
      // 30f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 312: athrow
      // 313: bipush 1
      // 314: goto 318
      // 317: bipush 0
      // 318: istore 16
      // 31a: fload 15
      // 31c: fload 12
      // 31e: fload 14
      // 320: fload 10
      // 322: iload 16
      // 324: ifeq 334
      // 327: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 32a: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.g ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 32d: goto 33a
      // 330: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 333: athrow
      // 334: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 337: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.j ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 33a: ldc_w 5.0
      // 33d: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 340: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 343: sipush 6324
      // 346: sipush 27966
      // 349: pop2
      // 34a: ldc_w "‹ Back"
      // 34d: fload 15
      // 34f: fload 14
      // 351: fconst_2
      // 352: fdiv
      // 353: fadd
      // 354: f2d
      // 355: fload 12
      // 357: fload 10
      // 359: fconst_2
      // 35a: fdiv
      // 35b: fadd
      // 35c: f2d
      // 35d: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 360: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.b ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 363: bipush 0
      // 364: bipush 16
      // 366: aconst_null
      // 367: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.e (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 36a: pop2
      // 36b: aload 0
      // 36c: bipush 4
      // 36d: newarray 6
      // 36f: astore 17
      // 371: aload 17
      // 373: bipush 0
      // 374: fload 15
      // 376: fastore
      // 377: aload 17
      // 379: bipush 1
      // 37a: fload 12
      // 37c: fastore
      // 37d: aload 17
      // 37f: bipush 2
      // 380: fload 14
      // 382: fastore
      // 383: aload 17
      // 385: bipush 3
      // 386: fload 10
      // 388: fastore
      // 389: aload 17
      // 38b: putfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll [F
      // 38e: aconst_null
      // 38f: astore 14
      // 391: aload 0
      // 392: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/ArrayList;
      // 395: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 398: dup
      // 399: sipush 6330
      // 39c: sipush 1356
      // 39f: pop2
      // 3a0: ldc "iterator(...)"
      // 3a2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3a5: astore 15
      // 3a7: aload 15
      // 3a9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3ae: ifeq 739
      // 3b1: aload 15
      // 3b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b8: dup
      // 3b9: sipush 6327
      // 3bc: sipush -26570
      // 3bf: pop2
      // 3c0: ldc "next(...)"
      // 3c2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3c5: checkcast me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      // 3c8: astore 16
      // 3ca: iload 5
      // 3cc: i2f
      // 3cd: aload 16
      // 3cf: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 3d2: fcmpl
      // 3d3: aload 7
      // 3d5: ifnonnull 753
      // 3d8: aload 7
      // 3da: ifnonnull 404
      // 3dd: goto 3e4
      // 3e0: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3e3: athrow
      // 3e4: iflt 45b
      // 3e7: goto 3ee
      // 3ea: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 3ed: athrow
      // 3ee: iload 5
      // 3f0: i2f
      // 3f1: aload 16
      // 3f3: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 3f6: aload 16
      // 3f8: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()F
      // 3fb: fadd
      // 3fc: fcmpg
      // 3fd: goto 404
      // 400: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 403: athrow
      // 404: aload 7
      // 406: ifnonnull 423
      // 409: ifgt 45b
      // 40c: goto 413
      // 40f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 412: athrow
      // 413: iload 6
      // 415: i2f
      // 416: aload 16
      // 418: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 41b: fcmpl
      // 41c: goto 423
      // 41f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 422: athrow
      // 423: aload 7
      // 425: ifnonnull 448
      // 428: iflt 45b
      // 42b: goto 432
      // 42e: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 431: athrow
      // 432: iload 6
      // 434: i2f
      // 435: aload 16
      // 437: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 43a: aload 16
      // 43c: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()F
      // 43f: fadd
      // 440: fcmpg
      // 441: goto 448
      // 444: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 447: athrow
      // 448: aload 7
      // 44a: ifnonnull 458
      // 44d: ifgt 45b
      // 450: goto 457
      // 453: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 456: athrow
      // 457: bipush 1
      // 458: goto 45c
      // 45b: bipush 0
      // 45c: istore 17
      // 45e: iload 17
      // 460: ifeq 46a
      // 463: aload 16
      // 465: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.h ()Ljava/lang/String;
      // 468: astore 14
      // 46a: aload 16
      // 46c: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 46f: ldc_w 3.0
      // 472: fadd
      // 473: fstore 18
      // 475: aload 16
      // 477: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 47a: ldc_w 3.0
      // 47d: fadd
      // 47e: fstore 19
      // 480: aload 16
      // 482: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()F
      // 485: ldc_w 6.0
      // 488: fsub
      // 489: fstore 20
      // 48b: aload 16
      // 48d: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()F
      // 490: ldc_w 6.0
      // 493: fsub
      // 494: fstore 21
      // 496: nop
      // 497: aload 16
      // 499: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.l ()Z
      // 49c: aload 7
      // 49e: ifnonnull 4c3
      // 4a1: ifeq 4be
      // 4a4: goto 4ab
      // 4a7: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4aa: athrow
      // 4ab: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4ae: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.e ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4b1: ldc_w 0.7
      // 4b4: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4b7: goto 503
      // 4ba: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4bd: athrow
      // 4be: aload 16
      // 4c0: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j ()Z
      // 4c3: aload 7
      // 4c5: ifnonnull 4e7
      // 4c8: ifeq 4e5
      // 4cb: goto 4d2
      // 4ce: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4d1: athrow
      // 4d2: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4d5: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.h ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4d8: ldc_w 0.9
      // 4db: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4de: goto 503
      // 4e1: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4e4: athrow
      // 4e5: iload 17
      // 4e7: ifeq 4f7
      // 4ea: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4ed: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.g ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4f0: goto 503
      // 4f3: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 4f6: athrow
      // 4f7: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 4fa: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.j ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 4fd: ldc_w 0.55
      // 500: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 503: astore 22
      // 505: fload 18
      // 507: fload 19
      // 509: fload 20
      // 50b: fload 21
      // 50d: aload 22
      // 50f: ldc_w 8.0
      // 512: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 515: fload 18
      // 517: fload 19
      // 519: fload 20
      // 51b: fload 21
      // 51d: fconst_1
      // 51e: nop
      // 51f: aload 16
      // 521: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.l ()Z
      // 524: aload 7
      // 526: ifnonnull 54b
      // 529: ifeq 546
      // 52c: goto 533
      // 52f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 532: athrow
      // 533: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 536: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 539: ldc_w 0.2
      // 53c: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 53f: goto 57e
      // 542: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 545: athrow
      // 546: aload 16
      // 548: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j ()Z
      // 54b: aload 7
      // 54d: ifnonnull 55c
      // 550: ifne 55f
      // 553: goto 55a
      // 556: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 559: athrow
      // 55a: iload 17
      // 55c: ifeq 572
      // 55f: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 562: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.ah ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 565: ldc_w 0.65
      // 568: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 56b: goto 57e
      // 56e: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 571: athrow
      // 572: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 575: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 578: ldc_w 0.3
      // 57b: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 57e: ldc_w 8.0
      // 581: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 584: aload 16
      // 586: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.l ()Z
      // 589: aload 7
      // 58b: ifnonnull 5ed
      // 58e: ifeq 5dc
      // 591: goto 598
      // 594: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 597: athrow
      // 598: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 59b: sipush 6320
      // 59e: sipush -24714
      // 5a1: pop2
      // 5a2: ldc_w "OFF"
      // 5a5: aload 16
      // 5a7: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 5aa: aload 16
      // 5ac: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()F
      // 5af: fconst_2
      // 5b0: fdiv
      // 5b1: fadd
      // 5b2: f2d
      // 5b3: aload 16
      // 5b5: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 5b8: aload 16
      // 5ba: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()F
      // 5bd: fconst_2
      // 5be: fdiv
      // 5bf: fadd
      // 5c0: f2d
      // 5c1: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 5c4: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 5c7: ldc_w 0.8
      // 5ca: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 5cd: bipush 0
      // 5ce: bipush 16
      // 5d0: aconst_null
      // 5d1: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.e (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 5d4: pop2
      // 5d5: goto 5dc
      // 5d8: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5db: athrow
      // 5dc: aload 16
      // 5de: aload 7
      // 5e0: ifnonnull 6b4
      // 5e3: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.k ()Z
      // 5e6: goto 5ed
      // 5e9: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5ec: athrow
      // 5ed: ifeq 6b2
      // 5f0: aload 16
      // 5f2: aload 7
      // 5f4: ifnonnull 6b4
      // 5f7: goto 5fe
      // 5fa: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 5fd: athrow
      // 5fe: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.i ()Lnet/minecraft/world/item/ItemStack;
      // 601: ifnonnull 6b2
      // 604: goto 60b
      // 607: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 60a: athrow
      // 60b: aload 16
      // 60d: aload 7
      // 60f: ifnonnull 6b4
      // 612: goto 619
      // 615: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 618: athrow
      // 619: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.l ()Z
      // 61c: ifne 6b2
      // 61f: goto 626
      // 622: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 625: athrow
      // 626: aload 0
      // 627: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl F
      // 62a: ldc_w 0.7
      // 62d: fmul
      // 62e: fstore 23
      // 630: aload 16
      // 632: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 635: aload 16
      // 637: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()F
      // 63a: fconst_2
      // 63b: fdiv
      // 63c: fadd
      // 63d: fload 23
      // 63f: fconst_2
      // 640: fdiv
      // 641: fsub
      // 642: fstore 24
      // 644: aload 16
      // 646: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.f ()F
      // 649: aload 0
      // 64a: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl F
      // 64d: fload 23
      // 64f: fsub
      // 650: fconst_2
      // 651: fdiv
      // 652: fadd
      // 653: fstore 25
      // 655: fload 24
      // 657: fload 25
      // 659: fload 23
      // 65b: fload 23
      // 65d: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 660: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.e ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 663: ldc_w 0.85
      // 666: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 669: ldc_w 5.0
      // 66c: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 66f: fload 24
      // 671: fload 25
      // 673: fload 23
      // 675: fload 23
      // 677: fconst_1
      // 678: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 67b: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.y ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 67e: ldc_w 0.4
      // 681: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 684: ldc_w 5.0
      // 687: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 68a: fload 24
      // 68c: ldc_w 4.0
      // 68f: fadd
      // 690: fload 25
      // 692: fload 23
      // 694: fadd
      // 695: ldc_w 7.0
      // 698: fsub
      // 699: fload 23
      // 69b: ldc_w 8.0
      // 69e: fsub
      // 69f: ldc_w 3.0
      // 6a2: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 6a5: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.A ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 6a8: ldc_w 0.7
      // 6ab: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 6ae: fconst_1
      // 6af: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a (FFFFLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;F)V
      // 6b2: aload 16
      // 6b4: aload 7
      // 6b6: ifnonnull 6c8
      // 6b9: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 6bc: ifnull 3a7
      // 6bf: goto 6c6
      // 6c2: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 6c5: athrow
      // 6c6: aload 16
      // 6c8: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.l ()Z
      // 6cb: aload 7
      // 6cd: ifnonnull 3ae
      // 6d0: ifne 3a7
      // 6d3: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 6d6: aload 16
      // 6d8: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g ()Ljava/lang/String;
      // 6db: aload 16
      // 6dd: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a ()F
      // 6e0: aload 16
      // 6e2: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c ()F
      // 6e5: fconst_2
      // 6e6: fdiv
      // 6e7: fadd
      // 6e8: f2d
      // 6e9: aload 16
      // 6eb: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b ()F
      // 6ee: aload 16
      // 6f0: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d ()F
      // 6f3: fadd
      // 6f4: ldc_w 12.0
      // 6f7: fsub
      // 6f8: f2d
      // 6f9: iload 17
      // 6fb: aload 7
      // 6fd: ifnonnull 716
      // 700: ifne 719
      // 703: goto 70a
      // 706: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 709: athrow
      // 70a: aload 16
      // 70c: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.j ()Z
      // 70f: goto 716
      // 712: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 715: athrow
      // 716: ifeq 726
      // 719: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 71c: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 71f: goto 72c
      // 722: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 725: athrow
      // 726: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 729: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 72c: bipush 0
      // 72d: bipush 16
      // 72f: aconst_null
      // 730: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.c (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 733: pop2
      // 734: aload 7
      // 736: ifnull 3a7
      // 739: aload 14
      // 73b: dup
      // 73c: ifnonnull 78a
      // 73f: pop
      // 740: aload 0
      // 741: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 744: getstatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 747: swap
      // 748: invokevirtual me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ordinal ()I
      // 74b: iaload
      // 74c: goto 753
      // 74f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 752: athrow
      // 753: aload 7
      // 755: ifnonnull 775
      // 758: bipush 1
      // 759: if_icmpne 787
      // 75c: goto 763
      // 75f: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 762: athrow
      // 763: getstatic me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI;
      // 766: invokevirtual me/octo/client/IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.b ()Ljava/util/Map;
      // 769: invokeinterface java/util/Map.size ()I 1
      // 76e: goto 775
      // 771: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 774: athrow
      // 775: sipush 6305
      // 778: sipush 26946
      // 77b: pop2
      // 77c: ldc_w "/7 slots configured"
      // 77f: invokedynamic makeConcatWithConstants (ILjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 784: goto 78a
      // 787: ldc_w ""
      // 78a: astore 15
      // 78c: aload 15
      // 78e: checkcast java/lang/CharSequence
      // 791: invokeinterface java/lang/CharSequence.length ()I 1
      // 796: aload 7
      // 798: ifnonnull 7a6
      // 79b: ifle 7a9
      // 79e: goto 7a5
      // 7a1: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7a4: athrow
      // 7a5: bipush 1
      // 7a6: goto 7aa
      // 7a9: bipush 0
      // 7aa: ifeq 7e9
      // 7ad: getstatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;
      // 7b0: aload 15
      // 7b2: fload 1
      // 7b3: aload 0
      // 7b4: getfield me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI F
      // 7b7: fadd
      // 7b8: f2d
      // 7b9: fload 2
      // 7ba: fload 4
      // 7bc: fadd
      // 7bd: ldc_w 19.0
      // 7c0: fsub
      // 7c1: f2d
      // 7c2: aload 14
      // 7c4: ifnull 7db
      // 7c7: goto 7ce
      // 7ca: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7cd: athrow
      // 7ce: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 7d1: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.a ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 7d4: goto 7e1
      // 7d7: invokestatic me/octo/client/IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.a (Lkotlin/NoWhenBranchMatchedException;)Lkotlin/NoWhenBranchMatchedException;
      // 7da: athrow
      // 7db: getstatic me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl;
      // 7de: invokevirtual me/octo/client/IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.c ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 7e1: bipush 0
      // 7e2: bipush 16
      // 7e4: aconst_null
      // 7e5: invokestatic me/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll.b (Lme/octo/client/utils/lIIIIlIIllIIlIlIIlIllIIllIIIlIllIIllIIIlIlIllIlIlIIlIlIIlIIlIIlIlIlIllllIIIllIIlIIIll;Ljava/lang/String;DDLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;ZILjava/lang/Object;)D
      // 7e8: pop2
      // 7e9: return
   }

   private final String a(String param1, int param2) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if (var3 != null) { return param1; }
      if (param1.length() <= param2) { return param1; }
      return kotlin.text.StringsKt.take(param1, param2 - 1) + "…";
   }

   private final void a(GuiGraphicsExtractor var1, ItemStack var2, float var3, float var4, float var5) {
      var1.pose().pushMatrix();
      var1.pose().translate(var3, var4);
      var1.pose().scale(var5, var5);
      var1.item(var2, 0, 0);
      var1.pose().popMatrix();
   }

   @Override
   public void a(int var1, int var2) {
   }

   @Override
   public boolean a(double param1, double param3, int param5) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      float var7 = (float)param1;
      float var8 = (float)param3;
      if (var4 == null && param5 == 0 && this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null && this.a(var7, var8, this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll)) { this.i(); Minecraft.getInstance().setScreen((net.minecraft.client.gui.screens.Screen)null); return true; }
      if (var4 == null && param5 == 0 && this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != null && this.a(var7, var8, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)) { this.i(); this.j(); return true; }
      for (IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var10 : this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) { if (var4 == null && var7 - var10.a() >= 0.0F && var7 - (var10.a() + var10.c()) <= 0.0F && var8 - var10.b() >= 0.0F && var8 - (var10.b() + var10.d()) <= 0.0F) { if (param5 == 0) { var10.n().invoke(); this.i(); return true; } if (param5 == 1) { kotlin.jvm.functions.Function0 var10000 = var10.m(); if (var10000 != null) { var10000.invoke(); this.i(); } return true; } return true; } }
      if (var4 == null && param5 == 0 && this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII != null && this.a(var7, var8, this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII)) { Minecraft.getInstance().setScreen((net.minecraft.client.gui.screens.Screen)null); return true; }
      return true;
   }

   private final boolean a(float param1, float param2, float[] param3) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if (var4 == null && !(param1 - param3[0] >= 0.0F)) { return false; }
      if (var4 == null && param1 - (param3[0] + param3[2]) > 0.0F) { return false; }
      if (var4 == null && !(param2 - param3[1] >= 0.0F)) { return false; }
      if (var4 == null && param2 - (param3[1] + param3[3]) > 0.0F) { return false; }
      return true;
   }

   private final void i() {
      String var2;
      try {
         var2 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .c()
            .D();
      } catch (Throwable var6) {
         short var10000 = 6335;
         short var10001 = -7679;
         var2 = "Vanilla";
      }

      float var3;
      try {
         var3 = lllllIllIIlIlIlIllIlIIlllIlIlIllIlIlIlIIIIlllllIllllIIllIllIllIlllIlIIIlIlIlllIIlllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .d()
            .n();
      } catch (Throwable var5) {
         var3 = 0.6F;
      }

      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var2, var3);
   }

    private final void j() {
       switch (me.octo.client.IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.ordinal()]) {
          case 1:
          case 2:
             this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
             break;
          case 3:
             this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
             break;
          default:
             throw new kotlin.NoWhenBranchMatchedException();
       }
    }

   @Override
   public boolean a(int param1, int param2, int param3) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if (var4 != null) { return param1 != 0; }
      if (param1 != 256) { return super.a(param1, param2, param3); }
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl == IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) { Minecraft.getInstance().setScreen(null); }
      if (var4 != null) { this.j(); }
      return true;
   }

   private static final Unit a(
      IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7
   ) {
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
         0.0F,
         0.0F,
         var0.a().getWindow().getWidth(),
         var0.a().getWindow().getHeight(),
         IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e()
            .a(0.65F),
         0.0F
      );
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.g();
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var1, var1);
      var0.a(var2, var3, var4, var5, var6, var7);
      lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.h();
      return Unit.INSTANCE;
   }

   private static final void a(
      IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI var0,
      float var1,
      float var2,
      int var3,
      int var4,
      String var5,
      String var6,
      ItemStack var7,
      boolean var8,
      boolean var9,
      boolean var10,
      Function0<Unit> var11,
      Function0<Unit> var12
   ) {
      float var13 = var0.e();
      float var14 = var1 + var3 * var13;
      float var15 = var2 + var4 * var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      float var16 = var14 + var13 / 2.0F - var0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl / 2.0F;

      float var10000;
      label17: {
         try {
            if (var5 != null) {
               var10000 = var15 + 6.0F;
               break label17;
            }
         } catch (NoWhenBranchMatchedException var18) {
            throw (RuntimeException)a(var18);
         }

         var10000 = var15
            + (
                  var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                     - var0.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
               )
               / 2.0F
            - 1.0F;
      }

      float var17 = var10000;
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .add(
            new IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var14,
               var15,
               var13,
               var0.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl,
               var16,
               var17,
               var5,
               var6,
               var7,
               var8,
               var9,
               var10,
               var11,
               var12
            )
         );
   }

   static void a(
      IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI var0,
      float var1,
      float var2,
      int var3,
      int var4,
      String var5,
      String var6,
      ItemStack var7,
      boolean var8,
      boolean var9,
      boolean var10,
      Function0<Unit> var11,
      Function0<Unit> var12,
      int var13,
      Object var14
   ) {
      int var15 = var13 & 1024;
      if (var15 != 0) {
         var10 = false;
      }
      if ((var13 & 2048) != 0) {
         var11 = null;
      }
      a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   private static final Unit b(int var0) {
      IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .c(var0);
      return Unit.INSTANCE;
   }

   private static final Unit a(IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI var0, int var1) {
      var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return Unit.INSTANCE;
   }

   private static final Unit a(
      IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI var0,
      me.octo.client.IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      var0.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
      var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      return Unit.INSTANCE;
   }

   private static final Unit a(
      boolean param0,
      IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI param1,
      me.octo.client.IIllllIlIIIllllIlIIlIIIIIIlIlIlIIIIllIIIIllllIllIIIlllIllIlIIlllIlIIlIIllIIIIIlllllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2
   ) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = me.octo.client.IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      if (var3 == null && param0) { IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, (String)null); }
      if (var3 != null || param0) { IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(param1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, param2.a()); }
      param1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      return Unit.INSTANCE;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[24];
      int var3 = 0;
      String var2 = ";È¿Ñ 00E!zh\u0087\u001c\u0012\u0082\u0006⁵Á\u007f\u0019Ó²\t;î1\u0004,ã\u009dC\u0013\u0019_Ä⇐ø¯é§~\"Eú\u0083¯*i¥\u008fÿÖ\u0003\u001bk@\u0089\u008c\u00051GWiæ\u0003FZ¥\u0005_8⇐g¯\u00055õ¸Þ#\u001eg\u209eeB±\u0099¯æ¸69þZ\u0094\u0090gv<Ðêâð\u0000ç\u001e\u0083ß¡Q<%üÖ↤º! ru\t\\d\u0095¾@í<t¸÷_\u00ad\u00883ú\u0080%\u0088Í \u0001~\u000e2·|G%\u0007pÜqÛ´ä\r\u0015¬₻\u001cæ\u009a\u000bBjÍýuî7\u0083g:ü\u00853üo\u001b£\u009cjóy\u009fyRa8\u0000ËS\u0004\u0012Íà¯\u0002\u0098½¤N<Òó¦\u0006$Ä_i\u001cC\u0006¢4\u0089Ãóu\r\u008b\u00adÝYFÔñèö\u0082¹ÀB5xâ!\u0085ö\u009e!OÄKÓ[ÉN\u008bÙiýöC\u001fcÀ\u0088\u0095×U\u0085\u001dÖ\u001dó\u00adåQ\u000eÑ¨8Â\u009fl{¤8\u0016\u001fîÝXøÍ´\rÏ\u009fU\u001fW\u001cÓñ²¡1¤S\u0007ÄQt¸\u001d\"\u0005\t4\u0098ÐÊ\u0010:\u001axã\u0013V\u001d\u00ade¨i\u009b&Ë7VÒ\u0099\u008b\u0004\"ô\u009e\u0093\u0006\u0013Î¹(Àk";
      int var4 = ";È¿Ñ 00E!zh\u0087\u001c\u0012\u0082\u0006⁵Á\u007f\u0019Ó²\t;î1\u0004,ã\u009dC\u0013\u0019_Ä⇐ø¯é§~\"Eú\u0083¯*i¥\u008fÿÖ\u0003\u001bk@\u0089\u008c\u00051GWiæ\u0003FZ¥\u0005_8⇐g¯\u00055õ¸Þ#\u001eg\u209eeB±\u0099¯æ¸69þZ\u0094\u0090gv<Ðêâð\u0000ç\u001e\u0083ß¡Q<%üÖ↤º! ru\t\\d\u0095¾@í<t¸÷_\u00ad\u00883ú\u0080%\u0088Í \u0001~\u000e2·|G%\u0007pÜqÛ´ä\r\u0015¬₻\u001cæ\u009a\u000bBjÍýuî7\u0083g:ü\u00853üo\u001b£\u009cjóy\u009fyRa8\u0000ËS\u0004\u0012Íà¯\u0002\u0098½¤N<Òó¦\u0006$Ä_i\u001cC\u0006¢4\u0089Ãóu\r\u008b\u00adÝYFÔñèö\u0082¹ÀB5xâ!\u0085ö\u009e!OÄKÓ[ÉN\u008bÙiýöC\u001fcÀ\u0088\u0095×U\u0085\u001dÖ\u001dó\u00adåQ\u000eÑ¨8Â\u009fl{¤8\u0016\u001fîÝXøÍ´\rÏ\u009fU\u001fW\u001cÓñ²¡1¤S\u0007ÄQt¸\u001d\"\u0005\t4\u0098ÐÊ\u0010:\u001axã\u0013V\u001d\u00ade¨i\u009b&Ë7VÒ\u0099\u008b\u0004\"ô\u009e\u0093\u0006\u0013Î¹(Àk"
         .length();
      char var1 = 15;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 96;
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
                     case 0 -> 93;
                     case 1 -> 33;
                     case 2 -> 74;
                     case 3 -> 44;
                     case 4 -> 112;
                     case 5 -> 94;
                     default -> 121;
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
                     e = var5;
                     f = new String[24];
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

                  var2 = "9ì¬h4h@\u0004}·qDGÜp&¯ÿuý\t<\u009a$çË\u0095\u000b8Ï";
                  var4 = "9ì¬h4h@\u0004}·qDGÜp&¯ÿuý\t<\u009a$çË\u0095\u000b8Ï".length();
                  var1 = 20;
                  var8 = -1;
            }

            var10000 = 62;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 6325) & 65535;
      if (f[var2] == null) {
         char[] var3 = e[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 117;
            case 1 -> 184;
            case 2 -> 103;
            case 3 -> 34;
            case 4 -> 0;
            case 5 -> 91;
            case 6 -> 206;
            case 7 -> 210;
            case 8 -> 224;
            case 9 -> 166;
            case 10 -> 41;
            case 11 -> 227;
            case 12 -> 222;
            case 13 -> 183;
            case 14 -> 213;
            case 15 -> 6;
            case 16 -> 3;
            case 17 -> 63;
            case 18 -> 152;
            case 19 -> 45;
            case 20 -> 24;
            case 21 -> 57;
            case 22 -> 11;
            case 23 -> 250;
            case 24 -> 191;
            case 25 -> 242;
            case 26 -> 128;
            case 27 -> 90;
            case 28 -> 1;
            case 29 -> 56;
            case 30 -> 176;
            case 31 -> 148;
            case 32 -> 139;
            case 33 -> 143;
            case 34 -> 124;
            case 35 -> 122;
            case 36 -> 237;
            case 37 -> 196;
            case 38 -> 88;
            case 39 -> 219;
            case 40 -> 15;
            case 41 -> 127;
            case 42 -> 140;
            case 43 -> 241;
            case 44 -> 94;
            case 45 -> 37;
            case 46 -> 119;
            case 47 -> 145;
            case 48 -> 125;
            case 49 -> 80;
            case 50 -> 52;
            case 51 -> 27;
            case 52 -> 73;
            case 53 -> 51;
            case 54 -> 141;
            case 55 -> 44;
            case 56 -> 33;
            case 57 -> 168;
            case 58 -> 22;
            case 59 -> 243;
            case 60 -> 215;
            case 61 -> 92;
            case 62 -> 144;
            case 63 -> 82;
            case 64 -> 189;
            case 65 -> 21;
            case 66 -> 40;
            case 67 -> 201;
            case 68 -> 19;
            case 69 -> 50;
            case 70 -> 202;
            case 71 -> 162;
            case 72 -> 205;
            case 73 -> 74;
            case 74 -> 177;
            case 75 -> 134;
            case 76 -> 175;
            case 77 -> 230;
            case 78 -> 47;
            case 79 -> 161;
            case 80 -> 223;
            case 81 -> 65;
            case 82 -> 150;
            case 83 -> 83;
            case 84 -> 113;
            case 85 -> 85;
            case 86 -> 179;
            case 87 -> 115;
            case 88 -> 12;
            case 89 -> 197;
            case 90 -> 123;
            case 91 -> 252;
            case 92 -> 8;
            case 93 -> 87;
            case 94 -> 170;
            case 95 -> 71;
            case 96 -> 29;
            case 97 -> 38;
            case 98 -> 121;
            case 99 -> 48;
            case 100 -> 209;
            case 101 -> 169;
            case 102 -> 233;
            case 103 -> 39;
            case 104 -> 218;
            case 105 -> 154;
            case 106 -> 99;
            case 107 -> 254;
            case 108 -> 187;
            case 109 -> 98;
            case 110 -> 110;
            case 111 -> 53;
            case 112 -> 25;
            case 113 -> 18;
            case 114 -> 89;
            case 115 -> 20;
            case 116 -> 112;
            case 117 -> 193;
            case 118 -> 120;
            case 119 -> 178;
            case 120 -> 146;
            case 121 -> 67;
            case 122 -> 32;
            case 123 -> 66;
            case 124 -> 173;
            case 125 -> 79;
            case 126 -> 81;
            case 127 -> 156;
            case 128 -> 14;
            case 129 -> 216;
            case 130 -> 5;
            case 131 -> 195;
            case 132 -> 96;
            case 133 -> 251;
            case 134 -> 132;
            case 135 -> 159;
            case 136 -> 235;
            case 137 -> 160;
            case 138 -> 217;
            case 139 -> 133;
            case 140 -> 116;
            case 141 -> 240;
            case 142 -> 172;
            case 143 -> 55;
            case 144 -> 149;
            case 145 -> 16;
            case 146 -> 212;
            case 147 -> 130;
            case 148 -> 60;
            case 149 -> 129;
            case 150 -> 108;
            case 151 -> 76;
            case 152 -> 59;
            case 153 -> 225;
            case 154 -> 228;
            case 155 -> 244;
            case 156 -> 75;
            case 157 -> 97;
            case 158 -> 36;
            case 159 -> 142;
            case 160 -> 10;
            case 161 -> 28;
            case 162 -> 68;
            case 163 -> 136;
            case 164 -> 78;
            case 165 -> 95;
            case 166 -> 155;
            case 167 -> 105;
            case 168 -> 255;
            case 169 -> 253;
            case 170 -> 54;
            case 171 -> 9;
            case 172 -> 137;
            case 173 -> 46;
            case 174 -> 4;
            case 175 -> 232;
            case 176 -> 138;
            case 177 -> 181;
            case 178 -> 131;
            case 179 -> 114;
            case 180 -> 188;
            case 181 -> 84;
            case 182 -> 109;
            case 183 -> 23;
            case 184 -> 167;
            case 185 -> 49;
            case 186 -> 231;
            case 187 -> 200;
            case 188 -> 190;
            case 189 -> 236;
            case 190 -> 226;
            case 191 -> 104;
            case 192 -> 153;
            case 193 -> 239;
            case 194 -> 249;
            case 195 -> 43;
            case 196 -> 220;
            case 197 -> 30;
            case 198 -> 247;
            case 199 -> 180;
            case 200 -> 158;
            case 201 -> 86;
            case 202 -> 13;
            case 203 -> 245;
            case 204 -> 62;
            case 205 -> 64;
            case 206 -> 157;
            case 207 -> 61;
            case 208 -> 204;
            case 209 -> 198;
            case 210 -> 182;
            case 211 -> 111;
            case 212 -> 174;
            case 213 -> 208;
            case 214 -> 234;
            case 215 -> 93;
            case 216 -> 171;
            case 217 -> 221;
            case 218 -> 165;
            case 219 -> 26;
            case 220 -> 107;
            case 221 -> 211;
            case 222 -> 185;
            case 223 -> 151;
            case 224 -> 58;
            case 225 -> 194;
            case 226 -> 17;
            case 227 -> 186;
            case 228 -> 207;
            case 229 -> 163;
            case 230 -> 106;
            case 231 -> 135;
            case 232 -> 126;
            case 233 -> 147;
            case 234 -> 246;
            case 235 -> 248;
            case 236 -> 118;
            case 237 -> 31;
            case 238 -> 42;
            case 239 -> 70;
            case 240 -> 192;
            case 241 -> 35;
            case 242 -> 164;
            case 243 -> 100;
            case 244 -> 69;
            case 245 -> 238;
            case 246 -> 77;
            case 247 -> 101;
            case 248 -> 2;
            case 249 -> 229;
            case 250 -> 7;
            case 251 -> 199;
            case 252 -> 72;
            case 253 -> 203;
            case 254 -> 102;
            default -> 214;
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

         f[var2] = new String(var3).intern();
      }

      return f[var2];
   }

   private static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl };

      public static IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] a() {
         return (IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll a(
         String var0
      ) {
         return Enum.valueOf(
            IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final EnumEntries<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = kotlin.enums.EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   

  // PX-FIX synth restored from jar bytecode

  // PX-FIX synth restored from jar bytecode: anewarray + getstatic*/aastore
  public static final me.octo.client.IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] c() { return new me.octo.client.IIlIlIlllIlIlIlllIlIIIlIlIlIIIIlIIIllIIIIIlllIIIlIlIlIlIlllIlIllIIlIIIlIlIIIIlIllIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] { IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl }; }
}

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      // PX-FIX RC4-312: masked default-arg constructor restored from jar bytecode (descriptor (FFFFFFLjava/lang/String;Ljava/lang/String;Lnet/minecraft/world/item/ItemStack;ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V)
      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(float p1, float p2, float p3, float p4, float p5, float p6, java.lang.String p7, java.lang.String p8, net.minecraft.world.item.ItemStack p9, boolean p10, boolean p11, boolean p12, kotlin.jvm.functions.Function0 p13, kotlin.jvm.functions.Function0 p14, int mask, kotlin.jvm.internal.DefaultConstructorMarker marker) {
      if ((mask & 2048) != 0) { p12 = false; }
      if ((mask & 4096) != 0) { p13 = null; }
      this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
      }
      private final float IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final float lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private final String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @Nullable
      private final ItemStack IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private final boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      @Nullable
      private final Function0<Unit> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      @NotNull
      private final Function0<Unit> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         float var1,
         float var2,
         float var3,
         float var4,
         float var5,
         float var6,
         @Nullable String var7,
         @NotNull String var8,
         @Nullable ItemStack var9,
         boolean var10,
         boolean var11,
         boolean var12,
         @Nullable Function0<Unit> var13,
         @NotNull Function0<Unit> var14
      ) {
         short var10001 = 16459;
         short var10002 = -3899;
         Intrinsics.checkNotNullParameter(var8, "detail");
         var10001 = 16458;
         var10002 = 15457;
         Intrinsics.checkNotNullParameter(var14, "action");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var11;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var12;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var13;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var14;
      }

      public final float a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final float b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final float c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final float d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final float e() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final float f() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String g() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final String h() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final ItemStack i() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final boolean j() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final boolean k() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final boolean l() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @Nullable
      public final Function0<Unit> m() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      @NotNull
      public final Function0<Unit> n() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "ÖþrÇÀ¸\u0006+\u0000hÖ\u0085\u0091";
         int var4 = "ÖþrÇÀ¸\u0006+\u0000hÖ\u0085\u0091".length();
         char var1 = 6;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 87;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 87;
                  var10006 = var6;
               } else {
                  var13 = 87;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 87;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 1;
                     case 1 -> 118;
                     case 2 -> 12;
                     case 3 -> 13;
                     case 4 -> 39;
                     case 5 -> 118;
                     default -> 88;
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
         int var2 = (var0 ^ 16458) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 246;
               case 1 -> 64;
               case 2 -> 238;
               case 3 -> 129;
               case 4 -> 150;
               case 5 -> 53;
               case 6 -> 209;
               case 7 -> 255;
               case 8 -> 132;
               case 9 -> 217;
               case 10 -> 212;
               case 11 -> 151;
               case 12 -> 47;
               case 13 -> 118;
               case 14 -> 13;
               case 15 -> 111;
               case 16 -> 43;
               case 17 -> 234;
               case 18 -> 247;
               case 19 -> 130;
               case 20 -> 77;
               case 21 -> 201;
               case 22 -> 214;
               case 23 -> 254;
               case 24 -> 122;
               case 25 -> 220;
               case 26 -> 59;
               case 27 -> 206;
               case 28 -> 26;
               case 29 -> 137;
               case 30 -> 4;
               case 31 -> 229;
               case 32 -> 159;
               case 33 -> 50;
               case 34 -> 58;
               case 35 -> 42;
               case 36 -> 198;
               case 37 -> 49;
               case 38 -> 230;
               case 39 -> 222;
               case 40 -> 237;
               case 41 -> 251;
               case 42 -> 95;
               case 43 -> 199;
               case 44 -> 249;
               case 45 -> 142;
               case 46 -> 221;
               case 47 -> 76;
               case 48 -> 244;
               case 49 -> 195;
               case 50 -> 202;
               case 51 -> 27;
               case 52 -> 204;
               case 53 -> 138;
               case 54 -> 17;
               case 55 -> 243;
               case 56 -> 232;
               case 57 -> 139;
               case 58 -> 205;
               case 59 -> 242;
               case 60 -> 241;
               case 61 -> 96;
               case 62 -> 10;
               case 63 -> 99;
               case 64 -> 105;
               case 65 -> 235;
               case 66 -> 184;
               case 67 -> 186;
               case 68 -> 120;
               case 69 -> 106;
               case 70 -> 123;
               case 71 -> 100;
               case 72 -> 133;
               case 73 -> 124;
               case 74 -> 166;
               case 75 -> 226;
               case 76 -> 148;
               case 77 -> 25;
               case 78 -> 8;
               case 79 -> 228;
               case 80 -> 21;
               case 81 -> 200;
               case 82 -> 30;
               case 83 -> 11;
               case 84 -> 156;
               case 85 -> 41;
               case 86 -> 103;
               case 87 -> 91;
               case 88 -> 0;
               case 89 -> 233;
               case 90 -> 110;
               case 91 -> 55;
               case 92 -> 83;
               case 93 -> 9;
               case 94 -> 31;
               case 95 -> 37;
               case 96 -> 216;
               case 97 -> 135;
               case 98 -> 114;
               case 99 -> 240;
               case 100 -> 66;
               case 101 -> 127;
               case 102 -> 143;
               case 103 -> 147;
               case 104 -> 253;
               case 105 -> 175;
               case 106 -> 102;
               case 107 -> 125;
               case 108 -> 78;
               case 109 -> 227;
               case 110 -> 116;
               case 111 -> 73;
               case 112 -> 69;
               case 113 -> 219;
               case 114 -> 108;
               case 115 -> 145;
               case 116 -> 36;
               case 117 -> 79;
               case 118 -> 82;
               case 119 -> 113;
               case 120 -> 160;
               case 121 -> 98;
               case 122 -> 81;
               case 123 -> 92;
               case 124 -> 126;
               case 125 -> 172;
               case 126 -> 248;
               case 127 -> 67;
               case 128 -> 128;
               case 129 -> 6;
               case 130 -> 185;
               case 131 -> 29;
               case 132 -> 252;
               case 133 -> 207;
               case 134 -> 173;
               case 135 -> 35;
               case 136 -> 188;
               case 137 -> 75;
               case 138 -> 181;
               case 139 -> 210;
               case 140 -> 34;
               case 141 -> 117;
               case 142 -> 104;
               case 143 -> 161;
               case 144 -> 215;
               case 145 -> 107;
               case 146 -> 97;
               case 147 -> 12;
               case 148 -> 109;
               case 149 -> 192;
               case 150 -> 167;
               case 151 -> 239;
               case 152 -> 45;
               case 153 -> 33;
               case 154 -> 39;
               case 155 -> 154;
               case 156 -> 170;
               case 157 -> 2;
               case 158 -> 84;
               case 159 -> 131;
               case 160 -> 203;
               case 161 -> 28;
               case 162 -> 177;
               case 163 -> 46;
               case 164 -> 87;
               case 165 -> 32;
               case 166 -> 180;
               case 167 -> 94;
               case 168 -> 62;
               case 169 -> 65;
               case 170 -> 72;
               case 171 -> 15;
               case 172 -> 57;
               case 173 -> 197;
               case 174 -> 196;
               case 175 -> 80;
               case 176 -> 60;
               case 177 -> 146;
               case 178 -> 149;
               case 179 -> 169;
               case 180 -> 208;
               case 181 -> 194;
               case 182 -> 168;
               case 183 -> 89;
               case 184 -> 115;
               case 185 -> 74;
               case 186 -> 19;
               case 187 -> 119;
               case 188 -> 153;
               case 189 -> 231;
               case 190 -> 70;
               case 191 -> 134;
               case 192 -> 223;
               case 193 -> 54;
               case 194 -> 211;
               case 195 -> 71;
               case 196 -> 174;
               case 197 -> 14;
               case 198 -> 218;
               case 199 -> 88;
               case 200 -> 44;
               case 201 -> 5;
               case 202 -> 162;
               case 203 -> 245;
               case 204 -> 16;
               case 205 -> 144;
               case 206 -> 40;
               case 207 -> 22;
               case 208 -> 176;
               case 209 -> 193;
               case 210 -> 164;
               case 211 -> 86;
               case 212 -> 48;
               case 213 -> 171;
               case 214 -> 61;
               case 215 -> 189;
               case 216 -> 183;
               case 217 -> 90;
               case 218 -> 190;
               case 219 -> 179;
               case 220 -> 163;
               case 221 -> 24;
               case 222 -> 63;
               case 223 -> 250;
               case 224 -> 224;
               case 225 -> 20;
               case 226 -> 165;
               case 227 -> 101;
               case 228 -> 182;
               case 229 -> 52;
               case 230 -> 112;
               case 231 -> 38;
               case 232 -> 187;
               case 233 -> 191;
               case 234 -> 155;
               case 235 -> 68;
               case 236 -> 140;
               case 237 -> 93;
               case 238 -> 213;
               case 239 -> 141;
               case 240 -> 1;
               case 241 -> 236;
               case 242 -> 178;
               case 243 -> 121;
               case 244 -> 51;
               case 245 -> 136;
               case 246 -> 225;
               case 247 -> 152;
               case 248 -> 23;
               case 249 -> 85;
               case 250 -> 7;
               case 251 -> 157;
               case 252 -> 18;
               case 253 -> 158;
               case 254 -> 3;
               default -> 56;
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
