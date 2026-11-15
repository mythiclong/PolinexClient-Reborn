package me.octo.client.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PolinexGmdCompat {
   private static final String TARGET = "me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI";
   private static final String STATE_ENUM = "me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll";
   private static final String STATE_FIELD = "llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI";
   private static final String DATA_FIELD = "lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl";
   private static final String TIMER_FIELD = "lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI";
   private static final String STATS_STATE = "IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl";
   private static final String NEXT_STATE = "lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII";
   private static final String ITEM_UTILS = "me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI";
   private static final String ITEM_UTILS_SINGLETON = "IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI";
   private static final String MINING_STATE = "me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII";
   private static final String MINING_STATE_SINGLETON = "IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI";
   private static final String COMMAND_UTILS = "me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI";
   private static final Pattern NUMBER = Pattern.compile("[-+]?\\d[\\d,]*(?:\\.\\d+)?");
   private static volatile boolean processing;
   private static volatile long lastWaitLog;

   private PolinexGmdCompat() {
   }

   public static boolean handleStatsGui(String var0, List<?> var1) {
      String var2 = clean(var0);
      if (!"Stats & Equipment".equals(var2) && !"Your Equipment and Stats".equals(var2)) {
         return false;
      } else if (processing) {
         return false;
      } else {
         boolean var16;
         try {
            Class var3 = Class.forName("me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI");
            Class var32 = Class.forName(
               "me.octo.client.utils.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
            );
            Field var5 = declaredField(var3, "llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI");
            Object var6 = var5.get(null);
            Object var7 = var32.getField("IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl").get(null);
            if (var6 != var7) {
               return false;
            }

            if (var1 == null || var1.size() < 26) {
               waitLog("container slots are not ready: " + (var1 == null ? "null" : var1.size()));
               return false;
            }

            PolinexGmdCompat.ReflectionAccess var8 = new PolinexGmdCompat.ReflectionAccess();
            Object var9 = null;
            Object var10 = null;
            int var11 = Math.min(var1.size(), 54);

            for (int var12 = 0; var12 < var11; var12++) {
               Object var13 = var1.get(var12);
               if (var13 != null) {
                  Object var14 = var8.slotGetItem.invoke(var13);
                  if (var14 != null) {
                     String var15 = clean(var8.itemName(var14));
                     if ("Mining Stats".equals(var15)) {
                        var9 = var14;
                     } else if ("Miscellaneous Stats".equals(var15)) {
                        var10 = var14;
                     }

                     if (var9 != null && var10 != null) {
                        break;
                     }
                  }
               }
            }

            if (var9 == null) {
               var9 = var8.itemAt(var1, 15);
            }

            if (var10 == null) {
               var10 = var8.itemAt(var1, 25);
            }

            if (var9 == null || var10 == null) {
               waitLog("waiting for Mining Stats/Miscellaneous Stats items");
               return false;
            }

            PolinexGmdCompat.StatResult var35 = var8.findStat(var9, "Mining Speed");
            PolinexGmdCompat.StatResult var37 = var8.findStat(var10, "Cold Resistance");
            if (var35.value == null) {
               waitLog("Mining Speed lore is not available yet; mining lore=" + var35.lines);
               return false;
            }

            processing = true;
            Field var38 = declaredField(var3, "lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl");
            Object var40 = var38.get(null);
            if (var40 != null) {
               Class var41 = Class.forName("me.octo.client.utils.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII");
               Object var17 = var41.getField("IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI").get(null);
               double var18 = ((Number)var41.getMethod("A").invoke(var17)).doubleValue();
               double var20 = var35.value - var18;
               var40.getClass().getMethod("a", double.class).invoke(var40, var20);
               if (var37.value != null) {
                  var40.getClass().getMethod("e", double.class).invoke(var40, var37.value);
               }

               Class var22 = Class.forName("me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI");
               var22.getMethod("b", String.class).invoke(null, "hotm");
               Field var23 = declaredField(var3, "lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI");
               Object var24 = var23.get(null);
               if (var24 != null) {
                  var24.getClass().getMethod("f").invoke(var24);
               }

               Object var25 = var32.getField("lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII").get(null);
               var5.set(null, var25);
               System.out
                  .println(
                     "[Polinex GMD] Stats parsed directly: Mining Speed="
                        + var35.value
                        + ", active bonus="
                        + var18
                        + ", stored="
                        + var20
                        + ", Cold Resistance="
                        + (var37.value == null ? "0/absent" : var37.value)
                        + "; sent hotm through sendCommand"
                  );
               return true;
            }

            waitLog("GMD data object is null");
            var16 = false;
         } catch (Throwable var30) {
            System.err.println("[Polinex GMD] Stats GUI compatibility handler failed: " + var30);
            var30.printStackTrace();
            return false;
         } finally {
            processing = false;
         }

         return var16;
      }
   }

   private static Field declaredField(Class<?> var0, String var1) throws ReflectiveOperationException {
      Field var2 = var0.getDeclaredField(var1);
      var2.setAccessible(true);
      return var2;
   }

   private static String clean(String var0) {
      return var0 == null ? "" : var0.replaceAll("(?i)§[0-9A-FK-ORX]", "").trim();
   }

   private static void waitLog(String var0) {
      long var1 = System.currentTimeMillis();
      if (var1 - lastWaitLog >= 2000L) {
         lastWaitLog = var1;
         System.out.println("[Polinex GMD] " + var0);
      }
   }

   private static final class ReflectionAccess {
      private final Class<?> itemStackClass;
      private final Method slotGetItem;
      private final Method itemGetHoverName;
      private final Method componentGetString;
      private final Object itemUtils;
      private final Method itemLore;

      private ReflectionAccess() throws ReflectiveOperationException {
         Class var1 = Class.forName("net.minecraft.world.inventory.Slot");
         this.itemStackClass = Class.forName("net.minecraft.world.item.ItemStack");
         Class var2 = Class.forName("net.minecraft.network.chat.Component");
         this.slotGetItem = var1.getMethod("getItem");
         this.itemGetHoverName = this.itemStackClass.getMethod("getHoverName");
         this.componentGetString = var2.getMethod("getString");
         Class var3 = Class.forName("me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI");
         this.itemUtils = var3.getField("IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI").get(null);
         this.itemLore = var3.getMethod("d", this.itemStackClass);
      }

      private Object itemAt(List<?> var1, int var2) throws ReflectiveOperationException {
         if (var2 >= 0 && var2 < var1.size()) {
            Object var3 = var1.get(var2);
            return var3 == null ? null : this.slotGetItem.invoke(var3);
         } else {
            return null;
         }
      }

      private String itemName(Object var1) throws ReflectiveOperationException {
         Object var2 = this.itemGetHoverName.invoke(var1);
         return var2 == null ? "" : String.valueOf(this.componentGetString.invoke(var2));
      }

      private PolinexGmdCompat.StatResult findStat(Object var1, String var2) throws ReflectiveOperationException {
         Object var3 = this.itemLore.invoke(this.itemUtils, var1);
         ArrayList var4 = new ArrayList();
         if (!(var3 instanceof Iterable var5)) {
            return new PolinexGmdCompat.StatResult(null, var4);
         } else {
            for (Object var7 : var5) {
               if (var7 != null) {
                  String var8 = PolinexGmdCompat.clean(String.valueOf(this.componentGetString.invoke(var7)));
                  var4.add(var8);
                  int var9 = var8.indexOf(var2);
                  if (var9 >= 0) {
                     Matcher var10 = PolinexGmdCompat.NUMBER.matcher(var8.substring(var9 + var2.length()));
                     if (var10.find()) {
                        try {
                           return new PolinexGmdCompat.StatResult(Double.parseDouble(var10.group().replace(",", "")), var4);
                        } catch (NumberFormatException var12) {
                        }
                     }
                  }
               }
            }

            return new PolinexGmdCompat.StatResult(null, var4);
         }
      }
   }

   private static final class StatResult {
      private final Double value;
      private final List<String> lines;

      private StatResult(Double var1, List<String> var2) {
         this.value = var1;
         this.lines = var2;
      }
   }
}
