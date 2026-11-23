package me.octo.client;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI
public final class llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII
   implements lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl {
   
   
   
   @NotNull
   private final List<Pair<Integer, Integer>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final HashMap<llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, ByteBuffer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] a;
   private static String[] b;

   public llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII() {
      Pair[] var1 = new Pair[]{
         new Pair(0, 1), new Pair(0, -1), new Pair(1, 0), new Pair(-1, 0), new Pair(1, 1), new Pair(-1, -1), new Pair(-1, 1), new Pair(1, -1)
      };
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = CollectionsKt.listOf(var1);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new HashMap<>();
   }

   @NotNull
   @Override
   public IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI a() {
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      short var10001 = -26731;
      short var10002 = 23790;
      var10002 = -26739;
      short var10003 = -2980;
      var10000 = var10000.a("generate-cache-vtwo", "Generate world cache for pathfinding");
      IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a();
      var10002 = -26741;
      var10003 = 16079;
      var10003 = -26749;
      short var10004 = 15556;
      return var10000.a(var2.a("make", "Makes the cache files").a(llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII::a).a())
         .b(llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII::a)
         .a();
   }

   private final void b() {
      String[] guard = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      File cacheRoot = new File(
         me.octo.client.llIllIIllIlIlIIIIllllIlIIIlIllllIlIIIIIIlIllIIIIIllIIlllIIlIlIlIIlllIIIIIIIllIIllIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(),
         "pathfind-cache-v2"
      );
      this.polinex$generateCacheFiles(cacheRoot, guard);
   }

   private final void polinex$generateCacheFiles(File cacheRoot, String[] guard) {
      if (guard != null && !cacheRoot.exists()) {
         return;
      }

      File[] dimensionDirectories = cacheRoot.listFiles(llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII::b);
      if (dimensionDirectories == null && guard == null) {
         int ignored = dimensionDirectories.length;
      }
      List<String> dimensionNames;
      if (dimensionDirectories == null) {
         dimensionNames = CollectionsKt.emptyList();
      } else {
         ArrayList<String> names = new ArrayList<>(dimensionDirectories.length);
         for (File directory : dimensionDirectories) {
            names.add(directory.getName());
         }
         dimensionNames = names;
      }

      for (String dimensionName : dimensionNames) {
         File dimensionDirectory = new File(cacheRoot, dimensionName);
         File[] chunkFiles = dimensionDirectory.listFiles(llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII::c);
         if (chunkFiles == null && guard != null) {
            continue;
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         for (File chunkFile : chunkFiles) {
            Intrinsics.checkNotNull(chunkFile);
            this.a(chunkFile);
         }

         ArrayList<ByteBuffer> mergedChunks = new ArrayList<>();
         for (var entry : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.entrySet()) {
            if (guard == null) {
               continue;
            }
            ByteBuffer merged = this.a(entry.getKey(), entry.getValue());
            if (merged != null) {
               mergedChunks.add(merged);
            }
         }

         if (mergedChunks.isEmpty()) {
            continue;
         }

         File aggregateCache = new File(cacheRoot, dimensionName + ".dat");
         try (FileChannel channel = FileChannel.open(
            aggregateCache.toPath(),
            StandardOpenOption.CREATE,
            StandardOpenOption.WRITE,
            StandardOpenOption.TRUNCATE_EXISTING
         )) {
            for (ByteBuffer merged : mergedChunks) {
               while (merged.hasRemaining()) {
                  channel.write(merged);
               }
            }
         } catch (IOException exception) {
            rethrowIoException(exception);
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
            "Generated: " + dimensionName + ".dat"
         );
      }
   }

   private final void a(File var1) {
      String[] var10000 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      Path var10001 = var1.toPath();
      OpenOption[] var3 = new OpenOption[]{StandardOpenOption.READ};
      FileChannel var17;

      try {
         var17 = FileChannel.open(var10001, var3);
      }
      catch (java.io.IOException iOException) {
         throw new RuntimeException(iOException);
      }
      String[] var2 = var10000;
      Throwable var4 = null;

      try {
         FileChannel var5 = var17;
         boolean var6 = false;
         ByteBuffer var7 = ByteBuffer.allocateDirect(65544);

         label53: {
            while (var7.hasRemaining()) {
               try {
                  var5.read(var7);
                  if (var2 == null) {
                     break label53;
                  }

                  if (var2 == null) {
                     break;
                  }
               } catch (Throwable var14) {
                  throw (RuntimeException)a(var14);
               }
            }

            var7.flip();
         }

         int var8 = var7.getInt();
         int var9 = var7.getInt();
         ByteBuffer var10 = var7.slice();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .put(
               new llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var8, var9
               ),
               var10
            );
         Unit var18 = Unit.INSTANCE;
      } catch (Throwable var15) {
         var4 = var15;
         throw var15;
      } finally {
         CloseableKt.closeFinally(var17, var4);
      }
   }

   private final ByteBuffer a(
      llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll chunk,
      ByteBuffer states
   ) {
      String[] guard = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      for (
         Pair<Integer, Integer> offset : this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      ) {
         int x = chunk.a() + ((Number)offset.getFirst()).intValue();
         int z = chunk.b() + ((Number)offset.getSecond()).intValue();
         if (!this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(
            new llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(x, z)
         )) {
            return null;
         }
      }

      ArrayList<Pair> activeStates = new ArrayList<>();
      int stateIndex = 0;
      for (int y = 0; y < 256; y++) {
         for (int z = 0; z < 16; z++) {
            for (int x = 0; x < 16; x++) {
               byte state = states.get(stateIndex);
               if (state != 0 && this.a(chunk, states, x, y, z)) {
                  activeStates.add(
                     TuplesKt.to(
                        me.octo.client.utils.PXInlineClasses.boxUShort((short)stateIndex),
                        me.octo.client.utils.PXInlineClasses.boxUByte(state)
                     )
                  );
               }
               stateIndex++;
            }
         }
      }

      if (guard != null && activeStates.isEmpty()) {
         return null;
      }

      ByteBuffer result = ByteBuffer.allocateDirect(12 + activeStates.size() * 3).order(ByteOrder.nativeOrder());
      result.putInt(chunk.a());
      result.putInt(chunk.b());
      result.putInt(activeStates.size());
      for (Pair activeState : activeStates) {
         short index = me.octo.client.utils.PXInlineClasses.unboxUShort((UShort)activeState.getFirst());
         byte state = me.octo.client.utils.PXInlineClasses.unboxUByte((UByte)activeState.getSecond());
         result.putShort(index);
         result.put(state);
      }
      result.flip();
      return result;
   }

   private final boolean a(
      llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      ByteBuffer var2,
      int var3,
      int var4,
      int var5
   ) {
      int var11 = 0; // PX-FIX
      String[] var6;
      int var10000;
      var6 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      var10000 = var4;
      label101:
      if (var6 != null) {
         if (var4 >= 2) {
            var10000 = this.b(var1, var2, var3, var4 - 1, var5);
            if (var6 == null) {
               break label101;
            }

            if (var10000 != 0) {
               var10000 = this.b(var1, var2, var3, var4 - 2, var5);
               if (var6 == null) {
                  break label101;
               }

               if (var10000 == 0) {
                  return true;
               }
            }
         }

         var10000 = -1;
      }

      int var7 = var10000;

      label91:
      while (true) {
         var10000 = var7;

         label87:
         while (true) {
            if (var10000 < 2) {
               var11 = -1;
               if (var6 == null) {
                  break;
               }

               int var8 = -1;

               label82:
               do {
                  var10000 = var8;

                  label79:
                  while (true) {
                     if (var10000 >= 2) {
                        break label82;
                     }

                     var10000 = -1;
                     if (var6 == null) {
                        continue label87;
                     }

                     int var9 = -1;

                     while (true) {
                        if (var9 >= 2) {
                           break label79;
                        }

                        var10000 = var7;
                        if (var6 == null) {
                           break;
                        }

                        label109: {
                           label73:
                           if (var6 != null) {
                              if (var7 == 0) {
                                 var10000 = var8;
                                 if (var6 == null) {
                                    break label73;
                                 }

                                 if (var8 == 0) {
                                    var10000 = var9;
                                    if (var6 == null) {
                                       break label73;
                                    }

                                    if (var9 == 0) {
                                       break label109;
                                    }
                                 }
                              }

                              var10000 = this.b(var1, var2, var3 + var7, var4 + var8, var5 + var9);
                           }

                           if (var6 == null) {
                              return (var10000 != 0);
                           }

                           if (var10000 == 0) {
                              return (1 != 0);
                           }
                        }

                        var9++;
                        if (var6 == null) {
                           break label79;
                        }
                     }
                  }

                  var8++;
               } while (var6 != null);

               var7++;
               if (var6 != null) {
                  continue label91;
               }
            }

            var11 = 0;
            break;
         }

         return (var11 != 0);
      }
   }

   private final byte b(
      llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      ByteBuffer var2,
      int var3,
      int var4,
      int var5
   ) {
      String[] var6;
      int var10000;
      label56: {
         var6 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         var10000 = var3;
         if (var6 != null) {
            if (var3 < 0) {
               var10000 = -1;
               break label56;
            }

            var10000 = var3;
         }

         if (var6 != null) {
            var10000 = var10000 >= 16 ? 1 : 0;
         }
      }

      int var7;
      label50: {
         var7 = var10000;
         var10000 = var5;
         if (var6 != null) {
            if (var5 < 0) {
               var10000 = -1;
               break label50;
            }

            var10000 = var5;
         }

         if (var6 != null) {
            var10000 = var10000 >= 16 ? 1 : 0;
         }
      }

      int var8;
      int var9;
      int var10;
      label59: {
         var8 = var10000;
         var9 = (var3 % 16 + 16) % 16;
         var10 = (var5 % 16 + 16) % 16;
         var10000 = var7;
         if (var6 != null) {
            if (var7 != 0) {
               break label59;
            }

            var10000 = var8;
         }

         if (var6 == null) {
            return (byte)var10000;
         }

         if (var10000 == 0) {
            return var2.get(
               me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var9, var4, var10)
            );
         }
      }

      llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = new llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1.a() + var7, var1.b() + var8
      );
      Object var14 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var11);
      Intrinsics.checkNotNull(var14);
      return ((ByteBuffer)var14)
         .get(
            me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var9, var4, var10)
         );
   }

   private static final Unit a(
      llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII var0,
      llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var1
   ) {
      short var10001 = -26737;
      short var10002 = -27346;
      Intrinsics.checkNotNullParameter(var1, "<unused var>");
      var0.b();
      return Unit.INSTANCE;
   }

   private static final Unit a(llIllIllIlllllIIlIlllIlIllIllIIlllllIlIlIIlIIlllIlIIlIllIlIIIIIIlllIlIIllIIlIIllllIII var0) {
      String[] var1 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      short var10001 = -26751;
      short var10002 = -26262;
      Intrinsics.checkNotNullParameter(var0, "<unused var>");
      me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10000 = me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      short var4 = ((short)((me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .a()) ? 1 : 0));
      if (var1 != null) {
         var4 = (((short)((var4 == 0) ? 1 : 0)));
      }

      label23: {
         var10000.a(var4 != 0);
         if (var1 != null) {
            if (!me.octo.client.utils.player.pathfinder.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a()) {
               break label23;
            }

            short var2 = -26744;
            var4 = 5400;
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Chunk saving is now enabled");
         }

         if (var1 != null) {
            return Unit.INSTANCE;
         }
      }

      short var3 = -26742;
      var4 = -20020;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("Chunk saving is now disabled");
      return Unit.INSTANCE;
   }

   private static final boolean b(File var0) {
      return var0.isDirectory();
   }

   private static final boolean c(File var0) {
      String[] var1 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
      boolean var10000 = var0.isFile();
      if (var1 != null) {
         if (!var10000) {
            return false;
         }

         Intrinsics.checkNotNull(var0);
         String var2 = FilesKt.getExtension(var0);
         short var10001 = -26752;
         short var10002 = -2266;
         var10000 = Intrinsics.areEqual(var2, "dat");
      }

      return var1 == null ? var10000 : var10000;
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> void rethrowIoException(IOException exception) throws T {
      throw (T)exception;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[17];
      int var3 = 0;
      String var2 = "\u001aÁ¼\u009f\rN3\u009dÕ\u0081ø6\u0087p\u00976\u00ad\u000e\tö¦pRË\u0094^G\u0015\u0004\u0013\u008b\u009dÖ\f\u0083ñÐ«PÁWÁh\büè\u0003©\u0095Ü\u0015\u0012þ¸ÌøzR\u0013ÉR¨\u0095s³\u0014/X\u0093WY\\\r\u000e¡\u0095\u0087\u0080²\u0016Ît¾¶\u0088\u001e$Ì\u000e-Vîh±5ðmnÜ)çôk®:j',[ÒÆÃ\u000e7ïÓ}\u0003PÚÊùj\t\u0090O¼oR3m³s\f®ÆuMä\u001dÁZº{¦\u0086\u0011\u001cyü1\u0099 Ó4èxÏùÖq\u0082\u008d\u009f\u000bÇñL©Â\u00974Ê\u0004ßs\u001b\u0085å\u009b\u008cY\u0018zV8\u009bêÊÔ\u009fÝ\u008b½\u0001ù\u0088çKHÝ\u0013jí\u0004ûÎ¡Ê";
      int var4 = "\u001aÁ¼\u009f\rN3\u009dÕ\u0081ø6\u0087p\u00976\u00ad\u000e\tö¦pRË\u0094^G\u0015\u0004\u0013\u008b\u009dÖ\f\u0083ñÐ«PÁWÁh\büè\u0003©\u0095Ü\u0015\u0012þ¸ÌøzR\u0013ÉR¨\u0095s³\u0014/X\u0093WY\\\r\u000e¡\u0095\u0087\u0080²\u0016Ît¾¶\u0088\u001e$Ì\u000e-Vîh±5ðmnÜ)çôk®:j',[ÒÆÃ\u000e7ïÓ}\u0003PÚÊùj\t\u0090O¼oR3m³s\f®ÆuMä\u001dÁZº{¦\u0086\u0011\u001cyü1\u0099 Ó4èxÏùÖq\u0082\u008d\u009f\u000bÇñL©Â\u00974Ê\u0004ßs\u001b\u0085å\u009b\u008cY\u0018zV8\u009bêÊÔ\u009fÝ\u008b½\u0001ù\u0088çKHÝ\u0013jí\u0004ûÎ¡Ê"
         .length();
      char var1 = 4;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 20;
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
                     case 0 -> 5;
                     case 1 -> 77;
                     case 2 -> 67;
                     case 3 -> 4;
                     case 4 -> 100;
                     case 5 -> 28;
                     default -> 62;
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
                     b = new String[17];
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

                  var2 = "ä¢(û°iØçó2\f`\u0097U*MÜFJÿ\u000f=ùhä)B\u001b\u0013'\u009bë{©RÆí\u008cýÜÖ+\u000b¢]BÀØ";
                  var4 = "ä¢(û°iØçó2\f`\u0097U*MÜFJÿ\u000f=ùhä)B\u001b\u0013'\u009bë{©RÆí\u008cýÜÖ+\u000b¢]BÀØ".length();
                  var1 = 28;
                  var8 = -1;
            }

            var10000 = 8;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -26747) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 89;
            case 1 -> 92;
            case 2 -> 187;
            case 3 -> 118;
            case 4 -> 223;
            case 5 -> 162;
            case 6 -> 101;
            case 7 -> 167;
            case 8 -> 169;
            case 9 -> 4;
            case 10 -> 164;
            case 11 -> 60;
            case 12 -> 165;
            case 13 -> 178;
            case 14 -> 119;
            case 15 -> 73;
            case 16 -> 154;
            case 17 -> 150;
            case 18 -> 180;
            case 19 -> 53;
            case 20 -> 207;
            case 21 -> 93;
            case 22 -> 105;
            case 23 -> 51;
            case 24 -> 222;
            case 25 -> 136;
            case 26 -> 62;
            case 27 -> 157;
            case 28 -> 247;
            case 29 -> 168;
            case 30 -> 16;
            case 31 -> 237;
            case 32 -> 145;
            case 33 -> 78;
            case 34 -> 141;
            case 35 -> 2;
            case 36 -> 230;
            case 37 -> 205;
            case 38 -> 55;
            case 39 -> 250;
            case 40 -> 213;
            case 41 -> 160;
            case 42 -> 161;
            case 43 -> 127;
            case 44 -> 174;
            case 45 -> 182;
            case 46 -> 70;
            case 47 -> 33;
            case 48 -> 216;
            case 49 -> 224;
            case 50 -> 139;
            case 51 -> 116;
            case 52 -> 142;
            case 53 -> 210;
            case 54 -> 251;
            case 55 -> 64;
            case 56 -> 54;
            case 57 -> 233;
            case 58 -> 106;
            case 59 -> 239;
            case 60 -> 18;
            case 61 -> 149;
            case 62 -> 58;
            case 63 -> 166;
            case 64 -> 114;
            case 65 -> 3;
            case 66 -> 229;
            case 67 -> 87;
            case 68 -> 23;
            case 69 -> 190;
            case 70 -> 125;
            case 71 -> 231;
            case 72 -> 153;
            case 73 -> 48;
            case 74 -> 158;
            case 75 -> 115;
            case 76 -> 232;
            case 77 -> 50;
            case 78 -> 198;
            case 79 -> 91;
            case 80 -> 197;
            case 81 -> 1;
            case 82 -> 82;
            case 83 -> 113;
            case 84 -> 151;
            case 85 -> 246;
            case 86 -> 225;
            case 87 -> 38;
            case 88 -> 10;
            case 89 -> 144;
            case 90 -> 217;
            case 91 -> 24;
            case 92 -> 98;
            case 93 -> 204;
            case 94 -> 177;
            case 95 -> 25;
            case 96 -> 172;
            case 97 -> 40;
            case 98 -> 159;
            case 99 -> 20;
            case 100 -> 137;
            case 101 -> 47;
            case 102 -> 68;
            case 103 -> 206;
            case 104 -> 132;
            case 105 -> 63;
            case 106 -> 39;
            case 107 -> 126;
            case 108 -> 234;
            case 109 -> 112;
            case 110 -> 124;
            case 111 -> 71;
            case 112 -> 100;
            case 113 -> 104;
            case 114 -> 0;
            case 115 -> 26;
            case 116 -> 195;
            case 117 -> 134;
            case 118 -> 148;
            case 119 -> 123;
            case 120 -> 192;
            case 121 -> 235;
            case 122 -> 14;
            case 123 -> 240;
            case 124 -> 41;
            case 125 -> 156;
            case 126 -> 97;
            case 127 -> 219;
            case 128 -> 90;
            case 129 -> 75;
            case 130 -> 191;
            case 131 -> 179;
            case 132 -> 27;
            case 133 -> 184;
            case 134 -> 45;
            case 135 -> 185;
            case 136 -> 52;
            case 137 -> 202;
            case 138 -> 19;
            case 139 -> 214;
            case 140 -> 111;
            case 141 -> 121;
            case 142 -> 120;
            case 143 -> 110;
            case 144 -> 117;
            case 145 -> 199;
            case 146 -> 188;
            case 147 -> 135;
            case 148 -> 65;
            case 149 -> 163;
            case 150 -> 200;
            case 151 -> 8;
            case 152 -> 173;
            case 153 -> 238;
            case 154 -> 143;
            case 155 -> 95;
            case 156 -> 108;
            case 157 -> 133;
            case 158 -> 84;
            case 159 -> 130;
            case 160 -> 99;
            case 161 -> 253;
            case 162 -> 30;
            case 163 -> 22;
            case 164 -> 81;
            case 165 -> 131;
            case 166 -> 69;
            case 167 -> 29;
            case 168 -> 252;
            case 169 -> 42;
            case 170 -> 186;
            case 171 -> 170;
            case 172 -> 228;
            case 173 -> 32;
            case 174 -> 208;
            case 175 -> 245;
            case 176 -> 241;
            case 177 -> 86;
            case 178 -> 226;
            case 179 -> 109;
            case 180 -> 255;
            case 181 -> 76;
            case 182 -> 249;
            case 183 -> 15;
            case 184 -> 74;
            case 185 -> 7;
            case 186 -> 175;
            case 187 -> 102;
            case 188 -> 254;
            case 189 -> 203;
            case 190 -> 9;
            case 191 -> 171;
            case 192 -> 56;
            case 193 -> 215;
            case 194 -> 183;
            case 195 -> 236;
            case 196 -> 31;
            case 197 -> 103;
            case 198 -> 36;
            case 199 -> 196;
            case 200 -> 35;
            case 201 -> 218;
            case 202 -> 140;
            case 203 -> 128;
            case 204 -> 248;
            case 205 -> 242;
            case 206 -> 181;
            case 207 -> 37;
            case 208 -> 146;
            case 209 -> 79;
            case 210 -> 44;
            case 211 -> 244;
            case 212 -> 13;
            case 213 -> 152;
            case 214 -> 193;
            case 215 -> 6;
            case 216 -> 221;
            case 217 -> 12;
            case 218 -> 17;
            case 219 -> 211;
            case 220 -> 83;
            case 221 -> 194;
            case 222 -> 96;
            case 223 -> 46;
            case 224 -> 28;
            case 225 -> 49;
            case 226 -> 129;
            case 227 -> 66;
            case 228 -> 43;
            case 229 -> 201;
            case 230 -> 107;
            case 231 -> 147;
            case 232 -> 94;
            case 233 -> 34;
            case 234 -> 72;
            case 235 -> 227;
            case 236 -> 11;
            case 237 -> 212;
            case 238 -> 88;
            case 239 -> 57;
            case 240 -> 138;
            case 241 -> 176;
            case 242 -> 209;
            case 243 -> 85;
            case 244 -> 77;
            case 245 -> 67;
            case 246 -> 122;
            case 247 -> 5;
            case 248 -> 59;
            case 249 -> 189;
            case 250 -> 243;
            case 251 -> 220;
            case 252 -> 21;
            case 253 -> 155;
            case 254 -> 61;
            default -> 80;
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

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(int var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         int var1, int var2
      ) {
         return new llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10002 = -25774;
         short var10003 = 7151;
         var10003 = -25773;
         short var10004 = 31728;
         return "ChunkPos(x="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", z="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String[] var2 = IIlIIIlllIIlIllIIlIIIlIlllIIllIlIIIllIlIllIIIIIllIIlIlIIIlllllllllIlllIlIIIlIIIllIllI.c();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIlIlllIllIlIlIIIIIIIlIlIIIIIIIIlIlIllIlIIIIlIIIllllIIlllllIIlIIIlIlIIIIllIIlllllII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            if (var2 == null) {
               return (boolean)(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != 0);
            }

            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         return !(var4 != var10001);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[2];
         int var3 = 0;
         String var2 = "úó\u0014\u0093×ã!¾\u0099§Å\u0004ØÝÝD";
         int var4 = "úó\u0014\u0093×ã!¾\u0099§Å\u0004ØÝÝD".length();
         char var1 = 11;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 68;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 68;
                  var10006 = var6;
               } else {
                  var13 = 68;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 68;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 70;
                     case 1 -> 56;
                     case 2 -> 17;
                     case 3 -> 45;
                     case 4 -> 11;
                     case 5 -> 11;
                     default -> 31;
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

      private static String b(int var0, int var1) {
         int var2 = (var0 ^ -25774) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 171;
               case 1 -> 125;
               case 2 -> 58;
               case 3 -> 192;
               case 4 -> 132;
               case 5 -> 180;
               case 6 -> 57;
               case 7 -> 91;
               case 8 -> 18;
               case 9 -> 115;
               case 10 -> 155;
               case 11 -> 170;
               case 12 -> 252;
               case 13 -> 220;
               case 14 -> 135;
               case 15 -> 79;
               case 16 -> 144;
               case 17 -> 65;
               case 18 -> 246;
               case 19 -> 11;
               case 20 -> 21;
               case 21 -> 109;
               case 22 -> 200;
               case 23 -> 66;
               case 24 -> 77;
               case 25 -> 96;
               case 26 -> 248;
               case 27 -> 159;
               case 28 -> 137;
               case 29 -> 149;
               case 30 -> 145;
               case 31 -> 94;
               case 32 -> 240;
               case 33 -> 32;
               case 34 -> 88;
               case 35 -> 75;
               case 36 -> 254;
               case 37 -> 203;
               case 38 -> 222;
               case 39 -> 255;
               case 40 -> 146;
               case 41 -> 229;
               case 42 -> 202;
               case 43 -> 93;
               case 44 -> 242;
               case 45 -> 204;
               case 46 -> 15;
               case 47 -> 26;
               case 48 -> 64;
               case 49 -> 209;
               case 50 -> 169;
               case 51 -> 106;
               case 52 -> 172;
               case 53 -> 47;
               case 54 -> 25;
               case 55 -> 224;
               case 56 -> 237;
               case 57 -> 22;
               case 58 -> 207;
               case 59 -> 188;
               case 60 -> 120;
               case 61 -> 189;
               case 62 -> 45;
               case 63 -> 225;
               case 64 -> 158;
               case 65 -> 193;
               case 66 -> 14;
               case 67 -> 147;
               case 68 -> 232;
               case 69 -> 85;
               case 70 -> 233;
               case 71 -> 234;
               case 72 -> 206;
               case 73 -> 114;
               case 74 -> 247;
               case 75 -> 23;
               case 76 -> 35;
               case 77 -> 136;
               case 78 -> 205;
               case 79 -> 87;
               case 80 -> 39;
               case 81 -> 90;
               case 82 -> 104;
               case 83 -> 110;
               case 84 -> 63;
               case 85 -> 126;
               case 86 -> 218;
               case 87 -> 56;
               case 88 -> 6;
               case 89 -> 177;
               case 90 -> 53;
               case 91 -> 5;
               case 92 -> 71;
               case 93 -> 179;
               case 94 -> 245;
               case 95 -> 217;
               case 96 -> 173;
               case 97 -> 167;
               case 98 -> 153;
               case 99 -> 83;
               case 100 -> 80;
               case 101 -> 198;
               case 102 -> 186;
               case 103 -> 238;
               case 104 -> 27;
               case 105 -> 36;
               case 106 -> 69;
               case 107 -> 215;
               case 108 -> 9;
               case 109 -> 1;
               case 110 -> 70;
               case 111 -> 182;
               case 112 -> 98;
               case 113 -> 86;
               case 114 -> 97;
               case 115 -> 253;
               case 116 -> 129;
               case 117 -> 163;
               case 118 -> 156;
               case 119 -> 116;
               case 120 -> 239;
               case 121 -> 164;
               case 122 -> 226;
               case 123 -> 28;
               case 124 -> 73;
               case 125 -> 46;
               case 126 -> 243;
               case 127 -> 211;
               case 128 -> 168;
               case 129 -> 244;
               case 130 -> 241;
               case 131 -> 227;
               case 132 -> 235;
               case 133 -> 228;
               case 134 -> 118;
               case 135 -> 194;
               case 136 -> 2;
               case 137 -> 140;
               case 138 -> 101;
               case 139 -> 49;
               case 140 -> 82;
               case 141 -> 151;
               case 142 -> 216;
               case 143 -> 122;
               case 144 -> 17;
               case 145 -> 190;
               case 146 -> 62;
               case 147 -> 166;
               case 148 -> 219;
               case 149 -> 231;
               case 150 -> 61;
               case 151 -> 176;
               case 152 -> 51;
               case 153 -> 19;
               case 154 -> 38;
               case 155 -> 13;
               case 156 -> 181;
               case 157 -> 208;
               case 158 -> 107;
               case 159 -> 138;
               case 160 -> 7;
               case 161 -> 44;
               case 162 -> 37;
               case 163 -> 100;
               case 164 -> 50;
               case 165 -> 12;
               case 166 -> 34;
               case 167 -> 165;
               case 168 -> 40;
               case 169 -> 249;
               case 170 -> 10;
               case 171 -> 195;
               case 172 -> 42;
               case 173 -> 76;
               case 174 -> 134;
               case 175 -> 4;
               case 176 -> 191;
               case 177 -> 142;
               case 178 -> 187;
               case 179 -> 230;
               case 180 -> 162;
               case 181 -> 184;
               case 182 -> 105;
               case 183 -> 78;
               case 184 -> 119;
               case 185 -> 124;
               case 186 -> 55;
               case 187 -> 174;
               case 188 -> 251;
               case 189 -> 72;
               case 190 -> 117;
               case 191 -> 196;
               case 192 -> 20;
               case 193 -> 68;
               case 194 -> 84;
               case 195 -> 131;
               case 196 -> 33;
               case 197 -> 214;
               case 198 -> 30;
               case 199 -> 0;
               case 200 -> 54;
               case 201 -> 24;
               case 202 -> 161;
               case 203 -> 48;
               case 204 -> 112;
               case 205 -> 178;
               case 206 -> 150;
               case 207 -> 185;
               case 208 -> 60;
               case 209 -> 95;
               case 210 -> 121;
               case 211 -> 139;
               case 212 -> 31;
               case 213 -> 16;
               case 214 -> 8;
               case 215 -> 141;
               case 216 -> 89;
               case 217 -> 133;
               case 218 -> 250;
               case 219 -> 123;
               case 220 -> 81;
               case 221 -> 67;
               case 222 -> 102;
               case 223 -> 197;
               case 224 -> 221;
               case 225 -> 74;
               case 226 -> 59;
               case 227 -> 103;
               case 228 -> 160;
               case 229 -> 130;
               case 230 -> 111;
               case 231 -> 210;
               case 232 -> 157;
               case 233 -> 128;
               case 234 -> 152;
               case 235 -> 41;
               case 236 -> 201;
               case 237 -> 127;
               case 238 -> 29;
               case 239 -> 223;
               case 240 -> 154;
               case 241 -> 183;
               case 242 -> 143;
               case 243 -> 175;
               case 244 -> 43;
               case 245 -> 199;
               case 246 -> 148;
               case 247 -> 3;
               case 248 -> 52;
               case 249 -> 213;
               case 250 -> 99;
               case 251 -> 92;
               case 252 -> 108;
               case 253 -> 113;
               case 254 -> 212;
               default -> 236;
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
}
