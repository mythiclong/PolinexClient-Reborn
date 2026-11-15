// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var3 = p0.beginStructure(var2);
       IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.a(p1, var3, var2);
       var3.endStructure(var2);
    }
    public IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var2 = 1;
       int var3 = 0;
       java.util.List var4 = null;
       java.util.List var5 = null;
       java.util.List var6 = null;
       kotlinx.serialization.encoding.CompositeDecoder var7 = p0.beginStructure(var1);
       kotlin.Lazy[] var8 = IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.m();
       if (var7.decodeSequentially()) {
          var4 = (java.util.List)var7.decodeSerializableElement(
             var1, 0, (kotlinx.serialization.DeserializationStrategy)var8[0].getValue(), var4);
          var3 |= 1;
          var5 = (java.util.List)var7.decodeSerializableElement(
             var1, 1, (kotlinx.serialization.DeserializationStrategy)var8[1].getValue(), var5);
          var3 |= 2;
          var6 = (java.util.List)var7.decodeSerializableElement(
             var1, 2, (kotlinx.serialization.DeserializationStrategy)var8[2].getValue(), var6);
          var3 |= 4;
       } else {
          while (var2 != 0) {
             int var9 = var7.decodeElementIndex(var1);
             if (var9 == -1) {
                var2 = 0;
             } else if (var9 == 0) {
                var4 = (java.util.List)var7.decodeSerializableElement(
                   var1, 0, (kotlinx.serialization.DeserializationStrategy)var8[0].getValue(), var4);
                var3 |= 1;
             } else if (var9 == 1) {
                var5 = (java.util.List)var7.decodeSerializableElement(
                   var1, 1, (kotlinx.serialization.DeserializationStrategy)var8[1].getValue(), var5);
                var3 |= 2;
             } else if (var9 == 2) {
                var6 = (java.util.List)var7.decodeSerializableElement(
                   var1, 2, (kotlinx.serialization.DeserializationStrategy)var8[2].getValue(), var6);
                var3 |= 4;
             } else {
                throw new kotlinx.serialization.UnknownFieldException(var9);
             }
          }
       }
       var7.endStructure(var1);
       return new IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI(var3, var4, var5, var6, null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
       kotlin.Lazy[] var1 = IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI.m();
       java.lang.Object[] var2 = new kotlinx.serialization.KSerializer[3];
       var2[0] = var1[0].getValue();
       var2[1] = var1[1].getValue();
       var2[2] = var1[2].getValue();
       return (kotlinx.serialization.KSerializer[]) var2;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {{
       return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }}
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFFB13F) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 67;
                case 1 -> 0;
                case 2 -> 187;
                case 3 -> 170;
                case 4 -> 255;
                case 5 -> 188;
                case 6 -> 214;
                case 7 -> 26;
                case 8 -> 55;
                case 9 -> 219;
                case 10 -> 233;
                case 11 -> 95;
                case 12 -> 239;
                case 13 -> 22;
                case 14 -> 106;
                case 15 -> 45;
                case 16 -> 97;
                case 17 -> 69;
                case 18 -> 146;
                case 19 -> 11;
                case 20 -> 89;
                case 21 -> 185;
                case 22 -> 14;
                case 23 -> 252;
                case 24 -> 226;
                case 25 -> 21;
                case 26 -> 190;
                case 27 -> 20;
                case 28 -> 87;
                case 29 -> 40;
                case 30 -> 182;
                case 31 -> 175;
                case 32 -> 149;
                case 33 -> 225;
                case 34 -> 108;
                case 35 -> 209;
                case 36 -> 200;
                case 37 -> 135;
                case 38 -> 61;
                case 39 -> 33;
                case 40 -> 164;
                case 41 -> 2;
                case 42 -> 91;
                case 43 -> 77;
                case 44 -> 150;
                case 45 -> 63;
                case 46 -> 139;
                case 47 -> 35;
                case 48 -> 154;
                case 49 -> 28;
                case 50 -> 113;
                case 51 -> 12;
                case 52 -> 173;
                case 53 -> 25;
                case 54 -> 238;
                case 55 -> 115;
                case 56 -> 179;
                case 57 -> 57;
                case 58 -> 13;
                case 59 -> 117;
                case 60 -> 204;
                case 61 -> 4;
                case 62 -> 235;
                case 63 -> 205;
                case 64 -> 59;
                case 65 -> 199;
                case 66 -> 234;
                case 67 -> 42;
                case 68 -> 228;
                case 69 -> 140;
                case 70 -> 68;
                case 71 -> 251;
                case 72 -> 114;
                case 73 -> 148;
                case 74 -> 17;
                case 75 -> 232;
                case 76 -> 83;
                case 77 -> 168;
                case 78 -> 41;
                case 79 -> 43;
                case 80 -> 217;
                case 81 -> 222;
                case 82 -> 241;
                case 83 -> 133;
                case 84 -> 129;
                case 85 -> 157;
                case 86 -> 125;
                case 87 -> 123;
                case 88 -> 245;
                case 89 -> 155;
                case 90 -> 236;
                case 91 -> 112;
                case 92 -> 66;
                case 93 -> 36;
                case 94 -> 64;
                case 95 -> 80;
                case 96 -> 213;
                case 97 -> 70;
                case 98 -> 253;
                case 99 -> 79;
                case 100 -> 51;
                case 101 -> 172;
                case 102 -> 121;
                case 103 -> 249;
                case 104 -> 107;
                case 105 -> 230;
                case 106 -> 208;
                case 107 -> 99;
                case 108 -> 141;
                case 109 -> 197;
                case 110 -> 134;
                case 111 -> 246;
                case 112 -> 151;
                case 113 -> 167;
                case 114 -> 39;
                case 115 -> 3;
                case 116 -> 90;
                case 117 -> 177;
                case 118 -> 48;
                case 119 -> 98;
                case 120 -> 178;
                case 121 -> 218;
                case 122 -> 15;
                case 123 -> 81;
                case 124 -> 116;
                case 125 -> 240;
                case 126 -> 201;
                case 127 -> 247;
                case 128 -> 104;
                case 129 -> 101;
                case 130 -> 192;
                case 131 -> 248;
                case 132 -> 224;
                case 133 -> 195;
                case 134 -> 102;
                case 135 -> 254;
                case 136 -> 1;
                case 137 -> 183;
                case 138 -> 145;
                case 139 -> 5;
                case 140 -> 6;
                case 141 -> 215;
                case 142 -> 174;
                case 143 -> 220;
                case 144 -> 78;
                case 145 -> 120;
                case 146 -> 166;
                case 147 -> 212;
                case 148 -> 7;
                case 149 -> 88;
                case 150 -> 147;
                case 151 -> 16;
                case 152 -> 109;
                case 153 -> 27;
                case 154 -> 128;
                case 155 -> 191;
                case 156 -> 38;
                case 157 -> 131;
                case 158 -> 171;
                case 159 -> 206;
                case 160 -> 160;
                case 161 -> 103;
                case 162 -> 93;
                case 163 -> 49;
                case 164 -> 196;
                case 165 -> 198;
                case 166 -> 137;
                case 167 -> 250;
                case 168 -> 159;
                case 169 -> 29;
                case 170 -> 193;
                case 171 -> 30;
                case 172 -> 237;
                case 173 -> 46;
                case 174 -> 223;
                case 175 -> 161;
                case 176 -> 202;
                case 177 -> 162;
                case 178 -> 118;
                case 179 -> 181;
                case 180 -> 207;
                case 181 -> 152;
                case 182 -> 111;
                case 183 -> 189;
                case 184 -> 126;
                case 185 -> 86;
                case 186 -> 84;
                case 187 -> 176;
                case 188 -> 100;
                case 189 -> 231;
                case 190 -> 194;
                case 191 -> 119;
                case 192 -> 105;
                case 193 -> 96;
                case 194 -> 24;
                case 195 -> 31;
                case 196 -> 8;
                case 197 -> 227;
                case 198 -> 130;
                case 199 -> 138;
                case 200 -> 156;
                case 201 -> 58;
                case 202 -> 221;
                case 203 -> 216;
                case 204 -> 56;
                case 205 -> 60;
                case 206 -> 210;
                case 207 -> 132;
                case 208 -> 85;
                case 209 -> 54;
                case 210 -> 65;
                case 211 -> 9;
                case 212 -> 74;
                case 213 -> 44;
                case 214 -> 23;
                case 215 -> 153;
                case 216 -> 165;
                case 217 -> 32;
                case 218 -> 47;
                case 219 -> 143;
                case 220 -> 94;
                case 221 -> 18;
                case 222 -> 122;
                case 223 -> 169;
                case 224 -> 53;
                case 225 -> 243;
                case 226 -> 203;
                case 227 -> 142;
                case 228 -> 110;
                case 229 -> 52;
                case 230 -> 37;
                case 231 -> 244;
                case 232 -> 19;
                case 233 -> 180;
                case 234 -> 73;
                case 235 -> 62;
                case 236 -> 72;
                case 237 -> 50;
                case 238 -> 71;
                case 239 -> 75;
                case 240 -> 76;
                case 241 -> 242;
                case 242 -> 229;
                case 243 -> 163;
                case 244 -> 10;
                case 245 -> 184;
                case 246 -> 158;
                case 247 -> 186;
                case 248 -> 82;
                case 249 -> 136;
                case 250 -> 92;
                case 251 -> 127;
                case 252 -> 34;
                case 253 -> 124;
                case 254 -> 211;
                default -> 144;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.IlIIlllllllIlIIlIlIlIlIIIllIllIIIIllllIIlIIIIIlIlIIIIIllIlIlllIIllIIIlIIlllIlIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
