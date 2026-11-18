package me.octo.client.utils.player.pathfinder;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class NativePathFinder {
   public static boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = false;
   private static final byte STATE_AIR_OR_UNKNOWN = 0;
   private static final byte STATE_WALKABLE = 1;
   private static final byte STATE_BLOCKED = 2;
   private static final int DEFAULT_MAX_NODES = 4096;
   private static final ConcurrentHashMap<Long, Byte> BYTE_STATES = new ConcurrentHashMap<>();
   private static final ConcurrentHashMap<Long, Short> HEIGHTS = new ConcurrentHashMap<>();
   private static final int[][] CARDINAL_DIRS = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}, {0, 1, 0}, {0, -1, 0}};
   private static final int[][] DIAGONAL_DIRS;

   public static void a(String var0) {
      if (var0 != null && !var0.isBlank()) {
         try {
            System.load(var0);
         } catch (Throwable var2) {
         }
      }

      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = true;
   }

   public static void processChunk(int var0, int var1, ByteBuffer var2) {
      if (var2 != null) {
         ByteBuffer var3 = var2.duplicate();
         int var4 = var3.remaining();
         if (var4 > 0) {
            short var5 = 256;
            int var6 = Math.max(1, var4 / var5);
            int var7 = Math.min(var4, var5 * var6);

            for (int var8 = 0; var8 < var7; var8++) {
               byte var9 = normalizeState(var3.get());
               int var10 = var8 % var5;
               int var11 = var8 / var5;
               int var12 = var10 & 15;
               int var13 = var10 >>> 4 & 15;
               int var14 = (var0 << 4) + var12;
               int var15 = (var1 << 4) + var13;
               setState(var14, var11, var15, var9);
            }
         }
      }
   }

   public static void loadCache(byte[] var0, int var1) {
      if (var0 != null && var0.length != 0) {
         if (var0.length % 9 != 0) {
            ByteBuffer var6 = ByteBuffer.wrap(var0);
            processChunk(0, 0, var6);
         } else {
            ByteBuffer var2 = ByteBuffer.wrap(var0);

            while (var2.remaining() >= 9) {
               long var3 = var2.getLong();
               byte var5 = normalizeState(var2.get());
               BYTE_STATES.put(var3, var5);
            }
         }
      }
   }

   public static void updateChunk(int var0, int var1, int var2, int[] var3, byte[] var4, int var5) {
      if (var4 != null && var5 > 0) {
         int var6 = Math.min(var5, var4.length);
         if (var3 != null) {
            var6 = Math.min(var6, var3.length);
         }

         for (int var7 = 0; var7 < var6; var7++) {
            int var8 = var3 != null ? var3[var7] : var7;
            int var9 = var8 & 15;
            int var10 = var8 >>> 4 & 15;
            int var11 = var8 >>> 8 & 4095;
            int var12 = (var0 << 4) + var9;
            int var13 = (var1 << 4) + var10;
            int var14 = var2 + var11;
            setState(var12, var14, var13, normalizeState(var4[var7]));
         }
      }
   }

   public static void updateHeights(int var0, int var1, short[] var2, int var3) {
      if (var2 != null && var3 > 0) {
         int var4 = Math.min(var3, var2.length);

         for (int var5 = 0; var5 < var4; var5++) {
            int var6 = var5 & 15;
            int var7 = var5 >>> 4 & 15;
            int var8 = (var0 << 4) + var6;
            int var9 = (var1 << 4) + var7;
            HEIGHTS.put(packColumn(var8, var9), var2[var5]);
         }
      }
   }

   public static void clearCache() {
      BYTE_STATES.clear();
      HEIGHTS.clear();
   }

   public static long[] findPath(long var0, long var2, float var4, int var5, boolean var6) {
      if (var0 == var2) {
         return new long[]{var0};
      } else {
         int var7 = var5 > 0 ? var5 : 4096;
         PriorityQueue var8 = new PriorityQueue(Comparator.<NativePathFinder.Node>comparingDouble(var0x -> var0x.f)); // PX-FIX: lambda$findPath$0 定案 (Node.f:double)
         Map<Long, NativePathFinder.Node> var9 = new HashMap<>();
         Set<Long> var10 = new HashSet<>();
         NativePathFinder.Node var11 = new NativePathFinder.Node(var0, null, 0.0, heuristic(var0, var2));
         var8.add(var11);
         var9.put(var0, var11);
         int[][] var12 = var6 ? DIAGONAL_DIRS : CARDINAL_DIRS;
         int var13 = 0;

         while (!var8.isEmpty() && var13++ < var7) {
            NativePathFinder.Node var14 = (NativePathFinder.Node)var8.poll();
            if (var10.add(var14.pos)) {
               if (var14.pos == var2) {
                  return buildPath(var14);
               }

               int var15 = unpackX(var14.pos);
               int var16 = unpackY(var14.pos);
               int var17 = unpackZ(var14.pos);

               for (int[] var21 : var12) {
                  int var22 = var15 + var21[0];
                  int var23 = var16 + var21[1];
                  int var24 = var17 + var21[2];
                  long var25 = pack(var22, var23, var24);
                  if (!var10.contains(var25) && isWalkable(var25)) {
                     double var27 = var14.g + (var21[0] != 0 && var21[2] != 0 ? 1.41421356237 : 1.0);
                     NativePathFinder.Node var29 = (NativePathFinder.Node)var9.get(var25);
                     if (var29 == null || var27 < var29.g) {
                        NativePathFinder.Node var30 = new NativePathFinder.Node(var25, var14, var27, var27 + heuristic(var25, var2));
                        var9.put(var25, var30);
                        var8.add(var30);
                     }
                  }
               }
            }
         }

         return new long[0];
      }
   }

   public static boolean canReach(long var0, long var2, float var4, int var5, boolean var6) {
      long[] var7 = findPath(var0, var2, var4, var5, var6);
      return var7.length > 0 && var7[var7.length - 1] == var2;
   }

   public static byte getByteState(int var0, int var1, int var2) {
      return getByteState(pack(var0, var1, var2));
   }

   public static byte getByteState(long var0) {
      Byte var2 = BYTE_STATES.get(var0);
      return var2 == null ? 0 : var2;
   }

   public static boolean isWalkable(long var0) {
      byte var2 = getByteState(var0);
      return var2 < 2;
   }

   public static boolean canEtherwarpTo(double var0, double var2, double var4, long var6, double var8) {
      double var10 = unpackX(var6) + 0.5;
      double var12 = unpackY(var6) + 0.5;
      double var14 = unpackZ(var6) + 0.5;
      double var16 = var10 - var0;
      double var18 = var12 - var2;
      double var20 = var14 - var4;
      double var22 = Math.sqrt(var16 * var16 + var18 * var18 + var20 * var20);
      if (var8 > 0.0 && var22 > var8) {
         return false;
      } else {
         int var24 = Math.max(1, (int)Math.ceil(var22 * 4.0));

         for (int var25 = 1; var25 <= var24; var25++) {
            double var26 = (double)var25 / var24;
            int var28 = floor(var0 + var16 * var26);
            int var29 = floor(var2 + var18 * var26);
            int var30 = floor(var4 + var20 * var26);
            if (getByteState(var28, var29, var30) >= 2) {
               return false;
            }
         }

         return isWalkable(var6);
      }
   }

   private static byte normalizeState(byte var0) {
      int var1 = var0 & 255;
      if (var1 == 0) {
         return 0;
      } else {
         return (byte)(var1 == 1 ? 1 : 2);
      }
   }

   private static void setState(int var0, int var1, int var2, byte var3) {
      BYTE_STATES.put(pack(var0, var1, var2), var3);
   }

   private static long[] buildPath(NativePathFinder.Node var0) {
      ArrayList var1 = new ArrayList();

      for (NativePathFinder.Node var2 = var0; var2 != null; var2 = var2.parent) {
         var1.add(var2.pos);
      }

      Collections.reverse(var1);
      long[] var4 = new long[var1.size()];

      for (int var3 = 0; var3 < var4.length; var3++) {
         var4[var3] = (Long)var1.get(var3);
      }

      return var4;
   }

   private static double heuristic(long var0, long var2) {
      return Math.abs(unpackX(var0) - unpackX(var2)) + Math.abs(unpackY(var0) - unpackY(var2)) + Math.abs(unpackZ(var0) - unpackZ(var2));
   }

   private static int floor(double var0) {
      int var2 = (int)var0;
      return var0 < var2 ? var2 - 1 : var2;
   }

   private static long packColumn(int var0, int var1) {
      return (long)var0 << 32 ^ var1 & 4294967295L;
   }

   private static long pack(int var0, int var1, int var2) {
      return (var0 & 67108863L) << 38 | (var2 & 67108863L) << 12 | var1 & 4095L;
   }

   private static int unpackX(long var0) {
      return signExtend((int)(var0 >> 38), 26);
   }

   private static int unpackY(long var0) {
      return signExtend((int)(var0 & 4095L), 12);
   }

   private static int unpackZ(long var0) {
      return signExtend((int)(var0 >> 12 & 67108863L), 26);
   }

   private static int signExtend(int var0, int var1) {
      int var2 = 32 - var1;
      return var0 << var2 >> var2;
   }

   static {
      ArrayList var0 = new ArrayList();
      var0.addAll(Arrays.asList(CARDINAL_DIRS));
      var0.add(new int[]{1, 0, 1});
      var0.add(new int[]{1, 0, -1});
      var0.add(new int[]{-1, 0, 1});
      var0.add(new int[]{-1, 0, -1});
      DIAGONAL_DIRS = ((int[][])(Object)(var0.toArray(new int[0][])));
   }

   private static final class Node {
      final long pos;
      final NativePathFinder.Node parent;
      final double g;
      final double f;

      Node(long var1, NativePathFinder.Node var3, double var4, double var6) {
         this.pos = var1;
         this.parent = var3;
         this.g = var4;
         this.f = var6;
      }
   }
}
