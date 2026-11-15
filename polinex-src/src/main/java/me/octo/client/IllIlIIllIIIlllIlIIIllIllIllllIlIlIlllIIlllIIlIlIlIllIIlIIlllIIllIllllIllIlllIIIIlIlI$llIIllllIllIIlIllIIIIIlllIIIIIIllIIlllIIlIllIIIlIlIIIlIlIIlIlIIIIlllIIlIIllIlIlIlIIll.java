// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var4 = p0.beginStructure(var3);
       me.octo.client.IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI.a(p1, var4, var3);
       var4.endStructure(var3);
    }
    public IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       int var4 = 0;
       int var5 = 0;
       int var6 = 0;
       int var7 = 0;
       int var8 = 0;
       kotlinx.serialization.encoding.CompositeDecoder var9 = p0.beginStructure(var1);
       if (var9.decodeSequentially()) {
          var4 = var9.decodeIntElement(var1, 0);
          var3 |= 1;
          var5 = var9.decodeIntElement(var1, 1);
          var3 |= 2;
          var6 = var9.decodeIntElement(var1, 2);
          var3 |= 4;
          var7 = var9.decodeIntElement(var1, 3);
          var3 |= 8;
          var8 = var9.decodeIntElement(var1, 4);
          var3 |= 16;
       } else {
          while (var2 != 0) {
             int var10 = var9.decodeElementIndex(var1);
             if (var10 == -1) {
                var2 = 0;
             } else if (var10 == 0) {
                var4 = var9.decodeIntElement(var1, 0);
                var3 |= 1;
             } else if (var10 == 1) {
                var5 = var9.decodeIntElement(var1, 1);
                var3 |= 2;
             } else if (var10 == 2) {
                var6 = var9.decodeIntElement(var1, 2);
                var3 |= 4;
             } else if (var10 == 3) {
                var7 = var9.decodeIntElement(var1, 3);
                var3 |= 8;
             } else if (var10 == 4) {
                var8 = var9.decodeIntElement(var1, 4);
                var3 |= 16;
             } else {
                throw new kotlinx.serialization.UnknownFieldException(var10);
             }
          }
       }
       var9.endStructure(var1);
       return new IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI(var3, var4, var5, var6, var7, var8, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
       kotlinx.serialization.KSerializer[] var1 = new kotlinx.serialization.KSerializer[5];
       var1[0] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var1[1] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var1[2] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var1[3] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var1[4] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       return var1;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF89C6) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 243;
                case 1 -> 250;
                case 2 -> 198;
                case 3 -> 178;
                case 4 -> 146;
                case 5 -> 62;
                case 6 -> 133;
                case 7 -> 60;
                case 8 -> 40;
                case 9 -> 116;
                case 10 -> 100;
                case 11 -> 54;
                case 12 -> 121;
                case 13 -> 253;
                case 14 -> 224;
                case 15 -> 71;
                case 16 -> 236;
                case 17 -> 98;
                case 18 -> 225;
                case 19 -> 148;
                case 20 -> 234;
                case 21 -> 174;
                case 22 -> 97;
                case 23 -> 135;
                case 24 -> 212;
                case 25 -> 95;
                case 26 -> 93;
                case 27 -> 144;
                case 28 -> 182;
                case 29 -> 57;
                case 30 -> 245;
                case 31 -> 89;
                case 32 -> 185;
                case 33 -> 104;
                case 34 -> 132;
                case 35 -> 8;
                case 36 -> 165;
                case 37 -> 254;
                case 38 -> 69;
                case 39 -> 216;
                case 40 -> 61;
                case 41 -> 130;
                case 42 -> 231;
                case 43 -> 106;
                case 44 -> 81;
                case 45 -> 91;
                case 46 -> 123;
                case 47 -> 167;
                case 48 -> 77;
                case 49 -> 42;
                case 50 -> 122;
                case 51 -> 226;
                case 52 -> 203;
                case 53 -> 232;
                case 54 -> 82;
                case 55 -> 19;
                case 56 -> 17;
                case 57 -> 128;
                case 58 -> 188;
                case 59 -> 247;
                case 60 -> 200;
                case 61 -> 126;
                case 62 -> 249;
                case 63 -> 190;
                case 64 -> 79;
                case 65 -> 85;
                case 66 -> 46;
                case 67 -> 50;
                case 68 -> 112;
                case 69 -> 168;
                case 70 -> 43;
                case 71 -> 78;
                case 72 -> 73;
                case 73 -> 119;
                case 74 -> 213;
                case 75 -> 191;
                case 76 -> 177;
                case 77 -> 189;
                case 78 -> 159;
                case 79 -> 47;
                case 80 -> 32;
                case 81 -> 147;
                case 82 -> 102;
                case 83 -> 80;
                case 84 -> 66;
                case 85 -> 111;
                case 86 -> 24;
                case 87 -> 251;
                case 88 -> 94;
                case 89 -> 194;
                case 90 -> 155;
                case 91 -> 131;
                case 92 -> 45;
                case 93 -> 70;
                case 94 -> 124;
                case 95 -> 88;
                case 96 -> 34;
                case 97 -> 237;
                case 98 -> 29;
                case 99 -> 217;
                case 100 -> 48;
                case 101 -> 101;
                case 102 -> 210;
                case 103 -> 16;
                case 104 -> 207;
                case 105 -> 134;
                case 106 -> 3;
                case 107 -> 6;
                case 108 -> 129;
                case 109 -> 162;
                case 110 -> 206;
                case 111 -> 99;
                case 112 -> 180;
                case 113 -> 215;
                case 114 -> 76;
                case 115 -> 22;
                case 116 -> 65;
                case 117 -> 171;
                case 118 -> 141;
                case 119 -> 220;
                case 120 -> 170;
                case 121 -> 222;
                case 122 -> 4;
                case 123 -> 59;
                case 124 -> 163;
                case 125 -> 109;
                case 126 -> 64;
                case 127 -> 153;
                case 128 -> 209;
                case 129 -> 175;
                case 130 -> 74;
                case 131 -> 28;
                case 132 -> 23;
                case 133 -> 5;
                case 134 -> 246;
                case 135 -> 186;
                case 136 -> 39;
                case 137 -> 92;
                case 138 -> 107;
                case 139 -> 192;
                case 140 -> 184;
                case 141 -> 228;
                case 142 -> 172;
                case 143 -> 136;
                case 144 -> 179;
                case 145 -> 113;
                case 146 -> 127;
                case 147 -> 244;
                case 148 -> 150;
                case 149 -> 20;
                case 150 -> 195;
                case 151 -> 55;
                case 152 -> 53;
                case 153 -> 87;
                case 154 -> 10;
                case 155 -> 187;
                case 156 -> 233;
                case 157 -> 240;
                case 158 -> 208;
                case 159 -> 152;
                case 160 -> 67;
                case 161 -> 229;
                case 162 -> 68;
                case 163 -> 156;
                case 164 -> 1;
                case 165 -> 248;
                case 166 -> 44;
                case 167 -> 27;
                case 168 -> 223;
                case 169 -> 114;
                case 170 -> 120;
                case 171 -> 176;
                case 172 -> 252;
                case 173 -> 125;
                case 174 -> 173;
                case 175 -> 75;
                case 176 -> 52;
                case 177 -> 90;
                case 178 -> 2;
                case 179 -> 164;
                case 180 -> 158;
                case 181 -> 196;
                case 182 -> 241;
                case 183 -> 31;
                case 184 -> 214;
                case 185 -> 143;
                case 186 -> 33;
                case 187 -> 15;
                case 188 -> 21;
                case 189 -> 49;
                case 190 -> 140;
                case 191 -> 118;
                case 192 -> 84;
                case 193 -> 12;
                case 194 -> 103;
                case 195 -> 117;
                case 196 -> 160;
                case 197 -> 157;
                case 198 -> 205;
                case 199 -> 193;
                case 200 -> 197;
                case 201 -> 105;
                case 202 -> 139;
                case 203 -> 211;
                case 204 -> 11;
                case 205 -> 58;
                case 206 -> 0;
                case 207 -> 181;
                case 208 -> 202;
                case 209 -> 96;
                case 210 -> 26;
                case 211 -> 161;
                case 212 -> 227;
                case 213 -> 239;
                case 214 -> 56;
                case 215 -> 110;
                case 216 -> 169;
                case 217 -> 218;
                case 218 -> 36;
                case 219 -> 142;
                case 220 -> 204;
                case 221 -> 13;
                case 222 -> 238;
                case 223 -> 35;
                case 224 -> 25;
                case 225 -> 9;
                case 226 -> 138;
                case 227 -> 83;
                case 228 -> 151;
                case 229 -> 137;
                case 230 -> 255;
                case 231 -> 51;
                case 232 -> 183;
                case 233 -> 230;
                case 234 -> 235;
                case 235 -> 72;
                case 236 -> 18;
                case 237 -> 166;
                case 238 -> 199;
                case 239 -> 221;
                case 240 -> 86;
                case 241 -> 219;
                case 242 -> 149;
                case 243 -> 30;
                case 244 -> 37;
                case 245 -> 154;
                case 246 -> 63;
                case 247 -> 14;
                case 248 -> 115;
                case 249 -> 145;
                case 250 -> 242;
                case 251 -> 108;
                case 252 -> 7;
                case 253 -> 38;
                case 254 -> 41;
                default -> 201;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.IllIlIIllIIIlllIlIIIllIllIllllIlIlIlllIIlllIIlIlIlIllIIlIIlllIIllIllllIllIlllIIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
