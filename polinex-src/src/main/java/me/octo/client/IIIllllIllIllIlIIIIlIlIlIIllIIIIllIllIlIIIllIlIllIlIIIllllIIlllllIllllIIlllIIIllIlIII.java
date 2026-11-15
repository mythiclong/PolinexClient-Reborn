package me.octo.client;
import kotlinx.serialization.SerializationStrategy;

import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII {

   @NotNull
   public static IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @JvmField
   @NotNull
   private static Lazy<KSerializer<Object>>[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] a;
   private static String[] b;

   public IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII(@NotNull String var1, @NotNull List<String> var2) {
      short var10001 = -13157;
      short var10002 = 7905;
      Intrinsics.checkNotNullParameter(var1, "displayId");
      var10001 = -13158;
      var10002 = 17010;
      Intrinsics.checkNotNullParameter(var2, "items");
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var2;
   }

   @NotNull
   public final String a() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("displayId"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void b() {
   }

   @NotNull
   public final List<String> c() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   // PX-FIX annotation-only: jar carries @kotlinx.serialization.SerialName("items"),
   // which has Java @Target(TYPE) and cannot be placed on a method by javac.
   public static void d() {
   }

   @NotNull
   public final String e() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final List<String> f() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII(int var1, String var2, List<String> var3, SerializationConstructorMarker var4) {
      if (3 != (3 & var1)) {
            PluginExceptionsKt.throwMissingFieldException(var1, 3, ((GeneratedSerializer)IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl).getDescriptor());
      }

      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
   }

   public static final void a(@NotNull IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII var0, @NotNull CompositeEncoder var1, @NotNull SerialDescriptor var2) {
      Lazy<KSerializer<Object>>[] var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      var1.encodeStringElement(var2, 0, var0.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      var1.encodeSerializableElement(var2, 1, (SerializationStrategy)var3[1].getValue(), var0.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
   }

   @NotNull
   public static IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII a(@NotNull IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII var0, @NotNull String var1, @NotNull List var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.a();
      }

      if ((var3 & 2) != 0) {
         var2 = var0.c();
      }

      return new IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII(var1, var2);
   }

   public final IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII a(@NotNull String var1, @NotNull List<String> var2) {
      short var10001 = -13155;
      short var10002 = 13708;
      Intrinsics.checkNotNullParameter(var1, "displayId");
      var10001 = -13153;
      var10002 = 20454;
      Intrinsics.checkNotNullParameter(var2, "items");
      return new IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII(var1, var2);
   }

   @NotNull
   @Override
   public String toString() {
      short var10002 = -13154;
      short var10003 = -13474;
      var10003 = -13156;
      short var10004 = -17540;
      return "JsonArmorSet(displayId="
         + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         + ", items="
         + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.hashCode();
      return var1 * 31 + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.hashCode();
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
         if (!(var10000 instanceof IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII)) {
            return false;
         }

         var10000 = var1;
      }

      IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII var3 = (IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII)var10000;
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

         var4 = true;
      }

      return var4;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var21 = null; // PX-FIX
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "C\u0085^ý\u0007å\u0086\u0082ðÛy9EÛ\u0081r^\u0001Û3\u001d9l\u0005ÄbãåÉ\bÅ¤\"újC\u0095ø\tW\u0011+(\u001b\u0091\u0099[\u0093";
      int var4 = "C\u0085^ý\u0007å\u0086\u0082ðÛy9EÛ\u0081r^\u0001Û3\u001d9l\u0005ÄbãåÉ\bÅ¤\"újC\u0095ø\tW\u0011+(\u001b\u0091\u0099[\u0093".length();
      char var1 = 23;
      int var9 = -1;

      label52:
while (true) {
         byte var10000 = 34;
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
                     case 0 -> 107;
                     case 1 -> 121;
                     case 2 -> 81;
                     case 3 -> 119;
                     case 4 -> 67;
                     case 5 -> 3;
                     default -> 108;
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
                     b = new String[6];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                     Lazy[] var7 = new Lazy[]{
                        null,
                        LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, () -> (KSerializer)(new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE)))
                     };
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
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

                  var2 = "}\" \u0099Õ\t¨ô à\u001eüM\u0082}";
                  var4 = "}\" \u0099Õ\t¨ô à\u001eüM\u0082}".length();
                  var1 = 5;
                  var9 = -1;
            }

            var10000 = 16;
            var10001 = var2.substring(++var9, var9 + var1);
            var10002 = 0;
         }
      }
   }

   private static final KSerializer<Object> g() {
      return new ArrayListSerializer(StringSerializer.INSTANCE);
   }

   public static final Lazy[] h() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -13154) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 91;
            case 1 -> 186;
            case 2 -> 100;
            case 3 -> 189;
            case 4 -> 183;
            case 5 -> 43;
            case 6 -> 3;
            case 7 -> 9;
            case 8 -> 232;
            case 9 -> 155;
            case 10 -> 30;
            case 11 -> 246;
            case 12 -> 127;
            case 13 -> 71;
            case 14 -> 147;
            case 15 -> 65;
            case 16 -> 45;
            case 17 -> 224;
            case 18 -> 19;
            case 19 -> 253;
            case 20 -> 206;
            case 21 -> 53;
            case 22 -> 139;
            case 23 -> 86;
            case 24 -> 25;
            case 25 -> 146;
            case 26 -> 85;
            case 27 -> 191;
            case 28 -> 27;
            case 29 -> 62;
            case 30 -> 18;
            case 31 -> 141;
            case 32 -> 22;
            case 33 -> 236;
            case 34 -> 79;
            case 35 -> 124;
            case 36 -> 74;
            case 37 -> 179;
            case 38 -> 73;
            case 39 -> 39;
            case 40 -> 237;
            case 41 -> 163;
            case 42 -> 67;
            case 43 -> 5;
            case 44 -> 190;
            case 45 -> 115;
            case 46 -> 233;
            case 47 -> 158;
            case 48 -> 208;
            case 49 -> 26;
            case 50 -> 199;
            case 51 -> 132;
            case 52 -> 61;
            case 53 -> 184;
            case 54 -> 176;
            case 55 -> 1;
            case 56 -> 251;
            case 57 -> 4;
            case 58 -> 192;
            case 59 -> 157;
            case 60 -> 6;
            case 61 -> 242;
            case 62 -> 151;
            case 63 -> 195;
            case 64 -> 113;
            case 65 -> 118;
            case 66 -> 245;
            case 67 -> 46;
            case 68 -> 56;
            case 69 -> 38;
            case 70 -> 13;
            case 71 -> 164;
            case 72 -> 12;
            case 73 -> 108;
            case 74 -> 24;
            case 75 -> 75;
            case 76 -> 200;
            case 77 -> 197;
            case 78 -> 204;
            case 79 -> 142;
            case 80 -> 116;
            case 81 -> 252;
            case 82 -> 209;
            case 83 -> 64;
            case 84 -> 136;
            case 85 -> 68;
            case 86 -> 125;
            case 87 -> 229;
            case 88 -> 149;
            case 89 -> 72;
            case 90 -> 174;
            case 91 -> 128;
            case 92 -> 130;
            case 93 -> 87;
            case 94 -> 106;
            case 95 -> 135;
            case 96 -> 0;
            case 97 -> 202;
            case 98 -> 143;
            case 99 -> 47;
            case 100 -> 219;
            case 101 -> 196;
            case 102 -> 178;
            case 103 -> 29;
            case 104 -> 201;
            case 105 -> 240;
            case 106 -> 211;
            case 107 -> 78;
            case 108 -> 104;
            case 109 -> 59;
            case 110 -> 173;
            case 111 -> 198;
            case 112 -> 215;
            case 113 -> 123;
            case 114 -> 180;
            case 115 -> 51;
            case 116 -> 31;
            case 117 -> 160;
            case 118 -> 103;
            case 119 -> 14;
            case 120 -> 8;
            case 121 -> 223;
            case 122 -> 137;
            case 123 -> 235;
            case 124 -> 48;
            case 125 -> 109;
            case 126 -> 230;
            case 127 -> 10;
            case 128 -> 133;
            case 129 -> 77;
            case 130 -> 66;
            case 131 -> 239;
            case 132 -> 34;
            case 133 -> 217;
            case 134 -> 99;
            case 135 -> 210;
            case 136 -> 216;
            case 137 -> 241;
            case 138 -> 97;
            case 139 -> 55;
            case 140 -> 220;
            case 141 -> 2;
            case 142 -> 58;
            case 143 -> 93;
            case 144 -> 16;
            case 145 -> 88;
            case 146 -> 156;
            case 147 -> 33;
            case 148 -> 203;
            case 149 -> 154;
            case 150 -> 177;
            case 151 -> 159;
            case 152 -> 218;
            case 153 -> 37;
            case 154 -> 182;
            case 155 -> 228;
            case 156 -> 83;
            case 157 -> 11;
            case 158 -> 101;
            case 159 -> 17;
            case 160 -> 148;
            case 161 -> 162;
            case 162 -> 117;
            case 163 -> 221;
            case 164 -> 107;
            case 165 -> 84;
            case 166 -> 44;
            case 167 -> 168;
            case 168 -> 254;
            case 169 -> 15;
            case 170 -> 105;
            case 171 -> 120;
            case 172 -> 167;
            case 173 -> 23;
            case 174 -> 32;
            case 175 -> 52;
            case 176 -> 129;
            case 177 -> 36;
            case 178 -> 35;
            case 179 -> 70;
            case 180 -> 49;
            case 181 -> 250;
            case 182 -> 249;
            case 183 -> 76;
            case 184 -> 243;
            case 185 -> 194;
            case 186 -> 150;
            case 187 -> 92;
            case 188 -> 20;
            case 189 -> 96;
            case 190 -> 145;
            case 191 -> 166;
            case 192 -> 193;
            case 193 -> 248;
            case 194 -> 185;
            case 195 -> 80;
            case 196 -> 98;
            case 197 -> 165;
            case 198 -> 114;
            case 199 -> 63;
            case 200 -> 7;
            case 201 -> 187;
            case 202 -> 138;
            case 203 -> 81;
            case 204 -> 226;
            case 205 -> 121;
            case 206 -> 57;
            case 207 -> 119;
            case 208 -> 60;
            case 209 -> 188;
            case 210 -> 244;
            case 211 -> 42;
            case 212 -> 110;
            case 213 -> 126;
            case 214 -> 82;
            case 215 -> 112;
            case 216 -> 172;
            case 217 -> 21;
            case 218 -> 238;
            case 219 -> 28;
            case 220 -> 231;
            case 221 -> 89;
            case 222 -> 227;
            case 223 -> 153;
            case 224 -> 94;
            case 225 -> 207;
            case 226 -> 169;
            case 227 -> 122;
            case 228 -> 50;
            case 229 -> 234;
            case 230 -> 152;
            case 231 -> 40;
            case 232 -> 161;
            case 233 -> 222;
            case 234 -> 140;
            case 235 -> 181;
            case 236 -> 69;
            case 237 -> 255;
            case 238 -> 54;
            case 239 -> 175;
            case 240 -> 131;
            case 241 -> 90;
            case 242 -> 247;
            case 243 -> 102;
            case 244 -> 134;
            case 245 -> 214;
            case 246 -> 171;
            case 247 -> 212;
            case 248 -> 170;
            case 249 -> 41;
            case 250 -> 95;
            case 251 -> 225;
            case 252 -> 111;
            case 253 -> 144;
            case 254 -> 213;
            default -> 205;
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
      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      // PX-FIX verifier conflict in the jar: the outer field IIIIIIIIIllIlIll... is declared as THIS class
      // (javap descriptor <Outer>$IllllIIlll...), but the outer <clinit> putstatic's a new <Outer>$llII...
      // instance, and <Outer>$llII... is final and only extends Object, so the two types are unrelated and
      // the resulting bytecode violates the verifier. The accessor below therefore needs the unchecked
      // cast to compile; the recovery emits the outer instance as the class its own type it is consistent
      // with (unchanged from the recovered source, which is presumably where the error came from).
      @SuppressWarnings("unchecked")
      public final KSerializer<IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII> a() {
         return (KSerializer)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(DefaultConstructorMarker var1) {
         this();
      }
   }
   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
      implements GeneratedSerializer<IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII> {
      public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public SerialDescriptor a() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void a(@NotNull Encoder var1, @NotNull IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII var2) {
         Intrinsics.checkNotNullParameter(var1, "encoder");
         Intrinsics.checkNotNullParameter(var2, "value");
         SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         CompositeEncoder var4 = var1.beginStructure(var3);
         IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII.a(var2, var4, var3);
         var4.endStructure(var3);
      }

      @NotNull
      public final IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII a(@NotNull Decoder var1) {
         Intrinsics.checkNotNullParameter(var1, "decoder");
         SerialDescriptor var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var3 = 0;
         String var4 = null;
         List<String> var5 = null;
         CompositeDecoder var6 = var1.beginStructure(var2);

         while (true) {
            int var7 = var6.decodeElementIndex(var2);
            switch (var7) {
               case -1:
                  break;
               case 0:
                  var4 = var6.decodeStringElement(var2, 0);
                  var3 |= 1;
                  continue;
               case 1:
                  var5 = (List<String>)var6
                     .decodeSerializableElement(var2, 1, (DeserializationStrategy)new ArrayListSerializer(StringSerializer.INSTANCE), var5);
                  var3 |= 2;
                  continue;
               default:
                  throw new UnknownFieldException(var7);
            }

            break;
         }

         var6.endStructure(var2);
         return new IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII(var3, var4, var5, (SerializationConstructorMarker)null);
      }

      @NotNull
      public SerialDescriptor getDescriptor() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public KSerializer<?>[] childSerializers() {
         Lazy<KSerializer<Object>>[] var0 = IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII.h();
         return new kotlinx.serialization.KSerializer[]{StringSerializer.INSTANCE, (KSerializer)var0[1].getValue()};
      }

      public KSerializer<?>[] typeParametersSerializers() {
         return GeneratedSerializer.super.typeParametersSerializers();
      }

      public void serialize(@NotNull Encoder var1, @NotNull IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII var2) {
         this.a(var1, var2);
      }

      @NotNull
      public IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII deserialize(@NotNull Decoder var1) {
         return this.a(var1);
      }

      static {
         IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
         PluginGeneratedSerialDescriptor var0 = new PluginGeneratedSerialDescriptor(
            "me.octo.client.IIIllllIllIllIlIIIIlIlIlIIllIIIIllIllIlIIIllIlIllIlIIIllllIIlllllIllllIIlllIIIllIlIII",
            (GeneratedSerializer)IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
            2
         );
         var0.addElement("displayId", false);
         var0.addElement("items", false);
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (SerialDescriptor)var0;
      }
      // ===== PX-FIX begin: convention (b) nested-inline recovery (agent B2) =====
      private static UnknownFieldException a(UnknownFieldException var0) {
         return var0;
      }

      private static String a(int var0, int var1) { char var10002 = '\0'; // PX-FIX hoist
        
         int var2 = (var0 ^ 29756) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 10;
               case 1 -> 166;
               case 2 -> 209;
               case 3 -> 205;
               case 4 -> 61;
               case 5 -> 140;
               case 6 -> 149;
               case 7 -> 40;
               case 8 -> 120;
               case 9 -> 98;
               case 10 -> 152;
               case 11 -> 238;
               case 12 -> 109;
               case 13 -> 102;
               case 14 -> 31;
               case 15 -> 107;
               case 16 -> 96;
               case 17 -> 193;
               case 18 -> 113;
               case 19 -> 15;
               case 20 -> 93;
               case 21 -> 17;
               case 22 -> 41;
               case 23 -> 118;
               case 24 -> 137;
               case 25 -> 231;
               case 26 -> 74;
               case 27 -> 210;
               case 28 -> 167;
               case 29 -> 110;
               case 30 -> 100;
               case 31 -> 200;
               case 32 -> 30;
               case 33 -> 247;
               case 34 -> 85;
               case 35 -> 7;
               case 36 -> 163;
               case 37 -> 229;
               case 38 -> 248;
               case 39 -> 175;
               case 40 -> 158;
               case 41 -> 88;
               case 42 -> 216;
               case 43 -> 38;
               case 44 -> 223;
               case 45 -> 192;
               case 46 -> 179;
               case 47 -> 116;
               case 48 -> 34;
               case 49 -> 176;
               case 50 -> 174;
               case 51 -> 191;
               case 52 -> 243;
               case 53 -> 197;
               case 54 -> 146;
               case 55 -> 153;
               case 56 -> 52;
               case 57 -> 70;
               case 58 -> 49;
               case 59 -> 29;
               case 60 -> 77;
               case 61 -> 226;
               case 62 -> 5;
               case 63 -> 144;
               case 64 -> 95;
               case 65 -> 142;
               case 66 -> 194;
               case 67 -> 56;
               case 68 -> 45;
               case 69 -> 230;
               case 70 -> 132;
               case 71 -> 234;
               case 72 -> 92;
               case 73 -> 218;
               case 74 -> 50;
               case 75 -> 222;
               case 76 -> 172;
               case 77 -> 131;
               case 78 -> 182;
               case 79 -> 143;
               case 80 -> 173;
               case 81 -> 195;
               case 82 -> 133;
               case 83 -> 14;
               case 84 -> 139;
               case 85 -> 19;
               case 86 -> 207;
               case 87 -> 32;
               case 88 -> 219;
               case 89 -> 217;
               case 90 -> 106;
               case 91 -> 160;
               case 92 -> 148;
               case 93 -> 87;
               case 94 -> 12;
               case 95 -> 90;
               case 96 -> 78;
               case 97 -> 121;
               case 98 -> 250;
               case 99 -> 33;
               case 100 -> 204;
               case 101 -> 44;
               case 102 -> 251;
               case 103 -> 198;
               case 104 -> 185;
               case 105 -> 54;
               case 106 -> 36;
               case 107 -> 165;
               case 108 -> 141;
               case 109 -> 164;
               case 110 -> 135;
               case 111 -> 80;
               case 112 -> 147;
               case 113 -> 245;
               case 114 -> 119;
               case 115 -> 150;
               case 116 -> 239;
               case 117 -> 83;
               case 118 -> 214;
               case 119 -> 161;
               case 120 -> 6;
               case 121 -> 123;
               case 122 -> 201;
               case 123 -> 108;
               case 124 -> 221;
               case 125 -> 136;
               case 126 -> 215;
               case 127 -> 16;
               case 128 -> 18;
               case 129 -> 159;
               case 130 -> 220;
               case 131 -> 94;
               case 132 -> 129;
               case 133 -> 208;
               case 134 -> 37;
               case 135 -> 103;
               case 136 -> 22;
               case 137 -> 86;
               case 138 -> 128;
               case 139 -> 177;
               case 140 -> 68;
               case 141 -> 64;
               case 142 -> 134;
               case 143 -> 69;
               case 144 -> 75;
               case 145 -> 24;
               case 146 -> 66;
               case 147 -> 242;
               case 148 -> 202;
               case 149 -> 155;
               case 150 -> 190;
               case 151 -> 227;
               case 152 -> 138;
               case 153 -> 111;
               case 154 -> 253;
               case 155 -> 184;
               case 156 -> 211;
               case 157 -> 51;
               case 158 -> 206;
               case 159 -> 26;
               case 160 -> 35;
               case 161 -> 157;
               case 162 -> 47;
               case 163 -> 43;
               case 164 -> 117;
               case 165 -> 228;
               case 166 -> 58;
               case 167 -> 46;
               case 168 -> 151;
               case 169 -> 122;
               case 170 -> 196;
               case 171 -> 2;
               case 172 -> 249;
               case 173 -> 255;
               case 174 -> 162;
               case 175 -> 20;
               case 176 -> 59;
               case 177 -> 105;
               case 178 -> 127;
               case 179 -> 101;
               case 180 -> 65;
               case 181 -> 97;
               case 182 -> 104;
               case 183 -> 171;
               case 184 -> 154;
               case 185 -> 13;
               case 186 -> 55;
               case 187 -> 115;
               case 188 -> 57;
               case 189 -> 82;
               case 190 -> 246;
               case 191 -> 71;
               case 192 -> 124;
               case 193 -> 203;
               case 194 -> 4;
               case 195 -> 145;
               case 196 -> 25;
               case 197 -> 199;
               case 198 -> 0;
               case 199 -> 28;
               case 200 -> 3;
               case 201 -> 237;
               case 202 -> 62;
               case 203 -> 23;
               case 204 -> 53;
               case 205 -> 21;
               case 206 -> 180;
               case 207 -> 170;
               case 208 -> 188;
               case 209 -> 42;
               case 210 -> 27;
               case 211 -> 130;
               case 212 -> 183;
               case 213 -> 11;
               case 214 -> 72;
               case 215 -> 186;
               case 216 -> 189;
               case 217 -> 84;
               case 218 -> 73;
               case 219 -> 236;
               case 220 -> 8;
               case 221 -> 232;
               case 222 -> 81;
               case 223 -> 79;
               case 224 -> 60;
               case 225 -> 114;
               case 226 -> 39;
               case 227 -> 112;
               case 228 -> 254;
               case 229 -> 156;
               case 230 -> 67;
               case 231 -> 187;
               case 232 -> 91;
               case 233 -> 63;
               case 234 -> 1;
               case 235 -> 233;
               case 236 -> 76;
               case 237 -> 224;
               case 238 -> 213;
               case 239 -> 181;
               case 240 -> 48;
               case 241 -> 178;
               case 242 -> 241;
               case 243 -> 125;
               case 244 -> 235;
               case 245 -> 252;
               case 246 -> 212;
               case 247 -> 240;
               case 248 -> 126;
               case 249 -> 99;
               case 250 -> 89;
               case 251 -> 225;
               case 252 -> 9;
               case 253 -> 169;
               case 254 -> 244;
               default -> 168;
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
                var10002 = var3[var7];
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
      // ===== PX-FIX end: convention (b) nested-inline recovery (agent B2) =====
   }
}
