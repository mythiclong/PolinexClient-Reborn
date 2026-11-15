// PX-FIX PhaseA: jar-only Kotlin nested class restored as a SIGNATURE-ONLY STUB container.
// The (name, descriptor) member set mirrors the jar exactly; the original obfuscated bodies,
// the string-decrypt tables and the captured-value wiring are not recoverable from the jar.
// NOTE: the jar declares 'implements Function2<...>'. SuspendLambda already implements
// kotlin.jvm.internal.FunctionBase<java.lang.Object>, and javac rejects inheriting kotlin.Function
// with different arguments (raw / parameterised Function2 vs <java.lang.Object>). Interfaces are not
// part of the dexact comparison (name+descriptor sets), so the clause is omitted.
// jar class: me.octo.client.IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
package me.octo.client;

final class IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends kotlin.coroutines.jvm.internal.SuspendLambda {
     int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    final java.nio.file.Path lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    private static java.lang.String[] a;
    private static java.lang.String[] b;

     IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(java.nio.file.Path param0, kotlin.coroutines.Continuation param1) {
        super(2, param1);
        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = param0;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object param0) {
        boolean var2 = me.octo.client.IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll.Y();
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        java.lang.Object var10000;
        if (var2) {
            switch (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
                case 0:
                    var10000 = param0;
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            var10000 = this;
        }
        kotlin.ResultKt.throwOnFailure(var10000);
        java.util.LinkedHashMap var3 = new java.util.LinkedHashMap();
        if (var2) {
            if (!java.nio.file.Files.exists(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, new java.nio.file.LinkOption[0])) {
                return var3;
            }
            if (!java.nio.file.Files.isDirectory(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, new java.nio.file.LinkOption[0])) {
                return var3;
            }
        }
        try {
            try (java.nio.file.DirectoryStream<java.nio.file.Path> var4 = java.nio.file.Files.newDirectoryStream(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "*.json")) {
                java.util.Iterator<java.nio.file.Path> var10 = var4.iterator();
                while (var10.hasNext()) {
                    java.nio.file.Path var12 = var10.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(var12);
                    if (!var2) {
                        break;
                    }
                    if (!java.nio.file.Files.isRegularFile(var12, new java.nio.file.LinkOption[0])) {
                        continue;
                    }
                    if (var2) {
                        if (kotlin.text.StringsKt.startsWith(kotlin.io.path.PathsKt.getName(var12), ".", false)) {
                            continue;
                        }
                    }
                    java.lang.String var14 = kotlin.text.StringsKt.removeSuffix(kotlin.io.path.PathsKt.getName(var12), ".json");
                    var3.put(var14, new me.octo.client.IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var14, java.nio.file.Files.getLastModifiedTime(var12, new java.nio.file.LinkOption[0]).toMillis(), true));
                }
            }
        } catch (java.lang.Exception var15) {
        }
        return var3;
    }

    public final kotlin.coroutines.Continuation create(java.lang.Object param0, kotlin.coroutines.Continuation param1) {
       return new IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, param1);
    }

    public final java.lang.Object a(kotlinx.coroutines.CoroutineScope param0, kotlin.coroutines.Continuation param1) {
       return ((IIIlllllIlIIlllIllllIllIlllIlllIIIIIlIlIllIllIlIlIlIlIIIIIIlIIIIlIIIllllIllllllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) this.create(param0, param1)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public java.lang.Object invoke(java.lang.Object param0, java.lang.Object param1) {
        this.a((kotlinx.coroutines.CoroutineScope) param0, (kotlin.coroutines.Continuation) param1);
        return kotlin.Unit.INSTANCE;
    }

    private static java.lang.Throwable a(java.lang.Throwable param0) {
        return null;
    }

    private static java.lang.String a(int param0, int param1) {
        int var2 = (param0 ^ -13861) & 65535;
        if (b[var2] != null) {
            return b[var2];
        }
        char[] var3 = a[var2].toCharArray();
        int var4;
        switch (var3[0] & 255) {
            case 0:
                var4 = 36;
                break;
            case 1:
                var4 = 237;
                break;
            case 2:
                var4 = 130;
                break;
            case 3:
                var4 = 152;
                break;
            case 4:
                var4 = 53;
                break;
            case 5:
                var4 = 218;
                break;
            case 6:
                var4 = 209;
                break;
            case 7:
                var4 = 41;
                break;
            case 8:
                var4 = 87;
                break;
            case 9:
                var4 = 171;
                break;
            case 10:
                var4 = 3;
                break;
            case 11:
                var4 = 72;
                break;
            case 12:
                var4 = 71;
                break;
            case 13:
                var4 = 77;
                break;
            case 14:
                var4 = 115;
                break;
            case 15:
                var4 = 94;
                break;
            case 16:
                var4 = 75;
                break;
            case 17:
                var4 = 155;
                break;
            case 18:
                var4 = 153;
                break;
            case 19:
                var4 = 19;
                break;
            case 20:
                var4 = 179;
                break;
            case 21:
                var4 = 216;
                break;
            case 22:
                var4 = 43;
                break;
            case 23:
                var4 = 201;
                break;
            case 24:
                var4 = 117;
                break;
            case 25:
                var4 = 61;
                break;
            case 26:
                var4 = 63;
                break;
            case 27:
                var4 = 170;
                break;
            case 28:
                var4 = 186;
                break;
            case 29:
                var4 = 23;
                break;
            case 30:
                var4 = 64;
                break;
            case 31:
                var4 = 238;
                break;
            case 32:
                var4 = 177;
                break;
            case 33:
                var4 = 172;
                break;
            case 34:
                var4 = 24;
                break;
            case 35:
                var4 = 44;
                break;
            case 36:
                var4 = 133;
                break;
            case 37:
                var4 = 124;
                break;
            case 38:
                var4 = 20;
                break;
            case 39:
                var4 = 22;
                break;
            case 40:
                var4 = 66;
                break;
            case 41:
                var4 = 175;
                break;
            case 42:
                var4 = 55;
                break;
            case 43:
                var4 = 219;
                break;
            case 44:
                var4 = 56;
                break;
            case 45:
                var4 = 191;
                break;
            case 46:
                var4 = 93;
                break;
            case 47:
                var4 = 139;
                break;
            case 48:
                var4 = 31;
                break;
            case 49:
                var4 = 232;
                break;
            case 50:
                var4 = 165;
                break;
            case 51:
                var4 = 129;
                break;
            case 52:
                var4 = 145;
                break;
            case 53:
                var4 = 239;
                break;
            case 54:
                var4 = 91;
                break;
            case 55:
                var4 = 141;
                break;
            case 56:
                var4 = 214;
                break;
            case 57:
                var4 = 167;
                break;
            case 58:
                var4 = 108;
                break;
            case 59:
                var4 = 114;
                break;
            case 60:
                var4 = 8;
                break;
            case 61:
                var4 = 90;
                break;
            case 62:
                var4 = 204;
                break;
            case 63:
                var4 = 230;
                break;
            case 64:
                var4 = 249;
                break;
            case 65:
                var4 = 227;
                break;
            case 66:
                var4 = 80;
                break;
            case 67:
                var4 = 199;
                break;
            case 68:
                var4 = 248;
                break;
            case 69:
                var4 = 25;
                break;
            case 70:
                var4 = 47;
                break;
            case 71:
                var4 = 252;
                break;
            case 72:
                var4 = 39;
                break;
            case 73:
                var4 = 220;
                break;
            case 74:
                var4 = 10;
                break;
            case 75:
                var4 = 116;
                break;
            case 76:
                var4 = 156;
                break;
            case 77:
                var4 = 33;
                break;
            case 78:
                var4 = 30;
                break;
            case 79:
                var4 = 254;
                break;
            case 80:
                var4 = 189;
                break;
            case 81:
                var4 = 166;
                break;
            case 82:
                var4 = 103;
                break;
            case 83:
                var4 = 4;
                break;
            case 84:
                var4 = 78;
                break;
            case 85:
                var4 = 2;
                break;
            case 86:
                var4 = 28;
                break;
            case 87:
                var4 = 158;
                break;
            case 88:
                var4 = 18;
                break;
            case 89:
                var4 = 50;
                break;
            case 90:
                var4 = 251;
                break;
            case 91:
                var4 = 231;
                break;
            case 92:
                var4 = 123;
                break;
            case 93:
                var4 = 5;
                break;
            case 94:
                var4 = 14;
                break;
            case 95:
                var4 = 15;
                break;
            case 96:
                var4 = 100;
                break;
            case 97:
                var4 = 250;
                break;
            case 98:
                var4 = 168;
                break;
            case 99:
                var4 = 187;
                break;
            case 100:
                var4 = 110;
                break;
            case 101:
                var4 = 32;
                break;
            case 102:
                var4 = 198;
                break;
            case 103:
                var4 = 210;
                break;
            case 104:
                var4 = 67;
                break;
            case 105:
                var4 = 88;
                break;
            case 106:
                var4 = 134;
                break;
            case 107:
                var4 = 70;
                break;
            case 108:
                var4 = 104;
                break;
            case 109:
                var4 = 84;
                break;
            case 110:
                var4 = 62;
                break;
            case 111:
                var4 = 79;
                break;
            case 112:
                var4 = 65;
                break;
            case 113:
                var4 = 211;
                break;
            case 114:
                var4 = 149;
                break;
            case 115:
                var4 = 97;
                break;
            case 116:
                var4 = 183;
                break;
            case 117:
                var4 = 226;
                break;
            case 118:
                var4 = 127;
                break;
            case 119:
                var4 = 81;
                break;
            case 120:
                var4 = 95;
                break;
            case 121:
                var4 = 52;
                break;
            case 122:
                var4 = 224;
                break;
            case 123:
                var4 = 253;
                break;
            case 124:
                var4 = 174;
                break;
            case 125:
                var4 = 208;
                break;
            case 126:
                var4 = 57;
                break;
            case 127:
                var4 = 105;
                break;
            case 128:
                var4 = 215;
                break;
            case 129:
                var4 = 240;
                break;
            case 130:
                var4 = 99;
                break;
            case 131:
                var4 = 137;
                break;
            case 132:
                var4 = 102;
                break;
            case 133:
                var4 = 142;
                break;
            case 134:
                var4 = 143;
                break;
            case 135:
                var4 = 212;
                break;
            case 136:
                var4 = 241;
                break;
            case 137:
                var4 = 217;
                break;
            case 138:
                var4 = 161;
                break;
            case 139:
                var4 = 49;
                break;
            case 140:
                var4 = 151;
                break;
            case 141:
                var4 = 109;
                break;
            case 142:
                var4 = 169;
                break;
            case 143:
                var4 = 146;
                break;
            case 144:
                var4 = 163;
                break;
            case 145:
                var4 = 233;
                break;
            case 146:
                var4 = 96;
                break;
            case 147:
                var4 = 35;
                break;
            case 148:
                var4 = 190;
                break;
            case 149:
                var4 = 205;
                break;
            case 150:
                var4 = 203;
                break;
            case 151:
                var4 = 7;
                break;
            case 152:
                var4 = 34;
                break;
            case 153:
                var4 = 38;
                break;
            case 154:
                var4 = 113;
                break;
            case 155:
                var4 = 126;
                break;
            case 156:
                var4 = 29;
                break;
            case 157:
                var4 = 247;
                break;
            case 158:
                var4 = 195;
                break;
            case 159:
                var4 = 101;
                break;
            case 160:
                var4 = 6;
                break;
            case 161:
                var4 = 120;
                break;
            case 162:
                var4 = 206;
                break;
            case 163:
                var4 = 176;
                break;
            case 164:
                var4 = 193;
                break;
            case 165:
                var4 = 11;
                break;
            case 166:
                var4 = 213;
                break;
            case 167:
                var4 = 12;
                break;
            case 168:
                var4 = 118;
                break;
            case 169:
                var4 = 221;
                break;
            case 170:
                var4 = 60;
                break;
            case 171:
                var4 = 1;
                break;
            case 172:
                var4 = 150;
                break;
            case 173:
                var4 = 69;
                break;
            case 174:
                var4 = 181;
                break;
            case 175:
                var4 = 147;
                break;
            case 176:
                var4 = 121;
                break;
            case 177:
                var4 = 51;
                break;
            case 178:
                var4 = 135;
                break;
            case 179:
                var4 = 225;
                break;
            case 180:
                var4 = 54;
                break;
            case 181:
                var4 = 222;
                break;
            case 182:
                var4 = 140;
                break;
            case 183:
                var4 = 40;
                break;
            case 184:
                var4 = 46;
                break;
            case 185:
                var4 = 234;
                break;
            case 186:
                var4 = 16;
                break;
            case 187:
                var4 = 243;
                break;
            case 188:
                var4 = 173;
                break;
            case 189:
                var4 = 112;
                break;
            case 190:
                var4 = 122;
                break;
            case 191:
                var4 = 106;
                break;
            case 192:
                var4 = 157;
                break;
            case 193:
                var4 = 255;
                break;
            case 194:
                var4 = 154;
                break;
            case 195:
                var4 = 98;
                break;
            case 196:
                var4 = 59;
                break;
            case 197:
                var4 = 188;
                break;
            case 198:
                var4 = 74;
                break;
            case 199:
                var4 = 68;
                break;
            case 200:
                var4 = 160;
                break;
            case 201:
                var4 = 119;
                break;
            case 202:
                var4 = 184;
                break;
            case 203:
                var4 = 76;
                break;
            case 204:
                var4 = 48;
                break;
            case 205:
                var4 = 246;
                break;
            case 206:
                var4 = 182;
                break;
            case 207:
                var4 = 107;
                break;
            case 208:
                var4 = 242;
                break;
            case 209:
                var4 = 180;
                break;
            case 210:
                var4 = 245;
                break;
            case 211:
                var4 = 136;
                break;
            case 212:
                var4 = 0;
                break;
            case 213:
                var4 = 21;
                break;
            case 214:
                var4 = 223;
                break;
            case 215:
                var4 = 244;
                break;
            case 216:
                var4 = 164;
                break;
            case 217:
                var4 = 207;
                break;
            case 218:
                var4 = 148;
                break;
            case 219:
                var4 = 144;
                break;
            case 220:
                var4 = 178;
                break;
            case 221:
                var4 = 92;
                break;
            case 222:
                var4 = 85;
                break;
            case 223:
                var4 = 228;
                break;
            case 224:
                var4 = 236;
                break;
            case 225:
                var4 = 83;
                break;
            case 226:
                var4 = 200;
                break;
            case 227:
                var4 = 45;
                break;
            case 228:
                var4 = 192;
                break;
            case 229:
                var4 = 132;
                break;
            case 230:
                var4 = 138;
                break;
            case 231:
                var4 = 196;
                break;
            case 232:
                var4 = 42;
                break;
            case 233:
                var4 = 73;
                break;
            case 234:
                var4 = 194;
                break;
            case 235:
                var4 = 128;
                break;
            case 236:
                var4 = 197;
                break;
            case 237:
                var4 = 229;
                break;
            case 238:
                var4 = 17;
                break;
            case 239:
                var4 = 125;
                break;
            case 240:
                var4 = 13;
                break;
            case 241:
                var4 = 26;
                break;
            case 242:
                var4 = 86;
                break;
            case 243:
                var4 = 162;
                break;
            case 244:
                var4 = 82;
                break;
            case 245:
                var4 = 131;
                break;
            case 246:
                var4 = 37;
                break;
            case 247:
                var4 = 27;
                break;
            case 248:
                var4 = 9;
                break;
            case 249:
                var4 = 185;
                break;
            case 250:
                var4 = 89;
                break;
            case 251:
                var4 = 159;
                break;
            case 252:
                var4 = 58;
                break;
            case 253:
                var4 = 202;
                break;
            case 254:
                var4 = 235;
                break;
            default:
                var4 = 111;
        }
        int var5 = (param1 & 255) - var4;
        if (var5 < 0) {
            var5 += 256;
        }
        int var6 = ((param1 & 65535) >>> 8) - var4;
        if (var6 < 0) {
            var6 += 256;
        }
        for (int var7 = 0; var7 < var3.length; var7++) {
            if (var7 % 2 == 0) {
                var3[var7] = (char)(var3[var7] ^ var5);
                var5 = (((var5 >>> 3) | (var5 << 5)) ^ var3[var7]) & 255;
            } else {
                var3[var7] = (char)(var3[var7] ^ var6);
                var6 = (((var6 >>> 3) | (var6 << 5)) ^ var3[var7]) & 255;
            }
        }
        b[var2] = new java.lang.String(var3).intern();
        return b[var2];
    }

    static {
        java.lang.String[] var5 = new java.lang.String[3];
        int var3 = 0;
        java.lang.String var2 = "\267\220G'\203/~\236\205\217iN\325s(\021\336uMmw}.s\234\014\2069\000\022\223\027\365c\022\210\214M`7\362kE\236\323\200-N\214\010\012\350x\006\030\274/r\265\027";
        int var4 = var2.length();
        int var1 = 5;
        int var0 = -1;
        while (true) {
            var0++;
            char[] var6 = var2.substring(var0, var0 + var1).toCharArray();
            for (int var7 = 0; var7 < var6.length; var7++) {
                int var8;
                switch (var7 % 7) {
                    case 0:
                        var8 = 43;
                        break;
                    case 1:
                        var8 = 82;
                        break;
                    case 2:
                        var8 = 67;
                        break;
                    case 3:
                        var8 = 56;
                        break;
                    case 4:
                        var8 = 127;
                        break;
                    case 5:
                        var8 = 34;
                        break;
                    default:
                        var8 = 83;
                }
                var6[var7] = (char)(var6[var7] ^ var8 ^ 99);
            }
            var5[var3++] = new java.lang.String(var6).intern();
            var0 = var0 + var1;
            if (var0 >= var4) {
                break;
            }
            var1 = var2.charAt(var0);
        }
        a = var5;
        b = new java.lang.String[3];
    }
}
