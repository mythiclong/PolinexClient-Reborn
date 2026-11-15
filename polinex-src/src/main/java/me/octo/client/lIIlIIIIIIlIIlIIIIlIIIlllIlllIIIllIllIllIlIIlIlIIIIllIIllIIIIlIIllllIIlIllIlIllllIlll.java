package me.octo.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll {
   @NotNull
   private final Json IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = JsonKt.Json(
      null, lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll::a);
   @Nullable
   private lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private volatile Map<String, ? extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.emptyMap();
   @NotNull
   private volatile List<? extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.emptyList();
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = -1;
   private static String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   @NotNull
   public final Json a() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl b() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final <T extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> T b(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "id");
      return (T)this.c().get(var1);
   }

   public final void a(@Nullable lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final Map<String, lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> c() {
      return ((Map<String,lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll>)(Object)(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl));
   }

   public final void a(@NotNull Map<String, ? extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll> var1) {
      short var10001 = 1467;
      short var10002 = -13893;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   private final Map<String, Double> a(String var1) {
      try {
         Json var2 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var4 = false;
         var2.getSerializersModule();
         return (Map<String, Double>)var2.decodeFromString(
            (DeserializationStrategy)(new LinkedHashMapSerializer(StringSerializer.INSTANCE, DoubleSerializer.INSTANCE)), var1
         );
      } catch (Exception var5) {
         String var10000 = var5.getMessage();
         short var10001 = 1462;
         short var10002 = -3610;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("LBIN Parsing failed: " + var10000);
         return null;
      }
   }

   public final void d() {
   }

   private final void e() {
      Object var26 = null; // PX-FIX
      String var10000 = g();
      Iterable var3 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .c()
         .c()
         .a();
      String var1 = var10000;
      boolean var4 = false;
      var var6 = new ArrayList();
      boolean var7 = false;
      Iterator var8 = var3.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI var10 = (IIlIIlIllIIlIIlIIllllIIIlIIllllIlIllIllllIIIIllIIIlIlllllIIlllllllIlllIlIIlllIllIlllI)var9;
            boolean var11 = false;
            Iterable var19 = var10.f();
            var10000 = String.valueOf(var6);
            if (var1 == null) {
               break;
            }

            CollectionsKt.addAll(var6, var19);
            if (var1 != null) {
               continue;
            }
         }

         var10000 = String.valueOf(var6);
         break;
      }

      Set var2 = CollectionsKt.toSet((Iterable)var6);
      if (!var2.isEmpty()) {
         var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         var4 = false;
         Collection var15 = new ArrayList();
         var7 = false;
         var8 = var3.iterator();

         while (true) {
            if (var8.hasNext()) {
               Object var18 = var8.next();
               lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var20 = (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)var18;
               boolean var21 = false;
               var10000 = String.valueOf(var2);
               if (var1 == null) {
                  break;
               }

               label52: {
                  label51:
                  if (var2.contains(var20.b())) {
                     lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var24 = var20;
                     if (var1 != null) {
                        if (var20.c() == null) {
                           break label51;
                        }

                        var24 = var20;
                     }

                     var10000 = var24.a();
                     short var10001 = 1469;
                     short var10002 = 6872;
                     var26 = Intrinsics.areEqual(var10000, "NUTCRACKER");
                     if (var1 != null) {
                        if ((me.octo.client.PxTruth.truth(var26))) {
                           break label51;
                        }

                        var26 = lllIlIIIllllIllllllIIIIllllllIllIIllllIllIIIlllIllIllIIlIIllIIlIllIIllllIIlIlIIIllIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .g()
                           .contains(var20.a());
                     }

                     if (var1 == null) {
                        break label52;
                     }

                     if (!(me.octo.client.PxTruth.truth(var26))) {
                        var26 = true;
                        break label52;
                     }
                  }

                  var26 = false;
               }

               if (!(me.octo.client.PxTruth.truth(var26))) {
                  continue;
               }

               var15.add(var18);
               if (var1 != null) {
                  continue;
               }
            }

            var10000 = String.valueOf(var15);
            break;
         }

         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = (List<? extends lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll>)(Object)(var10000);
      }
   }

   @Nullable
   public final lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll f() {
      String var3;
      label20: {
         var3 = g();
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII++;
         String var1 = var3;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(
            String.valueOf(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII)
         );
         if (var1 != null) {
            lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var2 = (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)CollectionsKt.getOrNull(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            );
            if (var2 != null) {
               var3 = var2.a();
               if (var1 == null) {
                  return (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)(Object)var3;
               }

               if (var3 != null) {
                  break label20;
               }
            }
         }

         short var4 = 1455;
         short var10001 = -30909;
         var3 = "null";
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g(var3);
      return (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)CollectionsKt.getOrNull(
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final boolean a(@NotNull lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var1) {
      short var10001 = 1463;
      short var10002 = 16549;
      Intrinsics.checkNotNullParameter(var1, "item");
      String var10000 = g();
      Iterable var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var2 = var10000;
      boolean var4 = false;
      if (var2 != null) {
         lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var5 = (lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll)CollectionsKt.firstOrNull(
            CollectionsKt.sortedWith(
               var3,
               new lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll()
            )
         );
         if (var5 != null) {
            return Intrinsics.areEqual(var5.c(), var1.c());
         }
      }

      return Intrinsics.areEqual(null, var1.c());
   }

   @NotNull
   public final String b(@NotNull lllIlIIllIIlIlIlIllIllIIlIllIIlIlllIIlIIlIIIIlIIlIIIlIlIIlIIIlIIllllIIIIIllllllIIllll var1) {
      String var10000 = g();
      short var10002 = 1468;
      short var10003 = 14277;
      Intrinsics.checkNotNullParameter(var1, "item");
      String var2 = var10000;
      boolean var4 = var1 instanceof IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl;
      if (var2 != null) {
         if (var4) {
            short var10 = 1448;
            short var14 = 12947;
            return "Weapons";
         }

         var4 = var1 instanceof IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl;
      }

      label55: {
         if (var2 != null) {
            if (var4) {
               break label55;
            }

            var4 = var1 instanceof IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII;
         }

         if (var2 != null) {
            if (var4) {
               break label55;
            }

            var4 = var1 instanceof llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl;
         }

         if (var2 != null) {
            if (var4) {
               short var8 = 1449;
               short var12 = 26977;
               return "Special Items";
            }

            var4 = var1 instanceof IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl;
         }

         if (var4) {
            short var5 = 1464;
            short var10001 = -19491;
            var10000 = "Rarities";
         } else {
            short var7 = 1465;
            short var11 = 25411;
            var10000 = "Unknown";
         }

         return var10000;
      }

      short var9 = 1450;
      short var13 = -19235;
      return "Armor Sets";
   }

   private static final Unit a(JsonBuilder var0) {
      short var10001 = 1459;
      short var10002 = 31567;
      Intrinsics.checkNotNullParameter(var0, "$this$Json");
      var0.setIgnoreUnknownKeys(true);
      var0.setCoerceInputValues(true);
      return Unit.INSTANCE;
   }

   public static void c(String var0) {
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
   }

   public static String g() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[21];
      int var3 = 0;
      String var2 = "\u0007XL;\u008b¥T\ttµ\u0003M\u0010è\u0019xÕ\u0007¡\u0098Ò\u0087Õ#Å\bú=GÚFqÄ<\u0016L\u009d Ï}é\u009cJq¸\u0095¡\u00940^cü©UæZ<\n¦BY³Z k\u009fÄ%\n\u008eupKd\u0004D\u0087'ò\u0004\u0083J#\u0087\nYÿ\u00915ÂÁ\u009cÎ>Ø\u0002ì\u0004\u0019\u0080X<¼Þ\u001f\u0087\u0011ÒÚF±ñü&ÛÐ®¸\u0092g2±\u0018»Cä\u0087ÿ#\u0090'³\u0093\u001cºþáì+ªO¨\u0091(\u009f\u008d°ôNz¢ÜIi\u000eÕ=NKÕm 9WdI²\u0082<êáüdgË\u0092¸µ\u0099\u0015T+î\u0081c<Ö$g¤Þú\u0004\u0001\u0093s¼\u0015b[²vð\u001eÈÎæþö\u001aZ=+¥6Ì¥mï4\u0086;\u008a\u0000âtì(±2¬\u0081³&¶Í\u007f¡E\u00957a;Ðro_\u001a²Ê\u0006\u008fÃ&\t\u0098Á©Ñ\u0098\u001ep\u001d\u009f\u009a,\u0017o<\u000eg|)âu?}\u0088ì°êp\u008aâYâ<%ý\u0093ô¡\u001dÌaÃ¸PT\u009bþ¼£\u009a¾õºäê\u0015\\W©|\u000e\u0097+¡«h\u0092å:»\u0005ªÎþ\u0012\n\u0083Ë\u0006s\u0094Ën\u001dAk\r09(cC\u0005Óè\u0013?>\u0096z";
      int var4 = "\u0007XL;\u008b¥T\ttµ\u0003M\u0010è\u0019xÕ\u0007¡\u0098Ò\u0087Õ#Å\bú=GÚFqÄ<\u0016L\u009d Ï}é\u009cJq¸\u0095¡\u00940^cü©UæZ<\n¦BY³Z k\u009fÄ%\n\u008eupKd\u0004D\u0087'ò\u0004\u0083J#\u0087\nYÿ\u00915ÂÁ\u009cÎ>Ø\u0002ì\u0004\u0019\u0080X<¼Þ\u001f\u0087\u0011ÒÚF±ñü&ÛÐ®¸\u0092g2±\u0018»Cä\u0087ÿ#\u0090'³\u0093\u001cºþáì+ªO¨\u0091(\u009f\u008d°ôNz¢ÜIi\u000eÕ=NKÕm 9WdI²\u0082<êáüdgË\u0092¸µ\u0099\u0015T+î\u0081c<Ö$g¤Þú\u0004\u0001\u0093s¼\u0015b[²vð\u001eÈÎæþö\u001aZ=+¥6Ì¥mï4\u0086;\u008a\u0000âtì(±2¬\u0081³&¶Í\u007f¡E\u00957a;Ðro_\u001a²Ê\u0006\u008fÃ&\t\u0098Á©Ñ\u0098\u001ep\u001d\u009f\u009a,\u0017o<\u000eg|)âu?}\u0088ì°êp\u008aâYâ<%ý\u0093ô¡\u001dÌaÃ¸PT\u009bþ¼£\u009a¾õºäê\u0015\\W©|\u000e\u0097+¡«h\u0092å:»\u0005ªÎþ\u0012\n\u0083Ë\u0006s\u0094Ën\u001dAk\r09(cC\u0005Óè\u0013?>\u0096z"
         .length();
      c("od2nx");
      char var1 = 7;
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 42;
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
                     case 0 -> 11;
                     case 1 -> 41;
                     case 2 -> 124;
                     case 3 -> 19;
                     case 4 -> 6;
                     case 5 -> 10;
                     default -> 60;
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
                     b = new String[21];
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

                  var2 = "\u0086q \u0010\u000eË}\u0004¡ÜW«";
                  var4 = "\u0086q \u0010\u000eË}\u0004¡ÜW«".length();
                  var1 = 7;
                  var8 = -1;
            }

            var10000 = 126;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 1467) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 230;
            case 1 -> 199;
            case 2 -> 131;
            case 3 -> 112;
            case 4 -> 54;
            case 5 -> 235;
            case 6 -> 19;
            case 7 -> 210;
            case 8 -> 187;
            case 9 -> 100;
            case 10 -> 50;
            case 11 -> 245;
            case 12 -> 120;
            case 13 -> 16;
            case 14 -> 4;
            case 15 -> 2;
            case 16 -> 124;
            case 17 -> 31;
            case 18 -> 142;
            case 19 -> 175;
            case 20 -> 17;
            case 21 -> 232;
            case 22 -> 105;
            case 23 -> 109;
            case 24 -> 103;
            case 25 -> 208;
            case 26 -> 39;
            case 27 -> 71;
            case 28 -> 52;
            case 29 -> 82;
            case 30 -> 200;
            case 31 -> 132;
            case 32 -> 92;
            case 33 -> 86;
            case 34 -> 5;
            case 35 -> 185;
            case 36 -> 151;
            case 37 -> 21;
            case 38 -> 161;
            case 39 -> 90;
            case 40 -> 104;
            case 41 -> 98;
            case 42 -> 20;
            case 43 -> 237;
            case 44 -> 157;
            case 45 -> 226;
            case 46 -> 221;
            case 47 -> 173;
            case 48 -> 25;
            case 49 -> 231;
            case 50 -> 42;
            case 51 -> 47;
            case 52 -> 171;
            case 53 -> 12;
            case 54 -> 181;
            case 55 -> 149;
            case 56 -> 122;
            case 57 -> 228;
            case 58 -> 219;
            case 59 -> 143;
            case 60 -> 205;
            case 61 -> 139;
            case 62 -> 48;
            case 63 -> 146;
            case 64 -> 7;
            case 65 -> 213;
            case 66 -> 184;
            case 67 -> 215;
            case 68 -> 141;
            case 69 -> 162;
            case 70 -> 58;
            case 71 -> 144;
            case 72 -> 23;
            case 73 -> 3;
            case 74 -> 238;
            case 75 -> 40;
            case 76 -> 13;
            case 77 -> 34;
            case 78 -> 229;
            case 79 -> 196;
            case 80 -> 204;
            case 81 -> 88;
            case 82 -> 156;
            case 83 -> 180;
            case 84 -> 89;
            case 85 -> 26;
            case 86 -> 169;
            case 87 -> 11;
            case 88 -> 10;
            case 89 -> 203;
            case 90 -> 195;
            case 91 -> 41;
            case 92 -> 255;
            case 93 -> 6;
            case 94 -> 233;
            case 95 -> 74;
            case 96 -> 234;
            case 97 -> 134;
            case 98 -> 126;
            case 99 -> 32;
            case 100 -> 128;
            case 101 -> 111;
            case 102 -> 140;
            case 103 -> 214;
            case 104 -> 216;
            case 105 -> 252;
            case 106 -> 55;
            case 107 -> 183;
            case 108 -> 163;
            case 109 -> 101;
            case 110 -> 113;
            case 111 -> 123;
            case 112 -> 125;
            case 113 -> 193;
            case 114 -> 217;
            case 115 -> 118;
            case 116 -> 35;
            case 117 -> 68;
            case 118 -> 95;
            case 119 -> 225;
            case 120 -> 243;
            case 121 -> 107;
            case 122 -> 133;
            case 123 -> 0;
            case 124 -> 93;
            case 125 -> 76;
            case 126 -> 66;
            case 127 -> 170;
            case 128 -> 110;
            case 129 -> 99;
            case 130 -> 29;
            case 131 -> 22;
            case 132 -> 62;
            case 133 -> 179;
            case 134 -> 51;
            case 135 -> 188;
            case 136 -> 127;
            case 137 -> 115;
            case 138 -> 197;
            case 139 -> 227;
            case 140 -> 166;
            case 141 -> 136;
            case 142 -> 30;
            case 143 -> 240;
            case 144 -> 254;
            case 145 -> 14;
            case 146 -> 61;
            case 147 -> 198;
            case 148 -> 43;
            case 149 -> 33;
            case 150 -> 73;
            case 151 -> 59;
            case 152 -> 236;
            case 153 -> 168;
            case 154 -> 153;
            case 155 -> 87;
            case 156 -> 64;
            case 157 -> 178;
            case 158 -> 44;
            case 159 -> 63;
            case 160 -> 164;
            case 161 -> 159;
            case 162 -> 250;
            case 163 -> 220;
            case 164 -> 148;
            case 165 -> 202;
            case 166 -> 158;
            case 167 -> 117;
            case 168 -> 56;
            case 169 -> 91;
            case 170 -> 1;
            case 171 -> 186;
            case 172 -> 65;
            case 173 -> 207;
            case 174 -> 70;
            case 175 -> 247;
            case 176 -> 176;
            case 177 -> 189;
            case 178 -> 130;
            case 179 -> 78;
            case 180 -> 38;
            case 181 -> 9;
            case 182 -> 172;
            case 183 -> 129;
            case 184 -> 209;
            case 185 -> 97;
            case 186 -> 116;
            case 187 -> 106;
            case 188 -> 191;
            case 189 -> 248;
            case 190 -> 80;
            case 191 -> 28;
            case 192 -> 150;
            case 193 -> 18;
            case 194 -> 147;
            case 195 -> 145;
            case 196 -> 182;
            case 197 -> 155;
            case 198 -> 160;
            case 199 -> 46;
            case 200 -> 212;
            case 201 -> 85;
            case 202 -> 69;
            case 203 -> 223;
            case 204 -> 36;
            case 205 -> 96;
            case 206 -> 246;
            case 207 -> 251;
            case 208 -> 8;
            case 209 -> 60;
            case 210 -> 83;
            case 211 -> 102;
            case 212 -> 137;
            case 213 -> 152;
            case 214 -> 135;
            case 215 -> 24;
            case 216 -> 167;
            case 217 -> 201;
            case 218 -> 174;
            case 219 -> 84;
            case 220 -> 121;
            case 221 -> 177;
            case 222 -> 253;
            case 223 -> 165;
            case 224 -> 192;
            case 225 -> 108;
            case 226 -> 45;
            case 227 -> 242;
            case 228 -> 114;
            case 229 -> 119;
            case 230 -> 244;
            case 231 -> 222;
            case 232 -> 53;
            case 233 -> 206;
            case 234 -> 224;
            case 235 -> 37;
            case 236 -> 190;
            case 237 -> 79;
            case 238 -> 27;
            case 239 -> 154;
            case 240 -> 15;
            case 241 -> 138;
            case 242 -> 211;
            case 243 -> 239;
            case 244 -> 49;
            case 245 -> 75;
            case 246 -> 218;
            case 247 -> 94;
            case 248 -> 81;
            case 249 -> 249;
            case 250 -> 57;
            case 251 -> 72;
            case 252 -> 77;
            case 253 -> 67;
            case 254 -> 194;
            default -> 241;
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
