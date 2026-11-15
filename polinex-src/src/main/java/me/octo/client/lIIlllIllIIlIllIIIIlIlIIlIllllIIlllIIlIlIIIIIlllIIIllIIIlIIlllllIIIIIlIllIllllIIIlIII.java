package me.octo.client;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII
   extends llIllIlIlIlIllIlIlIIIllIIlllIlIllIIlIIllllIIIlIlIIlllIIIlIllllIlIIIllIIIIIIIIIIIlIlIl {
   @NotNull
   public static lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] f;
   private static String[] g;

   private lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII() {
      short var10001 = -18406;
      short var10002 = -6761;
      var10002 = -18402;
      short var10003 = -23570;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      short var10004 = -18404;
      short var10005 = -19657;
      IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[] var1 = new IIlIIIIlllIIlIlIIlllllIllllllIIllllIllllIlIlIIllIlIIIIIIIllllIllIIlllIIIIlllIIlllIlll[]{
         IIlIIlllIIlIIIlIIllllIIllIlllIIIIllllIlIlIIlllIllIlIIlIllIIIIIlIlIIIIIlllIIIIIIIlIIlI.a()
      };
      super("Harp Solver", "Automatically solves melody harp. Flawless on stable connections.", var3, "Misc", var1);
   }

   @Override
   public void aB() {
      super.aB();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0L;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0;
   }

   @Override
   public void aC() {
      super.aC();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
   }

   @SubscribeEvent
   public final void a(@NotNull me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1) {
      Object var26 = null; // PX-FIX
      Object var22 = null; // PX-FIX
      int var20 = 0; // PX-FIX
      Object var11 = null; // PX-FIX
      int[] var2 = lIIIlllIIIIIIlIlIIlIlIllIIIIlIlllIIllIlllIIIIIIIllllIIlIIIllIIIlIIIIlIIllIIllIlIllIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b();
      me.octo.client.events.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var10000 = var1;
      if (var2 == null) {
         short var10001 = -18401;
         short var10002 = 32066;
         Intrinsics.checkNotNullParameter(var1, "event");
         if (!this.aA()) {
            return;
         }

         var10000 = var1;
      }

      String var16 = var10000.k();
      if (var16 != null) {
         String var3 = var16;
         if (var2 == null) {
            List var17 = var1.m();
            if (var17 != null) {
               List var4 = var17;
               int var24 = -18403;
               short var29 = -20968;
               if (!StringsKt.startsWith(var3, "Harp -", false)) {
                  return;
               }

               StringBuilder var6 = new StringBuilder();
               StringBuilder var7 = var6;
               int var8 = 0;
               Iterator var9 = var4.iterator();

               label164:
               while (true) {
                  boolean var18 = var9.hasNext();

                  Slot var10;
                  do {
                     if (!var18) {
                        break label164;
                     }

                     var10 = (Slot)var9.next();
                     if (var2 != null) {
                        break label164;
                     }

                     var18 = var10.hasItem();
                  } while (var2 != null);

                  if (var18) {
                     label152: {
                        if (var2 == null) {
                           ItemStack var25 = var10.getItem();
                           if (var25 != null) {
                              var26 = var25.getItem();
                              break label152;
                           }
                        }

                        var26 = null;
                     }

                     var7.append(var26);
                     if (var2 != null) {
                        break;
                     }
                  }
               }

               String var5 = var6.toString();
               int var19 = ((Intrinsics.areEqual(var5, this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl)) ? 1 : 0);
               if (var2 == null) {
                  if (var19 == 0) {
                     label138: {
                        this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var5;
                        var11 = (int)(System.currentTimeMillis() - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
                        var20 = 101;
                        var24 =((Integer)( var11));
                        if (var2 == null) {
                           if (101 > (((((Boolean)(Object)((Boolean)var11 ? 1 : 0)))) ? 1 : 0)) {
                              var20 = 0;
                              break label138;
                           }

                           var20 =((Integer)( var11));
                           if (var2 != null) {
                              break label138;
                           }

                           var24 = 600;
                        }

                        var20 = var20 < var24 ? 1 : 0;
                     }

                     if (var20 != 0) {
                        this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl += ((Integer)var11);
                        int var13 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI++;
                        this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
                     }

                     this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.currentTimeMillis();
                  }

                  var19 = ((this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl) ? 1 : 0);
               }

               if (var2 == null) {
                  if (var19 == 0) {
                     return;
                  }

                  var19 = this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
               }

               if (var2 == null) {
                  if (var19 == 0) {
                     return;
                  }

                  var19 = 28;
               }

               int var12 = var19;

               while (var12 < 90 && var12 < var4.size()) {
                  Slot var14 = (Slot)var4.get(var12);
                  label114:
                  if (var2 == null) {
                     label112:
                     if (var14.hasItem()) {
                        ItemStack var21 = var14.getItem();
                        var22 = Intrinsics.areEqual(var21 != null ? var21.getItem() : null, Items.WHITE_WOOL);
                        label109:
                        if (var2 == null) {
                           if (((Boolean)(var22))) {
                              ItemStack var23 = var14.getItem();
                              var22 = Intrinsics.areEqual(var23 != null ? var23.getItem() : null, Items.QUARTZ_BLOCK);
                              if (var2 != null) {
                                 break label109;
                              }

                              if (((Boolean)(var22))) {
                                 break label112;
                              }
                           }

                           var22 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
                              / this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                        }

                        var24 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
                        if (var2 == null) {
                           var24 = this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl == var12
                              ? 50
                              : ((me.octo.client.PXDyn)(Object)(IIlIIlllIIlIIIlIIllllIIllIlllIIIIllllIlIlIIlllIllIlIIlIllIIIIIlIlIIIIIlllIIIIIIIlIIlI.a())).M();
                        }

                        var8 = ((Integer)var22) - var24;
                        if (var2 != null) {
                           break label114;
                        }

                        if (System.currentTimeMillis() - this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll >= var8) {
                           me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .a(var12, 0, ContainerInput.CLONE);
                           this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
                           this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var12;
                           if (var2 == null) {
                              break;
                           }
                        }
                     }

                     var12++;
                  }

                  if (var2 != null) {
                     break;
                  }
               }

               return;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
      String[] var5 = new String[5];
      int var3 = 0;
      String var2 = "}3ï$»S\flðõ\u008bNÝÇ¼[»i\"Òb\båðìJRNVd\u0080GÓ\u0082\u0018:\u0004\u008cW¼Lâ\u0096ÆÅ\u008c¹õ\u0084\u0004Y\u0096\u001c©ü\u009bQ]·àA½ÍdÜ\u0005ÿ\u0014\u000e¢\u00ad\u0004UÈ`È";
      int var4 = "}3ï$»S\flðõ\u008bNÝÇ¼[»i\"Òb\båðìJRNVd\u0080GÓ\u0082\u0018:\u0004\u008cW¼Lâ\u0096ÆÅ\u008c¹õ\u0084\u0004Y\u0096\u001c©ü\u009bQ]·àA½ÍdÜ\u0005ÿ\u0014\u000e¢\u00ad\u0004UÈ`È"
         .length();
      char var1 = 'A';
      int var8 = -1;

      label52:
while (true) {
         byte var10000 = 46;
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
                     case 0 -> 103;
                     case 1 -> 66;
                     case 2 -> 90;
                     case 3 -> 85;
                     case 4 -> 113;
                     case 5 -> 117;
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
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     f = var5;
                     g = new String[5];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII();
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

                  var2 = "+\u0089\u0080qVÂ\u000bù\u0087Ú°\u001d\u0084¬l\u0002ß÷";
                  var4 = "+\u0089\u0080qVÂ\u000bù\u0087Ú°\u001d\u0084¬l\u0002ß÷".length();
                  var1 = 6;
                  var8 = -1;
            }

            var10000 = 73;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -18402) & 65535;
      if (g[var2] == null) {
         char[] var3 = f[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 114;
            case 1 -> 244;
            case 2 -> 46;
            case 3 -> 1;
            case 4 -> 84;
            case 5 -> 203;
            case 6 -> 209;
            case 7 -> 95;
            case 8 -> 238;
            case 9 -> 54;
            case 10 -> 106;
            case 11 -> 57;
            case 12 -> 14;
            case 13 -> 81;
            case 14 -> 26;
            case 15 -> 56;
            case 16 -> 177;
            case 17 -> 28;
            case 18 -> 92;
            case 19 -> 228;
            case 20 -> 218;
            case 21 -> 192;
            case 22 -> 2;
            case 23 -> 165;
            case 24 -> 123;
            case 25 -> 136;
            case 26 -> 58;
            case 27 -> 43;
            case 28 -> 230;
            case 29 -> 211;
            case 30 -> 242;
            case 31 -> 253;
            case 32 -> 90;
            case 33 -> 141;
            case 34 -> 118;
            case 35 -> 33;
            case 36 -> 156;
            case 37 -> 8;
            case 38 -> 212;
            case 39 -> 40;
            case 40 -> 89;
            case 41 -> 225;
            case 42 -> 24;
            case 43 -> 102;
            case 44 -> 11;
            case 45 -> 94;
            case 46 -> 226;
            case 47 -> 208;
            case 48 -> 190;
            case 49 -> 124;
            case 50 -> 179;
            case 51 -> 75;
            case 52 -> 121;
            case 53 -> 132;
            case 54 -> 36;
            case 55 -> 207;
            case 56 -> 29;
            case 57 -> 200;
            case 58 -> 188;
            case 59 -> 98;
            case 60 -> 229;
            case 61 -> 193;
            case 62 -> 134;
            case 63 -> 0;
            case 64 -> 162;
            case 65 -> 101;
            case 66 -> 149;
            case 67 -> 50;
            case 68 -> 31;
            case 69 -> 64;
            case 70 -> 52;
            case 71 -> 71;
            case 72 -> 213;
            case 73 -> 131;
            case 74 -> 32;
            case 75 -> 23;
            case 76 -> 117;
            case 77 -> 191;
            case 78 -> 220;
            case 79 -> 205;
            case 80 -> 76;
            case 81 -> 67;
            case 82 -> 227;
            case 83 -> 189;
            case 84 -> 112;
            case 85 -> 85;
            case 86 -> 91;
            case 87 -> 130;
            case 88 -> 164;
            case 89 -> 255;
            case 90 -> 254;
            case 91 -> 17;
            case 92 -> 108;
            case 93 -> 157;
            case 94 -> 51;
            case 95 -> 148;
            case 96 -> 167;
            case 97 -> 223;
            case 98 -> 47;
            case 99 -> 232;
            case 100 -> 146;
            case 101 -> 139;
            case 102 -> 21;
            case 103 -> 196;
            case 104 -> 4;
            case 105 -> 199;
            case 106 -> 243;
            case 107 -> 3;
            case 108 -> 151;
            case 109 -> 119;
            case 110 -> 137;
            case 111 -> 185;
            case 112 -> 180;
            case 113 -> 88;
            case 114 -> 247;
            case 115 -> 53;
            case 116 -> 182;
            case 117 -> 93;
            case 118 -> 86;
            case 119 -> 20;
            case 120 -> 140;
            case 121 -> 206;
            case 122 -> 163;
            case 123 -> 126;
            case 124 -> 116;
            case 125 -> 109;
            case 126 -> 7;
            case 127 -> 65;
            case 128 -> 80;
            case 129 -> 168;
            case 130 -> 194;
            case 131 -> 18;
            case 132 -> 107;
            case 133 -> 127;
            case 134 -> 173;
            case 135 -> 166;
            case 136 -> 239;
            case 137 -> 13;
            case 138 -> 96;
            case 139 -> 142;
            case 140 -> 78;
            case 141 -> 144;
            case 142 -> 174;
            case 143 -> 160;
            case 144 -> 155;
            case 145 -> 198;
            case 146 -> 231;
            case 147 -> 172;
            case 148 -> 37;
            case 149 -> 138;
            case 150 -> 186;
            case 151 -> 104;
            case 152 -> 159;
            case 153 -> 44;
            case 154 -> 202;
            case 155 -> 252;
            case 156 -> 15;
            case 157 -> 77;
            case 158 -> 195;
            case 159 -> 42;
            case 160 -> 150;
            case 161 -> 222;
            case 162 -> 169;
            case 163 -> 224;
            case 164 -> 25;
            case 165 -> 184;
            case 166 -> 219;
            case 167 -> 30;
            case 168 -> 12;
            case 169 -> 145;
            case 170 -> 99;
            case 171 -> 6;
            case 172 -> 161;
            case 173 -> 69;
            case 174 -> 79;
            case 175 -> 221;
            case 176 -> 72;
            case 177 -> 68;
            case 178 -> 240;
            case 179 -> 105;
            case 180 -> 39;
            case 181 -> 5;
            case 182 -> 111;
            case 183 -> 143;
            case 184 -> 100;
            case 185 -> 115;
            case 186 -> 201;
            case 187 -> 48;
            case 188 -> 251;
            case 189 -> 128;
            case 190 -> 234;
            case 191 -> 216;
            case 192 -> 181;
            case 193 -> 10;
            case 194 -> 41;
            case 195 -> 103;
            case 196 -> 158;
            case 197 -> 175;
            case 198 -> 236;
            case 199 -> 170;
            case 200 -> 22;
            case 201 -> 176;
            case 202 -> 19;
            case 203 -> 154;
            case 204 -> 38;
            case 205 -> 178;
            case 206 -> 34;
            case 207 -> 122;
            case 208 -> 60;
            case 209 -> 246;
            case 210 -> 45;
            case 211 -> 82;
            case 212 -> 235;
            case 213 -> 250;
            case 214 -> 129;
            case 215 -> 248;
            case 216 -> 55;
            case 217 -> 135;
            case 218 -> 241;
            case 219 -> 204;
            case 220 -> 237;
            case 221 -> 187;
            case 222 -> 110;
            case 223 -> 59;
            case 224 -> 61;
            case 225 -> 210;
            case 226 -> 133;
            case 227 -> 153;
            case 228 -> 83;
            case 229 -> 217;
            case 230 -> 249;
            case 231 -> 120;
            case 232 -> 35;
            case 233 -> 49;
            case 234 -> 63;
            case 235 -> 97;
            case 236 -> 183;
            case 237 -> 113;
            case 238 -> 74;
            case 239 -> 62;
            case 240 -> 197;
            case 241 -> 214;
            case 242 -> 87;
            case 243 -> 16;
            case 244 -> 27;
            case 245 -> 147;
            case 246 -> 125;
            case 247 -> 215;
            case 248 -> 70;
            case 249 -> 152;
            case 250 -> 9;
            case 251 -> 171;
            case 252 -> 73;
            case 253 -> 245;
            case 254 -> 233;
            default -> 66;
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

         g[var2] = new String(var3).intern();
      }

      return g[var2];
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

      @NotNull
      public final lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII a() {
         return lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      }
   }

  // PX-FIX synth restored from jar bytecode
  public static final me.octo.client.lIIlllIllIIlIllIIIIlIlIIlIllllIIlllIIlIlIIIIIlllIIIllIIIlIIlllllIIIIIlIllIllllIIIlIII ag() { return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll; }
}
