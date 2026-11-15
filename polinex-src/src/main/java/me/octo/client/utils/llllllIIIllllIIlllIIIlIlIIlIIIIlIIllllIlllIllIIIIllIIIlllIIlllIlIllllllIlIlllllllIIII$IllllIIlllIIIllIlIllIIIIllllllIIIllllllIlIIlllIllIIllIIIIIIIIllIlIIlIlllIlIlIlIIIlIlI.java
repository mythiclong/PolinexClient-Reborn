// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 10).
// jar class: me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
package me.octo.client.utils;

public final class llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends com.google.gson.TypeAdapter {
    private static java.lang.String[] a;
    private static java.lang.String[] b;
     llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
        super();
    }
    public void a(com.google.gson.stream.JsonWriter p0, java.time.Instant p1) throws java.io.IOException {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "out");
       if (p1 == null) {
          p0.nullValue();
       } else {
          p0.value(p1.toString());
       }
    }
    public java.time.Instant a(com.google.gson.stream.JsonReader reader) throws java.io.IOException {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "reader");
       java.time.Instant var2 = java.time.Instant.parse(reader.nextString());
       kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(var2, "parse(...)");
       return var2;
    }
    public void write(com.google.gson.stream.JsonWriter out, java.lang.Object value) throws java.io.IOException {
       this.a(out, (java.time.Instant)value);
    }
    public java.lang.Object read(com.google.gson.stream.JsonReader in) throws java.io.IOException {
       return this.a(in);
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0x1A08) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 95;
                case 1 -> 82;
                case 2 -> 153;
                case 3 -> 129;
                case 4 -> 234;
                case 5 -> 43;
                case 6 -> 163;
                case 7 -> 199;
                case 8 -> 127;
                case 9 -> 42;
                case 10 -> 244;
                case 11 -> 76;
                case 12 -> 224;
                case 13 -> 247;
                case 14 -> 84;
                case 15 -> 145;
                case 16 -> 112;
                case 17 -> 14;
                case 18 -> 34;
                case 19 -> 140;
                case 20 -> 190;
                case 21 -> 24;
                case 22 -> 121;
                case 23 -> 202;
                case 24 -> 253;
                case 25 -> 222;
                case 26 -> 132;
                case 27 -> 239;
                case 28 -> 73;
                case 29 -> 99;
                case 30 -> 124;
                case 31 -> 207;
                case 32 -> 221;
                case 33 -> 189;
                case 34 -> 77;
                case 35 -> 22;
                case 36 -> 193;
                case 37 -> 37;
                case 38 -> 187;
                case 39 -> 235;
                case 40 -> 214;
                case 41 -> 49;
                case 42 -> 12;
                case 43 -> 119;
                case 44 -> 142;
                case 45 -> 15;
                case 46 -> 4;
                case 47 -> 61;
                case 48 -> 108;
                case 49 -> 78;
                case 50 -> 62;
                case 51 -> 102;
                case 52 -> 66;
                case 53 -> 176;
                case 54 -> 139;
                case 55 -> 144;
                case 56 -> 80;
                case 57 -> 250;
                case 58 -> 213;
                case 59 -> 143;
                case 60 -> 123;
                case 61 -> 133;
                case 62 -> 97;
                case 63 -> 58;
                case 64 -> 13;
                case 65 -> 28;
                case 66 -> 65;
                case 67 -> 220;
                case 68 -> 72;
                case 69 -> 126;
                case 70 -> 45;
                case 71 -> 10;
                case 72 -> 228;
                case 73 -> 241;
                case 74 -> 109;
                case 75 -> 236;
                case 76 -> 209;
                case 77 -> 135;
                case 78 -> 105;
                case 79 -> 25;
                case 80 -> 71;
                case 81 -> 50;
                case 82 -> 201;
                case 83 -> 198;
                case 84 -> 216;
                case 85 -> 138;
                case 86 -> 227;
                case 87 -> 183;
                case 88 -> 159;
                case 89 -> 64;
                case 90 -> 122;
                case 91 -> 20;
                case 92 -> 44;
                case 93 -> 197;
                case 94 -> 136;
                case 95 -> 246;
                case 96 -> 115;
                case 97 -> 69;
                case 98 -> 252;
                case 99 -> 180;
                case 100 -> 237;
                case 101 -> 248;
                case 102 -> 83;
                case 103 -> 196;
                case 104 -> 39;
                case 105 -> 219;
                case 106 -> 40;
                case 107 -> 35;
                case 108 -> 9;
                case 109 -> 67;
                case 110 -> 188;
                case 111 -> 179;
                case 112 -> 151;
                case 113 -> 158;
                case 114 -> 32;
                case 115 -> 242;
                case 116 -> 54;
                case 117 -> 27;
                case 118 -> 150;
                case 119 -> 92;
                case 120 -> 68;
                case 121 -> 117;
                case 122 -> 182;
                case 123 -> 174;
                case 124 -> 195;
                case 125 -> 85;
                case 126 -> 134;
                case 127 -> 17;
                case 128 -> 212;
                case 129 -> 110;
                case 130 -> 111;
                case 131 -> 120;
                case 132 -> 3;
                case 133 -> 249;
                case 134 -> 107;
                case 135 -> 156;
                case 136 -> 141;
                case 137 -> 172;
                case 138 -> 55;
                case 139 -> 205;
                case 140 -> 130;
                case 141 -> 238;
                case 142 -> 6;
                case 143 -> 94;
                case 144 -> 215;
                case 145 -> 200;
                case 146 -> 240;
                case 147 -> 225;
                case 148 -> 19;
                case 149 -> 223;
                case 150 -> 23;
                case 151 -> 255;
                case 152 -> 41;
                case 153 -> 217;
                case 154 -> 46;
                case 155 -> 165;
                case 156 -> 245;
                case 157 -> 81;
                case 158 -> 114;
                case 159 -> 26;
                case 160 -> 103;
                case 161 -> 168;
                case 162 -> 29;
                case 163 -> 149;
                case 164 -> 52;
                case 165 -> 181;
                case 166 -> 30;
                case 167 -> 33;
                case 168 -> 178;
                case 169 -> 18;
                case 170 -> 131;
                case 171 -> 16;
                case 172 -> 210;
                case 173 -> 2;
                case 174 -> 137;
                case 175 -> 157;
                case 176 -> 11;
                case 177 -> 31;
                case 178 -> 231;
                case 179 -> 233;
                case 180 -> 59;
                case 181 -> 208;
                case 182 -> 98;
                case 183 -> 155;
                case 184 -> 38;
                case 185 -> 148;
                case 186 -> 53;
                case 187 -> 113;
                case 188 -> 70;
                case 189 -> 166;
                case 190 -> 147;
                case 191 -> 186;
                case 192 -> 152;
                case 193 -> 87;
                case 194 -> 173;
                case 195 -> 21;
                case 196 -> 218;
                case 197 -> 171;
                case 198 -> 164;
                case 199 -> 7;
                case 200 -> 74;
                case 201 -> 0;
                case 202 -> 91;
                case 203 -> 226;
                case 204 -> 48;
                case 205 -> 100;
                case 206 -> 162;
                case 207 -> 60;
                case 208 -> 160;
                case 209 -> 154;
                case 210 -> 194;
                case 211 -> 232;
                case 212 -> 1;
                case 213 -> 191;
                case 214 -> 5;
                case 215 -> 79;
                case 216 -> 230;
                case 217 -> 118;
                case 218 -> 101;
                case 219 -> 229;
                case 220 -> 251;
                case 221 -> 185;
                case 222 -> 243;
                case 223 -> 206;
                case 224 -> 88;
                case 225 -> 184;
                case 226 -> 90;
                case 227 -> 128;
                case 228 -> 93;
                case 229 -> 96;
                case 230 -> 170;
                case 231 -> 63;
                case 232 -> 167;
                case 233 -> 116;
                case 234 -> 203;
                case 235 -> 47;
                case 236 -> 106;
                case 237 -> 125;
                case 238 -> 75;
                case 239 -> 254;
                case 240 -> 161;
                case 241 -> 56;
                case 242 -> 36;
                case 243 -> 89;
                case 244 -> 192;
                case 245 -> 57;
                case 246 -> 169;
                case 247 -> 51;
                case 248 -> 211;
                case 249 -> 104;
                case 250 -> 86;
                case 251 -> 175;
                case 252 -> 177;
                case 253 -> 146;
                case 254 -> 204;
                default -> 8;
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
        a = null;
        b = null;
    }
}
