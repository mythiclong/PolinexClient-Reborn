/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.shaders.ShaderSource
 *  com.mojang.blaze3d.shaders.ShaderType
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.resources.Identifier
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.octo.client;

import com.mojang.blaze3d.shaders.ShaderSource;
import com.mojang.blaze3d.shaders.ShaderType;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI;
import me.octo.client.Polinex;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract sealed class lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI
implements ShaderSource {
    @NotNull
    public static PXEvMid IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    @NotNull
    private final ShaderType lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    @NotNull
    private final Object2ObjectOpenHashMap<Identifier, String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
    private static String[] a;
    private static String[] b;


    static {
        String[] stringArray = new String[6];
        String[] stringArray2 = new String[]{"\u00d7\u00b9\u00e1\u00a9l\u0087P9z\036\u008f\037\u008dg\002\u009c}I\u00f4\004g\u00e4\u00c1\u0086\006\u00d8\u008do\013\u00bc+\n\027\u00e2d\u00f3v\u0084\u00aa\017\u00c2p", "6\u00b1\u009f\u009c\036\u00bb_\004qo\001c"};
        int[] nArray = new int[]{19, 7};
        int[] nArray2 = new int[]{10, 101};
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
                        case 0 -> 55;
                        case 1 -> 80;
                        case 2 -> 10;
                        case 3 -> 104;
                        case 4 -> 77;
                        case 5 -> 118;
                        default -> 26;
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
        b = new String[6];
        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new PXEvMid(null);
    }
    private lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI(ShaderType shaderType) {
        this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = shaderType;
        this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Object2ObjectOpenHashMap();
    }

    @NotNull
    public final ShaderType a() {
        return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
    }

    @NotNull
    protected final Identifier a(@NotNull String string, @NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)string2, (String)"path");
        return this.b(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getName() + "/" + string, string2);
    }

    private final Identifier b(String string, String string2) {
        Identifier identifier = Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a("shader/" + string);
        String string3 = (String)this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put((Identifier)(Object)identifier, String.valueOf((Object)Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.b(string2)));
        if (string3 != null) {
            String string4 = string3;
            boolean bl = false;
            throw new IllegalStateException(("Duplicated shader: " + identifier).toString());
        }
        return identifier;
    }

    @Nullable
    public String get(@NotNull Identifier identifier, @NotNull ShaderType shaderType) {
        Object object;
        block4: {
            block5: {
                boolean bl = IIllIlllIlIIllIlIIIlllIIIIIIllllllIIlIIIIlllIIIllllIIIIIIIlIllIllIIIIllIIIlIllIlIIIlI.PXEvMid.b();
                Intrinsics.checkNotNullParameter((Object)identifier, (String)"identifier");
                boolean bl2 = bl;
                try {
                    try {
                        Intrinsics.checkNotNullParameter((Object)shaderType, (String)"type");
                        object = shaderType;
                        if (!bl2) break block4;
                        if (object == this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.a(illegalStateException);
                    }
                    return null;
                }
                catch (IllegalStateException illegalStateException) {
                    throw lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.a(illegalStateException);
                }
            }
            object = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get((Object)identifier);
        }
        return (String)object;
    }

    public /* synthetic */ lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI(ShaderType shaderType, DefaultConstructorMarker defaultConstructorMarker) {
        this(shaderType);
    }

    /*
     * Unable to fully structure code
     */

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static String a(int n, int n2) {
        int n3 = (n ^ 0xFFFF82E1) & 0xFFFF;
        if (b[n3] == null) {
            int n4;
            char[] cArray = a[n3].toCharArray();
            int n5 = switch (cArray[0] & 0xFF) {
                case 0 -> 107;
                case 1 -> 7;
                case 2 -> 82;
                case 3 -> 193;
                case 4 -> 131;
                case 5 -> 199;
                case 6 -> 186;
                case 7 -> 252;
                case 8 -> 229;
                case 9 -> 32;
                case 10 -> 182;
                case 11 -> 154;
                case 12 -> 76;
                case 13 -> 25;
                case 14 -> 95;
                case 15 -> 163;
                case 16 -> 157;
                case 17 -> 94;
                case 18 -> 143;
                case 19 -> 57;
                case 20 -> 228;
                case 21 -> 218;
                case 22 -> 75;
                case 23 -> 155;
                case 24 -> 211;
                case 25 -> 151;
                case 26 -> 205;
                case 27 -> 100;
                case 28 -> 16;
                case 29 -> 26;
                case 30 -> 244;
                case 31 -> 233;
                case 32 -> 2;
                case 33 -> 88;
                case 34 -> 230;
                case 35 -> 235;
                case 36 -> 56;
                case 37 -> 45;
                case 38 -> 187;
                case 39 -> 33;
                case 40 -> 61;
                case 41 -> 129;
                case 42 -> 101;
                case 43 -> 156;
                case 44 -> 197;
                case 45 -> 4;
                case 46 -> 43;
                case 47 -> 220;
                case 48 -> 55;
                case 49 -> 51;
                case 50 -> 141;
                case 51 -> 60;
                case 52 -> 213;
                case 53 -> 216;
                case 54 -> 194;
                case 55 -> 170;
                case 56 -> 169;
                case 57 -> 5;
                case 58 -> 19;
                case 59 -> 27;
                case 60 -> 239;
                case 61 -> 226;
                case 62 -> 144;
                case 63 -> 253;
                case 64 -> 99;
                case 65 -> 184;
                case 66 -> 102;
                case 67 -> 237;
                case 68 -> 133;
                case 69 -> 250;
                case 70 -> 59;
                case 71 -> 13;
                case 72 -> 35;
                case 73 -> 172;
                case 74 -> 9;
                case 75 -> 160;
                case 76 -> 185;
                case 77 -> 152;
                case 78 -> 217;
                case 79 -> 191;
                case 80 -> 39;
                case 81 -> 231;
                case 82 -> 31;
                case 83 -> 242;
                case 84 -> 168;
                case 85 -> 188;
                case 86 -> 53;
                case 87 -> 139;
                case 88 -> 147;
                case 89 -> 65;
                case 90 -> 96;
                case 91 -> 123;
                case 92 -> 10;
                case 93 -> 1;
                case 94 -> 6;
                case 95 -> 149;
                case 96 -> 243;
                case 97 -> 46;
                case 98 -> 79;
                case 99 -> 192;
                case 100 -> 180;
                case 101 -> 44;
                case 102 -> 136;
                case 103 -> 104;
                case 104 -> 254;
                case 105 -> 117;
                case 106 -> 181;
                case 107 -> 112;
                case 108 -> 109;
                case 109 -> 23;
                case 110 -> 125;
                case 111 -> 36;
                case 112 -> 37;
                case 113 -> 47;
                case 114 -> 106;
                case 115 -> 221;
                case 116 -> 81;
                case 117 -> 145;
                case 118 -> 110;
                case 119 -> 202;
                case 120 -> 83;
                case 121 -> 134;
                case 122 -> 69;
                case 123 -> 68;
                case 124 -> 86;
                case 125 -> 236;
                case 126 -> 72;
                case 127 -> 240;
                case 128 -> 64;
                case 129 -> 62;
                case 130 -> 97;
                case 131 -> 189;
                case 132 -> 232;
                case 133 -> 48;
                case 134 -> 171;
                case 135 -> 74;
                case 136 -> 18;
                case 137 -> 179;
                case 138 -> 164;
                case 139 -> 137;
                case 140 -> 40;
                case 141 -> 166;
                case 142 -> 251;
                case 143 -> 175;
                case 144 -> 80;
                case 145 -> 66;
                case 146 -> 84;
                case 147 -> 20;
                case 148 -> 174;
                case 149 -> 116;
                case 150 -> 122;
                case 151 -> 224;
                case 152 -> 140;
                case 153 -> 105;
                case 154 -> 219;
                case 155 -> 34;
                case 156 -> 234;
                case 157 -> 203;
                case 158 -> 38;
                case 159 -> 150;
                case 160 -> 71;
                case 161 -> 214;
                case 162 -> 0;
                case 163 -> 50;
                case 164 -> 78;
                case 165 -> 135;
                case 166 -> 89;
                case 167 -> 11;
                case 168 -> 176;
                case 169 -> 90;
                case 170 -> 22;
                case 171 -> 58;
                case 172 -> 248;
                case 173 -> 173;
                case 174 -> 120;
                case 175 -> 67;
                case 176 -> 54;
                case 177 -> 8;
                case 178 -> 165;
                case 179 -> 132;
                case 180 -> 227;
                case 181 -> 138;
                case 182 -> 42;
                case 183 -> 159;
                case 184 -> 14;
                case 185 -> 114;
                case 186 -> 49;
                case 187 -> 24;
                case 188 -> 223;
                case 189 -> 111;
                case 190 -> 153;
                case 191 -> 93;
                case 192 -> 128;
                case 193 -> 178;
                case 194 -> 121;
                case 195 -> 200;
                case 196 -> 142;
                case 197 -> 158;
                case 198 -> 52;
                case 199 -> 167;
                case 200 -> 63;
                case 201 -> 246;
                case 202 -> 148;
                case 203 -> 195;
                case 204 -> 249;
                case 205 -> 245;
                case 206 -> 113;
                case 207 -> 222;
                case 208 -> 161;
                case 209 -> 210;
                case 210 -> 15;
                case 211 -> 198;
                case 212 -> 29;
                case 213 -> 12;
                case 214 -> 73;
                case 215 -> 98;
                case 216 -> 206;
                case 217 -> 17;
                case 218 -> 190;
                case 219 -> 70;
                case 220 -> 119;
                case 221 -> 208;
                case 222 -> 201;
                case 223 -> 241;
                case 224 -> 196;
                case 225 -> 118;
                case 226 -> 85;
                case 227 -> 103;
                case 228 -> 225;
                case 229 -> 146;
                case 230 -> 124;
                case 231 -> 162;
                case 232 -> 212;
                case 233 -> 77;
                case 234 -> 87;
                case 235 -> 130;
                case 236 -> 215;
                case 237 -> 247;
                case 238 -> 28;
                case 239 -> 209;
                case 240 -> 177;
                case 241 -> 30;
                case 242 -> 41;
                case 243 -> 183;
                case 244 -> 127;
                case 245 -> 91;
                case 246 -> 204;
                case 247 -> 238;
                case 248 -> 255;
                case 249 -> 21;
                case 250 -> 108;
                case 251 -> 207;
                case 252 -> 3;
                case 253 -> 115;
                case 254 -> 126;
                default -> 92;
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
            lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.b[n3] = new String(cArray).intern();
        }
        return b[n3];
    }

    public static final class PXEvMid
    implements ShaderSource {
        private static String[] a;
        private static String[] b;
        static {
            String[] var5 = new String[2];
            int var3 = 0;
            String var2 = "\u00ce\u00a2\u008al\t\u00928\u00b9\u001bs\n\u00b0O\u0018V\u00ce\u0085\u00c13E'";
            int var4 = var2.length();
            int var1 = 10;
            int var0 = -1;
        
            while (true) {
                byte var6 = 86;
                char[] var7 = var2.substring(++var0, var0 + var1).toCharArray();
                for (int var8 = 0; var8 < var7.length; ++var8) {
                    var7[var8] = (char)(var7[var8] ^ var6 ^ switch (var8 % 7) {
                        case 0 -> 127;
                        case 1 -> 9;
                        case 2 -> 1;
                        case 3 -> 3;
                        case 4 -> 89;
                        case 5 -> 41;
                        default -> 50;
                    });
                }
                var5[var3++] = new String(var7).intern();
                if ((var0 += var1) >= var4) {
                    break;
                }
                var1 = var2.charAt(var0);
            }
            a = var5;
            b = new String[2];
        }

        private PXEvMid() {
        }

        /*
         * Exception decompiling
         */
        @Nullable
   public String get(Identifier var1, ShaderType var2) {
      Intrinsics.checkNotNullParameter(var1, "identifier");
      Intrinsics.checkNotNullParameter(var2, "shaderType");
      return var2 == ShaderType.VERTEX
         ? lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var1, var2)
         : lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var1, var2);
   }

        public /* synthetic */ PXEvMid(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
            return noWhenBranchMatchedException;
        }

        /*
         * Unable to fully structure code
         */

        private static String a(int n, int n2) {
            int n3 = (n ^ 0xFFFFE663) & 0xFFFF;
            if (b[n3] == null) {
                int n4;
                char[] cArray = a[n3].toCharArray();
                int n5 = switch (cArray[0] & 0xFF) {
                    case 0 -> 10;
                    case 1 -> 155;
                    case 2 -> 183;
                    case 3 -> 129;
                    case 4 -> 100;
                    case 5 -> 141;
                    case 6 -> 140;
                    case 7 -> 153;
                    case 8 -> 66;
                    case 9 -> 84;
                    case 10 -> 18;
                    case 11 -> 4;
                    case 12 -> 52;
                    case 13 -> 43;
                    case 14 -> 232;
                    case 15 -> 215;
                    case 16 -> 171;
                    case 17 -> 128;
                    case 18 -> 225;
                    case 19 -> 26;
                    case 20 -> 152;
                    case 21 -> 123;
                    case 22 -> 138;
                    case 23 -> 67;
                    case 24 -> 179;
                    case 25 -> 99;
                    case 26 -> 42;
                    case 27 -> 11;
                    case 28 -> 135;
                    case 29 -> 190;
                    case 30 -> 45;
                    case 31 -> 114;
                    case 32 -> 86;
                    case 33 -> 174;
                    case 34 -> 253;
                    case 35 -> 117;
                    case 36 -> 151;
                    case 37 -> 30;
                    case 38 -> 104;
                    case 39 -> 241;
                    case 40 -> 109;
                    case 41 -> 35;
                    case 42 -> 73;
                    case 43 -> 82;
                    case 44 -> 8;
                    case 45 -> 32;
                    case 46 -> 95;
                    case 47 -> 172;
                    case 48 -> 218;
                    case 49 -> 209;
                    case 50 -> 40;
                    case 51 -> 130;
                    case 52 -> 57;
                    case 53 -> 207;
                    case 54 -> 16;
                    case 55 -> 237;
                    case 56 -> 103;
                    case 57 -> 167;
                    case 58 -> 166;
                    case 59 -> 61;
                    case 60 -> 36;
                    case 61 -> 254;
                    case 62 -> 46;
                    case 63 -> 127;
                    case 64 -> 216;
                    case 65 -> 224;
                    case 66 -> 58;
                    case 67 -> 118;
                    case 68 -> 122;
                    case 69 -> 29;
                    case 70 -> 41;
                    case 71 -> 191;
                    case 72 -> 13;
                    case 73 -> 251;
                    case 74 -> 143;
                    case 75 -> 33;
                    case 76 -> 168;
                    case 77 -> 120;
                    case 78 -> 124;
                    case 79 -> 180;
                    case 80 -> 98;
                    case 81 -> 234;
                    case 82 -> 64;
                    case 83 -> 187;
                    case 84 -> 48;
                    case 85 -> 28;
                    case 86 -> 75;
                    case 87 -> 238;
                    case 88 -> 247;
                    case 89 -> 223;
                    case 90 -> 150;
                    case 91 -> 246;
                    case 92 -> 80;
                    case 93 -> 229;
                    case 94 -> 14;
                    case 95 -> 221;
                    case 96 -> 74;
                    case 97 -> 189;
                    case 98 -> 115;
                    case 99 -> 55;
                    case 100 -> 148;
                    case 101 -> 83;
                    case 102 -> 65;
                    case 103 -> 147;
                    case 104 -> 70;
                    case 105 -> 72;
                    case 106 -> 25;
                    case 107 -> 31;
                    case 108 -> 144;
                    case 109 -> 228;
                    case 110 -> 231;
                    case 111 -> 248;
                    case 112 -> 116;
                    case 113 -> 21;
                    case 114 -> 220;
                    case 115 -> 37;
                    case 116 -> 56;
                    case 117 -> 195;
                    case 118 -> 131;
                    case 119 -> 160;
                    case 120 -> 27;
                    case 121 -> 1;
                    case 122 -> 20;
                    case 123 -> 68;
                    case 124 -> 107;
                    case 125 -> 165;
                    case 126 -> 175;
                    case 127 -> 47;
                    case 128 -> 210;
                    case 129 -> 164;
                    case 130 -> 173;
                    case 131 -> 22;
                    case 132 -> 203;
                    case 133 -> 249;
                    case 134 -> 85;
                    case 135 -> 185;
                    case 136 -> 198;
                    case 137 -> 59;
                    case 138 -> 157;
                    case 139 -> 233;
                    case 140 -> 102;
                    case 141 -> 177;
                    case 142 -> 145;
                    case 143 -> 213;
                    case 144 -> 142;
                    case 145 -> 200;
                    case 146 -> 242;
                    case 147 -> 60;
                    case 148 -> 211;
                    case 149 -> 17;
                    case 150 -> 108;
                    case 151 -> 19;
                    case 152 -> 170;
                    case 153 -> 169;
                    case 154 -> 3;
                    case 155 -> 184;
                    case 156 -> 199;
                    case 157 -> 6;
                    case 158 -> 139;
                    case 159 -> 163;
                    case 160 -> 250;
                    case 161 -> 236;
                    case 162 -> 194;
                    case 163 -> 214;
                    case 164 -> 154;
                    case 165 -> 96;
                    case 166 -> 222;
                    case 167 -> 106;
                    case 168 -> 193;
                    case 169 -> 2;
                    case 170 -> 0;
                    case 171 -> 255;
                    case 172 -> 90;
                    case 173 -> 212;
                    case 174 -> 54;
                    case 175 -> 235;
                    case 176 -> 149;
                    case 177 -> 94;
                    case 178 -> 89;
                    case 179 -> 93;
                    case 180 -> 51;
                    case 181 -> 243;
                    case 182 -> 176;
                    case 183 -> 91;
                    case 184 -> 69;
                    case 185 -> 119;
                    case 186 -> 217;
                    case 187 -> 197;
                    case 188 -> 201;
                    case 189 -> 92;
                    case 190 -> 88;
                    case 191 -> 208;
                    case 192 -> 5;
                    case 193 -> 12;
                    case 194 -> 133;
                    case 195 -> 226;
                    case 196 -> 134;
                    case 197 -> 53;
                    case 198 -> 240;
                    case 199 -> 34;
                    case 200 -> 137;
                    case 201 -> 146;
                    case 202 -> 244;
                    case 203 -> 161;
                    case 204 -> 159;
                    case 205 -> 196;
                    case 206 -> 111;
                    case 207 -> 181;
                    case 208 -> 121;
                    case 209 -> 182;
                    case 210 -> 110;
                    case 211 -> 219;
                    case 212 -> 101;
                    case 213 -> 97;
                    case 214 -> 125;
                    case 215 -> 24;
                    case 216 -> 252;
                    case 217 -> 62;
                    case 218 -> 105;
                    case 219 -> 205;
                    case 220 -> 156;
                    case 221 -> 112;
                    case 222 -> 188;
                    case 223 -> 202;
                    case 224 -> 76;
                    case 225 -> 44;
                    case 226 -> 126;
                    case 227 -> 79;
                    case 228 -> 158;
                    case 229 -> 245;
                    case 230 -> 78;
                    case 231 -> 38;
                    case 232 -> 136;
                    case 233 -> 227;
                    case 234 -> 81;
                    case 235 -> 87;
                    case 236 -> 178;
                    case 237 -> 9;
                    case 238 -> 71;
                    case 239 -> 204;
                    case 240 -> 7;
                    case 241 -> 113;
                    case 242 -> 132;
                    case 243 -> 239;
                    case 244 -> 230;
                    case 245 -> 49;
                    case 246 -> 206;
                    case 247 -> 39;
                    case 248 -> 186;
                    case 249 -> 23;
                    case 250 -> 15;
                    case 251 -> 192;
                    case 252 -> 162;
                    case 253 -> 77;
                    case 254 -> 63;
                    default -> 50;
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
                PXEvMid.b[n3] = new String(cArray).intern();
            }
            return b[n3];
        }

        public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
            public static /* synthetic */ int[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

            static {
                int[] nArray = new int[ShaderType.values().length];
                try {
                    nArray[ShaderType.VERTEX.ordinal()] = 1;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[ShaderType.FRAGMENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = nArray;
            }
        }
    }

    public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
    extends lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI {
        @NotNull
        public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        @JvmField
        @NotNull
        public static Identifier IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
        @JvmField
        @NotNull
        public static Identifier IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
        @JvmField
        @NotNull
        public static Identifier IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
        @JvmField
        @NotNull
        public static Identifier lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
        @JvmField
        @NotNull
        public static Identifier IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
        @JvmField
        @NotNull
        public static Identifier llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
        @JvmField
        @NotNull
        public static Identifier lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
        @JvmField
        @NotNull
        public static Identifier lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
        @JvmField
        @NotNull
        public static Identifier lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
        @JvmField
        @NotNull
        public static Identifier lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
        @JvmField
        @NotNull
        public static Identifier IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
        @JvmField
        @NotNull
        public static Identifier llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
        @JvmField
        @NotNull
        public static Identifier IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
        @JvmField
        @NotNull
        public static Identifier IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
        @JvmField
        @NotNull
        public static Identifier IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
        @JvmField
        @NotNull
        public static Identifier IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
        @JvmField
        @NotNull
        public static Identifier llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
        @JvmField
        @NotNull
        public static Identifier IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
        @JvmField
        @NotNull
        public static Identifier lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
        @JvmField
        @NotNull
        public static Identifier llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
        @JvmField
        @NotNull
        public static Identifier lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
        @JvmField
        @NotNull
        public static Identifier IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;


        static {
            String[] stringArray = new String[44];
            String[] stringArray2 = new String[]{"[`P\022k4z\026DzW!p?sUaM\bg\005k[JG\037o?mU!G}E\032g(l\033eK\rvu}XzK\023]9pYeK\rk.z\032sV\037e\tSyK\t]>pC{\t[`P\022k4zk}\034G}E\032g(l\033fG\fg?q\033rH\021u\005s]{APd)w\006SyK\t],\"G}E\032g(l\033zQ\nn3qQ:N\030c\005|[xT\021q3kQ;B\fc=\033G}E\032g(l\033sM\022nuy]yH!`6v@;B\fc=\004RmE\037\021G}E\032g(l\033wH\027vtyFtC\026G}E\032g(l\033eK\rvuyLtEPd(~S\036G}E\032g(l\033fG\fg?q\033eE\rq.wFzQ\031jtyG}\004VyM\n\036G}E\032g(l\033zQ\nn3qQ:K\013v6vZp{\b,<mUr\034G}E\032g(l\033eK\rvu}XzK\023]8sAg\n\030p;x\t^sE!d6p[q\t[`P\022k4zkc'G}E\032g(l\033gA\022c.vBp{\nm\005|UxA\fcuo[fM\nk5q\032sW\026\035G}E\032g(l\033zQ\nn3qQ:N\030c\005xXzSPd(~S\006SyK\t]2\033G}E\032g(l\033zQ\nn3qQ:C\022m-@\\;B\fc=\035G}E\032g(l\033eK\rvur[aM\021l\005}X`VPd(~S\tR|H\022]8s]a\035G}E\032g(l\033zQ\nn3qQ:N\030c\005rUfOPd(~S\r^sE!a5rDzW\027v?\tSyK\t]6vZp\034G}E\032g(l\033zQ\nn3qQ:C\022m-@Ae\n\030p;x\026G}E\032g(l\033rH\021uuxXzSPd(~S\013YzP\027m4@VyQ\f\036G}E\032g(l\033zQ\nn3qQ:N\030c\005yXzK\032,<mUr\033G}E\032g(l\033zQ\nn3qQ:C\022m-@B;B\fc=#G}E\032g(l\033zQ\nn3qQ:A\020v3kMJK\013v6vZp\n\030p;x\022GvV\033g4@DtW\rv2m[`C\026\036G}E\032g(l\033eK\rvu}XzK\023]8m]rL\n,<mUr\004SyK\t\nVyK\021o\005}X`V\036G}E\032g(l\033zQ\nn3qQ:K\013v6vZp{\026,<mUr\fVyK\021o\005}F|C\026v\b^sE!o;l_\b^sE!e6pC\007SyK\t]/o", "\013$\026L2X!\006%\tL,n6\f\036\032 \030G:u1F'\fW3n,\fg\036O0p\035\r'\016Mqa0\b/"};
            int[] nArray = new int[]{7, 15};
            int[] nArray2 = new int[]{62, 99};
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
                            case 0 -> 10;
                            case 1 -> 43;
                            case 2 -> 26;
                            case 3 -> 64;
                            case 4 -> 60;
                            case 5 -> 100;
                            default -> 33;
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
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[1], stringArray[18]);
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[13], stringArray[10]);
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[35], stringArray[28]);
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[0], stringArray[32]);
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[39], stringArray[24]);
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[16], stringArray[30]);
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[25], stringArray[7]);
            lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[40], stringArray[19]);
            lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[3], stringArray[43]);
            lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[41], stringArray[27]);
            IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[20], stringArray[21]);
            llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[6], stringArray[31]);
            IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[4], stringArray[37]);
            IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[17], stringArray[14]);
            IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[23], stringArray[8]);
            IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[9], stringArray[11]);
            llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[29], stringArray[22]);
            IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[38], stringArray[34]);
            lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[36], stringArray[15]);
            llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[42], stringArray[2]);
            lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[33], stringArray[12]);
            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[26], stringArray[5]);
        }
        private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
            super(ShaderType.FRAGMENT, null);
        }

        /*
         * Unable to fully structure code
         */
    }

    public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
    extends lIllllIIIIIIIIlIllIlIllIIIIIIlIIllIIllllIIIIlIIllIlllIllIIlIlIllIIIIllllIllllIlIIlllI {
        @NotNull
        public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
        @JvmField
        @NotNull
        public static Identifier IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
        @JvmField
        @NotNull
        public static Identifier IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
        @JvmField
        @NotNull
        public static Identifier IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
        @JvmField
        @NotNull
        public static Identifier lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
        @JvmField
        @NotNull
        public static Identifier IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
        @JvmField
        @NotNull
        public static Identifier llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;


        static {
            String[] stringArray = new String[12];
            String[] stringArray2 = new String[]{"\007V\021\004!\027\017[M\023\022!\000\022[Y\034\0173:\020\035P\025N2\026\024\034\004Q\003?'\n\020\033L/\022!\t\035\000W\006\005\033\021\023+]\021\r!\027\035\022\007V\021\004!\027\017[M\037\002!\tR\002[\002\024\005\007Q\022\005(\026\004Q\003?6\000\020\025J\031\026!:\b\033a\023\001)\000\016\025\t\023R\037\027\033\t\025\032[\022\007]\002\005!\013#\004_\003\0230\r\016\033K\027\b\r\004R\021\t*:\f\033M/\024!\035'\007V\021\004!\027\017[L\025\f%\021\025\002[/\024+:\037\025S\025\022%J\f\033M\031\024-\n\022ZH\003\b\031\007V\021\004!\027\017[N\037\023-\021\025\033P/\024!\035R\002[\002\024", "\000Q\026\003&\020\b\\J\024\025&\007\025\\I\026\0240\026\023\001V\002\000+L\r\000Q-\000Q\026\003&\020\b\\K\022\013\"\026\022\005\\(\023,=\030\022T\022\025\"M\013\034J\036\023*\r\025,Z\030\013,\020U\005J\037"};
            int[] nArray = new int[]{28, 30};
            int[] nArray2 = new int[]{85, 82};
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
                            case 0 -> 33;
                            case 1 -> 107;
                            case 2 -> 37;
                            case 3 -> 53;
                            case 4 -> 17;
                            case 5 -> 48;
                            default -> 41;
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
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[4], stringArray[8]);
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[1], stringArray[11]);
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[3], stringArray[2]);
            lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[7], stringArray[9]);
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[6], stringArray[10]);
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.a(stringArray[5], stringArray[0]);
        }
        private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
            super(ShaderType.VERTEX, null);
        }

        /*
         * Unable to fully structure code
         */
    }
}
