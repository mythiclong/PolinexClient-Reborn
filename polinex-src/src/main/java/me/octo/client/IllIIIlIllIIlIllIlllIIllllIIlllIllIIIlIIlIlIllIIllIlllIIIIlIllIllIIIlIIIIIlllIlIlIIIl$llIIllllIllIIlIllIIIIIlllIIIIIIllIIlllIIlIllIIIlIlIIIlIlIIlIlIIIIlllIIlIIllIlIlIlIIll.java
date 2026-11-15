// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");

       kotlinx.serialization.descriptors.SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var4 = p0.beginStructure(var3);

       me.octo.client.IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.a(p1, var4, var3);

       var4.endStructure(var3);
    }
    public IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       String var4 = null;
       String var5 = null;
       int var6 = 0;
       String var7 = null;
       java.util.Set var8 = null;
       Double var9 = null;
       Double var10 = null;
       kotlinx.serialization.encoding.CompositeDecoder var11 = p0.beginStructure(var1);
       kotlin.Lazy[] var12 = IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.w();
       if (var11.decodeSequentially()) {
          var4 = var11.decodeStringElement(var1, 0);
          var3 |= 1;
          var5 = var11.decodeStringElement(var1, 1);
          var3 |= 2;
          var6 = var11.decodeIntElement(var1, 2);
          var3 |= 4;
          var7 = var11.decodeStringElement(var1, 3);
          var3 |= 8;
          var8 = (java.util.Set)var11.decodeSerializableElement(
             var1, 4, (kotlinx.serialization.DeserializationStrategy)var12[4].getValue(), var8);
          var3 |= 16;
          var9 = (Double)var11.decodeNullableSerializableElement(var1, 5, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var9);
          var3 |= 32;
          var10 = (Double)var11.decodeNullableSerializableElement(var1, 6, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var10);
          var3 |= 64;
       } else {
          while (var2 != 0) {
             int var13 = var11.decodeElementIndex(var1);
             if (var13 == -1) {
                var2 = 0;
             } else if (var13 == 0) {
                var4 = var11.decodeStringElement(var1, 0);
                var3 |= 1;
             } else if (var13 == 1) {
                var5 = var11.decodeStringElement(var1, 1);
                var3 |= 2;
             } else if (var13 == 2) {
                var6 = var11.decodeIntElement(var1, 2);
                var3 |= 4;
             } else if (var13 == 3) {
                var7 = var11.decodeStringElement(var1, 3);
                var3 |= 8;
             } else if (var13 == 4) {
                var8 = (java.util.Set)var11.decodeSerializableElement(
                   var1, 4, (kotlinx.serialization.DeserializationStrategy)var12[4].getValue(), var8);
                var3 |= 16;
             } else if (var13 == 5) {
                var9 = (Double)var11.decodeNullableSerializableElement(var1, 5, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var9);
                var3 |= 32;
             } else if (var13 == 6) {
                var10 = (Double)var11.decodeNullableSerializableElement(var1, 6, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var10);
                var3 |= 64;
             } else {
                throw new kotlinx.serialization.UnknownFieldException(var13);
             }
          }
       }
       var11.endStructure(var1);
       return new IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl(var3, var4, var5, var6, var7, var8, var9, var10, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
       kotlin.Lazy<?>[] var1 = IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl.w();
       kotlinx.serialization.KSerializer<?>[] var2 = new kotlinx.serialization.KSerializer<?>[7];
       var2[0] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var2[1] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var2[2] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var2[3] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var2[4] = (kotlinx.serialization.KSerializer<?>) var1[4].getValue();
       var2[5] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
       var2[6] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
       return var2;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0x2EB2) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 192;
                case 1 -> 19;
                case 2 -> 110;
                case 3 -> 243;
                case 4 -> 245;
                case 5 -> 6;
                case 6 -> 152;
                case 7 -> 72;
                case 8 -> 138;
                case 9 -> 191;
                case 10 -> 219;
                case 11 -> 56;
                case 12 -> 31;
                case 13 -> 233;
                case 14 -> 175;
                case 15 -> 28;
                case 16 -> 127;
                case 17 -> 165;
                case 18 -> 198;
                case 19 -> 53;
                case 20 -> 103;
                case 21 -> 186;
                case 22 -> 27;
                case 23 -> 247;
                case 24 -> 172;
                case 25 -> 75;
                case 26 -> 64;
                case 27 -> 204;
                case 28 -> 141;
                case 29 -> 55;
                case 30 -> 116;
                case 31 -> 87;
                case 32 -> 224;
                case 33 -> 197;
                case 34 -> 115;
                case 35 -> 24;
                case 36 -> 44;
                case 37 -> 150;
                case 38 -> 18;
                case 39 -> 98;
                case 40 -> 242;
                case 41 -> 95;
                case 42 -> 125;
                case 43 -> 194;
                case 44 -> 97;
                case 45 -> 30;
                case 46 -> 129;
                case 47 -> 205;
                case 48 -> 93;
                case 49 -> 100;
                case 50 -> 130;
                case 51 -> 104;
                case 52 -> 68;
                case 53 -> 208;
                case 54 -> 163;
                case 55 -> 193;
                case 56 -> 94;
                case 57 -> 23;
                case 58 -> 120;
                case 59 -> 253;
                case 60 -> 140;
                case 61 -> 195;
                case 62 -> 91;
                case 63 -> 174;
                case 64 -> 90;
                case 65 -> 171;
                case 66 -> 26;
                case 67 -> 196;
                case 68 -> 122;
                case 69 -> 216;
                case 70 -> 170;
                case 71 -> 225;
                case 72 -> 184;
                case 73 -> 1;
                case 74 -> 85;
                case 75 -> 201;
                case 76 -> 57;
                case 77 -> 158;
                case 78 -> 123;
                case 79 -> 226;
                case 80 -> 203;
                case 81 -> 117;
                case 82 -> 139;
                case 83 -> 166;
                case 84 -> 210;
                case 85 -> 40;
                case 86 -> 146;
                case 87 -> 20;
                case 88 -> 39;
                case 89 -> 131;
                case 90 -> 37;
                case 91 -> 73;
                case 92 -> 229;
                case 93 -> 4;
                case 94 -> 80;
                case 95 -> 51;
                case 96 -> 237;
                case 97 -> 111;
                case 98 -> 82;
                case 99 -> 15;
                case 100 -> 89;
                case 101 -> 25;
                case 102 -> 134;
                case 103 -> 159;
                case 104 -> 8;
                case 105 -> 214;
                case 106 -> 249;
                case 107 -> 34;
                case 108 -> 17;
                case 109 -> 236;
                case 110 -> 61;
                case 111 -> 114;
                case 112 -> 167;
                case 113 -> 16;
                case 114 -> 92;
                case 115 -> 215;
                case 116 -> 12;
                case 117 -> 2;
                case 118 -> 133;
                case 119 -> 21;
                case 120 -> 14;
                case 121 -> 137;
                case 122 -> 106;
                case 123 -> 153;
                case 124 -> 161;
                case 125 -> 46;
                case 126 -> 223;
                case 127 -> 180;
                case 128 -> 200;
                case 129 -> 109;
                case 130 -> 147;
                case 131 -> 43;
                case 132 -> 99;
                case 133 -> 132;
                case 134 -> 239;
                case 135 -> 221;
                case 136 -> 148;
                case 137 -> 151;
                case 138 -> 252;
                case 139 -> 248;
                case 140 -> 168;
                case 141 -> 13;
                case 142 -> 241;
                case 143 -> 49;
                case 144 -> 187;
                case 145 -> 66;
                case 146 -> 118;
                case 147 -> 190;
                case 148 -> 83;
                case 149 -> 88;
                case 150 -> 7;
                case 151 -> 45;
                case 152 -> 173;
                case 153 -> 60;
                case 154 -> 240;
                case 155 -> 101;
                case 156 -> 220;
                case 157 -> 183;
                case 158 -> 52;
                case 159 -> 177;
                case 160 -> 35;
                case 161 -> 48;
                case 162 -> 128;
                case 163 -> 41;
                case 164 -> 244;
                case 165 -> 65;
                case 166 -> 10;
                case 167 -> 143;
                case 168 -> 155;
                case 169 -> 156;
                case 170 -> 3;
                case 171 -> 112;
                case 172 -> 32;
                case 173 -> 84;
                case 174 -> 217;
                case 175 -> 135;
                case 176 -> 231;
                case 177 -> 218;
                case 178 -> 102;
                case 179 -> 207;
                case 180 -> 78;
                case 181 -> 113;
                case 182 -> 199;
                case 183 -> 29;
                case 184 -> 105;
                case 185 -> 254;
                case 186 -> 230;
                case 187 -> 181;
                case 188 -> 38;
                case 189 -> 176;
                case 190 -> 250;
                case 191 -> 246;
                case 192 -> 162;
                case 193 -> 164;
                case 194 -> 67;
                case 195 -> 69;
                case 196 -> 5;
                case 197 -> 63;
                case 198 -> 154;
                case 199 -> 238;
                case 200 -> 96;
                case 201 -> 86;
                case 202 -> 149;
                case 203 -> 47;
                case 204 -> 209;
                case 205 -> 77;
                case 206 -> 22;
                case 207 -> 76;
                case 208 -> 119;
                case 209 -> 59;
                case 210 -> 50;
                case 211 -> 157;
                case 212 -> 169;
                case 213 -> 108;
                case 214 -> 179;
                case 215 -> 234;
                case 216 -> 70;
                case 217 -> 58;
                case 218 -> 222;
                case 219 -> 136;
                case 220 -> 0;
                case 221 -> 202;
                case 222 -> 182;
                case 223 -> 232;
                case 224 -> 235;
                case 225 -> 251;
                case 226 -> 62;
                case 227 -> 178;
                case 228 -> 255;
                case 229 -> 36;
                case 230 -> 185;
                case 231 -> 211;
                case 232 -> 81;
                case 233 -> 227;
                case 234 -> 124;
                case 235 -> 79;
                case 236 -> 74;
                case 237 -> 11;
                case 238 -> 206;
                case 239 -> 189;
                case 240 -> 126;
                case 241 -> 212;
                case 242 -> 121;
                case 243 -> 42;
                case 244 -> 213;
                case 245 -> 145;
                case 246 -> 33;
                case 247 -> 54;
                case 248 -> 188;
                case 249 -> 107;
                case 250 -> 9;
                case 251 -> 142;
                case 252 -> 144;
                case 253 -> 71;
                case 254 -> 160;
                default -> 228;
            };
            int n6 = (n2 & 0xFF) - n5;
            if (n6 < 0) {
                n6 += 256;
            }
            if ((n4 = ((n2 & 0xFFFF) >>> 8) - n5) < 0) {
                n4 += 256;
            }
            int n7 = 0;
            while (n7 < cArray.length) {
                int n8 = n7 % 2;
                int n9 = n7;
                char[] cArray2 = cArray;
                char c = cArray[n9];
                if (n8 == 0) {
                    cArray2[n9] = (char)(c ^ n6);
                    n6 = ((n6 >>> 3 | n6 << 5) ^ cArray[n7]) & 0xFF;
                } else {
                    cArray2[n9] = (char)(c ^ n4);
                    n4 = ((n4 >>> 3 | n4 << 5) ^ cArray[n7]) & 0xFF;
                }
                ++n7;
            }
            b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }
    static {
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.IllIIIlIllIIlIllIlllIIllllIIlllIllIIIlIIlIlIllIIllIlllIIIIlIllIllIIIlIIIIIlllIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
