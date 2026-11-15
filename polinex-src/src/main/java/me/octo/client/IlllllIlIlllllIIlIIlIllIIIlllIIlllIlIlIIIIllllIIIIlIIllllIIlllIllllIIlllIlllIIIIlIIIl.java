/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Dispatchers
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client;

import java.nio.file.Path;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me.octo.client.IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl;
import me.octo.client.lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII;
import me.octo.client.lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl;
import me.octo.client.llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl
extends lIIIlllIlIIlIlIIlIIIllllllIllIllllIIIIIlIIIIllIlllIIIllIllIIIlllIIlIIlIllIIllIIlIllII<IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> {




   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2
   

    @NotNull
    private final String llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
    @NotNull
    private final String[] lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    private final int IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
    @NotNull
    private final List<String> IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
    @NotNull
    private final Lazy IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
    private static String[] h;
    private static String[] i;

    public IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String[] stringArray, int n, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"name");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"description");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"parentFolderName");
        Intrinsics.checkNotNullParameter((Object)stringArray, (String)"staticOptions");
        Intrinsics.checkNotNullParameter(list, (String)"requiredFiles");
        super(string, string2, stringArray, "Loading...", "Create a new folder", "Error loading folders");
        this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = string3;
        this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = stringArray;
        this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = n;
        this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = list;
        this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = LazyKt.lazy(() -> IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.a(this));
    }

    public /* synthetic */ IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl(String string, String string2, String string3, String[] stringArray, int n, List list, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x10) != 0) {
            n = 25;
        }
        if ((n2 & 0x20) != 0) {
            list = CollectionsKt.emptyList();
        }
        this(string, string2, string3, stringArray, n, list);
    }

    @NotNull
    protected final String R() {
        return this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
    }

    @NotNull
    protected final List<String> S() {
        return this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
    }

    private final Path T() {
        Lazy lazy = this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
        return (Path)lazy.getValue();
    }

    @Override
    @NotNull
    protected Path E() {
        return this.T();
    }

    @NotNull
    public final String[] U() {
        return this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    }

    @Nullable
    protected Object a(@NotNull Continuation<? super Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> continuation) {
        return IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.a(this, continuation);
    }

    static /* synthetic */ Object a(IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl, Continuation<? super Map<String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> continuation) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super LinkedHashMap<String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super LinkedHashMap<String,llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn var5 = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl this$0;
            private static String[] a;
            private static String[] b;
            {
                this.this$0 = illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl;
                /* PX-FIX removed super call */
            }

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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super LinkedHashMap<String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static final boolean a(Path path) {
                return StringsKt.endsWith(((Object)path).toString(), ".json", false);
            }

            private static final boolean a(Function1 function1, Object object) {
                return (Boolean)function1.invoke(object);
            }

            private static Throwable a(Throwable throwable) {
                return throwable;
            }

            /*
             * Unable to fully structure code
             */
            static {
                block20: {
    }
                IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.a = var5;
                IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.b = new String[4];
            }

            private static String a(int n, int n2) {
                int n3 = (n ^ 0xFFFFDDDE) & 0xFFFF;
                if (b[n3] == null) {
                    int n4;
                    char[] cArray = a[n3].toCharArray();
                    int n5 = switch (cArray[0] & 0xFF) {
                        case 0 -> 120;
                        case 1 -> 190;
                        case 2 -> 144;
                        case 3 -> 153;
                        case 4 -> 54;
                        case 5 -> 165;
                        case 6 -> 33;
                        case 7 -> 115;
                        case 8 -> 7;
                        case 9 -> 141;
                        case 10 -> 24;
                        case 11 -> 233;
                        case 12 -> 173;
                        case 13 -> 204;
                        case 14 -> 39;
                        case 15 -> 114;
                        case 16 -> 230;
                        case 17 -> 12;
                        case 18 -> 185;
                        case 19 -> 140;
                        case 20 -> 146;
                        case 21 -> 18;
                        case 22 -> 159;
                        case 23 -> 132;
                        case 24 -> 87;
                        case 25 -> 136;
                        case 26 -> 222;
                        case 27 -> 210;
                        case 28 -> 191;
                        case 29 -> 45;
                        case 30 -> 151;
                        case 31 -> 224;
                        case 32 -> 105;
                        case 33 -> 123;
                        case 34 -> 228;
                        case 35 -> 116;
                        case 36 -> 101;
                        case 37 -> 72;
                        case 38 -> 218;
                        case 39 -> 90;
                        case 40 -> 183;
                        case 41 -> 107;
                        case 42 -> 243;
                        case 43 -> 238;
                        case 44 -> 236;
                        case 45 -> 84;
                        case 46 -> 251;
                        case 47 -> 197;
                        case 48 -> 109;
                        case 49 -> 147;
                        case 50 -> 121;
                        case 51 -> 117;
                        case 52 -> 93;
                        case 53 -> 200;
                        case 54 -> 170;
                        case 55 -> 223;
                        case 56 -> 234;
                        case 57 -> 88;
                        case 58 -> 172;
                        case 59 -> 174;
                        case 60 -> 205;
                        case 61 -> 209;
                        case 62 -> 63;
                        case 63 -> 163;
                        case 64 -> 145;
                        case 65 -> 206;
                        case 66 -> 246;
                        case 67 -> 133;
                        case 68 -> 177;
                        case 69 -> 28;
                        case 70 -> 73;
                        case 71 -> 30;
                        case 72 -> 216;
                        case 73 -> 110;
                        case 74 -> 162;
                        case 75 -> 69;
                        case 76 -> 208;
                        case 77 -> 179;
                        case 78 -> 181;
                        case 79 -> 60;
                        case 80 -> 48;
                        case 81 -> 186;
                        case 82 -> 23;
                        case 83 -> 119;
                        case 84 -> 143;
                        case 85 -> 74;
                        case 86 -> 46;
                        case 87 -> 32;
                        case 88 -> 41;
                        case 89 -> 64;
                        case 90 -> 149;
                        case 91 -> 89;
                        case 92 -> 31;
                        case 93 -> 201;
                        case 94 -> 20;
                        case 95 -> 44;
                        case 96 -> 207;
                        case 97 -> 37;
                        case 98 -> 196;
                        case 99 -> 175;
                        case 100 -> 104;
                        case 101 -> 249;
                        case 102 -> 38;
                        case 103 -> 157;
                        case 104 -> 155;
                        case 105 -> 6;
                        case 106 -> 111;
                        case 107 -> 126;
                        case 108 -> 182;
                        case 109 -> 65;
                        case 110 -> 219;
                        case 111 -> 5;
                        case 112 -> 247;
                        case 113 -> 212;
                        case 114 -> 134;
                        case 115 -> 26;
                        case 116 -> 102;
                        case 117 -> 66;
                        case 118 -> 250;
                        case 119 -> 131;
                        case 120 -> 199;
                        case 121 -> 112;
                        case 122 -> 57;
                        case 123 -> 9;
                        case 124 -> 160;
                        case 125 -> 77;
                        case 126 -> 176;
                        case 127 -> 106;
                        case 128 -> 221;
                        case 129 -> 34;
                        case 130 -> 135;
                        case 131 -> 97;
                        case 132 -> 244;
                        case 133 -> 108;
                        case 134 -> 21;
                        case 135 -> 78;
                        case 136 -> 2;
                        case 137 -> 237;
                        case 138 -> 184;
                        case 139 -> 25;
                        case 140 -> 148;
                        case 141 -> 127;
                        case 142 -> 70;
                        case 143 -> 203;
                        case 144 -> 156;
                        case 145 -> 113;
                        case 146 -> 254;
                        case 147 -> 47;
                        case 148 -> 11;
                        case 149 -> 166;
                        case 150 -> 94;
                        case 151 -> 129;
                        case 152 -> 79;
                        case 153 -> 152;
                        case 154 -> 154;
                        case 155 -> 125;
                        case 156 -> 56;
                        case 157 -> 53;
                        case 158 -> 92;
                        case 159 -> 171;
                        case 160 -> 71;
                        case 161 -> 225;
                        case 162 -> 235;
                        case 163 -> 192;
                        case 164 -> 22;
                        case 165 -> 189;
                        case 166 -> 27;
                        case 167 -> 85;
                        case 168 -> 10;
                        case 169 -> 68;
                        case 170 -> 15;
                        case 171 -> 167;
                        case 172 -> 138;
                        case 173 -> 242;
                        case 174 -> 187;
                        case 175 -> 245;
                        case 176 -> 81;
                        case 177 -> 161;
                        case 178 -> 118;
                        case 179 -> 96;
                        case 180 -> 76;
                        case 181 -> 62;
                        case 182 -> 82;
                        case 183 -> 43;
                        case 184 -> 61;
                        case 185 -> 213;
                        case 186 -> 86;
                        case 187 -> 99;
                        case 188 -> 51;
                        case 189 -> 122;
                        case 190 -> 202;
                        case 191 -> 19;
                        case 192 -> 193;
                        case 193 -> 128;
                        case 194 -> 178;
                        case 195 -> 137;
                        case 196 -> 14;
                        case 197 -> 13;
                        case 198 -> 16;
                        case 199 -> 3;
                        case 200 -> 35;
                        case 201 -> 231;
                        case 202 -> 220;
                        case 203 -> 194;
                        case 204 -> 226;
                        case 205 -> 217;
                        case 206 -> 169;
                        case 207 -> 198;
                        case 208 -> 8;
                        case 209 -> 164;
                        case 210 -> 255;
                        case 211 -> 215;
                        case 212 -> 80;
                        case 213 -> 239;
                        case 214 -> 100;
                        case 215 -> 91;
                        case 216 -> 95;
                        case 217 -> 180;
                        case 218 -> 227;
                        case 219 -> 103;
                        case 220 -> 0;
                        case 221 -> 1;
                        case 222 -> 17;
                        case 223 -> 195;
                        case 224 -> 75;
                        case 225 -> 150;
                        case 226 -> 241;
                        case 227 -> 248;
                        case 228 -> 130;
                        case 229 -> 214;
                        case 230 -> 229;
                        case 231 -> 50;
                        case 232 -> 83;
                        case 233 -> 52;
                        case 234 -> 158;
                        case 235 -> 142;
                        case 236 -> 29;
                        case 237 -> 36;
                        case 238 -> 139;
                        case 239 -> 42;
                        case 240 -> 168;
                        case 241 -> 232;
                        case 242 -> 67;
                        case 243 -> 49;
                        case 244 -> 252;
                        case 245 -> 4;
                        case 246 -> 58;
                        case 247 -> 59;
                        case 248 -> 188;
                        case 249 -> 211;
                        case 250 -> 253;
                        case 251 -> 240;
                        case 252 -> 40;
                        case 253 -> 55;
                        case 254 -> 124;
                        default -> 98;
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
                    IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.b[n3] = new String(cArray).intern();
                }
                return b[n3];
            }
        }), continuation);
    }

    @NotNull
    protected String a(@NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        Intrinsics.checkNotNullParameter((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, (String)"item");
        return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a();
    }

    @NotNull
    protected String b(@NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        String string;
        String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        Intrinsics.checkNotNullParameter((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, (String)"item");
        String string2 = llIlIIIIllllllIIllIIlIIllIllllIllIlIIllIlllllIllIIIIllIIlIlIIlIllIIllIIIIlllIlIIIlllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a());
        String[] stringArray2 = stringArray;
        if (stringArray2 != null || (string = string2) == null) {
            string = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a();
        }
        String string3 = string;
        Object object = string3;
        if (stringArray2 == null) {
            if (((String)object).length() > this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll) {
                String string4 = string3.substring(0, this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll - 3);
                Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"substring(...)");
                object = string4 + "...";
            } else {
                object = string3;
            }
        }
        return (String)object;
    }

    protected boolean c(@NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2) {
        Intrinsics.checkNotNullParameter((Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, (String)"item");
        return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.c();
    }

    @NotNull
    protected Set<Path> a(@NotNull Map<String, ? extends llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> map) {
        String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
        Intrinsics.checkNotNullParameter(map, (String)"items");
        Object object = new Path[]{this.E()};
        Set set = SetsKt.mutableSetOf((Object[])object);
        object = map.values();
        boolean bl = false;
        String[] stringArray2 = stringArray;
        Iterator iterator = ((me.octo.client.PXDyn)object).iterator();
        while (iterator.hasNext()) {
            Object t = iterator.next();
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)t;
            boolean bl2 = false;
            Path path = this.E().resolve(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a());
            Intrinsics.checkNotNullExpressionValue((Object)path, (String)"resolve(...)");
            set.add(path);
            if (stringArray2 != null) break;
            if (stringArray2 == null) continue;
            break;
        }
        return set;
    }

    @Nullable
    public final String V() {
        return this.H();
    }

    @Nullable
    public final Object a(@NotNull String string, @NotNull List<String> list, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            final /* synthetic */ IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl this$0;
            final /* synthetic */ List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            private static String[] a;
            private static String[] b;
            {
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                this.this$0 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)(Object)(illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl));
                this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = list;
                /* PX-FIX removed super call */
            }

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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static Exception a(Exception exception) {
                return exception;
            }

            /*
             * Unable to fully structure code
             */
            static {
    }

            private static String a(int n, int n2) {
                int n3 = (n ^ 0xFFFF8B77) & 0xFFFF;
                if (b[n3] == null) {
                    int n4;
                    char[] cArray = a[n3].toCharArray();
                    int n5 = switch (cArray[0] & 0xFF) {
                        case 0 -> 251;
                        case 1 -> 60;
                        case 2 -> 177;
                        case 3 -> 193;
                        case 4 -> 204;
                        case 5 -> 157;
                        case 6 -> 70;
                        case 7 -> 235;
                        case 8 -> 250;
                        case 9 -> 161;
                        case 10 -> 75;
                        case 11 -> 213;
                        case 12 -> 41;
                        case 13 -> 99;
                        case 14 -> 175;
                        case 15 -> 82;
                        case 16 -> 29;
                        case 17 -> 62;
                        case 18 -> 138;
                        case 19 -> 253;
                        case 20 -> 22;
                        case 21 -> 117;
                        case 22 -> 78;
                        case 23 -> 72;
                        case 24 -> 124;
                        case 25 -> 132;
                        case 26 -> 7;
                        case 27 -> 217;
                        case 28 -> 98;
                        case 29 -> 57;
                        case 30 -> 180;
                        case 31 -> 246;
                        case 32 -> 194;
                        case 33 -> 83;
                        case 34 -> 64;
                        case 35 -> 121;
                        case 36 -> 19;
                        case 37 -> 27;
                        case 38 -> 118;
                        case 39 -> 205;
                        case 40 -> 0;
                        case 41 -> 73;
                        case 42 -> 191;
                        case 43 -> 108;
                        case 44 -> 6;
                        case 45 -> 104;
                        case 46 -> 51;
                        case 47 -> 17;
                        case 48 -> 202;
                        case 49 -> 195;
                        case 50 -> 119;
                        case 51 -> 149;
                        case 52 -> 71;
                        case 53 -> 165;
                        case 54 -> 146;
                        case 55 -> 2;
                        case 56 -> 100;
                        case 57 -> 160;
                        case 58 -> 102;
                        case 59 -> 206;
                        case 60 -> 209;
                        case 61 -> 183;
                        case 62 -> 212;
                        case 63 -> 126;
                        case 64 -> 154;
                        case 65 -> 86;
                        case 66 -> 77;
                        case 67 -> 11;
                        case 68 -> 187;
                        case 69 -> 201;
                        case 70 -> 237;
                        case 71 -> 211;
                        case 72 -> 203;
                        case 73 -> 136;
                        case 74 -> 178;
                        case 75 -> 215;
                        case 76 -> 24;
                        case 77 -> 150;
                        case 78 -> 54;
                        case 79 -> 255;
                        case 80 -> 179;
                        case 81 -> 110;
                        case 82 -> 244;
                        case 83 -> 152;
                        case 84 -> 137;
                        case 85 -> 122;
                        case 86 -> 8;
                        case 87 -> 35;
                        case 88 -> 66;
                        case 89 -> 240;
                        case 90 -> 14;
                        case 91 -> 23;
                        case 92 -> 85;
                        case 93 -> 79;
                        case 94 -> 219;
                        case 95 -> 63;
                        case 96 -> 96;
                        case 97 -> 159;
                        case 98 -> 46;
                        case 99 -> 130;
                        case 100 -> 52;
                        case 101 -> 53;
                        case 102 -> 129;
                        case 103 -> 144;
                        case 104 -> 59;
                        case 105 -> 9;
                        case 106 -> 114;
                        case 107 -> 89;
                        case 108 -> 158;
                        case 109 -> 162;
                        case 110 -> 31;
                        case 111 -> 190;
                        case 112 -> 87;
                        case 113 -> 163;
                        case 114 -> 227;
                        case 115 -> 74;
                        case 116 -> 40;
                        case 117 -> 135;
                        case 118 -> 210;
                        case 119 -> 248;
                        case 120 -> 50;
                        case 121 -> 234;
                        case 122 -> 15;
                        case 123 -> 238;
                        case 124 -> 174;
                        case 125 -> 116;
                        case 126 -> 68;
                        case 127 -> 254;
                        case 128 -> 247;
                        case 129 -> 147;
                        case 130 -> 168;
                        case 131 -> 106;
                        case 132 -> 131;
                        case 133 -> 30;
                        case 134 -> 230;
                        case 135 -> 125;
                        case 136 -> 18;
                        case 137 -> 199;
                        case 138 -> 80;
                        case 139 -> 36;
                        case 140 -> 151;
                        case 141 -> 92;
                        case 142 -> 84;
                        case 143 -> 236;
                        case 144 -> 224;
                        case 145 -> 185;
                        case 146 -> 12;
                        case 147 -> 170;
                        case 148 -> 245;
                        case 149 -> 249;
                        case 150 -> 214;
                        case 151 -> 198;
                        case 152 -> 101;
                        case 153 -> 103;
                        case 154 -> 134;
                        case 155 -> 115;
                        case 156 -> 3;
                        case 157 -> 188;
                        case 158 -> 65;
                        case 159 -> 142;
                        case 160 -> 37;
                        case 161 -> 120;
                        case 162 -> 225;
                        case 163 -> 239;
                        case 164 -> 208;
                        case 165 -> 233;
                        case 166 -> 172;
                        case 167 -> 32;
                        case 168 -> 216;
                        case 169 -> 107;
                        case 170 -> 197;
                        case 171 -> 222;
                        case 172 -> 143;
                        case 173 -> 20;
                        case 174 -> 34;
                        case 175 -> 166;
                        case 176 -> 81;
                        case 177 -> 176;
                        case 178 -> 38;
                        case 179 -> 229;
                        case 180 -> 228;
                        case 181 -> 156;
                        case 182 -> 153;
                        case 183 -> 164;
                        case 184 -> 218;
                        case 185 -> 207;
                        case 186 -> 232;
                        case 187 -> 112;
                        case 188 -> 56;
                        case 189 -> 4;
                        case 190 -> 5;
                        case 191 -> 148;
                        case 192 -> 43;
                        case 193 -> 90;
                        case 194 -> 192;
                        case 195 -> 26;
                        case 196 -> 173;
                        case 197 -> 67;
                        case 198 -> 28;
                        case 199 -> 200;
                        case 200 -> 182;
                        case 201 -> 243;
                        case 202 -> 220;
                        case 203 -> 93;
                        case 204 -> 242;
                        case 205 -> 111;
                        case 206 -> 95;
                        case 207 -> 221;
                        case 208 -> 127;
                        case 209 -> 105;
                        case 210 -> 44;
                        case 211 -> 13;
                        case 212 -> 145;
                        case 213 -> 10;
                        case 214 -> 189;
                        case 215 -> 184;
                        case 216 -> 69;
                        case 217 -> 140;
                        case 218 -> 49;
                        case 219 -> 88;
                        case 220 -> 196;
                        case 221 -> 155;
                        case 222 -> 109;
                        case 223 -> 97;
                        case 224 -> 91;
                        case 225 -> 21;
                        case 226 -> 231;
                        case 227 -> 94;
                        case 228 -> 39;
                        case 229 -> 45;
                        case 230 -> 167;
                        case 231 -> 47;
                        case 232 -> 76;
                        case 233 -> 55;
                        case 234 -> 61;
                        case 235 -> 186;
                        case 236 -> 133;
                        case 237 -> 139;
                        case 238 -> 33;
                        case 239 -> 171;
                        case 240 -> 16;
                        case 241 -> 123;
                        case 242 -> 223;
                        case 243 -> 141;
                        case 244 -> 48;
                        case 245 -> 42;
                        case 246 -> 169;
                        case 247 -> 25;
                        case 248 -> 226;
                        case 249 -> 128;
                        case 250 -> 241;
                        case 251 -> 58;
                        case 252 -> 181;
                        case 253 -> 252;
                        case 254 -> 113;
                        default -> 1;
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

    public final boolean a(@NotNull String string, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"folderName");
        Intrinsics.checkNotNullParameter(list, (String)"createdFiles");
        try { // PX-FIX: InterruptedException（checked）包装
        return (Boolean)BuildersKt.runBlocking((CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl this$0;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            final /* synthetic */ List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            private static String a;
            {
                this.this$0 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)(Object)(illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl));
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = list;
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
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
                        char[] cArray3 = "+~KS>2sh8UZm3q-8\u0007]{ s:z\u0007\u0018w(j'tB\u0018>1u<w\u0007\\q4s=kNQ{".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 45;
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
                                case 0 -> 101;
                                case 1 -> 50;
                                case 2 -> 10;
                                case 3 -> 18;
                                case 4 -> 51;
                                case 5 -> 107;
                                default -> 49;
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
        }));
        } catch (InterruptedException var999px2) {
           throw new RuntimeException(var999px2);
        }
    }

    @Nullable
    public final Object a(@NotNull String string, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            final /* synthetic */ IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl this$0;
            private static String[] a;
            private static String[] b;
            {
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                this.this$0 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)(Object)(illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl));
                /* PX-FIX removed super call */
            }

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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static Exception a(Exception exception) {
                return exception;
            }

            /*
             * Unable to fully structure code
             */
            static {
    }

            private static String a(int n, int n2) {
                int n3 = (n ^ 0x49EA) & 0xFFFF;
                if (b[n3] == null) {
                    int n4;
                    char[] cArray = a[n3].toCharArray();
                    int n5 = switch (cArray[0] & 0xFF) {
                        case 0 -> 46;
                        case 1 -> 56;
                        case 2 -> 233;
                        case 3 -> 66;
                        case 4 -> 248;
                        case 5 -> 219;
                        case 6 -> 241;
                        case 7 -> 157;
                        case 8 -> 31;
                        case 9 -> 6;
                        case 10 -> 4;
                        case 11 -> 131;
                        case 12 -> 69;
                        case 13 -> 49;
                        case 14 -> 112;
                        case 15 -> 126;
                        case 16 -> 10;
                        case 17 -> 79;
                        case 18 -> 63;
                        case 19 -> 224;
                        case 20 -> 183;
                        case 21 -> 123;
                        case 22 -> 9;
                        case 23 -> 106;
                        case 24 -> 138;
                        case 25 -> 204;
                        case 26 -> 220;
                        case 27 -> 19;
                        case 28 -> 228;
                        case 29 -> 201;
                        case 30 -> 38;
                        case 31 -> 96;
                        case 32 -> 65;
                        case 33 -> 64;
                        case 34 -> 59;
                        case 35 -> 238;
                        case 36 -> 169;
                        case 37 -> 11;
                        case 38 -> 116;
                        case 39 -> 28;
                        case 40 -> 127;
                        case 41 -> 144;
                        case 42 -> 101;
                        case 43 -> 251;
                        case 44 -> 36;
                        case 45 -> 210;
                        case 46 -> 158;
                        case 47 -> 199;
                        case 48 -> 240;
                        case 49 -> 128;
                        case 50 -> 135;
                        case 51 -> 211;
                        case 52 -> 100;
                        case 53 -> 114;
                        case 54 -> 237;
                        case 55 -> 90;
                        case 56 -> 161;
                        case 57 -> 217;
                        case 58 -> 113;
                        case 59 -> 118;
                        case 60 -> 205;
                        case 61 -> 197;
                        case 62 -> 12;
                        case 63 -> 200;
                        case 64 -> 239;
                        case 65 -> 180;
                        case 66 -> 172;
                        case 67 -> 243;
                        case 68 -> 55;
                        case 69 -> 185;
                        case 70 -> 54;
                        case 71 -> 68;
                        case 72 -> 254;
                        case 73 -> 130;
                        case 74 -> 89;
                        case 75 -> 222;
                        case 76 -> 181;
                        case 77 -> 170;
                        case 78 -> 192;
                        case 79 -> 122;
                        case 80 -> 20;
                        case 81 -> 124;
                        case 82 -> 108;
                        case 83 -> 25;
                        case 84 -> 43;
                        case 85 -> 150;
                        case 86 -> 206;
                        case 87 -> 195;
                        case 88 -> 5;
                        case 89 -> 84;
                        case 90 -> 234;
                        case 91 -> 29;
                        case 92 -> 255;
                        case 93 -> 110;
                        case 94 -> 208;
                        case 95 -> 139;
                        case 96 -> 22;
                        case 97 -> 193;
                        case 98 -> 173;
                        case 99 -> 44;
                        case 100 -> 14;
                        case 101 -> 174;
                        case 102 -> 184;
                        case 103 -> 62;
                        case 104 -> 221;
                        case 105 -> 229;
                        case 106 -> 77;
                        case 107 -> 117;
                        case 108 -> 226;
                        case 109 -> 134;
                        case 110 -> 1;
                        case 111 -> 83;
                        case 112 -> 236;
                        case 113 -> 48;
                        case 114 -> 209;
                        case 115 -> 125;
                        case 116 -> 159;
                        case 117 -> 60;
                        case 118 -> 87;
                        case 119 -> 40;
                        case 120 -> 93;
                        case 121 -> 246;
                        case 122 -> 52;
                        case 123 -> 166;
                        case 124 -> 92;
                        case 125 -> 163;
                        case 126 -> 0;
                        case 127 -> 71;
                        case 128 -> 18;
                        case 129 -> 16;
                        case 130 -> 202;
                        case 131 -> 3;
                        case 132 -> 98;
                        case 133 -> 67;
                        case 134 -> 78;
                        case 135 -> 171;
                        case 136 -> 17;
                        case 137 -> 32;
                        case 138 -> 142;
                        case 139 -> 30;
                        case 140 -> 136;
                        case 141 -> 76;
                        case 142 -> 95;
                        case 143 -> 94;
                        case 144 -> 154;
                        case 145 -> 104;
                        case 146 -> 8;
                        case 147 -> 107;
                        case 148 -> 103;
                        case 149 -> 212;
                        case 150 -> 146;
                        case 151 -> 196;
                        case 152 -> 253;
                        case 153 -> 165;
                        case 154 -> 148;
                        case 155 -> 80;
                        case 156 -> 53;
                        case 157 -> 151;
                        case 158 -> 99;
                        case 159 -> 232;
                        case 160 -> 13;
                        case 161 -> 155;
                        case 162 -> 207;
                        case 163 -> 72;
                        case 164 -> 61;
                        case 165 -> 177;
                        case 166 -> 115;
                        case 167 -> 160;
                        case 168 -> 21;
                        case 169 -> 91;
                        case 170 -> 168;
                        case 171 -> 215;
                        case 172 -> 34;
                        case 173 -> 42;
                        case 174 -> 102;
                        case 175 -> 191;
                        case 176 -> 81;
                        case 177 -> 203;
                        case 178 -> 227;
                        case 179 -> 156;
                        case 180 -> 41;
                        case 181 -> 242;
                        case 182 -> 88;
                        case 183 -> 26;
                        case 184 -> 223;
                        case 185 -> 132;
                        case 186 -> 119;
                        case 187 -> 152;
                        case 188 -> 189;
                        case 189 -> 133;
                        case 190 -> 140;
                        case 191 -> 111;
                        case 192 -> 109;
                        case 193 -> 245;
                        case 194 -> 186;
                        case 195 -> 214;
                        case 196 -> 2;
                        case 197 -> 47;
                        case 198 -> 149;
                        case 199 -> 85;
                        case 200 -> 137;
                        case 201 -> 39;
                        case 202 -> 121;
                        case 203 -> 23;
                        case 204 -> 33;
                        case 205 -> 82;
                        case 206 -> 164;
                        case 207 -> 249;
                        case 208 -> 105;
                        case 209 -> 178;
                        case 210 -> 45;
                        case 211 -> 143;
                        case 212 -> 225;
                        case 213 -> 235;
                        case 214 -> 50;
                        case 215 -> 167;
                        case 216 -> 37;
                        case 217 -> 188;
                        case 218 -> 129;
                        case 219 -> 75;
                        case 220 -> 247;
                        case 221 -> 58;
                        case 222 -> 7;
                        case 223 -> 51;
                        case 224 -> 190;
                        case 225 -> 162;
                        case 226 -> 194;
                        case 227 -> 176;
                        case 228 -> 213;
                        case 229 -> 244;
                        case 230 -> 231;
                        case 231 -> 15;
                        case 232 -> 187;
                        case 233 -> 218;
                        case 234 -> 216;
                        case 235 -> 141;
                        case 236 -> 35;
                        case 237 -> 250;
                        case 238 -> 70;
                        case 239 -> 24;
                        case 240 -> 153;
                        case 241 -> 147;
                        case 242 -> 97;
                        case 243 -> 27;
                        case 244 -> 179;
                        case 245 -> 73;
                        case 246 -> 120;
                        case 247 -> 145;
                        case 248 -> 252;
                        case 249 -> 57;
                        case 250 -> 230;
                        case 251 -> 175;
                        case 252 -> 182;
                        case 253 -> 198;
                        case 254 -> 74;
                        default -> 86;
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
                    llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.b[n3] = new String(cArray).intern();
                }
                return b[n3];
            }
        }), continuation);
    }

    public final boolean g(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"folderName");
        try { // PX-FIX: InterruptedException（checked）包装
        return (Boolean)BuildersKt.runBlocking((CoroutineContext)kotlin.coroutines.EmptyCoroutineContext.INSTANCE, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Boolean>, Object>(){
   public Object invoke(CoroutineScope p0, Continuation<? super Boolean> p1) { return null; } // PX-FIX abs

   public static me.octo.client.PXDyn continuation = null; // PX-FIX missing field v2
   
   public static me.octo.client.PXDyn illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl = null; // PX-FIX missing field v2
   
            int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            final /* synthetic */ IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl this$0;
            final /* synthetic */ String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            private static String a;
            {
                this.this$0 = ((IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl)(Object)(illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl));
                this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = string;
                /* PX-FIX removed super call */
            }

            /*
             * Exception decompiling
             */
            public final Object invokeSuspend(Object var1_1) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

            public final Object a(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return this.invokeSuspend(Unit.INSTANCE); // PX-FIX suspend-invoke
            }

            private static IllegalStateException a(IllegalStateException illegalStateException) {
                return illegalStateException;
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
                        char[] cArray3 = "d&\u0010\u001e;mL'`\u000e\u0017hlNb`\\\u0010~\u007fLu\"\\UrwUh,\u0019U;nJs/\\\u0011tkLr3\u0015\u001c~".toCharArray();
                        int n4 = cArray3.length;
                        n3 = 0;
                        n2 = 83;
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
                                case 0 -> 84;
                                case 1 -> 20;
                                case 2 -> 47;
                                case 3 -> 33;
                                case 4 -> 72;
                                case 5 -> 74;
                                default -> 112;
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
        }));
        } catch (InterruptedException var999px) {
           throw new RuntimeException(var999px);
        }
    }

    private static final Path a(IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) {
        return lIlIIIlIIIIIlIllIIllllIllIIIlIllllllIIIlIlIlllIIIIlIIIIIlIlIIIIlIIlIIlIllIlIIlIIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a(illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl);
    }

    public static final /* synthetic */ Path b(IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) {
        return illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.T();
    }

    public static final /* synthetic */ String[] c(IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl) {
        return illlllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
    }
        IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.h = ((String[])(Object)(var5));
        IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.i = new String[17];
    }

    private static String d(int n, int n2) {
        int n3 = (n ^ 0x6A43) & 0xFFFF;
        if (i[n3] == null) {
            int n4;
            char[] cArray = h[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 213;
                case 1 -> 254;
                case 2 -> 34;
                case 3 -> 23;
                case 4 -> 155;
                case 5 -> 4;
                case 6 -> 156;
                case 7 -> 55;
                case 8 -> 163;
                case 9 -> 219;
                case 10 -> 115;
                case 11 -> 10;
                case 12 -> 255;
                case 13 -> 11;
                case 14 -> 229;
                case 15 -> 212;
                case 16 -> 91;
                case 17 -> 65;
                case 18 -> 123;
                case 19 -> 187;
                case 20 -> 110;
                case 21 -> 35;
                case 22 -> 132;
                case 23 -> 138;
                case 24 -> 32;
                case 25 -> 7;
                case 26 -> 210;
                case 27 -> 103;
                case 28 -> 20;
                case 29 -> 41;
                case 30 -> 136;
                case 31 -> 26;
                case 32 -> 30;
                case 33 -> 172;
                case 34 -> 238;
                case 35 -> 92;
                case 36 -> 8;
                case 37 -> 100;
                case 38 -> 165;
                case 39 -> 42;
                case 40 -> 199;
                case 41 -> 27;
                case 42 -> 58;
                case 43 -> 116;
                case 44 -> 5;
                case 45 -> 126;
                case 46 -> 70;
                case 47 -> 150;
                case 48 -> 218;
                case 49 -> 179;
                case 50 -> 175;
                case 51 -> 86;
                case 52 -> 60;
                case 53 -> 97;
                case 54 -> 207;
                case 55 -> 177;
                case 56 -> 160;
                case 57 -> 29;
                case 58 -> 120;
                case 59 -> 143;
                case 60 -> 239;
                case 61 -> 146;
                case 62 -> 197;
                case 63 -> 76;
                case 64 -> 62;
                case 65 -> 185;
                case 66 -> 182;
                case 67 -> 145;
                case 68 -> 228;
                case 69 -> 88;
                case 70 -> 89;
                case 71 -> 67;
                case 72 -> 193;
                case 73 -> 81;
                case 74 -> 61;
                case 75 -> 33;
                case 76 -> 79;
                case 77 -> 248;
                case 78 -> 216;
                case 79 -> 45;
                case 80 -> 141;
                case 81 -> 95;
                case 82 -> 24;
                case 83 -> 77;
                case 84 -> 16;
                case 85 -> 154;
                case 86 -> 227;
                case 87 -> 208;
                case 88 -> 249;
                case 89 -> 161;
                case 90 -> 168;
                case 91 -> 180;
                case 92 -> 244;
                case 93 -> 22;
                case 94 -> 245;
                case 95 -> 225;
                case 96 -> 119;
                case 97 -> 247;
                case 98 -> 162;
                case 99 -> 170;
                case 100 -> 140;
                case 101 -> 173;
                case 102 -> 224;
                case 103 -> 113;
                case 104 -> 181;
                case 105 -> 108;
                case 106 -> 49;
                case 107 -> 87;
                case 108 -> 149;
                case 109 -> 69;
                case 110 -> 37;
                case 111 -> 47;
                case 112 -> 99;
                case 113 -> 6;
                case 114 -> 201;
                case 115 -> 12;
                case 116 -> 215;
                case 117 -> 9;
                case 118 -> 191;
                case 119 -> 21;
                case 120 -> 105;
                case 121 -> 211;
                case 122 -> 48;
                case 123 -> 93;
                case 124 -> 243;
                case 125 -> 82;
                case 126 -> 66;
                case 127 -> 40;
                case 128 -> 174;
                case 129 -> 44;
                case 130 -> 152;
                case 131 -> 203;
                case 132 -> 151;
                case 133 -> 230;
                case 134 -> 96;
                case 135 -> 196;
                case 136 -> 242;
                case 137 -> 253;
                case 138 -> 83;
                case 139 -> 72;
                case 140 -> 209;
                case 141 -> 117;
                case 142 -> 124;
                case 143 -> 214;
                case 144 -> 198;
                case 145 -> 122;
                case 146 -> 125;
                case 147 -> 137;
                case 148 -> 31;
                case 149 -> 102;
                case 150 -> 54;
                case 151 -> 235;
                case 152 -> 64;
                case 153 -> 232;
                case 154 -> 68;
                case 155 -> 222;
                case 156 -> 2;
                case 157 -> 206;
                case 158 -> 147;
                case 159 -> 231;
                case 160 -> 118;
                case 161 -> 133;
                case 162 -> 241;
                case 163 -> 176;
                case 164 -> 3;
                case 165 -> 167;
                case 166 -> 19;
                case 167 -> 52;
                case 168 -> 75;
                case 169 -> 128;
                case 170 -> 142;
                case 171 -> 153;
                case 172 -> 251;
                case 173 -> 43;
                case 174 -> 129;
                case 175 -> 94;
                case 176 -> 194;
                case 177 -> 184;
                case 178 -> 36;
                case 179 -> 80;
                case 180 -> 178;
                case 181 -> 217;
                case 182 -> 166;
                case 183 -> 98;
                case 184 -> 15;
                case 185 -> 200;
                case 186 -> 84;
                case 187 -> 226;
                case 188 -> 53;
                case 189 -> 144;
                case 190 -> 164;
                case 191 -> 234;
                case 192 -> 85;
                case 193 -> 148;
                case 194 -> 158;
                case 195 -> 106;
                case 196 -> 13;
                case 197 -> 195;
                case 198 -> 39;
                case 199 -> 134;
                case 200 -> 183;
                case 201 -> 130;
                case 202 -> 205;
                case 203 -> 107;
                case 204 -> 1;
                case 205 -> 250;
                case 206 -> 131;
                case 207 -> 112;
                case 208 -> 127;
                case 209 -> 157;
                case 210 -> 233;
                case 211 -> 46;
                case 212 -> 0;
                case 213 -> 114;
                case 214 -> 73;
                case 215 -> 38;
                case 216 -> 50;
                case 217 -> 171;
                case 218 -> 63;
                case 219 -> 240;
                case 220 -> 74;
                case 221 -> 204;
                case 222 -> 135;
                case 223 -> 101;
                case 224 -> 192;
                case 225 -> 159;
                case 226 -> 109;
                case 227 -> 17;
                case 228 -> 18;
                case 229 -> 236;
                case 230 -> 59;
                case 231 -> 246;
                case 232 -> 28;
                case 233 -> 169;
                case 234 -> 121;
                case 235 -> 57;
                case 236 -> 78;
                case 237 -> 237;
                case 238 -> 90;
                case 239 -> 190;
                case 240 -> 221;
                case 241 -> 14;
                case 242 -> 71;
                case 243 -> 51;
                case 244 -> 186;
                case 245 -> 220;
                case 246 -> 139;
                case 247 -> 104;
                case 248 -> 188;
                case 249 -> 189;
                case 250 -> 56;
                case 251 -> 252;
                case 252 -> 223;
                case 253 -> 111;
                case 254 -> 25;
                default -> 202;
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
            IlllllIlIlllllIIlIIlIllIIIlllIIlllIlIlIIIIllllIIIIlIIllllIIlllIllllIIlllIlllIIIIlIIIl.i[n3] = new String(cArray).intern();
        }
        return i[n3];
    }

    public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        @NotNull
        private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        private static String[] a;
        private static String[] b;

        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull String string, long l, boolean bl) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"name");
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = string;
            this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = l;
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = bl;
        }

        @NotNull
        public final String a() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        public final long b() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        public final boolean c() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        @NotNull
        public final String d() {
            return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
        }

        public final long e() {
            return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
        }

        public final boolean f() {
            return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
        }

        @NotNull
        public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(@NotNull String string, long l, boolean bl) {
            Intrinsics.checkNotNullParameter((Object)string, (String)"name");
            return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(string, l, bl);
        }

        /*
         * WARNING - void declaration
         */
        public static /* synthetic */ llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2, String string, long l, boolean bl, int n, Object object) {
            boolean bl2 = false;
            block8: {
                boolean bl3;
                block7: {
                    int var5_5 = 0; // PX-FIX
                    String[] stringArray = IllIIlllIlIIllIIIlIIIIIIlIIIIIIlIlIlIIlIIlIllIllllIIlIllllllIIlIllIlIlIIIIIllIllIIlIl.ao();
                    bl3 = ((var5_5 & 1) != 0);
                    if (stringArray == null) {
                        if (bl3) {
                            string = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        }
                        bl3 = ((var5_5 & 2) != 0);
                    }
                    if (stringArray == null) {
                        if (bl3) {
                            l = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                        }
                        bl3 = ((var5_5 & 4) != 0);
                    }
                    if (stringArray != null) break block7;
                    if (!bl3) break block8;
                    bl3 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                }
                bl2 = bl3;
            }
            return llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.a(string, l, bl2);
        }

        @NotNull
        public String toString() {
            boolean bl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            long l = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            String string = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            return "FolderInfo(name=" + string + ", lastModified=" + l + ", hasRequiredFiles=" + bl + ")";
        }

        public int hashCode() {
            int n = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.hashCode();
            n = n * 31 + Long.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            n = n * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
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
                if (!(object2 instanceof llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)) {
                    return false;
                }
                object2 = object;
            }
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2 = (llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)object2;
            boolean bl = Intrinsics.areEqual((Object)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, (Object)llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            if (stringArray == null) {
                if (!bl) {
                    return false;
                }
                long l = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII - llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                bl = l == 0L;
            }
            if (stringArray == null) {
                if (bl) {
                    return false;
                }
                bl = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            }
            if (stringArray == null) {
                if (bl != llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll2.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                    return false;
                }
                bl = true;
            }
            return bl;
        }

        /*
         * Unable to fully structure code
         */
        static {
    }

        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFF943D) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
                    case 0 -> 208;
                    case 1 -> 133;
                    case 2 -> 206;
                    case 3 -> 72;
                    case 4 -> 160;
                    case 5 -> 21;
                    case 6 -> 58;
                    case 7 -> 169;
                    case 8 -> 63;
                    case 9 -> 126;
                    case 10 -> 69;
                    case 11 -> 130;
                    case 12 -> 186;
                    case 13 -> 219;
                    case 14 -> 34;
                    case 15 -> 35;
                    case 16 -> 52;
                    case 17 -> 152;
                    case 18 -> 101;
                    case 19 -> 194;
                    case 20 -> 14;
                    case 21 -> 43;
                    case 22 -> 40;
                    case 23 -> 16;
                    case 24 -> 10;
                    case 25 -> 119;
                    case 26 -> 225;
                    case 27 -> 209;
                    case 28 -> 83;
                    case 29 -> 102;
                    case 30 -> 143;
                    case 31 -> 8;
                    case 32 -> 92;
                    case 33 -> 6;
                    case 34 -> 123;
                    case 35 -> 180;
                    case 36 -> 94;
                    case 37 -> 3;
                    case 38 -> 26;
                    case 39 -> 245;
                    case 40 -> 90;
                    case 41 -> 4;
                    case 42 -> 244;
                    case 43 -> 82;
                    case 44 -> 142;
                    case 45 -> 107;
                    case 46 -> 144;
                    case 47 -> 81;
                    case 48 -> 74;
                    case 49 -> 67;
                    case 50 -> 253;
                    case 51 -> 166;
                    case 52 -> 231;
                    case 53 -> 91;
                    case 54 -> 95;
                    case 55 -> 162;
                    case 56 -> 154;
                    case 57 -> 127;
                    case 58 -> 168;
                    case 59 -> 85;
                    case 60 -> 11;
                    case 61 -> 232;
                    case 62 -> 153;
                    case 63 -> 170;
                    case 64 -> 236;
                    case 65 -> 100;
                    case 66 -> 105;
                    case 67 -> 255;
                    case 68 -> 38;
                    case 69 -> 227;
                    case 70 -> 109;
                    case 71 -> 134;
                    case 72 -> 218;
                    case 73 -> 193;
                    case 74 -> 213;
                    case 75 -> 122;
                    case 76 -> 201;
                    case 77 -> 59;
                    case 78 -> 187;
                    case 79 -> 185;
                    case 80 -> 68;
                    case 81 -> 88;
                    case 82 -> 210;
                    case 83 -> 149;
                    case 84 -> 189;
                    case 85 -> 174;
                    case 86 -> 211;
                    case 87 -> 238;
                    case 88 -> 37;
                    case 89 -> 121;
                    case 90 -> 233;
                    case 91 -> 172;
                    case 92 -> 49;
                    case 93 -> 158;
                    case 94 -> 9;
                    case 95 -> 20;
                    case 96 -> 61;
                    case 97 -> 223;
                    case 98 -> 39;
                    case 99 -> 207;
                    case 100 -> 41;
                    case 101 -> 175;
                    case 102 -> 147;
                    case 103 -> 115;
                    case 104 -> 216;
                    case 105 -> 116;
                    case 106 -> 48;
                    case 107 -> 150;
                    case 108 -> 89;
                    case 109 -> 203;
                    case 110 -> 50;
                    case 111 -> 51;
                    case 112 -> 22;
                    case 113 -> 222;
                    case 114 -> 112;
                    case 115 -> 13;
                    case 116 -> 141;
                    case 117 -> 17;
                    case 118 -> 15;
                    case 119 -> 246;
                    case 120 -> 217;
                    case 121 -> 157;
                    case 122 -> 252;
                    case 123 -> 146;
                    case 124 -> 65;
                    case 125 -> 32;
                    case 126 -> 248;
                    case 127 -> 46;
                    case 128 -> 164;
                    case 129 -> 84;
                    case 130 -> 25;
                    case 131 -> 226;
                    case 132 -> 161;
                    case 133 -> 179;
                    case 134 -> 243;
                    case 135 -> 97;
                    case 136 -> 99;
                    case 137 -> 120;
                    case 138 -> 184;
                    case 139 -> 73;
                    case 140 -> 64;
                    case 141 -> 221;
                    case 142 -> 66;
                    case 143 -> 173;
                    case 144 -> 136;
                    case 145 -> 235;
                    case 146 -> 159;
                    case 147 -> 113;
                    case 148 -> 212;
                    case 149 -> 190;
                    case 150 -> 1;
                    case 151 -> 86;
                    case 152 -> 44;
                    case 153 -> 198;
                    case 154 -> 28;
                    case 155 -> 202;
                    case 156 -> 199;
                    case 157 -> 250;
                    case 158 -> 0;
                    case 159 -> 155;
                    case 160 -> 215;
                    case 161 -> 19;
                    case 162 -> 47;
                    case 163 -> 117;
                    case 164 -> 182;
                    case 165 -> 156;
                    case 166 -> 24;
                    case 167 -> 247;
                    case 168 -> 60;
                    case 169 -> 98;
                    case 170 -> 2;
                    case 171 -> 167;
                    case 172 -> 27;
                    case 173 -> 93;
                    case 174 -> 87;
                    case 175 -> 71;
                    case 176 -> 140;
                    case 177 -> 30;
                    case 178 -> 249;
                    case 179 -> 124;
                    case 180 -> 135;
                    case 181 -> 192;
                    case 182 -> 220;
                    case 183 -> 176;
                    case 184 -> 77;
                    case 185 -> 138;
                    case 186 -> 224;
                    case 187 -> 125;
                    case 188 -> 197;
                    case 189 -> 177;
                    case 190 -> 237;
                    case 191 -> 234;
                    case 192 -> 70;
                    case 193 -> 56;
                    case 194 -> 165;
                    case 195 -> 178;
                    case 196 -> 191;
                    case 197 -> 103;
                    case 198 -> 254;
                    case 199 -> 163;
                    case 200 -> 114;
                    case 201 -> 118;
                    case 202 -> 204;
                    case 203 -> 240;
                    case 204 -> 80;
                    case 205 -> 229;
                    case 206 -> 171;
                    case 207 -> 104;
                    case 208 -> 62;
                    case 209 -> 241;
                    case 210 -> 242;
                    case 211 -> 106;
                    case 212 -> 78;
                    case 213 -> 129;
                    case 214 -> 75;
                    case 215 -> 131;
                    case 216 -> 57;
                    case 217 -> 230;
                    case 218 -> 196;
                    case 219 -> 110;
                    case 220 -> 31;
                    case 221 -> 195;
                    case 222 -> 200;
                    case 223 -> 29;
                    case 224 -> 5;
                    case 225 -> 239;
                    case 226 -> 42;
                    case 227 -> 214;
                    case 228 -> 79;
                    case 229 -> 139;
                    case 230 -> 145;
                    case 231 -> 53;
                    case 232 -> 54;
                    case 233 -> 148;
                    case 234 -> 108;
                    case 235 -> 45;
                    case 236 -> 55;
                    case 237 -> 183;
                    case 238 -> 23;
                    case 239 -> 151;
                    case 240 -> 33;
                    case 241 -> 132;
                    case 242 -> 7;
                    case 243 -> 205;
                    case 244 -> 251;
                    case 245 -> 128;
                    case 246 -> 12;
                    case 247 -> 36;
                    case 248 -> 96;
                    case 249 -> 76;
                    case 250 -> 111;
                    case 251 -> 228;
                    case 252 -> 188;
                    case 253 -> 18;
                    case 254 -> 181;
                    default -> 137;
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
                llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.b[n3] = new String(cArray).intern();
            }
            return b[n3];
        }
    }
}

