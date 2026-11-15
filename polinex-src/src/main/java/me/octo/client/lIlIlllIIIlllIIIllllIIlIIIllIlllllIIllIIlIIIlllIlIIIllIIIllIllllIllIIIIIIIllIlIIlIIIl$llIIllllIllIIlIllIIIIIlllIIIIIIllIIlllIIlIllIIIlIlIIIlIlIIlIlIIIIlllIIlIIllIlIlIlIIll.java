// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var4 = p0.beginStructure(var3);
       me.octo.client.lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl.a(p1, var4, var3);
       var4.endStructure(var3);
    }
    public lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       boolean var4 = false;
       lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII var5 = null;
       String var6 = null;
       kotlinx.serialization.encoding.CompositeDecoder var7 = p0.beginStructure(var1);
       if (var7.decodeSequentially()) {
          var4 = var7.decodeBooleanElement(var1, 0);
          var3 |= 1;
          var5 = (lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII)var7.decodeSerializableElement(
             var1, 1, (kotlinx.serialization.DeserializationStrategy)me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var5);
          var3 |= 2;
          var6 = (String)var7.decodeNullableSerializableElement(var1, 2, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.StringSerializer.INSTANCE, var6);
          var3 |= 4;
       } else {
          while (var2 != 0) {
             int var8 = var7.decodeElementIndex(var1);
             if (var8 == -1) {
                var2 = 0;
             } else if (var8 == 0) {
                var4 = var7.decodeBooleanElement(var1, 0);
                var3 |= 1;
             } else if (var8 == 1) {
                var5 = (lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII)var7.decodeSerializableElement(
                   var1, 1, (kotlinx.serialization.DeserializationStrategy)me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var5);
                var3 |= 2;
             } else if (var8 == 2) {
                var6 = (String)var7.decodeNullableSerializableElement(var1, 2, (kotlinx.serialization.DeserializationStrategy)kotlinx.serialization.internal.StringSerializer.INSTANCE, var6);
                var3 |= 4;
             } else {
                throw new kotlinx.serialization.UnknownFieldException(var8);
             }
          }
       }
       var7.endStructure(var1);
       return new lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl(var3, var4, var5, var6, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
       return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
       kotlinx.serialization.KSerializer[] var2 = new kotlinx.serialization.KSerializer[3];
       var2[0] = kotlinx.serialization.internal.BooleanSerializer.INSTANCE;
       var2[1] = (kotlinx.serialization.KSerializer) me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
       var2[2] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE);
       return var2;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0x2B80) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 6;
                case 1 -> 192;
                case 2 -> 2;
                case 3 -> 118;
                case 4 -> 131;
                case 5 -> 163;
                case 6 -> 242;
                case 7 -> 207;
                case 8 -> 117;
                case 9 -> 249;
                case 10 -> 175;
                case 11 -> 79;
                case 12 -> 61;
                case 13 -> 49;
                case 14 -> 111;
                case 15 -> 169;
                case 16 -> 48;
                case 17 -> 137;
                case 18 -> 114;
                case 19 -> 132;
                case 20 -> 47;
                case 21 -> 179;
                case 22 -> 23;
                case 23 -> 88;
                case 24 -> 55;
                case 25 -> 0;
                case 26 -> 82;
                case 27 -> 236;
                case 28 -> 247;
                case 29 -> 221;
                case 30 -> 211;
                case 31 -> 201;
                case 32 -> 240;
                case 33 -> 26;
                case 34 -> 91;
                case 35 -> 124;
                case 36 -> 122;
                case 37 -> 17;
                case 38 -> 238;
                case 39 -> 109;
                case 40 -> 99;
                case 41 -> 96;
                case 42 -> 134;
                case 43 -> 229;
                case 44 -> 129;
                case 45 -> 1;
                case 46 -> 41;
                case 47 -> 92;
                case 48 -> 252;
                case 49 -> 112;
                case 50 -> 108;
                case 51 -> 58;
                case 52 -> 24;
                case 53 -> 20;
                case 54 -> 115;
                case 55 -> 50;
                case 56 -> 43;
                case 57 -> 18;
                case 58 -> 215;
                case 59 -> 198;
                case 60 -> 167;
                case 61 -> 212;
                case 62 -> 68;
                case 63 -> 80;
                case 64 -> 66;
                case 65 -> 54;
                case 66 -> 42;
                case 67 -> 32;
                case 68 -> 14;
                case 69 -> 113;
                case 70 -> 181;
                case 71 -> 140;
                case 72 -> 159;
                case 73 -> 27;
                case 74 -> 128;
                case 75 -> 105;
                case 76 -> 45;
                case 77 -> 135;
                case 78 -> 60;
                case 79 -> 143;
                case 80 -> 133;
                case 81 -> 33;
                case 82 -> 190;
                case 83 -> 149;
                case 84 -> 29;
                case 85 -> 241;
                case 86 -> 22;
                case 87 -> 139;
                case 88 -> 158;
                case 89 -> 65;
                case 90 -> 85;
                case 91 -> 106;
                case 92 -> 44;
                case 93 -> 160;
                case 94 -> 244;
                case 95 -> 40;
                case 96 -> 168;
                case 97 -> 103;
                case 98 -> 162;
                case 99 -> 150;
                case 100 -> 193;
                case 101 -> 246;
                case 102 -> 15;
                case 103 -> 250;
                case 104 -> 217;
                case 105 -> 34;
                case 106 -> 202;
                case 107 -> 220;
                case 108 -> 194;
                case 109 -> 157;
                case 110 -> 19;
                case 111 -> 219;
                case 112 -> 232;
                case 113 -> 231;
                case 114 -> 53;
                case 115 -> 222;
                case 116 -> 152;
                case 117 -> 93;
                case 118 -> 35;
                case 119 -> 151;
                case 120 -> 37;
                case 121 -> 180;
                case 122 -> 147;
                case 123 -> 125;
                case 124 -> 228;
                case 125 -> 51;
                case 126 -> 77;
                case 127 -> 74;
                case 128 -> 154;
                case 129 -> 16;
                case 130 -> 107;
                case 131 -> 166;
                case 132 -> 5;
                case 133 -> 31;
                case 134 -> 156;
                case 135 -> 206;
                case 136 -> 71;
                case 137 -> 148;
                case 138 -> 72;
                case 139 -> 184;
                case 140 -> 95;
                case 141 -> 189;
                case 142 -> 64;
                case 143 -> 94;
                case 144 -> 224;
                case 145 -> 59;
                case 146 -> 70;
                case 147 -> 227;
                case 148 -> 174;
                case 149 -> 225;
                case 150 -> 171;
                case 151 -> 38;
                case 152 -> 11;
                case 153 -> 145;
                case 154 -> 3;
                case 155 -> 63;
                case 156 -> 7;
                case 157 -> 76;
                case 158 -> 237;
                case 159 -> 28;
                case 160 -> 56;
                case 161 -> 233;
                case 162 -> 187;
                case 163 -> 102;
                case 164 -> 104;
                case 165 -> 204;
                case 166 -> 57;
                case 167 -> 205;
                case 168 -> 183;
                case 169 -> 188;
                case 170 -> 21;
                case 171 -> 25;
                case 172 -> 12;
                case 173 -> 73;
                case 174 -> 75;
                case 175 -> 214;
                case 176 -> 178;
                case 177 -> 182;
                case 178 -> 203;
                case 179 -> 141;
                case 180 -> 235;
                case 181 -> 121;
                case 182 -> 209;
                case 183 -> 173;
                case 184 -> 161;
                case 185 -> 170;
                case 186 -> 146;
                case 187 -> 84;
                case 188 -> 101;
                case 189 -> 83;
                case 190 -> 67;
                case 191 -> 210;
                case 192 -> 191;
                case 193 -> 223;
                case 194 -> 200;
                case 195 -> 177;
                case 196 -> 245;
                case 197 -> 196;
                case 198 -> 120;
                case 199 -> 197;
                case 200 -> 123;
                case 201 -> 69;
                case 202 -> 8;
                case 203 -> 127;
                case 204 -> 243;
                case 205 -> 46;
                case 206 -> 195;
                case 207 -> 251;
                case 208 -> 142;
                case 209 -> 253;
                case 210 -> 78;
                case 211 -> 62;
                case 212 -> 130;
                case 213 -> 110;
                case 214 -> 136;
                case 215 -> 97;
                case 216 -> 230;
                case 217 -> 89;
                case 218 -> 216;
                case 219 -> 226;
                case 220 -> 98;
                case 221 -> 234;
                case 222 -> 36;
                case 223 -> 185;
                case 224 -> 239;
                case 225 -> 86;
                case 226 -> 10;
                case 227 -> 144;
                case 228 -> 248;
                case 229 -> 81;
                case 230 -> 13;
                case 231 -> 126;
                case 232 -> 52;
                case 233 -> 199;
                case 234 -> 119;
                case 235 -> 39;
                case 236 -> 9;
                case 237 -> 218;
                case 238 -> 30;
                case 239 -> 155;
                case 240 -> 153;
                case 241 -> 165;
                case 242 -> 116;
                case 243 -> 100;
                case 244 -> 138;
                case 245 -> 208;
                case 246 -> 254;
                case 247 -> 87;
                case 248 -> 4;
                case 249 -> 255;
                case 250 -> 164;
                case 251 -> 176;
                case 252 -> 172;
                case 253 -> 90;
                case 254 -> 213;
                default -> 186;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.lIlIlllIIIlllIIIllllIIlIIIllIlllllIIllIIlIIIlllIlIIIllIIIllIllllIllIIIIIIIllIlIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
