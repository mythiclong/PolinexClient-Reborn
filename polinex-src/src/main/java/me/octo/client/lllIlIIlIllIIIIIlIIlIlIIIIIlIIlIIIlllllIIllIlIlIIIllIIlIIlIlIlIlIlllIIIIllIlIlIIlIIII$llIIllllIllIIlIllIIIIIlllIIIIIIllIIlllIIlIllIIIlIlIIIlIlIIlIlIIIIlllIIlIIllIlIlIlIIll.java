// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var4 = p0.beginStructure(var3);
       me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII.a(p1, var4, var3);
       var4.endStructure(var3);
    }
    public lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI var4 = null;
       kotlinx.serialization.encoding.CompositeDecoder var5 = p0.beginStructure(var1);
       if (var5.decodeSequentially()) {
          var4 = (IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI)var5.decodeSerializableElement(
             var1, 0, (kotlinx.serialization.DeserializationStrategy)me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var4);
          var3 |= 1;
       } else {
          while (var2 != 0) {
             int var6 = var5.decodeElementIndex(var1);
             if (var6 == -1) {
                var2 = 0;
             } else if (var6 == 0) {
                var4 = (IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI)var5.decodeSerializableElement(
                   var1, 0, (kotlinx.serialization.DeserializationStrategy)me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var4);
                var3 |= 1;
             } else {
                throw new kotlinx.serialization.UnknownFieldException(var6);
             }
          }
       }
       var5.endStructure(var1);
       return new lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII(var3, var4, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
       return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
       kotlinx.serialization.KSerializer[] var2 = new kotlinx.serialization.KSerializer[1];
       var2[0] = (kotlinx.serialization.KSerializer) me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
       return var2;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0x245A) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 220;
                case 1 -> 42;
                case 2 -> 69;
                case 3 -> 53;
                case 4 -> 92;
                case 5 -> 239;
                case 6 -> 211;
                case 7 -> 248;
                case 8 -> 202;
                case 9 -> 227;
                case 10 -> 72;
                case 11 -> 82;
                case 12 -> 46;
                case 13 -> 123;
                case 14 -> 207;
                case 15 -> 183;
                case 16 -> 180;
                case 17 -> 153;
                case 18 -> 100;
                case 19 -> 109;
                case 20 -> 1;
                case 21 -> 12;
                case 22 -> 97;
                case 23 -> 203;
                case 24 -> 8;
                case 25 -> 163;
                case 26 -> 4;
                case 27 -> 47;
                case 28 -> 212;
                case 29 -> 159;
                case 30 -> 95;
                case 31 -> 204;
                case 32 -> 54;
                case 33 -> 25;
                case 34 -> 235;
                case 35 -> 219;
                case 36 -> 37;
                case 37 -> 230;
                case 38 -> 107;
                case 39 -> 166;
                case 40 -> 49;
                case 41 -> 96;
                case 42 -> 108;
                case 43 -> 133;
                case 44 -> 253;
                case 45 -> 84;
                case 46 -> 119;
                case 47 -> 221;
                case 48 -> 106;
                case 49 -> 224;
                case 50 -> 184;
                case 51 -> 251;
                case 52 -> 116;
                case 53 -> 176;
                case 54 -> 242;
                case 55 -> 6;
                case 56 -> 148;
                case 57 -> 197;
                case 58 -> 210;
                case 59 -> 187;
                case 60 -> 27;
                case 61 -> 205;
                case 62 -> 102;
                case 63 -> 81;
                case 64 -> 44;
                case 65 -> 93;
                case 66 -> 141;
                case 67 -> 22;
                case 68 -> 55;
                case 69 -> 36;
                case 70 -> 190;
                case 71 -> 121;
                case 72 -> 225;
                case 73 -> 129;
                case 74 -> 194;
                case 75 -> 130;
                case 76 -> 3;
                case 77 -> 113;
                case 78 -> 64;
                case 79 -> 110;
                case 80 -> 233;
                case 81 -> 58;
                case 82 -> 234;
                case 83 -> 226;
                case 84 -> 115;
                case 85 -> 138;
                case 86 -> 90;
                case 87 -> 118;
                case 88 -> 144;
                case 89 -> 177;
                case 90 -> 120;
                case 91 -> 78;
                case 92 -> 66;
                case 93 -> 31;
                case 94 -> 101;
                case 95 -> 165;
                case 96 -> 174;
                case 97 -> 139;
                case 98 -> 40;
                case 99 -> 217;
                case 100 -> 206;
                case 101 -> 80;
                case 102 -> 175;
                case 103 -> 41;
                case 104 -> 104;
                case 105 -> 255;
                case 106 -> 43;
                case 107 -> 60;
                case 108 -> 232;
                case 109 -> 172;
                case 110 -> 124;
                case 111 -> 83;
                case 112 -> 88;
                case 113 -> 111;
                case 114 -> 32;
                case 115 -> 179;
                case 116 -> 52;
                case 117 -> 73;
                case 118 -> 237;
                case 119 -> 103;
                case 120 -> 149;
                case 121 -> 56;
                case 122 -> 45;
                case 123 -> 199;
                case 124 -> 213;
                case 125 -> 125;
                case 126 -> 143;
                case 127 -> 231;
                case 128 -> 75;
                case 129 -> 193;
                case 130 -> 168;
                case 131 -> 167;
                case 132 -> 195;
                case 133 -> 240;
                case 134 -> 162;
                case 135 -> 209;
                case 136 -> 157;
                case 137 -> 23;
                case 138 -> 182;
                case 139 -> 198;
                case 140 -> 218;
                case 141 -> 24;
                case 142 -> 236;
                case 143 -> 186;
                case 144 -> 126;
                case 145 -> 16;
                case 146 -> 185;
                case 147 -> 18;
                case 148 -> 216;
                case 149 -> 34;
                case 150 -> 70;
                case 151 -> 48;
                case 152 -> 0;
                case 153 -> 135;
                case 154 -> 5;
                case 155 -> 112;
                case 156 -> 245;
                case 157 -> 131;
                case 158 -> 142;
                case 159 -> 76;
                case 160 -> 170;
                case 161 -> 114;
                case 162 -> 59;
                case 163 -> 223;
                case 164 -> 169;
                case 165 -> 191;
                case 166 -> 15;
                case 167 -> 30;
                case 168 -> 200;
                case 169 -> 214;
                case 170 -> 74;
                case 171 -> 171;
                case 172 -> 250;
                case 173 -> 9;
                case 174 -> 196;
                case 175 -> 35;
                case 176 -> 61;
                case 177 -> 243;
                case 178 -> 136;
                case 179 -> 87;
                case 180 -> 152;
                case 181 -> 215;
                case 182 -> 13;
                case 183 -> 71;
                case 184 -> 241;
                case 185 -> 228;
                case 186 -> 140;
                case 187 -> 252;
                case 188 -> 192;
                case 189 -> 11;
                case 190 -> 189;
                case 191 -> 26;
                case 192 -> 89;
                case 193 -> 127;
                case 194 -> 173;
                case 195 -> 188;
                case 196 -> 208;
                case 197 -> 158;
                case 198 -> 14;
                case 199 -> 229;
                case 200 -> 156;
                case 201 -> 178;
                case 202 -> 99;
                case 203 -> 122;
                case 204 -> 50;
                case 205 -> 222;
                case 206 -> 77;
                case 207 -> 33;
                case 208 -> 57;
                case 209 -> 38;
                case 210 -> 154;
                case 211 -> 28;
                case 212 -> 68;
                case 213 -> 7;
                case 214 -> 19;
                case 215 -> 151;
                case 216 -> 2;
                case 217 -> 67;
                case 218 -> 155;
                case 219 -> 39;
                case 220 -> 247;
                case 221 -> 10;
                case 222 -> 51;
                case 223 -> 86;
                case 224 -> 246;
                case 225 -> 145;
                case 226 -> 20;
                case 227 -> 21;
                case 228 -> 91;
                case 229 -> 94;
                case 230 -> 137;
                case 231 -> 132;
                case 232 -> 160;
                case 233 -> 117;
                case 234 -> 98;
                case 235 -> 146;
                case 236 -> 85;
                case 237 -> 238;
                case 238 -> 63;
                case 239 -> 17;
                case 240 -> 150;
                case 241 -> 134;
                case 242 -> 254;
                case 243 -> 249;
                case 244 -> 105;
                case 245 -> 164;
                case 246 -> 65;
                case 247 -> 181;
                case 248 -> 244;
                case 249 -> 62;
                case 250 -> 201;
                case 251 -> 29;
                case 252 -> 147;
                case 253 -> 79;
                case 254 -> 161;
                default -> 128;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.lllIlIIlIllIIIIIlIIlIlIIIIIlIIlIIIlllllIIllIlIlIIIllIIlIIlIlIlIlIlllIIIIllIlIlIIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
