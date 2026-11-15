package me.octo.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public class lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII
   extends IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll
   implements IlIIIIIllIlIIlllIIIllIlllllIIIlllIIIlIlIllIlIllIllIllllIllIIlllIllIllllIIIlIIIIllllll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII(Object... px) {
           this("", "", new String[0]); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private boolean[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] d;
   private static String[] e;

   public lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII(
      @NotNull String var1, @NotNull String var2, @NotNull String... var3
   ) {
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      short var10002 = 7873;
      short var10003 = 1005;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10002 = 7903;
      var10003 = -7918;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10002 = 7890;
      var10003 = 8283;
      Intrinsics.checkNotNullParameter(var3, "options");
      super(var1, var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
      int var5 = 0;
      int var6 = var3.length;
      boolean[] var7 = new boolean[var6];
      String[] var4 = var10000;

      while (true) {
         if (var5 < var6) {
            var7[var5] = false;
            var5++;
            if (var4 != null) {
               break;
            }

            if (var4 == null) {
               continue;
            }
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
         break;
      }
   }

   public lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII(
      @NotNull String var1, @NotNull String var2, @NotNull boolean[] var3, @NotNull String... var4
   ) {
      short var10001 = 7891;
      short var10002 = -1604;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 7894;
      var10002 = 2279;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = 7872;
      var10002 = 6850;
      Intrinsics.checkNotNullParameter(var3, "defaults");
      var10001 = 7897;
      var10002 = -10432;
      Intrinsics.checkNotNullParameter(var4, "options");
      super(var1, var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var10000 = this;
      boolean[] var13;
      if (var3.length == var4.length) {
         var13 = Arrays.copyOf(var3, var3.length);
         short var10003 = 7893;
         short var10004 = -12197;
         Intrinsics.checkNotNullExpressionValue(var13, "copyOf(...)");
      } else {
         int var5 = 0;
         int var6 = var4.length;

         boolean[] var7;
         for (var7 = new boolean[var6]; var5 < var6; var5++) {
            var7[var5] = false;
         }

         var10000 = this;
         var13 = var7;
      }

      var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var13;
   }

   @NotNull
   @Override
   public String[] G() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   @Override
   public boolean[] H() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Override
   public boolean e(int var1) {
      String[] var2 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 < 0) {
            return (0 != 0);
         }

         var10000 = var1;
      }

      if (var2 != null) {
         return (var10000 != 0);
      } else {
         return (boolean)(var10000 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.length
            ? this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var1]
            : 0);
      }
   }

   @Override
   public boolean b(@NotNull String var1) {
      short var10001 = 7896;
      short var10002 = 2237;
      Intrinsics.checkNotNullParameter(var1, "option");
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var3 = ArraysKt.indexOf(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var1);
      String[] var2 = var10000;
      int var4 = var3;
      if (var2 == null) {
         var4 = var3 >= 0 ? (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var3] ? 1 : 0) : 0;
      }

      return (var4 != 0);
   }

   @Override
   public void a(int var1, boolean var2) {
      String[] var3 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var10000 = var1;
      if (var3 == null) {
         if (var1 < 0) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.length) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var1] = var2;
         this.b(var1, var2);
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
      }
   }

   @Override
   public void a(@NotNull String var1, boolean var2) {
      short var10001 = 7892;
      short var10002 = 3435;
      Intrinsics.checkNotNullParameter(var1, "option");
      int var3 = ArraysKt.indexOf(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var1);
      if (var3 >= 0) {
         this.a(var3, var2);
      }
   }

   @Override
   public void f(int var1) {
      String[] var2 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var10000 = var1;
      if (var2 == null) {
         if (var1 < 0) {
            return;
         }

         var10000 = var1;
      }

      if (var10000 < this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.length) {
         boolean var10002 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var1];
         if (var2 == null) {
            var10002 = !var10002;
         }

         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var1] = var10002;
         this.b(var1, this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var1]);
         llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .e();
      }
   }

   @Override
   public void c(@NotNull String var1) {
      short var10001 = 7896;
      short var10002 = 2237;
      Intrinsics.checkNotNullParameter(var1, "option");
      int var2 = ArraysKt.indexOf(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var1);
      if (var2 >= 0) {
         this.f(var2);
      }
   }

   @NotNull
   @Override
   public List<String> I() {
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      String[] var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      boolean var3 = false;
      String[] var1 = var10000;
      var var5 = new ArrayList();
      boolean var6 = false;
      String[] var7 = var2;
      boolean var8 = false;
      int var9 = 0;
      int var10 = 0;
      int var11 = var2.length;

      while (var10 < var11) {
         String var12 = var7[var10];
         int var14 = var9++;
         boolean var15 = false;
         boolean var17 = false;
         if (var1 == null) {
            if (var1 == null) {
               if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var14]) {
                  var5.add(var12);
               }

               var10++;
            }

            if (var1 == null) {
               continue;
            }
         }
         break;
      }

      return var5;
   }

   @NotNull
   @Override
   public List<Integer> J() {
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      Iterable var2 = (Iterable)ArraysKt.getIndices(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      boolean var3 = false;
      String[] var1 = var10000;
      var var5 = new ArrayList();
      boolean var6 = false;

      for (Object var8 : var2) {
         int var9 = ((Number)var8).intValue();
         boolean var10 = false;
         boolean var11 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var9];
         if (var1 == null) {
            if (!var11) {
               continue;
            }

            var5.add(var8);
         }

         if (var1 != null) {
            break;
         }
      }

      return var5;
   }

   @Override
   public boolean a(@NotNull String var1) {
       boolean var18 = false; // PX-FIX decl var18
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      Intrinsics.checkNotNullParameter(var1, "s");
      String[] var2 = var10000;
      String var3 = this.aa();
      Locale var10 = Locale.ROOT;
      short var10002 = 7889;
      short var10003 = 12456;
      Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
      String var11 = var3.toLowerCase(var10);
      var10002 = 7895;
      var10003 = 2498;
      Intrinsics.checkNotNullExpressionValue(var11, "toLowerCase(...)");
      boolean var12 = StringsKt.contains(var11, var1, false);
      if (var2 == null) {
         label42:
         if (!var12) {
            lIlIlIlIlllIlIlIllIIIllIIIllIIlIlIlIllllIIlIlIIIIIIIIlIIlIlIlIllllllIllllIIIlIIIIIlII var13 = this;
            if (var2 == null) {
               var3 = this.ab();
               Locale var14 = Locale.ROOT;
               var10002 = 7898;
               var10003 = 14827;
               Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
               String var15 = var3.toLowerCase(var14);
               var10002 = 7874;
               var10003 = -7418;
               Intrinsics.checkNotNullExpressionValue(var15, "toLowerCase(...)");
               if (StringsKt.contains(var15, var1, false)) {
                  break label42;
               }

               var13 = this;
            }

            String[] var9 = var13.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            int var4 = 0;
            int var5 = var9.length;

            while (true) {
               if (var4 < var5) {
                  String var6 = var9[var4];
                  if (var2 == null) {
                     Locale var16 = Locale.ROOT;
                     var10002 = 7898;
                     var10003 = 14827;
                     Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
                     String var17 = var6.toLowerCase(var16);
                     var10002 = 7874;
                     var10003 = -7418;
                     Intrinsics.checkNotNullExpressionValue(var17, "toLowerCase(...)");
                     var18 = StringsKt.contains(var17, var1, false);
                     if (var2 != null) {
                        break;
                     }

                     if (var18) {
                        return true;
                     }

                     var4++;
                  }

                  if (var2 == null) {
                     continue;
                  }
               }

               var18 = false;
               break;
            }

            return var18;
         }

         var12 = true;
      }

      return var12;
   }

   public void b(int var1, boolean var2) {
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new IlIlIIIlIlIlIIIlIlIIllllllIIlIllIIllllIlIllllIIllIlIIIIIllllIlIllIIIllIIIIIIIIllIIIII(this);
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return new lllIIIlIIIlllIlllIlllIllllIIllIlIlIlIIllIIllIlllllIIlllIIIllIlIIIIllIlIlIIlIIllIlllII(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) { Collection var18 = null; // PX-FIX hoist
        
       var18 = null; // PX-FIX
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      short var10002 = 7888;
      short var10003 = 3068;
      Intrinsics.checkNotNullParameter(var1, "data");
      String[] var2 = var10000;
      boolean[] var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      boolean var5 = false;
      boolean[] var6 = var4;
      Collection var7 = new ArrayList(var4.length);
      boolean var8 = false;
      int var9 = 0;
      int var10 = var4.length;

      while (true) {
         if (var9 < var10) {
            boolean var11 = var6[var9];
            var18 = var7;
            if (var2 != null) {
               break;
            }

            boolean var13 = false;
            llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var14 = new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
            boolean var16 = false;
            short var10001 = 7899;
            var10002 = 23154;
            var14.a("value", Boolean.valueOf(var11));
            var7.add(var14);
            var9++;
            if (var2 == null) {
               continue;
            }
         }

         var18 = var7;
         break;
      }

      List var3 = (List)var18;
      short var19 = 7900;
      var10002 = 16279;
      var1.a("states", var3);
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = 7902;
      short var10002 = -11710;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = 7901;
      var10002 = -19519;
      List var3 = var1.b("states");
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      int var4 = 0;
      int var5 = Math.min(var3.size(), this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.length);
      String[] var2 = var10000;

      while (var4 < var5) {
         llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var7 = (llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll)var3.get(
            var4
         );
         var10001 = 7875;
         var10002 = 18776;
         boolean var6 = var7.a("value", false);
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var4] = var6;
         if (var2 == null) {
            if (var6) {
               this.b(var4, true);
            }

            var4++;
         }

         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public void aj() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[20];
      int var3 = 0;
      String var2 = "]\u0002\u0000Ö\u0007CNû`\u000e\u0000'\u0004¤\u001e¦\u008f\u0004\u00ad¶LD\u0010»v¤\u009dÂr¤v\u0016óT¯Ká\u001e!\u000bJ\u0005·´}ÖôXVû^\u000b\u0002ºZ\u0012\u009eTJ¼\u00957Î\u0006Ò\u001cÉ*HI\u00056fwJ\u008e\u0004ósL\"\u0007fÿ_V\u009aÆµ\u0006Ô¹\t\u009ePß\u000bºÃ©l¾Í\u008c;Y\u0097¿\u0004\u0093)\u008b·\u0006=\u0007¾Ð\u001bµ\u0006;K~Y\u0003\u0084\u0005#dÕ\nÚ\u0010\u0011\u0006ñ\u0093h³ñN¼ô\u0001OáýK¢";
      int var4 = "]\u0002\u0000Ö\u0007CNû`\u000e\u0000'\u0004¤\u001e¦\u008f\u0004\u00ad¶LD\u0010»v¤\u009dÂr¤v\u0016óT¯Ká\u001e!\u000bJ\u0005·´}ÖôXVû^\u000b\u0002ºZ\u0012\u009eTJ¼\u00957Î\u0006Ò\u001cÉ*HI\u00056fwJ\u008e\u0004ósL\"\u0007fÿ_V\u009aÆµ\u0006Ô¹\t\u009ePß\u000bºÃ©l¾Í\u008c;Y\u0097¿\u0004\u0093)\u008b·\u0006=\u0007¾Ð\u001bµ\u0006;K~Y\u0003\u0084\u0005#dÕ\nÚ\u0010\u0011\u0006ñ\u0093h³ñN¼ô\u0001OáýK¢"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 54;
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
                     case 1 -> 11;
                     case 2 -> 17;
                     case 3 -> 47;
                     case 4 -> 54;
                     case 5 -> 51;
                     default -> 33;
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
                     d = var5;
                     e = new String[20];
                     break label52;
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "v@\u0003ø\b\bÎ\u008c©ÌTGÌ";
                  var4 = "v@\u0003ø\b\bÎ\u008c©ÌTGÌ".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 20;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 7891) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 38;
            case 1 -> 54;
            case 2 -> 209;
            case 3 -> 143;
            case 4 -> 113;
            case 5 -> 208;
            case 6 -> 66;
            case 7 -> 60;
            case 8 -> 192;
            case 9 -> 81;
            case 10 -> 16;
            case 11 -> 95;
            case 12 -> 30;
            case 13 -> 48;
            case 14 -> 49;
            case 15 -> 68;
            case 16 -> 232;
            case 17 -> 47;
            case 18 -> 186;
            case 19 -> 224;
            case 20 -> 128;
            case 21 -> 176;
            case 22 -> 211;
            case 23 -> 138;
            case 24 -> 179;
            case 25 -> 46;
            case 26 -> 76;
            case 27 -> 222;
            case 28 -> 226;
            case 29 -> 131;
            case 30 -> 69;
            case 31 -> 42;
            case 32 -> 160;
            case 33 -> 4;
            case 34 -> 8;
            case 35 -> 170;
            case 36 -> 32;
            case 37 -> 109;
            case 38 -> 202;
            case 39 -> 15;
            case 40 -> 248;
            case 41 -> 61;
            case 42 -> 83;
            case 43 -> 125;
            case 44 -> 147;
            case 45 -> 19;
            case 46 -> 231;
            case 47 -> 101;
            case 48 -> 92;
            case 49 -> 17;
            case 50 -> 254;
            case 51 -> 221;
            case 52 -> 12;
            case 53 -> 45;
            case 54 -> 43;
            case 55 -> 184;
            case 56 -> 102;
            case 57 -> 58;
            case 58 -> 178;
            case 59 -> 194;
            case 60 -> 78;
            case 61 -> 89;
            case 62 -> 145;
            case 63 -> 233;
            case 64 -> 11;
            case 65 -> 200;
            case 66 -> 71;
            case 67 -> 115;
            case 68 -> 168;
            case 69 -> 53;
            case 70 -> 197;
            case 71 -> 91;
            case 72 -> 251;
            case 73 -> 40;
            case 74 -> 31;
            case 75 -> 158;
            case 76 -> 136;
            case 77 -> 112;
            case 78 -> 212;
            case 79 -> 155;
            case 80 -> 13;
            case 81 -> 29;
            case 82 -> 118;
            case 83 -> 65;
            case 84 -> 235;
            case 85 -> 67;
            case 86 -> 252;
            case 87 -> 223;
            case 88 -> 171;
            case 89 -> 144;
            case 90 -> 50;
            case 91 -> 103;
            case 92 -> 169;
            case 93 -> 87;
            case 94 -> 127;
            case 95 -> 135;
            case 96 -> 72;
            case 97 -> 73;
            case 98 -> 26;
            case 99 -> 146;
            case 100 -> 24;
            case 101 -> 189;
            case 102 -> 204;
            case 103 -> 163;
            case 104 -> 199;
            case 105 -> 79;
            case 106 -> 80;
            case 107 -> 130;
            case 108 -> 116;
            case 109 -> 173;
            case 110 -> 2;
            case 111 -> 44;
            case 112 -> 39;
            case 113 -> 133;
            case 114 -> 180;
            case 115 -> 234;
            case 116 -> 37;
            case 117 -> 51;
            case 118 -> 157;
            case 119 -> 187;
            case 120 -> 114;
            case 121 -> 243;
            case 122 -> 99;
            case 123 -> 107;
            case 124 -> 205;
            case 125 -> 121;
            case 126 -> 149;
            case 127 -> 1;
            case 128 -> 139;
            case 129 -> 93;
            case 130 -> 203;
            case 131 -> 59;
            case 132 -> 177;
            case 133 -> 182;
            case 134 -> 134;
            case 135 -> 36;
            case 136 -> 241;
            case 137 -> 216;
            case 138 -> 96;
            case 139 -> 198;
            case 140 -> 214;
            case 141 -> 28;
            case 142 -> 255;
            case 143 -> 85;
            case 144 -> 141;
            case 145 -> 236;
            case 146 -> 246;
            case 147 -> 10;
            case 148 -> 84;
            case 149 -> 195;
            case 150 -> 190;
            case 151 -> 154;
            case 152 -> 122;
            case 153 -> 90;
            case 154 -> 57;
            case 155 -> 106;
            case 156 -> 185;
            case 157 -> 228;
            case 158 -> 250;
            case 159 -> 41;
            case 160 -> 104;
            case 161 -> 181;
            case 162 -> 249;
            case 163 -> 162;
            case 164 -> 119;
            case 165 -> 110;
            case 166 -> 193;
            case 167 -> 18;
            case 168 -> 70;
            case 169 -> 229;
            case 170 -> 215;
            case 171 -> 201;
            case 172 -> 27;
            case 173 -> 230;
            case 174 -> 210;
            case 175 -> 23;
            case 176 -> 21;
            case 177 -> 207;
            case 178 -> 77;
            case 179 -> 239;
            case 180 -> 52;
            case 181 -> 0;
            case 182 -> 196;
            case 183 -> 123;
            case 184 -> 225;
            case 185 -> 6;
            case 186 -> 34;
            case 187 -> 100;
            case 188 -> 156;
            case 189 -> 25;
            case 190 -> 153;
            case 191 -> 33;
            case 192 -> 188;
            case 193 -> 108;
            case 194 -> 219;
            case 195 -> 137;
            case 196 -> 129;
            case 197 -> 7;
            case 198 -> 20;
            case 199 -> 94;
            case 200 -> 88;
            case 201 -> 126;
            case 202 -> 174;
            case 203 -> 3;
            case 204 -> 62;
            case 205 -> 240;
            case 206 -> 165;
            case 207 -> 244;
            case 208 -> 55;
            case 209 -> 75;
            case 210 -> 164;
            case 211 -> 183;
            case 212 -> 167;
            case 213 -> 86;
            case 214 -> 124;
            case 215 -> 9;
            case 216 -> 238;
            case 217 -> 247;
            case 218 -> 237;
            case 219 -> 64;
            case 220 -> 97;
            case 221 -> 218;
            case 222 -> 217;
            case 223 -> 172;
            case 224 -> 242;
            case 225 -> 56;
            case 226 -> 152;
            case 227 -> 150;
            case 228 -> 159;
            case 229 -> 148;
            case 230 -> 35;
            case 231 -> 22;
            case 232 -> 206;
            case 233 -> 82;
            case 234 -> 191;
            case 235 -> 245;
            case 236 -> 253;
            case 237 -> 166;
            case 238 -> 132;
            case 239 -> 140;
            case 240 -> 213;
            case 241 -> 220;
            case 242 -> 142;
            case 243 -> 63;
            case 244 -> 111;
            case 245 -> 161;
            case 246 -> 227;
            case 247 -> 98;
            case 248 -> 105;
            case 249 -> 120;
            case 250 -> 14;
            case 251 -> 151;
            case 252 -> 117;
            case 253 -> 74;
            case 254 -> 175;
            default -> 5;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }
}
