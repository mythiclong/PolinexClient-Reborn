package me.octo.client.utils;

// Restored from me-octo-only.jar:
//   jar_fqn   : me.octo.client.utils.llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
//   outer_fqn : me.octo.client.utils.llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl
// This is a Kotlin bound callable reference (an inner class of the outer lambda holder)
// that exists ONLY in the jar: the outer class refers to it as a local-variable type, so
// restoring it as a top-level file with the identical binary name is source-faithful.
//
// BODY SOURCES (bytecode = javap -p -c of the jar class, which is the source of truth)
//   <init>(Ljava/lang/Object;)V                        : transcribed instruction by instruction;
//       the jar's sipush/pop2 padding (obfuscator dead code) is not reproduced.
//   a(F)Ljava/lang/Float;                              : transcribed (receiver call + Float.valueOf)
//   invoke(Ljava/lang/Object;)Ljava/lang/Object;       : transcribed bridge
//   a(II)Ljava/lang/String;                            : transcribed instruction by instruction including
//       the full 255-way key-dispatch switch of the obfuscator (dead code in the jar: nothing in
//       the class calls it, but the jar declares it, so it must exist with this descriptor).
//   <clinit>()V                                        : net-effect equivalent - the two private static
//       fields are initialised with the exact values the jar <clinit> produces (read at runtime from
//       the jar class, kotlin-stdlib 2.4.0 on the classpath); the obfuscated string-splitting/xor loop
//       that computes them is not reproduced because it has no other observable effect. javac
//       synthesises <clinit>()V from these initialisers, so the descriptor gate still sees it.
//
// JAVAC-FORCED DEVIATIONS (descriptor-invisible):
//   * the interface is implemented RAW (kotlin.jvm.functions.Function1, not Function1<Float,Float>):
//     the parameterised form conflicts with FunctionReferenceImpl's own raw Function
//     inheritance. The jar's Signature attribute is not reproduced.
//   * the jar class carries ACC_SYNTHETIC and its invoke() carries ACC_BRIDGE|ACC_SYNTHETIC;
//     javac emits neither for an explicitly declared method. Names/descriptors match exactly.

final class llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1 {
    private static java.lang.String[] a = new java.lang.String[] {
        "s\u008c\u00d4\u00b9\u00c8\u008b\u00cb\u00fb\u00f6ew\u0095",
        "\u008f\u00f2Kv;r\u00b5\u00c49\u0082\u008ei\u00c5\u0091\u00bc\u00fa"
    };
    private static java.lang.String[] b = new java.lang.String[2];

    llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(java.lang.Object p0) {
        super(1, p0, me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.class, "easeOutQuart", "easeOutQuart(F)F", 0);
    }

    public final java.lang.Float a(float p0) {
        return java.lang.Float.valueOf(((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl) this.receiver).p(p0));
    }

    public java.lang.Object invoke(java.lang.Object p0) {
        return this.a(((java.lang.Number) p0).floatValue());
    }

    private static java.lang.String a(int p0, int p1) {
        int idx = (p0 ^ -20576) & 0xFFFF;
        if (b[idx] == null) {
            char[] c = a[idx].toCharArray();
            int k;
            switch (c[0] & 255) {
                case 0: k = 162; break;
                case 1: k = 102; break;
                case 2: k = 137; break;
                case 3: k = 93; break;
                case 4: k = 84; break;
                case 5: k = 126; break;
                case 6: k = 74; break;
                case 7: k = 174; break;
                case 8: k = 194; break;
                case 9: k = 9; break;
                case 10: k = 22; break;
                case 11: k = 85; break;
                case 12: k = 67; break;
                case 13: k = 134; break;
                case 14: k = 120; break;
                case 15: k = 204; break;
                case 16: k = 215; break;
                case 17: k = 66; break;
                case 18: k = 235; break;
                case 19: k = 118; break;
                case 20: k = 214; break;
                case 21: k = 136; break;
                case 22: k = 7; break;
                case 23: k = 44; break;
                case 24: k = 221; break;
                case 25: k = 236; break;
                case 26: k = 3; break;
                case 27: k = 53; break;
                case 28: k = 220; break;
                case 29: k = 167; break;
                case 30: k = 97; break;
                case 31: k = 209; break;
                case 32: k = 180; break;
                case 33: k = 98; break;
                case 34: k = 111; break;
                case 35: k = 4; break;
                case 36: k = 154; break;
                case 37: k = 45; break;
                case 38: k = 106; break;
                case 39: k = 100; break;
                case 40: k = 58; break;
                case 41: k = 21; break;
                case 42: k = 42; break;
                case 43: k = 59; break;
                case 44: k = 232; break;
                case 45: k = 195; break;
                case 46: k = 211; break;
                case 47: k = 239; break;
                case 48: k = 2; break;
                case 49: k = 228; break;
                case 50: k = 37; break;
                case 51: k = 199; break;
                case 52: k = 144; break;
                case 53: k = 107; break;
                case 54: k = 31; break;
                case 55: k = 253; break;
                case 56: k = 208; break;
                case 57: k = 200; break;
                case 58: k = 91; break;
                case 59: k = 139; break;
                case 60: k = 247; break;
                case 61: k = 149; break;
                case 62: k = 238; break;
                case 63: k = 95; break;
                case 64: k = 32; break;
                case 65: k = 12; break;
                case 66: k = 78; break;
                case 67: k = 248; break;
                case 68: k = 38; break;
                case 69: k = 79; break;
                case 70: k = 227; break;
                case 71: k = 16; break;
                case 72: k = 64; break;
                case 73: k = 213; break;
                case 74: k = 60; break;
                case 75: k = 39; break;
                case 76: k = 14; break;
                case 77: k = 113; break;
                case 78: k = 172; break;
                case 79: k = 246; break;
                case 80: k = 151; break;
                case 81: k = 13; break;
                case 82: k = 62; break;
                case 83: k = 216; break;
                case 84: k = 75; break;
                case 85: k = 81; break;
                case 86: k = 250; break;
                case 87: k = 105; break;
                case 88: k = 217; break;
                case 89: k = 109; break;
                case 90: k = 114; break;
                case 91: k = 176; break;
                case 92: k = 52; break;
                case 93: k = 224; break;
                case 94: k = 255; break;
                case 95: k = 26; break;
                case 96: k = 243; break;
                case 97: k = 73; break;
                case 98: k = 83; break;
                case 99: k = 148; break;
                case 100: k = 142; break;
                case 101: k = 179; break;
                case 102: k = 171; break;
                case 103: k = 129; break;
                case 104: k = 11; break;
                case 105: k = 202; break;
                case 106: k = 121; break;
                case 107: k = 5; break;
                case 108: k = 15; break;
                case 109: k = 207; break;
                case 110: k = 159; break;
                case 111: k = 197; break;
                case 112: k = 34; break;
                case 113: k = 237; break;
                case 114: k = 184; break;
                case 115: k = 61; break;
                case 116: k = 41; break;
                case 117: k = 96; break;
                case 118: k = 191; break;
                case 119: k = 104; break;
                case 120: k = 240; break;
                case 121: k = 152; break;
                case 122: k = 110; break;
                case 123: k = 166; break;
                case 124: k = 10; break;
                case 125: k = 20; break;
                case 126: k = 141; break;
                case 127: k = 92; break;
                case 128: k = 251; break;
                case 129: k = 30; break;
                case 130: k = 229; break;
                case 131: k = 117; break;
                case 132: k = 122; break;
                case 133: k = 86; break;
                case 134: k = 160; break;
                case 135: k = 168; break;
                case 136: k = 112; break;
                case 137: k = 206; break;
                case 138: k = 6; break;
                case 139: k = 56; break;
                case 140: k = 40; break;
                case 141: k = 94; break;
                case 142: k = 203; break;
                case 143: k = 146; break;
                case 144: k = 19; break;
                case 145: k = 123; break;
                case 146: k = 153; break;
                case 147: k = 150; break;
                case 148: k = 77; break;
                case 149: k = 210; break;
                case 150: k = 182; break;
                case 151: k = 155; break;
                case 152: k = 244; break;
                case 153: k = 185; break;
                case 154: k = 234; break;
                case 155: k = 187; break;
                case 156: k = 230; break;
                case 157: k = 196; break;
                case 158: k = 90; break;
                case 159: k = 50; break;
                case 160: k = 17; break;
                case 161: k = 161; break;
                case 162: k = 33; break;
                case 163: k = 183; break;
                case 164: k = 43; break;
                case 165: k = 205; break;
                case 166: k = 63; break;
                case 167: k = 212; break;
                case 168: k = 51; break;
                case 169: k = 138; break;
                case 170: k = 241; break;
                case 171: k = 157; break;
                case 172: k = 158; break;
                case 173: k = 88; break;
                case 174: k = 219; break;
                case 175: k = 115; break;
                case 176: k = 133; break;
                case 177: k = 223; break;
                case 178: k = 226; break;
                case 179: k = 82; break;
                case 180: k = 101; break;
                case 181: k = 119; break;
                case 182: k = 18; break;
                case 183: k = 132; break;
                case 184: k = 69; break;
                case 185: k = 99; break;
                case 186: k = 24; break;
                case 187: k = 193; break;
                case 188: k = 147; break;
                case 189: k = 80; break;
                case 190: k = 103; break;
                case 191: k = 231; break;
                case 192: k = 128; break;
                case 193: k = 0; break;
                case 194: k = 140; break;
                case 195: k = 116; break;
                case 196: k = 173; break;
                case 197: k = 108; break;
                case 198: k = 47; break;
                case 199: k = 71; break;
                case 200: k = 57; break;
                case 201: k = 165; break;
                case 202: k = 1; break;
                case 203: k = 124; break;
                case 204: k = 76; break;
                case 205: k = 29; break;
                case 206: k = 192; break;
                case 207: k = 54; break;
                case 208: k = 127; break;
                case 209: k = 135; break;
                case 210: k = 89; break;
                case 211: k = 218; break;
                case 212: k = 164; break;
                case 213: k = 190; break;
                case 214: k = 130; break;
                case 215: k = 169; break;
                case 216: k = 145; break;
                case 217: k = 36; break;
                case 218: k = 65; break;
                case 219: k = 163; break;
                case 220: k = 170; break;
                case 221: k = 28; break;
                case 222: k = 35; break;
                case 223: k = 49; break;
                case 224: k = 188; break;
                case 225: k = 186; break;
                case 226: k = 252; break;
                case 227: k = 178; break;
                case 228: k = 125; break;
                case 229: k = 233; break;
                case 230: k = 55; break;
                case 231: k = 177; break;
                case 232: k = 46; break;
                case 233: k = 23; break;
                case 234: k = 225; break;
                case 235: k = 222; break;
                case 236: k = 25; break;
                case 237: k = 156; break;
                case 238: k = 254; break;
                case 239: k = 143; break;
                case 240: k = 27; break;
                case 241: k = 242; break;
                case 242: k = 201; break;
                case 243: k = 249; break;
                case 244: k = 87; break;
                case 245: k = 181; break;
                case 246: k = 68; break;
                case 247: k = 245; break;
                case 248: k = 72; break;
                case 249: k = 48; break;
                case 250: k = 131; break;
                case 251: k = 175; break;
                case 252: k = 189; break;
                case 253: k = 198; break;
                case 254: k = 8; break;
                default: k = 70;
            }
            int k1 = (p1 & 255) - k;
            if (k1 < 0) {
                k1 += 256;
            }
            int k2 = ((p1 & 0xFFFF) >>> 8) - k;
            if (k2 < 0) {
                k2 += 256;
            }
            for (int j = 0; j < c.length; j++) {
                if (j % 2 == 0) {
                    c[j] = (char) (c[j] ^ k1);
                    k1 = ((k1 >>> 3 | k1 << 5) ^ c[j]) & 255;
                } else {
                    c[j] = (char) (c[j] ^ k2);
                    k2 = ((k2 >>> 3 | k2 << 5) ^ c[j]) & 255;
                }
            }
            b[idx] = new java.lang.String(c).intern();
        }
        return b[idx];
    }
}
