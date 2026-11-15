// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var3 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var4 = p0.beginStructure(var3);
       llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl.a(p1, var4, var3);
       var4.endStructure(var3);
    }
    public llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       String var4 = null;
       String var5 = null;
       Double var6 = null;
       int var7 = 0;
       Double var8 = null;
       kotlinx.serialization.encoding.CompositeDecoder var9 = p0.beginStructure(var1);
       if (var9.decodeSequentially()) {
          var4 = var9.decodeStringElement(var1, 0);
          var3 |= 1;
          var5 = var9.decodeStringElement(var1, 1);
          var3 |= 2;
          var6 = (Double)var9.decodeNullableSerializableElement(var1, 2, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var6);
          var3 |= 4;
          var7 = var9.decodeIntElement(var1, 3);
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
                var6 = (Double)var9.decodeNullableSerializableElement(var1, 2, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.DoubleSerializer.INSTANCE, var6);
                var3 |= 4;
             } else if (var10 == 3) {
                var7 = var9.decodeIntElement(var1, 3);
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
       return new llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl(var3, var4, var5, var6, var7, var8, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
           kotlinx.serialization.KSerializer[] var1 = new kotlinx.serialization.KSerializer[5];
           var1[0] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
           var1[1] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
           var1[2] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) (java.lang.Object) kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
           var1[3] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
           var1[4] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) (java.lang.Object) kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
           return var1;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0x692D) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 237;
                case 1 -> 248;
                case 2 -> 193;
                case 3 -> 61;
                case 4 -> 130;
                case 5 -> 90;
                case 6 -> 181;
                case 7 -> 178;
                case 8 -> 183;
                case 9 -> 147;
                case 10 -> 154;
                case 11 -> 241;
                case 12 -> 74;
                case 13 -> 56;
                case 14 -> 6;
                case 15 -> 134;
                case 16 -> 201;
                case 17 -> 72;
                case 18 -> 68;
                case 19 -> 14;
                case 20 -> 247;
                case 21 -> 86;
                case 22 -> 120;
                case 23 -> 206;
                case 24 -> 99;
                case 25 -> 155;
                case 26 -> 210;
                case 27 -> 224;
                case 28 -> 84;
                case 29 -> 175;
                case 30 -> 50;
                case 31 -> 184;
                case 32 -> 47;
                case 33 -> 216;
                case 34 -> 104;
                case 35 -> 63;
                case 36 -> 115;
                case 37 -> 122;
                case 38 -> 31;
                case 39 -> 27;
                case 40 -> 191;
                case 41 -> 110;
                case 42 -> 4;
                case 43 -> 188;
                case 44 -> 194;
                case 45 -> 186;
                case 46 -> 15;
                case 47 -> 112;
                case 48 -> 151;
                case 49 -> 79;
                case 50 -> 244;
                case 51 -> 91;
                case 52 -> 152;
                case 53 -> 55;
                case 54 -> 116;
                case 55 -> 81;
                case 56 -> 51;
                case 57 -> 245;
                case 58 -> 142;
                case 59 -> 205;
                case 60 -> 102;
                case 61 -> 77;
                case 62 -> 8;
                case 63 -> 71;
                case 64 -> 126;
                case 65 -> 195;
                case 66 -> 131;
                case 67 -> 80;
                case 68 -> 145;
                case 69 -> 11;
                case 70 -> 123;
                case 71 -> 2;
                case 72 -> 89;
                case 73 -> 121;
                case 74 -> 212;
                case 75 -> 16;
                case 76 -> 41;
                case 77 -> 137;
                case 78 -> 234;
                case 79 -> 88;
                case 80 -> 255;
                case 81 -> 144;
                case 82 -> 156;
                case 83 -> 21;
                case 84 -> 83;
                case 85 -> 140;
                case 86 -> 43;
                case 87 -> 238;
                case 88 -> 67;
                case 89 -> 170;
                case 90 -> 75;
                case 91 -> 105;
                case 92 -> 222;
                case 93 -> 82;
                case 94 -> 103;
                case 95 -> 246;
                case 96 -> 25;
                case 97 -> 214;
                case 98 -> 38;
                case 99 -> 44;
                case 100 -> 233;
                case 101 -> 100;
                case 102 -> 125;
                case 103 -> 7;
                case 104 -> 171;
                case 105 -> 106;
                case 106 -> 118;
                case 107 -> 223;
                case 108 -> 179;
                case 109 -> 1;
                case 110 -> 22;
                case 111 -> 5;
                case 112 -> 229;
                case 113 -> 124;
                case 114 -> 235;
                case 115 -> 153;
                case 116 -> 157;
                case 117 -> 173;
                case 118 -> 96;
                case 119 -> 169;
                case 120 -> 24;
                case 121 -> 209;
                case 122 -> 172;
                case 123 -> 143;
                case 124 -> 93;
                case 125 -> 150;
                case 126 -> 34;
                case 127 -> 165;
                case 128 -> 187;
                case 129 -> 227;
                case 130 -> 249;
                case 131 -> 129;
                case 132 -> 70;
                case 133 -> 182;
                case 134 -> 202;
                case 135 -> 160;
                case 136 -> 98;
                case 137 -> 39;
                case 138 -> 111;
                case 139 -> 243;
                case 140 -> 114;
                case 141 -> 232;
                case 142 -> 141;
                case 143 -> 127;
                case 144 -> 240;
                case 145 -> 52;
                case 146 -> 242;
                case 147 -> 57;
                case 148 -> 54;
                case 149 -> 119;
                case 150 -> 236;
                case 151 -> 76;
                case 152 -> 215;
                case 153 -> 226;
                case 154 -> 189;
                case 155 -> 164;
                case 156 -> 253;
                case 157 -> 211;
                case 158 -> 113;
                case 159 -> 135;
                case 160 -> 176;
                case 161 -> 174;
                case 162 -> 45;
                case 163 -> 177;
                case 164 -> 35;
                case 165 -> 78;
                case 166 -> 53;
                case 167 -> 138;
                case 168 -> 59;
                case 169 -> 10;
                case 170 -> 225;
                case 171 -> 146;
                case 172 -> 94;
                case 173 -> 17;
                case 174 -> 40;
                case 175 -> 180;
                case 176 -> 239;
                case 177 -> 46;
                case 178 -> 228;
                case 179 -> 162;
                case 180 -> 13;
                case 181 -> 231;
                case 182 -> 26;
                case 183 -> 108;
                case 184 -> 101;
                case 185 -> 218;
                case 186 -> 33;
                case 187 -> 132;
                case 188 -> 32;
                case 189 -> 217;
                case 190 -> 204;
                case 191 -> 37;
                case 192 -> 158;
                case 193 -> 251;
                case 194 -> 139;
                case 195 -> 12;
                case 196 -> 190;
                case 197 -> 199;
                case 198 -> 168;
                case 199 -> 87;
                case 200 -> 66;
                case 201 -> 252;
                case 202 -> 3;
                case 203 -> 213;
                case 204 -> 219;
                case 205 -> 230;
                case 206 -> 166;
                case 207 -> 167;
                case 208 -> 200;
                case 209 -> 185;
                case 210 -> 136;
                case 211 -> 107;
                case 212 -> 0;
                case 213 -> 23;
                case 214 -> 250;
                case 215 -> 28;
                case 216 -> 128;
                case 217 -> 73;
                case 218 -> 58;
                case 219 -> 208;
                case 220 -> 49;
                case 221 -> 192;
                case 222 -> 64;
                case 223 -> 197;
                case 224 -> 42;
                case 225 -> 97;
                case 226 -> 163;
                case 227 -> 220;
                case 228 -> 149;
                case 229 -> 48;
                case 230 -> 133;
                case 231 -> 29;
                case 232 -> 161;
                case 233 -> 117;
                case 234 -> 254;
                case 235 -> 60;
                case 236 -> 203;
                case 237 -> 196;
                case 238 -> 207;
                case 239 -> 85;
                case 240 -> 92;
                case 241 -> 148;
                case 242 -> 36;
                case 243 -> 62;
                case 244 -> 198;
                case 245 -> 69;
                case 246 -> 18;
                case 247 -> 221;
                case 248 -> 19;
                case 249 -> 9;
                case 250 -> 20;
                case 251 -> 95;
                case 252 -> 109;
                case 253 -> 65;
                case 254 -> 30;
                default -> 159;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.llIIlIIIIllIlllIllllIllIlIIllIlIIllIIIlIlIIllIIlIIIIlllIIIIlllIlllIlIlIIlIIIIlIIIIlIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
