// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var4 = p0.beginStructure(var3);
       me.octo.client.IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl.a(p1, var4, var3);
       var4.endStructure(var3);
    }
    public IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       String var4 = null;
       String var5 = null;
       int var6 = 0;
       Double var7 = null;
       Double var8 = null;
       kotlinx.serialization.encoding.CompositeDecoder var9 = p0.beginStructure(var1);
       if (var9.decodeSequentially()) {
          var4 = var9.decodeStringElement(var1, 0);
          var3 |= 1;
          var5 = var9.decodeStringElement(var1, 1);
          var3 |= 2;
          var6 = var9.decodeIntElement(var1, 2);
          var3 |= 4;
          var7 = (Double)var9.decodeNullableSerializableElement(var1, 3, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var7);
          var3 |= 8;
          var8 = (Double)var9.decodeNullableSerializableElement(var1, 4, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var8);
          var3 |= 16;
       } else {
          while (var2 != 0) {
             int var10 = var9.decodeElementIndex(var1);
             if (var10 == -1) {
                var2 = 0;
             } else if (var10 == 0) {
                var4 = var9.decodeStringElement(var1, 0);
                var3 |= 1;
             } else if (var10 == 1) {
                var5 = var9.decodeStringElement(var1, 1);
                var3 |= 2;
             } else if (var10 == 2) {
                var6 = var9.decodeIntElement(var1, 2);
                var3 |= 4;
             } else if (var10 == 3) {
                var7 = (Double)var9.decodeNullableSerializableElement(var1, 3, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var7);
                var3 |= 8;
             } else if (var10 == 4) {
                var8 = (Double)var9.decodeNullableSerializableElement(var1, 4, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var8);
                var3 |= 16;
             } else {
                throw new kotlinx.serialization.UnknownFieldException(var10);
             }
          }
       }
       var9.endStructure(var1);
       return new IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl(var3, var4, var5, var6, var7, var8, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public final kotlinx.serialization.KSerializer[] childSerializers() {
       kotlinx.serialization.KSerializer[] var1 = new kotlinx.serialization.KSerializer[5];
       var1[0] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var1[1] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var1[2] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var1[3] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer)(Object)kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
       var1[4] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer)(Object)kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
       return var1;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFF345) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 105;
                case 1 -> 109;
                case 2 -> 137;
                case 3 -> 70;
                case 4 -> 133;
                case 5 -> 193;
                case 6 -> 166;
                case 7 -> 59;
                case 8 -> 6;
                case 9 -> 119;
                case 10 -> 56;
                case 11 -> 51;
                case 12 -> 164;
                case 13 -> 142;
                case 14 -> 63;
                case 15 -> 183;
                case 16 -> 21;
                case 17 -> 173;
                case 18 -> 152;
                case 19 -> 72;
                case 20 -> 211;
                case 21 -> 113;
                case 22 -> 81;
                case 23 -> 86;
                case 24 -> 126;
                case 25 -> 24;
                case 26 -> 228;
                case 27 -> 41;
                case 28 -> 148;
                case 29 -> 125;
                case 30 -> 96;
                case 31 -> 42;
                case 32 -> 234;
                case 33 -> 192;
                case 34 -> 99;
                case 35 -> 34;
                case 36 -> 103;
                case 37 -> 194;
                case 38 -> 62;
                case 39 -> 61;
                case 40 -> 254;
                case 41 -> 143;
                case 42 -> 101;
                case 43 -> 58;
                case 44 -> 241;
                case 45 -> 8;
                case 46 -> 48;
                case 47 -> 138;
                case 48 -> 134;
                case 49 -> 91;
                case 50 -> 250;
                case 51 -> 54;
                case 52 -> 170;
                case 53 -> 179;
                case 54 -> 157;
                case 55 -> 127;
                case 56 -> 246;
                case 57 -> 104;
                case 58 -> 214;
                case 59 -> 45;
                case 60 -> 162;
                case 61 -> 139;
                case 62 -> 240;
                case 63 -> 102;
                case 64 -> 208;
                case 65 -> 220;
                case 66 -> 64;
                case 67 -> 71;
                case 68 -> 74;
                case 69 -> 92;
                case 70 -> 247;
                case 71 -> 135;
                case 72 -> 225;
                case 73 -> 239;
                case 74 -> 22;
                case 75 -> 177;
                case 76 -> 32;
                case 77 -> 226;
                case 78 -> 197;
                case 79 -> 79;
                case 80 -> 55;
                case 81 -> 200;
                case 82 -> 158;
                case 83 -> 207;
                case 84 -> 121;
                case 85 -> 153;
                case 86 -> 35;
                case 87 -> 244;
                case 88 -> 107;
                case 89 -> 169;
                case 90 -> 90;
                case 91 -> 210;
                case 92 -> 185;
                case 93 -> 233;
                case 94 -> 77;
                case 95 -> 159;
                case 96 -> 184;
                case 97 -> 161;
                case 98 -> 38;
                case 99 -> 66;
                case 100 -> 16;
                case 101 -> 186;
                case 102 -> 146;
                case 103 -> 15;
                case 104 -> 187;
                case 105 -> 209;
                case 106 -> 181;
                case 107 -> 150;
                case 108 -> 204;
                case 109 -> 36;
                case 110 -> 218;
                case 111 -> 17;
                case 112 -> 154;
                case 113 -> 82;
                case 114 -> 19;
                case 115 -> 117;
                case 116 -> 95;
                case 117 -> 114;
                case 118 -> 57;
                case 119 -> 219;
                case 120 -> 123;
                case 121 -> 223;
                case 122 -> 176;
                case 123 -> 10;
                case 124 -> 129;
                case 125 -> 196;
                case 126 -> 85;
                case 127 -> 25;
                case 128 -> 30;
                case 129 -> 98;
                case 130 -> 145;
                case 131 -> 78;
                case 132 -> 93;
                case 133 -> 0;
                case 134 -> 128;
                case 135 -> 115;
                case 136 -> 124;
                case 137 -> 3;
                case 138 -> 11;
                case 139 -> 131;
                case 140 -> 251;
                case 141 -> 189;
                case 142 -> 2;
                case 143 -> 67;
                case 144 -> 136;
                case 145 -> 217;
                case 146 -> 28;
                case 147 -> 14;
                case 148 -> 201;
                case 149 -> 80;
                case 150 -> 144;
                case 151 -> 231;
                case 152 -> 106;
                case 153 -> 213;
                case 154 -> 205;
                case 155 -> 20;
                case 156 -> 76;
                case 157 -> 87;
                case 158 -> 253;
                case 159 -> 191;
                case 160 -> 7;
                case 161 -> 33;
                case 162 -> 151;
                case 163 -> 175;
                case 164 -> 249;
                case 165 -> 97;
                case 166 -> 178;
                case 167 -> 147;
                case 168 -> 118;
                case 169 -> 167;
                case 170 -> 110;
                case 171 -> 44;
                case 172 -> 206;
                case 173 -> 75;
                case 174 -> 43;
                case 175 -> 149;
                case 176 -> 68;
                case 177 -> 140;
                case 178 -> 37;
                case 179 -> 47;
                case 180 -> 5;
                case 181 -> 243;
                case 182 -> 23;
                case 183 -> 13;
                case 184 -> 171;
                case 185 -> 182;
                case 186 -> 168;
                case 187 -> 216;
                case 188 -> 89;
                case 189 -> 83;
                case 190 -> 69;
                case 191 -> 130;
                case 192 -> 50;
                case 193 -> 230;
                case 194 -> 248;
                case 195 -> 165;
                case 196 -> 242;
                case 197 -> 31;
                case 198 -> 65;
                case 199 -> 172;
                case 200 -> 203;
                case 201 -> 29;
                case 202 -> 141;
                case 203 -> 46;
                case 204 -> 49;
                case 205 -> 100;
                case 206 -> 212;
                case 207 -> 227;
                case 208 -> 39;
                case 209 -> 73;
                case 210 -> 108;
                case 211 -> 94;
                case 212 -> 26;
                case 213 -> 252;
                case 214 -> 12;
                case 215 -> 238;
                case 216 -> 224;
                case 217 -> 255;
                case 218 -> 163;
                case 219 -> 235;
                case 220 -> 40;
                case 221 -> 116;
                case 222 -> 122;
                case 223 -> 245;
                case 224 -> 4;
                case 225 -> 199;
                case 226 -> 120;
                case 227 -> 237;
                case 228 -> 190;
                case 229 -> 180;
                case 230 -> 215;
                case 231 -> 53;
                case 232 -> 202;
                case 233 -> 60;
                case 234 -> 174;
                case 235 -> 198;
                case 236 -> 229;
                case 237 -> 27;
                case 238 -> 156;
                case 239 -> 9;
                case 240 -> 188;
                case 241 -> 84;
                case 242 -> 222;
                case 243 -> 88;
                case 244 -> 155;
                case 245 -> 232;
                case 246 -> 111;
                case 247 -> 236;
                case 248 -> 112;
                case 249 -> 195;
                case 250 -> 18;
                case 251 -> 52;
                case 252 -> 221;
                case 253 -> 160;
                case 254 -> 1;
                default -> 132;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.IllIIlllIllIllIIlIlllIIIIIIIlIlIIIlIlIlIIllIlIllIllllllIlIlIlIllIIllIlIIIllllIlIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
