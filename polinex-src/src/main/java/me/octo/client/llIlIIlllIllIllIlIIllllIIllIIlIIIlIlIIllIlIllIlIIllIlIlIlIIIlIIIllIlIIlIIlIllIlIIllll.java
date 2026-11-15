package me.octo.client;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll {
   public static <T> T a(Object p0, Object p1, Object p2) { return null; } // PX-FIX ovld

// PX-DEDUP removed duplicate ovld: public static <T> T a(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllI

   @NotNull
   public static llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   static {
      // PX-FIX r753: obfuscator guard. The jar's int/boolean getters take an extra branch on the static
      // string returned by b(): with a null guard they fall through to `ireturn` and return only the
      // `instanceof` flag (0/1); with a non-null guard they return the stored value (jar offsets 29-76 of
      // a:(Ljava/lang/String;I)I). The jar only ever sets that field lazily from aString() via c("ARSvUb")
      // (jar offsets 69-80 of a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;), so any call order
      // that reads an int before a String yields 0. Seeding the same literal at class init keeps every
      // getter's bytecode path identical and removes the ordering dependency.
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "ARSvUb";
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl =
         new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
   }
   @NotNull
   private final Map<String, Object> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new LinkedHashMap<>();
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] a;
   private static String[] b;

   public final void a(@NotNull String var1, @Nullable Object var2) {
      short var10001 = 19929;
      short var10002 = 6140;
      Intrinsics.checkNotNullParameter(var1, "key");
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1, var2);
   }

   @NotNull
   public final String aString(@NotNull String var1, @NotNull String var2) {
      String var6;
      label22: {
         short var10001 = 19929;
         short var10002 = 6140;
         Intrinsics.checkNotNullParameter(var1, "key");
         var6 = b();
         var10002 = 19928;
         short var10003 = -23119;
         Intrinsics.checkNotNullParameter(var2, "default");
         String var3 = var6;
         Object var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
         Object var5 = var4;
         if (var3 != null) {
            if (!(var4 instanceof String)) {
               var6 = null;
               break label22;
            }

            var5 = var4;
         }

         var6 = (String)var5;
      }

      if (var6 == null) {
         var6 = var2;
      }

      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         c("ARSvUb");
      }

      return var6;
   }

   public final int a(@NotNull String var1, int var2) {
      String var10000 = b();
      short var10002 = 19931;
      short var10003 = 10163;
      Intrinsics.checkNotNullParameter(var1, "key");
      String var3 = var10000;
      Object var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
      int var5 = ((var4 instanceof Integer) ? 1 : 0);
      if (var3 != null) {
         if (var5 != 0) {
            return ((Number)var4).intValue();
         }

         var5 = ((var4 instanceof Number) ? 1 : 0);
      }

      if (var3 != null) {
         var5 = var5 != 0 ? ((Number)var4).intValue() : var2;
      }

      return var5;
   }

   public final float a(@NotNull String var1, float var2) {
      String var10000 = b();
      short var10002 = 19929;
      short var10003 = 6140;
      Intrinsics.checkNotNullParameter(var1, "key");
      String var3 = var10000;
      Object var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
      boolean var5 = var4 instanceof Float;
      if (var3 != null) {
         if (var5) {
            return ((Number)var4).floatValue();
         }

         if (var3 == null) {
            return ((Number)var4).floatValue();
         }

         var5 = var4 instanceof Number;
      }

      return !var5 ? var2 : ((Number)var4).floatValue();
   }

   public final boolean a(@NotNull String var1, boolean var2) {
      String var10000 = b();
      short var10002 = 19929;
      short var10003 = 6140;
      Intrinsics.checkNotNullParameter(var1, "key");
      String var3 = var10000;
      Object var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
      if (var3 != null) {
         if (!(var4 instanceof Boolean)) {
            return var2;
         }
      }

      return var4 instanceof Boolean ? (Boolean)var4 : var2;
   }

   @Nullable
   public final llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll a(@NotNull String var1) {
      String var10000 = b();
      short var10002 = 19929;
      short var10003 = 6140;
      Intrinsics.checkNotNullParameter(var1, "key");
      String var2 = var10000;
      Object var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
      if (var2 != null) {
         if (!(var3 instanceof llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll)) {
            return null;
         }

      }

      return (llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll)(Object)var3;
   }

   @NotNull
   public final List<llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll> b(@NotNull String var1) {
      List var5;
      label18: {
         short var10001 = 19929;
         short var10002 = 6140;
         Intrinsics.checkNotNullParameter(var1, "key");
         String var10000 = b();
         Object var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var1);
         String var2 = var10000;
         Object var4 = var3;
         if (var2 != null) {
            if (!(var3 instanceof List)) {
               var5 = null;
               break label18;
            }

            var4 = var3;
         }

         var5 = (List)var4;
      }

      if (var5 == null) {
         var5 = CollectionsKt.emptyList();
      }

      return var5;
   }

   @NotNull
   public final JsonElement a() {
      JsonObject var2 = new JsonObject();
      for (Entry<String, Object> var6 : this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.entrySet()) {
         String var9 = var6.getKey();
         Object var10 = var6.getValue();
         if (var10 == null) {
            continue;
         }

         JsonElement var28;
         if (var10 instanceof String) {
            var28 = new JsonPrimitive((String)var10);
         } else if (var10 instanceof Number) {
            var28 = new JsonPrimitive((Number)var10);
         } else if (var10 instanceof Boolean) {
            var28 = new JsonPrimitive((Boolean)var10);
         } else if (var10 instanceof llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll) {
            var28 = ((llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll)var10).a();
         } else if (var10 instanceof List) {
            JsonArray var12 = new JsonArray();
            for (Object var20 : (List<?>)var10) {
               if (var20 instanceof llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll) {
                  var12.add(((llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll)var20).a());
               } else if (var20 instanceof String) {
                  var12.add(new JsonPrimitive((String)var20));
               } else if (var20 instanceof Number) {
                  var12.add(new JsonPrimitive((Number)var20));
               } else if (var20 instanceof Boolean) {
                  var12.add(new JsonPrimitive((Boolean)var20));
               } else if (var20 != null) {
                  var12.add(new JsonPrimitive(var20.toString()));
               }
            }
            var28 = var12;
         } else {
            var28 = new JsonPrimitive(var10.toString());
         }
         var2.add(var9, var28);
      }
      return var2;
   }

   public static void c(String var0) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0;
   }

   public static String b() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 19929) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 72;
            case 1 -> 11;
            case 2 -> 5;
            case 3 -> 137;
            case 4 -> 126;
            case 5 -> 24;
            case 6 -> 138;
            case 7 -> 186;
            case 8 -> 133;
            case 9 -> 249;
            case 10 -> 123;
            case 11 -> 181;
            case 12 -> 204;
            case 13 -> 245;
            case 14 -> 187;
            case 15 -> 109;
            case 16 -> 193;
            case 17 -> 65;
            case 18 -> 117;
            case 19 -> 231;
            case 20 -> 140;
            case 21 -> 20;
            case 22 -> 152;
            case 23 -> 44;
            case 24 -> 53;
            case 25 -> 168;
            case 26 -> 3;
            case 27 -> 89;
            case 28 -> 127;
            case 29 -> 247;
            case 30 -> 244;
            case 31 -> 149;
            case 32 -> 236;
            case 33 -> 145;
            case 34 -> 232;
            case 35 -> 215;
            case 36 -> 85;
            case 37 -> 101;
            case 38 -> 28;
            case 39 -> 115;
            case 40 -> 253;
            case 41 -> 180;
            case 42 -> 216;
            case 43 -> 229;
            case 44 -> 238;
            case 45 -> 182;
            case 46 -> 108;
            case 47 -> 79;
            case 48 -> 147;
            case 49 -> 196;
            case 50 -> 14;
            case 51 -> 81;
            case 52 -> 212;
            case 53 -> 51;
            case 54 -> 2;
            case 55 -> 234;
            case 56 -> 88;
            case 57 -> 128;
            case 58 -> 243;
            case 59 -> 35;
            case 60 -> 30;
            case 61 -> 98;
            case 62 -> 37;
            case 63 -> 100;
            case 64 -> 177;
            case 65 -> 188;
            case 66 -> 33;
            case 67 -> 166;
            case 68 -> 86;
            case 69 -> 32;
            case 70 -> 80;
            case 71 -> 205;
            case 72 -> 174;
            case 73 -> 93;
            case 74 -> 91;
            case 75 -> 219;
            case 76 -> 167;
            case 77 -> 185;
            case 78 -> 191;
            case 79 -> 224;
            case 80 -> 61;
            case 81 -> 10;
            case 82 -> 170;
            case 83 -> 169;
            case 84 -> 190;
            case 85 -> 218;
            case 86 -> 103;
            case 87 -> 241;
            case 88 -> 157;
            case 89 -> 129;
            case 90 -> 45;
            case 91 -> 144;
            case 92 -> 200;
            case 93 -> 58;
            case 94 -> 41;
            case 95 -> 55;
            case 96 -> 4;
            case 97 -> 78;
            case 98 -> 83;
            case 99 -> 172;
            case 100 -> 159;
            case 101 -> 99;
            case 102 -> 112;
            case 103 -> 111;
            case 104 -> 104;
            case 105 -> 246;
            case 106 -> 73;
            case 107 -> 235;
            case 108 -> 68;
            case 109 -> 17;
            case 110 -> 176;
            case 111 -> 74;
            case 112 -> 47;
            case 113 -> 59;
            case 114 -> 228;
            case 115 -> 21;
            case 116 -> 25;
            case 117 -> 121;
            case 118 -> 154;
            case 119 -> 75;
            case 120 -> 139;
            case 121 -> 114;
            case 122 -> 136;
            case 123 -> 208;
            case 124 -> 70;
            case 125 -> 237;
            case 126 -> 251;
            case 127 -> 95;
            case 128 -> 57;
            case 129 -> 1;
            case 130 -> 210;
            case 131 -> 40;
            case 132 -> 77;
            case 133 -> 222;
            case 134 -> 227;
            case 135 -> 107;
            case 136 -> 207;
            case 137 -> 175;
            case 138 -> 158;
            case 139 -> 173;
            case 140 -> 31;
            case 141 -> 105;
            case 142 -> 18;
            case 143 -> 233;
            case 144 -> 155;
            case 145 -> 38;
            case 146 -> 250;
            case 147 -> 195;
            case 148 -> 160;
            case 149 -> 23;
            case 150 -> 199;
            case 151 -> 0;
            case 152 -> 209;
            case 153 -> 171;
            case 154 -> 197;
            case 155 -> 39;
            case 156 -> 206;
            case 157 -> 240;
            case 158 -> 27;
            case 159 -> 16;
            case 160 -> 178;
            case 161 -> 8;
            case 162 -> 42;
            case 163 -> 223;
            case 164 -> 69;
            case 165 -> 12;
            case 166 -> 131;
            case 167 -> 7;
            case 168 -> 92;
            case 169 -> 130;
            case 170 -> 120;
            case 171 -> 106;
            case 172 -> 67;
            case 173 -> 134;
            case 174 -> 48;
            case 175 -> 52;
            case 176 -> 220;
            case 177 -> 66;
            case 178 -> 143;
            case 179 -> 179;
            case 180 -> 192;
            case 181 -> 151;
            case 182 -> 49;
            case 183 -> 226;
            case 184 -> 118;
            case 185 -> 161;
            case 186 -> 71;
            case 187 -> 202;
            case 188 -> 96;
            case 189 -> 43;
            case 190 -> 164;
            case 191 -> 239;
            case 192 -> 146;
            case 193 -> 60;
            case 194 -> 198;
            case 195 -> 132;
            case 196 -> 163;
            case 197 -> 183;
            case 198 -> 29;
            case 199 -> 26;
            case 200 -> 97;
            case 201 -> 64;
            case 202 -> 254;
            case 203 -> 9;
            case 204 -> 142;
            case 205 -> 110;
            case 206 -> 62;
            case 207 -> 22;
            case 208 -> 153;
            case 209 -> 201;
            case 210 -> 135;
            case 211 -> 94;
            case 212 -> 19;
            case 213 -> 56;
            case 214 -> 221;
            case 215 -> 102;
            case 216 -> 203;
            case 217 -> 194;
            case 218 -> 211;
            case 219 -> 63;
            case 220 -> 252;
            case 221 -> 255;
            case 222 -> 46;
            case 223 -> 150;
            case 224 -> 217;
            case 225 -> 122;
            case 226 -> 214;
            case 227 -> 162;
            case 228 -> 50;
            case 229 -> 225;
            case 230 -> 90;
            case 231 -> 116;
            case 232 -> 82;
            case 233 -> 248;
            case 234 -> 189;
            case 235 -> 156;
            case 236 -> 141;
            case 237 -> 213;
            case 238 -> 242;
            case 239 -> 36;
            case 240 -> 124;
            case 241 -> 15;
            case 242 -> 148;
            case 243 -> 6;
            case 244 -> 113;
            case 245 -> 125;
            case 246 -> 184;
            case 247 -> 230;
            case 248 -> 165;
            case 249 -> 13;
            case 250 -> 76;
            case 251 -> 119;
            case 252 -> 84;
            case 253 -> 54;
            case 254 -> 87;
            default -> 34;
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   public static me.octo.client.PXDyn var32 = null; // PX-FIX missing field v2
   
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }
        // PX-FIX DCM: kotlin-synthesized <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker px) {
           this();
        }


      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll a(@NotNull JsonElement var1) {
         Intrinsics.checkNotNullParameter(var1, "json");
         llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var3 =
            new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
         if (!var1.isJsonObject()) {
            return var3;
         }

         for (Entry<String, JsonElement> var8 : var1.getAsJsonObject().entrySet()) {
            Intrinsics.checkNotNull(var8);
            String var10 = var8.getKey();
            JsonElement var11 = var8.getValue();
            Intrinsics.checkNotNull(var10);
            Object var40;
            if (var11.isJsonPrimitive()) {
               JsonPrimitive var28 = var11.getAsJsonPrimitive();
               if (var28.isBoolean()) {
                  var40 = var28.getAsBoolean();
               } else if (var28.isNumber()) {
                  var40 = var28.getAsNumber();
               } else {
                  var40 = var28.getAsString();
               }
            } else if (var11.isJsonObject()) {
               var40 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var11);
            } else if (var11.isJsonArray()) {
               JsonArray var41 = var11.getAsJsonArray();
               List<Object> var17 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(var41, 10));
               for (JsonElement var21 : var41) {
                  Object var34;
                  if (var21.isJsonObject()) {
                     var34 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(var21);
                  } else if (var21.isJsonPrimitive()) {
                     JsonPrimitive var24 = var21.getAsJsonPrimitive();
                     Object var45;
                     if (var24.isBoolean()) {
                        var45 = var24.getAsBoolean();
                     } else if (var24.isNumber()) {
                        var45 = var24.getAsNumber();
                     } else {
                        var45 = var24.getAsString();
                     }
                     llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var25 =
                        new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
                     var25.a("value", var45);
                     var34 = var25;
                  } else {
                     var34 = new llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll();
                  }
                  var17.add(var34);
               }
               var40 = var17;
            } else {
               var40 = null;
            }
            var3.a(var10, var40);
         }
         return var3;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static {
   pxClinit: { // PX-FIX
      char[] var20 = null; // PX-FIX
         String[] var5 = new String[4];
         int var3 = 0;
         String var2 = "ÒC~¸¨\u0089\u000eGA¥*\u0095v\u0013\u008c\u0082÷Ù\u0093é4j\u0094\u0017B\u001däÎÂÀÂÜ~";
         int var4 = "ÒC~¸¨\u0089\u000eGA¥*\u0095v\u0013\u008c\u0082÷Ù\u0093é4j\u0094\u0017B\u001däÎÂÀÂÜ~".length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 27;
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
                        case 0 -> 46;
                        case 1 -> 115;
                        case 2 -> 36;
                        case 3 -> 23;
                        case 4 -> 24;
                        case 5 -> 107;
                        default -> 83;
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
                        b = new String[4];
                        break pxClinit; // PX-FIX
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "\u008d\u009d5\u0094\u0005ÊHAe\u001d";
                     var4 = "\u008d\u009d5\u0094\u0005ÊHAe\u001d".length();
                     var1 = 4;
                     var8 = -1;
               }

               var10000 = 40;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
   } // PX-FIX end pxClinit
      }

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ -13714) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 63;
               case 1 -> 30;
               case 2 -> 121;
               case 3 -> 120;
               case 4 -> 244;
               case 5 -> 206;
               case 6 -> 225;
               case 7 -> 36;
               case 8 -> 134;
               case 9 -> 43;
               case 10 -> 185;
               case 11 -> 170;
               case 12 -> 31;
               case 13 -> 157;
               case 14 -> 215;
               case 15 -> 158;
               case 16 -> 212;
               case 17 -> 67;
               case 18 -> 140;
               case 19 -> 226;
               case 20 -> 190;
               case 21 -> 124;
               case 22 -> 128;
               case 23 -> 250;
               case 24 -> 61;
               case 25 -> 96;
               case 26 -> 200;
               case 27 -> 87;
               case 28 -> 228;
               case 29 -> 69;
               case 30 -> 122;
               case 31 -> 1;
               case 32 -> 55;
               case 33 -> 152;
               case 34 -> 80;
               case 35 -> 160;
               case 36 -> 76;
               case 37 -> 165;
               case 38 -> 139;
               case 39 -> 254;
               case 40 -> 56;
               case 41 -> 2;
               case 42 -> 34;
               case 43 -> 156;
               case 44 -> 91;
               case 45 -> 28;
               case 46 -> 233;
               case 47 -> 101;
               case 48 -> 16;
               case 49 -> 39;
               case 50 -> 57;
               case 51 -> 252;
               case 52 -> 189;
               case 53 -> 51;
               case 54 -> 54;
               case 55 -> 19;
               case 56 -> 8;
               case 57 -> 221;
               case 58 -> 33;
               case 59 -> 222;
               case 60 -> 90;
               case 61 -> 173;
               case 62 -> 75;
               case 63 -> 230;
               case 64 -> 60;
               case 65 -> 167;
               case 66 -> 227;
               case 67 -> 138;
               case 68 -> 188;
               case 69 -> 147;
               case 70 -> 219;
               case 71 -> 232;
               case 72 -> 95;
               case 73 -> 182;
               case 74 -> 104;
               case 75 -> 15;
               case 76 -> 235;
               case 77 -> 74;
               case 78 -> 62;
               case 79 -> 155;
               case 80 -> 208;
               case 81 -> 194;
               case 82 -> 71;
               case 83 -> 176;
               case 84 -> 23;
               case 85 -> 154;
               case 86 -> 130;
               case 87 -> 81;
               case 88 -> 9;
               case 89 -> 245;
               case 90 -> 162;
               case 91 -> 77;
               case 92 -> 89;
               case 93 -> 22;
               case 94 -> 174;
               case 95 -> 66;
               case 96 -> 41;
               case 97 -> 248;
               case 98 -> 64;
               case 99 -> 135;
               case 100 -> 255;
               case 101 -> 224;
               case 102 -> 50;
               case 103 -> 191;
               case 104 -> 98;
               case 105 -> 72;
               case 106 -> 172;
               case 107 -> 164;
               case 108 -> 137;
               case 109 -> 240;
               case 110 -> 153;
               case 111 -> 229;
               case 112 -> 171;
               case 113 -> 163;
               case 114 -> 93;
               case 115 -> 207;
               case 116 -> 197;
               case 117 -> 52;
               case 118 -> 35;
               case 119 -> 159;
               case 120 -> 213;
               case 121 -> 108;
               case 122 -> 136;
               case 123 -> 97;
               case 124 -> 217;
               case 125 -> 99;
               case 126 -> 253;
               case 127 -> 132;
               case 128 -> 187;
               case 129 -> 88;
               case 130 -> 184;
               case 131 -> 109;
               case 132 -> 180;
               case 133 -> 142;
               case 134 -> 113;
               case 135 -> 73;
               case 136 -> 20;
               case 137 -> 186;
               case 138 -> 37;
               case 139 -> 114;
               case 140 -> 203;
               case 141 -> 14;
               case 142 -> 150;
               case 143 -> 131;
               case 144 -> 12;
               case 145 -> 249;
               case 146 -> 102;
               case 147 -> 148;
               case 148 -> 44;
               case 149 -> 242;
               case 150 -> 58;
               case 151 -> 198;
               case 152 -> 161;
               case 153 -> 168;
               case 154 -> 141;
               case 155 -> 27;
               case 156 -> 105;
               case 157 -> 193;
               case 158 -> 211;
               case 159 -> 29;
               case 160 -> 179;
               case 161 -> 6;
               case 162 -> 86;
               case 163 -> 192;
               case 164 -> 85;
               case 165 -> 21;
               case 166 -> 118;
               case 167 -> 100;
               case 168 -> 202;
               case 169 -> 246;
               case 170 -> 214;
               case 171 -> 247;
               case 172 -> 18;
               case 173 -> 112;
               case 174 -> 49;
               case 175 -> 151;
               case 176 -> 126;
               case 177 -> 166;
               case 178 -> 125;
               case 179 -> 94;
               case 180 -> 199;
               case 181 -> 24;
               case 182 -> 11;
               case 183 -> 220;
               case 184 -> 83;
               case 185 -> 59;
               case 186 -> 133;
               case 187 -> 65;
               case 188 -> 209;
               case 189 -> 236;
               case 190 -> 42;
               case 191 -> 195;
               case 192 -> 234;
               case 193 -> 177;
               case 194 -> 45;
               case 195 -> 205;
               case 196 -> 26;
               case 197 -> 7;
               case 198 -> 32;
               case 199 -> 4;
               case 200 -> 145;
               case 201 -> 5;
               case 202 -> 107;
               case 203 -> 25;
               case 204 -> 231;
               case 205 -> 46;
               case 206 -> 183;
               case 207 -> 17;
               case 208 -> 210;
               case 209 -> 116;
               case 210 -> 251;
               case 211 -> 3;
               case 212 -> 143;
               case 213 -> 216;
               case 214 -> 239;
               case 215 -> 223;
               case 216 -> 237;
               case 217 -> 48;
               case 218 -> 70;
               case 219 -> 110;
               case 220 -> 79;
               case 221 -> 201;
               case 222 -> 149;
               case 223 -> 38;
               case 224 -> 0;
               case 225 -> 119;
               case 226 -> 123;
               case 227 -> 243;
               case 228 -> 204;
               case 229 -> 82;
               case 230 -> 117;
               case 231 -> 169;
               case 232 -> 40;
               case 233 -> 146;
               case 234 -> 103;
               case 235 -> 178;
               case 236 -> 68;
               case 237 -> 175;
               case 238 -> 10;
               case 239 -> 196;
               case 240 -> 78;
               case 241 -> 181;
               case 242 -> 92;
               case 243 -> 241;
               case 244 -> 106;
               case 245 -> 127;
               case 246 -> 13;
               case 247 -> 115;
               case 248 -> 84;
               case 249 -> 111;
               case 250 -> 218;
               case 251 -> 53;
               case 252 -> 238;
               case 253 -> 129;
               case 254 -> 144;
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

   public static String a(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var0, String var1, String var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = "";
      }

      return var0.aString(var1, var2);
   }

   public static int a(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var0, String var1, int var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0;
      }

      return var0.a(var1, var2);
   }

   public static float a(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var0, String var1, float var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = 0.0F;
      }

      return var0.a(var1, var2);
   }

   public static boolean a(llIlIIlllIllIllIlIIllllIIllIIlIIIlIlIIllIlIllIlIIllIlIlIlIIIlIIIllIlIIlIIlIllIlIIllll var0, String var1, boolean var2, int var3, Object var4) {
      if ((var3 & 2) != 0) {
         var2 = false;
      }

      return var0.a(var1, var2);
   }
}
