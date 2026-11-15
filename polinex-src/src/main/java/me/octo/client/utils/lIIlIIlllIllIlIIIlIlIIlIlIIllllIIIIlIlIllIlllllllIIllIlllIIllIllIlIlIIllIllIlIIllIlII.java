package me.octo.client.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII
   extends lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] c;
   private static String[] d;

   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
   }

   public final double a(@NotNull Vec3 var1) {
      short var10001 = -19679;
      short var10002 = 21423;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return var1.x;
   }

   public final double b(@NotNull Vec3 var1) {
      short var10001 = -19679;
      short var10002 = 21423;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return var1.y;
   }

   public final double c(@NotNull Vec3 var1) {
      short var10001 = -19679;
      short var10002 = 21423;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return var1.z;
   }

   @NotNull
   public final Vec3 d(@NotNull Vec3 var1) {
      short var10001 = -19669;
      short var10002 = -24991;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return new Vec3(-var1.x, -var1.y, -var1.z);
   }

   @NotNull
   public final Vec3 e(@NotNull Vec3 var1) {
      short var10001 = -19679;
      short var10002 = 21423;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return new Vec3(Math.floor(var1.x), Math.floor(var1.y), Math.floor(var1.z));
   }

   @NotNull
   public final Vec3 a(float var1, float var2) {
      double var3 = -((float)Math.cos(-var2 * (float) (Math.PI / 180.0)));
      return new Vec3(
         (float)Math.sin(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI) * var3,
         (float)Math.sin(-var2 * (float) (Math.PI / 180.0)),
         (float)Math.cos(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI) * var3
      );
   }

   @NotNull
   public final Vec3 a(@NotNull Vec3 param1, @NotNull Vec3 param2, @NotNull Vec3 param3, boolean param4) {
      net.minecraft.world.phys.Vec3 var6 = param2.subtract(param1);
      net.minecraft.world.phys.Vec3 var7 = param1.subtract(param3);
      double var8 = var6.dot(var6);
      if (var8 < 1.0E-10) {
         return param1;
      }
      double var10 = -var7.dot(var6) / var8;
      double var11 = param4 ? var10 : java.lang.Math.max(0.0, var10);
      return param1.add(var6.scale(var11));
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 03: aload 1
      // 04: sipush -19675
      // 07: sipush 27711
      // 0a: pop2
      // 0b: ldc "vec1"
      // 0d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 10: astore 5
      // 12: aload 2
      // 13: sipush -19677
      // 16: sipush -9958
      // 19: pop2
      // 1a: ldc "vec2"
      // 1c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 1f: aload 3
      // 20: sipush -19662
      // 23: sipush -12712
      // 26: pop2
      // 27: ldc "from"
      // 29: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 2c: aload 2
      // 2d: aload 1
      // 2e: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 31: dup
      // 32: sipush -19665
      // 35: sipush 15835
      // 38: pop2
      // 39: ldc "subtract(...)"
      // 3b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 3e: astore 6
      // 40: aload 1
      // 41: aload 3
      // 42: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 45: dup
      // 46: sipush -19665
      // 49: sipush 15835
      // 4c: pop2
      // 4d: ldc "subtract(...)"
      // 4f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 52: astore 7
      // 54: aload 6
      // 56: aload 6
      // 58: invokevirtual net/minecraft/world/phys/Vec3.dot (Lnet/minecraft/world/phys/Vec3;)D
      // 5b: dstore 8
      // 5d: dload 8
      // 5f: ldc2_w 1.0E-10
      // 62: aload 5
      // 64: ifnonnull 82
      // 67: dcmpg
      // 68: ifge 78
      // 6b: goto 72
      // 6e: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 71: athrow
      // 72: aload 1
      // 73: areturn
      // 74: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 77: athrow
      // 78: aload 7
      // 7a: aload 6
      // 7c: invokevirtual net/minecraft/world/phys/Vec3.dot (Lnet/minecraft/world/phys/Vec3;)D
      // 7f: dneg
      // 80: dload 8
      // 82: ddiv
      // 83: dstore 10
      // 85: aload 1
      // 86: aload 6
      // 88: iload 4
      // 8a: ifeq 96
      // 8d: dload 10
      // 8f: goto 9c
      // 92: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 95: athrow
      // 96: dconst_0
      // 97: dload 10
      // 99: invokestatic java/lang/Math.max (DD)D
      // 9c: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // 9f: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // a2: dup
      // a3: sipush -19666
      // a6: sipush -8205
      // a9: pop2
      // aa: ldc "add(...)"
      // ac: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // af: areturn
   }

   public final double a(@NotNull Vec3 param1, @NotNull Vec3 param2, @NotNull Vec3 param3, boolean param4, boolean param5) {
        double d;
        Vec3 vec34;
        Vec3 vec35;
        double d2;
        double d3;
        Vec3 vec36;
        Vec3 vec37;
        block16: {
            double d4;
            block17: {
                Vec3 vec38;
                Vec3 vec39;
                Vec3 vec310;
                lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
                block14: {
                    block15: {
                        Intrinsics.checkNotNullParameter((Object)param1, (String)"vec1");
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b();
                        Intrinsics.checkNotNullParameter((Object)param2, (String)"vec2");
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2;
                        try {
                            try {
                                vec310 = param3;
                                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block14;
                                Intrinsics.checkNotNullParameter((Object)vec310, (String)"from");
                                if (!param5) break block15;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                            }
                            vec310 = new Vec3(param1.x, 0.0, param1.z);
                            break block14;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                        }
                    }
                    vec310 = param1;
                }
                Vec3 vec311 = vec310;
                try {
                    vec39 = param5 ? new Vec3(param2.x, 0.0, param2.z) : param2;
                }
                catch (NumberFormatException numberFormatException) {
                    throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                }
                Vec3 vec312 = vec39;
                try {
                    vec38 = param5 ? new Vec3(param3.x, 0.0, param3.z) : param3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                }
                Vec3 vec313 = vec38;
                Vec3 vec314 = vec312.subtract(vec311);
                Intrinsics.checkNotNullExpressionValue((Object)vec314, (String)"subtract(...)");
                vec37 = vec314;
                Vec3 vec315 = vec313.subtract(vec311);
                Intrinsics.checkNotNullExpressionValue((Object)vec315, (String)"subtract(...)");
                vec36 = vec315;
                d4 = vec37.dot(vec37);
                try {
                    try {
                        d3 = d4;
                        d2 = 1.0E-10;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block16;
                        if (!(d3 < d2)) break block17;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                    }
                    return vec36.length();
                }
                catch (NumberFormatException numberFormatException) {
                    throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                }
            }
            d3 = -vec36.dot(vec37);
            d2 = d4;
        }
        double d5 = d3 / d2;
        try {
            vec35 = vec36;
            vec34 = vec37;
            d = param4 ? d5 : Math.max(0.0, d5);
        }
        catch (NumberFormatException numberFormatException) {
            throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
        }
        return vec35.add(vec34.scale(d)).length();
   }

   public final double b(@NotNull Vec3 param1, @NotNull Vec3 param2, @NotNull Vec3 param3, boolean param4, boolean param5) {
        double d;
        Vec3 vec34;
        Vec3 vec35;
        double d2;
        double d3;
        Vec3 vec36;
        Vec3 vec37;
        block16: {
            double d4;
            block17: {
                Vec3 vec38;
                Vec3 vec39;
                Vec3 vec310;
                lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray;
                block14: {
                    block15: {
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b();
                        Intrinsics.checkNotNullParameter((Object)param1, (String)"vec1");
                        lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray = lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray2;
                        try {
                            try {
                                Intrinsics.checkNotNullParameter((Object)param2, (String)"vec2");
                                vec310 = param3;
                                if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block14;
                                Intrinsics.checkNotNullParameter((Object)vec310, (String)"from");
                                if (!param5) break block15;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                            }
                            vec310 = new Vec3(param1.x, 0.0, param1.z);
                            break block14;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                        }
                    }
                    vec310 = param1;
                }
                Vec3 vec311 = vec310;
                try {
                    vec39 = param5 ? new Vec3(param2.x, 0.0, param2.z) : param2;
                }
                catch (NumberFormatException numberFormatException) {
                    throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                }
                Vec3 vec312 = vec39;
                try {
                    vec38 = param5 ? new Vec3(param3.x, 0.0, param3.z) : param3;
                }
                catch (NumberFormatException numberFormatException) {
                    throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                }
                Vec3 vec313 = vec38;
                Vec3 vec314 = vec312.subtract(vec311);
                Intrinsics.checkNotNullExpressionValue((Object)vec314, (String)"subtract(...)");
                vec37 = vec314;
                Vec3 vec315 = vec313.subtract(vec311);
                Intrinsics.checkNotNullExpressionValue((Object)vec315, (String)"subtract(...)");
                vec36 = vec315;
                d4 = vec37.dot(vec37);
                try {
                    try {
                        d3 = d4;
                        d2 = 1.0E-10;
                        if (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIllArray != null) break block16;
                        if (!(d3 < d2)) break block17;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                    }
                    return vec36.lengthSqr();
                }
                catch (NumberFormatException numberFormatException) {
                    throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
                }
            }
            d3 = -vec36.dot(vec37);
            d2 = d4;
        }
        double d5 = d3 / d2;
        try {
            vec35 = vec36;
            vec34 = vec37;
            d = param4 ? d5 : Math.max(0.0, d5);
        }
        catch (NumberFormatException numberFormatException) {
            throw lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a(numberFormatException);
        }
        return vec35.add(vec34.scale(d)).lengthSqr();
   }

   @NotNull
   public final ArrayList<Vec3> a(@NotNull Vec3 param1, @NotNull Vec3 param2, double param3, double param5) {
      Intrinsics.checkNotNullParameter(param1, "from");
      Intrinsics.checkNotNullParameter(param2, "to");
      Vec3 var8 = param2.subtract(param1);
      Intrinsics.checkNotNullExpressionValue(var8, "subtract(...)");
      Vec3 var9 = var8.normalize();
      Intrinsics.checkNotNullExpressionValue(var9, "normalize(...)");
      double var10 = var8.length();
      ArrayList<Vec3> var12 = param5 == 0.0 ? CollectionsKt.arrayListOf(param1) : new ArrayList<>();
      double var13 = 0.0;

      while (true) {
         if (var13 >= var10) {
            var12.add(param2);
            return var12;
         }

         if (var13 / var10 >= param5) {
            var12.add(param1.add(var9.scale(var13)));
         }

         var13 += param3;
      }
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: sipush -19662
      // 04: sipush -12712
      // 07: pop2
      // 08: ldc "from"
      // 0a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0d: invokestatic me/octo/client/utils/IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b ()[Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
      // 10: aload 2
      // 11: sipush -19660
      // 14: sipush -5785
      // 17: pop2
      // 18: ldc "to"
      // 1a: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 1d: aload 2
      // 1e: aload 1
      // 1f: invokevirtual net/minecraft/world/phys/Vec3.subtract (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // 22: dup
      // 23: sipush -19665
      // 26: sipush 15835
      // 29: pop2
      // 2a: ldc "subtract(...)"
      // 2c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 2f: astore 8
      // 31: astore 7
      // 33: aload 8
      // 35: invokevirtual net/minecraft/world/phys/Vec3.normalize ()Lnet/minecraft/world/phys/Vec3;
      // 38: dup
      // 39: sipush -19672
      // 3c: sipush -16206
      // 3f: pop2
      // 40: ldc "normalize(...)"
      // 42: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 45: astore 9
      // 47: aload 8
      // 49: invokevirtual net/minecraft/world/phys/Vec3.length ()D
      // 4c: dstore 10
      // 4e: dload 5
      // 50: dconst_0
      // 51: dcmpg
      // 52: aload 7
      // 54: ifnonnull 62
      // 57: ifne 65
      // 5a: goto 61
      // 5d: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // 60: athrow
      // 61: bipush 1
      // 62: goto 66
      // 65: bipush 0
      // 66: ifeq 7c
      // 69: bipush 1
      // 6a: anewarray 27
      // 6d: astore 13
      // 6f: aload 13
      // 71: bipush 0
      // 72: aload 1
      // 73: aastore
      // 74: aload 13
      // 76: invokestatic kotlin/collections/CollectionsKt.arrayListOf ([Ljava/lang/Object;)Ljava/util/ArrayList;
      // 79: goto 83
      // 7c: new java/util/ArrayList
      // 7f: dup
      // 80: invokespecial java/util/ArrayList.<init> ()V
      // 83: astore 12
      // 85: dconst_0
      // 86: dstore 13
      // 88: nop
      // 89: dload 13
      // 8b: dload 10
      // 8d: dcmpl
      // 8e: iflt a9
      // 91: aload 12
      // 93: aload 2
      // 94: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 97: pop
      // 98: aload 7
      // 9a: ifnonnull e5
      // 9d: aload 7
      // 9f: ifnull ea
      // a2: goto a9
      // a5: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // a8: athrow
      // a9: dload 13
      // ab: dload 10
      // ad: ddiv
      // ae: dload 5
      // b0: aload 7
      // b2: ifnonnull e2
      // b5: goto bc
      // b8: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // bb: athrow
      // bc: dcmpl
      // bd: iflt df
      // c0: goto c7
      // c3: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // c6: athrow
      // c7: aload 12
      // c9: aload 1
      // ca: aload 9
      // cc: dload 13
      // ce: invokevirtual net/minecraft/world/phys/Vec3.scale (D)Lnet/minecraft/world/phys/Vec3;
      // d1: invokevirtual net/minecraft/world/phys/Vec3.add (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
      // d4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // d7: pop
      // d8: goto df
      // db: invokestatic me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.a (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
      // de: athrow
      // df: dload 13
      // e1: dload 3
      // e2: dadd
      // e3: dstore 13
      // e5: aload 7
      // e7: ifnull 88
      // ea: aload 12
      // ec: areturn
   }

   @NotNull
   public final BlockPos f(@NotNull Vec3 var1) {
      short var10001 = -19679;
      short var10002 = 21423;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return new BlockPos((int)Math.floor(var1.x), (int)Math.floor(var1.y), (int)Math.floor(var1.z));
   }

   @NotNull
   public final Vec3 a(@NotNull Vec3 var1, @NotNull Vec3 var2, double var3) {
      short var10001 = -19670;
      short var10002 = -24930;
      Intrinsics.checkNotNullParameter(var1, "vec");
      var10001 = -19674;
      var10002 = -24607;
      Intrinsics.checkNotNullParameter(var2, "direction");
      Vec3 var10000 = var1.add(var2.x * var3, var2.y * var3, var2.z * var3);
      var10002 = -19659;
      short var10003 = -14244;
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @NotNull
   public final Vec3 a(@NotNull Vec3 var1, @NotNull Vec3 var2, int var3) {
      short var10001 = -19670;
      short var10002 = -24930;
      Intrinsics.checkNotNullParameter(var1, "vec");
      var10001 = -19658;
      var10002 = 359;
      Intrinsics.checkNotNullParameter(var2, "direction");
      Vec3 var10000 = var1.add(var2.x * var3, var2.y * var3, var2.z * var3);
      var10002 = -19659;
      short var10003 = -14244;
      Intrinsics.checkNotNullExpressionValue(var10000, "add(...)");
      return var10000;
   }

   @NotNull
   public final Matrix4f a(@NotNull Matrix4f var1, @NotNull Vec3 var2) {
      short var10001 = -19679;
      short var10002 = 21423;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      var10001 = -19678;
      var10002 = -27009;
      Intrinsics.checkNotNullParameter(var2, "vec");
      Matrix4f var10000 = var1.translate((float)var2.x, (float)var2.y, (float)var2.z);
      var10002 = -19671;
      short var10003 = 18201;
      Intrinsics.checkNotNullExpressionValue(var10000, "translate(...)");
      return var10000;
   }

   @NotNull
   public final Vec3 a(@NotNull String var1) {
      Collection var19 = null; // PX-FIX
      short var10001 = -19676;
      short var10002 = 8589;
      Intrinsics.checkNotNullParameter(var1, "text");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.b();
      CharSequence var22 = var1;
      String[] var4 = new String[]{","};
      Iterable var16 = (StringsKt.split(var22, var4, false, 0));
      boolean var5 = false;
      Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var16, 10));
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var2 = var10000;
      boolean var8 = false;
      Iterator var9 = var16.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            var19 = var7;
            String var11 = (String)var10;
            if (var2 != null) {
               break;
            }

            boolean var12 = false;
            var7.add(StringsKt.trim(var11).toString());
            if (var2 == null) {
               continue;
            }
         }

         var19 = var7;
         break;
      }

      List var3 = (List)var19;

      label47: {
         try {
            if (var2 != null) {
               return new Vec3(0.0, 0.0, 0.0);
            }

            if (var3.size() >= 3) {
               break label47;
            }
         } catch (NumberFormatException var15) {
            throw (RuntimeException)a(var15);
         }

         short var20 = -19680;
         var10001 = 18653;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Insufficient coordinates in string"
         );
         return new Vec3(0.0, 0.0, 0.0);
      }

      try {
         double var17 = Double.parseDouble((String)var3.get(0));
         double var6 = Double.parseDouble((String)var3.get(1));
         double var18 = Double.parseDouble((String)var3.get(2));
         return new Vec3(var17, var6, var18);
      } catch (NumberFormatException var14) {
         short var21 = -19667;
         var10001 = -21615;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Invalid coordinate format in string"
         );
         return new Vec3(0.0, 0.0, 0.0);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[22];
      int var3 = 0;
      String var2 = "\u009f\u0083$jM½â\u0007\u0005\u009c\u0016Ãk\tA\u0092\u001aÆ\u0089\u000eCÝ<\u0004`>\u007f\u008a\u0004(]/£\u0004\u001eZ°\u0005\u0003Q{Y\u0006»\u0007\fÆ\u0002É\"\u0080\u0002«#\u009b²¤\u0016Ç\u0000g(\u0004\u0088B\u000f\u0010²Â»i){\u00043aG\\±¥ñ\u0092ù\u001a\rË¿®í\u001cMÈ\u0019@_¾»~\bÞ'Z\u0091\u0018ZÒ\u0000#7>X°JYØÆî;\b\u0002\u008c\u0001\u009e{¬òÚ\u009a\u0004\u0002\u0011µ#N\u009c\u0097~\\7Qà\u0013+\u0004~ë¼0\u0006<!ü\u0002\u001cQ\u000356Õ\u000eÌ\u008cªvþj·Q PF\u009cfE\u000eÐóc$¤C¤zËú+ÉËï\u0004·+\u0085+\tt\u0083¼ä]JÙUo\b\u0088i\u0090XAcù'\u0002{ö";
      int var4 = "\u009f\u0083$jM½â\u0007\u0005\u009c\u0016Ãk\tA\u0092\u001aÆ\u0089\u000eCÝ<\u0004`>\u007f\u008a\u0004(]/£\u0004\u001eZ°\u0005\u0003Q{Y\u0006»\u0007\fÆ\u0002É\"\u0080\u0002«#\u009b²¤\u0016Ç\u0000g(\u0004\u0088B\u000f\u0010²Â»i){\u00043aG\\±¥ñ\u0092ù\u001a\rË¿®í\u001cMÈ\u0019@_¾»~\bÞ'Z\u0091\u0018ZÒ\u0000#7>X°JYØÆî;\b\u0002\u008c\u0001\u009e{¬òÚ\u009a\u0004\u0002\u0011µ#N\u009c\u0097~\\7Qà\u0013+\u0004~ë¼0\u0006<!ü\u0002\u001cQ\u000356Õ\u000eÌ\u008cªvþj·Q PF\u009cfE\u000eÐóc$¤C¤zËú+ÉËï\u0004·+\u0085+\tt\u0083¼ä]JÙUo\b\u0088i\u0090XAcù'\u0002{ö"
         .length();
      char var1 = '\r';
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
                     case 0 -> 26;
                     case 1 -> 10;
                     case 2 -> 27;
                     case 3 -> 4;
                     case 4 -> 6;
                     case 5 -> 27;
                     default -> 36;
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
                     c = var5;
                     d = new String[22];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
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

                  var2 = "uùóë\u0004\u0099ën©";
                  var4 = "uùóë\u0004\u0099ën©".length();
                  var1 = 4;
                  var8 = -1;
            }

            var10000 = 109;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -19673) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 95;
            case 1 -> 11;
            case 2 -> 166;
            case 3 -> 138;
            case 4 -> 29;
            case 5 -> 40;
            case 6 -> 85;
            case 7 -> 34;
            case 8 -> 233;
            case 9 -> 188;
            case 10 -> 33;
            case 11 -> 177;
            case 12 -> 8;
            case 13 -> 57;
            case 14 -> 93;
            case 15 -> 122;
            case 16 -> 53;
            case 17 -> 26;
            case 18 -> 48;
            case 19 -> 109;
            case 20 -> 186;
            case 21 -> 219;
            case 22 -> 66;
            case 23 -> 198;
            case 24 -> 86;
            case 25 -> 47;
            case 26 -> 87;
            case 27 -> 63;
            case 28 -> 212;
            case 29 -> 104;
            case 30 -> 52;
            case 31 -> 17;
            case 32 -> 69;
            case 33 -> 98;
            case 34 -> 39;
            case 35 -> 245;
            case 36 -> 253;
            case 37 -> 36;
            case 38 -> 187;
            case 39 -> 125;
            case 40 -> 144;
            case 41 -> 150;
            case 42 -> 194;
            case 43 -> 24;
            case 44 -> 14;
            case 45 -> 157;
            case 46 -> 244;
            case 47 -> 223;
            case 48 -> 50;
            case 49 -> 226;
            case 50 -> 214;
            case 51 -> 60;
            case 52 -> 18;
            case 53 -> 31;
            case 54 -> 38;
            case 55 -> 113;
            case 56 -> 204;
            case 57 -> 136;
            case 58 -> 183;
            case 59 -> 80;
            case 60 -> 58;
            case 61 -> 42;
            case 62 -> 10;
            case 63 -> 59;
            case 64 -> 62;
            case 65 -> 77;
            case 66 -> 180;
            case 67 -> 135;
            case 68 -> 236;
            case 69 -> 139;
            case 70 -> 37;
            case 71 -> 23;
            case 72 -> 44;
            case 73 -> 209;
            case 74 -> 94;
            case 75 -> 143;
            case 76 -> 5;
            case 77 -> 164;
            case 78 -> 64;
            case 79 -> 190;
            case 80 -> 221;
            case 81 -> 27;
            case 82 -> 78;
            case 83 -> 224;
            case 84 -> 15;
            case 85 -> 182;
            case 86 -> 250;
            case 87 -> 68;
            case 88 -> 43;
            case 89 -> 168;
            case 90 -> 192;
            case 91 -> 205;
            case 92 -> 41;
            case 93 -> 54;
            case 94 -> 235;
            case 95 -> 21;
            case 96 -> 140;
            case 97 -> 127;
            case 98 -> 211;
            case 99 -> 240;
            case 100 -> 163;
            case 101 -> 176;
            case 102 -> 75;
            case 103 -> 246;
            case 104 -> 181;
            case 105 -> 174;
            case 106 -> 79;
            case 107 -> 35;
            case 108 -> 9;
            case 109 -> 216;
            case 110 -> 200;
            case 111 -> 230;
            case 112 -> 159;
            case 113 -> 117;
            case 114 -> 175;
            case 115 -> 89;
            case 116 -> 179;
            case 117 -> 189;
            case 118 -> 155;
            case 119 -> 195;
            case 120 -> 251;
            case 121 -> 81;
            case 122 -> 239;
            case 123 -> 22;
            case 124 -> 12;
            case 125 -> 116;
            case 126 -> 228;
            case 127 -> 7;
            case 128 -> 247;
            case 129 -> 92;
            case 130 -> 105;
            case 131 -> 232;
            case 132 -> 76;
            case 133 -> 169;
            case 134 -> 114;
            case 135 -> 242;
            case 136 -> 123;
            case 137 -> 28;
            case 138 -> 213;
            case 139 -> 70;
            case 140 -> 90;
            case 141 -> 141;
            case 142 -> 184;
            case 143 -> 148;
            case 144 -> 126;
            case 145 -> 102;
            case 146 -> 243;
            case 147 -> 55;
            case 148 -> 100;
            case 149 -> 147;
            case 150 -> 238;
            case 151 -> 4;
            case 152 -> 49;
            case 153 -> 210;
            case 154 -> 193;
            case 155 -> 30;
            case 156 -> 185;
            case 157 -> 121;
            case 158 -> 20;
            case 159 -> 124;
            case 160 -> 137;
            case 161 -> 82;
            case 162 -> 110;
            case 163 -> 74;
            case 164 -> 151;
            case 165 -> 3;
            case 166 -> 106;
            case 167 -> 215;
            case 168 -> 118;
            case 169 -> 234;
            case 170 -> 255;
            case 171 -> 162;
            case 172 -> 248;
            case 173 -> 229;
            case 174 -> 0;
            case 175 -> 191;
            case 176 -> 156;
            case 177 -> 25;
            case 178 -> 67;
            case 179 -> 111;
            case 180 -> 51;
            case 181 -> 112;
            case 182 -> 172;
            case 183 -> 206;
            case 184 -> 91;
            case 185 -> 19;
            case 186 -> 161;
            case 187 -> 83;
            case 188 -> 101;
            case 189 -> 173;
            case 190 -> 1;
            case 191 -> 231;
            case 192 -> 199;
            case 193 -> 145;
            case 194 -> 154;
            case 195 -> 6;
            case 196 -> 72;
            case 197 -> 227;
            case 198 -> 46;
            case 199 -> 56;
            case 200 -> 241;
            case 201 -> 165;
            case 202 -> 218;
            case 203 -> 61;
            case 204 -> 203;
            case 205 -> 254;
            case 206 -> 171;
            case 207 -> 153;
            case 208 -> 84;
            case 209 -> 225;
            case 210 -> 201;
            case 211 -> 178;
            case 212 -> 88;
            case 213 -> 149;
            case 214 -> 119;
            case 215 -> 134;
            case 216 -> 128;
            case 217 -> 217;
            case 218 -> 170;
            case 219 -> 130;
            case 220 -> 131;
            case 221 -> 16;
            case 222 -> 220;
            case 223 -> 13;
            case 224 -> 133;
            case 225 -> 160;
            case 226 -> 97;
            case 227 -> 107;
            case 228 -> 73;
            case 229 -> 115;
            case 230 -> 65;
            case 231 -> 71;
            case 232 -> 196;
            case 233 -> 132;
            case 234 -> 252;
            case 235 -> 129;
            case 236 -> 142;
            case 237 -> 2;
            case 238 -> 208;
            case 239 -> 103;
            case 240 -> 197;
            case 241 -> 99;
            case 242 -> 96;
            case 243 -> 237;
            case 244 -> 120;
            case 245 -> 45;
            case 246 -> 222;
            case 247 -> 249;
            case 248 -> 167;
            case 249 -> 152;
            case 250 -> 108;
            case 251 -> 158;
            case 252 -> 32;
            case 253 -> 202;
            case 254 -> 146;
            default -> 207;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static Vec3 a(lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII self, float var1, float var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         Minecraft var5 = self.a();
         var1 = var5.player != null ? var5.player.getYRot() : 0.0F;
      }

      if ((var3 & 2) != 0) {
         Minecraft var6 = self.a();
         var2 = var6.player != null ? var6.player.getXRot() : 0.0F;
      }

      return self.a(var1, var2);
   }

   public static Vec3 a(lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII self, Vec3 var1, Vec3 var2, Vec3 var3, boolean var4, int var5, Object var6) {
      if ((var5 & 8) != 0) {
         var4 = true;
      }

      return self.a(var1, var2, var3, var4);
   }

   public static double a(lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII self, Vec3 var1, Vec3 var2, Vec3 var3, boolean var4, boolean var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var4 = true;
      }

      if ((var6 & 16) != 0) {
         var5 = false;
      }

      return self.a(var1, var2, var3, var4, var5);
   }

   public static double b(lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII self, Vec3 var1, Vec3 var2, Vec3 var3, boolean var4, boolean var5, int var6, Object var7) {
      if ((var6 & 8) != 0) {
         var4 = true;
      }

      if ((var6 & 16) != 0) {
         var5 = false;
      }

      return self.b(var1, var2, var3, var4, var5);
   }

   public static ArrayList<Vec3> a(lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII self, Vec3 var1, Vec3 var2, double var3, double var4, int var5, Object var6) {
      if ((var5 & 4) != 0) {
         var3 = 0.1D;
      }

      if ((var5 & 8) != 0) {
         var4 = 0.0D;
      }

      return self.a(var1, var2, var3, var4);
   }
}
