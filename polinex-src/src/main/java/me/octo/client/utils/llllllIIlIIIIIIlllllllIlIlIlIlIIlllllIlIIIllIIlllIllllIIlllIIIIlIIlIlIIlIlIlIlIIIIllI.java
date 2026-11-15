package me.octo.client.utils;

import com.mojang.blaze3d.opengl.DirectStateAccess;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.opengl.GlTexture;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.PoseStack;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.state.gui.pip.PictureInPictureRenderState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.lwjgl.opengl.GL33C;

public final class llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI
   extends PictureInPictureRenderer<llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> {
   public void renderToTexture(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, PoseStack p1) { this.a(p0, p1); } // jar: renderToTexture -> a((IllllIIlllIII...)state, poseStack)

   
   @NotNull
   public static llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static Method lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   public static final Method a() { // SYNB1-staticgetter
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public static final void a(Method arg0) { // SYNB1-staticsetter
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = arg0;
   }

   private static String[] a;
   private static String[] b;

   public llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI(@NotNull BufferSource var1) {
      short var10001 = -30193;
      short var10002 = 2339;
      Intrinsics.checkNotNullParameter(var1, "vertexConsumers");
      super(var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected void a(
      @NotNull llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      @NotNull PoseStack var2
   ) {
      short var10001 = -30195;
      short var10002 = 11241;
      Intrinsics.checkNotNullParameter(var1, "state");
      String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
      var10002 = -30194;
      short var10003 = -20597;
      Intrinsics.checkNotNullParameter(var2, "poseStack");
      String var3 = var10000;
      if (var3 != null && RenderSystem.outputColorTextureOverride != null) {
         GpuTextureView var4 = RenderSystem.outputColorTextureOverride;
         if (var3 != null) {
            DirectStateAccess var23 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.a();
            if (var23 != null) {
               DirectStateAccess var5 = var23;
               if (var3 != null && RenderSystem.outputDepthTextureOverride != null) {
                  GpuTexture var24 = RenderSystem.outputDepthTextureOverride.texture();
                  if (var24 != null) {
                     GpuTexture var6;
                     int var7;
                     int var8;
                     GpuTexture var25;
                     label128: {
                        var6 = var24;
                        var7 = var4.getWidth(0);
                        var8 = var4.getHeight(0);
                        GpuTexture var11 = var4.texture();
                        var25 = var11;
                        if (var3 != null) {
                           if (!(var11 instanceof GlTexture)) {
                              var25 = null;
                              break label128;
                           }

                           var25 = var11;
                        }

                        var25 = (GlTexture)var25;
                     }

                     if (var25 == null) {
                        return;
                     }

                     GlTexture var9 = ((GlTexture)(Object)(var25));
                     llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.PXEvMid var10 = llIIlIIIIIIIIlIIlllIlllIIllIIIlIIlllIllllllIIlllllIIIIllIIIIllIlllIIIllIIIIIIlIIIIlII.a(
                        false, false);
                     boolean var16 = false /* VF: Semaphore variable */;

                     label119: {
                        try {
                           var16 = true;
                           int var27 = ((var1.a()) ? 1 : 0);
                           if (var3 != null) {
                              var27 = var27 != 0
                                 ? lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .a(var9.glId(), var7, var8)
                                 : 0;
                           }

                           int var18 = var27;
                           int var28 = var18;
                           if (var3 != null) {
                              var28 = var18 != 0 ? 1 : 0;
                           }

                           int var12 = var28;
                           int var29 = var12;
                           if (var3 != null) {
                              if (var12 == 0) {
                                 lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = false;
                                 int var13 = var9.getFbo(var5, var6);
                                 boolean var14 = false;
                                 GlStateManager._glBindFramebuffer(36160, var13);
                                 GlStateManager._viewport(0, 0, var7, var8);
                              }

                              GL33C.glBindSampler(0, 0);
                              lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.a(
                                 (float)var7,
                                 (float)var8,
                                 lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .e()
                              );
                              var1.b().invoke();
                              lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.f();
                              if (var3 == null) {
                                 var16 = false;
                                 break label119;
                              }

                              var29 = var12;
                           }

                           if (var29 != 0) {
                              lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                 .b(var9.glId(), var7, var8);
                              var16 = false;
                           } else {
                              var16 = false;
                           }
                        } finally {
                           if (var16) {
                              var10.a();
                           }
                        }

                        var10.a();
                     }

                     GlStateManager._disableDepthTest();
                     GlStateManager._disableCull();
                     GlStateManager._enableBlend();
                     GlStateManager._blendFuncSeparate(770, 771, 1, 0);
                     return;
                  }
               }

               return;
            }
         }
      }
   }

   @Override
   protected float getTranslateY(int var1, int var2) {
      return var1 / 2.0F;
   }

   @NotNull
   @Override
   public Class<llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> getRenderStateClass() {
      return llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.class;
   }

   @NotNull
   @Override
   protected String getTextureLabel() {
      short var10000 = -30196;
      short var10001 = 3931;
      return "nvg_renderer";
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
       char[] var20 = null; // PX-FIX decl var20 (copies at 973/1552 type it char[]; GpuTexture was wrong)
   pxClinit: { // PX-FIX
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "¯\u0086nQ\u000eÔ[ª2õ¬TW(x\t&u\u0098uÇo°\\,";
      int var4 = "¯\u0086nQ\u000eÔ[ª2õ¬TW(x\t&u\u0098uÇo°\\,".length();
      char var1 = 15;
      int var8 = -1;

      label52:
      while (true) {
         byte var10000 = 86;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var24 = var10001.toCharArray();
               int var10004 = var24.length;
               int var6 = 0;
               byte var27 = var10000;
               var20 = var24;
               int var14 = var10004;
               byte var32;
               char[] var36;
               int var10006;
               if (var10004 <= 1) {
                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               } else {
                  var27 = var10000;
                  var14 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var36 = var24;
                  var32 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                     case 0 -> 60;
                     case 1 -> 44;
                     case 2 -> 74;
                     case 3 -> 37;
                     case 4 -> 79;
                     case 5 -> 68;
                     default -> 101;
                  });
                  var6++;
                  if (var27 == 0) {
                     var10006 = var27;
                     var36 = ((char[])(Object)(var20));
                     var32 = var27;
                  } else {
                     if (var14 <= var6) {
                        break;
                     }

                     var36 = ((char[])(Object)(var20));
                     var32 = var27;
                     var10006 = var6;
                  }
               }
            }

            String var29 = String.valueOf(var20).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var29;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[4];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        (kotlin.jvm.internal.DefaultConstructorMarker) null
                     );
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var29;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "·bëÎÿ\f\u001e¢f¿\u009fj\u0081øÚäûx";
                  var4 = "·bëÎÿ\f\u001e¢f¿\u009fj\u0081øÚäûx".length();
                  var1 = 5;
                  var8 = -1;
            }

            var10000 = 13;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -30193) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 49;
            case 1 -> 36;
            case 2 -> 16;
            case 3 -> 45;
            case 4 -> 102;
            case 5 -> 218;
            case 6 -> 230;
            case 7 -> 241;
            case 8 -> 137;
            case 9 -> 201;
            case 10 -> 219;
            case 11 -> 224;
            case 12 -> 3;
            case 13 -> 239;
            case 14 -> 62;
            case 15 -> 54;
            case 16 -> 75;
            case 17 -> 202;
            case 18 -> 74;
            case 19 -> 252;
            case 20 -> 210;
            case 21 -> 38;
            case 22 -> 215;
            case 23 -> 177;
            case 24 -> 110;
            case 25 -> 194;
            case 26 -> 17;
            case 27 -> 132;
            case 28 -> 63;
            case 29 -> 111;
            case 30 -> 108;
            case 31 -> 200;
            case 32 -> 96;
            case 33 -> 131;
            case 34 -> 93;
            case 35 -> 114;
            case 36 -> 30;
            case 37 -> 146;
            case 38 -> 86;
            case 39 -> 254;
            case 40 -> 242;
            case 41 -> 163;
            case 42 -> 56;
            case 43 -> 164;
            case 44 -> 186;
            case 45 -> 8;
            case 46 -> 24;
            case 47 -> 26;
            case 48 -> 168;
            case 49 -> 11;
            case 50 -> 117;
            case 51 -> 66;
            case 52 -> 84;
            case 53 -> 78;
            case 54 -> 212;
            case 55 -> 105;
            case 56 -> 0;
            case 57 -> 135;
            case 58 -> 44;
            case 59 -> 4;
            case 60 -> 184;
            case 61 -> 220;
            case 62 -> 15;
            case 63 -> 72;
            case 64 -> 180;
            case 65 -> 188;
            case 66 -> 51;
            case 67 -> 225;
            case 68 -> 13;
            case 69 -> 157;
            case 70 -> 214;
            case 71 -> 99;
            case 72 -> 69;
            case 73 -> 61;
            case 74 -> 89;
            case 75 -> 162;
            case 76 -> 79;
            case 77 -> 237;
            case 78 -> 159;
            case 79 -> 175;
            case 80 -> 31;
            case 81 -> 39;
            case 82 -> 142;
            case 83 -> 197;
            case 84 -> 73;
            case 85 -> 227;
            case 86 -> 161;
            case 87 -> 126;
            case 88 -> 134;
            case 89 -> 9;
            case 90 -> 153;
            case 91 -> 81;
            case 92 -> 204;
            case 93 -> 53;
            case 94 -> 32;
            case 95 -> 181;
            case 96 -> 187;
            case 97 -> 245;
            case 98 -> 133;
            case 99 -> 183;
            case 100 -> 166;
            case 101 -> 80;
            case 102 -> 160;
            case 103 -> 59;
            case 104 -> 124;
            case 105 -> 47;
            case 106 -> 27;
            case 107 -> 190;
            case 108 -> 71;
            case 109 -> 203;
            case 110 -> 141;
            case 111 -> 118;
            case 112 -> 128;
            case 113 -> 234;
            case 114 -> 21;
            case 115 -> 28;
            case 116 -> 19;
            case 117 -> 235;
            case 118 -> 251;
            case 119 -> 138;
            case 120 -> 46;
            case 121 -> 253;
            case 122 -> 120;
            case 123 -> 43;
            case 124 -> 50;
            case 125 -> 249;
            case 126 -> 211;
            case 127 -> 14;
            case 128 -> 172;
            case 129 -> 207;
            case 130 -> 82;
            case 131 -> 232;
            case 132 -> 154;
            case 133 -> 109;
            case 134 -> 244;
            case 135 -> 236;
            case 136 -> 192;
            case 137 -> 92;
            case 138 -> 101;
            case 139 -> 148;
            case 140 -> 240;
            case 141 -> 65;
            case 142 -> 68;
            case 143 -> 136;
            case 144 -> 42;
            case 145 -> 64;
            case 146 -> 83;
            case 147 -> 76;
            case 148 -> 52;
            case 149 -> 57;
            case 150 -> 216;
            case 151 -> 165;
            case 152 -> 221;
            case 153 -> 176;
            case 154 -> 223;
            case 155 -> 119;
            case 156 -> 143;
            case 157 -> 191;
            case 158 -> 97;
            case 159 -> 155;
            case 160 -> 247;
            case 161 -> 171;
            case 162 -> 35;
            case 163 -> 196;
            case 164 -> 222;
            case 165 -> 98;
            case 166 -> 144;
            case 167 -> 169;
            case 168 -> 91;
            case 169 -> 250;
            case 170 -> 150;
            case 171 -> 129;
            case 172 -> 77;
            case 173 -> 10;
            case 174 -> 147;
            case 175 -> 231;
            case 176 -> 199;
            case 177 -> 182;
            case 178 -> 41;
            case 179 -> 158;
            case 180 -> 95;
            case 181 -> 70;
            case 182 -> 213;
            case 183 -> 94;
            case 184 -> 113;
            case 185 -> 20;
            case 186 -> 228;
            case 187 -> 152;
            case 188 -> 107;
            case 189 -> 33;
            case 190 -> 85;
            case 191 -> 179;
            case 192 -> 127;
            case 193 -> 48;
            case 194 -> 209;
            case 195 -> 122;
            case 196 -> 121;
            case 197 -> 112;
            case 198 -> 130;
            case 199 -> 238;
            case 200 -> 198;
            case 201 -> 226;
            case 202 -> 6;
            case 203 -> 104;
            case 204 -> 208;
            case 205 -> 7;
            case 206 -> 174;
            case 207 -> 193;
            case 208 -> 246;
            case 209 -> 248;
            case 210 -> 170;
            case 211 -> 125;
            case 212 -> 145;
            case 213 -> 88;
            case 214 -> 255;
            case 215 -> 40;
            case 216 -> 149;
            case 217 -> 58;
            case 218 -> 29;
            case 219 -> 67;
            case 220 -> 173;
            case 221 -> 217;
            case 222 -> 55;
            case 223 -> 22;
            case 224 -> 178;
            case 225 -> 205;
            case 226 -> 87;
            case 227 -> 2;
            case 228 -> 185;
            case 229 -> 34;
            case 230 -> 100;
            case 231 -> 1;
            case 232 -> 229;
            case 233 -> 151;
            case 234 -> 140;
            case 235 -> 243;
            case 236 -> 115;
            case 237 -> 116;
            case 238 -> 37;
            case 239 -> 195;
            case 240 -> 156;
            case 241 -> 103;
            case 242 -> 189;
            case 243 -> 233;
            case 244 -> 90;
            case 245 -> 123;
            case 246 -> 167;
            case 247 -> 206;
            case 248 -> 139;
            case 249 -> 5;
            case 250 -> 18;
            case 251 -> 12;
            case 252 -> 23;
            case 253 -> 25;
            case 254 -> 106;
            default -> 60;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI implements PictureInPictureRenderState {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Matrix3x2f IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final ScreenRectangle IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final ScreenRectangle IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private final Function0<Unit> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static String[] a;
      private static String[] b;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int var1,
         int var2,
         int var3,
         int var4,
         @NotNull Matrix3x2f var5,
         @Nullable ScreenRectangle var6,
         @Nullable ScreenRectangle var7,
         boolean var8,
         @NotNull Function0<Unit> var9
      ) {
         short var10001 = 5625;
         short var10002 = 22606;
         Intrinsics.checkNotNullParameter(var5, "poseMatrix");
         var10001 = 5619;
         var10002 = 17623;
         Intrinsics.checkNotNullParameter(var9, "renderContent");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var5;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var6;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var8;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
      }

      public final boolean a() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final Function0<Unit> b() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @Override
      public float scale() {
         return 1.0F;
      }

      @Override
      public int x0() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Override
      public int y0() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Override
      public int x1() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Override
      public int y1() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      @Override
      public ScreenRectangle scissorArea() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      @Override
      public ScreenRectangle bounds() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      private final int c() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      private final int d() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      private final int e() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      private final int f() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      private final Matrix3x2f g() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      private final ScreenRectangle h() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      private final ScreenRectangle i() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean j() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final Function0<Unit> k() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(
         int var1,
         int var2,
         int var3,
         int var4,
         @NotNull Matrix3x2f var5,
         @Nullable ScreenRectangle var6,
         @Nullable ScreenRectangle var7,
         boolean var8,
         @NotNull Function0<Unit> var9
      ) {
         short var10001 = 5626;
         short var10002 = -31721;
         Intrinsics.checkNotNullParameter(var5, "poseMatrix");
         var10001 = 5616;
         var10002 = -728;
         Intrinsics.checkNotNullParameter(var9, "renderContent");
         return new llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var2, var3, var4, var5, var6, var7, var8, var9
         );
      }

      @NotNull
      @Override
      public String toString() {
         short var10000 = 5620;
         Function0 var1 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var2 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         ScreenRectangle var3 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         ScreenRectangle var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Matrix3x2f var5 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         int var6 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var7 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var8 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var9 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         short var10001 = -29632;
         short var10002 = 5629;
         short var10003 = 29606;
         short var10004 = 5622;
         short var10005 = 16686;
         short var10006 = 5623;
         short var10007 = -16335;
         short var10008 = 5621;
         short var10009 = -3964;
         short var10010 = 5624;
         short var10011 = 24226;
         short var10012 = 5617;
         short var10013 = 1169;
         short var10014 = 5627;
         short var10015 = -22791;
         short var10016 = 5618;
         short var10017 = 23678;
         return "NVGRenderState(x="
            + var9
            + ", y="
            + var8
            + ", width="
            + var7
            + ", height="
            + var6
            + ", poseMatrix="
            + var5
            + ", scissor="
            + var4
            + ", bounds="
            + var3
            + ", superSample="
            + var2
            + ", renderContent="
            + var1
            + ")";
      }

      @Override
      public int hashCode() {
         String var1;
         int var10;
         int var12;
         label25: {
            int var2 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
            String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
            var2 = var2 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var2 = var2 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
            var2 = var2 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
            var2 = var2 * 31 + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.hashCode();
            var1 = var10000;
            var10 = var2 * 31;
            ScreenRectangle var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var1 != null) {
               if (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI == null) {
                  var12 = 0;
                  break label25;
               }

               var10001 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            }

            var12 = var10001.hashCode();
         }

         label19: {
            int var7 = var10 + var12;
            var10 = var7 * 31;
            ScreenRectangle var13 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            if (var1 != null) {
               if (this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll == null) {
                  var12 = 0;
                  break label19;
               }

               var13 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }

            var12 = var13.hashCode();
         }

         int var8 = var10 + var12;
         var8 = var8 * 31 + Boolean.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);
         return var8 * 31 + this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         String var2 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         Object var10000 = this;
         if (var2 != null) {
            if (this == var1) {
               return true;
            }

            var10000 = var1;
         }

         if (var2 != null) {
            if (!(
               var10000 instanceof llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
            )) {
               return false;
            }

            var10000 = var1;
         }

         llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3 = (llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI)var10000;
         int var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         int var10001 = var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         if (var2 != null) {
            if (this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               != var3.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
               return false;
            }

            var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            var10001 = var3.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         }

         if (var2 != null) {
            if (var4 != var10001) {
               return false;
            }

            var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            var10001 = var3.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         }

         label96: {
            if (var2 != null) {
               if (var4 != var10001) {
                  return false;
               }

               var4 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
               if (var2 == null) {
                  break label96;
               }

               var10001 = var3.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            if (var4 != var10001) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
               var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var3.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
               var3.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = ((this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 !=( (!var3.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) ? 1 : 0)) {
               return false;
            }

            var4 = ((Intrinsics.areEqual(
               this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
               var3.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            )) ? 1 : 0);
         }

         if (var2 != null) {
            if (var4 == 0) {
               return false;
            }

            var4 = 1;
         }

         return (var4 != 0);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[13];
         int var3 = 0;
         String var2 = "NÈ\u001e§2È»\u0092B\rc¾\"\u008f(»Í\u007f\u001c\u0005°\u009e{\røoQµFü\u0000\u0097¥\u0018\u0087=\u009d\u0010\u0015*eñTC\u000e©«zÅ\u0013®´3è\rm\u0090h¬ª¢G§\u0098×u\u0014\u0007\u0011\u0010ÁÞ\u0003»Æ\u0098Ei.\u00907L\u008c\u0000À\f\tîL\u0000=¦Ùº\u009fï\bíÉ\u007f\u0081¸ÐÕ\u0086\nàè\r\u000f[\u0099¹WD²\n*ÿ\u0083M®\u0005 \u0089\u009b\u0092\u000e/í#\u0019£M:húE\u0097®9K";
         int var4 = "NÈ\u001e§2È»\u0092B\rc¾\"\u008f(»Í\u007f\u001c\u0005°\u009e{\røoQµFü\u0000\u0097¥\u0018\u0087=\u009d\u0010\u0015*eñTC\u000e©«zÅ\u0013®´3è\rm\u0090h¬ª¢G§\u0098×u\u0014\u0007\u0011\u0010ÁÞ\u0003»Æ\u0098Ei.\u00907L\u008c\u0000À\f\tîL\u0000=¦Ùº\u009fï\bíÉ\u007f\u0081¸ÐÕ\u0086\nàè\r\u000f[\u0099¹WD²\n*ÿ\u0083M®\u0005 \u0089\u009b\u0092\u000e/í#\u0019£M:húE\u0097®9K"
            .length();
         char var1 = '\t';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 4;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                  int var14 = var10004;
                  byte var32;
                  char[] var36;
                  int var10006;
                  if (var10004 <= 1) {
                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  } else {
                     var27 = var10000;
                     var14 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  }

                  while (true) {
                     var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                        case 0 -> 20;
                        case 1 -> 9;
                        case 2 -> 26;
                        case 3 -> 80;
                        case 4 -> 109;
                        case 5 -> 94;
                        default -> 107;
                     });
                     var6++;
                     if (var27 == 0) {
                        var10006 = var27;
                        var36 = var20;
                        var32 = var27;
                     } else {
                        if (var14 <= var6) {
                           break;
                        }

                        var36 = var20;
                        var32 = var27;
                        var10006 = var6;
                     }
                  }
               }

               String var29 = new String(var20).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var29;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[13];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "&±\u0086wyÅ®\u008fõú\u0004\u001c0\u001c¹";
                     var4 = "&±\u0086wyÅ®\u008fõú\u0004\u001c0\u001c¹".length();
                     var1 = '\n';
                     var8 = -1;
               }

               var10000 = 92;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 5617) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 242;
               case 1 -> 76;
               case 2 -> 14;
               case 3 -> 154;
               case 4 -> 38;
               case 5 -> 85;
               case 6 -> 19;
               case 7 -> 222;
               case 8 -> 204;
               case 9 -> 22;
               case 10 -> 143;
               case 11 -> 49;
               case 12 -> 142;
               case 13 -> 214;
               case 14 -> 155;
               case 15 -> 73;
               case 16 -> 60;
               case 17 -> 213;
               case 18 -> 162;
               case 19 -> 221;
               case 20 -> 52;
               case 21 -> 240;
               case 22 -> 147;
               case 23 -> 198;
               case 24 -> 137;
               case 25 -> 30;
               case 26 -> 98;
               case 27 -> 122;
               case 28 -> 232;
               case 29 -> 246;
               case 30 -> 109;
               case 31 -> 23;
               case 32 -> 146;
               case 33 -> 18;
               case 34 -> 205;
               case 35 -> 172;
               case 36 -> 150;
               case 37 -> 64;
               case 38 -> 121;
               case 39 -> 84;
               case 40 -> 158;
               case 41 -> 161;
               case 42 -> 34;
               case 43 -> 37;
               case 44 -> 41;
               case 45 -> 10;
               case 46 -> 228;
               case 47 -> 92;
               case 48 -> 78;
               case 49 -> 110;
               case 50 -> 9;
               case 51 -> 32;
               case 52 -> 178;
               case 53 -> 124;
               case 54 -> 134;
               case 55 -> 167;
               case 56 -> 238;
               case 57 -> 225;
               case 58 -> 140;
               case 59 -> 237;
               case 60 -> 133;
               case 61 -> 247;
               case 62 -> 160;
               case 63 -> 230;
               case 64 -> 15;
               case 65 -> 120;
               case 66 -> 235;
               case 67 -> 157;
               case 68 -> 148;
               case 69 -> 74;
               case 70 -> 71;
               case 71 -> 57;
               case 72 -> 139;
               case 73 -> 56;
               case 74 -> 94;
               case 75 -> 209;
               case 76 -> 63;
               case 77 -> 219;
               case 78 -> 168;
               case 79 -> 88;
               case 80 -> 21;
               case 81 -> 130;
               case 82 -> 192;
               case 83 -> 104;
               case 84 -> 46;
               case 85 -> 111;
               case 86 -> 54;
               case 87 -> 96;
               case 88 -> 202;
               case 89 -> 25;
               case 90 -> 180;
               case 91 -> 7;
               case 92 -> 4;
               case 93 -> 211;
               case 94 -> 31;
               case 95 -> 208;
               case 96 -> 115;
               case 97 -> 244;
               case 98 -> 86;
               case 99 -> 129;
               case 100 -> 5;
               case 101 -> 194;
               case 102 -> 6;
               case 103 -> 117;
               case 104 -> 107;
               case 105 -> 188;
               case 106 -> 16;
               case 107 -> 12;
               case 108 -> 101;
               case 109 -> 248;
               case 110 -> 249;
               case 111 -> 231;
               case 112 -> 245;
               case 113 -> 70;
               case 114 -> 135;
               case 115 -> 39;
               case 116 -> 0;
               case 117 -> 20;
               case 118 -> 127;
               case 119 -> 233;
               case 120 -> 126;
               case 121 -> 226;
               case 122 -> 203;
               case 123 -> 28;
               case 124 -> 77;
               case 125 -> 51;
               case 126 -> 103;
               case 127 -> 80;
               case 128 -> 216;
               case 129 -> 241;
               case 130 -> 173;
               case 131 -> 210;
               case 132 -> 33;
               case 133 -> 170;
               case 134 -> 87;
               case 135 -> 1;
               case 136 -> 62;
               case 137 -> 220;
               case 138 -> 175;
               case 139 -> 2;
               case 140 -> 45;
               case 141 -> 131;
               case 142 -> 144;
               case 143 -> 116;
               case 144 -> 3;
               case 145 -> 253;
               case 146 -> 58;
               case 147 -> 35;
               case 148 -> 81;
               case 149 -> 68;
               case 150 -> 75;
               case 151 -> 250;
               case 152 -> 106;
               case 153 -> 218;
               case 154 -> 72;
               case 155 -> 183;
               case 156 -> 113;
               case 157 -> 182;
               case 158 -> 252;
               case 159 -> 171;
               case 160 -> 44;
               case 161 -> 181;
               case 162 -> 128;
               case 163 -> 17;
               case 164 -> 36;
               case 165 -> 40;
               case 166 -> 47;
               case 167 -> 196;
               case 168 -> 48;
               case 169 -> 234;
               case 170 -> 195;
               case 171 -> 24;
               case 172 -> 123;
               case 173 -> 191;
               case 174 -> 224;
               case 175 -> 141;
               case 176 -> 201;
               case 177 -> 42;
               case 178 -> 174;
               case 179 -> 149;
               case 180 -> 223;
               case 181 -> 193;
               case 182 -> 243;
               case 183 -> 105;
               case 184 -> 254;
               case 185 -> 99;
               case 186 -> 26;
               case 187 -> 136;
               case 188 -> 151;
               case 189 -> 251;
               case 190 -> 102;
               case 191 -> 89;
               case 192 -> 53;
               case 193 -> 97;
               case 194 -> 217;
               case 195 -> 212;
               case 196 -> 153;
               case 197 -> 79;
               case 198 -> 83;
               case 199 -> 69;
               case 200 -> 114;
               case 201 -> 100;
               case 202 -> 82;
               case 203 -> 239;
               case 204 -> 229;
               case 205 -> 199;
               case 206 -> 169;
               case 207 -> 185;
               case 208 -> 108;
               case 209 -> 145;
               case 210 -> 197;
               case 211 -> 50;
               case 212 -> 138;
               case 213 -> 176;
               case 214 -> 215;
               case 215 -> 27;
               case 216 -> 132;
               case 217 -> 125;
               case 218 -> 163;
               case 219 -> 159;
               case 220 -> 43;
               case 221 -> 118;
               case 222 -> 184;
               case 223 -> 55;
               case 224 -> 66;
               case 225 -> 177;
               case 226 -> 207;
               case 227 -> 91;
               case 228 -> 8;
               case 229 -> 90;
               case 230 -> 65;
               case 231 -> 190;
               case 232 -> 61;
               case 233 -> 156;
               case 234 -> 165;
               case 235 -> 166;
               case 236 -> 255;
               case 237 -> 152;
               case 238 -> 236;
               case 239 -> 189;
               case 240 -> 206;
               case 241 -> 179;
               case 242 -> 227;
               case 243 -> 112;
               case 244 -> 187;
               case 245 -> 200;
               case 246 -> 59;
               case 247 -> 119;
               case 248 -> 29;
               case 249 -> 186;
               case 250 -> 164;
               case 251 -> 11;
               case 252 -> 13;
               case 253 -> 93;
               case 254 -> 95;
               default -> 67;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002 = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002 ^ var5);
                  var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002 ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
      public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI a(IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI p0, int p1, int p2, int p3, int p4, org.joml.Matrix3x2f p5, net.minecraft.client.gui.navigation.ScreenRectangle p6, net.minecraft.client.gui.navigation.ScreenRectangle p7, boolean p8, kotlin.jvm.functions.Function0 p9, int p10, java.lang.Object p11) { return null; }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
        // PX-FIX varargs-ctor: entry args lost by obfuscator
        public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(Object... px) {
        }

      private static String[] a;
      private static String[] b;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      private final DirectStateAccess a() {
         String var1 = me.octo.client.utils.lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         com.mojang.blaze3d.systems.GpuDevice var2 = RenderSystem.getDevice();
         Intrinsics.checkNotNull(var2, "null cannot be cast to non-null type me.octo.client.mixin.accessors.GpuDeviceAccessor");
         com.mojang.blaze3d.systems.GpuDeviceBackend var3 = ((me.octo.client.mixin.accessors.GpuDeviceAccessor)var2).getBackend();
         try {
            if (llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.a() == null) {
               Method var4 = ((Object)var3).getClass().getMethod("directStateAccess", new Class[0]);
               var4.setAccessible(true);
               llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.a(var4);
            }

            Method var5 = llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.a();
            Intrinsics.checkNotNull(var5);
            Object var6 = var5.invoke(var3, new Object[0]);
            return var6 instanceof DirectStateAccess ? (DirectStateAccess)var6 : null;
         } catch (Exception var7) {
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[NVG-PIP] reflection failed: " + var7);
            return null;
         }
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: parsing failure!
         //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
         //
         // Bytecode:
         // 00: invokestatic me/octo/client/utils/lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j ()Ljava/lang/String;
         // 03: invokestatic com/mojang/blaze3d/systems/RenderSystem.getDevice ()Lcom/mojang/blaze3d/systems/GpuDevice;
         // 06: dup
         // 07: sipush 12063
         // 0a: sipush 20714
         // 0d: pop2
         // 0e: ldc "null cannot be cast to non-null type me.octo.client.mixin.accessors.GpuDeviceAccessor"
         // 10: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
         // 13: checkcast me/octo/client/mixin/accessors/GpuDeviceAccessor
         // 16: invokeinterface me/octo/client/mixin/accessors/GpuDeviceAccessor.getBackend ()Lcom/mojang/blaze3d/systems/GpuDeviceBackend; 1
         // 1b: astore 2
         // 1c: astore 1
         // 1d: nop
         // 1e: invokestatic me/octo/client/utils/llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.a ()Ljava/lang/reflect/Method;
         // 21: aload 1
         // 22: ifnull 64
         // 25: ifnonnull 55
         // 28: goto 2f
         // 2b: invokestatic me/octo/client/utils/llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
         // 2e: athrow
         // 2f: aload 2
         // 30: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
         // 33: sipush 12057
         // 36: sipush -11129
         // 39: pop2
         // 3a: ldc "directStateAccess"
         // 3c: bipush 0
         // 3d: anewarray 70
         // 40: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
         // 43: astore 3
         // 44: aload 3
         // 45: astore 4
         // 47: bipush 0
         // 48: istore 5
         // 4a: aload 4
         // 4c: bipush 1
         // 4d: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
         // 50: nop
         // 51: aload 3
         // 52: invokestatic me/octo/client/utils/llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.a (Ljava/lang/reflect/Method;)V
         // 55: invokestatic me/octo/client/utils/llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.a ()Ljava/lang/reflect/Method;
         // 58: dup
         // 59: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
         // 5c: aload 2
         // 5d: bipush 0
         // 5e: anewarray 4
         // 61: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
         // 64: astore 3
         // 65: aload 3
         // 66: aload 1
         // 67: ifnull 7f
         // 6a: instanceof com/mojang/blaze3d/opengl/DirectStateAccess
         // 6d: ifeq 85
         // 70: goto 77
         // 73: invokestatic me/octo/client/utils/llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
         // 76: athrow
         // 77: aload 3
         // 78: goto 7f
         // 7b: invokestatic me/octo/client/utils/llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.a (Ljava/lang/Exception;)Ljava/lang/Exception;
         // 7e: athrow
         // 7f: checkcast com/mojang/blaze3d/opengl/DirectStateAccess
         // 82: goto 86
         // 85: aconst_null
         // 86: astore 3
         // 87: goto a2
         // 8a: astore 4
         // 8c: aload 4
         // 8e: sipush 12056
         // 91: sipush -10117
         // 94: pop2
         // 95: ldc "[NVG-PIP] reflection failed: "
         // 97: swap
         // 98: invokedynamic makeConcatWithConstants (Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "\u0001\u0001" ]
         // 9d: invokestatic me/octo/client/utils/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b (Ljava/lang/String;)V
         // a0: aconst_null
         // a1: astore 3
         // a2: aload 3
         // a3: areturn
      }

      public final boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, @NotNull Function0<Unit> var6) {
         short var10001 = 12061;
         short var10002 = -2461;
         Intrinsics.checkNotNullParameter(var1, "context");
         var10001 = 12059;
         var10002 = -5637;
         Intrinsics.checkNotNullParameter(var6, "renderContent");
         return this.a(var1, var2, var3, var4, var5, false, var6);
      }

      public final boolean a(@NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, boolean var6, @NotNull Function0<Unit> var7) {
         short var10001 = 12062;
         short var10002 = 3359;
         Intrinsics.checkNotNullParameter(var1, "context");
         var10001 = 12051;
         var10002 = -18901;
         Intrinsics.checkNotNullParameter(var7, "renderContent");

         boolean var8;
         try {
            ScreenRectangle var13 = var1.scissorStack.peek();
            Matrix3x2f var9 = new Matrix3x2f((Matrix3x2fc)var1.pose());
            ScreenRectangle var10 = this.a(var2, var3, var2 + var4, var3 + var5, var9, var13);
            llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var11 = new llllllIIlIIIIIIlllllllIlIlIlIlIIlllllIlIIIllIIlllIllllIIlllIIIIlIIlIlIIlIlIlIlIIIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var2, var3, var4, var5, var9, var13, var10, var6, var7
            );
            var1.guiRenderState.addPicturesInPictureState(var11);
            var8 = true;
         } catch (Throwable var12) {
            String var10000 = var12.getMessage();
            var10001 = 12060;
            var10002 = 13065;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[NVGSpecialRenderer] draw failed: " + var10000);
            var12.printStackTrace();
            var8 = false;
         }

         return var8;
      }

      private final ScreenRectangle a(int var1, int var2, int var3, int var4, Matrix3x2f var5, ScreenRectangle var6) {
         String var10000 = lllIIlIllIIIIIlIIIIlIllllllIIllIlIlIIlllllIIlIIlIIIIlIIllIIIlIlIIIllllIIIIlIlIIIIlIIl.j();
         ScreenRectangle var10001 = new ScreenRectangle(var1, var2, var3 - var1, var4 - var2).transformMaxBounds((Matrix3x2fc)var5);
         short var10003 = 12058;
         short var10004 = 8361;
         Intrinsics.checkNotNullExpressionValue(var10001, "transformMaxBounds(...)");
         ScreenRectangle var8 = var10001;
         String var7 = var10000;
         if (var7 != null && var6 != null) {
            ScreenRectangle var9 = var6.intersection(var8);
            if (var7 != null) {
               return var9;
            }
         }

         return var8;
      }

      private static Exception a(Exception var0) {
         return var0;
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      static { char[] var20 = null; // PX-FIX hoist
        
       var20 = null; // PX-FIX
   pxClinit: {
         String[] var5 = new String[9];
         int var3 = 0;
         String var2 = "\u00161ý\u0097è?ô¥G/2à¬\u0017\u0091.Ä\u008b7ã÷µ\u008dª\fXÙpU~x\u0003^\u0004«T+\u0011V6=ûi\u0095\u0012-\u0086Fäâa5WF=\u001d\u0007Óë¦]|\t\u0094\u0080\u0085\u0088`\u001cÊ]G{\u0092k/¬1L\u0088´¡D¤QUÌS;Á7íÀÍ§\u0018?0($\u001a²k6Å¬UÏìxÊS¡ÄØËÁ¤<\u009enñ\u000f÷¼\u0081fÛ+\u0087Ü\r\u008d\u0090V)ëÅö«1;.\u0091j¦òéA\u0096ÆÐ5\u0099«Ë¾ß\u0004]±'t»¸\u0010aïÁìF\u0007\u009c\u0084\u009fz¤\u009aJ\u0007\u0086×Ü\u0010Ì×G";
         int var4 = "\u00161ý\u0097è?ô¥G/2à¬\u0017\u0091.Ä\u008b7ã÷µ\u008dª\fXÙpU~x\u0003^\u0004«T+\u0011V6=ûi\u0095\u0012-\u0086Fäâa5WF=\u001d\u0007Óë¦]|\t\u0094\u0080\u0085\u0088`\u001cÊ]G{\u0092k/¬1L\u0088´¡D¤QUÌS;Á7íÀÍ§\u0018?0($\u001a²k6Å¬UÏìxÊS¡ÄØËÁ¤<\u009enñ\u000f÷¼\u0081fÛ+\u0087Ü\r\u008d\u0090V)ëÅö«1;.\u0091j¦òéA\u0096ÆÐ5\u0099«Ë¾ß\u0004]±'t»¸\u0010aïÁìF\u0007\u009c\u0084\u009fz¤\u009aJ\u0007\u0086×Ü\u0010Ì×G"
            .length();
         char var1 = '\r';
         int var8 = -1;

         label52:
         while (true) {
            byte var10000 = 4;
            String var10001 = var2.substring(++var8, var8 + var1);
            byte var10002 = -1;

            while (true) {
               label47: {
                  char[] var24 = var10001.toCharArray();
                  int var10004 = var24.length;
                  int var6 = 0;
                  byte var27 = var10000;
                  var20 = var24;
                  int var14 = var10004;
                  byte var32;
                  char[] var36;
                  int var10006;
                  if (var10004 <= 1) {
                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  } else {
                     var27 = var10000;
                     var14 = var10004;
                     if (var10004 <= var6) {
                        break label47;
                     }

                     var36 = var24;
                     var32 = var10000;
                     var10006 = var6;
                  }

                  while (true) {
                     var36[var10006] = (char)(var36[var10006] ^ var32 ^ switch (var6 % 7) {
                        case 0 -> 23;
                        case 1 -> 53;
                        case 2 -> 11;
                        case 3 -> 62;
                        case 4 -> 116;
                        case 5 -> 20;
                        default -> 105;
                     });
                     var6++;
                     if (var27 == 0) {
                        var10006 = var27;
                        var36 = var20;
                        var32 = var27;
                     } else {
                        if (var14 <= var6) {
                           break;
                        }

                        var36 = var20;
                        var32 = var27;
                        var10006 = var6;
                     }
                  }
               }

               String var29 = new String(var20).intern();
               switch (var10002) {
                  case 0:
                     var5[var3++] = var29;
                     if ((var8 += var1) >= var4) {
                        a = var5;
                        b = new String[9];
                        break pxClinit;
                     }

                     var1 = var2.charAt(var8);
                     break;
                  default:
                     var5[var3++] = var29;
                     if ((var8 += var1) < var4) {
                        var1 = var2.charAt(var8);
                        continue label52;
                     }

                     var2 = "¿b\u009fóÎ\u0095\u0085ÝïÛª\u0096å¤c\u00adøf£lhm¤* Úß\u001eJ\u001dfYÍ×\ríMá{\bÁ\u008b\u0019ËÛÀ\u001d\u0091";
                     var4 = "¿b\u009fóÎ\u0095\u0085ÝïÛª\u0096å¤c\u00adøf£lhm¤* Úß\u001eJ\u001dfYÍ×\ríMá{\bÁ\u008b\u0019ËÛÀ\u001d\u0091".length();
                     var1 = '"';
                     var8 = -1;
               }

               var10000 = 7;
               var10001 = var2.substring(++var8, var8 + var1);
               var10002 = 0;
            }
         }
      }
}

      private static String a(int var0, int var1) {
         int var2 = (var0 ^ 12059) & 65535;
         if (b[var2] == null) {
            char[] var3 = a[var2].toCharArray();

            short var4 = switch (var3[0] & 0xFF) {
               case 0 -> 138;
               case 1 -> 246;
               case 2 -> 116;
               case 3 -> 161;
               case 4 -> 228;
               case 5 -> 132;
               case 6 -> 62;
               case 7 -> 48;
               case 8 -> 54;
               case 9 -> 214;
               case 10 -> 93;
               case 11 -> 115;
               case 12 -> 26;
               case 13 -> 68;
               case 14 -> 127;
               case 15 -> 175;
               case 16 -> 30;
               case 17 -> 194;
               case 18 -> 7;
               case 19 -> 118;
               case 20 -> 44;
               case 21 -> 183;
               case 22 -> 72;
               case 23 -> 27;
               case 24 -> 162;
               case 25 -> 10;
               case 26 -> 144;
               case 27 -> 69;
               case 28 -> 134;
               case 29 -> 53;
               case 30 -> 139;
               case 31 -> 247;
               case 32 -> 39;
               case 33 -> 188;
               case 34 -> 46;
               case 35 -> 193;
               case 36 -> 163;
               case 37 -> 171;
               case 38 -> 22;
               case 39 -> 29;
               case 40 -> 100;
               case 41 -> 206;
               case 42 -> 240;
               case 43 -> 239;
               case 44 -> 160;
               case 45 -> 201;
               case 46 -> 180;
               case 47 -> 50;
               case 48 -> 223;
               case 49 -> 242;
               case 50 -> 210;
               case 51 -> 142;
               case 52 -> 133;
               case 53 -> 203;
               case 54 -> 101;
               case 55 -> 114;
               case 56 -> 166;
               case 57 -> 12;
               case 58 -> 97;
               case 59 -> 112;
               case 60 -> 241;
               case 61 -> 153;
               case 62 -> 37;
               case 63 -> 254;
               case 64 -> 85;
               case 65 -> 110;
               case 66 -> 169;
               case 67 -> 24;
               case 68 -> 124;
               case 69 -> 102;
               case 70 -> 38;
               case 71 -> 173;
               case 72 -> 58;
               case 73 -> 40;
               case 74 -> 233;
               case 75 -> 154;
               case 76 -> 167;
               case 77 -> 243;
               case 78 -> 121;
               case 79 -> 70;
               case 80 -> 89;
               case 81 -> 52;
               case 82 -> 32;
               case 83 -> 67;
               case 84 -> 198;
               case 85 -> 205;
               case 86 -> 200;
               case 87 -> 74;
               case 88 -> 3;
               case 89 -> 82;
               case 90 -> 18;
               case 91 -> 150;
               case 92 -> 59;
               case 93 -> 28;
               case 94 -> 113;
               case 95 -> 216;
               case 96 -> 105;
               case 97 -> 90;
               case 98 -> 20;
               case 99 -> 172;
               case 100 -> 244;
               case 101 -> 196;
               case 102 -> 222;
               case 103 -> 226;
               case 104 -> 91;
               case 105 -> 5;
               case 106 -> 184;
               case 107 -> 209;
               case 108 -> 17;
               case 109 -> 103;
               case 110 -> 71;
               case 111 -> 41;
               case 112 -> 80;
               case 113 -> 9;
               case 114 -> 165;
               case 115 -> 158;
               case 116 -> 204;
               case 117 -> 81;
               case 118 -> 8;
               case 119 -> 128;
               case 120 -> 238;
               case 121 -> 182;
               case 122 -> 253;
               case 123 -> 96;
               case 124 -> 122;
               case 125 -> 146;
               case 126 -> 202;
               case 127 -> 220;
               case 128 -> 106;
               case 129 -> 49;
               case 130 -> 179;
               case 131 -> 212;
               case 132 -> 88;
               case 133 -> 227;
               case 134 -> 136;
               case 135 -> 152;
               case 136 -> 190;
               case 137 -> 42;
               case 138 -> 99;
               case 139 -> 155;
               case 140 -> 141;
               case 141 -> 83;
               case 142 -> 250;
               case 143 -> 51;
               case 144 -> 107;
               case 145 -> 143;
               case 146 -> 55;
               case 147 -> 63;
               case 148 -> 140;
               case 149 -> 109;
               case 150 -> 185;
               case 151 -> 64;
               case 152 -> 60;
               case 153 -> 126;
               case 154 -> 104;
               case 155 -> 164;
               case 156 -> 73;
               case 157 -> 120;
               case 158 -> 36;
               case 159 -> 14;
               case 160 -> 168;
               case 161 -> 186;
               case 162 -> 119;
               case 163 -> 229;
               case 164 -> 33;
               case 165 -> 1;
               case 166 -> 189;
               case 167 -> 86;
               case 168 -> 208;
               case 169 -> 178;
               case 170 -> 174;
               case 171 -> 213;
               case 172 -> 231;
               case 173 -> 191;
               case 174 -> 75;
               case 175 -> 21;
               case 176 -> 11;
               case 177 -> 181;
               case 178 -> 215;
               case 179 -> 117;
               case 180 -> 219;
               case 181 -> 77;
               case 182 -> 13;
               case 183 -> 176;
               case 184 -> 157;
               case 185 -> 199;
               case 186 -> 232;
               case 187 -> 237;
               case 188 -> 217;
               case 189 -> 130;
               case 190 -> 148;
               case 191 -> 245;
               case 192 -> 61;
               case 193 -> 79;
               case 194 -> 108;
               case 195 -> 224;
               case 196 -> 95;
               case 197 -> 94;
               case 198 -> 16;
               case 199 -> 230;
               case 200 -> 195;
               case 201 -> 78;
               case 202 -> 45;
               case 203 -> 221;
               case 204 -> 84;
               case 205 -> 35;
               case 206 -> 252;
               case 207 -> 236;
               case 208 -> 19;
               case 209 -> 251;
               case 210 -> 135;
               case 211 -> 111;
               case 212 -> 151;
               case 213 -> 170;
               case 214 -> 98;
               case 215 -> 0;
               case 216 -> 192;
               case 217 -> 248;
               case 218 -> 43;
               case 219 -> 177;
               case 220 -> 249;
               case 221 -> 25;
               case 222 -> 56;
               case 223 -> 57;
               case 224 -> 2;
               case 225 -> 137;
               case 226 -> 225;
               case 227 -> 87;
               case 228 -> 23;
               case 229 -> 207;
               case 230 -> 255;
               case 231 -> 147;
               case 232 -> 76;
               case 233 -> 145;
               case 234 -> 129;
               case 235 -> 123;
               case 236 -> 235;
               case 237 -> 6;
               case 238 -> 187;
               case 239 -> 149;
               case 240 -> 197;
               case 241 -> 159;
               case 242 -> 211;
               case 243 -> 31;
               case 244 -> 4;
               case 245 -> 131;
               case 246 -> 66;
               case 247 -> 125;
               case 248 -> 65;
               case 249 -> 47;
               case 250 -> 92;
               case 251 -> 34;
               case 252 -> 15;
               case 253 -> 156;
               case 254 -> 218;
               default -> 234;
            };
            int var5 = (var1 & 0xFF) - var4;
            if (var5 < 0) {
               var5 += 256;
            }

            int var6 = ((var1 & 65535) >>> 8) - var4;
            if (var6 < 0) {
               var6 += 256;
            }

            for (int var7 = 0; var7 < var3.length; var7++) {
               int var8 = var7 % 2;
               char var10002 = var3[var7];
               if (var8 == 0) {
                  var3[var7] = (char)(var10002 ^ var5);
                  var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
               } else {
                  var3[var7] = (char)(var10002 ^ var6);
                  var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
               }
            }

            b[var2] = new String(var3).intern();
         }

         return b[var2];
      }
      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(kotlin.jvm.internal.DefaultConstructorMarker p0) { this(); }
      public static com.mojang.blaze3d.opengl.DirectStateAccess a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0) { return null; }
      public static boolean a(llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll p0, net.minecraft.client.gui.GuiGraphicsExtractor p1, int p2, int p3, int p4, int p5, boolean p6, kotlin.jvm.functions.Function0 p7, int p8, java.lang.Object p9) {
         if ((p8 & 32) != 0) {
            p6 = false;
         }

         return p0.a(p1, p2, p3, p4, p5, p6, p7);
      }
   }
}
