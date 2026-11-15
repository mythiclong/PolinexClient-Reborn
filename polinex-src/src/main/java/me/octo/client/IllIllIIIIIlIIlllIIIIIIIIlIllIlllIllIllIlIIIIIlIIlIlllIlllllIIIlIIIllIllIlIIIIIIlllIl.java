/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Unit
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Dispatchers
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client;

import java.lang.invoke.LambdaMetafactory;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
import me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII;
import me.octo.client.utils.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl
extends lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> {




   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var7_7 = null; // PX-FIX missing field v2
   

    @NotNull
    public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
    private final int lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    @NotNull
    private static Set<String> IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
    @NotNull
    private static Lazy<Path> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
    private static String[] h;
    private static String[] i;

    public IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl(@NotNull String string, @NotNull String string2, @NotNull String[] stringArray, int n) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"name");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"description");
        Intrinsics.checkNotNullParameter((Object)stringArray, (String)"staticOptions");
        super(string, string2, stringArray, "Loading...", "No sounds found", "Error loading sounds");
        this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = n;
    }

    public /* synthetic */ IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl(String string, String string2, String[] stringArray, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 8) != 0) {
            n = 30;
        }
        this(string, string2, stringArray, n);
    }

    @Override
    @NotNull
    protected Path E() {
        return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.a();
    }

    @Nullable
    protected Object a(@NotNull Continuation<? super Map<String, ? extends IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> continuation) {
        return IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.a(this, continuation);
    }

    static /* synthetic */ Object a(IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl illIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl, Continuation<? super Map<String, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> continuation) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super LinkedHashMap<String, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super LinkedHashMap<String,IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            private static String[] a;
            private static String[] b;

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            public final Continuation<Unit> create(Object object, Continuation<?> continuation) {
                return (Continuation)null /* PX-FIX */;
            }

            public final Object a(CoroutineScope coroutineScope, Continuation<? super LinkedHashMap<String, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static Throwable a(Throwable throwable) {
                return throwable;
            }

            /*
             * Unable to fully structure code
             */
            static {
                String[] var5 = new String[2]; // PX-FIX: 解密初始化被桩化
                IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.a = (me.octo.client.PXDyn)(Object)var5; // PX-FIX: 类型桥接
                IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b = new String[2];
            }

            private static String a(int n, int n2) {
                int n3 = (n ^ 0xFFFFA04A) & 0xFFFF;
                if (b[n3] == null) {
                    int n4;
                    char[] cArray = a[n3].toCharArray();
                    int n5 = switch (cArray[0] & 0xFF) {
                        case 0 -> 244;
                        case 1 -> 214;
                        case 2 -> 187;
                        case 3 -> 195;
                        case 4 -> 12;
                        case 5 -> 133;
                        case 6 -> 32;
                        case 7 -> 35;
                        case 8 -> 238;
                        case 9 -> 210;
                        case 10 -> 199;
                        case 11 -> 7;
                        case 12 -> 146;
                        case 13 -> 86;
                        case 14 -> 24;
                        case 15 -> 155;
                        case 16 -> 207;
                        case 17 -> 14;
                        case 18 -> 172;
                        case 19 -> 96;
                        case 20 -> 77;
                        case 21 -> 38;
                        case 22 -> 112;
                        case 23 -> 159;
                        case 24 -> 101;
                        case 25 -> 228;
                        case 26 -> 79;
                        case 27 -> 49;
                        case 28 -> 148;
                        case 29 -> 202;
                        case 30 -> 88;
                        case 31 -> 200;
                        case 32 -> 128;
                        case 33 -> 211;
                        case 34 -> 194;
                        case 35 -> 104;
                        case 36 -> 124;
                        case 37 -> 226;
                        case 38 -> 152;
                        case 39 -> 11;
                        case 40 -> 2;
                        case 41 -> 50;
                        case 42 -> 170;
                        case 43 -> 182;
                        case 44 -> 84;
                        case 45 -> 26;
                        case 46 -> 153;
                        case 47 -> 255;
                        case 48 -> 192;
                        case 49 -> 150;
                        case 50 -> 27;
                        case 51 -> 180;
                        case 52 -> 75;
                        case 53 -> 215;
                        case 54 -> 9;
                        case 55 -> 213;
                        case 56 -> 33;
                        case 57 -> 129;
                        case 58 -> 81;
                        case 59 -> 254;
                        case 60 -> 40;
                        case 61 -> 184;
                        case 62 -> 246;
                        case 63 -> 68;
                        case 64 -> 216;
                        case 65 -> 164;
                        case 66 -> 130;
                        case 67 -> 65;
                        case 68 -> 165;
                        case 69 -> 162;
                        case 70 -> 138;
                        case 71 -> 177;
                        case 72 -> 108;
                        case 73 -> 6;
                        case 74 -> 173;
                        case 75 -> 168;
                        case 76 -> 64;
                        case 77 -> 3;
                        case 78 -> 236;
                        case 79 -> 18;
                        case 80 -> 144;
                        case 81 -> 209;
                        case 82 -> 74;
                        case 83 -> 106;
                        case 84 -> 120;
                        case 85 -> 147;
                        case 86 -> 5;
                        case 87 -> 140;
                        case 88 -> 34;
                        case 89 -> 219;
                        case 90 -> 201;
                        case 91 -> 20;
                        case 92 -> 36;
                        case 93 -> 69;
                        case 94 -> 99;
                        case 95 -> 243;
                        case 96 -> 125;
                        case 97 -> 156;
                        case 98 -> 17;
                        case 99 -> 21;
                        case 100 -> 114;
                        case 101 -> 230;
                        case 102 -> 220;
                        case 103 -> 117;
                        case 104 -> 196;
                        case 105 -> 222;
                        case 106 -> 234;
                        case 107 -> 80;
                        case 108 -> 87;
                        case 109 -> 4;
                        case 110 -> 141;
                        case 111 -> 45;
                        case 112 -> 145;
                        case 113 -> 10;
                        case 114 -> 60;
                        case 115 -> 249;
                        case 116 -> 237;
                        case 117 -> 121;
                        case 118 -> 55;
                        case 119 -> 169;
                        case 120 -> 185;
                        case 121 -> 218;
                        case 122 -> 30;
                        case 123 -> 250;
                        case 124 -> 166;
                        case 125 -> 31;
                        case 126 -> 123;
                        case 127 -> 15;
                        case 128 -> 224;
                        case 129 -> 252;
                        case 130 -> 63;
                        case 131 -> 171;
                        case 132 -> 8;
                        case 133 -> 109;
                        case 134 -> 70;
                        case 135 -> 231;
                        case 136 -> 44;
                        case 137 -> 28;
                        case 138 -> 19;
                        case 139 -> 157;
                        case 140 -> 72;
                        case 141 -> 137;
                        case 142 -> 167;
                        case 143 -> 248;
                        case 144 -> 253;
                        case 145 -> 61;
                        case 146 -> 163;
                        case 147 -> 143;
                        case 148 -> 206;
                        case 149 -> 22;
                        case 150 -> 189;
                        case 151 -> 131;
                        case 152 -> 160;
                        case 153 -> 174;
                        case 154 -> 217;
                        case 155 -> 188;
                        case 156 -> 95;
                        case 157 -> 115;
                        case 158 -> 47;
                        case 159 -> 59;
                        case 160 -> 83;
                        case 161 -> 51;
                        case 162 -> 62;
                        case 163 -> 245;
                        case 164 -> 57;
                        case 165 -> 66;
                        case 166 -> 186;
                        case 167 -> 126;
                        case 168 -> 179;
                        case 169 -> 223;
                        case 170 -> 221;
                        case 171 -> 239;
                        case 172 -> 118;
                        case 173 -> 56;
                        case 174 -> 16;
                        case 175 -> 103;
                        case 176 -> 53;
                        case 177 -> 41;
                        case 178 -> 241;
                        case 179 -> 110;
                        case 180 -> 46;
                        case 181 -> 67;
                        case 182 -> 225;
                        case 183 -> 73;
                        case 184 -> 29;
                        case 185 -> 52;
                        case 186 -> 102;
                        case 187 -> 105;
                        case 188 -> 85;
                        case 189 -> 158;
                        case 190 -> 240;
                        case 191 -> 111;
                        case 192 -> 149;
                        case 193 -> 142;
                        case 194 -> 204;
                        case 195 -> 37;
                        case 196 -> 151;
                        case 197 -> 89;
                        case 198 -> 183;
                        case 199 -> 161;
                        case 200 -> 198;
                        case 201 -> 193;
                        case 202 -> 205;
                        case 203 -> 0;
                        case 204 -> 134;
                        case 205 -> 175;
                        case 206 -> 98;
                        case 207 -> 48;
                        case 208 -> 93;
                        case 209 -> 97;
                        case 210 -> 54;
                        case 211 -> 91;
                        case 212 -> 203;
                        case 213 -> 92;
                        case 214 -> 58;
                        case 215 -> 82;
                        case 216 -> 100;
                        case 217 -> 78;
                        case 218 -> 43;
                        case 219 -> 191;
                        case 220 -> 107;
                        case 221 -> 122;
                        case 222 -> 116;
                        case 223 -> 247;
                        case 224 -> 71;
                        case 225 -> 229;
                        case 226 -> 139;
                        case 227 -> 25;
                        case 228 -> 136;
                        case 229 -> 197;
                        case 230 -> 135;
                        case 231 -> 119;
                        case 232 -> 1;
                        case 233 -> 90;
                        case 234 -> 113;
                        case 235 -> 235;
                        case 236 -> 176;
                        case 237 -> 127;
                        case 238 -> 76;
                        case 239 -> 227;
                        case 240 -> 23;
                        case 241 -> 13;
                        case 242 -> 132;
                        case 243 -> 154;
                        case 244 -> 208;
                        case 245 -> 181;
                        case 246 -> 42;
                        case 247 -> 190;
                        case 248 -> 242;
                        case 249 -> 178;
                        case 250 -> 212;
                        case 251 -> 251;
                        case 252 -> 39;
                        case 253 -> 94;
                        case 254 -> 233;
                        default -> 232;
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
                    IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.b[n3] = new String(cArray).intern();
                }
                return b[n3];
            }
        }), continuation);
    }

    @NotNull
    protected String a(@NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) {
        Intrinsics.checkNotNullParameter((Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, (String)"item");
        return illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a();
    }

    @NotNull
    protected String b(@NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI) {
        String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        Intrinsics.checkNotNullParameter((Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, (String)"item");
        String[] stringArray2 = stringArray;
        String string = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a();
        Object object = string;
        if (stringArray2 == null) {
            if (((String)object).length() > this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll) {
                String string2 = string.substring(0, this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll - 3);
                Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"substring(...)");
                object = string2 + "...";
            } else {
                object = string;
            }
        }
        return (String)object;
    }

    @Nullable
    public final Path R() {
        Path path;
        Path path2;
        String string;
        String[] stringArray;
        block5: {
            block4: {
                stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                if (stringArray != null) break block4;
                string = this.H();
                if (string != null) break block5;
            }
            return null;
        }
        String string2 = string;
        Path path3 = path2 = (path = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.a().resolve(string2));
        boolean bl = false;
        Intrinsics.checkNotNull((Object)path3);
        Path path4 = path3;
        if (stringArray == null) {
            LinkOption[] linkOptionArray = new LinkOption[]{};
            path4 = Files.exists(path4, Arrays.copyOf(linkOptionArray, linkOptionArray.length)) ? path2 : null;
        }
        return path4;
    }

    private static final Path S() {
        Path path;
        Path path2 = path = lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.toPath().resolve("sounds").resolve("failsafe");
        String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        boolean bl = false;
        Path path3 = path2;
        if (stringArray == null) {
            if (!Files.exists(path3, new LinkOption[0])) {
                try {
                   Files.createDirectories(path2, new FileAttribute[0]);
                }
                catch (java.io.IOException iOException) {
                   throw new RuntimeException(iOException);
                }
            }
            path3 = path;
        }
        return path3;
    }

    public static final /* synthetic */ Set U() {
        return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
    }

    /*
     * Unable to fully structure code
     */
    static {
        String[] var5 = new String[14]; // PX-FIX: 解密初始化被桩化
        IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.h = ((String[])(Object)(var5));
        IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.i = new String[14];
        IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll((kotlin.jvm.internal.DefaultConstructorMarker) null);
        String[] var7_7 = new String[2];
        var7_7[0] = "wav";
        var7_7[1] = "ogg";
        IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = SetsKt.setOf(var7_7);
        IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = LazyKt.lazy((Function0)(() -> null)); // PX-FIX
    }

    private static String d(int n, int n2) {
        int n3 = (n ^ 0xFFFFFF5D) & 0xFFFF;
        if (i[n3] == null) {
            int n4;
            char[] cArray = h[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 89;
                case 1 -> 221;
                case 2 -> 114;
                case 3 -> 17;
                case 4 -> 240;
                case 5 -> 181;
                case 6 -> 7;
                case 7 -> 62;
                case 8 -> 232;
                case 9 -> 13;
                case 10 -> 5;
                case 11 -> 200;
                case 12 -> 144;
                case 13 -> 34;
                case 14 -> 19;
                case 15 -> 155;
                case 16 -> 238;
                case 17 -> 15;
                case 18 -> 204;
                case 19 -> 82;
                case 20 -> 98;
                case 21 -> 95;
                case 22 -> 250;
                case 23 -> 150;
                case 24 -> 60;
                case 25 -> 229;
                case 26 -> 116;
                case 27 -> 209;
                case 28 -> 166;
                case 29 -> 83;
                case 30 -> 164;
                case 31 -> 148;
                case 32 -> 170;
                case 33 -> 192;
                case 34 -> 68;
                case 35 -> 75;
                case 36 -> 46;
                case 37 -> 120;
                case 38 -> 158;
                case 39 -> 242;
                case 40 -> 133;
                case 41 -> 205;
                case 42 -> 56;
                case 43 -> 84;
                case 44 -> 182;
                case 45 -> 180;
                case 46 -> 162;
                case 47 -> 193;
                case 48 -> 156;
                case 49 -> 145;
                case 50 -> 111;
                case 51 -> 71;
                case 52 -> 92;
                case 53 -> 196;
                case 54 -> 112;
                case 55 -> 58;
                case 56 -> 246;
                case 57 -> 222;
                case 58 -> 253;
                case 59 -> 216;
                case 60 -> 49;
                case 61 -> 40;
                case 62 -> 211;
                case 63 -> 224;
                case 64 -> 25;
                case 65 -> 215;
                case 66 -> 1;
                case 67 -> 231;
                case 68 -> 194;
                case 69 -> 223;
                case 70 -> 247;
                case 71 -> 29;
                case 72 -> 3;
                case 73 -> 225;
                case 74 -> 77;
                case 75 -> 80;
                case 76 -> 171;
                case 77 -> 151;
                case 78 -> 137;
                case 79 -> 165;
                case 80 -> 105;
                case 81 -> 30;
                case 82 -> 103;
                case 83 -> 159;
                case 84 -> 94;
                case 85 -> 32;
                case 86 -> 109;
                case 87 -> 93;
                case 88 -> 104;
                case 89 -> 28;
                case 90 -> 52;
                case 91 -> 177;
                case 92 -> 219;
                case 93 -> 146;
                case 94 -> 100;
                case 95 -> 119;
                case 96 -> 243;
                case 97 -> 203;
                case 98 -> 163;
                case 99 -> 198;
                case 100 -> 187;
                case 101 -> 65;
                case 102 -> 127;
                case 103 -> 53;
                case 104 -> 167;
                case 105 -> 184;
                case 106 -> 237;
                case 107 -> 42;
                case 108 -> 115;
                case 109 -> 43;
                case 110 -> 189;
                case 111 -> 73;
                case 112 -> 124;
                case 113 -> 50;
                case 114 -> 113;
                case 115 -> 78;
                case 116 -> 101;
                case 117 -> 254;
                case 118 -> 139;
                case 119 -> 6;
                case 120 -> 99;
                case 121 -> 12;
                case 122 -> 121;
                case 123 -> 51;
                case 124 -> 212;
                case 125 -> 79;
                case 126 -> 255;
                case 127 -> 96;
                case 128 -> 91;
                case 129 -> 135;
                case 130 -> 24;
                case 131 -> 153;
                case 132 -> 126;
                case 133 -> 125;
                case 134 -> 130;
                case 135 -> 102;
                case 136 -> 88;
                case 137 -> 59;
                case 138 -> 252;
                case 139 -> 195;
                case 140 -> 160;
                case 141 -> 64;
                case 142 -> 234;
                case 143 -> 74;
                case 144 -> 54;
                case 145 -> 214;
                case 146 -> 131;
                case 147 -> 183;
                case 148 -> 249;
                case 149 -> 2;
                case 150 -> 239;
                case 151 -> 22;
                case 152 -> 178;
                case 153 -> 118;
                case 154 -> 143;
                case 155 -> 201;
                case 156 -> 213;
                case 157 -> 208;
                case 158 -> 197;
                case 159 -> 233;
                case 160 -> 188;
                case 161 -> 226;
                case 162 -> 16;
                case 163 -> 140;
                case 164 -> 72;
                case 165 -> 81;
                case 166 -> 18;
                case 167 -> 210;
                case 168 -> 230;
                case 169 -> 44;
                case 170 -> 122;
                case 171 -> 110;
                case 172 -> 251;
                case 173 -> 63;
                case 174 -> 132;
                case 175 -> 35;
                case 176 -> 0;
                case 177 -> 48;
                case 178 -> 202;
                case 179 -> 8;
                case 180 -> 236;
                case 181 -> 179;
                case 182 -> 147;
                case 183 -> 241;
                case 184 -> 172;
                case 185 -> 87;
                case 186 -> 117;
                case 187 -> 245;
                case 188 -> 220;
                case 189 -> 23;
                case 190 -> 57;
                case 191 -> 168;
                case 192 -> 67;
                case 193 -> 61;
                case 194 -> 108;
                case 195 -> 138;
                case 196 -> 107;
                case 197 -> 227;
                case 198 -> 9;
                case 199 -> 41;
                case 200 -> 199;
                case 201 -> 218;
                case 202 -> 26;
                case 203 -> 4;
                case 204 -> 175;
                case 205 -> 66;
                case 206 -> 106;
                case 207 -> 21;
                case 208 -> 244;
                case 209 -> 37;
                case 210 -> 85;
                case 211 -> 128;
                case 212 -> 161;
                case 213 -> 191;
                case 214 -> 55;
                case 215 -> 142;
                case 216 -> 69;
                case 217 -> 141;
                case 218 -> 90;
                case 219 -> 207;
                case 220 -> 157;
                case 221 -> 176;
                case 222 -> 20;
                case 223 -> 47;
                case 224 -> 45;
                case 225 -> 154;
                case 226 -> 174;
                case 227 -> 136;
                case 228 -> 129;
                case 229 -> 185;
                case 230 -> 228;
                case 231 -> 10;
                case 232 -> 235;
                case 233 -> 76;
                case 234 -> 134;
                case 235 -> 248;
                case 236 -> 14;
                case 237 -> 31;
                case 238 -> 173;
                case 239 -> 27;
                case 240 -> 152;
                case 241 -> 39;
                case 242 -> 97;
                case 243 -> 36;
                case 244 -> 86;
                case 245 -> 190;
                case 246 -> 206;
                case 247 -> 11;
                case 248 -> 70;
                case 249 -> 217;
                case 250 -> 33;
                case 251 -> 186;
                case 252 -> 123;
                case 253 -> 149;
                case 254 -> 38;
                default -> 169;
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
            IllIllIIIIIlIIlllIIIIIIIIlIllIlllIllIllIlIIIIIlIIlIlllIlllllIIIlIIIllIllIlIIIIIIlllIl.i[n3] = new String(cArray).intern();
        }
        return i[n3];
    }

    public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        private static String a;

        private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
        }

        @NotNull
        public final Path a() {
            Lazy lazy = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
            Object object = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)a);
            return (Path)object;
        }

        public /* synthetic */ llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*
         * Handled impossible loop by duplicating code
         * Enabled aggressive block sorting
         */
        static {
            char[] cArray;
            block12: {
                int n;
                char[] cArray2;
                int n2;
                int n3;
                block11: {
                    char[] cArray3 = "VFZJ\u0005\u0003\u001aT\u000b\u00002JF".toCharArray();
                    int n4 = cArray3.length;
                    n3 = 0;
                    n2 = 126;
                    cArray2 = cArray3;
                    n = n4;
                    if (n4 <= 1) break block11;
                    cArray = cArray2;
                    n = n;
                    if (n <= n3) break block12;
                }
                do {
                    int n5 = n2;
                    cArray2 = cArray2;
                    char[] cArray4 = cArray2;
                    int n6 = n2;
                    int n7 = n3;
                    while (true) {
                        cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                            case 0 -> 79;
                            case 1 -> 93;
                            case 2 -> 80;
                            case 3 -> 98;
                            case 4 -> 26;
                            case 5 -> 17;
                            default -> 17;
                        })));
                        ++n3;
                        n2 = n5;
                        if (n5 != 0) break;
                        n5 = n2;
                        cArray2 = cArray2;
                        n7 = n2;
                        cArray4 = cArray2;
                        n6 = n2;
                    }
                    cArray = cArray2;
                    n = n;
                } while (n > n3);
            }
            a = new String(cArray).intern();
        }
    }

    public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
        @NotNull
        private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        private static String[] a;
        private static String[] b;
    static {
        String[] stringArray = new String[4];
        String[] stringArray2 = new String[]{"<\u00f5\u00fc\u0089\u00a2\u00ea\u00f6$/\021\u0097\b(Cw3\u00ba4\u00adw", "z\u00f9\u0088\u0096j\u00fd\u00e4_\u00dd\u00e2\032\u00dc@\u0095A\u0097I\u009f\020\b\u00b9\u0087z\u0094$\u00ffA1"};
        int[] nArray = new int[]{11, 19};
        int[] nArray2 = new int[]{85, 109};
        int n = 0;
        for (int i = 0; i < 2; i++) {
            String string = stringArray2[i];
            int n2 = -1;
            int n3 = nArray[i];
            int n4 = nArray2[i];
            while (true) {
                n2++;
                char[] cArray = string.substring(n2, n2 + n3).toCharArray();
                for (int j = 0; j < cArray.length; j++) {
                    int n5 = switch (j % 7) {
                        case 0 -> 2;
                        case 1 -> 37;
                        case 2 -> 11;
                        case 3 -> 33;
                        case 4 -> 101;
                        case 5 -> 33;
                        default -> 67;
                    };
                    cArray[j] = (char)(cArray[j] ^ n4 ^ n5);
                }
                stringArray[n++] = new String(cArray).intern();
                n2 += n3;
                if (n2 >= string.length()) {
                    break;
                }
                n3 = string.charAt(n2);
            }
        }
        a = stringArray;
        b = new String[4];
    }


        public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull String string, long l) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"fileName");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = string;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = l;
        }

        @NotNull
        public final String a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        public final long b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        @NotNull
        public final String c() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        public final long d() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        @NotNull
        public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(@NotNull String string, long l) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"fileName");
            return new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(string, l);
        }

        public static /* synthetic */ IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI, String string, long l, int n, Object object) {
            String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            int n2 = n & 1;
            if (stringArray == null) {
                if (n2 != 0) {
                    string = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                }
                n2 = n & 2;
            }
            if (n2 != 0) {
                l = illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            }
            return illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.a(string, l);
        }

        @NotNull
        public String toString() {
            long l = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            String string = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "SoundInfo(fileName=" + string + ", fileSize=" + l + ")";
        }

        public int hashCode() {
            int n = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            n = n * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            return n;
        }

        public boolean equals(@Nullable Object object) {
            String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
            Object object2 = this;
            if (stringArray == null) {
                if (object2 == object) {
                    return true;
                }
                object2 = object;
            }
            if (stringArray == null) {
                if (!(object2 instanceof IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)) {
                    return false;
                }
                object2 = object;
            }
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI = (IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)object2;
            boolean bl = Intrinsics.areEqual((Object)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, (Object)illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            if (stringArray == null) {
                if (!bl) {
                    return false;
                }
                long l = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - illllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                bl = l == 0L;
            }
            if (stringArray == null) {
                if (bl) {
                    return false;
                }
                bl = true;
            }
            return bl;
        }

        /*
         * Unable to fully structure code
         */

        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFFDDE8) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
                    case 0 -> 223;
                    case 1 -> 127;
                    case 2 -> 217;
                    case 3 -> 16;
                    case 4 -> 247;
                    case 5 -> 226;
                    case 6 -> 163;
                    case 7 -> 20;
                    case 8 -> 26;
                    case 9 -> 198;
                    case 10 -> 206;
                    case 11 -> 84;
                    case 12 -> 88;
                    case 13 -> 11;
                    case 14 -> 230;
                    case 15 -> 159;
                    case 16 -> 130;
                    case 17 -> 18;
                    case 18 -> 6;
                    case 19 -> 167;
                    case 20 -> 5;
                    case 21 -> 60;
                    case 22 -> 7;
                    case 23 -> 36;
                    case 24 -> 205;
                    case 25 -> 170;
                    case 26 -> 46;
                    case 27 -> 111;
                    case 28 -> 114;
                    case 29 -> 101;
                    case 30 -> 143;
                    case 31 -> 202;
                    case 32 -> 234;
                    case 33 -> 90;
                    case 34 -> 148;
                    case 35 -> 1;
                    case 36 -> 29;
                    case 37 -> 142;
                    case 38 -> 44;
                    case 39 -> 38;
                    case 40 -> 246;
                    case 41 -> 78;
                    case 42 -> 189;
                    case 43 -> 197;
                    case 44 -> 72;
                    case 45 -> 185;
                    case 46 -> 248;
                    case 47 -> 249;
                    case 48 -> 58;
                    case 49 -> 4;
                    case 50 -> 28;
                    case 51 -> 137;
                    case 52 -> 252;
                    case 53 -> 32;
                    case 54 -> 39;
                    case 55 -> 196;
                    case 56 -> 178;
                    case 57 -> 254;
                    case 58 -> 92;
                    case 59 -> 112;
                    case 60 -> 67;
                    case 61 -> 40;
                    case 62 -> 235;
                    case 63 -> 182;
                    case 64 -> 33;
                    case 65 -> 102;
                    case 66 -> 173;
                    case 67 -> 56;
                    case 68 -> 253;
                    case 69 -> 41;
                    case 70 -> 239;
                    case 71 -> 25;
                    case 72 -> 255;
                    case 73 -> 104;
                    case 74 -> 98;
                    case 75 -> 166;
                    case 76 -> 162;
                    case 77 -> 164;
                    case 78 -> 24;
                    case 79 -> 68;
                    case 80 -> 184;
                    case 81 -> 65;
                    case 82 -> 9;
                    case 83 -> 155;
                    case 84 -> 120;
                    case 85 -> 229;
                    case 86 -> 50;
                    case 87 -> 55;
                    case 88 -> 82;
                    case 89 -> 251;
                    case 90 -> 79;
                    case 91 -> 87;
                    case 92 -> 204;
                    case 93 -> 123;
                    case 94 -> 224;
                    case 95 -> 157;
                    case 96 -> 237;
                    case 97 -> 207;
                    case 98 -> 186;
                    case 99 -> 180;
                    case 100 -> 97;
                    case 101 -> 14;
                    case 102 -> 76;
                    case 103 -> 139;
                    case 104 -> 242;
                    case 105 -> 176;
                    case 106 -> 168;
                    case 107 -> 172;
                    case 108 -> 94;
                    case 109 -> 66;
                    case 110 -> 135;
                    case 111 -> 231;
                    case 112 -> 220;
                    case 113 -> 171;
                    case 114 -> 154;
                    case 115 -> 21;
                    case 116 -> 64;
                    case 117 -> 63;
                    case 118 -> 153;
                    case 119 -> 218;
                    case 120 -> 238;
                    case 121 -> 125;
                    case 122 -> 144;
                    case 123 -> 222;
                    case 124 -> 245;
                    case 125 -> 85;
                    case 126 -> 141;
                    case 127 -> 250;
                    case 128 -> 8;
                    case 129 -> 34;
                    case 130 -> 175;
                    case 131 -> 83;
                    case 132 -> 70;
                    case 133 -> 188;
                    case 134 -> 128;
                    case 135 -> 149;
                    case 136 -> 150;
                    case 137 -> 138;
                    case 138 -> 3;
                    case 139 -> 115;
                    case 140 -> 89;
                    case 141 -> 151;
                    case 142 -> 13;
                    case 143 -> 106;
                    case 144 -> 103;
                    case 145 -> 71;
                    case 146 -> 122;
                    case 147 -> 190;
                    case 148 -> 109;
                    case 149 -> 121;
                    case 150 -> 51;
                    case 151 -> 193;
                    case 152 -> 187;
                    case 153 -> 174;
                    case 154 -> 192;
                    case 155 -> 244;
                    case 156 -> 243;
                    case 157 -> 241;
                    case 158 -> 105;
                    case 159 -> 177;
                    case 160 -> 69;
                    case 161 -> 95;
                    case 162 -> 147;
                    case 163 -> 228;
                    case 164 -> 108;
                    case 165 -> 213;
                    case 166 -> 240;
                    case 167 -> 42;
                    case 168 -> 146;
                    case 169 -> 37;
                    case 170 -> 134;
                    case 171 -> 99;
                    case 172 -> 80;
                    case 173 -> 158;
                    case 174 -> 199;
                    case 175 -> 110;
                    case 176 -> 117;
                    case 177 -> 131;
                    case 178 -> 52;
                    case 179 -> 215;
                    case 180 -> 140;
                    case 181 -> 156;
                    case 182 -> 119;
                    case 183 -> 126;
                    case 184 -> 200;
                    case 185 -> 129;
                    case 186 -> 179;
                    case 187 -> 31;
                    case 188 -> 17;
                    case 189 -> 75;
                    case 190 -> 145;
                    case 191 -> 195;
                    case 192 -> 15;
                    case 193 -> 93;
                    case 194 -> 0;
                    case 195 -> 201;
                    case 196 -> 57;
                    case 197 -> 169;
                    case 198 -> 12;
                    case 199 -> 86;
                    case 200 -> 152;
                    case 201 -> 100;
                    case 202 -> 23;
                    case 203 -> 208;
                    case 204 -> 221;
                    case 205 -> 132;
                    case 206 -> 209;
                    case 207 -> 81;
                    case 208 -> 212;
                    case 209 -> 133;
                    case 210 -> 203;
                    case 211 -> 236;
                    case 212 -> 194;
                    case 213 -> 227;
                    case 214 -> 107;
                    case 215 -> 91;
                    case 216 -> 77;
                    case 217 -> 43;
                    case 218 -> 30;
                    case 219 -> 116;
                    case 220 -> 216;
                    case 221 -> 211;
                    case 222 -> 181;
                    case 223 -> 74;
                    case 224 -> 49;
                    case 225 -> 113;
                    case 226 -> 35;
                    case 227 -> 10;
                    case 228 -> 232;
                    case 229 -> 161;
                    case 230 -> 183;
                    case 231 -> 160;
                    case 232 -> 53;
                    case 233 -> 124;
                    case 234 -> 27;
                    case 235 -> 61;
                    case 236 -> 96;
                    case 237 -> 19;
                    case 238 -> 233;
                    case 239 -> 62;
                    case 240 -> 191;
                    case 241 -> 54;
                    case 242 -> 214;
                    case 243 -> 136;
                    case 244 -> 73;
                    case 245 -> 225;
                    case 246 -> 2;
                    case 247 -> 47;
                    case 248 -> 22;
                    case 249 -> 210;
                    case 250 -> 118;
                    case 251 -> 59;
                    case 252 -> 48;
                    case 253 -> 45;
                    case 254 -> 165;
                    default -> 219;
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
                IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.b[n3] = new String(cArray).intern();
            }
            return b[n3];
        }
    }

  // PX-FIX synth restored from jar bytecode
  // PX-FIX synth restored from jar bytecode: getstatic + return
  public static kotlin.Lazy T() { return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII; }
}

