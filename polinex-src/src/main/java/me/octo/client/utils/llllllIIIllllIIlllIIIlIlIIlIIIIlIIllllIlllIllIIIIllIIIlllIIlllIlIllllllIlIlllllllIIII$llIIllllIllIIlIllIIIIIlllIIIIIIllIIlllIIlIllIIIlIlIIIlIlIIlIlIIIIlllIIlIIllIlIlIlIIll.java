// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 10).
// jar class: me.octo.client.utils.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client.utils;

public final class llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends com.google.gson.TypeAdapter {
    private static java.lang.String[] a;
    private static java.lang.String[] b;
     llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
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
        int n3 = (n ^ 0xFFFF90B2) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 79;
                case 1 -> 212;
                case 2 -> 47;
                case 3 -> 92;
                case 4 -> 71;
                case 5 -> 176;
                case 6 -> 133;
                case 7 -> 173;
                case 8 -> 35;
                case 9 -> 252;
                case 10 -> 220;
                case 11 -> 253;
                case 12 -> 170;
                case 13 -> 208;
                case 14 -> 22;
                case 15 -> 236;
                case 16 -> 223;
                case 17 -> 126;
                case 18 -> 132;
                case 19 -> 54;
                case 20 -> 243;
                case 21 -> 163;
                case 22 -> 33;
                case 23 -> 74;
                case 24 -> 88;
                case 25 -> 100;
                case 26 -> 51;
                case 27 -> 192;
                case 28 -> 191;
                case 29 -> 50;
                case 30 -> 210;
                case 31 -> 26;
                case 32 -> 144;
                case 33 -> 206;
                case 34 -> 211;
                case 35 -> 109;
                case 36 -> 181;
                case 37 -> 217;
                case 38 -> 246;
                case 39 -> 239;
                case 40 -> 194;
                case 41 -> 219;
                case 42 -> 171;
                case 43 -> 105;
                case 44 -> 148;
                case 45 -> 238;
                case 46 -> 198;
                case 47 -> 8;
                case 48 -> 1;
                case 49 -> 118;
                case 50 -> 154;
                case 51 -> 99;
                case 52 -> 147;
                case 53 -> 117;
                case 54 -> 186;
                case 55 -> 199;
                case 56 -> 245;
                case 57 -> 232;
                case 58 -> 161;
                case 59 -> 69;
                case 60 -> 45;
                case 61 -> 75;
                case 62 -> 94;
                case 63 -> 63;
                case 64 -> 43;
                case 65 -> 153;
                case 66 -> 207;
                case 67 -> 251;
                case 68 -> 167;
                case 69 -> 39;
                case 70 -> 242;
                case 71 -> 189;
                case 72 -> 248;
                case 73 -> 149;
                case 74 -> 67;
                case 75 -> 150;
                case 76 -> 68;
                case 77 -> 19;
                case 78 -> 37;
                case 79 -> 138;
                case 80 -> 98;
                case 81 -> 119;
                case 82 -> 85;
                case 83 -> 102;
                case 84 -> 165;
                case 85 -> 11;
                case 86 -> 62;
                case 87 -> 80;
                case 88 -> 44;
                case 89 -> 73;
                case 90 -> 38;
                case 91 -> 46;
                case 92 -> 10;
                case 93 -> 77;
                case 94 -> 30;
                case 95 -> 188;
                case 96 -> 218;
                case 97 -> 56;
                case 98 -> 234;
                case 99 -> 197;
                case 100 -> 168;
                case 101 -> 34;
                case 102 -> 84;
                case 103 -> 180;
                case 104 -> 250;
                case 105 -> 229;
                case 106 -> 226;
                case 107 -> 141;
                case 108 -> 78;
                case 109 -> 172;
                case 110 -> 42;
                case 111 -> 108;
                case 112 -> 58;
                case 113 -> 17;
                case 114 -> 157;
                case 115 -> 49;
                case 116 -> 160;
                case 117 -> 70;
                case 118 -> 221;
                case 119 -> 255;
                case 120 -> 201;
                case 121 -> 179;
                case 122 -> 155;
                case 123 -> 66;
                case 124 -> 166;
                case 125 -> 240;
                case 126 -> 29;
                case 127 -> 6;
                case 128 -> 193;
                case 129 -> 225;
                case 130 -> 202;
                case 131 -> 184;
                case 132 -> 187;
                case 133 -> 125;
                case 134 -> 124;
                case 135 -> 57;
                case 136 -> 244;
                case 137 -> 146;
                case 138 -> 15;
                case 139 -> 129;
                case 140 -> 93;
                case 141 -> 81;
                case 142 -> 0;
                case 143 -> 97;
                case 144 -> 121;
                case 145 -> 214;
                case 146 -> 182;
                case 147 -> 143;
                case 148 -> 237;
                case 149 -> 27;
                case 150 -> 16;
                case 151 -> 20;
                case 152 -> 134;
                case 153 -> 183;
                case 154 -> 224;
                case 155 -> 112;
                case 156 -> 87;
                case 157 -> 174;
                case 158 -> 72;
                case 159 -> 113;
                case 160 -> 40;
                case 161 -> 205;
                case 162 -> 24;
                case 163 -> 254;
                case 164 -> 101;
                case 165 -> 200;
                case 166 -> 131;
                case 167 -> 41;
                case 168 -> 137;
                case 169 -> 5;
                case 170 -> 209;
                case 171 -> 106;
                case 172 -> 231;
                case 173 -> 4;
                case 174 -> 115;
                case 175 -> 83;
                case 176 -> 89;
                case 177 -> 13;
                case 178 -> 135;
                case 179 -> 142;
                case 180 -> 9;
                case 181 -> 233;
                case 182 -> 53;
                case 183 -> 204;
                case 184 -> 91;
                case 185 -> 122;
                case 186 -> 249;
                case 187 -> 195;
                case 188 -> 230;
                case 189 -> 55;
                case 190 -> 190;
                case 191 -> 36;
                case 192 -> 95;
                case 193 -> 175;
                case 194 -> 158;
                case 195 -> 127;
                case 196 -> 222;
                case 197 -> 59;
                case 198 -> 104;
                case 199 -> 12;
                case 200 -> 111;
                case 201 -> 162;
                case 202 -> 25;
                case 203 -> 247;
                case 204 -> 120;
                case 205 -> 139;
                case 206 -> 96;
                case 207 -> 159;
                case 208 -> 178;
                case 209 -> 228;
                case 210 -> 21;
                case 211 -> 32;
                case 212 -> 3;
                case 213 -> 65;
                case 214 -> 2;
                case 215 -> 107;
                case 216 -> 48;
                case 217 -> 235;
                case 218 -> 123;
                case 219 -> 18;
                case 220 -> 114;
                case 221 -> 14;
                case 222 -> 241;
                case 223 -> 116;
                case 224 -> 196;
                case 225 -> 60;
                case 226 -> 156;
                case 227 -> 52;
                case 228 -> 86;
                case 229 -> 7;
                case 230 -> 64;
                case 231 -> 169;
                case 232 -> 140;
                case 233 -> 145;
                case 234 -> 164;
                case 235 -> 203;
                case 236 -> 28;
                case 237 -> 215;
                case 238 -> 177;
                case 239 -> 216;
                case 240 -> 61;
                case 241 -> 185;
                case 242 -> 110;
                case 243 -> 130;
                case 244 -> 76;
                case 245 -> 151;
                case 246 -> 152;
                case 247 -> 23;
                case 248 -> 103;
                case 249 -> 31;
                case 250 -> 213;
                case 251 -> 227;
                case 252 -> 82;
                case 253 -> 136;
                case 254 -> 90;
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
        a = null;
        b = null;
    }
}
