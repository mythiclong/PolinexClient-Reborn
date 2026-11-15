package me.octo.client;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import me.octo.client.utils.lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI;

public class lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl
   extends IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI {
   @NotNull
   public static lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @Nullable
   private me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private int IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private static IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private static String[] h;
   private static String[] i;

   public lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      @NotNull String var4,
      @NotNull List<String> var5,
      @NotNull List<String> var6,
      boolean var7,
      @NotNull IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll... var8
   ) {
      short var10001 = 30548;
      short var10002 = 1960;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 30549;
      var10002 = -17662;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 30546;
      var10002 = 2072;
      Intrinsics.checkNotNullParameter(var3, "category");
      var10001 = 30545;
      var10002 = -18299;
      Intrinsics.checkNotNullParameter(var4, "subcategory");
      var10001 = 30547;
      var10002 = 7880;
      Intrinsics.checkNotNullParameter(var5, "instructions");
      var10001 = 30558;
      var10002 = -10214;
      Intrinsics.checkNotNullParameter(var6, "tips");
      var10001 = 30556;
      var10002 = -2280;
      Intrinsics.checkNotNullParameter(var8, "settings");
      super(var1, var2, var3, var4, var5, var6, var7, Arrays.copyOf(var8, var8.length));
   }

   @NotNull
   @Override
   protected lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll aL() {
      return new lIIllIIlIllIIllIIlIIIIIlIlIlllIIIlllllllllIlIllIIIIlllllllllIlIllIIIlIlllllllIlllIlll(true, true, false, false, false, null, 60, null);
   }

   @Nullable
   public final me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a5() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   public final void c(
      @Nullable me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var1;
   }

   public final int a6() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   public final void a(int var1) {
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var1;
   }

   public final void a7() {
      Object var7 = null; // PX-FIX
      boolean var10000 = IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      this.a(
         IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = 0;
      Iterator var2 = this.ac().iterator();
      int var3 = 0;
      boolean var1 = var10000;

      while (var2.hasNext()) {
         int var4 = var3++;
         IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var5 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var2.next();

         label25: {
            try {
               var7 = this;
               if (var1) {
                  break label25;
               }

               if (!a(this, var5, 0.0, (Vec3)null, 6, (Object)null)) {
                  continue;
               }
            } catch (UnsupportedOperationException var6) {
               throw (RuntimeException)a(var6);
            }

            var7 = this;
         }

         this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = Math.min(var4 + 1, CollectionsKt.getLastIndex(this.ac()));
         if (var1) {
            break;
         }
      }
   }

   public final boolean a8() {
      if (this.ac().isEmpty()) { return false; }
      for (me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var6 : this.ac()) {
         if (a(this, var6, 3.0, (Vec3)null, 4, (Object)null)) { return true; }
      }
      return false;
   }

   public final boolean a(
      @NotNull IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll param1, double param2, @NotNull Vec3 param4
   ) {
      Intrinsics.checkNotNullParameter(param1, "waypoint");
      boolean var5 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.e();
      Intrinsics.checkNotNullParameter(param4, "playerPos");
      Vec3 var6 = lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.g(param1.a());
      if (!var5) {
         return true;
      } else {
         if (param4.x < var6.x - param2) {
            return false;
         } else if (param4.x >= var6.x + param2) {
            return false;
         } else if (param4.z < var6.z - param2) {
            return false;
         } else if (param4.z >= var6.z + param2) {
            return false;
         } else {
            return Math.abs(var6.y - param4.y) < 0.6D;
         }
      }
      // 原 jar 字节码（101 条指令 + 9 条 UnsupportedOperationException 透明 try/catch 壳）语义：
      //   if (Nested.e()) { 逐项检查 } else return true;   其中 e() = !d()
      //   x ∈ [center.x - radius, center.x + radius) ∧ z ∈ [center.z - radius, center.z + radius) ∧ |center.y - playerPos.y| < 0.6
      // 与 lIllIIIIIlIIll… 同签名方法的关系：那处调 d() 用 ifne 跳过检查，此处调 e() 用 ifeq 跳过检查，
      // 是同一判定的互补写法；形状差异来自混淆器守卫重复，javac 无法复现同形状。
   }

   @Override
   public void aM() {
      super.aM();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .p();
   }

   public void a9() {
   }

   @Override
   public void aH() {
      this.a9();
   }

   @Override
   public void ah() {
      this.a9();
   }

   @Override
   public void aB() {
      this.a9();
   }

   @Override
   public void N() {
      super.N();
      this.aN();
   }

   @Override
   public void aO() {
      boolean var1 = me.octo.client.IllllllIllIIIllIllIIlIIIllIllIlIlIlIllllllllIIlllIllllIllIlIIIIlIIlIIIlIIlIlIIlIIIIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.d();
      super.aO();
      me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl var2 = llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
      if (var1 || var2.a()) {
         var2.f();
      }
   }

   public final void a_() {
      short var10001 = 30551;
      short var10002 = 28847;
      this.a(
         "Missing: Axe",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[11];
      int var3 = 0;
      String var2 = "\u0094ë%-È¹\u000f\u0006¾\u001f«BêLÄ\u0099¼Ü¶à7·û§P\u000f©\u0082\b\u008aA\u0011õ\u0007-çÒÕ\u0016SfN\u0013ä\u0090\u0084+ûÅ\u008aÎËàUzõ_ëP\u001b@Ï¾h1<\u0099#~úÝöo\u0088\u000eðßa´#ºÀ\u009fh\u0090ÝÜ\f~x¦ÖÀ\\rfÙ\u000e\u0089\u00ad\u0004\u008c\u0081¡ö\u000b.\u0097 ¶\u001bEfìçö8\b¨Ù\u0090ýïìM\u0012\f\u0014*K|fõÚe\u0001Çäi\tuøOi¡üä¸\u0089\u000b!\t¥w\u009b`\u0012åØ»\u000e\u0004ðÌj@";
      int var4 = "\u0094ë%-È¹\u000f\u0006¾\u001f«BêLÄ\u0099¼Ü¶à7·û§P\u000f©\u0082\b\u008aA\u0011õ\u0007-çÒÕ\u0016SfN\u0013ä\u0090\u0084+ûÅ\u008aÎËàUzõ_ëP\u001b@Ï¾h1<\u0099#~úÝöo\u0088\u000eðßa´#ºÀ\u009fh\u0090ÝÜ\f~x¦ÖÀ\\rfÙ\u000e\u0089\u00ad\u0004\u008c\u0081¡ö\u000b.\u0097 ¶\u001bEfìçö8\b¨Ù\u0090ýïìM\u0012\f\u0014*K|fõÚe\u0001Çäi\tuøOi¡üä¸\u0089\u000b!\t¥w\u009b`\u0012åØ»\u000e\u0004ðÌj@"
         .length();
      char var1 = 'W';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 74;
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
                     case 0 -> 53;
                     case 1 -> 86;
                     case 2 -> 91;
                     case 3 -> 39;
                     case 4 -> 8;
                     case 5 -> 18;
                     default -> 75;
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
                     h = var5;
                     i = new String[11];
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
                     llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl();
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

                  var2 = "ØÜV\u001bÀÒîM\bÿ«;uÇ\u009cÁd";
                  var4 = "ØÜV\u001bÀÒîM\bÿ«;uÇ\u009cÁd".length();
                  var1 = '\b';
                  var8 = -1;
            }

            var10000 = 18;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30550) & 65535;
      if (i[var2] == null) {
         char[] var3 = h[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 10;
            case 1 -> 99;
            case 2 -> 126;
            case 3 -> 123;
            case 4 -> 251;
            case 5 -> 156;
            case 6 -> 49;
            case 7 -> 72;
            case 8 -> 150;
            case 9 -> 86;
            case 10 -> 94;
            case 11 -> 152;
            case 12 -> 139;
            case 13 -> 76;
            case 14 -> 137;
            case 15 -> 214;
            case 16 -> 252;
            case 17 -> 17;
            case 18 -> 146;
            case 19 -> 242;
            case 20 -> 188;
            case 21 -> 34;
            case 22 -> 53;
            case 23 -> 7;
            case 24 -> 211;
            case 25 -> 153;
            case 26 -> 197;
            case 27 -> 233;
            case 28 -> 209;
            case 29 -> 15;
            case 30 -> 117;
            case 31 -> 129;
            case 32 -> 61;
            case 33 -> 112;
            case 34 -> 143;
            case 35 -> 136;
            case 36 -> 249;
            case 37 -> 162;
            case 38 -> 250;
            case 39 -> 97;
            case 40 -> 124;
            case 41 -> 114;
            case 42 -> 103;
            case 43 -> 175;
            case 44 -> 213;
            case 45 -> 81;
            case 46 -> 58;
            case 47 -> 238;
            case 48 -> 1;
            case 49 -> 193;
            case 50 -> 52;
            case 51 -> 228;
            case 52 -> 30;
            case 53 -> 36;
            case 54 -> 226;
            case 55 -> 177;
            case 56 -> 55;
            case 57 -> 176;
            case 58 -> 82;
            case 59 -> 108;
            case 60 -> 168;
            case 61 -> 160;
            case 62 -> 141;
            case 63 -> 165;
            case 64 -> 107;
            case 65 -> 135;
            case 66 -> 65;
            case 67 -> 20;
            case 68 -> 246;
            case 69 -> 56;
            case 70 -> 170;
            case 71 -> 144;
            case 72 -> 221;
            case 73 -> 74;
            case 74 -> 201;
            case 75 -> 131;
            case 76 -> 3;
            case 77 -> 33;
            case 78 -> 183;
            case 79 -> 35;
            case 80 -> 18;
            case 81 -> 205;
            case 82 -> 68;
            case 83 -> 87;
            case 84 -> 138;
            case 85 -> 167;
            case 86 -> 212;
            case 87 -> 130;
            case 88 -> 192;
            case 89 -> 5;
            case 90 -> 140;
            case 91 -> 173;
            case 92 -> 219;
            case 93 -> 19;
            case 94 -> 88;
            case 95 -> 59;
            case 96 -> 182;
            case 97 -> 14;
            case 98 -> 145;
            case 99 -> 60;
            case 100 -> 217;
            case 101 -> 37;
            case 102 -> 189;
            case 103 -> 50;
            case 104 -> 38;
            case 105 -> 215;
            case 106 -> 46;
            case 107 -> 198;
            case 108 -> 13;
            case 109 -> 196;
            case 110 -> 185;
            case 111 -> 142;
            case 112 -> 235;
            case 113 -> 98;
            case 114 -> 204;
            case 115 -> 125;
            case 116 -> 229;
            case 117 -> 101;
            case 118 -> 95;
            case 119 -> 22;
            case 120 -> 154;
            case 121 -> 89;
            case 122 -> 161;
            case 123 -> 54;
            case 124 -> 93;
            case 125 -> 111;
            case 126 -> 227;
            case 127 -> 32;
            case 128 -> 64;
            case 129 -> 70;
            case 130 -> 218;
            case 131 -> 147;
            case 132 -> 199;
            case 133 -> 151;
            case 134 -> 24;
            case 135 -> 180;
            case 136 -> 96;
            case 137 -> 92;
            case 138 -> 110;
            case 139 -> 42;
            case 140 -> 48;
            case 141 -> 239;
            case 142 -> 102;
            case 143 -> 31;
            case 144 -> 21;
            case 145 -> 237;
            case 146 -> 63;
            case 147 -> 77;
            case 148 -> 62;
            case 149 -> 255;
            case 150 -> 187;
            case 151 -> 179;
            case 152 -> 195;
            case 153 -> 84;
            case 154 -> 71;
            case 155 -> 202;
            case 156 -> 79;
            case 157 -> 80;
            case 158 -> 4;
            case 159 -> 132;
            case 160 -> 12;
            case 161 -> 253;
            case 162 -> 223;
            case 163 -> 66;
            case 164 -> 6;
            case 165 -> 104;
            case 166 -> 181;
            case 167 -> 166;
            case 168 -> 231;
            case 169 -> 27;
            case 170 -> 121;
            case 171 -> 0;
            case 172 -> 169;
            case 173 -> 148;
            case 174 -> 118;
            case 175 -> 254;
            case 176 -> 44;
            case 177 -> 200;
            case 178 -> 43;
            case 179 -> 78;
            case 180 -> 230;
            case 181 -> 113;
            case 182 -> 155;
            case 183 -> 2;
            case 184 -> 90;
            case 185 -> 28;
            case 186 -> 116;
            case 187 -> 216;
            case 188 -> 225;
            case 189 -> 75;
            case 190 -> 67;
            case 191 -> 184;
            case 192 -> 174;
            case 193 -> 208;
            case 194 -> 119;
            case 195 -> 172;
            case 196 -> 191;
            case 197 -> 163;
            case 198 -> 207;
            case 199 -> 222;
            case 200 -> 244;
            case 201 -> 159;
            case 202 -> 47;
            case 203 -> 133;
            case 204 -> 186;
            case 205 -> 40;
            case 206 -> 248;
            case 207 -> 25;
            case 208 -> 206;
            case 209 -> 85;
            case 210 -> 203;
            case 211 -> 134;
            case 212 -> 29;
            case 213 -> 149;
            case 214 -> 41;
            case 215 -> 100;
            case 216 -> 109;
            case 217 -> 178;
            case 218 -> 120;
            case 219 -> 164;
            case 220 -> 9;
            case 221 -> 73;
            case 222 -> 220;
            case 223 -> 69;
            case 224 -> 26;
            case 225 -> 106;
            case 226 -> 57;
            case 227 -> 115;
            case 228 -> 171;
            case 229 -> 241;
            case 230 -> 234;
            case 231 -> 247;
            case 232 -> 224;
            case 233 -> 122;
            case 234 -> 210;
            case 235 -> 158;
            case 236 -> 236;
            case 237 -> 243;
            case 238 -> 16;
            case 239 -> 232;
            case 240 -> 39;
            case 241 -> 105;
            case 242 -> 45;
            case 243 -> 11;
            case 244 -> 51;
            case 245 -> 91;
            case 246 -> 157;
            case 247 -> 245;
            case 248 -> 190;
            case 249 -> 240;
            case 250 -> 128;
            case 251 -> 83;
            case 252 -> 8;
            case 253 -> 23;
            case 254 -> 127;
            default -> 194;
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

         i[var2] = new String(var3).intern();
      }

      return i[var2];
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

      @NotNull
      public final IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl a() {
         return lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
      }
   }
    public lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl(java.lang.String var1, java.lang.String var2, me.octo.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3, java.lang.String var4, java.util.List var5, java.util.List var6, boolean var7, me.octo.client.IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var8, int var9, kotlin.jvm.internal.DefaultConstructorMarker var10) {
        if ((var9 & 16) != 0) {
            var5 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((var9 & 32) != 0) {
            var6 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((var9 & 64) != 0) {
            var7 = false;
        }
        super(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public static boolean a(me.octo.client.lIIllIIlIIlllllIIIllllllIIIlllIlIlIllIlllllllIlIllIllIIIIIIlIIIllIIllIlIIIllllIlIlIIl var0, me.octo.client.IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var1, double var2, net.minecraft.world.phys.Vec3 var3, int var4, java.lang.Object var5) {
        if (var5 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isOnWaypoint");
        }
        if ((var4 & 2) != 0) {
            var2 = 1.0;
        }
        if ((var4 & 4) != 0) {
            var3 = me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.w();
        }
        return var0.a(var1, var2, var3);
    }

    public static final me.octo.client.IlIllIIIlIIlIllIIIlIIIIlllIIIlIlllIllIIlllIllIIlIlllIllIlIlIIlIIIIlIIIIlllIIlIlIlIlIl ba() {
        return llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
    }

}
