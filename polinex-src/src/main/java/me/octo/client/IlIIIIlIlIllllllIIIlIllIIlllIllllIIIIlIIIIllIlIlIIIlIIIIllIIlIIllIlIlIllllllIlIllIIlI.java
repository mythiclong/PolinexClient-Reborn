package me.octo.client;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI {
   @NotNull
   public static IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   public static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static File IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI() {
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void a() {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();

      label45: {
         boolean var10000;
         label39: {
            try {
               var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               if (var1 != null) {
                  break label39;
               }

               if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
                  return;
               }
            } catch (Exception var11) {
               throw (RuntimeException)a(var11);
            }

            try {
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
               if (var1 != null) {
                  break label45;
               }

               var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.exists();
            } catch (Exception var10) {
               throw (RuntimeException)a(var10);
            }
         }

         if (!var10000) {
            return;
         }

         try {
            ;
         } catch (Exception var9) {
            return;
         }
      }

      try {
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII var2 = me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         File var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var4 = false;
         String var6 = FilesKt.readText(var3, null);
         boolean var7 = false;
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll)me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .fromJson(var6, lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll.class);
      } catch (Exception var8) {
      }
   }

   @Nullable
   public final String a(int var1) {
      this.a();
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a().get(String.valueOf(var1));
   }

   public final void a(int var1, @Nullable String var2) {
      int var6;
      label27: {
         label30: {
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
            this.a();
            me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
            CharSequence var4 = var2;
            CharSequence var5 = var4;
            if (var3 == null) {
               if (var4 == null) {
                  break label30;
               }

               var5 = var4;
            }

            var6 = var5.length();
            if (var3 != null) {
               break label27;
            }

            if (var6 != 0) {
               var6 = 0;
               break label27;
            }
         }

         var6 = 1;
      }

      if (var6 != 0) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a().remove(String.valueOf(var1));
      } else {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a().put(String.valueOf(var1), var2);
         Boolean.valueOf(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.b().remove(String.valueOf(var1)));
      }

      this.c();
   }

   public final boolean b(int var1) {
      this.a();
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.b().contains(String.valueOf(var1));
   }

   public final void c(int var1) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      this.a();
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      String var3 = String.valueOf(var1);
      if (var2 == null) {
         if (!lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.b().remove(var3)) {
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.b().add(var3);
         }

         this.c();
      }
   }

   @NotNull
   public final Map<Integer, String> b() {
      Object var22 = null; // PX-FIX
      this.a();
      Iterable var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a().entrySet();
      boolean var3 = false;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IIlIIIIllllllIIlIIIIIIlIllIlllIllIllIlIIllIIlIllIlIIIlIIlIllllllllIIllIllIllIIllIlllI.s();
      var var5 = new ArrayList();
      boolean var6 = false;
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      boolean var8 = false;

      for (Object var10 : var2) {
         boolean var12 = false;
         Entry var13 = (Entry)var10;
         boolean var14 = false;
         String var15 = (String)var13.getKey();
         String var16 = (String)var13.getValue();
         if (var1 == null) {
            label27: {
               if (var1 == null) {
                  Integer var21 = StringsKt.toIntOrNull(var15);
                  if (var21 != null) {
                     int var17 = var21.intValue();
                     boolean var18 = false;
                     var22 = TuplesKt.to(var17, var16);
                     break label27;
                  }
               }

               var22 = null;
            }

            if (var22 != null) {
               Pair var19 =((Pair)( var22));
               boolean var20 = false;
               var5.add(var19);
            }

            if (var1 == null) {
               continue;
            }
         }
         break;
      }

      return MapsKt.toMap(var5);
   }

   private final void c() {
      try {
         me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               true
            );
      } catch (Exception var2) {
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      char[] var10003 = "*\u0016SMvt=,\u0006\tHct!".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var8 = 63;
      char[] var10002 = var10003;
      int var3 = var10004;
      char[] var12;
      byte var16;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var12 = var10003;
         var10005 = var1;
         char var10008 = var10003[var1];
         var10007 = 63;
         var10006 = var10008;
         switch (var1 % 7) {
            case 0:
               var16 = 116;
               break;
            case 1:
               var16 = 92;
               break;
            case 2:
               var16 = 24;
               break;
            case 3:
               var16 = 29;
               break;
            case 4:
               var16 = 47;
               break;
            case 5:
               var16 = 36;
               break;
            default:
               var16 = 112;
         }
      } else {
         var8 = 63;
         var3 = var10004;
         if (var10004 <= var1) {
            String var11 = new String(var10003).intern();
            byte var6 = -1;
            String var2 = var11;
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI();
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new File(
               me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
               var2
            );
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll(
               null, null, 3, null
            );
            break pxClinit;
         }

         var12 = var10003;
         var10005 = var1;
         char var17 = var10003[var1];
         var10007 = 63;
         var10006 = var17;
         switch (var1 % 7) {
            case 0:
               var16 = 116;
               break;
            case 1:
               var16 = 92;
               break;
            case 2:
               var16 = 24;
               break;
            case 3:
               var16 = 29;
               break;
            case 4:
               var16 = 47;
               break;
            case 5:
               var16 = 36;
               break;
            default:
               var16 = 112;
         }
      }

      while (true) {
         var12[var10005] = (char)(var10006 ^ var10007 ^ var16);
         var1++;
         if (var8 == 0) {
            var12 = var10002;
            var10005 = var8;
            char var19 = var10002[var8];
            var10007 = var8;
            var10006 = var19;
            switch (var1 % 7) {
               case 0:
                  var16 = 116;
                  break;
               case 1:
                  var16 = 92;
                  break;
               case 2:
                  var16 = 24;
                  break;
               case 3:
                  var16 = 29;
                  break;
               case 4:
                  var16 = 47;
                  break;
               case 5:
                  var16 = 36;
                  break;
               default:
                  var16 = 112;
            }
         } else {
            if (var3 <= var1) {
               String var10 = new String(var10002).intern();
               byte var5 = -1;
               String var0 = var10;
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIIIlIlIllllllIIIlIllIIlllIllllIIIIlIIIIllIlIlIIIlIIIIllIIlIIllIlIlIllllllIlIllIIlI();
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new File(
                  me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  var0
               );
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lIIIIlllIIIllIllIlIIlIllllllllIIlIIIIIllIlIIlIllllIIIIIllIIIlIlllIlllIIlIIlIIllIIIIll(
                  null, null, 3, null
               );
               break pxClinit;
            }

            var12 = var10002;
            var10005 = var1;
            char var18 = var10002[var1];
            var10007 = var8;
            var10006 = var18;
            switch (var1 % 7) {
               case 0:
                  var16 = 116;
                  break;
               case 1:
                  var16 = 92;
                  break;
               case 2:
                  var16 = 24;
                  break;
               case 3:
                  var16 = 29;
                  break;
               case 4:
                  var16 = 47;
                  break;
               case 5:
                  var16 = 36;
                  break;
               default:
                  var16 = 112;
            }
         }
      }
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
