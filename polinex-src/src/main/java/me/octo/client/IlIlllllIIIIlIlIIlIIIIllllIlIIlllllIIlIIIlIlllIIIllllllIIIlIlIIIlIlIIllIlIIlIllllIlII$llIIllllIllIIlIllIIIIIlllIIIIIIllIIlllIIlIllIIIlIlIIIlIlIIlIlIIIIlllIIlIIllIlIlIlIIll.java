// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var3 = p0.beginStructure(var2);
       IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII.a(p1, var3, var2);
       var3.endStructure(var2);
    }
    public IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII a(kotlinx.serialization.encoding.Decoder p0) {
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
       return new IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII(var3, var4, var5, var6, var7, var8, null);
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
       this.a(p0, (IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0x5302) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 249;
                case 1 -> 224;
                case 2 -> 126;
                case 3 -> 127;
                case 4 -> 253;
                case 5 -> 125;
                case 6 -> 217;
                case 7 -> 192;
                case 8 -> 208;
                case 9 -> 5;
                case 10 -> 148;
                case 11 -> 71;
                case 12 -> 233;
                case 13 -> 137;
                case 14 -> 4;
                case 15 -> 229;
                case 16 -> 113;
                case 17 -> 55;
                case 18 -> 144;
                case 19 -> 114;
                case 20 -> 160;
                case 21 -> 87;
                case 22 -> 140;
                case 23 -> 95;
                case 24 -> 44;
                case 25 -> 52;
                case 26 -> 185;
                case 27 -> 30;
                case 28 -> 74;
                case 29 -> 97;
                case 30 -> 203;
                case 31 -> 242;
                case 32 -> 168;
                case 33 -> 91;
                case 34 -> 85;
                case 35 -> 219;
                case 36 -> 102;
                case 37 -> 227;
                case 38 -> 68;
                case 39 -> 28;
                case 40 -> 45;
                case 41 -> 7;
                case 42 -> 23;
                case 43 -> 196;
                case 44 -> 254;
                case 45 -> 72;
                case 46 -> 62;
                case 47 -> 13;
                case 48 -> 94;
                case 49 -> 234;
                case 50 -> 246;
                case 51 -> 63;
                case 52 -> 244;
                case 53 -> 128;
                case 54 -> 105;
                case 55 -> 135;
                case 56 -> 131;
                case 57 -> 14;
                case 58 -> 49;
                case 59 -> 251;
                case 60 -> 147;
                case 61 -> 132;
                case 62 -> 166;
                case 63 -> 238;
                case 64 -> 16;
                case 65 -> 149;
                case 66 -> 146;
                case 67 -> 46;
                case 68 -> 190;
                case 69 -> 53;
                case 70 -> 170;
                case 71 -> 145;
                case 72 -> 110;
                case 73 -> 86;
                case 74 -> 136;
                case 75 -> 189;
                case 76 -> 40;
                case 77 -> 171;
                case 78 -> 159;
                case 79 -> 197;
                case 80 -> 84;
                case 81 -> 183;
                case 82 -> 64;
                case 83 -> 199;
                case 84 -> 1;
                case 85 -> 139;
                case 86 -> 36;
                case 87 -> 205;
                case 88 -> 3;
                case 89 -> 182;
                case 90 -> 252;
                case 91 -> 176;
                case 92 -> 119;
                case 93 -> 118;
                case 94 -> 154;
                case 95 -> 54;
                case 96 -> 202;
                case 97 -> 245;
                case 98 -> 158;
                case 99 -> 66;
                case 100 -> 99;
                case 101 -> 164;
                case 102 -> 48;
                case 103 -> 57;
                case 104 -> 248;
                case 105 -> 2;
                case 106 -> 37;
                case 107 -> 162;
                case 108 -> 167;
                case 109 -> 34;
                case 110 -> 225;
                case 111 -> 200;
                case 112 -> 207;
                case 113 -> 58;
                case 114 -> 247;
                case 115 -> 6;
                case 116 -> 100;
                case 117 -> 43;
                case 118 -> 218;
                case 119 -> 41;
                case 120 -> 172;
                case 121 -> 122;
                case 122 -> 26;
                case 123 -> 195;
                case 124 -> 80;
                case 125 -> 223;
                case 126 -> 152;
                case 127 -> 89;
                case 128 -> 35;
                case 129 -> 120;
                case 130 -> 163;
                case 131 -> 107;
                case 132 -> 10;
                case 133 -> 201;
                case 134 -> 221;
                case 135 -> 70;
                case 136 -> 179;
                case 137 -> 38;
                case 138 -> 206;
                case 139 -> 215;
                case 140 -> 51;
                case 141 -> 239;
                case 142 -> 243;
                case 143 -> 210;
                case 144 -> 226;
                case 145 -> 228;
                case 146 -> 143;
                case 147 -> 134;
                case 148 -> 101;
                case 149 -> 56;
                case 150 -> 193;
                case 151 -> 151;
                case 152 -> 231;
                case 153 -> 12;
                case 154 -> 250;
                case 155 -> 47;
                case 156 -> 81;
                case 157 -> 60;
                case 158 -> 27;
                case 159 -> 174;
                case 160 -> 236;
                case 161 -> 76;
                case 162 -> 121;
                case 163 -> 78;
                case 164 -> 169;
                case 165 -> 98;
                case 166 -> 20;
                case 167 -> 42;
                case 168 -> 211;
                case 169 -> 73;
                case 170 -> 109;
                case 171 -> 204;
                case 172 -> 0;
                case 173 -> 103;
                case 174 -> 255;
                case 175 -> 177;
                case 176 -> 220;
                case 177 -> 21;
                case 178 -> 178;
                case 179 -> 93;
                case 180 -> 161;
                case 181 -> 129;
                case 182 -> 18;
                case 183 -> 29;
                case 184 -> 156;
                case 185 -> 115;
                case 186 -> 116;
                case 187 -> 222;
                case 188 -> 104;
                case 189 -> 50;
                case 190 -> 92;
                case 191 -> 173;
                case 192 -> 230;
                case 193 -> 187;
                case 194 -> 88;
                case 195 -> 111;
                case 196 -> 157;
                case 197 -> 75;
                case 198 -> 209;
                case 199 -> 69;
                case 200 -> 165;
                case 201 -> 67;
                case 202 -> 32;
                case 203 -> 65;
                case 204 -> 108;
                case 205 -> 188;
                case 206 -> 191;
                case 207 -> 79;
                case 208 -> 194;
                case 209 -> 124;
                case 210 -> 77;
                case 211 -> 24;
                case 212 -> 33;
                case 213 -> 31;
                case 214 -> 22;
                case 215 -> 17;
                case 216 -> 180;
                case 217 -> 25;
                case 218 -> 11;
                case 219 -> 59;
                case 220 -> 155;
                case 221 -> 83;
                case 222 -> 138;
                case 223 -> 8;
                case 224 -> 198;
                case 225 -> 123;
                case 226 -> 90;
                case 227 -> 150;
                case 228 -> 39;
                case 229 -> 61;
                case 230 -> 153;
                case 231 -> 9;
                case 232 -> 82;
                case 233 -> 112;
                case 234 -> 130;
                case 235 -> 232;
                case 236 -> 184;
                case 237 -> 216;
                case 238 -> 237;
                case 239 -> 15;
                case 240 -> 142;
                case 241 -> 96;
                case 242 -> 212;
                case 243 -> 240;
                case 244 -> 133;
                case 245 -> 181;
                case 246 -> 213;
                case 247 -> 241;
                case 248 -> 175;
                case 249 -> 235;
                case 250 -> 117;
                case 251 -> 106;
                case 252 -> 214;
                case 253 -> 141;
                case 254 -> 186;
                default -> 19;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.IlIlllllIIIIlIlIIlIIIIllllIlIIlllllIIlIIIlIlllIIIllllllIIIlIlIIIlIlIIllIlIIlIllllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
