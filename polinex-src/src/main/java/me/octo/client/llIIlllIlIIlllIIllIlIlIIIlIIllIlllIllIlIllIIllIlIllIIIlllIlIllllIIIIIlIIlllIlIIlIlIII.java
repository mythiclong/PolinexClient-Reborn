package me.octo.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.mojang.blaze3d.vertex.PoseStack;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.events.impl.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.utils.IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII;
import me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
import me.octo.client.utils.lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI;
import me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Arrays;
import java.nio.file.Files;
import me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
import me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import kotlin.collections.IndexedValue;
import kotlin.Pair;
import kotlin.TuplesKt;
import com.google.gson.reflect.TypeToken;
import me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
import java.lang.reflect.Type;

public class llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII {
    public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX ovld2
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) { return null; } // PX-FIX ovld

   public static me.octo.client.PXDyn var7 = null; // PX-FIX missing field v2
   
   public static <T> T a(Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; } // PX-FIX ovld



   @NotNull
   public static llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIlIIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final String IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final List<String> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final List<String> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private volatile ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private String IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final HashMap<Integer, ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final HashMap<Integer, lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI> lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final HashMap<String, ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private final HashMap<String, List<ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>>> lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static Gson IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @JvmField
   @NotNull
   public static List<llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static String[] a;
   private static String[] b;

   public llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII(
      @NotNull String var1,
      @NotNull String var2,
      @NotNull String var3,
      @NotNull String var4,
      @NotNull List<? extends IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> var5,
      @NotNull String var6,
      @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7,
      @NotNull List<String> var8,
      @NotNull List<String> var9,
      boolean var10,
      boolean var11,
      boolean var12,
      boolean var13
   ) {
      short var10001 = 27971;
      short var10002 = 13902;
      Intrinsics.checkNotNullParameter(var1, "editorName");
      var10001 = 27973;
      var10002 = 7595;
      Intrinsics.checkNotNullParameter(var2, "parentFolderName");
      var10001 = 27978;
      var10002 = 29096;
      Intrinsics.checkNotNullParameter(var3, "name");
      var10001 = 27987;
      var10002 = -18659;
      Intrinsics.checkNotNullParameter(var4, "routeType");
      var10001 = 27975;
      var10002 = 31761;
      Intrinsics.checkNotNullParameter(var5, "allowedTypes");
      var10001 = 28003;
      var10002 = 8084;
      Intrinsics.checkNotNullParameter(var6, "commandName");
      var10001 = 27962;
      var10002 = -30109;
      Intrinsics.checkNotNullParameter(var7, "targetType");
      var10001 = 27985;
      var10002 = -22082;
      Intrinsics.checkNotNullParameter(var8, "subFolderNames");
      var10001 = 27919;
      var10002 = 11103;
      Intrinsics.checkNotNullParameter(var9, "targetNames");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var4;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = ((List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI>)(Object)(var5));
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var6;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var8;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var9;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var10;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var11;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var12;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var13;
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.add(this);
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new llIlIIllIIlllIlIllIIllIllIIIIlIIlIIlIIIIIllIlIlllllIIIllIIllIIlIlIllIlIllIIlIlIIIIIlI(
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new ArrayList<>();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 1000;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new HashMap<>();
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new HashMap<>();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new HashMap<>();
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new HashMap<>();
   }

   @NotNull
   public final String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String b() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final String c() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final String d() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> e() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final String f() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI g() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final List<String> h() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final List<String> i() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean j() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final boolean k() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final boolean l() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final boolean m() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @NotNull
   public final File n() {
      File var10000 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b().toFile();
      short var10002 = 27949;
      short var10003 = -3683;
      Intrinsics.checkNotNullExpressionValue(var10000, "toFile(...)");
      return var10000;
   }

   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> o() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void a(@NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1) {
      short var10001 = 27950;
      short var10002 = -31242;
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   @Nullable
   public final me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI p() {
      return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   }

   public final void a(@Nullable me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var1) {
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1;
   }

   @Nullable
   public final IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI q() {
      return this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   public final void a(@Nullable IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI var1) {
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var1;
   }

   @Nullable
   public final String r() {
      return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public final void a(@Nullable String var1) {
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   @NotNull
   protected final HashMap<String, ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> s() {
      return this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   @NotNull
   protected final HashMap<String, List<ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>>> t() {
      return this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   @NotNull
   public final Map<String, ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> u() {
      return this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   @NotNull
   public final Map<String, List<ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>>> v() {
      return this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   protected final void a(@NotNull String var1, @NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var2) {
      short var10001 = 27978;
      short var10002 = 29096;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 27983;
      var10002 = -1416;
      Intrinsics.checkNotNullParameter(var2, "route");
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.put(var1, var2);
   }

   protected final void a(
      @NotNull String var1, @NotNull List<? extends ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> var2
   ) {
      short var10001 = 27982;
      short var10002 = -4393;
      Intrinsics.checkNotNullParameter(var1, "name");
      var10001 = 27998;
      var10002 = 27046;
      Intrinsics.checkNotNullParameter(var2, "routes");
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.put(var1, (List<ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>>)(List<?>)var2);
   }

   @SubscribeEvent
   public final void a(@NotNull llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII param1) {
      boolean var2 = R();
      Intrinsics.checkNotNullParameter(param1, "event");
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) { return; }
      if (!this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.a(Integer.valueOf(this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI))) { return; }
      if (!this.I()) { return; }
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.f();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 800 + kotlin.random.Random.Default.nextInt(400);
      switch (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
         case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl: {
            String var3 = this.F();
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var3;
            ArrayList var6 = (var3 == null) ? null : this.e(var3);
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = (var6 != null) ? var6 : this.B();
            break;
         }
         case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII: {
            String var3 = this.D();
            String var4 = this.E();
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var4;
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = (var3 != null && var4 != null) ? this.a(var3, var4) : this.B();
            break;
         }
         case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl: {
            String var3 = this.D();
            String var4 = this.C();
            String var5 = this.F();
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var5;
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = (var3 != null && var4 != null && var5 != null) ? this.a(var3, var4, var5) : this.B();
            break;
         }
         default:
            throw new NoWhenBranchMatchedException();
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGH
   )
   public final void a(@NotNull IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl param1) {
            Intrinsics.checkNotNullParameter(param1, "event");
      if (me.octo.client.llIlIlIllIIIllllIIIlIIlIlIIlIIllIllIlIlIIlIlIlIIlllIlIIlIllIIllIIIIlIIIllIIIllllllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a()) {
         return;
      }
      if (!me.octo.client.utils.player.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.m()) {
         return;
      }
      if (!me.octo.client.lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.a()) {
         return;
      }
      if (!this.G()) {
         return;
      }
      if (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl && this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll == null && this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIlIIl) {
         for (int var3 = 0; var3 < this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.size(); var3++) {
            a(this, param1.k(), this.a(var3), (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll) null, (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll) null, 0.0F, true, 28, (Object) null);
         }
      }
      a(this, param1.k(), this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI, (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll) null, (me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll) null, 0.0F, true, 28, (Object) null);
   }

   public final void a(
      @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI param1,
      @Nullable Integer param2,
      @Nullable BlockPos param3
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R ()Z
      // 003: aload 1
      // 004: sipush 27990
      // 007: sipush 30515
      // 00a: pop2
      // 00b: ldc_w "type"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 4
      // 013: aload 1
      // 014: getstatic me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 017: if_acmpne 0de
      // 01a: aload 0
      // 01b: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl Z
      // 01e: ifne 047
      // 021: goto 028
      // 024: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 027: athrow
      // 028: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 02b: ldc2_w 5000
      // 02e: aload 0
      // 02f: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 032: sipush 27951
      // 035: sipush -8077
      // 038: pop2
      // 039: ldc_w "This route doesn't require a final rotation!"
      // 03c: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 03f: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 042: return
      // 043: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 046: athrow
      // 047: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 04a: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 04d: dup
      // 04e: ifnonnull 057
      // 051: pop
      // 052: return
      // 053: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: astore 5
      // 059: aload 0
      // 05a: new me/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI
      // 05d: dup
      // 05e: aload 5
      // 060: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 063: aload 5
      // 065: invokevirtual net/minecraft/client/player/LocalPlayer.getXRot ()F
      // 068: invokespecial me/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI.<init> (FF)V
      // 06b: putfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl Lme/octo/client/IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI;
      // 06e: aload 0
      // 06f: aload 5
      // 071: invokevirtual net/minecraft/client/player/LocalPlayer.getYRot ()F
      // 074: f2d
      // 075: ldc2_w 100.0
      // 078: dmul
      // 079: invokestatic java/lang/Math.rint (D)D
      // 07c: ldc2_w 100.0
      // 07f: ddiv
      // 080: aload 5
      // 082: invokevirtual net/minecraft/client/player/LocalPlayer.getXRot ()F
      // 085: f2d
      // 086: ldc2_w 100.0
      // 089: dmul
      // 08a: invokestatic java/lang/Math.rint (D)D
      // 08d: ldc2_w 100.0
      // 090: ddiv
      // 091: dstore 9
      // 093: dstore 11
      // 095: sipush 27906
      // 098: sipush -22389
      // 09b: pop2
      // 09c: ldc_w "Set your final rotation to ("
      // 09f: dload 11
      // 0a1: sipush 28027
      // 0a4: sipush 9577
      // 0a7: pop2
      // 0a8: ldc_w ", "
      // 0ab: dload 9
      // 0ad: ldc_w ")"
      // 0b0: invokedynamic makeConcatWithConstants (Ljava/lang/String;DLjava/lang/String;DLjava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 0b5: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 0b8: iload 4
      // 0ba: ifne 0d4
      // 0bd: aload 0
      // 0be: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.y ()Ljava/util/ArrayList;
      // 0c1: dup
      // 0c2: ifnonnull 0d5
      // 0c5: goto 0cc
      // 0c8: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0cb: athrow
      // 0cc: pop
      // 0cd: goto 0d4
      // 0d0: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d3: athrow
      // 0d4: return
      // 0d5: astore 6
      // 0d7: aload 0
      // 0d8: aload 6
      // 0da: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.b (Ljava/util/ArrayList;)V
      // 0dd: return
      // 0de: aload 3
      // 0df: dup
      // 0e0: ifnonnull 162
      // 0e3: pop
      // 0e4: aload 1
      // 0e5: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII [I
      // 0e8: swap
      // 0e9: invokevirtual me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.ordinal ()I
      // 0ec: iaload
      // 0ed: tableswitch 111 1 2 27 27
      // 104: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 10b: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.I ()Lnet/minecraft/world/phys/BlockHitResult;
      // 10e: dup
      // 10f: ifnull 123
      // 112: goto 119
      // 115: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 118: athrow
      // 119: invokevirtual net/minecraft/world/phys/BlockHitResult.getBlockPos ()Lnet/minecraft/core/BlockPos;
      // 11c: goto 125
      // 11f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 122: athrow
      // 123: pop
      // 124: aconst_null
      // 125: astore 8
      // 127: aload 8
      // 129: iload 4
      // 12b: ifne 159
      // 12e: ifnonnull 157
      // 131: goto 138
      // 134: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 137: athrow
      // 138: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 13b: ldc2_w 5000
      // 13e: aload 0
      // 13f: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 142: sipush 28028
      // 145: sipush -9856
      // 148: pop2
      // 149: ldc_w "You must be looking at a block to add a MINE waypoint"
      // 14c: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 14f: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 152: return
      // 153: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 156: athrow
      // 157: aload 8
      // 159: goto 162
      // 15c: getstatic me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
      // 15f: invokevirtual me/octo/client/utils/player/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.t ()Lnet/minecraft/core/BlockPos;
      // 162: astore 5
      // 164: aload 0
      // 165: iload 4
      // 167: ifne 1db
      // 16a: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Z
      // 16d: ifeq 1da
      // 170: goto 177
      // 173: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 176: athrow
      // 177: aload 0
      // 178: iload 4
      // 17a: ifne 1d1
      // 17d: goto 184
      // 180: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 183: athrow
      // 184: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 187: ifnull 1d0
      // 18a: goto 191
      // 18d: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 190: athrow
      // 191: aload 0
      // 192: iload 4
      // 194: ifne 1d1
      // 197: goto 19e
      // 19a: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1a1: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 1a4: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1a7: if_acmpeq 1d0
      // 1aa: goto 1b1
      // 1ad: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b0: athrow
      // 1b1: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 1b4: ldc2_w 5000
      // 1b7: aload 0
      // 1b8: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 1bb: sipush 28004
      // 1be: sipush 18562
      // 1c1: pop2
      // 1c2: ldc_w "You can't change locations for this route!"
      // 1c5: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 1c8: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 1cb: return
      // 1cc: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: getstatic me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl;
      // 1d4: invokevirtual me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.g ()Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1d7: putfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl Lme/octo/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 1da: aload 0
      // 1db: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.y ()Ljava/util/ArrayList;
      // 1de: dup
      // 1df: ifnonnull 1e8
      // 1e2: pop
      // 1e3: return
      // 1e4: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e7: athrow
      // 1e8: astore 6
      // 1ea: new me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 1ed: dup
      // 1ee: aload 5
      // 1f0: aload 1
      // 1f1: invokespecial me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.<init> (Lnet/minecraft/core/BlockPos;Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;)V
      // 1f4: astore 7
      // 1f6: iload 4
      // 1f8: ifne 215
      // 1fb: aload 2
      // 1fc: ifnonnull 21a
      // 1ff: goto 206
      // 202: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: aload 6
      // 208: aload 7
      // 20a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 20d: pop
      // 20e: goto 215
      // 211: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 214: athrow
      // 215: iload 4
      // 217: ifeq 237
      // 21a: aload 6
      // 21c: invokevirtual java/util/ArrayList.size ()I
      // 21f: aload 2
      // 220: invokevirtual java/lang/Integer.intValue ()I
      // 223: bipush 1
      // 224: isub
      // 225: invokestatic java/lang/Math.min (II)I
      // 228: bipush 0
      // 229: invokestatic java/lang/Math.max (II)I
      // 22c: istore 8
      // 22e: aload 6
      // 230: iload 8
      // 232: aload 7
      // 234: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 237: aload 0
      // 238: aload 2
      // 239: ifnonnull 259
      // 23c: aload 0
      // 23d: aload 7
      // 23f: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Lme/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll;)Ljava/lang/String;
      // 242: sipush 28024
      // 245: sipush 28909
      // 248: pop2
      // 249: ldc_w "Added waypoint "
      // 24c: swap
      // 24d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 252: goto 27c
      // 255: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 258: athrow
      // 259: aload 0
      // 25a: aload 7
      // 25c: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Lme/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll;)Ljava/lang/String;
      // 25f: aload 2
      // 260: sipush 28029
      // 263: sipush 10775
      // 266: pop2
      // 267: ldc_w "Inserted waypoint "
      // 26a: dup_x2
      // 26b: pop
      // 26c: sipush 27938
      // 26f: sipush -5051
      // 272: pop2
      // 273: ldc_w " at waypoint number "
      // 276: swap
      // 277: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001" ]
      // 27c: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 27f: aload 0
      // 280: aload 6
      // 282: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.b (Ljava/util/ArrayList;)V
      // 285: return
   }

   public final void a(@Nullable Integer param1, @Nullable BlockPos param2) {
      boolean var3 = Q();
      if (!var3) { return; }
      ArrayList var4 = this.y();
      if (var4 == null) { return; }
      if (var4.isEmpty()) { this.N(); return; }
      kotlin.Pair var5;
      if (param1 != null) {
         int var6 = Math.max(0, Math.min(kotlin.collections.CollectionsKt.getLastIndex((java.util.List)var4), param1.intValue() - 1));
         var5 = kotlin.TuplesKt.to(Integer.valueOf(var6), var4.get(var6));
      } else if (param2 != null) {
         kotlin.collections.IndexedValue var9 = null;
         for (Object var10o : (Iterable)kotlin.collections.CollectionsKt.withIndex((Iterable)var4)) {
            kotlin.collections.IndexedValue var10 = (kotlin.collections.IndexedValue)var10o;
            if (Intrinsics.areEqual(((IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10.getValue()).a(), param2)) { var9 = var10; break; }
         }
         Integer var11 = (var9 == null) ? null : Integer.valueOf(var9.getIndex());
         if (var11 == null) {
            me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "You aren't looking at a waypoint", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            return;
         }
         var5 = kotlin.TuplesKt.to(var11, var4.get(var11.intValue()));
      } else {
         int var6 = kotlin.collections.CollectionsKt.getLastIndex((java.util.List)var4);
         var5 = kotlin.TuplesKt.to(Integer.valueOf(var6), var4.get(var6));
      }
      int var12 = ((Number)var5.component1()).intValue();
      IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var7 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var5.component2();
      var4.remove(var12);
      this.l("Removed waypoint" + this.a(var7) + " at waypoint number" + (var12 + 1));
      this.b(var4);
   }

   public final void w() {
      boolean var1 = Q();
      if (!var1) {
         return;
      }
      java.util.ArrayList var2 = this.y();
      if (var2 == null) {
         return;
      }
      var2.clear();
      if (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
         this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = null;
      }
      this.l("Cleared all waypoints");
      this.b(var2);
   }

   public final void x() {
      boolean var1 = Q();
      if (var1) {
        if (this.y() == null) {
          return;
        }
      }
      File var2 = this.z();
      if (var2 == null) {
        return;
      }
      String var3 = kotlin.io.FilesKt.readText(var2, java.nio.charset.StandardCharsets.UTF_8);
      me.octo.client.utils.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(var3);
      me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "Copied route to clipboard", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   public final void b(@Nullable String param1) {
      boolean var2 = Q();
      if (!var2) {
        return;
      }
      if (param1 == null) {
        this.l("Error getting data from clipboard - it was null");
        return;
      }
      if (this.y() == null) {
        return;
      }
      var var3 = this.h(param1);
      if (var3 == null) {
        var3 = this.i(param1);
      }
      if (var3 != null) {
        this.b(var3);
        me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(5000L, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "Imported route from clipboard", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      } else {
        me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "Couldn't import route from clipboard", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }
   }

   public final boolean c(@NotNull String param1) {
      boolean var2 = Q();
      Intrinsics.checkNotNullParameter(param1, "folderName");
      if (!var2) {
         return false;
      }
      me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl var3 = this.J();
      if (var3 == null) {
         return false;
      }
      if (var2 && this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll == IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) {
         return var3.a(param1, this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      }
      boolean var4;
      try {
         java.nio.file.Path var5 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, param1);
         Intrinsics.checkNotNullExpressionValue(
            java.nio.file.Files.createDirectories(var5, new java.nio.file.attribute.FileAttribute[0]),
            "createDirectories(...)"
         );
         for (String var6 : this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII) {
            java.nio.file.Path var7 = me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, param1, var6);
            Intrinsics.checkNotNullExpressionValue(
               java.nio.file.Files.createDirectories(var7, new java.nio.file.attribute.FileAttribute[0]),
               "createDirectories(...)"
            );
            for (String var8 : this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI) {
               java.io.File var9 = var7.resolve(var8 + ".json").toFile();
               Intrinsics.checkNotNullExpressionValue(var9, "toFile(...)");
               kotlin.io.FilesKt.writeText(var9, "{\"waypoints\":[]}", java.nio.charset.StandardCharsets.UTF_8);
            }
         }
         var3.F();
         var4 = true;
      } catch (Exception var10) {
         var4 = false;
      }
      return var4;
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q ()Z
      // 003: aload 1
      // 004: sipush 27946
      // 007: sipush 21348
      // 00a: pop2
      // 00b: ldc_w "folderName"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: iload 2
      // 013: ifeq 02d
      // 016: aload 0
      // 017: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.J ()Lme/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl;
      // 01a: dup
      // 01b: ifnonnull 02f
      // 01e: goto 025
      // 021: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 024: athrow
      // 025: pop
      // 026: goto 02d
      // 029: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 02c: athrow
      // 02d: bipush 0
      // 02e: ireturn
      // 02f: astore 3
      // 030: iload 2
      // 031: ifeq 056
      // 034: aload 0
      // 035: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 038: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 03b: if_acmpne 055
      // 03e: goto 045
      // 041: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 044: athrow
      // 045: aload 3
      // 046: aload 1
      // 047: aload 0
      // 048: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/util/List;
      // 04b: invokevirtual me/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.a (Ljava/lang/String;Ljava/util/List;)Z
      // 04e: goto 17e
      // 051: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 054: athrow
      // 055: nop
      // 056: getstatic me/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl;
      // 059: aload 0
      // 05a: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/lang/String;
      // 05d: aload 1
      // 05e: invokevirtual me/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.b (Ljava/lang/String;Ljava/lang/String;)Ljava/nio/file/Path;
      // 061: astore 4
      // 063: aload 4
      // 065: bipush 0
      // 066: anewarray 702
      // 069: dup
      // 06a: arraylength
      // 06b: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 06e: checkcast [Ljava/nio/file/attribute/FileAttribute;
      // 071: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 074: dup
      // 075: sipush 27955
      // 078: sipush 28649
      // 07b: pop2
      // 07c: ldc_w "createDirectories(...)"
      // 07f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 082: pop
      // 083: aload 0
      // 084: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII Ljava/util/List;
      // 087: checkcast java/lang/Iterable
      // 08a: astore 5
      // 08c: bipush 0
      // 08d: istore 6
      // 08f: aload 5
      // 091: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 096: astore 7
      // 098: aload 7
      // 09a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 09f: ifeq 16c
      // 0a2: aload 7
      // 0a4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0a9: astore 8
      // 0ab: aload 8
      // 0ad: checkcast java/lang/String
      // 0b0: astore 9
      // 0b2: bipush 0
      // 0b3: istore 10
      // 0b5: getstatic me/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl;
      // 0b8: aload 0
      // 0b9: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Ljava/lang/String;
      // 0bc: aload 1
      // 0bd: aload 9
      // 0bf: invokevirtual me/octo/client/lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.b (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/nio/file/Path;
      // 0c2: astore 11
      // 0c4: aload 11
      // 0c6: bipush 0
      // 0c7: anewarray 702
      // 0ca: dup
      // 0cb: arraylength
      // 0cc: invokestatic java/util/Arrays.copyOf ([Ljava/lang/Object;I)[Ljava/lang/Object;
      // 0cf: checkcast [Ljava/nio/file/attribute/FileAttribute;
      // 0d2: invokestatic java/nio/file/Files.createDirectories (Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;
      // 0d5: dup
      // 0d6: sipush 27955
      // 0d9: sipush 28649
      // 0dc: pop2
      // 0dd: ldc_w "createDirectories(...)"
      // 0e0: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 0e3: pop
      // 0e4: aload 0
      // 0e5: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI Ljava/util/List;
      // 0e8: checkcast java/lang/Iterable
      // 0eb: astore 12
      // 0ed: bipush 0
      // 0ee: istore 13
      // 0f0: iload 2
      // 0f1: ifeq 171
      // 0f4: aload 12
      // 0f6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 0fb: astore 14
      // 0fd: aload 14
      // 0ff: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 104: ifeq 165
      // 107: aload 14
      // 109: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 10e: astore 15
      // 110: aload 15
      // 112: checkcast java/lang/String
      // 115: astore 16
      // 117: bipush 0
      // 118: istore 17
      // 11a: aload 11
      // 11c: aload 16
      // 11e: sipush 27972
      // 121: sipush -9080
      // 124: pop2
      // 125: ldc_w ".json"
      // 128: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 12d: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 132: invokeinterface java/nio/file/Path.toFile ()Ljava/io/File; 1
      // 137: dup
      // 138: sipush 27949
      // 13b: sipush -3683
      // 13e: pop2
      // 13f: ldc "toFile(...)"
      // 141: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 144: sipush 27907
      // 147: sipush 30013
      // 14a: pop2
      // 14b: ldc_w "{\"waypoints\":[]}"
      // 14e: aconst_null
      // 14f: bipush 2
      // 150: aconst_null
      // 151: invokestatic kotlin/io/FilesKt.writeText$default (Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
      // 154: nop
      // 155: nop
      // 156: iload 2
      // 157: ifeq 168
      // 15a: iload 2
      // 15b: ifne 0fd
      // 15e: goto 165
      // 161: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 164: athrow
      // 165: nop
      // 166: nop
      // 167: nop
      // 168: iload 2
      // 169: ifne 098
      // 16c: nop
      // 16d: aload 3
      // 16e: invokevirtual me/octo/client/IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.F ()V
      // 171: bipush 1
      // 172: istore 4
      // 174: goto 17c
      // 177: astore 5
      // 179: bipush 0
      // 17a: istore 4
      // 17c: iload 4
      // 17e: ireturn
   }

   public final boolean d(@NotNull String param1) {
        boolean bl;
        block5: {
            block4: {
                boolean bl2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
                Intrinsics.checkNotNullParameter((Object)param1, (String)"folderName");
                boolean bl3 = bl2;
                try {
                    IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl;
                    try {
                        if (bl3 || (illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl = this.J()) == null) break block4;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                    bl = illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.g(param1);
                    break block5;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                }
            }
            bl = false;
        }
        return bl;
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> e(String param1) {
        ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> arrayList;
        block15: {
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
            boolean bl;
            block13: {
                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2;
                block14: {
                    IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll2;
                    block12: {
                        bl = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
                        try {
                            try {
                                try {
                                    IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll3 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(param1);
                                    iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll2 = iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll3;
                                    iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll = iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll3;
                                    if (!bl) break block12;
                                    if (iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll2 != null) break block13;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                }
                                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                                if (!bl) break block14;
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                            }
                            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll4 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.b(null, param1);
                            iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll2 = iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll4;
                            iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll = iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll4;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                        }
                    }
                    try {
                        if (iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll2 != null) break block13;
                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                }
                return llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.f(param1);
            }
            IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll5 = iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll;
            arrayList = this.b(iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll5);
            try {
                boolean bl2;
                try {
                    bl2 = this.a(iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll5);
                    if (!bl || !bl2) break block15;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                }
                bl2 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(param1, this.a(iIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll5, (List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)arrayList));
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
            }
        }
        return arrayList;
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> a(String param1, String param2) {
      boolean var3 = Q();
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var4 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(param1, param2);
      if (var3 && var4 == null) { var4 = this.b(param1, param2); }
      if (var4 == null) { return this.f(param1 + "/" + param2); }
      ArrayList var5 = this.b(var4);
      boolean var6 = this.a(var4);
      if (var3 && var6) { this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(param1, param2, this.a(var4, (List)var5)); }
      return var5;
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> a(String param1, String param2, String param3) {
      boolean var4 = Q();
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var5 = null;
      if (var4) { var5 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(param1, param2, param3); }
      if (var5 == null) { return this.f(param1 + "/" + param2 + "/" + param3); }
      ArrayList var6 = this.b(var5);
      boolean var7 = this.a(var5);
      if (var4 && var7) { this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(param1, param2, param3, this.a(var5, (List)var6)); }
      return var6;
   }

   private final boolean a(IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll param1) {
      if (!this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll) { return false; }
      me.octo.client.lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll var2 = param1.d();
      return (var2 == null ? 1 : var2.e()) < 2;
   }

   private final IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll a(
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var1,
      List<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var2
   ) { Collection var7 = null; // PX-FIX hoist
        
      Collection var18 = null; // PX-FIX
      Iterable var4 = var2;
      boolean var5 = false;
      boolean var10000 = R();
       var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
      boolean var3 = var10000;
      boolean var8 = false;
      Iterator var9 = var4.iterator();

      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            var18 = var7;
            IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
            if (var3) {
               break;
            }

            boolean var12 = false;
            var7.add(
               IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(var11.a(), var11.b().a())
            );
            if (!var3) {
               continue;
            }
         }

         var18 = var7;
         break;
      }

      List var19 = (List)var18;
      String var10001 = var1.b();
      IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI var10002 = var1.c();
      lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll var14 = new lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll(
         null, null, 0L, 0L, 2, 15, null
      );
      IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI var15 = var10002;
      String var16 = var10001;
      List var17 = var19;
      return new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(var17, var16, var15, var14);
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> f(String var1) {
      this.g(var1);
      return new ArrayList<>();
   }

   private final void g(String param1) {
      boolean var2 = R();
      java.nio.file.Path var3 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.b().resolve(param1 + ".json");
      Intrinsics.checkNotNull(var3);
      if (!java.nio.file.Files.exists(var3, new java.nio.file.LinkOption[0])) {
         java.nio.file.Path var4 = var3.getParent();
         if (var4 != null) {
            try {
               java.nio.file.Path var5 = java.nio.file.Files.createDirectories(var4, new java.nio.file.attribute.FileAttribute[0]);
               Intrinsics.checkNotNullExpressionValue(var5, "createDirectories(...)");
            } catch (java.io.IOException var7) {
            }
         }
      }
      java.io.File var6 = var3.toFile();
      Intrinsics.checkNotNullExpressionValue(var6, "toFile(...)");
      me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(kotlin.collections.CollectionsKt.emptyList(), (String)null, (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)null, (lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)null, 14, (kotlin.jvm.internal.DefaultConstructorMarker)null), var6, true);
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> b(
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll param1
   ) {
      boolean var2 = R();
      if (!var2 && this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) { this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = (param1.b() == null) ? null : IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(param1.b()); }
      if (!var2 && this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) { this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = param1.c(); }
      boolean var3 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll && (param1.d() == null ? 1 : param1.d().e()) < 2;
      List var4 = param1.a();
      ArrayList var5 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)var4, 10));
      for (Object var10 : var4) {
         IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl var11 = (IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl)var10;
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var13 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var11.d());
         if (var13 == null) { var13 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII; }
         if (var3 && var13 == IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) { var13 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI; }
         var5.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(var11.e(), var13));
      }
      return var5;
   }

   private final void b(ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> param1) {
      List var5 = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault((Iterable)param1, 10));
      for (Object var10 : param1) {
         IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var11 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var10;
         var5.add(IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var11.a(), var11.b().a()));
      }
      IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll var3 = new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(var5, 
         (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl == null) ? null : me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl),
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ? this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl : (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)null,
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ? new lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll((String)null, (String)null, 0L, 0L, 2, 15, (kotlin.jvm.internal.DefaultConstructorMarker)null) : (lIIIllIlllIlIIIlIIlIIlIIlIlIlIIllIlIlllIIlIlllllIllllIIIllllllIIllllIIIIIIIlIlIllIlll)null);
      boolean var4;
      switch (this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
         case IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl: {
            String var7 = this.F();
            if (var7 == null) { return; }
            var4 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(var7, var3);
            break;
         }
         case lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII: {
            String var7 = this.D();
            if (var7 == null) { return; }
            String var8 = this.E();
            if (var8 == null) { return; }
            var4 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(var7, var8, var3);
            break;
         }
         case IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl: {
            String var7 = this.D();
            if (var7 == null) { return; }
            String var8 = this.C();
            if (var8 == null) { return; }
            String var9 = this.F();
            if (var9 == null) { return; }
            var4 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.a(var7, var8, var9, var3);
            break;
         }
         default:
            throw new NoWhenBranchMatchedException();
      }
      if (!var4) {
         me.octo.client.utils.IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(2000L, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "Failed to save route", me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      }
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> y() {
      boolean var1 = R();
      int[] var0 = new int[]{3, 2, 1};
      switch (var0[this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.ordinal()]) {
         case 1:
            if (!var1) {
               if (this.F() == null) {
                  this.M();
                  return null;
               }
            }
            return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         case 2:
            if (!var1) {
               if (this.D() == null || this.E() == null) {
                  me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.g("2");
                  this.M();
                  return null;
               }
            }
            return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         case 3:
            if (!var1) {
               if (this.D() == null || this.C() == null || this.F() == null) {
                  this.M();
                  return null;
               }
            }
            return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
         default:
            throw new NoWhenBranchMatchedException();
      }
   }
   private final File z() {
      boolean var1 = Q();
      int[] var0 = new int[]{3, 2, 1};
      switch (var0[this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.ordinal()]) {
         case 1: {
            String var2 = this.F();
            if (var2 == null) {
               return null;
            }
            return lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var2)
               .toFile();
         }
         case 2: {
            String var2 = this.D();
            if (var2 == null) {
               return null;
            }
            if (var1) {
               String var3 = this.E();
               if (var3 == null) {
                  return null;
               }
               return lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var2, var3)
                  .toFile();
            }
            return null;
         }
         case 3: {
            String var2 = this.D();
            if (var2 == null) {
               return null;
            }
            if (var1) {
               String var3 = this.C();
               if (var3 == null) {
                  return null;
               }
               String var4 = this.F();
               if (var4 == null) {
                  return null;
               }
               return lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .a(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var2, var3, var4)
                  .toFile();
            }
            return null;
         }
         default:
            throw new NoWhenBranchMatchedException();
      }
   }
   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> a(int param1) {
      boolean var2 = Q();
      ArrayList var3 = (ArrayList)this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.get(Integer.valueOf(param1));
      lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var4 = (lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.get(Integer.valueOf(param1));
      if (var3 != null && (!var2 || var4 != null) && !var4.a(Integer.valueOf(500))) { return var3; }
      String var5 = this.D();
      ArrayList var6;
      if (var5 == null) { var6 = this.b(param1); if (var6 == null) { var6 = new ArrayList(); } } else { var6 = this.a(var5, (String)this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(param1)); }
      Map var7 = (Map)this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      Integer var8 = Integer.valueOf(param1);
      Object var10 = var7.get(var8);
      lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var11;
      if (var10 == null) { var11 = new lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI(); var7.put(var8, var11); } else { var11 = (lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI)var10; }
      var11.f();
      ((Map)this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll).put(Integer.valueOf(param1), var6);
      return var6;
   }

   // PX-FIX PhaseA: 受检异常 rethrow 绕过（jar 无 throws；等价原生 JVM 传播语义）
   @SuppressWarnings("unchecked")
   private static <T extends Throwable> RuntimeException sneakyThrow(Throwable var0) throws T {
      throw (T)var0;
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> h(String param1) {
        Object object;
        boolean bl = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII3 = null; // PX-FIX PhaseA: 作用域提升
        try {
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2;
            block16: {
                boolean bl2;
                block13: {
                    block14: {
                        me.octo.client.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
                        block19: {
                            block15: {
                                String string2;
                                block17: {
                                    llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII2 = llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                                    String string3 = param1;
                                    boolean bl3 = false;
                                    object = (IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.fromJson(string3, IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll.class);
                                    bl2 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                                    if (!bl) break block13;
                                    if (!bl2) break block14;
                                    break block17;
                                }
                                try {
                                    block18: {
                                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII3 = this;
                                        if (!bl) break block15;
                                        break block18;
                                    }
                                    string2 = ((IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)object).b();
                                    if (string2 == null) break block15;
                                }
                                catch (Exception exception) {
                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a(exception));
                                }
                                String string4 = string2;
                                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII4 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII3;
                                boolean bl4 = false;
                                iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.a(string4);
                                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII3 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII4;
                                break block19;
                            }
                            iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = null;
                        }
                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII3.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
                    }
                    try {
                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                        if (!bl) break block16;
                        bl2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                    }
                    catch (Exception exception) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a(exception));
                    }
                }
                try {
                    if (bl2) {
                        this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = ((IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)object).c();
                    }
                }
                catch (Exception exception) {
                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a(exception));
                }
                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
            }
            object = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.b((IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll)object);
        }
        catch (Exception exception) {
            object = null;
        }
        return (ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>)object; // PX-FIX PhaseA: CFR slot-merge cast
   }

   private final IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll b(String var1, String var2) { List var7 = null; // PX-FIX hoist
        
      Collection var26 = null; // PX-FIX
      Object var25 = null; // PX-FIX
      Object var24 = null; // PX-FIX
      boolean var3 = Q();

      try {
         File var10000;
         label69: {
            try {
               if (var1 != null) {
                  File var28 = this.n();
                  short var10006 = 27972;
                  short var10007 = -9080;
                  var10000 = new File(var28, var1 + "/" + var2 + ".json");
                  break label69;
               }
            } catch (Exception var22) {
               throw (RuntimeException)a(var22);
            }

            File var10002 = this.n();
            short var10004 = 27972;
            short var10005 = -9080;
            var10000 = new File(var10002, var2 + ".json");
         }

         File var4 = var10000;
         String var5 = FilesKt.readText(var4, null);

         label61: {
            label60: {
               try {
                  var24 = var5.length();
                  if (!var3) {
                     break label61;
                  }

                  if (((Boolean)(var24))) {
                     break label60;
                  }
               } catch (Exception var21) {
                  throw (RuntimeException)a(var21);
               }

               var24 = 0;
               break label61;
            }

            var24 = 1;
         }

         try {
            if (!((Boolean)var24)) {
               return null;
            }
         } catch (Exception var19) {
            throw (RuntimeException)a(var19);
         }

         try {
            var25 = this.i(var5);
            if (var25 == null) {
               return null;
            }
         } catch (Exception var20) {
            throw (RuntimeException)a(var20);
         }

         ArrayList var6 =((ArrayList)( var25));
         Iterable var8 = var6;
         boolean var9 = false;
         Collection var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var8, 10));
         boolean var12 = false;
         Iterator var13 = var8.iterator();

         while (true) {
            if (var13.hasNext()) {
               Object var14 = var13.next();
               var26 = var11;
               IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var15 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var14;
               if (!var3) {
                  break;
               }

               boolean var16 = false;
               BlockPos var17 = var15.a();
               var11.add(
                  new IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl(
                     var17.getX(), var17.getY(), var17.getZ(), var15.b().name()
                  )
               );
               if (var3) {
                  continue;
               }
            }

            var26 = var11;
            break;
         }

          var7 = (List)var26;
         short var27 = 27948;
         a(this, var4, var6, false, 4, null);
         short var10001 = -23452;
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("Converted waypoints!");
         return new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(var7, null, null, null, 14, null);
      } catch (Exception var23) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(String.valueOf(var23.getMessage()));
         return null;
      }
   }

   private final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> i(String param1) {
        boolean bl = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
        try {
            Collection collection;
            block11: {
                Type type = new TypeToken<List<? extends IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll>>(){}.getType();
                Object object = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.fromJson(param1, type);
                Intrinsics.checkNotNullExpressionValue((Object)object, (String)"fromJson(...)");
                List list = (List)object;
                Iterable iterable = list;
                boolean bl2 = false;
                Iterable iterable2 = iterable;
                Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
                boolean bl3 = false;
                for (Object t : iterable2) {
                    IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
                    Collection collection3;
                    IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
                    block12: {
                        block13: {
                            collection = collection2;
                            iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll = (IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)t;
                            if (!bl) break block11;
                            collection3 = collection;
                            boolean bl4 = false;
                            if (!bl) break block13;
                            try {
                                ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.d());
                                if (ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI != null) break block12;
                                break block13;
                            }
                            catch (Exception exception) {
                                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a(exception));
                            }
                        }
                        ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
                    }
                    IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI2 = ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
                    collection3.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(new BlockPos(iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.a(), iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.b(), iIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.c()), ilIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI2));
                    if (bl) continue;
                    break;
                }
                collection = CollectionsKt.toCollection((Iterable)((List)collection2), (Collection)new ArrayList());
            }
            return (ArrayList)collection;
        }
        catch (Exception exception) {
            try {
                Collection collection;
                block14: {
                    Type type = new TypeToken<List<? extends IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>>(){}.getType();
                    Object object = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll.fromJson(param1, type);
                    Intrinsics.checkNotNullExpressionValue((Object)object, (String)"fromJson(...)");
                    List list = (List)object;
                    Iterable iterable = list;
                    boolean bl5 = false;
                    Iterable iterable3 = iterable;
                    Collection collection4 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
                    boolean bl6 = false;
                    for (Object t : iterable3) {
                        collection = collection4;
                        IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)t;
                        if (bl) {
                            Collection collection5 = collection;
                            boolean bl7 = false;
                            collection5.add(new IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll(new BlockPos(illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(), illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b(), illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c()), IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI));
                            if (bl) continue;
                            break;
                        }
                        break block14;
                    }
                    collection = CollectionsKt.toCollection((Iterable)((List)collection4), (Collection)new ArrayList());
                }
                return (ArrayList)collection;
            }
            catch (Exception exception2) {
                return null;
            }
        }
   }

   public void a(@NotNull String[] param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q ()Z
      // 003: aload 1
      // 004: sipush 27991
      // 007: sipush -19488
      // 00a: pop2
      // 00b: ldc_w "msg"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: istore 2
      // 012: aload 1
      // 013: arraylength
      // 014: iload 2
      // 015: ifeq 023
      // 018: ifne 026
      // 01b: goto 022
      // 01e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 021: athrow
      // 022: bipush 1
      // 023: goto 027
      // 026: bipush 0
      // 027: ifeq 033
      // 02a: aload 0
      // 02b: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 02e: return
      // 02f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 032: athrow
      // 033: aload 1
      // 034: bipush 0
      // 035: aaload
      // 036: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 039: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 03c: dup
      // 03d: sipush 27921
      // 040: sipush -15506
      // 043: pop2
      // 044: ldc_w "toLowerCase(...)"
      // 047: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 04a: astore 3
      // 04b: aload 0
      // 04c: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 04f: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 052: iload 2
      // 053: ifeq 06e
      // 056: if_acmpeq 071
      // 059: goto 060
      // 05c: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 064: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 067: goto 06e
      // 06a: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06d: athrow
      // 06e: if_acmpne 194
      // 071: aload 3
      // 072: astore 4
      // 074: aload 4
      // 076: sipush 27960
      // 079: sipush -21898
      // 07c: pop2
      // 07d: ldc_w "createfolder"
      // 080: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 083: iload 2
      // 084: ifeq 113
      // 087: ifeq 104
      // 08a: goto 091
      // 08d: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 090: athrow
      // 091: aload 1
      // 092: iload 2
      // 093: ifeq 0b3
      // 096: goto 09d
      // 099: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09c: athrow
      // 09d: arraylength
      // 09e: bipush 2
      // 09f: if_icmpge 0b2
      // 0a2: goto 0a9
      // 0a5: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 0
      // 0aa: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 0ad: return
      // 0ae: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b1: athrow
      // 0b2: aload 1
      // 0b3: bipush 1
      // 0b4: aaload
      // 0b5: astore 5
      // 0b7: aload 0
      // 0b8: iload 2
      // 0b9: ifeq 0d3
      // 0bc: aload 5
      // 0be: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.c (Ljava/lang/String;)Z
      // 0c1: ifne 0da
      // 0c4: goto 0cb
      // 0c7: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 0
      // 0cc: goto 0d3
      // 0cf: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d2: athrow
      // 0d3: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 0d6: iload 2
      // 0d7: ifne 103
      // 0da: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 0dd: ldc2_w 5000
      // 0e0: aload 0
      // 0e1: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 0e4: aload 5
      // 0e6: sipush 27909
      // 0e9: sipush -17620
      // 0ec: pop2
      // 0ed: ldc_w "Created folder "
      // 0f0: swap
      // 0f1: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 0f6: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 0f9: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 0fc: goto 103
      // 0ff: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 102: athrow
      // 103: return
      // 104: aload 4
      // 106: sipush 27954
      // 109: sipush -1115
      // 10c: pop2
      // 10d: ldc_w "deletefolder"
      // 110: invokestatic kotlin/jvm/internal/Intrinsics.areEqual (Ljava/lang/Object;Ljava/lang/Object;)Z
      // 113: iload 2
      // 114: ifeq 19c
      // 117: ifeq 194
      // 11a: goto 121
      // 11d: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 120: athrow
      // 121: aload 1
      // 122: iload 2
      // 123: ifeq 143
      // 126: goto 12d
      // 129: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 12c: athrow
      // 12d: arraylength
      // 12e: bipush 2
      // 12f: if_icmpge 142
      // 132: goto 139
      // 135: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: aload 0
      // 13a: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 13d: return
      // 13e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 141: athrow
      // 142: aload 1
      // 143: bipush 1
      // 144: aaload
      // 145: astore 5
      // 147: aload 0
      // 148: iload 2
      // 149: ifeq 163
      // 14c: aload 5
      // 14e: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.d (Ljava/lang/String;)Z
      // 151: ifne 16a
      // 154: goto 15b
      // 157: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15a: athrow
      // 15b: aload 0
      // 15c: goto 163
      // 15f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 162: athrow
      // 163: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 166: iload 2
      // 167: ifne 193
      // 16a: getstatic me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII;
      // 16d: ldc2_w 5000
      // 170: aload 0
      // 171: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 174: aload 5
      // 176: sipush 28025
      // 179: sipush -21835
      // 17c: pop2
      // 17d: ldc_w "Deleted folder "
      // 180: swap
      // 181: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
      // 186: getstatic me/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
      // 189: invokevirtual me/octo/client/utils/IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.b (JLjava/lang/String;Ljava/lang/String;Lme/octo/client/utils/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;)V
      // 18c: goto 193
      // 18f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 192: athrow
      // 193: return
      // 194: aload 3
      // 195: astore 4
      // 197: aload 4
      // 199: invokevirtual java/lang/String.hashCode ()I
      // 19c: iload 2
      // 19d: ifeq 206
      // 1a0: lookupswitch 942 8 -1352294148 219 -1184795739 144 -1104412802 169 -934610812 269 96417 80 3059573 244 3198785 119 94746189 194
      // 1ec: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: aload 4
      // 1f2: sipush 27933
      // 1f5: sipush -25654
      // 1f8: pop2
      // 1f9: ldc_w "add"
      // 1fc: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1ff: goto 206
      // 202: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 205: athrow
      // 206: iload 2
      // 207: ifeq 4a2
      // 20a: ifne 499
      // 20d: goto 214
      // 210: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 213: athrow
      // 214: goto 54e
      // 217: aload 4
      // 219: sipush 28001
      // 21c: sipush 30812
      // 21f: pop2
      // 220: ldc_w "help"
      // 223: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 226: ifne 2cd
      // 229: goto 54e
      // 22c: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22f: athrow
      // 230: aload 4
      // 232: sipush 27924
      // 235: sipush 29270
      // 238: pop2
      // 239: ldc_w "import"
      // 23c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 23f: ifne 2e4
      // 242: goto 54e
      // 245: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 248: athrow
      // 249: aload 4
      // 24b: sipush 28019
      // 24e: sipush -2741
      // 251: pop2
      // 252: ldc_w "deleteroute"
      // 255: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 258: ifne 3c9
      // 25b: goto 54e
      // 25e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 261: athrow
      // 262: aload 4
      // 264: sipush 28026
      // 267: sipush -10005
      // 26a: pop2
      // 26b: ldc_w "clear"
      // 26e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 271: ifne 53f
      // 274: goto 54e
      // 277: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 27a: athrow
      // 27b: aload 4
      // 27d: sipush 27945
      // 280: sipush 5302
      // 283: pop2
      // 284: ldc_w "create"
      // 287: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28a: ifne 2f9
      // 28d: goto 54e
      // 290: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 293: athrow
      // 294: aload 4
      // 296: sipush 28013
      // 299: sipush -3537
      // 29c: pop2
      // 29d: ldc_w "copy"
      // 2a0: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a3: ifne 2d5
      // 2a6: goto 54e
      // 2a9: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ac: athrow
      // 2ad: aload 4
      // 2af: sipush 28005
      // 2b2: sipush 26512
      // 2b5: pop2
      // 2b6: ldc_w "remove"
      // 2b9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2bc: iload 2
      // 2bd: ifeq 51b
      // 2c0: ifne 507
      // 2c3: goto 2ca
      // 2c6: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c9: athrow
      // 2ca: goto 54e
      // 2cd: aload 0
      // 2ce: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.A ()V
      // 2d1: iload 2
      // 2d2: ifne 559
      // 2d5: aload 0
      // 2d6: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.x ()V
      // 2d9: iload 2
      // 2da: ifne 559
      // 2dd: goto 2e4
      // 2e0: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e3: athrow
      // 2e4: aload 0
      // 2e5: getstatic me/octo/client/utils/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Lme/octo/client/utils/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
      // 2e8: invokevirtual me/octo/client/utils/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.g ()Ljava/lang/String;
      // 2eb: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.b (Ljava/lang/String;)V
      // 2ee: iload 2
      // 2ef: ifne 559
      // 2f2: goto 2f9
      // 2f5: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f8: athrow
      // 2f9: aload 0
      // 2fa: iload 2
      // 2fb: ifeq 31d
      // 2fe: goto 305
      // 301: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 304: athrow
      // 305: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 308: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 30b: if_acmpeq 321
      // 30e: goto 315
      // 311: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 314: athrow
      // 315: aload 0
      // 316: goto 31d
      // 319: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31c: athrow
      // 31d: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 320: return
      // 321: aload 1
      // 322: iload 2
      // 323: ifeq 33c
      // 326: arraylength
      // 327: bipush 2
      // 328: if_icmpge 33b
      // 32b: goto 332
      // 32e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 331: athrow
      // 332: aload 0
      // 333: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 336: return
      // 337: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33a: athrow
      // 33b: aload 1
      // 33c: bipush 1
      // 33d: aaload
      // 33e: astore 5
      // 340: aload 0
      // 341: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.K ()Lme/octo/client/IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII;
      // 344: astore 6
      // 346: aload 6
      // 348: iload 2
      // 349: ifeq 36b
      // 34c: ifnonnull 369
      // 34f: goto 356
      // 352: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 355: athrow
      // 356: aload 0
      // 357: sipush 27943
      // 35a: sipush 21251
      // 35d: pop2
      // 35e: ldc_w "No file setting is linked to this editor."
      // 361: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 364: return
      // 365: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 368: athrow
      // 369: aload 6
      // 36b: aload 5
      // 36d: invokevirtual me/octo/client/IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.h (Ljava/lang/String;)Z
      // 370: ifne 39e
      // 373: aload 0
      // 374: aload 5
      // 376: sipush 27904
      // 379: sipush -14636
      // 37c: pop2
      // 37d: ldc_w "Couldn't create route '"
      // 380: swap
      // 381: sipush 28015
      // 384: sipush 3572
      // 387: pop2
      // 388: ldc_w "' (maybe it already exists or name is invalid)."
      // 38b: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 390: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 393: iload 2
      // 394: ifne 559
      // 397: goto 39e
      // 39a: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39d: athrow
      // 39e: aload 0
      // 39f: aload 5
      // 3a1: sipush 27920
      // 3a4: sipush -10378
      // 3a7: pop2
      // 3a8: ldc_w "Created route '"
      // 3ab: swap
      // 3ac: sipush 27910
      // 3af: sipush 27192
      // 3b2: pop2
      // 3b3: ldc_w "'. Select it in the GUI to start editing."
      // 3b6: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 3bb: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 3be: iload 2
      // 3bf: ifne 559
      // 3c2: goto 3c9
      // 3c5: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c8: athrow
      // 3c9: aload 0
      // 3ca: iload 2
      // 3cb: ifeq 3ed
      // 3ce: goto 3d5
      // 3d1: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d4: athrow
      // 3d5: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 3d8: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
      // 3db: if_acmpeq 3f1
      // 3de: goto 3e5
      // 3e1: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e4: athrow
      // 3e5: aload 0
      // 3e6: goto 3ed
      // 3e9: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ec: athrow
      // 3ed: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 3f0: return
      // 3f1: aload 1
      // 3f2: iload 2
      // 3f3: ifeq 40c
      // 3f6: arraylength
      // 3f7: bipush 2
      // 3f8: if_icmpge 40b
      // 3fb: goto 402
      // 3fe: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 401: athrow
      // 402: aload 0
      // 403: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 406: return
      // 407: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40a: athrow
      // 40b: aload 1
      // 40c: bipush 1
      // 40d: aaload
      // 40e: astore 5
      // 410: aload 0
      // 411: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.K ()Lme/octo/client/IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII;
      // 414: astore 6
      // 416: aload 6
      // 418: iload 2
      // 419: ifeq 43b
      // 41c: ifnonnull 439
      // 41f: goto 426
      // 422: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 425: athrow
      // 426: aload 0
      // 427: sipush 27923
      // 42a: sipush 22540
      // 42d: pop2
      // 42e: ldc_w "No file setting is linked to this editor."
      // 431: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 434: return
      // 435: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 438: athrow
      // 439: aload 6
      // 43b: aload 5
      // 43d: invokevirtual me/octo/client/IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII.i (Ljava/lang/String;)Z
      // 440: ifne 46e
      // 443: aload 0
      // 444: aload 5
      // 446: sipush 28016
      // 449: sipush -19703
      // 44c: pop2
      // 44d: ldc_w "Couldn't delete route '"
      // 450: swap
      // 451: sipush 27956
      // 454: sipush 18792
      // 457: pop2
      // 458: ldc_w "'."
      // 45b: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 460: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 463: iload 2
      // 464: ifne 559
      // 467: goto 46e
      // 46a: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46d: athrow
      // 46e: aload 0
      // 46f: aload 5
      // 471: sipush 27911
      // 474: sipush -8419
      // 477: pop2
      // 478: ldc_w "Deleted route '"
      // 47b: swap
      // 47c: sipush 27934
      // 47f: sipush 11501
      // 482: pop2
      // 483: ldc_w "'."
      // 486: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 48b: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.l (Ljava/lang/String;)V
      // 48e: iload 2
      // 48f: ifne 559
      // 492: goto 499
      // 495: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 498: athrow
      // 499: aload 1
      // 49a: arraylength
      // 49b: goto 4a2
      // 49e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a1: athrow
      // 4a2: bipush 2
      // 4a3: if_icmpge 4af
      // 4a6: aload 0
      // 4a7: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 4aa: return
      // 4ab: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ae: athrow
      // 4af: aload 0
      // 4b0: aload 1
      // 4b1: bipush 1
      // 4b2: aaload
      // 4b3: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.j (Ljava/lang/String;)Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 4b6: astore 5
      // 4b8: iload 2
      // 4b9: ifeq 4d3
      // 4bc: aload 5
      // 4be: ifnonnull 4d4
      // 4c1: goto 4c8
      // 4c4: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c7: athrow
      // 4c8: aload 0
      // 4c9: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 4cc: goto 4d3
      // 4cf: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4d2: athrow
      // 4d3: return
      // 4d4: aload 1
      // 4d5: iload 2
      // 4d6: ifeq 4ed
      // 4d9: arraylength
      // 4da: bipush 2
      // 4db: if_icmple 4f5
      // 4de: goto 4e5
      // 4e1: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4e4: athrow
      // 4e5: aload 1
      // 4e6: goto 4ed
      // 4e9: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4ec: athrow
      // 4ed: bipush 2
      // 4ee: aaload
      // 4ef: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // 4f2: goto 4f6
      // 4f5: aconst_null
      // 4f6: astore 6
      // 4f8: aload 0
      // 4f9: aload 5
      // 4fb: aload 6
      // 4fd: aconst_null
      // 4fe: bipush 4
      // 4ff: aconst_null
      // 500: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;Ljava/lang/Integer;Lnet/minecraft/core/BlockPos;ILjava/lang/Object;)V
      // 503: iload 2
      // 504: ifne 559
      // 507: aload 1
      // 508: iload 2
      // 509: ifeq 527
      // 50c: goto 513
      // 50f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 512: athrow
      // 513: arraylength
      // 514: goto 51b
      // 517: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 51a: athrow
      // 51b: bipush 1
      // 51c: if_icmple 52f
      // 51f: aload 1
      // 520: goto 527
      // 523: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 526: athrow
      // 527: bipush 1
      // 528: aaload
      // 529: invokestatic kotlin/text/StringsKt.toIntOrNull (Ljava/lang/String;)Ljava/lang/Integer;
      // 52c: goto 530
      // 52f: aconst_null
      // 530: astore 5
      // 532: aload 0
      // 533: aload 5
      // 535: aconst_null
      // 536: bipush 2
      // 537: aconst_null
      // 538: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Lme/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII;Ljava/lang/Integer;Lnet/minecraft/core/BlockPos;ILjava/lang/Object;)V
      // 53b: iload 2
      // 53c: ifne 559
      // 53f: aload 0
      // 540: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.w ()V
      // 543: iload 2
      // 544: ifne 559
      // 547: goto 54e
      // 54a: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54d: athrow
      // 54e: aload 0
      // 54f: invokespecial me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.L ()V
      // 552: goto 559
      // 555: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 558: athrow
      // 559: return
   }

   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI j(String var1) {
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2;
      try {
         me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         String var10001 = var1.toUpperCase(Locale.ROOT);
         short var10003 = 27957;
         short var10004 = 1455;
         Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
         var2 = var10000.a(var10001);

         label21: { Object var7 = null; // PX-FIX hoist
        
       var7 = null; // PX-FIX
            try {
               if (CollectionsKt.contains(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, var2)) {
                  var7 = var2;
                  break label21;
               }
            } catch (IllegalArgumentException var4) {
               throw (RuntimeException)a(var4);
            }

            var7 = null;
         }

         var2 = ((IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI)(Object)(var7));
      } catch (IllegalArgumentException var5) {
         var2 = null;
      }

      return var2;
   }

   public void A() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Ljava/lang/String;
      // 004: sipush 28014
      // 007: sipush 32754
      // 00a: pop2
      // 00b: ldc_w "Basic "
      // 00e: swap
      // 00f: sipush 27935
      // 012: sipush -3626
      // 015: pop2
      // 016: ldc_w " commands"
      // 019: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 01e: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 021: aload 0
      // 022: aload 0
      // 023: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 026: ldc_w "/"
      // 029: swap
      // 02a: sipush 27994
      // 02d: sipush 28621
      // 030: pop2
      // 031: ldc_w " help - Gives a list of possible commands"
      // 034: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 039: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 03c: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R ()Z
      // 03f: aload 0
      // 040: aload 0
      // 041: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 044: ldc_w "/"
      // 047: swap
      // 048: sipush 27936
      // 04b: sipush -2433
      // 04e: pop2
      // 04f: ldc_w " create [name] - Creates a new route file"
      // 052: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 057: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 05a: aload 0
      // 05b: aload 0
      // 05c: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 05f: ldc_w "/"
      // 062: swap
      // 063: sipush 27980
      // 066: sipush 24135
      // 069: pop2
      // 06a: ldc_w " deleteroute [name] - Deletes an existing route file"
      // 06d: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 072: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 075: istore 1
      // 076: aload 0
      // 077: aload 0
      // 078: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 07b: ldc_w "/"
      // 07e: swap
      // 07f: sipush 27916
      // 082: sipush 16588
      // 085: pop2
      // 086: ldc_w " copy - Copies route to clipboard"
      // 089: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 08e: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 091: aload 0
      // 092: aload 0
      // 093: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 096: ldc_w "/"
      // 099: swap
      // 09a: sipush 27947
      // 09d: sipush -1413
      // 0a0: pop2
      // 0a1: ldc_w " import - Import route from clipboard"
      // 0a4: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0a9: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 0ac: sipush 27989
      // 0af: sipush -31537
      // 0b2: pop2
      // 0b3: ldc_w "Route editing commands"
      // 0b6: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 0b9: aload 0
      // 0ba: aload 0
      // 0bb: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 0be: ldc_w "/"
      // 0c1: swap
      // 0c2: sipush 28018
      // 0c5: sipush 31268
      // 0c8: pop2
      // 0c9: ldc_w " clear - Removes all waypoints"
      // 0cc: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 0d1: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 0d4: aload 0
      // 0d5: aload 0
      // 0d6: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 0d9: aload 0
      // 0da: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/List;
      // 0dd: checkcast java/lang/Iterable
      // 0e0: ldc_w "/"
      // 0e3: checkcast java/lang/CharSequence
      // 0e6: aconst_null
      // 0e7: aconst_null
      // 0e8: bipush 0
      // 0e9: aconst_null
      // 0ea: invokedynamic invoke ()Lkotlin/jvm/functions/Function1; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;)Ljava/lang/CharSequence;, (Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;)Ljava/lang/CharSequence; ]
      // 0ef: bipush 30
      // 0f1: aconst_null
      // 0f2: invokestatic kotlin/collections/CollectionsKt.joinToString$default (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
      // 0f5: ldc_w "/"
      // 0f8: dup_x2
      // 0f9: pop
      // 0fa: sipush 27995
      // 0fd: bipush 103
      // 0ff: pop2
      // 100: ldc_w " add "
      // 103: swap
      // 104: sipush 27905
      // 107: sipush 28981
      // 10a: pop2
      // 10b: ldc_w " [number (optional)]"
      // 10e: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001\u0001\u0001" ]
      // 113: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 116: aload 0
      // 117: aload 0
      // 118: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll Ljava/lang/String;
      // 11b: ldc_w "/"
      // 11e: swap
      // 11f: sipush 27961
      // 122: sipush -4319
      // 125: pop2
      // 126: ldc_w " remove [number (optional)]"
      // 129: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 12e: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 131: aload 0
      // 132: sipush 27999
      // 135: sipush -28026
      // 138: pop2
      // 139: ldc_w "[number] is at which waypoint number the waypoint will be added or inserted"
      // 13c: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 13f: sipush 27941
      // 142: sipush -15777
      // 145: pop2
      // 146: ldc_w "Allowed waypoint types"
      // 149: invokestatic me/octo/client/utils/player/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c (Ljava/lang/String;)V
      // 14c: aload 0
      // 14d: getfield me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI Ljava/util/List;
      // 150: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 155: astore 2
      // 156: aload 2
      // 157: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 15c: ifeq 290
      // 15f: aload 2
      // 160: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 165: checkcast me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
      // 168: astore 3
      // 169: iload 1
      // 16a: ifne 1c9
      // 16d: aload 3
      // 16e: getstatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII [I
      // 171: swap
      // 172: invokevirtual me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.ordinal ()I
      // 175: iaload
      // 176: tableswitch 274 1 11 112 256 62 94 130 148 166 184 202 220 238
      // 1b0: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: sipush 27932
      // 1b8: sipush 18183
      // 1bb: pop2
      // 1bc: ldc_w "walk is for pathfinding to the waypoint"
      // 1bf: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 1c2: goto 1c9
      // 1c5: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c8: athrow
      // 1c9: iload 1
      // 1ca: ifeq 156
      // 1cd: bipush 4
      // 1ce: anewarray 1157
      // 1d1: invokestatic me/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.b ([Lme/octo/client/utils/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;)V
      // 1d4: aload 0
      // 1d5: sipush 27944
      // 1d8: sipush -1956
      // 1db: pop2
      // 1dc: ldc_w "warp is for etherwarping to the waypoint"
      // 1df: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 1e2: iload 1
      // 1e3: ifeq 156
      // 1e6: aload 0
      // 1e7: sipush 27981
      // 1ea: sipush 17196
      // 1ed: pop2
      // 1ee: ldc_w "mine is for mining the block the mine waypoint highlights"
      // 1f1: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 1f4: iload 1
      // 1f5: ifeq 156
      // 1f8: aload 0
      // 1f9: sipush 27930
      // 1fc: sipush 12893
      // 1ff: pop2
      // 200: ldc_w "vein is for starting mining when the previous waypoint has been reached"
      // 203: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 206: iload 1
      // 207: ifeq 156
      // 20a: aload 0
      // 20b: sipush 27942
      // 20e: sipush 2243
      // 211: pop2
      // 212: ldc_w "tree is for starting tree mining when the previous waypoint has been reached"
      // 215: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 218: iload 1
      // 219: ifeq 156
      // 21c: aload 0
      // 21d: sipush 28031
      // 220: sipush -27833
      // 223: pop2
      // 224: ldc_w "heat is for a cooling off waypoint"
      // 227: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 22a: iload 1
      // 22b: ifeq 156
      // 22e: aload 0
      // 22f: sipush 27913
      // 232: sipush 14759
      // 235: pop2
      // 236: ldc_w "rotation adds the final rotation to your route (i.e. fishing route)"
      // 239: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 23c: iload 1
      // 23d: ifeq 156
      // 240: aload 0
      // 241: sipush 27958
      // 244: sipush -27514
      // 247: pop2
      // 248: ldc_w "line is for walking to the waypoint without rotation control"
      // 24b: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 24e: iload 1
      // 24f: ifeq 156
      // 252: aload 0
      // 253: sipush 27908
      // 256: sipush -28113
      // 259: pop2
      // 25a: ldc_w "orb is for placing an orb on the waypoint"
      // 25d: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 260: iload 1
      // 261: ifeq 156
      // 264: aload 0
      // 265: sipush 27914
      // 268: sipush 4006
      // 26b: pop2
      // 26c: ldc_w "lantern is for placing a lantern on the waypoint"
      // 26f: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 272: iload 1
      // 273: ifeq 156
      // 276: aload 0
      // 277: sipush 27963
      // 27a: sipush 9991
      // 27d: pop2
      // 27e: ldc_w "last_mine is the last block that gets mined at a gemstone vein"
      // 281: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.m (Ljava/lang/String;)V
      // 284: iload 1
      // 285: ifeq 156
      // 288: new kotlin/NoWhenBranchMatchedException
      // 28b: dup
      // 28c: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 28f: athrow
      // 290: return
   }

   public void a(
      @NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> var1,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3,
      float var4
   ) {
      short var10001 = 27996;
      short var10002 = 32501;
      Intrinsics.checkNotNullParameter(var1, "route");
      var10001 = 28007;
      var10002 = -4343;
      Intrinsics.checkNotNullParameter(var2, "filledColor");
      var10001 = 27970;
      var10002 = 11730;
      Intrinsics.checkNotNullParameter(var3, "outlinedColor");
      a(this, null, var1, var2, var3, var4, false);
   }

   public void a(
      @Nullable PoseStack param1,
      @NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> param2,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param3,
      @NotNull llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll param4,
      float param5,
      boolean param6
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q ()Z
      // 003: aload 2
      // 004: sipush 27983
      // 007: sipush -1416
      // 00a: pop2
      // 00b: ldc_w "route"
      // 00e: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 011: aload 3
      // 012: sipush 28083
      // 015: bipush -89
      // 017: pop2
      // 018: ldc_w "filledColor"
      // 01b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 01e: istore 7
      // 020: aload 4
      // 022: sipush 27922
      // 025: sipush -419
      // 028: pop2
      // 029: ldc_w "outlinedColor"
      // 02c: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 02f: dconst_0
      // 030: dstore 30
      // 032: dconst_1
      // 033: dstore 30
      // 035: new java/util/ArrayList
      // 038: dup
      // 039: invokespecial java/util/ArrayList.<init> ()V
      // 03c: astore 8
      // 03e: iload 6
      // 040: ifeq 057
      // 043: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 046: dup
      // 047: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 04a: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.f ()I
      // 04d: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 050: goto 067
      // 053: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 056: athrow
      // 057: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 05a: dup
      // 05b: aload 3
      // 05c: fload 5
      // 05e: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 061: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 064: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 067: astore 9
      // 069: iload 6
      // 06b: ifeq 082
      // 06e: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 071: dup
      // 072: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 075: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.g ()I
      // 078: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 07b: goto 08e
      // 07e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 081: athrow
      // 082: new me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll
      // 085: dup
      // 086: aload 4
      // 088: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 08b: invokespecial me/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll.<init> (I)V
      // 08e: astore 10
      // 090: aload 1
      // 091: ifnull 2bf
      // 094: aload 0
      // 095: invokevirtual me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.H ()Z
      // 098: iload 7
      // 09a: ifeq 2c1
      // 09d: goto 0a4
      // 0a0: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a3: athrow
      // 0a4: ifeq 2bf
      // 0a7: goto 0ae
      // 0aa: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ad: athrow
      // 0ae: aload 2
      // 0af: invokevirtual java/util/ArrayList.size ()I
      // 0b2: iload 7
      // 0b4: ifeq 2c1
      // 0b7: goto 0be
      // 0ba: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: bipush 1
      // 0bf: if_icmple 2bf
      // 0c2: goto 0c9
      // 0c5: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c8: athrow
      // 0c9: iload 6
      // 0cb: iload 7
      // 0cd: ifeq 0ee
      // 0d0: goto 0d7
      // 0d3: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: ifeq 0f1
      // 0da: goto 0e1
      // 0dd: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e0: athrow
      // 0e1: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 0e4: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.i ()I
      // 0e7: goto 0ee
      // 0ea: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ed: athrow
      // 0ee: goto 0fc
      // 0f1: aload 4
      // 0f3: ldc_w 0.85
      // 0f6: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.a (F)Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 0f9: invokevirtual me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.o ()I
      // 0fc: istore 11
      // 0fe: aload 1
      // 0ff: astore 12
      // 101: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 104: invokevirtual net/minecraft/client/Minecraft.getMainRenderTarget ()Lcom/mojang/blaze3d/pipeline/RenderTarget;
      // 107: dup
      // 108: sipush 28006
      // 10b: sipush -9292
      // 10e: pop2
      // 10f: ldc_w "getMainRenderTarget(...)"
      // 112: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 115: astore 13
      // 117: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 11a: astore 14
      // 11c: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 11f: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 122: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 125: dup
      // 126: sipush 27952
      // 129: sipush 20531
      // 12c: pop2
      // 12d: ldc_w "getMainCamera(...)"
      // 130: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 133: astore 15
      // 135: bipush 0
      // 136: istore 16
      // 138: sipush 2848
      // 13b: invokestatic org/lwjgl/opengl/GL11C.glEnable (I)V
      // 13e: getstatic me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 141: aload 13
      // 143: aload 12
      // 145: aload 15
      // 147: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b (Lcom/mojang/blaze3d/pipeline/RenderTarget;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/Camera;)Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
      // 14a: astore 17
      // 14c: nop
      // 14d: aload 14
      // 14f: getstatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl [I
      // 152: swap
      // 153: invokevirtual me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.ordinal ()I
      // 156: iaload
      // 157: tableswitch 317 1 2 21 169
      // 16c: aload 17
      // 16e: astore 18
      // 170: bipush 0
      // 171: istore 19
      // 173: aload 18
      // 175: astore 20
      // 177: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 17a: astore 21
      // 17c: bipush 0
      // 17d: istore 22
      // 17f: aload 20
      // 181: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 184: astore 23
      // 186: aload 20
      // 188: aload 21
      // 18a: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 18d: nop
      // 18e: aload 20
      // 190: astore 24
      // 192: bipush 0
      // 193: istore 25
      // 195: bipush 0
      // 196: istore 26
      // 198: aload 2
      // 199: checkcast java/util/List
      // 19c: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 19f: istore 27
      // 1a1: iload 26
      // 1a3: iload 27
      // 1a5: if_icmpge 1e1
      // 1a8: aload 24
      // 1aa: aload 2
      // 1ab: iload 26
      // 1ad: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1b0: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 1b3: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.c ()Lnet/minecraft/world/phys/Vec3;
      // 1b6: aload 2
      // 1b7: iload 26
      // 1b9: bipush 1
      // 1ba: iadd
      // 1bb: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 1be: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 1c1: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.c ()Lnet/minecraft/world/phys/Vec3;
      // 1c4: iload 11
      // 1c6: ldc_w 5.0
      // 1c9: bipush 1
      // 1ca: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.b (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IFZ)V
      // 1cd: iinc 26 1
      // 1d0: iload 7
      // 1d2: ifeq 1ea
      // 1d5: iload 7
      // 1d7: ifne 1a1
      // 1da: goto 1e1
      // 1dd: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e0: athrow
      // 1e1: nop
      // 1e2: nop
      // 1e3: aload 20
      // 1e5: aload 23
      // 1e7: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1ea: goto 1f9
      // 1ed: astore 28
      // 1ef: aload 20
      // 1f1: aload 23
      // 1f3: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 1f6: aload 28
      // 1f8: athrow
      // 1f9: nop
      // 1fa: nop
      // 1fb: iload 7
      // 1fd: ifne 2a0
      // 200: aload 17
      // 202: astore 18
      // 204: bipush 0
      // 205: istore 19
      // 207: aload 18
      // 209: astore 20
      // 20b: getstatic me/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 20e: astore 21
      // 210: bipush 0
      // 211: istore 22
      // 213: aload 20
      // 215: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.d ()Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
      // 218: astore 23
      // 21a: aload 20
      // 21c: aload 21
      // 21e: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 221: nop
      // 222: aload 20
      // 224: astore 24
      // 226: bipush 0
      // 227: istore 25
      // 229: bipush 0
      // 22a: istore 26
      // 22c: aload 2
      // 22d: checkcast java/util/List
      // 230: invokestatic kotlin/collections/CollectionsKt.getLastIndex (Ljava/util/List;)I
      // 233: istore 27
      // 235: iload 26
      // 237: iload 27
      // 239: if_icmpge 275
      // 23c: aload 24
      // 23e: aload 2
      // 23f: iload 26
      // 241: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 244: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 247: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.c ()Lnet/minecraft/world/phys/Vec3;
      // 24a: aload 2
      // 24b: iload 26
      // 24d: bipush 1
      // 24e: iadd
      // 24f: invokevirtual java/util/ArrayList.get (I)Ljava/lang/Object;
      // 252: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 255: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.c ()Lnet/minecraft/world/phys/Vec3;
      // 258: iload 11
      // 25a: ldc_w 5.0
      // 25d: bipush 1
      // 25e: invokestatic me/octo/client/lllIIIlIIIlllllIllIIIllllIlIlIIIIllIIlIIIlIlIIlIllIlllIIllIlIlIIlllIIIlIlIIIIIlllllll.b (Lme/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;IFZ)V
      // 261: iinc 26 1
      // 264: iload 7
      // 266: ifeq 27e
      // 269: iload 7
      // 26b: ifne 235
      // 26e: goto 275
      // 271: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 274: athrow
      // 275: nop
      // 276: nop
      // 277: aload 20
      // 279: aload 23
      // 27b: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 27e: goto 28d
      // 281: astore 28
      // 283: aload 20
      // 285: aload 23
      // 287: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.a (Lme/octo/client/IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;)V
      // 28a: aload 28
      // 28c: athrow
      // 28d: nop
      // 28e: nop
      // 28f: iload 7
      // 291: ifne 2a0
      // 294: new kotlin/NoWhenBranchMatchedException
      // 297: dup
      // 298: invokespecial kotlin/NoWhenBranchMatchedException.<init> ()V
      // 29b: athrow
      // 29c: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 29f: athrow
      // 2a0: aload 17
      // 2a2: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 2a5: sipush 2848
      // 2a8: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 2ab: goto 2be
      // 2ae: astore 29
      // 2b0: aload 17
      // 2b2: invokevirtual me/octo/client/IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.f ()V
      // 2b5: sipush 2848
      // 2b8: invokestatic org/lwjgl/opengl/GL11C.glDisable (I)V
      // 2bb: aload 29
      // 2bd: athrow
      // 2be: nop
      // 2bf: iload 6
      // 2c1: iload 7
      // 2c3: ifeq 2ed
      // 2c6: ifeq 2ec
      // 2c9: goto 2d0
      // 2cc: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cf: athrow
      // 2d0: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 2d3: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.c ()Z
      // 2d6: iload 7
      // 2d8: ifeq 2ed
      // 2db: goto 2e2
      // 2de: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e1: athrow
      // 2e2: ifeq 2f0
      // 2e5: goto 2ec
      // 2e8: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2eb: athrow
      // 2ec: bipush 1
      // 2ed: goto 2f1
      // 2f0: bipush 0
      // 2f1: istore 11
      // 2f3: aload 2
      // 2f4: checkcast java/lang/Iterable
      // 2f7: invokestatic kotlin/collections/CollectionsKt.withIndex (Ljava/lang/Iterable;)Ljava/lang/Iterable;
      // 2fa: astore 12
      // 2fc: bipush 0
      // 2fd: istore 13
      // 2ff: aload 12
      // 301: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 306: astore 14
      // 308: aload 14
      // 30a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 30f: ifeq 62b
      // 312: aload 14
      // 314: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 319: astore 15
      // 31b: aload 15
      // 31d: checkcast kotlin/collections/IndexedValue
      // 320: astore 16
      // 322: bipush 0
      // 323: istore 17
      // 325: aload 16
      // 327: invokevirtual kotlin/collections/IndexedValue.component1 ()I
      // 32a: istore 18
      // 32c: aload 16
      // 32e: invokevirtual kotlin/collections/IndexedValue.component2 ()Ljava/lang/Object;
      // 331: checkcast me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll
      // 334: astore 19
      // 336: aload 19
      // 338: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.a ()Lnet/minecraft/core/BlockPos;
      // 33b: astore 20
      // 33d: aload 20
      // 33f: aload 9
      // 341: aload 10
      // 343: ldc_w 4.0
      // 346: aconst_null
      // 347: aconst_null
      // 348: fconst_0
      // 349: bipush 0
      // 34a: fconst_0
      // 34b: sipush 496
      // 34e: aconst_null
      // 34f: invokestatic me/octo/client/IIIIIlIllIlllIlllIIIIlIIIIlIllllIIllIIIIIlllIllIllllIIllllIllllllIIIIIlIlIlIIlIlIIIll.a (Lnet/minecraft/core/BlockPos;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FLme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;Lme/octo/client/llllllIllIlllIllIllllIIllIlllIIIlIIIlllIIllIIIIllIIlllIIlIlIllIllIIIlIllIIIIllIIlIIll;FZFILjava/lang/Object;)V
      // 352: aload 8
      // 354: checkcast java/lang/Iterable
      // 357: astore 21
      // 359: bipush 0
      // 35a: istore 22
      // 35c: iload 7
      // 35e: ifeq 62c
      // 361: aload 21
      // 363: iload 7
      // 365: ifeq 3a6
      // 368: goto 36f
      // 36b: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36e: athrow
      // 36f: instanceof java/util/Collection
      // 372: ifeq 3a4
      // 375: goto 37c
      // 378: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37b: athrow
      // 37c: aload 21
      // 37e: checkcast java/util/Collection
      // 381: iload 7
      // 383: ifeq 3a6
      // 386: goto 38d
      // 389: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38c: athrow
      // 38d: invokeinterface java/util/Collection.isEmpty ()Z 1
      // 392: ifeq 3a4
      // 395: goto 39c
      // 398: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 39b: athrow
      // 39c: bipush 0
      // 39d: goto 433
      // 3a0: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3a3: athrow
      // 3a4: aload 21
      // 3a6: invokeinterface java/lang/Iterable.iterator ()Ljava/util/Iterator; 1
      // 3ab: astore 23
      // 3ad: aload 23
      // 3af: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3b4: ifeq 432
      // 3b7: aload 23
      // 3b9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3be: astore 24
      // 3c0: aload 24
      // 3c2: checkcast net/minecraft/core/BlockPos
      // 3c5: astore 25
      // 3c7: bipush 0
      // 3c8: istore 26
      // 3ca: aload 25
      // 3cc: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 3cf: aload 20
      // 3d1: invokevirtual net/minecraft/core/BlockPos.getX ()I
      // 3d4: iload 7
      // 3d6: ifeq 3ed
      // 3d9: if_icmpne 425
      // 3dc: aload 25
      // 3de: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 3e1: aload 20
      // 3e3: invokevirtual net/minecraft/core/BlockPos.getZ ()I
      // 3e6: goto 3ed
      // 3e9: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ec: athrow
      // 3ed: iload 7
      // 3ef: ifeq 41e
      // 3f2: if_icmpne 425
      // 3f5: goto 3fc
      // 3f8: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3fb: athrow
      // 3fc: aload 25
      // 3fe: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 401: aload 20
      // 403: invokevirtual net/minecraft/core/BlockPos.getY ()I
      // 406: isub
      // 407: invokestatic java/lang/Math.abs (I)I
      // 40a: iload 7
      // 40c: ifeq 422
      // 40f: goto 416
      // 412: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 415: athrow
      // 416: bipush 2
      // 417: goto 41e
      // 41a: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 41d: athrow
      // 41e: if_icmpgt 425
      // 421: bipush 1
      // 422: goto 426
      // 425: bipush 0
      // 426: ifeq 3ad
      // 429: bipush 1
      // 42a: iload 7
      // 42c: ifeq 3cf
      // 42f: goto 433
      // 432: bipush 0
      // 433: ifeq 443
      // 436: dload 30
      // 438: ldc2_w 0.55
      // 43b: dadd
      // 43c: dstore 30
      // 43e: iload 7
      // 440: ifne 446
      // 443: dconst_1
      // 444: dstore 30
      // 446: iload 11
      // 448: iload 7
      // 44a: ifeq 623
      // 44d: ifeq 61c
      // 450: goto 457
      // 453: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 456: athrow
      // 457: iload 18
      // 459: bipush 1
      // 45a: iadd
      // 45b: invokestatic java/lang/String.valueOf (I)Ljava/lang/String;
      // 45e: astore 21
      // 460: aload 19
      // 462: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.b ()Lme/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
      // 465: invokevirtual me/octo/client/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.a ()Ljava/lang/String;
      // 468: astore 22
      // 46a: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 46d: getfield net/minecraft/client/Minecraft.player Lnet/minecraft/client/player/LocalPlayer;
      // 470: astore 23
      // 472: iload 7
      // 474: ifeq 626
      // 477: aload 23
      // 479: ifnull 61c
      // 47c: goto 483
      // 47f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 482: athrow
      // 483: getstatic me/octo/client/utils/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII Lnet/minecraft/client/Minecraft;
      // 486: getfield net/minecraft/client/Minecraft.gameRenderer Lnet/minecraft/client/renderer/GameRenderer;
      // 489: dup
      // 48a: ifnull 4b1
      // 48d: goto 494
      // 490: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 493: athrow
      // 494: invokevirtual net/minecraft/client/renderer/GameRenderer.getMainCamera ()Lnet/minecraft/client/Camera;
      // 497: dup
      // 498: ifnull 4b1
      // 49b: goto 4a2
      // 49e: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4a1: athrow
      // 4a2: invokevirtual net/minecraft/client/Camera.position ()Lnet/minecraft/world/phys/Vec3;
      // 4a5: iload 7
      // 4a7: ifne 4ba
      // 4aa: goto 4b1
      // 4ad: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b0: athrow
      // 4b1: pop
      // 4b2: aconst_null
      // 4b3: goto 4ba
      // 4b6: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4b9: athrow
      // 4ba: astore 24
      // 4bc: aload 24
      // 4be: iload 7
      // 4c0: ifeq 4dc
      // 4c3: ifnull 4e4
      // 4c6: goto 4cd
      // 4c9: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4cc: athrow
      // 4cd: aload 19
      // 4cf: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.a ()Lnet/minecraft/core/BlockPos;
      // 4d2: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 4d5: goto 4dc
      // 4d8: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4db: athrow
      // 4dc: aload 24
      // 4de: invokevirtual net/minecraft/world/phys/Vec3.distanceTo (Lnet/minecraft/world/phys/Vec3;)D
      // 4e1: goto 4f4
      // 4e4: aload 23
      // 4e6: aload 19
      // 4e8: invokevirtual me/octo/client/IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll.a ()Lnet/minecraft/core/BlockPos;
      // 4eb: invokevirtual net/minecraft/core/BlockPos.getCenter ()Lnet/minecraft/world/phys/Vec3;
      // 4ee: invokevirtual net/minecraft/client/player/LocalPlayer.distanceToSqr (Lnet/minecraft/world/phys/Vec3;)D
      // 4f1: invokestatic java/lang/Math.sqrt (D)D
      // 4f4: dstore 27
      // 4f6: iload 6
      // 4f8: iload 7
      // 4fa: ifeq 575
      // 4fd: ifeq 567
      // 500: goto 507
      // 503: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 506: athrow
      // 507: aload 21
      // 509: aload 22
      // 50b: sipush 27986
      // 50e: sipush 15342
      // 511: pop2
      // 512: ldc_w ". "
      // 515: swap
      // 516: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 51b: new net/minecraft/world/phys/Vec3
      // 51e: dup
      // 51f: aload 20
      // 521: checkcast net/minecraft/core/Vec3i
      // 524: invokespecial net/minecraft/world/phys/Vec3.<init> (Lnet/minecraft/core/Vec3i;)V
      // 527: ldc2_w 0.5
      // 52a: dload 30
      // 52c: ldc2_w 0.5
      // 52f: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 532: dup
      // 533: sipush 28030
      // 536: sipush -18495
      // 539: pop2
      // 53a: ldc_w "add(...)"
      // 53d: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 540: fconst_1
      // 541: bipush 0
      // 542: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 545: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.k ()Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 548: aconst_null
      // 549: fconst_0
      // 54a: getstatic me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
      // 54d: dload 27
      // 54f: invokevirtual me/octo/client/lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (D)F
      // 552: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 555: bipush 96
      // 557: aconst_null
      // 558: invokestatic me/octo/client/utils/IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a (Ljava/lang/String;Lnet/minecraft/world/phys/Vec3;FZLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;Lme/octo/client/utils/IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;FLjava/lang/Float;ILjava/lang/Object;)V
      // 55b: iload 7
      // 55d: ifne 61c
      // 560: goto 567
      // 563: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 566: athrow
      // 567: nop
      // 568: dload 27
      // 56a: ldc2_w 10.0
      // 56d: dcmpg
      // 56e: goto 575
      // 571: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 574: athrow
      // 575: iload 7
      // 577: ifeq 5a3
      // 57a: ifgt 591
      // 57d: goto 584
      // 580: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 583: athrow
      // 584: dload 27
      // 586: ldc2_w 10.0
      // 589: ddiv
      // 58a: goto 5c7
      // 58d: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 590: athrow
      // 591: dload 27
      // 593: ldc2_w 30.0
      // 596: iload 7
      // 598: ifeq 5c6
      // 59b: dcmpg
      // 59c: goto 5a3
      // 59f: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5a2: athrow
      // 5a3: ifgt 5b9
      // 5a6: dconst_1
      // 5a7: dload 27
      // 5a9: ldc2_w 10.0
      // 5ac: dsub
      // 5ad: ldc2_w 0.07
      // 5b0: dmul
      // 5b1: dadd
      // 5b2: goto 5c7
      // 5b5: invokestatic me/octo/client/llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5b8: athrow
      // 5b9: ldc2_w 2.6
      // 5bc: dload 27
      // 5be: ldc2_w 30.0
      // 5c1: dsub
      // 5c2: ldc2_w 0.05
      // 5c5: dmul
      // 5c6: dadd
      // 5c7: ldc2_w 0.725
      // 5ca: ldc2_w 5.0
      // 5cd: invokestatic kotlin/ranges/RangesKt.coerceIn (DDD)D
      // 5d0: d2f
      // 5d1: fstore 29
      // 5d3: aload 21
      // 5d5: aload 22
      // 5d7: sipush 27912
      // 5da: sipush -16183
      // 5dd: pop2
      // 5de: ldc_w ". "
      // 5e1: swap
      // 5e2: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001\u0001" ]
      // 5e7: new net/minecraft/world/phys/Vec3
      // 5ea: dup
      // 5eb: aload 20
      // 5ed: checkcast net/minecraft/core/Vec3i
      // 5f0: invokespecial net/minecraft/world/phys/Vec3.<init> (Lnet/minecraft/core/Vec3i;)V
      // 5f3: ldc2_w 0.5
      // 5f6: dload 30
      // 5f8: ldc2_w 0.5
      // 5fb: invokevirtual net/minecraft/world/phys/Vec3.add (DDD)Lnet/minecraft/world/phys/Vec3;
      // 5fe: dup
      // 5ff: sipush 27968
      // 602: sipush 5951
      // 605: pop2
      // 606: ldc_w "add(...)"
      // 609: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 60c: fload 29
      // 60e: bipush 0
      // 60f: getstatic me/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI Lme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;
      // 612: aconst_null
      // 613: fconst_0
      // 614: aconst_null
      // 615: sipush 224
      // 618: aconst_null
      // 619: invokestatic me/octo/client/utils/IIIIlIlIIlIIlIllIIllIIIIIIllIllIIIlIIIIlIIIlIIIIIlllIlIIlIIIlllIlIllIlIIIlIllllIIIllI.a (Ljava/lang/String;Lnet/minecraft/world/phys/Vec3;FZLme/octo/client/utils/llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll;Lme/octo/client/utils/IIIIIlIIIlllIlllIIIIIIIIllIlIIIIllllIllIIlIlllIIlIlIIIIlIIllllIIlllIIIIlIIllllIIIIlIl;FLjava/lang/Float;ILjava/lang/Object;)V
      // 61c: aload 8
      // 61e: aload 20
      // 620: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 623: pop
      // 624: nop
      // 625: nop
      // 626: iload 7
      // 628: ifne 308
      // 62b: nop
      // 62c: return
   }

   @NotNull
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> B() {
        block45: {
            ArrayList arrayList;
            block44: {
                block43: {
                    List<ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> list;
                    String string;
                    boolean bl;
                    block42: {
                        block41: {
                            String string2;
                            Object object;
                            block40: {
                                block39: {
                                    Object object2;
                                    block38: {
                                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2;
                                        block37: {
                                            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
                                            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2;
                                            block31: {
                                                block32: {
                                                    ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> arrayList2;
                                                    block36: {
                                                        block35: {
                                                            Object object3;
                                                            block34: {
                                                                bl = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
                                                                try {
                                                                    block33: {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                                                                                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                                                                                    if (!bl) break block31;
                                                                                    if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 != iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) break block32;
                                                                                }
                                                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                                                }
                                                                                object3 = this.K();
                                                                                if (object3 == null) break block33;
                                                                            }
                                                                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                                            }
                                                                            if ((object3 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)object3).T()) != null) break block34;
                                                                        }
                                                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                                        }
                                                                    }
                                                                    return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
                                                                }
                                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                                }
                                                            }
                                                            Object object4 = object3;
                                                            try {
                                                                try {
                                                                    if (!bl) break block35;
                                                                    arrayList2 = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(object4);
                                                                    if (arrayList2 != null) break block36;
                                                                }
                                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                                }
                                                            }
                                                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                            }
                                                        }
                                                        arrayList2 = new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
                                                    }
                                                    return arrayList2;
                                                }
                                                try {
                                                    llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                                                    if (!bl) break block37;
                                                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                                                    iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI = IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                                                }
                                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                                }
                                            }
                                            if (iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI2 != iIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI) break block45;
                                            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                                        }
                                        try {
                                            try {
                                                object2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.J();
                                                if (object2 != null && (object2 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)object2).V()) != null) break block38;
                                            }
                                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                            }
                                            return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
                                        }
                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                        }
                                    }
                                    object = object2;
                                    try {
                                        try {
                                            if (!bl) break block39;
                                            string2 = this.E();
                                            if (string2 != null) break block40;
                                        }
                                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                        }
                                    }
                                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                    }
                                }
                                return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
                            }
                            string = string2;
                            try {
                                try {
                                    if (!bl) break block41;
                                    list = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(object);
                                    if (list != null) break block42;
                                }
                                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                                }
                            }
                            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                            }
                        }
                        return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
                    }
                    List<ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>> list2 = list;
                    int n = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.indexOf(string);
                    try {
                        try {
                            if (!bl) break block43;
                            arrayList = (ArrayList)CollectionsKt.getOrNull(list2, (int)n);
                            if (arrayList != null) break block44;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                        }
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                }
                arrayList = new ArrayList();
            }
            return arrayList;
        }
        return new ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll>();
   }

   @Nullable
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> b(int param1) {
      boolean var2 = R();
      if (!var2 && this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) { return null; }
      IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl var5 = this.J();
      if (var5 == null) { return null; }
      String var3 = var5.V();
      if (var3 == null) { return null; }
      if (var2) { return null; }
      List var4 = (List)this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(var3);
      if (var4 == null) { return null; }
      return (ArrayList)CollectionsKt.getOrNull(var4, param1);
   }

   @Nullable
   public String C() {
      return null;
   }

   @Nullable
   public String D() {
        block11: {
            Object object;
            Object object2;
            block12: {
                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2;
                block10: {
                    boolean bl = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
                    try {
                        try {
                            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                            if (!bl) break block10;
                            if (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) break block11;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                        }
                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                }
                try {
                    try {
                        object2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.J();
                        if (object2 != null && (object2 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)object2).V()) != null) break block12;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                    return null;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                }
            }
            Object object3 = object2;
            try {
                object = this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.containsKey(object3) ? null : object3;
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
            }
            return (String)object; // PX-FIX PhaseA: CFR slot-merge cast
        }
        return null;
   }

   @Nullable
   public String E() {
      return null;
   }

   @Nullable
   public String F() {
        block11: {
            Object object;
            Object object2;
            block12: {
                llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2;
                block10: {
                    boolean bl = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
                    try {
                        try {
                            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                            if (bl) break block10;
                            if (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll != IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) break block11;
                        }
                        catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                            throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                        }
                        llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2 = this;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                }
                try {
                    try {
                        object2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII2.K();
                        if (object2 != null && (object2 = ((IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII)object2).T()) != null) break block12;
                    }
                    catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                        throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                    }
                    return null;
                }
                catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                    throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
                }
            }
            Object object3 = object2;
            try {
                object = this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.containsKey(object3) ? null : object3;
            }
            catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
                throw sneakyThrow(llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.a((Exception)((Object)noWhenBranchMatchedException)));
            }
            return (String)object; // PX-FIX PhaseA: CFR slot-merge cast
        }
        return null;
   }

   public boolean G() {
      return false;
   }

   public boolean H() {
      return lIIllIlllllllIIlIllIIIIIIllIlIlllIIIIlIIlIllIlllIllIllIlIlllIlIIlIIIlIIIlllIIllllIIIl.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .b();
   }

   public boolean I() {
      return true;
   }

   @Nullable
   public ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> k(@NotNull String var1) {
      short var10001 = 27978;
      short var10002 = 29096;
      Intrinsics.checkNotNullParameter(var1, "name");
      return this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var1);
   }

   @Nullable
   public IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl J() {
      return null;
   }

   @Nullable
   public IIIlllIllIIIlIlIIIIlIlIlIIIlIllIIllllIIIlIlllIlllIlIlIlIIIIlIIIIIlIlllIIIIIllIlllIIII K() {
      return null;
   }

   private final void l(String var1) {
      short var10002 = 28020;
      short var10003 = 3352;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII + ": " + var1
      );
   }

   public final void m(@NotNull String var1) {
      short var10001 = 27927;
      short var10002 = -31291;
      Intrinsics.checkNotNullParameter(var1, "text");
      var10001 = 27997;
      var10002 = -22142;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.c("§7" + var1);
   }

   private final void L() {
      short var10002 = 27925;
      short var10003 = 19118;
      var10003 = 27917;
      short var10004 = 12927;
      this.l(
         "Wrong command arguments try /" + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll + " help for more info"
      );
   }

   private final void M() {
      short var10003 = 27984;
      short var10004 = 23550;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            5000L,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            "Can't do this action on the selected route",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   private final void N() {
      short var10003 = 27926;
      short var10004 = 31198;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            5000L,
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            "Can't do this action on an empty route",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   public final void O() {
      short var10004 = 27966;
      short var10005 = -4728;
      var10005 = 27976;
      short var10006 = -18490;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .b(
            5000L,
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            "Your selected route (" + this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll + ") is empty",
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         );
   }

   public final void c(int var1) {
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII var10000 = IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10002 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Object var10003 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var1);
      short var10004 = 27988;
      short var10005 = 4235;
      var10005 = 27953;
      short var10006 = 31611;
      var10000.b(
         5000L,
         var10002,
         "Your route (" + var10003 + ") is empty",
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
   }

   public final void P() {
      short var10003 = 28017;
      short var10004 = 15558;
      IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.a(
         IllIIlIllIIlIIlIIllIllllIlllIIIIlIllllIlIllllIIIllllIllIIlIllIIlllllllIIIlllIIIlIllII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         5000L,
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
         "Be closer to your route to start",
         null,
         8,
         null);
   }

   private final String a(IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var1) {
      BlockPos var2 = var1.a();
      return var2.getX() + " " + var2.getY() + " " + var2.getZ() + " " + var1.b().a();
   }

   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> c(@NotNull String var1, @NotNull String var2) {
      short var10001 = 27969;
      short var10002 = 1909;
      Intrinsics.checkNotNullParameter(var1, "folderName");
      var10001 = 27928;
      var10002 = 18352;
      Intrinsics.checkNotNullParameter(var2, "fileName");
      return this.a(var1, var2);
   }

   @NotNull
   public final ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> n(@NotNull String var1) {
      short var10001 = 27940;
      short var10002 = -8927;
      Intrinsics.checkNotNullParameter(var1, "fileName");
      return this.e(var1);
   }

   public final void a(
      @NotNull File param1, @NotNull ArrayList<IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll> param2, boolean param3
   ) {
      Intrinsics.checkNotNullParameter(param1, "targetFile");
      Intrinsics.checkNotNullParameter(param2, "routePoints");
      boolean var4 = Q();
      ArrayList var5 = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault((Iterable)param2, 10));
      for (Object var12 : param2) {
         IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll var13 = (IlIlllIIIllllIIIIIlIIIIIIIlIllIlIIIlllIllllIlIlIIIlIlIIllIIllIlIIIlllIIIllllllIIlIlll)var12;
         var5.add(IlIllllIlIlllIIlllllllllIllIIIIIIIIIIlIllIIIlIIIIIIIIIlIlIllIIlIlIIlIIIllllIIIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var13.a(), var13.b().a()));
      }
      String var6;
      if (var4 && !this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI) { var6 = null; }
      else if (this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl != null) { var6 = me.octo.client.utils.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.b(this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl); }
      else { var6 = null; }
      Object var7 = new IIlllIIIIlIIlIIlIIIIllllIlIIlllIIIllllIIIllIlIIlIIllIIIllIlIlllIlllllIlIlIlIIIlllllll(var5, var6, (this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl && param3) ? this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl : (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)null, (IIIllIlIIlIllIlIlllIlIllIIllIIlIlIllIlIlllIlIlIllIIIIIlIlIllllIlIlIIIIIIlIIIIllllIllI)null);
      me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(var7, param1, true);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) { b(var4 == false); }
   }

   private static final CharSequence a(IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0) {
      short var10001 = 28011;
      short var10002 = 13740;
      Intrinsics.checkNotNullParameter(var0, "it");
      String var10000 = var0.a().toLowerCase(Locale.ROOT);
      var10002 = 27931;
      short var10003 = 569;
      Intrinsics.checkNotNullExpressionValue(var10000, "toLowerCase(...)");
      return var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
      String[] var5 = new String[130];
      int var3 = 0;
      String var2 = "¶>:«\u000fÄÂÓ@ôLÙ\u0016S÷hcmY¬fõ\u0085!ÐY--\"úe±²Ly\u0012\u0006&W\u0080¬\u0080\tú=qOA\\\u0083\u0005\u00ad\r·\nµ\u0083»çÎ\u0099/g\u008f\u0083<\u0080¨÷ô #üí:\u009e_¬½o¯\u0015\u0015\n\\ßË]}5#ä<\u009d/\u008d°HÜø\u0014qÑ\u000b\u0017\u0090j½V\u0092*ÙÐÅ+q.l§\u0090¢ÌO\u0096\u0014BVâ©}K~\u009d/\u001bX*YY\\Ù\u008bÉÃøä\u008c\u008b£\u008e³Ð0Q\u0093\u008eJ\u0007'\u0080)u»;È\u0005Mì{Û \u001f\"gÇº\u0094Ã\u009eoBcáå\u008b\u00919Åcød\u001b+ò|ûçô·Ü\u008eÅÃFÇ»V-\u008cëCf\b\u0002éü\u0010R¨\u008d'ãâÏ;zW§\u0002\u000eüé\u0083\n5tFdLn«£\u0005/>·å\fE\u001e\"¡\u0007Ë\u000b\u0019ëZ«ê4pã\u0096óT®Ìõ\u0018á÷¬a\u0007ß1K¦\u0097Æ\u0096jbÝÿ%Õ\u0093[âÛÚÀ\u009c\u0087\u001d\u008aÊ>rÍ\u0013nãÁÆ\f5G¤uô\u009b½8¯\u0089±v\u001b\u0003 I\u0095R\u0019\u0012V\u000eèD\u000e,Û4Lú\u0002ß«S\r\u009e*Üü:\u0015â\u000e3ñ@lö\u0011¬Èè®\u009e\u0083¤åµ\u008aÕ\u0096ä\u000b\u009a\u001frÕ-\r¼\u007f¥·¤\u0005¦\u0099$»*\u0016ùÛ=æÇéùp_Gt\u0088ó&xCPIä7æÉ\u0014Þyã\u0082,\bÚÑ¼E»Eé\u0083\u0081`ái½ÙN1\u0019\u0007]1_ÆCe!þ8¨õ\u0015L\u0010H\u009e\u009aÄagëí;öòzf\u0099¢S\u0099\u000f\u00adt\nì\u0015Ñp|Áë\u000eùBi$¹\u0088 \u0080\u008a¹Ø\u00806X1OfáÈ\u009b\u0088j´%\u001dïá\u0085b±³ò)'äÚ6ÛfìûÑ]«¸@5\f£í\u007f6¼$Çr\u0019g\u0082õÌ\u0012\u0093ÃYî\u007f\u0094¼\u0096P_\u0011×\ndVl \tæ\u0011¢\u001e\u001dLx\u009aøÊ+ä\u008d\u0015\u0014\u0081\u009aO\u0001\u0006±\u0096gG¥Ö\u0088È\u0099îªéìÏÞ\n~¢\u0091µÁ§íuª?×\u001d®+¦ï©7»úR]Ï\u0096ÙTÁ¸`TCÒÁÚ\u0099r¸4ãèÐ\u009eØ6¬Ú)dªCqøõ\u0081\u0092T{#\u000fêÊ\u0093\u0004ø\u0017¦\u008e&³5Ø\u0004/\u0001\u0011\u0017\nÆ\u0012\u0013;¥ÊÊ\u00ad²àç\bÄH6è´¨ÃÐ\u0016\n»,9ÎÝ\u009b¿2Úf»èß\u001c\u0015hì\u008d\n=¡\nïêS{3è^\u00adÿõ%R¥k@\u001f\u0019ªÒ\\6\u008aR\\Zjc9$±Ð\u007fIëîëÅ1¥h\"\u0003\u0015\u009b®\u0083È\u0087(n+N\u0098\b\u0019éª\u0098v\u000b±%Ùèzb1ÌÐ\u001b¢\u00ad\u001föÁ\u0088]\n9¶¢µ\féQÚUwG\u0006À0\u001a\u009b#F\u0007\u007f\u0080Y¹\u0012ïK,\u009a.\u008c\u0013(\u0010ñ¦\u0016\u0002Ø0M4µÿäè¢\u0088ª±7h\u008fñð)÷ÐÛ\u001e\u0083\u0011¢\\Á«\u001b&Zî\u008c \u0014@\u0093%F¿\u001fõWþk\u0080õí<iN©98á\u000bàxÈ$&¸²\u001d\u008b\u000es\rHÌ\u0097î¼O\tÃu\u0097)Â«)3Y©\u000f¥:*k!D\u008dè?6)\u009b¯äLð{|\u009e!q\u0010¯öÂö|\u008dDÈO´\u0097b\u0019\u0019\u0092\u000fb\u008dj,-°\u0084\u0012Ôa\u0013\u0007Á\u0085;\u0010\u001em\u001d\u0080ÌêÍ::w¯\u0006\u000f|É\u0093&¨\u001e8i\rÓ\u0080Ü\u0006\u0005Lî\u0082\u0006ÁYi\u008de\u0086±ñ¢ôV\tºXól¢JSp\u009eªû\u0083\u0004\tçË\u0081\u0006\u009a\u009d\u000fÜ0p\u001dB<ò\u0015f<\u009b!Ï£\u0098\u0007'Ü\u0080\u0013RëqÞ?\u008béÃ\u0094ó\fÝ\u0015GnitJ7\u009e\u000eZdh\u0094rÀ¡\u0089b`ÙE\u0005\u0094«\u0001³Íf\u0087ðá\u008c¨Z!\u0081×Ba\u0099ºõ\u0000¡:ÛÞ@lPÒÚ½$\u009bií\u0000\u0015È§¦h\u0082\u0015T\u00ad£(\u0003=µK\u0010¦I\n\u0004.z\u0091(±5ÞN!u\f²\b\u008f\u0014_c\u0099Ùfþ\u0014Æ¤à9L\u007fÖ?=\u0098\u008bþïôA\u008eù´¾b\u0002Y.\t\u0013TA(\u001a¹RóD'\u0012{ß\u0089çC\u0014á'\u001fü\u009cÎi>Ö3\u0016\u007fÿ\u009a\u0094®yê¹\u009a~ò\u008es¯ö\b\\ÕB>¸\u0003C*)\u001c}S\u008aC\u000f>}Ú\u008aiÜ4£öô\u0093½ú\u0089Ìªá¡ö#H£\u001c\u0010\u0015;© \b4\u0087|Â×Hÿ3}«<\u0017-Ì\u0093·\u0010dr¶s'øS_h.\t\u0016ªV¾ËàI\u0014-\u00ad\u00870ã¢fåûÀô\u0098u»Ö\u0083Q\u007f\u0093N)Ë³ò\u000eÂ\u0089K^\n\u008c\u0012\u001c;¯ÀO§e¶ôç\u0002Ä÷LhNCtÊn \f\u0096~\u009f\u008d¶å(,\u000fÙùóS6Ûç\u007f¸Ì\u009e²p3\r)Ý\u001a3\u009fü¹D¡\u001d\u0084Á\u0001m\u0080ÂêQ¾t {\u0084}®\u008f\u0014\u00adwúç{£÷×\u0004÷c¯»ÄZ\u000fJ×og\u008dÙ\u0090?BÄN£PQ\u000e0¼!pÝ\u0015.º4C¹Ì\u0091ÏU¶8öØ\u0081\"î\u008a\u0080ÓÔ\u0086Âà\u008c\u0004qçï-\bê\by^·h\f\u0000bQ\u009b\u001b^/Û8\u008c\u0094\u0002-¤\tµôå×\u0082ÆRC¾\u0084Ð¦óüñU]?ÐÉÑö\u001dîWÜ\u0090r-v\u0001\u009ex\u0086\u008f}È s\u0002°\u0088Cb6låÞ\u0085ñwBDÈ|\u009føw\u008d\u00194QÖQ\u0012;G4~Ó\u0093\u0019\u0088Þû¤µ`\u0081)\u0013ÆO>\u0018a\u0094²ìQaØÂäõµîæ»\u001dÝÀXFï<Y¯ýæ\u0019¾ ä/ZØ\u001dl6¬ðöÙÜ\u009d\u009f:{üã\u0006\u0080Q\u0088Ã\u000bÉ\u0097Ù\u0018¿áÏJÍ\tÊ!Ñ9\u0019\u0098\u0005Pdã\u0099_¨Ý\u00133f×ïsÖÍ¿éb\u008fmdÖ¢\u0011\u009b\u0005CT\u0013ô^·\u0002\u0092\u009cõ5¸l\u0086\u001b\u007f;\u001e\u0019áÁ-\u001e§\u0005Ô\nÇç*\u0000\u009f²rþõÖ´Ï\u0017Ew\u0094\u0090é\u0089µÌR\u0093\u0019¯-\u000bn*!)l\u0094ºÙÀ¥f\u0017S.\\ëéïMÇ\u0094\u000e\u0013\u0098Ó9;#´ï\u0002\u0016Aõ\u0018 \f\u009aÃ9íZ\u0090A£©ü£X0\u00adû-D6Þ0Àfª±Ãñ6\u0083d\u0090u\u0005L:MQÉ\u000b[\u0001¿\u000bÈ]o¡0\u0099\u0004\u0002\u0099É\u0011\"\u000bY\u0007@\u001akG,Å¥X\u0090£\u0013\u009a\u0089\u0005/,çÅ\u009a\u0002\u0087ø\u000f<\u0099â~\r;\u0081Ï\u000e¬8_öd°\u000fW\\\"ç\fM \u00adD\u0096\u008eéH\u0018\r\báá}<´\u0099ì\u001c\"Ã-\u0014Ø2\u0095®;pD\u0016÷\u0082E\u0093=z\u0089y£³\u001aLi\u00adzuµ£U%}\u0095\u00825¶Ö¹¸\\[\u0087)\u0013ÕãiÄÙû\fü)a»yÊ\u009cªW§¿\n\u0098vT|\u001cHß¤\f4È_\u00049ÇÜ7Á~ÅMl`\tü\u0012hgvê|ýiÌ\u001anÆðø\u0098å!äg\u0005>\u009d\u0003¥\u0000\u000b÷±ô\u0019â\u0090Ê\u0012\u000eÀ)Qho,\u0093T\u0086jxðFLÔþhßÿI>µT¡¸ËÐx\\D\u001e,ûS\u0011\nï$c\u0011Ó@.D\u0017Î-½\u00933ñ0R\u0092FEY&\u0082Mç\u0084´gÒ¬R\u0091í£¤Ñü±ÔtâÐNäuäp»\u0004Hfhµ\u0018\\F\u001c\u008cÅ\u0001$Û\u009ceþ·XÔ»è5\u0084\u0084lûcdÆ\u000b\u0094B< Þ\u008cîûDúÛ*ArG,\u008dÝo<ä\fÅ\u0010Ë¶¾Î\u0014¼\u0014\bÞ\u0097!\u000fÎÍG}N©\u0003½ñ9\u0097®Cöáõ\u009fÚ\u0006\u009c]ªÍ>C \fIîKº\"Àû(À&S\u0092[V^Ê(\u0007ò\u000fÞ¤·nn0OÒ Þô\u00029\u0094\r\\`&\u009dÑ\u001dé=IBêP\u0082\u001dpîv²\u001f½\u0005Ä\u0097jyÙÄ:¯6ËÃõÇ¢]ìR{\u0086=\u009fc\u0006^1ÚÂø!/y*¬Ì\u0004=\u0010yÒçÊEß_)±\u0010[ë¾ñf@ ø§Ø9 [.îÖè\u0085P9\u0006\u0093W]\u0097\u0092\b¿¬ì\u0015 ½2÷ Ëã}+\u008f\u0084í\u001bGn\u000b\u009c¶¢û;\u0004?1ð\u001d\u0002Ý¡\tJÆhînnÂ\u008eµ*d\u009c¡9>Ùæ\u009dÊ-Õë±¦§M¥\u000füÖ\u0082ûÄµ\u008f's\u001e9\\>ç\u0098\\Æøïív)%$\u000eZ\u001c\\Þ\u0017$»í3Rû}J£\u0004Ä2zµ\u0003ê\u0098\u0092\fHÄf¨êF©l\u001d[¹W\u0016M\u0002¬vö\tÍ\u008cÇe\u0015å\u009c\u0080\u0096\u0085Ø\u009fg@z5)¿ªÞ\u009c¿O\u001b\u0000r%WX<]\u0016q\u008b£>YES4 \u009c\u0082\u0083\u001eéb}Ç³O\u0082fa\u0005BT\u0085\u0005\u0007àÈõ\f\u0014\u008b_þ\n#Ù2JÓûKç\u001fk\u0096\bñ\u0088\u0015²\r\u0088ø¼\u008e\u0082\u007f\u0083q\u0004ËCa·\u0006\u0085d\u0091ºQÃKúür\u0091*\u008a¦(\u0016òUçË\u0013ù1\u001b\u0016¸ó\u0087\u0081k¸\u0090ó\u0018-Þø'\u008e÷uä\u001f«Ãù:gFDöÝ'q\u0015¡Ìg¼ÙbçpPÞÊ[\u00adû\u0086{\u0089QS¢=Ü\u008c*DÜË\u0005·\u001c×µ\u0099\u0002&b\rqñ°IX»\u0095]æD[¸å\nA\u0017à¾êB.øñ_\bhzLO\u0092÷(Ñ\n\u0019\u009d\u008d\u0095è5%\u0016\u0090\u0082$mp\u009b \u0011\u0096Rèwæg5^\u0015Ð`ú\u0087Ë\u001bxT~´Ê\u001aæ_ySÖ\u008c\u0016Ã\u008d¼\f¯(¼KÜ\u0093Ù\u0002t\u0086}\u0000\u0005r¥¾<y\u0010\\üïwrN\u0014±¾¸\u0093Pèè\u001aë\u0004\u008fvW&VÛ=ZÙ\u009aÏ³QËc+p\u0012üBmúlÃ\u001eoñ\u0012ùCy#ºÀoÎ\u0083¹½R)ß\u009a\u0099\u0007\u007f2©\u0089Q\u0007®c\u0083\u0000ä\f\u008b\u0010ÿ«vÂã\u0010\u008bF1À\"¿Õî\u001fµhýOÇ·ê\bârò\u0014\u0018ÌÑ\u0082Z\n¿\u009aúÄæý*ë/\u0012\u000f4l\u008c¿ãú$\u007fç\u0016îEÃÒW\u0004CXÎã\u0005ï³Ü@ø4Q\u0011\u0003f\u0011D1í^\u009cýðx3¨é³Õ6N¢ F-¨Ô\u009d\u0089×\u0006îJm\u0092N\u001f\u0013»Ö>äû\u0088ê0keª¼õ\u008f÷9Fj\u000e¬\u009f(\u001b\u008cÆ²À)T×É\t\u009cÂÍºJ%ÒgÒpÅXz§k«õÌLÚv°°\u008eëS©£±\u0084h\u001fÿ\f\r\u000em\u009a\u009c\u0013h";
      int var4 = "¶>:«\u000fÄÂÓ@ôLÙ\u0016S÷hcmY¬fõ\u0085!ÐY--\"úe±²Ly\u0012\u0006&W\u0080¬\u0080\tú=qOA\\\u0083\u0005\u00ad\r·\nµ\u0083»çÎ\u0099/g\u008f\u0083<\u0080¨÷ô #üí:\u009e_¬½o¯\u0015\u0015\n\\ßË]}5#ä<\u009d/\u008d°HÜø\u0014qÑ\u000b\u0017\u0090j½V\u0092*ÙÐÅ+q.l§\u0090¢ÌO\u0096\u0014BVâ©}K~\u009d/\u001bX*YY\\Ù\u008bÉÃøä\u008c\u008b£\u008e³Ð0Q\u0093\u008eJ\u0007'\u0080)u»;È\u0005Mì{Û \u001f\"gÇº\u0094Ã\u009eoBcáå\u008b\u00919Åcød\u001b+ò|ûçô·Ü\u008eÅÃFÇ»V-\u008cëCf\b\u0002éü\u0010R¨\u008d'ãâÏ;zW§\u0002\u000eüé\u0083\n5tFdLn«£\u0005/>·å\fE\u001e\"¡\u0007Ë\u000b\u0019ëZ«ê4pã\u0096óT®Ìõ\u0018á÷¬a\u0007ß1K¦\u0097Æ\u0096jbÝÿ%Õ\u0093[âÛÚÀ\u009c\u0087\u001d\u008aÊ>rÍ\u0013nãÁÆ\f5G¤uô\u009b½8¯\u0089±v\u001b\u0003 I\u0095R\u0019\u0012V\u000eèD\u000e,Û4Lú\u0002ß«S\r\u009e*Üü:\u0015â\u000e3ñ@lö\u0011¬Èè®\u009e\u0083¤åµ\u008aÕ\u0096ä\u000b\u009a\u001frÕ-\r¼\u007f¥·¤\u0005¦\u0099$»*\u0016ùÛ=æÇéùp_Gt\u0088ó&xCPIä7æÉ\u0014Þyã\u0082,\bÚÑ¼E»Eé\u0083\u0081`ái½ÙN1\u0019\u0007]1_ÆCe!þ8¨õ\u0015L\u0010H\u009e\u009aÄagëí;öòzf\u0099¢S\u0099\u000f\u00adt\nì\u0015Ñp|Áë\u000eùBi$¹\u0088 \u0080\u008a¹Ø\u00806X1OfáÈ\u009b\u0088j´%\u001dïá\u0085b±³ò)'äÚ6ÛfìûÑ]«¸@5\f£í\u007f6¼$Çr\u0019g\u0082õÌ\u0012\u0093ÃYî\u007f\u0094¼\u0096P_\u0011×\ndVl \tæ\u0011¢\u001e\u001dLx\u009aøÊ+ä\u008d\u0015\u0014\u0081\u009aO\u0001\u0006±\u0096gG¥Ö\u0088È\u0099îªéìÏÞ\n~¢\u0091µÁ§íuª?×\u001d®+¦ï©7»úR]Ï\u0096ÙTÁ¸`TCÒÁÚ\u0099r¸4ãèÐ\u009eØ6¬Ú)dªCqøõ\u0081\u0092T{#\u000fêÊ\u0093\u0004ø\u0017¦\u008e&³5Ø\u0004/\u0001\u0011\u0017\nÆ\u0012\u0013;¥ÊÊ\u00ad²àç\bÄH6è´¨ÃÐ\u0016\n»,9ÎÝ\u009b¿2Úf»èß\u001c\u0015hì\u008d\n=¡\nïêS{3è^\u00adÿõ%R¥k@\u001f\u0019ªÒ\\6\u008aR\\Zjc9$±Ð\u007fIëîëÅ1¥h\"\u0003\u0015\u009b®\u0083È\u0087(n+N\u0098\b\u0019éª\u0098v\u000b±%Ùèzb1ÌÐ\u001b¢\u00ad\u001föÁ\u0088]\n9¶¢µ\féQÚUwG\u0006À0\u001a\u009b#F\u0007\u007f\u0080Y¹\u0012ïK,\u009a.\u008c\u0013(\u0010ñ¦\u0016\u0002Ø0M4µÿäè¢\u0088ª±7h\u008fñð)÷ÐÛ\u001e\u0083\u0011¢\\Á«\u001b&Zî\u008c \u0014@\u0093%F¿\u001fõWþk\u0080õí<iN©98á\u000bàxÈ$&¸²\u001d\u008b\u000es\rHÌ\u0097î¼O\tÃu\u0097)Â«)3Y©\u000f¥:*k!D\u008dè?6)\u009b¯äLð{|\u009e!q\u0010¯öÂö|\u008dDÈO´\u0097b\u0019\u0019\u0092\u000fb\u008dj,-°\u0084\u0012Ôa\u0013\u0007Á\u0085;\u0010\u001em\u001d\u0080ÌêÍ::w¯\u0006\u000f|É\u0093&¨\u001e8i\rÓ\u0080Ü\u0006\u0005Lî\u0082\u0006ÁYi\u008de\u0086±ñ¢ôV\tºXól¢JSp\u009eªû\u0083\u0004\tçË\u0081\u0006\u009a\u009d\u000fÜ0p\u001dB<ò\u0015f<\u009b!Ï£\u0098\u0007'Ü\u0080\u0013RëqÞ?\u008béÃ\u0094ó\fÝ\u0015GnitJ7\u009e\u000eZdh\u0094rÀ¡\u0089b`ÙE\u0005\u0094«\u0001³Íf\u0087ðá\u008c¨Z!\u0081×Ba\u0099ºõ\u0000¡:ÛÞ@lPÒÚ½$\u009bií\u0000\u0015È§¦h\u0082\u0015T\u00ad£(\u0003=µK\u0010¦I\n\u0004.z\u0091(±5ÞN!u\f²\b\u008f\u0014_c\u0099Ùfþ\u0014Æ¤à9L\u007fÖ?=\u0098\u008bþïôA\u008eù´¾b\u0002Y.\t\u0013TA(\u001a¹RóD'\u0012{ß\u0089çC\u0014á'\u001fü\u009cÎi>Ö3\u0016\u007fÿ\u009a\u0094®yê¹\u009a~ò\u008es¯ö\b\\ÕB>¸\u0003C*)\u001c}S\u008aC\u000f>}Ú\u008aiÜ4£öô\u0093½ú\u0089Ìªá¡ö#H£\u001c\u0010\u0015;© \b4\u0087|Â×Hÿ3}«<\u0017-Ì\u0093·\u0010dr¶s'øS_h.\t\u0016ªV¾ËàI\u0014-\u00ad\u00870ã¢fåûÀô\u0098u»Ö\u0083Q\u007f\u0093N)Ë³ò\u000eÂ\u0089K^\n\u008c\u0012\u001c;¯ÀO§e¶ôç\u0002Ä÷LhNCtÊn \f\u0096~\u009f\u008d¶å(,\u000fÙùóS6Ûç\u007f¸Ì\u009e²p3\r)Ý\u001a3\u009fü¹D¡\u001d\u0084Á\u0001m\u0080ÂêQ¾t {\u0084}®\u008f\u0014\u00adwúç{£÷×\u0004÷c¯»ÄZ\u000fJ×og\u008dÙ\u0090?BÄN£PQ\u000e0¼!pÝ\u0015.º4C¹Ì\u0091ÏU¶8öØ\u0081\"î\u008a\u0080ÓÔ\u0086Âà\u008c\u0004qçï-\bê\by^·h\f\u0000bQ\u009b\u001b^/Û8\u008c\u0094\u0002-¤\tµôå×\u0082ÆRC¾\u0084Ð¦óüñU]?ÐÉÑö\u001dîWÜ\u0090r-v\u0001\u009ex\u0086\u008f}È s\u0002°\u0088Cb6låÞ\u0085ñwBDÈ|\u009føw\u008d\u00194QÖQ\u0012;G4~Ó\u0093\u0019\u0088Þû¤µ`\u0081)\u0013ÆO>\u0018a\u0094²ìQaØÂäõµîæ»\u001dÝÀXFï<Y¯ýæ\u0019¾ ä/ZØ\u001dl6¬ðöÙÜ\u009d\u009f:{üã\u0006\u0080Q\u0088Ã\u000bÉ\u0097Ù\u0018¿áÏJÍ\tÊ!Ñ9\u0019\u0098\u0005Pdã\u0099_¨Ý\u00133f×ïsÖÍ¿éb\u008fmdÖ¢\u0011\u009b\u0005CT\u0013ô^·\u0002\u0092\u009cõ5¸l\u0086\u001b\u007f;\u001e\u0019áÁ-\u001e§\u0005Ô\nÇç*\u0000\u009f²rþõÖ´Ï\u0017Ew\u0094\u0090é\u0089µÌR\u0093\u0019¯-\u000bn*!)l\u0094ºÙÀ¥f\u0017S.\\ëéïMÇ\u0094\u000e\u0013\u0098Ó9;#´ï\u0002\u0016Aõ\u0018 \f\u009aÃ9íZ\u0090A£©ü£X0\u00adû-D6Þ0Àfª±Ãñ6\u0083d\u0090u\u0005L:MQÉ\u000b[\u0001¿\u000bÈ]o¡0\u0099\u0004\u0002\u0099É\u0011\"\u000bY\u0007@\u001akG,Å¥X\u0090£\u0013\u009a\u0089\u0005/,çÅ\u009a\u0002\u0087ø\u000f<\u0099â~\r;\u0081Ï\u000e¬8_öd°\u000fW\\\"ç\fM \u00adD\u0096\u008eéH\u0018\r\báá}<´\u0099ì\u001c\"Ã-\u0014Ø2\u0095®;pD\u0016÷\u0082E\u0093=z\u0089y£³\u001aLi\u00adzuµ£U%}\u0095\u00825¶Ö¹¸\\[\u0087)\u0013ÕãiÄÙû\fü)a»yÊ\u009cªW§¿\n\u0098vT|\u001cHß¤\f4È_\u00049ÇÜ7Á~ÅMl`\tü\u0012hgvê|ýiÌ\u001anÆðø\u0098å!äg\u0005>\u009d\u0003¥\u0000\u000b÷±ô\u0019â\u0090Ê\u0012\u000eÀ)Qho,\u0093T\u0086jxðFLÔþhßÿI>µT¡¸ËÐx\\D\u001e,ûS\u0011\nï$c\u0011Ó@.D\u0017Î-½\u00933ñ0R\u0092FEY&\u0082Mç\u0084´gÒ¬R\u0091í£¤Ñü±ÔtâÐNäuäp»\u0004Hfhµ\u0018\\F\u001c\u008cÅ\u0001$Û\u009ceþ·XÔ»è5\u0084\u0084lûcdÆ\u000b\u0094B< Þ\u008cîûDúÛ*ArG,\u008dÝo<ä\fÅ\u0010Ë¶¾Î\u0014¼\u0014\bÞ\u0097!\u000fÎÍG}N©\u0003½ñ9\u0097®Cöáõ\u009fÚ\u0006\u009c]ªÍ>C \fIîKº\"Àû(À&S\u0092[V^Ê(\u0007ò\u000fÞ¤·nn0OÒ Þô\u00029\u0094\r\\`&\u009dÑ\u001dé=IBêP\u0082\u001dpîv²\u001f½\u0005Ä\u0097jyÙÄ:¯6ËÃõÇ¢]ìR{\u0086=\u009fc\u0006^1ÚÂø!/y*¬Ì\u0004=\u0010yÒçÊEß_)±\u0010[ë¾ñf@ ø§Ø9 [.îÖè\u0085P9\u0006\u0093W]\u0097\u0092\b¿¬ì\u0015 ½2÷ Ëã}+\u008f\u0084í\u001bGn\u000b\u009c¶¢û;\u0004?1ð\u001d\u0002Ý¡\tJÆhînnÂ\u008eµ*d\u009c¡9>Ùæ\u009dÊ-Õë±¦§M¥\u000füÖ\u0082ûÄµ\u008f's\u001e9\\>ç\u0098\\Æøïív)%$\u000eZ\u001c\\Þ\u0017$»í3Rû}J£\u0004Ä2zµ\u0003ê\u0098\u0092\fHÄf¨êF©l\u001d[¹W\u0016M\u0002¬vö\tÍ\u008cÇe\u0015å\u009c\u0080\u0096\u0085Ø\u009fg@z5)¿ªÞ\u009c¿O\u001b\u0000r%WX<]\u0016q\u008b£>YES4 \u009c\u0082\u0083\u001eéb}Ç³O\u0082fa\u0005BT\u0085\u0005\u0007àÈõ\f\u0014\u008b_þ\n#Ù2JÓûKç\u001fk\u0096\bñ\u0088\u0015²\r\u0088ø¼\u008e\u0082\u007f\u0083q\u0004ËCa·\u0006\u0085d\u0091ºQÃKúür\u0091*\u008a¦(\u0016òUçË\u0013ù1\u001b\u0016¸ó\u0087\u0081k¸\u0090ó\u0018-Þø'\u008e÷uä\u001f«Ãù:gFDöÝ'q\u0015¡Ìg¼ÙbçpPÞÊ[\u00adû\u0086{\u0089QS¢=Ü\u008c*DÜË\u0005·\u001c×µ\u0099\u0002&b\rqñ°IX»\u0095]æD[¸å\nA\u0017à¾êB.øñ_\bhzLO\u0092÷(Ñ\n\u0019\u009d\u008d\u0095è5%\u0016\u0090\u0082$mp\u009b \u0011\u0096Rèwæg5^\u0015Ð`ú\u0087Ë\u001bxT~´Ê\u001aæ_ySÖ\u008c\u0016Ã\u008d¼\f¯(¼KÜ\u0093Ù\u0002t\u0086}\u0000\u0005r¥¾<y\u0010\\üïwrN\u0014±¾¸\u0093Pèè\u001aë\u0004\u008fvW&VÛ=ZÙ\u009aÏ³QËc+p\u0012üBmúlÃ\u001eoñ\u0012ùCy#ºÀoÎ\u0083¹½R)ß\u009a\u0099\u0007\u007f2©\u0089Q\u0007®c\u0083\u0000ä\f\u008b\u0010ÿ«vÂã\u0010\u008bF1À\"¿Õî\u001fµhýOÇ·ê\bârò\u0014\u0018ÌÑ\u0082Z\n¿\u009aúÄæý*ë/\u0012\u000f4l\u008c¿ãú$\u007fç\u0016îEÃÒW\u0004CXÎã\u0005ï³Ü@ø4Q\u0011\u0003f\u0011D1í^\u009cýðx3¨é³Õ6N¢ F-¨Ô\u009d\u0089×\u0006îJm\u0092N\u001f\u0013»Ö>äû\u0088ê0keª¼õ\u008f÷9Fj\u000e¬\u009f(\u001b\u008cÆ²À)T×É\t\u009cÂÍºJ%ÒgÒpÅXz§k«õÌLÚv°°\u008eëS©£±\u0084h\u001fÿ\f\r\u000em\u009a\u009c\u0013h"
         .length();
      b(true);
      char var1 = '\f';
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 69;
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
                     case 0 -> 38;
                     case 1 -> 25;
                     case 2 -> 65;
                     case 3 -> 14;
                     case 4 -> 24;
                     case 5 -> 49;
                     default -> 81;
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
                     b = new String[130];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                        (Object) null
                     );
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new GsonBuilder().create();
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new CopyOnWriteArrayList<>();
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

                  var2 = "D\u0004¥òi¦Áp\u0089Koy\u0096ÑÞÄeU<5\u009c\u0098`Ø\u0001Qg³DBR*&\u0084\u00ad\u0002,óë&=\u001aí\u0080Õ*2Ê\u001c9\u001b'xy\u008d\u008a4ê§\u0019\u000fk\u00adi½\u0086*ÅìÜ\u001aÜ\rïóæ\u009bÍéü[èIBøJ\u000b×OX\r^5òÀË\u0091&";
                  var4 = "D\u0004¥òi¦Áp\u0089Koy\u0096ÑÞÄeU<5\u009c\u0098`Ø\u0001Qg³DBR*&\u0084\u00ad\u0002,óë&=\u001aí\u0080Õ*2Ê\u001c9\u001b'xy\u008d\u008a4ê§\u0019\u000fk\u00adi½\u0086*ÅìÜ\u001aÜ\rïóæ\u009bÍéü[èIBøJ\u000b×OX\r^5òÀË\u0091&"
                     .length();
                  var1 = 'V';
                  var8 = -1;
            }

            var10000 = 108;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   }
}

   public static void b(boolean var0) {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var0;
   }

   public static boolean Q() {
      return IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   }

   public static boolean R() {
      boolean var0 = Q();

      try {
         return !var0;
      } catch (NoWhenBranchMatchedException var1) {
         throw (RuntimeException)a(var1);
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   private static String a(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
      int var2 = (var0 ^ 27954) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 95;
            case 1 -> 52;
            case 2 -> 171;
            case 3 -> 66;
            case 4 -> 140;
            case 5 -> 39;
            case 6 -> 149;
            case 7 -> 186;
            case 8 -> 61;
            case 9 -> 190;
            case 10 -> 102;
            case 11 -> 213;
            case 12 -> 165;
            case 13 -> 226;
            case 14 -> 43;
            case 15 -> 245;
            case 16 -> 57;
            case 17 -> 73;
            case 18 -> 85;
            case 19 -> 51;
            case 20 -> 255;
            case 21 -> 6;
            case 22 -> 77;
            case 23 -> 82;
            case 24 -> 125;
            case 25 -> 191;
            case 26 -> 183;
            case 27 -> 84;
            case 28 -> 214;
            case 29 -> 107;
            case 30 -> 62;
            case 31 -> 139;
            case 32 -> 137;
            case 33 -> 56;
            case 34 -> 7;
            case 35 -> 4;
            case 36 -> 2;
            case 37 -> 228;
            case 38 -> 162;
            case 39 -> 30;
            case 40 -> 159;
            case 41 -> 194;
            case 42 -> 33;
            case 43 -> 25;
            case 44 -> 218;
            case 45 -> 74;
            case 46 -> 83;
            case 47 -> 205;
            case 48 -> 150;
            case 49 -> 106;
            case 50 -> 53;
            case 51 -> 113;
            case 52 -> 69;
            case 53 -> 158;
            case 54 -> 152;
            case 55 -> 179;
            case 56 -> 108;
            case 57 -> 116;
            case 58 -> 208;
            case 59 -> 46;
            case 60 -> 9;
            case 61 -> 115;
            case 62 -> 114;
            case 63 -> 92;
            case 64 -> 78;
            case 65 -> 105;
            case 66 -> 141;
            case 67 -> 8;
            case 68 -> 27;
            case 69 -> 160;
            case 70 -> 220;
            case 71 -> 97;
            case 72 -> 28;
            case 73 -> 23;
            case 74 -> 163;
            case 75 -> 5;
            case 76 -> 188;
            case 77 -> 227;
            case 78 -> 199;
            case 79 -> 45;
            case 80 -> 238;
            case 81 -> 251;
            case 82 -> 50;
            case 83 -> 206;
            case 84 -> 211;
            case 85 -> 10;
            case 86 -> 65;
            case 87 -> 201;
            case 88 -> 142;
            case 89 -> 147;
            case 90 -> 121;
            case 91 -> 99;
            case 92 -> 240;
            case 93 -> 14;
            case 94 -> 110;
            case 95 -> 207;
            case 96 -> 225;
            case 97 -> 138;
            case 98 -> 40;
            case 99 -> 11;
            case 100 -> 35;
            case 101 -> 49;
            case 102 -> 143;
            case 103 -> 224;
            case 104 -> 197;
            case 105 -> 55;
            case 106 -> 167;
            case 107 -> 15;
            case 108 -> 37;
            case 109 -> 221;
            case 110 -> 232;
            case 111 -> 153;
            case 112 -> 134;
            case 113 -> 1;
            case 114 -> 130;
            case 115 -> 80;
            case 116 -> 184;
            case 117 -> 17;
            case 118 -> 48;
            case 119 -> 217;
            case 120 -> 195;
            case 121 -> 112;
            case 122 -> 89;
            case 123 -> 133;
            case 124 -> 229;
            case 125 -> 101;
            case 126 -> 76;
            case 127 -> 235;
            case 128 -> 146;
            case 129 -> 176;
            case 130 -> 222;
            case 131 -> 166;
            case 132 -> 248;
            case 133 -> 219;
            case 134 -> 216;
            case 135 -> 119;
            case 136 -> 44;
            case 137 -> 252;
            case 138 -> 187;
            case 139 -> 20;
            case 140 -> 122;
            case 141 -> 67;
            case 142 -> 47;
            case 143 -> 185;
            case 144 -> 173;
            case 145 -> 109;
            case 146 -> 36;
            case 147 -> 118;
            case 148 -> 157;
            case 149 -> 223;
            case 150 -> 117;
            case 151 -> 200;
            case 152 -> 253;
            case 153 -> 196;
            case 154 -> 254;
            case 155 -> 239;
            case 156 -> 22;
            case 157 -> 172;
            case 158 -> 151;
            case 159 -> 126;
            case 160 -> 127;
            case 161 -> 175;
            case 162 -> 135;
            case 163 -> 246;
            case 164 -> 156;
            case 165 -> 90;
            case 166 -> 54;
            case 167 -> 96;
            case 168 -> 169;
            case 169 -> 249;
            case 170 -> 129;
            case 171 -> 98;
            case 172 -> 60;
            case 173 -> 212;
            case 174 -> 233;
            case 175 -> 75;
            case 176 -> 132;
            case 177 -> 164;
            case 178 -> 58;
            case 179 -> 144;
            case 180 -> 13;
            case 181 -> 131;
            case 182 -> 68;
            case 183 -> 91;
            case 184 -> 0;
            case 185 -> 71;
            case 186 -> 31;
            case 187 -> 189;
            case 188 -> 215;
            case 189 -> 168;
            case 190 -> 94;
            case 191 -> 237;
            case 192 -> 154;
            case 193 -> 34;
            case 194 -> 203;
            case 195 -> 32;
            case 196 -> 64;
            case 197 -> 136;
            case 198 -> 178;
            case 199 -> 182;
            case 200 -> 177;
            case 201 -> 241;
            case 202 -> 63;
            case 203 -> 86;
            case 204 -> 100;
            case 205 -> 230;
            case 206 -> 181;
            case 207 -> 12;
            case 208 -> 111;
            case 209 -> 236;
            case 210 -> 210;
            case 211 -> 204;
            case 212 -> 79;
            case 213 -> 244;
            case 214 -> 124;
            case 215 -> 70;
            case 216 -> 26;
            case 217 -> 42;
            case 218 -> 174;
            case 219 -> 29;
            case 220 -> 209;
            case 221 -> 155;
            case 222 -> 250;
            case 223 -> 243;
            case 224 -> 104;
            case 225 -> 193;
            case 226 -> 170;
            case 227 -> 247;
            case 228 -> 161;
            case 229 -> 234;
            case 230 -> 18;
            case 231 -> 19;
            case 232 -> 242;
            case 233 -> 72;
            case 234 -> 202;
            case 235 -> 145;
            case 236 -> 38;
            case 237 -> 81;
            case 238 -> 24;
            case 239 -> 148;
            case 240 -> 93;
            case 241 -> 87;
            case 242 -> 180;
            case 243 -> 21;
            case 244 -> 128;
            case 245 -> 231;
            case 246 -> 59;
            case 247 -> 120;
            case 248 -> 123;
            case 249 -> 198;
            case 250 -> 88;
            case 251 -> 192;
            case 252 -> 16;
            case 253 -> 103;
            case 254 -> 41;
            default -> 3;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for ( var7 = 0; var7 < var3.length; var7++) {
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

   // PX-FIX SYN5: Kotlin default-argument bridge methods recovered from class bytes (name,descriptor) exact.
   // The obfuscator opaque predicate call (R()/Q()) and the NoWhenBranchMatchedException try/catch wrapper are
   // dropped; the coherent path (null-marker guard, default assignments, delegation) is transcribed instead.
   // javac records only ACC_PUBLIC, not ACC_SYNTHETIC/ACC_BRIDGE, so that flag deviation is expected.

   public llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4, java.util.List var5, java.lang.String var6, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var7, java.util.List var8, java.util.List var9, boolean var10, boolean var11, boolean var12, boolean var13, int var14, kotlin.jvm.internal.DefaultConstructorMarker var15) {
      if ((var14 & 128) != 0) {
         var8 = kotlin.collections.CollectionsKt.emptyList();
      }
      if ((var14 & 256) != 0) {
         var9 = kotlin.collections.CollectionsKt.emptyList();
      }
      if ((var14 & 512) != 0) {
         var10 = false;
      }
      if ((var14 & 1024) != 0) {
         var11 = false;
      }
      if ((var14 & 2048) != 0) {
         var12 = false;
      }
      if ((var14 & 4096) != 0) {
         var13 = false;
      }
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
   }
   public static void a(me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var0, com.mojang.blaze3d.vertex.PoseStack var1, java.util.ArrayList var2, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var4, float var5, boolean var6, int var7, java.lang.Object var8) {
      if (var8 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderRoute");
      }
      if ((var7 & 4) != 0) {
         var3 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
      if ((var7 & 8) != 0) {
         var4 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }
      if ((var7 & 16) != 0) {
         var5 = 0.3F;
      }
      if ((var7 & 32) != 0) {
         var6 = false;
      }
      var0.a(var1, var2, var3, var4, var5, var6);
   }
   public static void a(me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var0, java.io.File var1, java.util.ArrayList var2, boolean var3, int var4, java.lang.Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writePoints");
      }
      if ((var4 & 4) != 0) {
         var3 = true;
      }
      var0.a(var1, var2, var3);
   }
   public static void a(me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var0, java.lang.Integer var1, net.minecraft.core.BlockPos var2, int var3, java.lang.Object var4) {
      if (var4 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
      }
      if ((var3 & 1) != 0) {
         var1 = null;
      }
      if ((var3 & 2) != 0) {
         var2 = null;
      }
      var0.a(var1, var2);
   }
   public static void a(me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var0, java.util.ArrayList var1, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var2, me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll var3, float var4, int var5, java.lang.Object var6) {
      if (var6 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderRoute");
      }
      if ((var5 & 2) != 0) {
         var2 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
      if ((var5 & 4) != 0) {
         var3 = me.octo.client.utils.llIIIIlIIIllIIllIllIIllIlIIlIlIlllIlllIlIlIlIIlIlIIIIllllllIllIIIIlIllIllIIIlIIlIllll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }
      if ((var5 & 8) != 0) {
         var4 = 0.3F;
      }
      var0.a(var1, var2, var3, var4);
   }
   public static void a(me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII var0, me.octo.client.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1, java.lang.Integer var2, net.minecraft.core.BlockPos var3, int var4, java.lang.Object var5) {
      if (var5 != null) {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
      }
      if ((var4 & 2) != 0) {
         var2 = null;
      }
      if ((var4 & 4) != 0) {
         var3 = null;
      }
      var0.a(var1, var2, var3);
   }

   public static enum IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] c() {
         return new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl };
      }


      public static llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] a() {
         return (IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clone();
      }

      public static llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI a(
         String var0
      ) {
         return Enum.valueOf(
            llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.class,
            var0
         );
      }

      @NotNull
      public static EnumEntries<llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> b() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      private static final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI[]{IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl};

      private static final EnumEntries<IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = EnumEntriesKt.enumEntries(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @SerializedName("x")
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @SerializedName("y")
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @SerializedName("z")
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @SerializedName("moveType")
      @NotNull
      private final String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var1,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var2,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var3,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var4
      ) {
         short var10001 = -14642;
         short var10002 = -3585;
         Intrinsics.checkNotNullParameter(var4, "moveType");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var1,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var2,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var3,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var4
      ) {
         short var10001 = -14647;
         short var10002 = 25251;
         Intrinsics.checkNotNullParameter(var4, "moveType");
         return new llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = -14641;
         String var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = 27244;
         short var10002 = -14645;
         short var10003 = -6392;
         short var10004 = -14646;
         short var10005 = -10264;
         short var10006 = -14648;
         short var10007 = -14686;
         return "PolinexForgeWaypoint(x=" + var4 + ", y=" + var3 + ", z=" + var2 + ", moveType=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3 = (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (!var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            if (!var2) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2) {
                  break label56;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (!var2) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "\u00030¯³\u0004p\u0091Â\u0087\bÃ\u009cÑØ&h£\u0003\u000b\u007fK4\u008eÀõ=3$Jk";
         int var4 = "\u00030¯³\u0004p\u0091Â\u0087\bÃ\u009cÑØ&h£\u0003\u000b\u007fK4\u008eÀõ=3$Jk".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 10;
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
                        case 0 -> 91;
                        case 1 -> 71;
                        case 2 -> 63;
                        case 3 -> 15;
                        case 4 -> 92;
                        case 5 -> 105;
                        default -> 9;
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
                        b = new String[6];
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

                     var2 = "Ëîè\"Ú\u001eñÉ³b\u0087]Wr«æëßÙ°Á\u0011½\bXP\u001aùçô#(";
                     var4 = "Ëîè\"Ú\u001eñÉ³b\u0087]Wr«æëßÙ°Á\u0011½\bXP\u001aùçô#(".length();
                     var1 = 23;
                     var8 = -1;
               }

               var10000 = 124;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ -14645) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 207;
               case 1 -> 90;
               case 2 -> 213;
               case 3 -> 101;
               case 4 -> 102;
               case 5 -> 232;
               case 6 -> 221;
               case 7 -> 189;
               case 8 -> 84;
               case 9 -> 247;
               case 10 -> 25;
               case 11 -> 151;
               case 12 -> 76;
               case 13 -> 136;
               case 14 -> 240;
               case 15 -> 228;
               case 16 -> 216;
               case 17 -> 171;
               case 18 -> 166;
               case 19 -> 220;
               case 20 -> 52;
               case 21 -> 148;
               case 22 -> 54;
               case 23 -> 204;
               case 24 -> 217;
               case 25 -> 155;
               case 26 -> 10;
               case 27 -> 5;
               case 28 -> 175;
               case 29 -> 80;
               case 30 -> 120;
               case 31 -> 163;
               case 32 -> 50;
               case 33 -> 219;
               case 34 -> 234;
               case 35 -> 159;
               case 36 -> 113;
               case 37 -> 252;
               case 38 -> 44;
               case 39 -> 180;
               case 40 -> 105;
               case 41 -> 62;
               case 42 -> 157;
               case 43 -> 236;
               case 44 -> 72;
               case 45 -> 29;
               case 46 -> 160;
               case 47 -> 51;
               case 48 -> 245;
               case 49 -> 4;
               case 50 -> 19;
               case 51 -> 201;
               case 52 -> 123;
               case 53 -> 41;
               case 54 -> 242;
               case 55 -> 56;
               case 56 -> 66;
               case 57 -> 13;
               case 58 -> 3;
               case 59 -> 79;
               case 60 -> 203;
               case 61 -> 60;
               case 62 -> 130;
               case 63 -> 46;
               case 64 -> 71;
               case 65 -> 67;
               case 66 -> 57;
               case 67 -> 85;
               case 68 -> 39;
               case 69 -> 125;
               case 70 -> 22;
               case 71 -> 249;
               case 72 -> 32;
               case 73 -> 255;
               case 74 -> 235;
               case 75 -> 20;
               case 76 -> 95;
               case 77 -> 16;
               case 78 -> 147;
               case 79 -> 83;
               case 80 -> 250;
               case 81 -> 132;
               case 82 -> 138;
               case 83 -> 34;
               case 84 -> 179;
               case 85 -> 202;
               case 86 -> 6;
               case 87 -> 146;
               case 88 -> 133;
               case 89 -> 15;
               case 90 -> 98;
               case 91 -> 43;
               case 92 -> 153;
               case 93 -> 253;
               case 94 -> 174;
               case 95 -> 49;
               case 96 -> 227;
               case 97 -> 158;
               case 98 -> 97;
               case 99 -> 195;
               case 100 -> 70;
               case 101 -> 182;
               case 102 -> 58;
               case 103 -> 230;
               case 104 -> 183;
               case 105 -> 94;
               case 106 -> 143;
               case 107 -> 86;
               case 108 -> 48;
               case 109 -> 93;
               case 110 -> 223;
               case 111 -> 75;
               case 112 -> 63;
               case 113 -> 177;
               case 114 -> 239;
               case 115 -> 144;
               case 116 -> 225;
               case 117 -> 99;
               case 118 -> 35;
               case 119 -> 251;
               case 120 -> 209;
               case 121 -> 214;
               case 122 -> 205;
               case 123 -> 116;
               case 124 -> 114;
               case 125 -> 226;
               case 126 -> 192;
               case 127 -> 237;
               case 128 -> 1;
               case 129 -> 18;
               case 130 -> 198;
               case 131 -> 172;
               case 132 -> 112;
               case 133 -> 106;
               case 134 -> 91;
               case 135 -> 154;
               case 136 -> 233;
               case 137 -> 168;
               case 138 -> 36;
               case 139 -> 122;
               case 140 -> 92;
               case 141 -> 73;
               case 142 -> 152;
               case 143 -> 187;
               case 144 -> 137;
               case 145 -> 161;
               case 146 -> 164;
               case 147 -> 142;
               case 148 -> 173;
               case 149 -> 0;
               case 150 -> 140;
               case 151 -> 103;
               case 152 -> 121;
               case 153 -> 28;
               case 154 -> 208;
               case 155 -> 229;
               case 156 -> 17;
               case 157 -> 37;
               case 158 -> 38;
               case 159 -> 134;
               case 160 -> 211;
               case 161 -> 248;
               case 162 -> 241;
               case 163 -> 88;
               case 164 -> 118;
               case 165 -> 107;
               case 166 -> 78;
               case 167 -> 74;
               case 168 -> 238;
               case 169 -> 156;
               case 170 -> 9;
               case 171 -> 206;
               case 172 -> 231;
               case 173 -> 193;
               case 174 -> 8;
               case 175 -> 190;
               case 176 -> 89;
               case 177 -> 162;
               case 178 -> 65;
               case 179 -> 199;
               case 180 -> 178;
               case 181 -> 33;
               case 182 -> 246;
               case 183 -> 64;
               case 184 -> 31;
               case 185 -> 27;
               case 186 -> 24;
               case 187 -> 184;
               case 188 -> 135;
               case 189 -> 21;
               case 190 -> 243;
               case 191 -> 68;
               case 192 -> 47;
               case 193 -> 181;
               case 194 -> 215;
               case 195 -> 69;
               case 196 -> 23;
               case 197 -> 96;
               case 198 -> 45;
               case 199 -> 222;
               case 200 -> 224;
               case 201 -> 77;
               case 202 -> 210;
               case 203 -> 167;
               case 204 -> 55;
               case 205 -> 30;
               case 206 -> 212;
               case 207 -> 145;
               case 208 -> 186;
               case 209 -> 82;
               case 210 -> 139;
               case 211 -> 11;
               case 212 -> 131;
               case 213 -> 110;
               case 214 -> 53;
               case 215 -> 196;
               case 216 -> 128;
               case 217 -> 149;
               case 218 -> 109;
               case 219 -> 115;
               case 220 -> 59;
               case 221 -> 40;
               case 222 -> 81;
               case 223 -> 111;
               case 224 -> 197;
               case 225 -> 119;
               case 226 -> 61;
               case 227 -> 200;
               case 228 -> 244;
               case 229 -> 104;
               case 230 -> 100;
               case 231 -> 218;
               case 232 -> 87;
               case 233 -> 194;
               case 234 -> 141;
               case 235 -> 117;
               case 236 -> 176;
               case 237 -> 254;
               case 238 -> 26;
               case 239 -> 169;
               case 240 -> 12;
               case 241 -> 2;
               case 242 -> 126;
               case 243 -> 185;
               case 244 -> 108;
               case 245 -> 165;
               case 246 -> 124;
               case 247 -> 42;
               case 248 -> 7;
               case 249 -> 127;
               case 250 -> 170;
               case 251 -> 14;
               case 252 -> 191;
               case 253 -> 129;
               case 254 -> 188;
               default -> 150;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for ( var7 = 0; var7 < var3.length; var7++) {
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

   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll a(IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1, int var2, int var3, int var4, String var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var6 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var6 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var6 & 8) != 0) {
         var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      return var1.a(var2, var3, var4, var5);
   }

   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @SerializedName("x")
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @SerializedName("y")
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @SerializedName("z")
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @SerializedName("options")
      @NotNull
      private final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var1,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var2,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var3,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4
      ) {
         short var10001 = 7223;
         short var10002 = -28858;
         Intrinsics.checkNotNullParameter(var4, "options");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int b() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int c() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll d() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int e() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int f() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int g() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll h() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var1,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var2,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII int var3,
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4
      ) {
         short var10001 = 7217;
         short var10002 = -19867;
         Intrinsics.checkNotNullParameter(var4, "options");
         return new llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 7216;
         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -9235;
         short var10002 = 7221;
         short var10003 = 21153;
         short var10004 = 7220;
         short var10005 = 12230;
         short var10006 = 7222;
         short var10007 = -20640;
         return "ColeWeightWaypoint(x=" + var4 + ", y=" + var3 + ", z=" + var2 + ", options=" + var1 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.R();
         Object var10000 = this;
         if (!var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (!var2) {
            if (!(
               var10000 instanceof llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (!var2) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         label56: {
            if (!var2) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               if (var2) {
                  break label56;
               }

               var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
               var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            )) ? 1 : 0);
         }

         if (!var2) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
      char[] var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[6];
         int var3 = 0;
         String var2 = "Î_À\u008e\u0004±Z,.\n*AI\u0000\u008e\u000fO%)ð\u0007\u008ajm&iö×";
         int var4 = "Î_À\u008e\u0004±Z,.\n*AI\u0000\u008e\u000fO%)ð\u0007\u008ajm&iö×".length();
         char var1 = 4;
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 126;
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
                        case 0 -> 122;
                        case 1 -> 78;
                        case 2 -> 52;
                        case 3 -> 4;
                        case 4 -> 102;
                        case 5 -> 41;
                        default -> 118;
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
                        b = new String[6];
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

                     var2 = "\u0089\u0083\u000eY\u0094-ÿWPmöÕ°>sSú\u00947ºO\u0007Ñ¯´,à\u0005T";
                     var4 = "\u0089\u0083\u000eY\u0094-ÿWPmöÕ°>sSú\u00947ºO\u0007Ñ¯´,à\u0005T".length();
                     var1 = 21;
                     var8 = -1;
               }

               var10000 = 74;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 7220) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 111;
               case 1 -> 125;
               case 2 -> 200;
               case 3 -> 44;
               case 4 -> 34;
               case 5 -> 83;
               case 6 -> 88;
               case 7 -> 120;
               case 8 -> 236;
               case 9 -> 183;
               case 10 -> 126;
               case 11 -> 103;
               case 12 -> 39;
               case 13 -> 118;
               case 14 -> 218;
               case 15 -> 216;
               case 16 -> 194;
               case 17 -> 131;
               case 18 -> 146;
               case 19 -> 47;
               case 20 -> 211;
               case 21 -> 130;
               case 22 -> 4;
               case 23 -> 77;
               case 24 -> 30;
               case 25 -> 248;
               case 26 -> 73;
               case 27 -> 162;
               case 28 -> 6;
               case 29 -> 50;
               case 30 -> 13;
               case 31 -> 121;
               case 32 -> 177;
               case 33 -> 75;
               case 34 -> 165;
               case 35 -> 161;
               case 36 -> 49;
               case 37 -> 92;
               case 38 -> 21;
               case 39 -> 208;
               case 40 -> 174;
               case 41 -> 247;
               case 42 -> 78;
               case 43 -> 235;
               case 44 -> 26;
               case 45 -> 198;
               case 46 -> 94;
               case 47 -> 251;
               case 48 -> 202;
               case 49 -> 222;
               case 50 -> 157;
               case 51 -> 132;
               case 52 -> 159;
               case 53 -> 17;
               case 54 -> 196;
               case 55 -> 149;
               case 56 -> 90;
               case 57 -> 138;
               case 58 -> 136;
               case 59 -> 207;
               case 60 -> 7;
               case 61 -> 230;
               case 62 -> 86;
               case 63 -> 38;
               case 64 -> 53;
               case 65 -> 102;
               case 66 -> 228;
               case 67 -> 232;
               case 68 -> 145;
               case 69 -> 116;
               case 70 -> 5;
               case 71 -> 110;
               case 72 -> 55;
               case 73 -> 15;
               case 74 -> 0;
               case 75 -> 1;
               case 76 -> 25;
               case 77 -> 133;
               case 78 -> 169;
               case 79 -> 250;
               case 80 -> 108;
               case 81 -> 142;
               case 82 -> 24;
               case 83 -> 139;
               case 84 -> 171;
               case 85 -> 16;
               case 86 -> 143;
               case 87 -> 22;
               case 88 -> 227;
               case 89 -> 12;
               case 90 -> 242;
               case 91 -> 89;
               case 92 -> 141;
               case 93 -> 220;
               case 94 -> 37;
               case 95 -> 190;
               case 96 -> 148;
               case 97 -> 28;
               case 98 -> 178;
               case 99 -> 93;
               case 100 -> 14;
               case 101 -> 64;
               case 102 -> 234;
               case 103 -> 255;
               case 104 -> 36;
               case 105 -> 68;
               case 106 -> 63;
               case 107 -> 249;
               case 108 -> 31;
               case 109 -> 254;
               case 110 -> 27;
               case 111 -> 192;
               case 112 -> 60;
               case 113 -> 176;
               case 114 -> 71;
               case 115 -> 19;
               case 116 -> 253;
               case 117 -> 152;
               case 118 -> 10;
               case 119 -> 168;
               case 120 -> 154;
               case 121 -> 70;
               case 122 -> 11;
               case 123 -> 41;
               case 124 -> 229;
               case 125 -> 204;
               case 126 -> 199;
               case 127 -> 195;
               case 128 -> 66;
               case 129 -> 246;
               case 130 -> 206;
               case 131 -> 233;
               case 132 -> 124;
               case 133 -> 104;
               case 134 -> 186;
               case 135 -> 158;
               case 136 -> 80;
               case 137 -> 219;
               case 138 -> 54;
               case 139 -> 32;
               case 140 -> 62;
               case 141 -> 166;
               case 142 -> 101;
               case 143 -> 79;
               case 144 -> 223;
               case 145 -> 239;
               case 146 -> 140;
               case 147 -> 82;
               case 148 -> 107;
               case 149 -> 67;
               case 150 -> 184;
               case 151 -> 167;
               case 152 -> 109;
               case 153 -> 72;
               case 154 -> 156;
               case 155 -> 29;
               case 156 -> 18;
               case 157 -> 129;
               case 158 -> 237;
               case 159 -> 221;
               case 160 -> 137;
               case 161 -> 172;
               case 162 -> 193;
               case 163 -> 115;
               case 164 -> 40;
               case 165 -> 122;
               case 166 -> 46;
               case 167 -> 240;
               case 168 -> 209;
               case 169 -> 48;
               case 170 -> 114;
               case 171 -> 155;
               case 172 -> 213;
               case 173 -> 173;
               case 174 -> 23;
               case 175 -> 175;
               case 176 -> 181;
               case 177 -> 127;
               case 178 -> 95;
               case 179 -> 9;
               case 180 -> 96;
               case 181 -> 8;
               case 182 -> 58;
               case 183 -> 61;
               case 184 -> 105;
               case 185 -> 243;
               case 186 -> 76;
               case 187 -> 245;
               case 188 -> 182;
               case 189 -> 87;
               case 190 -> 2;
               case 191 -> 185;
               case 192 -> 113;
               case 193 -> 150;
               case 194 -> 188;
               case 195 -> 84;
               case 196 -> 244;
               case 197 -> 163;
               case 198 -> 97;
               case 199 -> 74;
               case 200 -> 238;
               case 201 -> 106;
               case 202 -> 224;
               case 203 -> 20;
               case 204 -> 170;
               case 205 -> 252;
               case 206 -> 65;
               case 207 -> 212;
               case 208 -> 180;
               case 209 -> 214;
               case 210 -> 85;
               case 211 -> 164;
               case 212 -> 151;
               case 213 -> 201;
               case 214 -> 203;
               case 215 -> 91;
               case 216 -> 99;
               case 217 -> 226;
               case 218 -> 112;
               case 219 -> 189;
               case 220 -> 33;
               case 221 -> 134;
               case 222 -> 144;
               case 223 -> 210;
               case 224 -> 231;
               case 225 -> 215;
               case 226 -> 3;
               case 227 -> 51;
               case 228 -> 128;
               case 229 -> 57;
               case 230 -> 123;
               case 231 -> 81;
               case 232 -> 160;
               case 233 -> 205;
               case 234 -> 187;
               case 235 -> 43;
               case 236 -> 179;
               case 237 -> 52;
               case 238 -> 217;
               case 239 -> 147;
               case 240 -> 241;
               case 241 -> 98;
               case 242 -> 42;
               case 243 -> 225;
               case 244 -> 119;
               case 245 -> 56;
               case 246 -> 191;
               case 247 -> 135;
               case 248 -> 45;
               case 249 -> 197;
               case 250 -> 69;
               case 251 -> 59;
               case 252 -> 117;
               case 253 -> 35;
               case 254 -> 153;
               default -> 100;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for ( var7 = 0; var7 < var3.length; var7++) {
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

   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, int var2, int var3, int var4, me.octo.client.llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      if ((var6 & 2) != 0) {
         var3 = var1.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }
      if ((var6 & 4) != 0) {
         var4 = var1.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }
      if ((var6 & 8) != 0) {
         var5 = var1.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
      return var1.a(var2, var3, var4, var5);
   }

   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @SerializedName("name")
      @NotNull
      public final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] a;
      private static String[] b;

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var1
      ) {
         short var10001 = 28474;
         short var10002 = 1251;
         Intrinsics.checkNotNullParameter(var1, "name");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      @NotNull
      public final String a() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String b() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(
         @IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII @NotNull String var1
      ) {
         short var10001 = 28472;
         short var10002 = -29306;
         Intrinsics.checkNotNullParameter(var1, "name");
         return new llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10001 = 28473;
         short var10002 = -31466;
         return "ColeWeightOptions(name=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ")";
      }

      @Override
      public int hashCode() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         boolean var2 = llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.Q();
         Object var10000 = this;
         if (var2) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2) {
            if (!(
               var10000 instanceof llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
            )) {
               return false;
            }

            var10000 = var1;
         }

         llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (llIIlllIlIIlllIIllIlIlIIIlIIllIlllIllIlIllIIllIlIllIIIlllIlIllllIIIIIlIIlllIlIIlIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         boolean var4 = Intrinsics.areEqual(
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         );
         if (var2) {
            if (!var4) {
               return false;
            }

            var4 = true;
         }

         return var4;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: {
         String[] var5 = new String[3];
         int var3 = 0;
         String var2 = "\u0081ô\u008f³\u0017!\u0081\u0012Ò\"vÐâ&Òë\u0006/\u0097òÈÞ\u0097~>AmÅ\u0004»\u0018È.";
         int var4 = "\u0081ô\u008f³\u0017!\u0081\u0012Ò\"vÐâ&Òë\u0006/\u0097òÈÞ\u0097~>AmÅ\u0004»\u0018È.".length();
         char var1 = 4;
         int var0 = -1;

         while (true) {
            char[] var10002;
            label38: {
               char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
               int var10004 = var10003.length;
               int var6 = 0;
               byte var13 = 120;
               var10002 = var10003;
               int var8 = var10004;
               byte var16;
               char[] var10005;
               int var10006;
               if (var10004 <= 1) {
                  var10005 = var10003;
                  var16 = 120;
                  var10006 = var6;
               } else {
                  var13 = 120;
                  var8 = var10004;
                  if (var10004 <= var6) {
                     break label38;
                  }

                  var10005 = var10003;
                  var16 = 120;
                  var10006 = var6;
               }

               while (true) {
                  var10005[var10006] = (char)(var10005[var10006] ^ var16 ^ switch (var6 % 7) {
                     case 0 -> 82;
                     case 1 -> 33;
                     case 2 -> 76;
                     case 3 -> 86;
                     case 4 -> 40;
                     case 5 -> 61;
                     default -> 50;
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
               b = new String[3];
               break pxClinit;
            }

            var1 = var2.charAt(var0);
         }
      }
}

      private static String a(int var0, int var1) { int var7 = 0; // PX-FIX hoist
        
         int var2 = (var0 ^ 28472) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 220;
               case 1 -> 119;
               case 2 -> 15;
               case 3 -> 111;
               case 4 -> 141;
               case 5 -> 107;
               case 6 -> 43;
               case 7 -> 39;
               case 8 -> 234;
               case 9 -> 208;
               case 10 -> 134;
               case 11 -> 206;
               case 12 -> 199;
               case 13 -> 41;
               case 14 -> 224;
               case 15 -> 254;
               case 16 -> 32;
               case 17 -> 125;
               case 18 -> 51;
               case 19 -> 77;
               case 20 -> 149;
               case 21 -> 126;
               case 22 -> 12;
               case 23 -> 92;
               case 24 -> 170;
               case 25 -> 128;
               case 26 -> 222;
               case 27 -> 207;
               case 28 -> 150;
               case 29 -> 65;
               case 30 -> 246;
               case 31 -> 38;
               case 32 -> 241;
               case 33 -> 99;
               case 34 -> 253;
               case 35 -> 255;
               case 36 -> 185;
               case 37 -> 95;
               case 38 -> 69;
               case 39 -> 1;
               case 40 -> 40;
               case 41 -> 235;
               case 42 -> 139;
               case 43 -> 194;
               case 44 -> 219;
               case 45 -> 230;
               case 46 -> 147;
               case 47 -> 93;
               case 48 -> 61;
               case 49 -> 113;
               case 50 -> 67;
               case 51 -> 118;
               case 52 -> 42;
               case 53 -> 80;
               case 54 -> 179;
               case 55 -> 35;
               case 56 -> 82;
               case 57 -> 183;
               case 58 -> 172;
               case 59 -> 168;
               case 60 -> 103;
               case 61 -> 68;
               case 62 -> 86;
               case 63 -> 138;
               case 64 -> 108;
               case 65 -> 197;
               case 66 -> 160;
               case 67 -> 242;
               case 68 -> 55;
               case 69 -> 243;
               case 70 -> 11;
               case 71 -> 167;
               case 72 -> 79;
               case 73 -> 102;
               case 74 -> 52;
               case 75 -> 186;
               case 76 -> 53;
               case 77 -> 249;
               case 78 -> 233;
               case 79 -> 209;
               case 80 -> 29;
               case 81 -> 18;
               case 82 -> 70;
               case 83 -> 91;
               case 84 -> 136;
               case 85 -> 129;
               case 86 -> 148;
               case 87 -> 231;
               case 88 -> 178;
               case 89 -> 155;
               case 90 -> 236;
               case 91 -> 17;
               case 92 -> 120;
               case 93 -> 192;
               case 94 -> 83;
               case 95 -> 112;
               case 96 -> 247;
               case 97 -> 3;
               case 98 -> 58;
               case 99 -> 132;
               case 100 -> 251;
               case 101 -> 9;
               case 102 -> 142;
               case 103 -> 10;
               case 104 -> 88;
               case 105 -> 20;
               case 106 -> 177;
               case 107 -> 46;
               case 108 -> 34;
               case 109 -> 218;
               case 110 -> 64;
               case 111 -> 174;
               case 112 -> 187;
               case 113 -> 152;
               case 114 -> 23;
               case 115 -> 62;
               case 116 -> 31;
               case 117 -> 104;
               case 118 -> 232;
               case 119 -> 227;
               case 120 -> 176;
               case 121 -> 4;
               case 122 -> 44;
               case 123 -> 84;
               case 124 -> 198;
               case 125 -> 49;
               case 126 -> 159;
               case 127 -> 50;
               case 128 -> 215;
               case 129 -> 200;
               case 130 -> 216;
               case 131 -> 135;
               case 132 -> 66;
               case 133 -> 96;
               case 134 -> 115;
               case 135 -> 196;
               case 136 -> 109;
               case 137 -> 213;
               case 138 -> 245;
               case 139 -> 210;
               case 140 -> 127;
               case 141 -> 140;
               case 142 -> 54;
               case 143 -> 0;
               case 144 -> 85;
               case 145 -> 228;
               case 146 -> 73;
               case 147 -> 137;
               case 148 -> 252;
               case 149 -> 116;
               case 150 -> 182;
               case 151 -> 239;
               case 152 -> 76;
               case 153 -> 13;
               case 154 -> 72;
               case 155 -> 191;
               case 156 -> 78;
               case 157 -> 117;
               case 158 -> 123;
               case 159 -> 14;
               case 160 -> 21;
               case 161 -> 161;
               case 162 -> 37;
               case 163 -> 165;
               case 164 -> 166;
               case 165 -> 45;
               case 166 -> 59;
               case 167 -> 114;
               case 168 -> 101;
               case 169 -> 105;
               case 170 -> 124;
               case 171 -> 193;
               case 172 -> 57;
               case 173 -> 100;
               case 174 -> 5;
               case 175 -> 16;
               case 176 -> 24;
               case 177 -> 27;
               case 178 -> 145;
               case 179 -> 2;
               case 180 -> 131;
               case 181 -> 163;
               case 182 -> 89;
               case 183 -> 181;
               case 184 -> 175;
               case 185 -> 201;
               case 186 -> 238;
               case 187 -> 98;
               case 188 -> 240;
               case 189 -> 250;
               case 190 -> 146;
               case 191 -> 173;
               case 192 -> 71;
               case 193 -> 130;
               case 194 -> 248;
               case 195 -> 26;
               case 196 -> 121;
               case 197 -> 158;
               case 198 -> 110;
               case 199 -> 22;
               case 200 -> 221;
               case 201 -> 30;
               case 202 -> 153;
               case 203 -> 205;
               case 204 -> 162;
               case 205 -> 133;
               case 206 -> 171;
               case 207 -> 151;
               case 208 -> 8;
               case 209 -> 63;
               case 210 -> 25;
               case 211 -> 33;
               case 212 -> 203;
               case 213 -> 217;
               case 214 -> 74;
               case 215 -> 48;
               case 216 -> 211;
               case 217 -> 6;
               case 218 -> 156;
               case 219 -> 97;
               case 220 -> 195;
               case 221 -> 164;
               case 222 -> 75;
               case 223 -> 188;
               case 224 -> 157;
               case 225 -> 226;
               case 226 -> 87;
               case 227 -> 60;
               case 228 -> 212;
               case 229 -> 229;
               case 230 -> 237;
               case 231 -> 214;
               case 232 -> 94;
               case 233 -> 81;
               case 234 -> 56;
               case 235 -> 36;
               case 236 -> 180;
               case 237 -> 223;
               case 238 -> 106;
               case 239 -> 154;
               case 240 -> 202;
               case 241 -> 19;
               case 242 -> 90;
               case 243 -> 184;
               case 244 -> 244;
               case 245 -> 190;
               case 246 -> 122;
               case 247 -> 144;
               case 248 -> 169;
               case 249 -> 7;
               case 250 -> 143;
               case 251 -> 189;
               case 252 -> 225;
               case 253 -> 47;
               case 254 -> 28;
               default -> 204;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for ( var7 = 0; var7 < var3.length; var7++) {
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

   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1, String var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var2 = var1.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      return var1.a(var2);
   }

   }
}
