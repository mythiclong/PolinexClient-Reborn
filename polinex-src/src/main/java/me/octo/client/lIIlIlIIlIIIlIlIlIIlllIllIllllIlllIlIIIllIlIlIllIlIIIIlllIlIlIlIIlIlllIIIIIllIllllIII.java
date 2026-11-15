package me.octo.client;

import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public class lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII
   extends IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll
   implements lIlIlllllllIIlIlIlllIIllIlllllIlllllllllIIlIlllIlIlIllIlIlIIlIlIIIllllllIIIlIIllllIIl {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(Object... px) {
           this((String)null, (String)null, new String[0]); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   private final String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] d;
   private static String[] e;

   public final int z() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void d(int var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
   }

   public lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
      @NotNull String var1, @NotNull String var2, @NotNull String... var3
   ) {
      short var10001 = -11187;
      short var10002 = -16804;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -11198;
      var10002 = -21854;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -11195;
      var10002 = -23286;
      Intrinsics.checkNotNullParameter(var3, "options");
      super(var1, var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
   }

   public lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII(
      @NotNull String var1, @NotNull String var2, int var3, @NotNull String... var4
   ) {
      short var10001 = -11186;
      short var10002 = 12889;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -11188;
      var10002 = 16882;
      Intrinsics.checkNotNullParameter(var2, "description");
      var10001 = -11191;
      var10002 = 28433;
      Intrinsics.checkNotNullParameter(var4, "options");
      super(var1, var2);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var3;
   }

   @NotNull
   @Override
   public String[] w() {
      String[] var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      // PX-FIX r726: jar bytecode 13-25 builds `new ArrayList(len)` cast to Collection, 53-65 calls
      // Collection.add(this.b(s)) per element, and the tail is
      // ((Collection) list).toArray(new String[0]) with a checkcast String[].
      // The decompiler emitted `((String[])(Object) list)` instead, so every macro module threw
      // ArrayList -> String[] and the whole config save aborted.
      java.util.Collection<String> var5 = new java.util.ArrayList<String>(var2.length);
      String[] var1 = var10000;
      for (int var7 = 0; var7 < var2.length; var7++) {
         var5.add(this.b(var2[var7]));
      }

      String[] var10001 = var5.toArray(new String[0]);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.b(new String[2]);
      }

      return var10001;
   }

   @Override
   public int x() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   @Override
   public String y() {
      String[] var2;
      int var3;
      lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var10000;
      int var10001;
      label26: {
         String[] var1 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
         var10000 = this;
         var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var10001 = 0;
         int var10002 = var3;
         if (var1 == null) {
            if (0 > var3) {
               var10001 = 0;
               break label26;
            }

            var10001 = var3;
            if (var1 != null) {
               break label26;
            }

            var10002 = var2.length;
         }

         var10001 = var10001 < var10002 ? 1 : 0;
      }

      String var7;
      if (var10001 != 0) {
         var7 = var2[var3];
      } else {
         boolean var5 = false;
         var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[0];
         var10000 = this;
      }

      return var10000.b(var7);
   }

   @NotNull
   public final String[] A() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final String B() {
      String[] var2;
      int var3;
      int var6;
      label26: {
         var2 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
         var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String[] var1 = var10000;
         var6 = 0;
         int var10001 = var3;
         if (var1 == null) {
            if (0 > var3) {
               var6 = 0;
               break label26;
            }

            var6 = var3;
            if (var1 != null) {
               break label26;
            }

            var10001 = var2.length;
         }

         var6 = var6 < var10001 ? 1 : 0;
      }

      String var7;
      if (var6 != 0) {
         var7 = var2[var3];
      } else {
         boolean var5 = false;
         var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[0];
      }

      return var7;
   }

   @NotNull
   protected String b(@NotNull String var1) {
      short var10001 = -11197;
      short var10002 = 27620;
      Intrinsics.checkNotNullParameter(var1, "option");
      return var1;
   }

   @Override
   public boolean b(int var1) {
      return false;
   }

   public final boolean c(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "s");
      return StringsKt.equals(this.y(), var1, true);
   }

   @Override
   public boolean a(@NotNull String var1) {
       boolean var18 = false; // PX-FIX decl var18
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      Intrinsics.checkNotNullParameter(var1, "s");
      String[] var2 = var10000;
      String var3 = this.aa();
      Locale var10 = Locale.ROOT;
      short var10002 = -11193;
      short var10003 = 22739;
      Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
      String var11 = var3.toLowerCase(var10);
      var10002 = -11200;
      var10003 = 17066;
      Intrinsics.checkNotNullExpressionValue(var11, "toLowerCase(...)");
      boolean var12 = StringsKt.contains(var11, var1, false);
      if (var2 == null) {
         label42:
         if (!var12) {
            lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var13 = this;
            if (var2 == null) {
               var3 = this.ab();
               Locale var14 = Locale.ROOT;
               var10002 = -11192;
               var10003 = 11842;
               Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
               String var15 = var3.toLowerCase(var14);
               var10002 = -11190;
               var10003 = 29517;
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
                     var10002 = -11192;
                     var10003 = 11842;
                     Intrinsics.checkNotNullExpressionValue(Locale.ROOT, "ROOT");
                     String var17 = var6.toLowerCase(var16);
                     var10002 = -11190;
                     var10003 = 29517;
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

   @Override
   public void c(int var1) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = RangesKt.coerceIn(
         var1, 0, RangesKt.coerceAtLeast(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length - 1, 0)
      );
      this.C();
      llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .e();
   }

   public void C() {
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl g() {
      return new lllIIIllIIlIIllIIIIIIlIIlllIIIIlIIIIIIIIIIllIIIlIlIlIllllIIIIllIlllIIIIlIIllIIIlllIII(this);
   }

   @NotNull
   @Override
   public IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl h() {
      return new lIIlIIIlllIlIIIlIllIlllIIIIIlllllIIIlIIlllllIlIIIIlIIlIllIlIIIIIlIlllllIlIIlIlllIIIll(this);
   }

   @Override
   public void a(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      short var10001 = -11196;
      short var10002 = 1384;
      Intrinsics.checkNotNullParameter(var1, "data");
      var10001 = -11194;
      var10002 = 14336;
      var1.a("index", Integer.valueOf(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI));
   }

   @Override
   public void b(@NotNull llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var1) {
      String[] var10000 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      short var10002 = -11185;
      short var10003 = -14637;
      Intrinsics.checkNotNullParameter(var1, "data");
      String[] var2 = var10000;
      var10002 = -11189;
      var10003 = 31780;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1.a("index", 0);
      lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var3 = this;
      if (var2 == null) {
         if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            >= this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.length) {
            this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 0;
         }

         var3 = this;
      }

      var3.C();
   }

   @Override
   public void aj() {
      String[] var1 = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
      lIIlIlIIlIIIlIlIlIIlllIllIllllIlllIlIIIllIlIlIllIlIIIIlllIlIlIlIIlIlllIIIIIllIllllIII var10000 = this;
      int var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      if (var1 == null) {
         if (!this.b(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI)) {
            return;
         }

         var10000 = this;
         var10001 = 0;
      }

      var10000.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10001;
      this.C();
   }

   public static void b(me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] D() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[15];
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3];
      int var3 = 0;
      String var2 = "\u001akã±\u0004#|\u0096W\u000b©\u000eÀ\u009fõ\u0001Lí\u0098FÍ\u0004\u0089s\u0091²\u0010PFÒÑjI\u0018^Xý×\b\u0089¼\tS\u0005Ã+6WÔ\u0004GùÑ9\u0007\u0086lHn\u001es\u008c\u0005go¢ßF\u0004V¡ó2\u0004?ò\u0015\u0086\u0007Ô\u0001\u0002ÃWÆ¥\u000b.p0Pëø\u008fÒà¡Â";
      int var4 = "\u001akã±\u0004#|\u0096W\u000b©\u000eÀ\u009fõ\u0001Lí\u0098FÍ\u0004\u0089s\u0091²\u0010PFÒÑjI\u0018^Xý×\b\u0089¼\tS\u0005Ã+6WÔ\u0004GùÑ9\u0007\u0086lHn\u001es\u008c\u0005go¢ßF\u0004V¡ó2\u0004?ò\u0015\u0086\u0007Ô\u0001\u0002ÃWÆ¥\u000b.p0Pëø\u008fÒà¡Â"
         .length();
      b(var10000);
      char var1 = 4;
      int var8 = -1;

      label52:
while (true) {
         byte var9 = 12;
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
                     case 0 -> 22;
                     case 1 -> 65;
                     case 2 -> 33;
                     case 3 -> 81;
                     case 4 -> 43;
                     case 5 -> 51;
                     default -> 86;
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
                     d = var5;
                     e = new String[15];
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

                  var2 = "\u0011Ð\u0089Ê\u0015Ô\u0010j\u009e¦ù×\u007f\u009c«ûp\u0090\u008aRßA\f";
                  var4 = "\u0011Ð\u0089Ê\u0015Ô\u0010j\u009e¦ù×\u007f\u009c«ûp\u0090\u008aRßA\f".length();
                  var1 = 6;
                  var8 = -1;
            }

            var9 = 29;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ -11186) & 65535;
      if (e[var2] == null) {
         char[] var3 = d[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 235;
            case 1 -> 174;
            case 2 -> 77;
            case 3 -> 114;
            case 4 -> 19;
            case 5 -> 35;
            case 6 -> 244;
            case 7 -> 230;
            case 8 -> 36;
            case 9 -> 62;
            case 10 -> 128;
            case 11 -> 115;
            case 12 -> 154;
            case 13 -> 158;
            case 14 -> 139;
            case 15 -> 186;
            case 16 -> 1;
            case 17 -> 49;
            case 18 -> 241;
            case 19 -> 188;
            case 20 -> 96;
            case 21 -> 255;
            case 22 -> 125;
            case 23 -> 133;
            case 24 -> 140;
            case 25 -> 150;
            case 26 -> 111;
            case 27 -> 18;
            case 28 -> 207;
            case 29 -> 164;
            case 30 -> 214;
            case 31 -> 130;
            case 32 -> 94;
            case 33 -> 32;
            case 34 -> 223;
            case 35 -> 166;
            case 36 -> 16;
            case 37 -> 39;
            case 38 -> 180;
            case 39 -> 0;
            case 40 -> 3;
            case 41 -> 40;
            case 42 -> 103;
            case 43 -> 219;
            case 44 -> 89;
            case 45 -> 238;
            case 46 -> 21;
            case 47 -> 44;
            case 48 -> 218;
            case 49 -> 243;
            case 50 -> 117;
            case 51 -> 206;
            case 52 -> 82;
            case 53 -> 196;
            case 54 -> 58;
            case 55 -> 212;
            case 56 -> 251;
            case 57 -> 118;
            case 58 -> 107;
            case 59 -> 104;
            case 60 -> 83;
            case 61 -> 112;
            case 62 -> 146;
            case 63 -> 187;
            case 64 -> 129;
            case 65 -> 170;
            case 66 -> 67;
            case 67 -> 199;
            case 68 -> 185;
            case 69 -> 11;
            case 70 -> 78;
            case 71 -> 138;
            case 72 -> 222;
            case 73 -> 60;
            case 74 -> 15;
            case 75 -> 52;
            case 76 -> 181;
            case 77 -> 239;
            case 78 -> 162;
            case 79 -> 42;
            case 80 -> 75;
            case 81 -> 153;
            case 82 -> 23;
            case 83 -> 176;
            case 84 -> 91;
            case 85 -> 126;
            case 86 -> 9;
            case 87 -> 156;
            case 88 -> 7;
            case 89 -> 228;
            case 90 -> 211;
            case 91 -> 245;
            case 92 -> 12;
            case 93 -> 51;
            case 94 -> 167;
            case 95 -> 136;
            case 96 -> 81;
            case 97 -> 149;
            case 98 -> 66;
            case 99 -> 41;
            case 100 -> 202;
            case 101 -> 71;
            case 102 -> 73;
            case 103 -> 179;
            case 104 -> 178;
            case 105 -> 70;
            case 106 -> 87;
            case 107 -> 252;
            case 108 -> 131;
            case 109 -> 231;
            case 110 -> 189;
            case 111 -> 249;
            case 112 -> 155;
            case 113 -> 229;
            case 114 -> 124;
            case 115 -> 147;
            case 116 -> 92;
            case 117 -> 171;
            case 118 -> 240;
            case 119 -> 135;
            case 120 -> 175;
            case 121 -> 69;
            case 122 -> 76;
            case 123 -> 93;
            case 124 -> 109;
            case 125 -> 236;
            case 126 -> 54;
            case 127 -> 47;
            case 128 -> 4;
            case 129 -> 90;
            case 130 -> 61;
            case 131 -> 254;
            case 132 -> 226;
            case 133 -> 144;
            case 134 -> 106;
            case 135 -> 28;
            case 136 -> 48;
            case 137 -> 53;
            case 138 -> 237;
            case 139 -> 64;
            case 140 -> 145;
            case 141 -> 26;
            case 142 -> 225;
            case 143 -> 6;
            case 144 -> 13;
            case 145 -> 101;
            case 146 -> 172;
            case 147 -> 95;
            case 148 -> 233;
            case 149 -> 224;
            case 150 -> 8;
            case 151 -> 113;
            case 152 -> 31;
            case 153 -> 151;
            case 154 -> 152;
            case 155 -> 108;
            case 156 -> 30;
            case 157 -> 33;
            case 158 -> 25;
            case 159 -> 248;
            case 160 -> 221;
            case 161 -> 120;
            case 162 -> 65;
            case 163 -> 142;
            case 164 -> 198;
            case 165 -> 80;
            case 166 -> 10;
            case 167 -> 37;
            case 168 -> 220;
            case 169 -> 141;
            case 170 -> 204;
            case 171 -> 160;
            case 172 -> 250;
            case 173 -> 24;
            case 174 -> 192;
            case 175 -> 143;
            case 176 -> 209;
            case 177 -> 22;
            case 178 -> 177;
            case 179 -> 27;
            case 180 -> 213;
            case 181 -> 132;
            case 182 -> 184;
            case 183 -> 57;
            case 184 -> 193;
            case 185 -> 100;
            case 186 -> 59;
            case 187 -> 208;
            case 188 -> 86;
            case 189 -> 14;
            case 190 -> 182;
            case 191 -> 50;
            case 192 -> 210;
            case 193 -> 127;
            case 194 -> 68;
            case 195 -> 191;
            case 196 -> 183;
            case 197 -> 55;
            case 198 -> 45;
            case 199 -> 173;
            case 200 -> 246;
            case 201 -> 201;
            case 202 -> 168;
            case 203 -> 215;
            case 204 -> 102;
            case 205 -> 97;
            case 206 -> 105;
            case 207 -> 217;
            case 208 -> 121;
            case 209 -> 227;
            case 210 -> 161;
            case 211 -> 253;
            case 212 -> 137;
            case 213 -> 85;
            case 214 -> 148;
            case 215 -> 197;
            case 216 -> 84;
            case 217 -> 116;
            case 218 -> 123;
            case 219 -> 165;
            case 220 -> 20;
            case 221 -> 216;
            case 222 -> 119;
            case 223 -> 72;
            case 224 -> 157;
            case 225 -> 2;
            case 226 -> 34;
            case 227 -> 17;
            case 228 -> 56;
            case 229 -> 242;
            case 230 -> 79;
            case 231 -> 29;
            case 232 -> 232;
            case 233 -> 5;
            case 234 -> 205;
            case 235 -> 46;
            case 236 -> 98;
            case 237 -> 200;
            case 238 -> 190;
            case 239 -> 63;
            case 240 -> 159;
            case 241 -> 195;
            case 242 -> 38;
            case 243 -> 169;
            case 244 -> 99;
            case 245 -> 134;
            case 246 -> 194;
            case 247 -> 74;
            case 248 -> 163;
            case 249 -> 203;
            case 250 -> 122;
            case 251 -> 88;
            case 252 -> 247;
            case 253 -> 110;
            case 254 -> 43;
            default -> 234;
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
