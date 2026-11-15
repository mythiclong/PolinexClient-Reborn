package me.octo.client;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

public final class IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI<T>
   implements Comparator<T> {
   
   final java.util.HashMap IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   
   final me.octo.client.utils.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   
   final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   
   private static String[] a;
   private static String[] b;

   public IIIlllIlIIlIlllIIIIIIIllIIlllIIlllIIIlIlIlIIlIllIIIlIlIIllIlIIllIIIllIIIIlIllIIIlIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
      me.octo.client.utils.IllIlIlIlIlIIlIIIlllllIIllIIIlIlIIIIllllIlIllIIIlIlllIlllIlIlIIlIllllIIlllIlllIIIIIII var1, Vec3 var2, HashMap var3
   ) {
      Object lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = null; // PX-FIX
      Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null; // PX-FIX
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public final int compare(T var1, T var2) {
      Object var44 = null; // PX-FIX
      double var42 = 0; // PX-FIX
      Object lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = null; // PX-FIX
      Object IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null; // PX-FIX
      Object IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = null; // PX-FIX
      int var3;
      BlockPos var4;
      Object var40;
      label120: {
         int var10000 = llIIllIlIIIIllIIlIIIlIllIllIllIIIllllIIlIIlIlIllIIllIIlIlIIIllllllllIIIIllIIlIIlIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.d();
         var4 = (BlockPos)var1;
         boolean var5 = false;
         Iterable var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
         boolean var7 = false;
         var3 = var10000;
         Iterator var8 = var6.iterator();
         var40 = var8;
         if (var3 == 0) {
            if (!var8.hasNext()) {
               var40 = null;
               break label120;
            }

            var40 = var8.next();
         }

         Object var9 = var40;
         var40 = var8;
         if (var3 == 0) {
            if (!var8.hasNext()) {
               var40 = (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)var9;
               break label120;
            }

            var40 = var9;
         }

         BlockPos var10 = (BlockPos)var40;
         boolean var12 = false;
         double var26 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var4, var10);

         label105:
         while (true) {
            Object var29 = var8.next();
            BlockPos var13 = (BlockPos)var29;
            boolean var15 = false;
            double var32 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var4, var13);
            if (Double.compare(var26, var32) > 0) {
               var9 = var29;
               var26 = var32;
            }

            while (!var8.hasNext()) {
               if (var3 == 0) {
                  var40 = (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)var9;
                  break label105;
               }

               var26 = var32;
            }
         }
      }

      label92: {
         double var53;
         label91: {
            BlockPos var16 = (BlockPos)var40;
            var40 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Vec3 var10001 = var4.getCenter();
            short var10003 = 14834;
            short var10004 = -31716;
            Intrinsics.checkNotNullExpressionValue(var10001, "getCenter(...)");
            double var17 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(var10001, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            if (var16 != null) {
               var42 = var17;
               var53 = 20.0;
               if (var3 != 0) {
                  break label91;
               }

               if (var17 > 20.0) {
                  double var43 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .a(var16, var4);
                  Object var54 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(((Integer)(Object)(var16)));
                  Intrinsics.checkNotNull(var54);
                  var44 = var43
                     + ((Number)var54).doubleValue()
                     + Math.abs(var16.getY() - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y) * 4;
                  break label92;
               }
            }

            var42 = var17;
            var53 = Math.abs(var4.getY() - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y) * 4;
         }

         var44 = var42 + var53;
      }

      Comparable var19;
      label122: {
         Comparable var45 =((Comparable)( var44));
         var4 = (BlockPos)var2;
         var19 = var45;
         boolean var21 = false;
         Iterable var22 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b();
         boolean var23 = false;
         Iterator var24 = var22.iterator();
         var40 = var24;
         if (var3 == 0) {
            if (!var24.hasNext()) {
               var40 = null;
               break label122;
            }

            var40 = (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)var24.next();
         }

         Object var25 = var40;
         var40 = var24;
         if (var3 == 0) {
            if (!var24.hasNext()) {
               var40 = (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)var25;
               break label122;
            }

            var40 = (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)var25;
         }

         BlockPos var27 = (BlockPos)var40;
         boolean var30 = false;
         double var28 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .b(var4, var27);

         label71:
         while (true) {
            Object var31 = var24.next();
            BlockPos var33 = (BlockPos)var31;
            boolean var35 = false;
            double var34 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .b(var4, var33);
            if (Double.compare(var28, var34) > 0) {
               var25 = var31;
               var28 = var34;
            }

            while (!var24.hasNext()) {
               if (var3 == 0) {
                  var40 = (me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl)var25;
                  break label71;
               }

               var28 = var34;
            }
         }
      }

      BlockPos var36 = (BlockPos)var40;
      var40 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var55 = var4.getCenter();
      short var58 = 14835;
      short var59 = -20921;
      Intrinsics.checkNotNullExpressionValue(var55, "getCenter(...)");
      double var50 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a(var55, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      if (var3 == 0) {
         double var37 = var50;
         if (var36 != null) {
            if (var3 != 0) {
               return ComparisonsKt.compareValues(var19, var37 + 20.0);
            }

            if (var37 > 20.0) {
               double var51 = me.octo.client.utils.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var36, var4);
               var55 = (Vec3)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(((Integer)(Object)(var36)));
               Intrinsics.checkNotNull(var55);
               return ComparisonsKt.compareValues(
                  var19,
                  var51
                     + ((Number)(Object)var55).doubleValue()
                     + Math.abs(var36.getY() - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y) * 4
               );
            }
         }

         var50 = var37;
      }

      return ComparisonsKt.compareValues(
         var19, var50 + Math.abs(var4.getY() - this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.y) * 4
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      pxClinit: {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\b\u0096åõåo5\u0088ñë\u0081¸aá\u000eÁÎÜþÂ\u000eÑ¤mn\u0012\b\u0013÷";
      int var4 = "\b\u0096åõåo5\u0088ñë\u0081¸aá\u000eÁÎÜþÂ\u000eÑ¤mn\u0012\b\u0013÷".length();
      char var1 = 14;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label38: {
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var13 = 64;
            var10002 = var10003;
            int var8 = var10004;
            byte var16;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            } else {
               var13 = 64;
               var8 = var10004;
               if (var10004 <= var6) {
                  break label38;
               }

               var10005 = var10003;
               var16 = 64;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                  case 0 -> 105;
                  case 1 -> 29;
                  case 2 -> 126;
                  case 3 -> 70;
                  case 4 -> 65;
                  case 5 -> 20;
                  default -> 84;
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
      int var2 = (var0 ^ 14834) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 119;
            case 1 -> 34;
            case 2 -> 115;
            case 3 -> 28;
            case 4 -> 231;
            case 5 -> 144;
            case 6 -> 59;
            case 7 -> 63;
            case 8 -> 92;
            case 9 -> 31;
            case 10 -> 253;
            case 11 -> 58;
            case 12 -> 43;
            case 13 -> 111;
            case 14 -> 116;
            case 15 -> 41;
            case 16 -> 236;
            case 17 -> 67;
            case 18 -> 211;
            case 19 -> 192;
            case 20 -> 49;
            case 21 -> 185;
            case 22 -> 247;
            case 23 -> 171;
            case 24 -> 172;
            case 25 -> 155;
            case 26 -> 8;
            case 27 -> 221;
            case 28 -> 193;
            case 29 -> 141;
            case 30 -> 5;
            case 31 -> 124;
            case 32 -> 90;
            case 33 -> 214;
            case 34 -> 22;
            case 35 -> 108;
            case 36 -> 94;
            case 37 -> 139;
            case 38 -> 27;
            case 39 -> 25;
            case 40 -> 11;
            case 41 -> 168;
            case 42 -> 163;
            case 43 -> 101;
            case 44 -> 16;
            case 45 -> 237;
            case 46 -> 161;
            case 47 -> 190;
            case 48 -> 73;
            case 49 -> 160;
            case 50 -> 44;
            case 51 -> 39;
            case 52 -> 197;
            case 53 -> 33;
            case 54 -> 175;
            case 55 -> 64;
            case 56 -> 143;
            case 57 -> 177;
            case 58 -> 229;
            case 59 -> 97;
            case 60 -> 85;
            case 61 -> 21;
            case 62 -> 70;
            case 63 -> 226;
            case 64 -> 61;
            case 65 -> 162;
            case 66 -> 136;
            case 67 -> 32;
            case 68 -> 35;
            case 69 -> 166;
            case 70 -> 255;
            case 71 -> 134;
            case 72 -> 102;
            case 73 -> 125;
            case 74 -> 239;
            case 75 -> 76;
            case 76 -> 112;
            case 77 -> 114;
            case 78 -> 122;
            case 79 -> 182;
            case 80 -> 19;
            case 81 -> 203;
            case 82 -> 72;
            case 83 -> 149;
            case 84 -> 10;
            case 85 -> 103;
            case 86 -> 220;
            case 87 -> 105;
            case 88 -> 217;
            case 89 -> 51;
            case 90 -> 189;
            case 91 -> 212;
            case 92 -> 99;
            case 93 -> 0;
            case 94 -> 183;
            case 95 -> 96;
            case 96 -> 104;
            case 97 -> 176;
            case 98 -> 82;
            case 99 -> 3;
            case 100 -> 23;
            case 101 -> 95;
            case 102 -> 181;
            case 103 -> 54;
            case 104 -> 9;
            case 105 -> 240;
            case 106 -> 75;
            case 107 -> 84;
            case 108 -> 98;
            case 109 -> 46;
            case 110 -> 254;
            case 111 -> 249;
            case 112 -> 248;
            case 113 -> 13;
            case 114 -> 242;
            case 115 -> 148;
            case 116 -> 88;
            case 117 -> 146;
            case 118 -> 17;
            case 119 -> 252;
            case 120 -> 15;
            case 121 -> 79;
            case 122 -> 207;
            case 123 -> 89;
            case 124 -> 232;
            case 125 -> 219;
            case 126 -> 129;
            case 127 -> 187;
            case 128 -> 1;
            case 129 -> 36;
            case 130 -> 215;
            case 131 -> 154;
            case 132 -> 140;
            case 133 -> 18;
            case 134 -> 40;
            case 135 -> 132;
            case 136 -> 228;
            case 137 -> 234;
            case 138 -> 235;
            case 139 -> 178;
            case 140 -> 20;
            case 141 -> 138;
            case 142 -> 133;
            case 143 -> 74;
            case 144 -> 169;
            case 145 -> 199;
            case 146 -> 137;
            case 147 -> 200;
            case 148 -> 230;
            case 149 -> 6;
            case 150 -> 78;
            case 151 -> 244;
            case 152 -> 107;
            case 153 -> 198;
            case 154 -> 147;
            case 155 -> 53;
            case 156 -> 37;
            case 157 -> 186;
            case 158 -> 191;
            case 159 -> 55;
            case 160 -> 42;
            case 161 -> 167;
            case 162 -> 241;
            case 163 -> 135;
            case 164 -> 165;
            case 165 -> 159;
            case 166 -> 156;
            case 167 -> 86;
            case 168 -> 174;
            case 169 -> 204;
            case 170 -> 250;
            case 171 -> 100;
            case 172 -> 87;
            case 173 -> 224;
            case 174 -> 52;
            case 175 -> 126;
            case 176 -> 245;
            case 177 -> 164;
            case 178 -> 208;
            case 179 -> 213;
            case 180 -> 225;
            case 181 -> 227;
            case 182 -> 62;
            case 183 -> 120;
            case 184 -> 45;
            case 185 -> 60;
            case 186 -> 81;
            case 187 -> 93;
            case 188 -> 57;
            case 189 -> 80;
            case 190 -> 151;
            case 191 -> 24;
            case 192 -> 205;
            case 193 -> 158;
            case 194 -> 179;
            case 195 -> 50;
            case 196 -> 142;
            case 197 -> 56;
            case 198 -> 130;
            case 199 -> 106;
            case 200 -> 123;
            case 201 -> 14;
            case 202 -> 223;
            case 203 -> 4;
            case 204 -> 117;
            case 205 -> 71;
            case 206 -> 243;
            case 207 -> 48;
            case 208 -> 152;
            case 209 -> 131;
            case 210 -> 202;
            case 211 -> 196;
            case 212 -> 91;
            case 213 -> 38;
            case 214 -> 210;
            case 215 -> 209;
            case 216 -> 173;
            case 217 -> 218;
            case 218 -> 118;
            case 219 -> 29;
            case 220 -> 238;
            case 221 -> 201;
            case 222 -> 109;
            case 223 -> 66;
            case 224 -> 153;
            case 225 -> 251;
            case 226 -> 150;
            case 227 -> 180;
            case 228 -> 2;
            case 229 -> 194;
            case 230 -> 65;
            case 231 -> 121;
            case 232 -> 184;
            case 233 -> 157;
            case 234 -> 206;
            case 235 -> 127;
            case 236 -> 68;
            case 237 -> 128;
            case 238 -> 113;
            case 239 -> 7;
            case 240 -> 77;
            case 241 -> 233;
            case 242 -> 170;
            case 243 -> 12;
            case 244 -> 83;
            case 245 -> 222;
            case 246 -> 26;
            case 247 -> 110;
            case 248 -> 69;
            case 249 -> 246;
            case 250 -> 216;
            case 251 -> 145;
            case 252 -> 30;
            case 253 -> 188;
            case 254 -> 195;
            default -> 47;
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
