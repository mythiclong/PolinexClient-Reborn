// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 10).
// jar class: me.octo.client.utils.lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client.utils;

public final class lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends java.nio.file.SimpleFileVisitor {
    private static java.lang.String[] a;
    private static java.lang.String[] b;
     lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public java.nio.file.FileVisitResult a(java.nio.file.Path file, java.nio.file.attribute.BasicFileAttributes attrs) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrs, "attrs");
       try {
          java.nio.file.Files.delete(file);
       } catch (java.io.IOException var2) {
          throw new java.lang.RuntimeException(var2);
       }
       return java.nio.file.FileVisitResult.CONTINUE;
    }
    public java.nio.file.FileVisitResult a(java.nio.file.Path dir, java.io.IOException exc) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dir, "dir");
       try {
          java.nio.file.Files.delete(dir);
       } catch (java.io.IOException var2) {
          throw new java.lang.RuntimeException(var2);
       }
       return java.nio.file.FileVisitResult.CONTINUE;
    }
    public java.nio.file.FileVisitResult visitFile(java.lang.Object file, java.nio.file.attribute.BasicFileAttributes attrs) {
       return this.a((java.nio.file.Path)file, attrs);
    }
    public java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object dir, java.io.IOException exc) {
       return this.a((java.nio.file.Path)dir, exc);
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFE411) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 193;
                case 1 -> 157;
                case 2 -> 59;
                case 3 -> 92;
                case 4 -> 155;
                case 5 -> 218;
                case 6 -> 45;
                case 7 -> 173;
                case 8 -> 170;
                case 9 -> 122;
                case 10 -> 58;
                case 11 -> 233;
                case 12 -> 17;
                case 13 -> 30;
                case 14 -> 60;
                case 15 -> 23;
                case 16 -> 57;
                case 17 -> 205;
                case 18 -> 191;
                case 19 -> 87;
                case 20 -> 112;
                case 21 -> 0;
                case 22 -> 231;
                case 23 -> 76;
                case 24 -> 156;
                case 25 -> 70;
                case 26 -> 27;
                case 27 -> 79;
                case 28 -> 135;
                case 29 -> 185;
                case 30 -> 12;
                case 31 -> 224;
                case 32 -> 129;
                case 33 -> 106;
                case 34 -> 145;
                case 35 -> 211;
                case 36 -> 3;
                case 37 -> 53;
                case 38 -> 4;
                case 39 -> 199;
                case 40 -> 232;
                case 41 -> 88;
                case 42 -> 81;
                case 43 -> 94;
                case 44 -> 65;
                case 45 -> 119;
                case 46 -> 51;
                case 47 -> 209;
                case 48 -> 196;
                case 49 -> 221;
                case 50 -> 225;
                case 51 -> 181;
                case 52 -> 72;
                case 53 -> 1;
                case 54 -> 134;
                case 55 -> 120;
                case 56 -> 237;
                case 57 -> 137;
                case 58 -> 7;
                case 59 -> 38;
                case 60 -> 230;
                case 61 -> 244;
                case 62 -> 123;
                case 63 -> 238;
                case 64 -> 67;
                case 65 -> 10;
                case 66 -> 56;
                case 67 -> 124;
                case 68 -> 250;
                case 69 -> 210;
                case 70 -> 200;
                case 71 -> 66;
                case 72 -> 131;
                case 73 -> 127;
                case 74 -> 78;
                case 75 -> 174;
                case 76 -> 29;
                case 77 -> 43;
                case 78 -> 47;
                case 79 -> 247;
                case 80 -> 254;
                case 81 -> 90;
                case 82 -> 130;
                case 83 -> 198;
                case 84 -> 102;
                case 85 -> 73;
                case 86 -> 187;
                case 87 -> 144;
                case 88 -> 36;
                case 89 -> 104;
                case 90 -> 216;
                case 91 -> 153;
                case 92 -> 83;
                case 93 -> 84;
                case 94 -> 9;
                case 95 -> 255;
                case 96 -> 215;
                case 97 -> 162;
                case 98 -> 68;
                case 99 -> 89;
                case 100 -> 138;
                case 101 -> 148;
                case 102 -> 34;
                case 103 -> 77;
                case 104 -> 11;
                case 105 -> 197;
                case 106 -> 235;
                case 107 -> 246;
                case 108 -> 33;
                case 109 -> 175;
                case 110 -> 8;
                case 111 -> 13;
                case 112 -> 96;
                case 113 -> 166;
                case 114 -> 190;
                case 115 -> 108;
                case 116 -> 103;
                case 117 -> 160;
                case 118 -> 74;
                case 119 -> 75;
                case 120 -> 16;
                case 121 -> 82;
                case 122 -> 22;
                case 123 -> 183;
                case 124 -> 169;
                case 125 -> 116;
                case 126 -> 182;
                case 127 -> 86;
                case 128 -> 154;
                case 129 -> 178;
                case 130 -> 217;
                case 131 -> 222;
                case 132 -> 248;
                case 133 -> 252;
                case 134 -> 213;
                case 135 -> 14;
                case 136 -> 128;
                case 137 -> 54;
                case 138 -> 204;
                case 139 -> 161;
                case 140 -> 91;
                case 141 -> 85;
                case 142 -> 228;
                case 143 -> 121;
                case 144 -> 226;
                case 145 -> 140;
                case 146 -> 150;
                case 147 -> 37;
                case 148 -> 101;
                case 149 -> 24;
                case 150 -> 212;
                case 151 -> 132;
                case 152 -> 55;
                case 153 -> 118;
                case 154 -> 253;
                case 155 -> 62;
                case 156 -> 159;
                case 157 -> 146;
                case 158 -> 99;
                case 159 -> 80;
                case 160 -> 234;
                case 161 -> 167;
                case 162 -> 114;
                case 163 -> 71;
                case 164 -> 46;
                case 165 -> 143;
                case 166 -> 227;
                case 167 -> 229;
                case 168 -> 168;
                case 169 -> 192;
                case 170 -> 180;
                case 171 -> 201;
                case 172 -> 184;
                case 173 -> 241;
                case 174 -> 125;
                case 175 -> 49;
                case 176 -> 15;
                case 177 -> 220;
                case 178 -> 240;
                case 179 -> 203;
                case 180 -> 63;
                case 181 -> 117;
                case 182 -> 202;
                case 183 -> 133;
                case 184 -> 107;
                case 185 -> 97;
                case 186 -> 152;
                case 187 -> 141;
                case 188 -> 177;
                case 189 -> 115;
                case 190 -> 147;
                case 191 -> 18;
                case 192 -> 109;
                case 193 -> 20;
                case 194 -> 142;
                case 195 -> 188;
                case 196 -> 52;
                case 197 -> 243;
                case 198 -> 236;
                case 199 -> 214;
                case 200 -> 194;
                case 201 -> 39;
                case 202 -> 136;
                case 203 -> 21;
                case 204 -> 111;
                case 205 -> 93;
                case 206 -> 245;
                case 207 -> 61;
                case 208 -> 172;
                case 209 -> 207;
                case 210 -> 165;
                case 211 -> 31;
                case 212 -> 239;
                case 213 -> 32;
                case 214 -> 44;
                case 215 -> 28;
                case 216 -> 126;
                case 217 -> 179;
                case 218 -> 2;
                case 219 -> 110;
                case 220 -> 206;
                case 221 -> 64;
                case 222 -> 186;
                case 223 -> 164;
                case 224 -> 100;
                case 225 -> 6;
                case 226 -> 249;
                case 227 -> 189;
                case 228 -> 219;
                case 229 -> 48;
                case 230 -> 208;
                case 231 -> 171;
                case 232 -> 25;
                case 233 -> 69;
                case 234 -> 195;
                case 235 -> 5;
                case 236 -> 223;
                case 237 -> 242;
                case 238 -> 98;
                case 239 -> 251;
                case 240 -> 50;
                case 241 -> 149;
                case 242 -> 113;
                case 243 -> 19;
                case 244 -> 35;
                case 245 -> 105;
                case 246 -> 95;
                case 247 -> 42;
                case 248 -> 26;
                case 249 -> 158;
                case 250 -> 163;
                case 251 -> 41;
                case 252 -> 151;
                case 253 -> 176;
                case 254 -> 40;
                default -> 139;
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
