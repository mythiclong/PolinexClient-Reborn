// PX-FIX PhaseA: jar-only nested type restored as SIGNATURE-ONLY STUB (round 12).
// jar class: me.octo.client.IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
package me.octo.client;

public final class IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll implements kotlinx.serialization.internal.GeneratedSerializer {
    public static me.octo.client.IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    private static kotlinx.serialization.descriptors.SerialDescriptor lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;
    private IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        super();
    }
    public final void a(kotlinx.serialization.encoding.Encoder p0, me.octo.client.IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl p1) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "encoder");
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "value");
       kotlinx.serialization.descriptors.SerialDescriptor var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       kotlinx.serialization.encoding.CompositeEncoder var3 = p0.beginStructure(var2);
       IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl.a(p1, var3, var2);
       var3.endStructure(var2);
    }
    public me.octo.client.IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl a(kotlinx.serialization.encoding.Decoder p0) {
       kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "decoder");
       kotlinx.serialization.descriptors.SerialDescriptor var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
       int var6 = 0;
       String var7 = null;
       String var8 = null;
       int var9 = 0;
       Double var10 = null;
       Double var11 = null;
       kotlinx.serialization.encoding.CompositeDecoder var12 = p0.beginStructure(var3);
       while (true) {
          int var5 = var12.decodeElementIndex(var3);
          switch (var5) {
             case 0:
                var7 = var12.decodeStringElement(var3, 0);
                var6 |= 1;
                break;
             case 1:
                var8 = var12.decodeStringElement(var3, 1);
                var6 |= 2;
                break;
             case 2:
                var9 = var12.decodeIntElement(var3, 2);
                var6 |= 4;
                break;
             case 3:
                var10 = var12.decodeDoubleElement(var3, 3);
                var6 |= 8;
                break;
             case 4:
                var11 = var12.decodeDoubleElement(var3, 4);
                var6 |= 16;
                break;
             default:
                throw new kotlinx.serialization.UnknownFieldException(var5);
          }

          if (var5 == -1) {
             break;
          }
       }

       var12.endStructure(var3);
       return new IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl(var6, var7, var8, var9, var10, var11, (kotlinx.serialization.internal.SerializationConstructorMarker) null);
    }
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }
    public kotlinx.serialization.KSerializer[] childSerializers() {
       kotlinx.serialization.KSerializer[] var1 = new kotlinx.serialization.KSerializer[5];
       var1[0] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var1[1] = kotlinx.serialization.internal.StringSerializer.INSTANCE;
       var1[2] = kotlinx.serialization.internal.IntSerializer.INSTANCE;
       var1[3] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) (java.lang.Object) kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
       var1[4] = kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable((kotlinx.serialization.KSerializer) (java.lang.Object) kotlinx.serialization.internal.DoubleSerializer.INSTANCE);
       return var1;
    }
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return kotlinx.serialization.internal.GeneratedSerializer.super.typeParametersSerializers();
    }
    public void serialize(kotlinx.serialization.encoding.Encoder p0, java.lang.Object p1) {
       this.a(p0, (IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl)p1);
    }
    public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder p0) {
       return this.a(p0);
    }
    private static kotlinx.serialization.UnknownFieldException a(kotlinx.serialization.UnknownFieldException p0) {
        return p0;
    }
    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF9E71) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 192;
                case 1 -> 235;
                case 2 -> 53;
                case 3 -> 19;
                case 4 -> 229;
                case 5 -> 18;
                case 6 -> 57;
                case 7 -> 216;
                case 8 -> 201;
                case 9 -> 189;
                case 10 -> 24;
                case 11 -> 85;
                case 12 -> 204;
                case 13 -> 61;
                case 14 -> 163;
                case 15 -> 82;
                case 16 -> 69;
                case 17 -> 161;
                case 18 -> 162;
                case 19 -> 125;
                case 20 -> 68;
                case 21 -> 178;
                case 22 -> 187;
                case 23 -> 208;
                case 24 -> 160;
                case 25 -> 206;
                case 26 -> 98;
                case 27 -> 167;
                case 28 -> 35;
                case 29 -> 23;
                case 30 -> 90;
                case 31 -> 56;
                case 32 -> 156;
                case 33 -> 128;
                case 34 -> 113;
                case 35 -> 195;
                case 36 -> 87;
                case 37 -> 157;
                case 38 -> 199;
                case 39 -> 140;
                case 40 -> 103;
                case 41 -> 81;
                case 42 -> 228;
                case 43 -> 153;
                case 44 -> 148;
                case 45 -> 26;
                case 46 -> 30;
                case 47 -> 39;
                case 48 -> 21;
                case 49 -> 182;
                case 50 -> 155;
                case 51 -> 17;
                case 52 -> 251;
                case 53 -> 13;
                case 54 -> 50;
                case 55 -> 233;
                case 56 -> 75;
                case 57 -> 95;
                case 58 -> 126;
                case 59 -> 146;
                case 60 -> 240;
                case 61 -> 25;
                case 62 -> 66;
                case 63 -> 176;
                case 64 -> 27;
                case 65 -> 247;
                case 66 -> 88;
                case 67 -> 51;
                case 68 -> 76;
                case 69 -> 78;
                case 70 -> 32;
                case 71 -> 234;
                case 72 -> 149;
                case 73 -> 168;
                case 74 -> 185;
                case 75 -> 215;
                case 76 -> 4;
                case 77 -> 96;
                case 78 -> 117;
                case 79 -> 38;
                case 80 -> 123;
                case 81 -> 43;
                case 82 -> 184;
                case 83 -> 122;
                case 84 -> 214;
                case 85 -> 22;
                case 86 -> 230;
                case 87 -> 165;
                case 88 -> 124;
                case 89 -> 1;
                case 90 -> 36;
                case 91 -> 137;
                case 92 -> 2;
                case 93 -> 6;
                case 94 -> 9;
                case 95 -> 211;
                case 96 -> 190;
                case 97 -> 209;
                case 98 -> 16;
                case 99 -> 249;
                case 100 -> 3;
                case 101 -> 202;
                case 102 -> 207;
                case 103 -> 15;
                case 104 -> 114;
                case 105 -> 67;
                case 106 -> 186;
                case 107 -> 173;
                case 108 -> 84;
                case 109 -> 237;
                case 110 -> 120;
                case 111 -> 34;
                case 112 -> 64;
                case 113 -> 246;
                case 114 -> 48;
                case 115 -> 244;
                case 116 -> 29;
                case 117 -> 152;
                case 118 -> 74;
                case 119 -> 111;
                case 120 -> 181;
                case 121 -> 177;
                case 122 -> 97;
                case 123 -> 222;
                case 124 -> 86;
                case 125 -> 219;
                case 126 -> 193;
                case 127 -> 218;
                case 128 -> 191;
                case 129 -> 102;
                case 130 -> 179;
                case 131 -> 248;
                case 132 -> 150;
                case 133 -> 166;
                case 134 -> 243;
                case 135 -> 144;
                case 136 -> 110;
                case 137 -> 224;
                case 138 -> 116;
                case 139 -> 232;
                case 140 -> 100;
                case 141 -> 136;
                case 142 -> 5;
                case 143 -> 231;
                case 144 -> 0;
                case 145 -> 65;
                case 146 -> 239;
                case 147 -> 183;
                case 148 -> 106;
                case 149 -> 8;
                case 150 -> 11;
                case 151 -> 142;
                case 152 -> 145;
                case 153 -> 180;
                case 154 -> 118;
                case 155 -> 79;
                case 156 -> 141;
                case 157 -> 37;
                case 158 -> 55;
                case 159 -> 108;
                case 160 -> 47;
                case 161 -> 93;
                case 162 -> 72;
                case 163 -> 80;
                case 164 -> 129;
                case 165 -> 33;
                case 166 -> 159;
                case 167 -> 132;
                case 168 -> 205;
                case 169 -> 52;
                case 170 -> 223;
                case 171 -> 242;
                case 172 -> 46;
                case 173 -> 225;
                case 174 -> 241;
                case 175 -> 203;
                case 176 -> 40;
                case 177 -> 10;
                case 178 -> 92;
                case 179 -> 45;
                case 180 -> 196;
                case 181 -> 236;
                case 182 -> 99;
                case 183 -> 109;
                case 184 -> 212;
                case 185 -> 91;
                case 186 -> 210;
                case 187 -> 77;
                case 188 -> 175;
                case 189 -> 49;
                case 190 -> 170;
                case 191 -> 131;
                case 192 -> 105;
                case 193 -> 42;
                case 194 -> 60;
                case 195 -> 89;
                case 196 -> 172;
                case 197 -> 197;
                case 198 -> 104;
                case 199 -> 133;
                case 200 -> 227;
                case 201 -> 221;
                case 202 -> 253;
                case 203 -> 101;
                case 204 -> 226;
                case 205 -> 139;
                case 206 -> 134;
                case 207 -> 164;
                case 208 -> 115;
                case 209 -> 121;
                case 210 -> 119;
                case 211 -> 147;
                case 212 -> 59;
                case 213 -> 58;
                case 214 -> 73;
                case 215 -> 194;
                case 216 -> 252;
                case 217 -> 238;
                case 218 -> 143;
                case 219 -> 112;
                case 220 -> 130;
                case 221 -> 28;
                case 222 -> 255;
                case 223 -> 83;
                case 224 -> 250;
                case 225 -> 31;
                case 226 -> 127;
                case 227 -> 94;
                case 228 -> 254;
                case 229 -> 70;
                case 230 -> 20;
                case 231 -> 213;
                case 232 -> 220;
                case 233 -> 7;
                case 234 -> 217;
                case 235 -> 44;
                case 236 -> 245;
                case 237 -> 174;
                case 238 -> 138;
                case 239 -> 188;
                case 240 -> 62;
                case 241 -> 151;
                case 242 -> 71;
                case 243 -> 169;
                case 244 -> 171;
                case 245 -> 14;
                case 246 -> 54;
                case 247 -> 135;
                case 248 -> 63;
                case 249 -> 154;
                case 250 -> 200;
                case 251 -> 158;
                case 252 -> 107;
                case 253 -> 198;
                case 254 -> 12;
                default -> 41;
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
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = (me.octo.client.IIlIIlIIIIIIlIIIllllIIIIIllIIlIIIllIIIlIIllIIIlIllIllIllIlIlIIlIlIlIIIlIIllIIIIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll) null;
        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (kotlinx.serialization.descriptors.SerialDescriptor) null;
        a = new java.lang.String[0];
        b = new java.lang.String[0];
    }
}
