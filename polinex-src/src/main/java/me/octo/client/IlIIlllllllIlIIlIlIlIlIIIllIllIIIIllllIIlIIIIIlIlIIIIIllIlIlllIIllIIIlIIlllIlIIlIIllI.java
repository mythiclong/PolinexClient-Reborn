package me.octo.client;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI {
   public static me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX missing field (typed to WhenMappings)

        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI(Object... px) {
           this((List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl>)null, (List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl>)null, (List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl>)null); // PX-FIX: 委托主构造器（final 字段初始化）
        }

   @NotNull
   public static IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   private static Lazy<KSerializer<Object>>[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] a;
   private static String[] b;

   public IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI(
      @NotNull List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> var1,
      @NotNull List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> var2,
      @NotNull List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> var3
   ) {
      short var10001 = 31230;
      short var10002 = 1622;
      Intrinsics.checkNotNullParameter(var1, "weapons");
      var10001 = 31227;
      var10002 = -24834;
      Intrinsics.checkNotNullParameter(var2, "armor");
      var10001 = 31225;
      var10002 = 2154;
      Intrinsics.checkNotNullParameter(var3, "rarities");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var3;
   }

   @NotNull
   public final List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> e() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> g() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> h() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> i() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI a(
      @NotNull List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> var1,
      @NotNull List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> var2,
      @NotNull List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> var3
   ) {
      short var10001 = 31217;
      short var10002 = 31187;
      Intrinsics.checkNotNullParameter(var1, "weapons");
      var10001 = 31224;
      var10002 = 8426;
      Intrinsics.checkNotNullParameter(var2, "armor");
      var10001 = 31228;
      var10002 = -14647;
      Intrinsics.checkNotNullParameter(var3, "rarities");
      return new IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI(var1, var2, var3);
   }

   @NotNull
   @Override
   public String toString() {
      short var10000 = 31231;
      List var1 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      List var2 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      List var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      short var10001 = 8189;
      short var10002 = 31229;
      short var10003 = -32203;
      short var10004 = 31226;
      short var10005 = -24779;
      return "JsonCategories(weapons=" + var3 + ", armor=" + var2 + ", rarities=" + var1 + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      var1 = var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
      return var1 * 31 + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      String var2 = lIIlIIIIIIlIIlIIIIlIIIlllIlllIIIllIllIllIlIIlIlIIIIllIIllIIIIlIIllllIIlIllIlIllllIlll.g();
      Object var10000 = this;
      if (var2 != null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 != null) {
         if (!(var10000 instanceof IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI)) {
            return false;
         }

         var10000 = var1;
      }

      IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI var3 = (IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI)var10000;
      boolean var4 = Intrinsics.areEqual(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
      );
      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
            var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = Intrinsics.areEqual(
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
            var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
      }

      if (var2 != null) {
         if (!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   // SYN3-defaultarg: jar <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
   public IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI(
      List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> var1,
      List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> var2,
      List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> var3,
      int var4,
      DefaultConstructorMarker var5
   ) {
      if ((var4 & 1) != 0) {
         var1 = kotlin.collections.CollectionsKt.emptyList();
      }

      if ((var4 & 2) != 0) {
         var2 = kotlin.collections.CollectionsKt.emptyList();
      }

      if ((var4 & 4) != 0) {
         var3 = kotlin.collections.CollectionsKt.emptyList();
      }

      this(var1, var2, var3);
   }

   public IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI() {
      this(null, null, null, 7, null);
   }

   // SYN3-defaultarg: copy$default bridge (jar: a$(Lself;List;List;List;ILjava/lang/Object;)Lself;)
   public static IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI a(
      IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI var0,
      List var1,
      List var2,
      List var3,
      int var4,
      Object var5
   ) {
      if ((var4 & 1) != 0) {
         var1 = var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      return var0.a((List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl>)var1, (List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl>)var2, (List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl>)var3);
   }

   // Kotlin @Serializable deserialisation constructor: jar <init>(ILjava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
   // The (int mask, ...) form encodes "which fields are present"; here the encoded values
   // are passed straight through to the primary constructor.
   public IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI(
      int var1,
      List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl> var2,
      List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl> var3,
      List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl> var4,
      kotlinx.serialization.internal.SerializationConstructorMarker var5
   ) {
      this(var2, var3, var4);
   }

   // Kotlin @Serializable generated writer. The facade method name in the jar is
   // 'a'; the descriptor is the only reliable identity here.
   public static final void a(
      @NotNull IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI var0,
      @NotNull CompositeEncoder var1,
      @NotNull SerialDescriptor var2
   ) {
      Lazy[] var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      if (var1.shouldEncodeElementDefault(var2, 0) || !Intrinsics.areEqual(var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, kotlin.collections.CollectionsKt.emptyList())) {
         var1.encodeSerializableElement(var2, 0, (SerializationStrategy<? super List<IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl>>)var3[0].getValue(), var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      if (var1.shouldEncodeElementDefault(var2, 1) || !Intrinsics.areEqual(var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, kotlin.collections.CollectionsKt.emptyList())) {
         var1.encodeSerializableElement(var2, 1, (SerializationStrategy<? super List<IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl>>)var3[1].getValue(), var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      if (var1.shouldEncodeElementDefault(var2, 2) || !Intrinsics.areEqual(var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, kotlin.collections.CollectionsKt.emptyList())) {
         var1.encodeSerializableElement(var2, 2, (SerializationStrategy<? super List<IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl>>)var3[2].getValue(), var0.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }
   }

   // Obfuscator stripped the bodies of these three static methods (jar code is a bare 'return').
   public static void b() {
   }

   public static void d() {
   }

   public static void f() {
   }

   // Kotlin @Serializable element serializers for the three List-typed components.
   private static final KSerializer j() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
   }

   private static final KSerializer k() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
   }

   private static final KSerializer l() {
      return (KSerializer)(new ArrayListSerializer((KSerializer)IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl));
   }

   // Kotlin @Serializable lazy serializer table accessor.
   public static final Lazy[] m() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
      String[] var5 = new String[9];
      int var3 = 0;
      String var2 = "ÀóÍ\u0092ÏUä¨\u0005)&\u009e__\u0005£RÏÑu\u000b\u001eæ\u0083Q\u0000$Ê\u009cx?3\b\u001d\u0084ð\u000e\u0000¸0\u009d\b\u0004XUçÜû\u0086}\u0017\u008fÖ\u0006a?Ä:\u0085d\u008d½dÄ9LóZNÌÁ\u000büA";
      int var4 = "ÀóÍ\u0092ÏUä¨\u0005)&\u009e__\u0005£RÏÑu\u000b\u001eæ\u0083Q\u0000$Ê\u009cx?3\b\u001d\u0084ð\u000e\u0000¸0\u009d\b\u0004XUçÜû\u0086}\u0017\u008fÖ\u0006a?Ä:\u0085d\u008d½dÄ9LóZNÌÁ\u000büA"
         .length();
      char var1 = '\b';
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 19;
         String var10001 = var2.substring(++var9, var9 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var25 = var10001.toCharArray();
               int var10004 = var25.length;
               int var6 = 0;
               byte var28 = var10000;
               var21 = var25;
               int var15 = var10004;
               byte var33;
               char[] var37;
               int var10006;
               if (var10004 <= 1) {
                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               } else {
                  var28 = var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var37 = var25;
                  var33 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var37[var10006] = (char)(var37[var10006] ^ var33 ^ switch (var6 % 7) {
                     case 0 -> 79;
                     case 1 -> 13;
                     case 2 -> 3;
                     case 3 -> 24;
                     case 4 -> 47;
                     case 5 -> 88;
                     default -> 22;
                  });
                  var6++;
                  if (var28 == 0) {
                     var10006 = var28;
                     var37 = var21;
                     var33 = var28;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var37 = var21;
                     var33 = var28;
                     var10006 = var6;
                  }
               }
            }

            String var30 = new String(var21).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var30;
                  if ((var9 += var1) >= var4) {
                     a = var5;
                     b = new String[9];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     Lazy[] var7 = new Lazy[]{
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        )
                     };
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
                     break label52;
                  }

                  var1 = var2.charAt(var9);
                  break;
               default:
                  var5[var3++] = var30;
                  if ((var9 += var1) < var4) {
                     var1 = var2.charAt(var9);
                     continue label52;
                  }

                  var2 = "úz\u001b\u0019X>_\u0007>4\u0083ÐK\u0007=";
                  var4 = "úz\u001b\u0019X>_\u0007>4\u0083ÐK\u0007=".length();
                  var1 = 7;
                  var9 = -1;
            }

            var10000 = 121;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 31225) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 94;
            case 1 -> 51;
            case 2 -> 30;
            case 3 -> 3;
            case 4 -> 251;
            case 5 -> 150;
            case 6 -> 7;
            case 7 -> 189;
            case 8 -> 84;
            case 9 -> 197;
            case 10 -> 122;
            case 11 -> 215;
            case 12 -> 55;
            case 13 -> 239;
            case 14 -> 71;
            case 15 -> 216;
            case 16 -> 245;
            case 17 -> 219;
            case 18 -> 41;
            case 19 -> 17;
            case 20 -> 26;
            case 21 -> 212;
            case 22 -> 235;
            case 23 -> 136;
            case 24 -> 178;
            case 25 -> 6;
            case 26 -> 19;
            case 27 -> 81;
            case 28 -> 253;
            case 29 -> 102;
            case 30 -> 82;
            case 31 -> 99;
            case 32 -> 98;
            case 33 -> 75;
            case 34 -> 167;
            case 35 -> 65;
            case 36 -> 72;
            case 37 -> 112;
            case 38 -> 134;
            case 39 -> 22;
            case 40 -> 205;
            case 41 -> 184;
            case 42 -> 203;
            case 43 -> 67;
            case 44 -> 29;
            case 45 -> 139;
            case 46 -> 226;
            case 47 -> 53;
            case 48 -> 23;
            case 49 -> 238;
            case 50 -> 103;
            case 51 -> 143;
            case 52 -> 95;
            case 53 -> 242;
            case 54 -> 201;
            case 55 -> 87;
            case 56 -> 140;
            case 57 -> 174;
            case 58 -> 241;
            case 59 -> 105;
            case 60 -> 46;
            case 61 -> 11;
            case 62 -> 114;
            case 63 -> 10;
            case 64 -> 160;
            case 65 -> 200;
            case 66 -> 199;
            case 67 -> 154;
            case 68 -> 232;
            case 69 -> 56;
            case 70 -> 37;
            case 71 -> 138;
            case 72 -> 196;
            case 73 -> 111;
            case 74 -> 221;
            case 75 -> 33;
            case 76 -> 223;
            case 77 -> 173;
            case 78 -> 36;
            case 79 -> 62;
            case 80 -> 28;
            case 81 -> 131;
            case 82 -> 191;
            case 83 -> 240;
            case 84 -> 5;
            case 85 -> 176;
            case 86 -> 63;
            case 87 -> 115;
            case 88 -> 159;
            case 89 -> 153;
            case 90 -> 172;
            case 91 -> 108;
            case 92 -> 92;
            case 93 -> 254;
            case 94 -> 147;
            case 95 -> 204;
            case 96 -> 211;
            case 97 -> 76;
            case 98 -> 25;
            case 99 -> 171;
            case 100 -> 236;
            case 101 -> 27;
            case 102 -> 185;
            case 103 -> 88;
            case 104 -> 106;
            case 105 -> 15;
            case 106 -> 119;
            case 107 -> 0;
            case 108 -> 107;
            case 109 -> 50;
            case 110 -> 247;
            case 111 -> 222;
            case 112 -> 193;
            case 113 -> 35;
            case 114 -> 39;
            case 115 -> 116;
            case 116 -> 175;
            case 117 -> 214;
            case 118 -> 128;
            case 119 -> 230;
            case 120 -> 228;
            case 121 -> 195;
            case 122 -> 152;
            case 123 -> 188;
            case 124 -> 246;
            case 125 -> 145;
            case 126 -> 156;
            case 127 -> 182;
            case 128 -> 126;
            case 129 -> 190;
            case 130 -> 123;
            case 131 -> 237;
            case 132 -> 45;
            case 133 -> 129;
            case 134 -> 146;
            case 135 -> 21;
            case 136 -> 4;
            case 137 -> 32;
            case 138 -> 121;
            case 139 -> 18;
            case 140 -> 78;
            case 141 -> 187;
            case 142 -> 86;
            case 143 -> 248;
            case 144 -> 151;
            case 145 -> 157;
            case 146 -> 47;
            case 147 -> 249;
            case 148 -> 225;
            case 149 -> 101;
            case 150 -> 109;
            case 151 -> 217;
            case 152 -> 210;
            case 153 -> 40;
            case 154 -> 233;
            case 155 -> 135;
            case 156 -> 124;
            case 157 -> 79;
            case 158 -> 110;
            case 159 -> 77;
            case 160 -> 192;
            case 161 -> 16;
            case 162 -> 9;
            case 163 -> 38;
            case 164 -> 73;
            case 165 -> 213;
            case 166 -> 104;
            case 167 -> 13;
            case 168 -> 177;
            case 169 -> 24;
            case 170 -> 120;
            case 171 -> 180;
            case 172 -> 83;
            case 173 -> 207;
            case 174 -> 166;
            case 175 -> 44;
            case 176 -> 113;
            case 177 -> 220;
            case 178 -> 163;
            case 179 -> 227;
            case 180 -> 133;
            case 181 -> 90;
            case 182 -> 118;
            case 183 -> 158;
            case 184 -> 194;
            case 185 -> 148;
            case 186 -> 141;
            case 187 -> 80;
            case 188 -> 206;
            case 189 -> 162;
            case 190 -> 144;
            case 191 -> 34;
            case 192 -> 43;
            case 193 -> 161;
            case 194 -> 168;
            case 195 -> 179;
            case 196 -> 224;
            case 197 -> 12;
            case 198 -> 97;
            case 199 -> 68;
            case 200 -> 243;
            case 201 -> 1;
            case 202 -> 89;
            case 203 -> 127;
            case 204 -> 155;
            case 205 -> 181;
            case 206 -> 2;
            case 207 -> 70;
            case 208 -> 209;
            case 209 -> 61;
            case 210 -> 229;
            case 211 -> 100;
            case 212 -> 186;
            case 213 -> 234;
            case 214 -> 58;
            case 215 -> 60;
            case 216 -> 42;
            case 217 -> 170;
            case 218 -> 20;
            case 219 -> 250;
            case 220 -> 91;
            case 221 -> 202;
            case 222 -> 59;
            case 223 -> 231;
            case 224 -> 208;
            case 225 -> 117;
            case 226 -> 218;
            case 227 -> 125;
            case 228 -> 132;
            case 229 -> 48;
            case 230 -> 57;
            case 231 -> 66;
            case 232 -> 142;
            case 233 -> 93;
            case 234 -> 85;
            case 235 -> 49;
            case 236 -> 198;
            case 237 -> 183;
            case 238 -> 52;
            case 239 -> 8;
            case 240 -> 137;
            case 241 -> 14;
            case 242 -> 244;
            case 243 -> 130;
            case 244 -> 255;
            case 245 -> 74;
            case 246 -> 64;
            case 247 -> 149;
            case 248 -> 69;
            case 249 -> 31;
            case 250 -> 165;
            case 251 -> 252;
            case 252 -> 169;
            case 253 -> 54;
            case 254 -> 164;
            default -> 96;
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
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(Object... px) {
        }

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final KSerializer<IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI> a() {
      Object llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll = null; // PX-FIX
         return (KSerializer<IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI>)IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(kotlin.jvm.internal.DefaultConstructorMarker p0) {  }
   }
}