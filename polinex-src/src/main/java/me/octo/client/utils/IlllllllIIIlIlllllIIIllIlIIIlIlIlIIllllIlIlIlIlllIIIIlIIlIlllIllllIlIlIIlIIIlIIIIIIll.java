package me.octo.client.utils;

import com.mojang.blaze3d.platform.InputConstants.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.KeyMapping.Category;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll {
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4) { return null; } // PX-FIX ovld

   @NotNull
   public static IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Map<String, KeyMapping> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<Pair<String, KeyMapping>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Map<String, Category> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] a;
   private static String[] b;

   private IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll() {
   }

   private final Category a(String var1) {
      Map var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      boolean var4 = false;
      Object var5 = var2.get(var1);
      Object var20;
      if (var5 == null) {
         boolean var6 = false;
         var20 = var1.toLowerCase(Locale.ROOT);
         short var10002 = -19447;
         short var10003 = -4487;
         Intrinsics.checkNotNullExpressionValue(var20, "toLowerCase(...)");
         CharSequence var7 = (CharSequence)var20;
         var10002 = -19423;
         var10003 = -31629;
         Regex var8 = new Regex("[^a-z0-9._/-]+");
         String var9 = "_";
         var20 = var8.replace(var7, var9);
         char[] var12 = new char[]{'_'};
         var7 = StringsKt.trim((String)var20, var12);
         if (var7.length() == 0) {
            boolean var14 = false;
            short var16 = -19395;
            short var10001 = -27989;
            var20 = "general";
         } else {
            var20 = var7;
         }

         String var10 = (String)var20;
         short var18 = -19413;
         short var21 = 28375;
         var20 = Category.register(Identifier.fromNamespaceAndPath("polinex", var10));
         var10002 = -19410;
         var10003 = 23809;
         Intrinsics.checkNotNullExpressionValue(var20, "register(...)");
         Category var11 = (Category)var20;
         var2.put(var1, var11);
         var20 = var11;
      } else {
         var20 = var5;
      }

      return (Category)var20;
   }

   public final void a() {
      String var1 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      if (!IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
         Iterable var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var3 = false;
         Iterator var4 = var2.iterator();

         while (true) {
            if (var4.hasNext()) {
               Object var5 = var4.next();
               Pair var6 = (Pair)var5;
               boolean var7 = false;
               String var8 = (String)var6.component1();
               KeyMapping var9 = (KeyMapping)var6.component2();
               KeyMappingHelper.registerKeyMapping(var9);
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var8, var9);
               if (var1 != null) {
                  break;
               }

               if (var1 == null) {
                  continue;
               }
            }

            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
            break;
         }
      }
   }

   @NotNull
   public final KeyMapping a(@NotNull String var1, int var2, @NotNull String var3, boolean var4) {
      short var10001 = -19417;
      short var10002 = 4065;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = -19409;
      var10002 = -6363;
      Intrinsics.checkNotNullParameter(var3, "category");
      KeyMapping var5 = new KeyMapping(var1, Type.KEYSYM, var2, this.a(var3));
      if (var4) {
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            // PX-FIX r48: Fabric refuses registerKeyMapping() once GameOptions exists. Modules that are
            // constructed lazily (e.g. the first time a screen opens) would otherwise kill the client here.
            try {
               KeyMappingHelper.registerKeyMapping(var5);
            } catch (IllegalStateException var5x) {
               System.out.println("[PX] late keybind (not registered by Fabric): " + var1);
            }
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1, var5);
         } else {
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(TuplesKt.to(var1, var5));
         }
      }

      return var5;
   }

   @NotNull
   public final KeyMapping b(@NotNull String var1, int var2, @NotNull String var3, boolean var4) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = -19417;
      short var10003 = 4065;
      Intrinsics.checkNotNullParameter(var1, "name");
      String var5 = var10000;
      short var10001 = -19445;
      var10002 = 31865;
      Intrinsics.checkNotNullParameter(var3, "category");
      KeyMapping var6 = new KeyMapping(var1, Type.MOUSE, var2, this.a(var3));
      boolean var7 = var4;
      if (var5 == null) {
         if (!var4) {
            return var6;
         }

         var7 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if (var5 == null) {
         if (var7) {
            KeyMappingHelper.registerKeyMapping(var6);
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1, var6);
            if (var5 == null) {
               return var6;
            }
         }

         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.add(TuplesKt.to(var1, var6));
      }

      return var6;
   }

   public static KeyMapping a(IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll var0, String var1, int var2, String var3, boolean var4, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = "Polinex Client General";
      }

      if ((var5 & 8) != 0) {
         var4 = true;
      }

      return var0.a(var1, var2, var3, var4);
   }

   public static KeyMapping b(IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll var0, String var1, int var2, String var3, boolean var4, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = "Polinex Client General";
      }

      if ((var5 & 8) != 0) {
         var4 = true;
      }

      return var0.b(var1, var2, var3, var4);
   }

   @NotNull
   public final KeyMapping a(@NotNull KeyMapping var1) {
      short var10001 = -19399;
      short var10002 = 19439;
      Intrinsics.checkNotNullParameter(var1, "keyBinding");
      KeyMapping var10000 = KeyMappingHelper.registerKeyMapping(var1);
      var10002 = -19402;
      short var10003 = 26614;
      Intrinsics.checkNotNullExpressionValue(var10000, "registerKeyMapping(...)");
      return var10000;
   }

   @Nullable
   public final KeyMapping b(@NotNull String var1) {
      short var10001 = -19417;
      short var10002 = 4065;
      Intrinsics.checkNotNullParameter(var1, "name");
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
   }

   public final boolean c(@NotNull String var1) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = -19417;
      short var10003 = 4065;
      Intrinsics.checkNotNullParameter(var1, "name");
      String var2 = var10000;
      if (var2 == null) {
         KeyMapping var3 = this.b(var1);
         if (var3 != null) {
            return var3.isDown();
         }
      }

      return false;
   }

   public final boolean d(@NotNull String var1) {
      String var10000 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      short var10002 = -19408;
      short var10003 = 26514;
      Intrinsics.checkNotNullParameter(var1, "name");
      String var2 = var10000;
      if (var2 == null) {
         KeyMapping var3 = this.b(var1);
         if (var3 != null) {
            return var3.consumeClick();
         }
      }

      return false;
   }

   @NotNull
   public final Map<String, KeyMapping> b() {
      return MapsKt.toMap(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   @NotNull
   public final String a(int var1) {
      String var2 = IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll.PXEvMid.b();
      int var10000 = var1;
      int var10001 = 32;
      if (var2 == null) {
         if (var1 == 32) {
            short var30 = -19412;
            var10001 = (short)23243;
            return "Space";
         }

         var10000 = var1;
         var10001 = 257;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var29 = -19400;
            var10001 = (short)917;
            return "Enter";
         }

         var10000 = var1;
         var10001 = 256;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var28 = -19397;
            var10001 = (short)20651;
            return "Escape";
         }

         var10000 = var1;
         var10001 = 258;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var27 = -19401;
            var10001 = (short)-14917;
            return "Tab";
         }

         var10000 = var1;
         var10001 = 259;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var26 = -19421;
            var10001 = (short)-31531;
            return "Backspace";
         }

         var10000 = var1;
         var10001 = 261;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var25 = -19411;
            var10001 = (short)-2467;
            return "Delete";
         }

         var10000 = var1;
         var10001 = 260;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var24 = -19405;
            var10001 = (short)-9349;
            return "Insert";
         }

         var10000 = var1;
         var10001 = 268;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var23 = -19396;
            var10001 = (short)-29296;
            return "Home";
         }

         var10000 = var1;
         var10001 = 269;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var22 = -19441;
            var10001 = (short)5764;
            return "End";
         }

         var10000 = var1;
         var10001 = 266;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var21 = -19407;
            var10001 = (short)-20375;
            return "Page Up";
         }

         var10000 = var1;
         var10001 = 267;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var20 = -19419;
            var10001 = (short)-25798;
            return "Page Down";
         }

         var10000 = var1;
         var10001 = 265;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var19 = -19422;
            var10001 = (short)-2155;
            return "Up Arrow";
         }

         var10000 = var1;
         var10001 = 264;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var18 = -19414;
            var10001 = (short)-185;
            return "Down Arrow";
         }

         var10000 = var1;
         var10001 = 263;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var17 = -19393;
            var10001 = (short)-27409;
            return "Left Arrow";
         }

         var10000 = var1;
         var10001 = 262;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var16 = -19404;
            var10001 = (short)-17687;
            return "Right Arrow";
         }

         var10000 = var1;
         var10001 = 340;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var15 = -19416;
            var10001 = (short)32471;
            return "Shift";
         }

         var10000 = var1;
         var10001 = 341;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var14 = -19415;
            var10001 = (short)-2205;
            return "Ctrl";
         }

         var10000 = var1;
         var10001 = 342;
      }

      label288: {
         if (var2 == null) {
            if (var10000 == var10001) {
               short var13 = -19444;
               var10001 = (short)10107;
               return "Alt";
            }

            var10000 = var1;
            if (var2 != null) {
               break label288;
            }

            var10001 = 343;
         }

         if (var10000 == var10001) {
            short var4 = -19394;
            var10001 = (short)9815;
            return "Super";
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (var10000 == 0) {
            short var12 = -19403;
            var10001 = (short)26957;
            return "Left Click";
         }

         var10000 = var1;
      }

      var10001 = 1;
      if (var2 == null) {
         if (var10000 == 1) {
            short var11 = -19398;
            short var39 = 15900;
            return "Right Click";
         }

         var10000 = var1;
         var10001 = 2;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var10 = -19446;
            short var38 = -30549;
            return "Middle Click";
         }

         var10000 = var1;
         var10001 = 3;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var9 = -19424;
            short var37 = 9105;
            return "Mouse 4";
         }

         var10000 = var1;
         var10001 = 4;
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            short var8 = -19420;
            short var36 = 8826;
            return "Mouse 5";
         }

         var10000 = 290;
         var10001 = var1;
      }

      label163: {
         if (var2 == null) {
            if (var10000 > var10001) {
               var10000 = 0;
               break label163;
            }

            var10000 = var1;
            if (var2 != null) {
               break label163;
            }

            var10001 = 302;
         }

         var10000 = var10000 < var10001 ? 1 : 0;
      }

      String var5;
      if (var10000 != 0) {
         var5 = "F" + (var1 - 290 + 1);
      } else {
         label154: {
            var10000 = 48;
            var10001 = var1;
            if (var2 == null) {
               if (48 > var1) {
                  var10000 = 0;
                  break label154;
               }

               var10000 = var1;
               if (var2 != null) {
                  break label154;
               }

               var10001 = 58;
            }

            var10000 = var10000 < var10001 ? 1 : 0;
         }

         if (var10000 != 0) {
            var5 = String.valueOf(var1 - 48);
         } else {
            label145: {
               var10000 = 65;
               var10001 = var1;
               if (var2 == null) {
                  if (65 > var1) {
                     var10000 = 0;
                     break label145;
                  }

                  var10000 = var1;
                  if (var2 != null) {
                     break label145;
                  }

                  var10001 = 91;
               }

               var10000 = var10000 < var10001 ? 1 : 0;
            }

            if (var10000 != 0) {
               var5 = String.valueOf((char)(65 + (var1 - 65)));
            } else {
               short var35 = -19406;
               short var10002 = 24886;
               var5 = "Unknown (" + var1 + ")";
            }
         }
      }

      return var5;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[39];
      int var3 = 0;
      String var2 = "øÈÏùja^Ü³»\u0007@uqI\u008b´ï\u0005÷öÅÑ¢\u0004À *\u009e\ròJnå\u001f0Þe\u0011Õ-UÛ\b\u0093\u0010b&ûÞÃË\u0005¿NÄØ\u009a\u0006\nÏ\u008aYî;\bê\"éwAI>\u0089\t/¸ç=ªml[\u008e\u0007=®](?\u0084_\u000e\u0011@\u0018¼\u001e\u0093\u009e\u0096^ø\u0003¬Ks\u0016^1\u0096Áw¥p¶\u0011õl\u0010\u001bú\u000bÉKôïó\u0010Å\u0004ÑO\u009fÍ\u0007\u009b\"\u0089¹¥¶\r\tu¦øð\u009e/Ýµ|\u000bú`K,¼|k,\u0004l£\u0006Óý\u009fÏ¦m\u0005á?Î-{\nÜ5\u008f!äüù¾\u0092\u009f\u0005²\bt³¨\nA\u0086àa¼+\u0084\u0095è\u0092\u00048S@\u0081\u0007\u0089á¿\u009c\f\u0087\u0094\tiÄÒY\u0019C\u008a:ñ\u0006[ß\u00131''\u0004\u0083\u0012Õf\u0007\n1\u0017\u0002c`}\u0017\u0095p\u0082¢\u0082Ømx\u0004=×\tqðø\"dk-tã \u0095\u0003\u0096þ\u0005\u000bÆÍÌ\u0099LÊwäÞ¤\u009c\nqÿæN|Ì\u00820ùB\fÞÔ0¶¨ç\u0091\u009dQ\u009a¤V\br0^\"|^3Û\u000ew\u000e³&ÓYä)\u0083\u0006>nQ5\u0010©lèl\u0085Ö\u001e»µD\u0092\u0097\t´\u000f\u007f\u0016ÝÖæ=y:±E)\u008bkßû\u0003\u0017öÈ\u0013\u009f\u000f\u001eZ";
      int var4 = "øÈÏùja^Ü³»\u0007@uqI\u008b´ï\u0005÷öÅÑ¢\u0004À *\u009e\ròJnå\u001f0Þe\u0011Õ-UÛ\b\u0093\u0010b&ûÞÃË\u0005¿NÄØ\u009a\u0006\nÏ\u008aYî;\bê\"éwAI>\u0089\t/¸ç=ªml[\u008e\u0007=®](?\u0084_\u000e\u0011@\u0018¼\u001e\u0093\u009e\u0096^ø\u0003¬Ks\u0016^1\u0096Áw¥p¶\u0011õl\u0010\u001bú\u000bÉKôïó\u0010Å\u0004ÑO\u009fÍ\u0007\u009b\"\u0089¹¥¶\r\tu¦øð\u009e/Ýµ|\u000bú`K,¼|k,\u0004l£\u0006Óý\u009fÏ¦m\u0005á?Î-{\nÜ5\u008f!äüù¾\u0092\u009f\u0005²\bt³¨\nA\u0086àa¼+\u0084\u0095è\u0092\u00048S@\u0081\u0007\u0089á¿\u009c\f\u0087\u0094\tiÄÒY\u0019C\u008a:ñ\u0006[ß\u00131''\u0004\u0083\u0012Õf\u0007\n1\u0017\u0002c`}\u0017\u0095p\u0082¢\u0082Ømx\u0004=×\tqðø\"dk-tã \u0095\u0003\u0096þ\u0005\u000bÆÍÌ\u0099LÊwäÞ¤\u009c\nqÿæN|Ì\u00820ùB\fÞÔ0¶¨ç\u0091\u009dQ\u009a¤V\br0^\"|^3Û\u000ew\u000e³&ÓYä)\u0083\u0006>nQ5\u0010©lèl\u0085Ö\u001e»µD\u0092\u0097\t´\u000f\u007f\u0016ÝÖæ=y:±E)\u008bkßû\u0003\u0017öÈ\u0013\u009f\u000f\u001eZ"
         .length();
      char var1 = '\n';
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 82;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 27;
                     case 1 -> 88;
                     case 2 -> 16;
                     case 3 -> 31;
                     case 4 -> 48;
                     case 5 -> 71;
                     default -> 91;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[39];
                     var10000 = -19448;
                     short var17 = 4115;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = "Polinex Client";
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new LinkedHashMap<>();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new LinkedHashMap<>();
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "\u0012ìZ\u0003\u0087µ|";
                  var4 = "\u0012ìZ\u0003\u0087µ|".length();
                  var1 = 3;
                  var8 = -1;
            }

            var10000 = 38;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19414) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 188;
            case 1 -> 47;
            case 2 -> 189;
            case 3 -> 160;
            case 4 -> 37;
            case 5 -> 239;
            case 6 -> 228;
            case 7 -> 172;
            case 8 -> 171;
            case 9 -> 94;
            case 10 -> 7;
            case 11 -> 155;
            case 12 -> 232;
            case 13 -> 196;
            case 14 -> 41;
            case 15 -> 84;
            case 16 -> 53;
            case 17 -> 201;
            case 18 -> 32;
            case 19 -> 203;
            case 20 -> 30;
            case 21 -> 46;
            case 22 -> 27;
            case 23 -> 71;
            case 24 -> 202;
            case 25 -> 16;
            case 26 -> 67;
            case 27 -> 93;
            case 28 -> 23;
            case 29 -> 248;
            case 30 -> 40;
            case 31 -> 122;
            case 32 -> 193;
            case 33 -> 52;
            case 34 -> 81;
            case 35 -> 137;
            case 36 -> 244;
            case 37 -> 34;
            case 38 -> 42;
            case 39 -> 75;
            case 40 -> 158;
            case 41 -> 120;
            case 42 -> 31;
            case 43 -> 240;
            case 44 -> 187;
            case 45 -> 19;
            case 46 -> 104;
            case 47 -> 26;
            case 48 -> 5;
            case 49 -> 139;
            case 50 -> 174;
            case 51 -> 215;
            case 52 -> 178;
            case 53 -> 148;
            case 54 -> 8;
            case 55 -> 167;
            case 56 -> 217;
            case 57 -> 212;
            case 58 -> 184;
            case 59 -> 33;
            case 60 -> 206;
            case 61 -> 106;
            case 62 -> 165;
            case 63 -> 74;
            case 64 -> 231;
            case 65 -> 78;
            case 66 -> 233;
            case 67 -> 86;
            case 68 -> 194;
            case 69 -> 181;
            case 70 -> 61;
            case 71 -> 119;
            case 72 -> 255;
            case 73 -> 25;
            case 74 -> 208;
            case 75 -> 166;
            case 76 -> 183;
            case 77 -> 243;
            case 78 -> 3;
            case 79 -> 17;
            case 80 -> 156;
            case 81 -> 103;
            case 82 -> 133;
            case 83 -> 197;
            case 84 -> 185;
            case 85 -> 220;
            case 86 -> 164;
            case 87 -> 225;
            case 88 -> 112;
            case 89 -> 200;
            case 90 -> 134;
            case 91 -> 6;
            case 92 -> 245;
            case 93 -> 154;
            case 94 -> 211;
            case 95 -> 15;
            case 96 -> 131;
            case 97 -> 62;
            case 98 -> 50;
            case 99 -> 98;
            case 100 -> 195;
            case 101 -> 90;
            case 102 -> 177;
            case 103 -> 35;
            case 104 -> 36;
            case 105 -> 2;
            case 106 -> 140;
            case 107 -> 173;
            case 108 -> 91;
            case 109 -> 97;
            case 110 -> 218;
            case 111 -> 124;
            case 112 -> 147;
            case 113 -> 87;
            case 114 -> 64;
            case 115 -> 89;
            case 116 -> 88;
            case 117 -> 176;
            case 118 -> 66;
            case 119 -> 20;
            case 120 -> 73;
            case 121 -> 170;
            case 122 -> 0;
            case 123 -> 65;
            case 124 -> 115;
            case 125 -> 145;
            case 126 -> 163;
            case 127 -> 83;
            case 128 -> 127;
            case 129 -> 169;
            case 130 -> 143;
            case 131 -> 130;
            case 132 -> 161;
            case 133 -> 29;
            case 134 -> 11;
            case 135 -> 224;
            case 136 -> 242;
            case 137 -> 153;
            case 138 -> 254;
            case 139 -> 252;
            case 140 -> 1;
            case 141 -> 162;
            case 142 -> 107;
            case 143 -> 12;
            case 144 -> 221;
            case 145 -> 149;
            case 146 -> 227;
            case 147 -> 44;
            case 148 -> 77;
            case 149 -> 241;
            case 150 -> 116;
            case 151 -> 209;
            case 152 -> 235;
            case 153 -> 58;
            case 154 -> 204;
            case 155 -> 190;
            case 156 -> 22;
            case 157 -> 151;
            case 158 -> 236;
            case 159 -> 70;
            case 160 -> 55;
            case 161 -> 111;
            case 162 -> 129;
            case 163 -> 159;
            case 164 -> 214;
            case 165 -> 135;
            case 166 -> 121;
            case 167 -> 96;
            case 168 -> 168;
            case 169 -> 226;
            case 170 -> 182;
            case 171 -> 13;
            case 172 -> 43;
            case 173 -> 157;
            case 174 -> 192;
            case 175 -> 253;
            case 176 -> 101;
            case 177 -> 82;
            case 178 -> 216;
            case 179 -> 59;
            case 180 -> 141;
            case 181 -> 85;
            case 182 -> 69;
            case 183 -> 230;
            case 184 -> 146;
            case 185 -> 54;
            case 186 -> 128;
            case 187 -> 56;
            case 188 -> 68;
            case 189 -> 205;
            case 190 -> 234;
            case 191 -> 199;
            case 192 -> 4;
            case 193 -> 99;
            case 194 -> 39;
            case 195 -> 249;
            case 196 -> 144;
            case 197 -> 180;
            case 198 -> 237;
            case 199 -> 109;
            case 200 -> 186;
            case 201 -> 28;
            case 202 -> 238;
            case 203 -> 92;
            case 204 -> 24;
            case 205 -> 63;
            case 206 -> 191;
            case 207 -> 14;
            case 208 -> 247;
            case 209 -> 80;
            case 210 -> 219;
            case 211 -> 21;
            case 212 -> 113;
            case 213 -> 100;
            case 214 -> 125;
            case 215 -> 10;
            case 216 -> 9;
            case 217 -> 79;
            case 218 -> 108;
            case 219 -> 222;
            case 220 -> 72;
            case 221 -> 213;
            case 222 -> 138;
            case 223 -> 48;
            case 224 -> 229;
            case 225 -> 123;
            case 226 -> 142;
            case 227 -> 136;
            case 228 -> 118;
            case 229 -> 117;
            case 230 -> 49;
            case 231 -> 126;
            case 232 -> 179;
            case 233 -> 18;
            case 234 -> 102;
            case 235 -> 198;
            case 236 -> 105;
            case 237 -> 250;
            case 238 -> 152;
            case 239 -> 110;
            case 240 -> 223;
            case 241 -> 76;
            case 242 -> 114;
            case 243 -> 207;
            case 244 -> 60;
            case 245 -> 45;
            case 246 -> 38;
            case 247 -> 246;
            case 248 -> 132;
            case 249 -> 251;
            case 250 -> 150;
            case 251 -> 175;
            case 252 -> 57;
            case 253 -> 210;
            case 254 -> 51;
            default -> 95;
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

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      public static IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
      public static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      public static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      public static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      public static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      public static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      public static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      public static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      public static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      public static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      public static int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      public static int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      public static int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      public static int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      public static int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      public static int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      public static int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      public static int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      public static int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      public static int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      public static int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      public static int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      public static int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      public static int llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      public static int lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
      public static int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      public static int IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      public static int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
      public static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
      public static int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      public static int IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
      public static int IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
      public static int lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
      public static int lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
      public static int IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
      public static int IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      public static int IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
      public static int IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
      public static int IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
      public static int lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
      public static int lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
      public static int lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
      public static int IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
      public static int llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
      public static int llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
      public static int IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
      public static int llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
      public static int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
      public static int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
      public static int lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
      public static int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
      public static int lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      public static int lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      public static int IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
      public static int lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
      public static int IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      public static int IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
      public static int lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      public static int llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      public static int lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      public static int IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      public static int lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
      public static int IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
      public static int lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
      public static int lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
      public static int IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
      public static int lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
      public static int IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
      public static int lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
      public static int llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
      public static int IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
      public static int IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
      public static int IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      public static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      public static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      public static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      public static String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      public static String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var0 = new String[5];
         int var4 = 0;
         String var3 = "?A~\n\u000b\bXOm~\n\u0000\u0003TOiw\r\u0000\u001fA\u0003\u0015?A~\n\u000b\bXOm~\n\u0000\u0003TO|w\r\u0001\bR\u0013?A~\n\u000b\bXOm~\n\u0000\u0003TOc{\u0010\u0006";
         int var5 = "?A~\n\u000b\bXOm~\n\u0000\u0003TOiw\r\u0000\u001fA\u0003\u0015?A~\n\u000b\bXOm~\n\u0000\u0003TO|w\r\u0001\bR\u0013?A~\n\u000b\bXOm~\n\u0000\u0003TOc{\u0010\u0006"
            .length();
         char var2 = 22;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 42;
            String var10001 = var3.substring(++var8, var8 + var2);
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
                        case 0 -> 69;
                        case 1 -> 4;
                        case 2 -> 56;
                        case 3 -> 73;
                        case 4 -> 79;
                        case 5 -> 71;
                        default -> 10;
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
                     var0[var4++] = var29;
                     if ((var8 += var2) >= var5) {
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0[4];
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0[0];
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0[1];
                        lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0[3];
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0[2];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                        break pxClinit; // PX-FIX
                     }

                     var2 = var3.charAt(var8);
                     break;
                  default:
                     var0[var4++] = var29;
                     if ((var8 += var2) < var5) {
                        var2 = var3.charAt(var8);
                        continue label52;
                     }

                     var3 = "M3\fxyz*=\u001f\fxrq&=\u0011\u000fgrr7s(\u0015M3\fxyz*=\u001f\fxrq&=\u001f\u000f|u~&";
                     var5 = "M3\fxyz*=\u001f\fxrq&=\u0011\u000fgrr7s(\u0015M3\fxyz*=\u001f\fxrq&=\u001f\u000f|u~&".length();
                     var2 = 23;
                     var8 = -1;
               }

               var10000 = 88;
               var10001 = var3.substring(++var8, var8 + var2);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }
   }
}
