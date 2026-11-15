package me.octo.client.utils;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryUtil;

public final class IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll {
    public static <T> T a(Object p0, Object p1) { return null; } // PX-FIX mr3
   @NotNull
   public static IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static int lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static int IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private static ByteBuffer llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] a;
   private static String[] b;

   private IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll() {
   }

   private final String a(float var1) {
      short var10000 = 32114;
      short var10001 = -13247;
      return "#version 330 core\nout vec4 FragColor;\nin vec2 fragCoord;\n\nuniform vec2 iResolution;\nuniform float iTime;\nuniform vec3 uColor1;\nuniform vec3 uColor2;\nuniform vec3 uColor3;\nuniform vec3 uColor4;\n\n// Terrain generation\nfloat snoise(vec2 p) {\n    vec2 f = fract(p);\n    p = floor(p);\n    float v = p.x + p.y * 1000.0;\n    vec4 r = vec4(v, v + 1.0, v + 1000.0, v + 1001.0);\n    r = fract(100000.0 * sin(r * 0.001));\n    f = f * f * (3.0 - 2.0 * f);\n    return 2.0 * (mix(mix(r.x, r.y, f.x), mix(r.z, r.w, f.x), f.y)) - 1.0;\n}\n\nfloat noise(in vec2 uv) {\n    return sin(uv.x) + cos(uv.y);\n}\n\nfloat terrain(in vec2 uv, int octaves) {\n    float value = 0.0;\n    float amplitude = 2.0 / 3.0;\n    float freq = 0.5;\n    float n1 = 0.0;\n\n    for (int i = 0; i < octaves; i++) {\n        n1 = (noise((uv) * freq) - n1);\n        value = (value + n1 * amplitude);\n        freq *= 2.0 - amplitude;\n        amplitude *= 1.0 / 3.0;\n        uv = uv.yx - n1 / freq;\n    }\n    return value;\n}\n\nvec2 map(vec3 p, int octaves) {\n    float dMin = 28.0;\n    float d;\n    float mID = -1.0;\n\n    float h = terrain(p.xz, octaves);\n    d = p.y - h;\n    if (d < dMin) {\n        dMin = d;\n        mID = 0.0;\n    }\n\n    return vec2(dMin, mID);\n}\n\nvec2 castRay(vec3 ro, vec3 rd, int octaves) {\n    const float p = 0.001;\n    float t = 0.0;\n    float h = p * 2.0;\n    float m = -1.0;\n    for (int i = 0; i < 36; i++) {\n        if (abs(h) <= p || t >= 28.0) break;\n        t += h;\n        vec2 res = map(ro + rd * t, octaves);\n        h = res.x;\n        m = res.y;\n    }\n    if (t > 28.0) m = -1.0;\n    return vec2(t, m);\n}\n\nvec3 calcNormal(vec3 p, int octaves) {\n    const vec3 eps = vec3(0.002, 0.0, 0.0);\n    return normalize(vec3(\n        map(p + eps.xyy, octaves).x - map(p - eps.xyy, octaves).x,\n        map(p + eps.yxy, octaves).x - map(p - eps.yxy, octaves).x,\n        map(p + eps.yyx, octaves).x - map(p - eps.yyx, octaves).x\n    ));\n}\n\nfloat shadows(vec3 ro, vec3 rd, float tMax, float k, int octaves) {\n    float res = 1.0;\n    float t = 0.1;\n    for (int i = 0; i < 22; i++) {\n        if (t >= tMax) break;\n        float h = map(ro + rd * t, octaves).x;\n        res = min(res, k * h / t);\n        t += h;\n    }\n    return clamp(res, 0.2, 1.0);\n}\n\nvec3 render(vec3 ro, vec3 rd) {\n    const int geoLOD = 4;\n\n    vec2 res = castRay(ro, rd, geoLOD);\n\n    vec3 lPos = normalize(vec3(1.0, 0.5, 0.0));\n    vec3 lCol = mix(uColor1, uColor2, 0.5);\n\n    vec3 pos = ro + rd * res.x;\n\n    // Sky color - blend between dark colors\n    vec3 color = mix(uColor3, uColor4, 0.7);\n    float sun = clamp(dot(rd, lPos), 0.0, 1.0);\n    color += lCol * 0.3 * sun * sun;\n\n    if (res.y < -0.5) {\n        return color;\n    }\n\n    vec3 skyColor = color;\n\n    int norLOD = int(max(2.0, 12.0 - 11.0 * res.x / 28.0));\n    vec3 nor = calcNormal(pos, norLOD);\n\n    // Mountain coloring with Polinex theme - ENHANCED\n    if (res.y > -0.5 && res.y < 0.5) {\n        // Base color from uColor palette with more contrast\n        color = mix(uColor4 * 1.2, uColor2 * 1.5, step(0.85, nor.y));\n\n        // Layer noise with more variation\n        float n = 0.5 * (snoise(pos.xy * vec2(2.0, 15.0)) + 1.0);\n        color = mix(uColor3 * 1.3, color, n * smoothstep(0.0, 0.7, 1.0 - nor.y));\n\n        // Stronger highlights on peaks\n        color = mix(color, uColor1 * 2.0, smoothstep(0.0, 0.3, nor.y - 0.75));\n\n        // Add depth through gradient\n        float heightGrad = pos.y / 5.0;\n        color = mix(color * 0.7, color, clamp(heightGrad, 0.0, 1.0));\n    }\n\n    // Enhanced lighting for more depth\n    float lAmb = clamp(0.6 + 0.6 * nor.y, 0.0, 1.0);\n    float lDif = clamp(dot(nor, lPos), 0.0, 2.5);\n\n    if (lDif > 0.05) lDif *= shadows(pos, lPos, 8.0, 12.0, geoLOD);\n\n    color += (0.5 * lAmb) * lCol;\n    color *= (2.2 * lDif) * lCol;\n\n    // Fog\n    float fog = exp(-0.003 * res.x * res.x);\n    color = mix(skyColor, color, fog);\n\n    return color;\n}\n\nvoid main() {\n    vec2 pos = 2.0 * (fragCoord.xy / iResolution.xy) - 1.0;\n    pos.x *= iResolution.x / iResolution.y;\n    float t1 = iTime;\n\n    // Camera\n    float x = 0.0 + (0.5 * t1);\n    float y = 0.0;\n    float z = 0.0 + sin(0.1 * t1);\n    vec3 cPos = vec3(x, y, z);\n    cPos.y = terrain(cPos.xz, 1) + 2.5;\n\n    const vec3 cUp = vec3(0.0, 1.0, 0.0);\n    vec3 cLook = vec3(cPos.x + 1.0, cPos.y * 0.85, 0.0);\n\n    // Camera matrix\n    vec3 ww = normalize(cLook - cPos);\n    vec3 uu = normalize(cross(ww, cUp));\n    vec3 vv = normalize(cross(uu, ww));\n\n    vec3 rd = normalize(pos.x * uu + pos.y * vv + 2.0 * ww);\n\n    // Render\n    vec3 color = render(cPos, rd);\n\n    FragColor = vec4(color, 1.0);\n}";
   }

   private final int a(int var1, String var2) {
      int var4 = GL20.glCreateShader(var1);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = d();
      GL20.glShaderSource(var4, var2);
      GL20.glCompileShader(var4);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3 = var10000;
      int var5 = GL20.glGetShaderi(var4, 35713);
      int var7 = var5;
      if (var3 == null) {
         if (var5 == 0) {
            String var8 = GL20.glGetShaderInfoLog(var4);
            short var10002 = 32124;
            short var10003 = -15464;
            Intrinsics.checkNotNullExpressionValue(var8, "glGetShaderInfoLog(...)");
            String var6 = var8;
            short var10001 = 32113;
            var10002 = -31385;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("Shader compilation failed: " + var6);
            GL20.glDeleteShader(var4);
            return 0;
         }

         var7 = var4;
      }

      return var7;
   }

   private final int a() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = d();
      int var2 = this.a(35633, lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = var10000;
      int var3 = this.a(35632, this.a(0.0F));
      int var7 = var2;
      if (var1 == null) {
         label28:
         if (var2 != 0) {
            int var8 = var3;
            if (var1 == null) {
               if (var3 == 0) {
                  break label28;
               }

               var8 = GL20.glCreateProgram();
            }

            int var4 = var8;
            GL20.glAttachShader(var4, var2);
            GL20.glAttachShader(var4, var3);
            GL20.glLinkProgram(var4);
            int var5 = GL20.glGetProgrami(var4, 35714);
            int var9 = var5;
            if (var1 == null) {
               if (var5 == 0) {
                  String var10 = GL20.glGetProgramInfoLog(var4);
                  short var10002 = 32122;
                  short var10003 = 12090;
                  Intrinsics.checkNotNullExpressionValue(var10, "glGetProgramInfoLog(...)");
                  String var6 = var10;
                  short var10001 = 32104;
                  var10002 = 31990;
                  System.out.println("Shader linking failed: " + var6);
                  GL20.glDeleteProgram(var4);
                  return 0;
               }

               GL20.glDeleteShader(var2);
               GL20.glDeleteShader(var3);
               var9 = var4;
            }

            return var9;
         }

         var7 = 0;
      }

      return var7;
   }

   private final void b() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = d();
      int var10000 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var1 == null) {
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return;
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = this.a();
         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var1 == null) {
         if (var10000 == 0) {
            short var4 = 32123;
            short var5 = -25906;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[ShaderRenderer] FAILED to create shader program");
            return;
         }

         short var10001 = 32111;
         short var10002 = 21353;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.d(
            "[ShaderRenderer] Shader program created successfully: " + lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
         );
         var10000 = 8;
      }

      float[] var3 = new float[var10000];
      var3[0] = -1.0F;
      var3[1] = -1.0F;
      var3[2] = 1.0F;
      var3[3] = -1.0F;
      var3[4] = -1.0F;
      var3[5] = 1.0F;
      var3[6] = 1.0F;
      var3[7] = 1.0F;
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = GL30.glGenVertexArrays();
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = GL30.glGenBuffers();
      GL30.glBindVertexArray(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      GL30.glBindBuffer(34962, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      GL30.glBufferData(34962, var3, 35044);
      GL30.glVertexAttribPointer(0, 2, 5126, false, 8, 0L);
      GL30.glEnableVertexAttribArray(0);
      GL30.glBindBuffer(34962, 0);
      GL30.glBindVertexArray(0);
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = true;
   }

   private final void a(int var1, int var2) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var3;
      int var10000;
      var3 = d();
      var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      label38:
      if (var3 == null) {
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII != 0) {
            var10000 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var3 != null) {
               break label38;
            }

            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll == var1) {
               var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
               if (var3 != null) {
                  break label38;
               }

               if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == var2) {
                  return;
               }
            }
         }

         var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      if (var3 == null) {
         if (var10000 != 0) {
            GL30.glDeleteFramebuffers(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            GL11.glDeleteTextures(IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         }

         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var1;
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = GL11.glGenTextures();
         GL11.glBindTexture(3553, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         GL11.glTexImage2D(3553,  0,  6408,  var1,  var2,  0,  6408,  5121, (float [])null);;
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glBindTexture(3553, 0);
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI, 0);
         var10000 = GL30.glCheckFramebufferStatus(36160);
      }

      char var10001 = '賕';
      if (var3 == null) {
         if (var10000 != 36053) {
            short var4 = 32117;
            short var5 = 27471;
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.b("[ShaderRenderer] Framebuffer is not complete!");
         }

         var10000 = 36160;
         var10001 = 0;
      }

      GL30.glBindFramebuffer(var10000, var10001);
   }

   @Nullable
   public final ByteBuffer a(float var1, float var2, float var3, @NotNull float[] var4, @NotNull float[] var5, @NotNull float[] var6, @NotNull float[] var7) {
      Object var27 = null; // PX-FIX
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = d();
      short var10002 = 32121;
      short var10003 = 31343;
      Intrinsics.checkNotNullParameter(var4, "color1");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = var10000;
      int var10001 = 32101;
      var10002 = 7834;
      Intrinsics.checkNotNullParameter(var5, "color2");
      var10001 = (short)32099;
      var10002 = 31664;
      Intrinsics.checkNotNullParameter(var6, "color3");
      var10001 = (short)32107;
      var10002 = -29111;
      Intrinsics.checkNotNullParameter(var7, "color4");
      int var24 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var8 == null) {
         if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            this.b();
         }

         var24 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var8 == null) {
         if (var24 == 0) {
            return null;
         }

         var24 = (int)var1;
      }

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int[] var14;
      label87: {
         label93: {
            var9 = var24;
            var10 = (int)var2;
            var11 = GL11.glGetInteger(36006);
            var12 = GL11.glGetInteger(35725);
            var13 = GL11.glGetInteger(34229);
            var14 = new int[4];
            GL11.glGetIntegerv(2978, var14);
            this.a(var9, var10);
            int var15 = var9 * var10 * 4;
            ByteBuffer var25 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            if (var8 == null) {
               if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI != null) {
                  ByteBuffer var26 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                  Intrinsics.checkNotNull(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
                  var27 = var26.capacity();
                  var10001 = var15;
                  if (var8 != null) {
                     break label87;
                  }

                  if ((Boolean)var27 == ((var15 == 0))) {
                     break label93;
                  }
               }

               var25 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
            }

            if (var25 != null) {
               ByteBuffer var18 = var25;
               boolean var19 = false;
               MemoryUtil.memFree(var18);
            }

            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = MemoryUtil.memAlloc(var15);
         }

         GL30.glBindFramebuffer(36160, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var27 = 0;
         var10001 = 0;
      }

      GL11.glViewport((Integer)var27, var10001, var9, var10);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glClear(16384);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL20.glUseProgram(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      short var35 = 32115;
      var10002 = 6532;
      int var16 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "iResolution");
      var35 = 32100;
      var10002 = -12902;
      int var17 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "iTime");
      var35 = 32108;
      var10002 = 6197;
      int var22 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor1");
      var35 = 32112;
      var10002 = -17771;
      int var23 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor2");
      var35 = 32119;
      var10002 = 19605;
      int var20 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor3");
      var35 = 32103;
      var10002 = -7435;
      int var21 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor4");
      int var28 = var16;
      if (var8 == null) {
         if (var16 >= 0) {
            GL20.glUniform2f(var16, var1, var2);
         }

         var28 = var17;
      }

      if (var8 == null) {
         if (var28 >= 0) {
            GL20.glUniform1f(var17, var3);
         }

         var28 = var22;
      }

      if (var8 == null) {
         if (var28 >= 0) {
            GL20.glUniform3f(var22, var4[0], var4[1], var4[2]);
         }

         var28 = var23;
      }

      if (var8 == null) {
         if (var28 >= 0) {
            GL20.glUniform3f(var23, var5[0], var5[1], var5[2]);
         }

         var28 = var20;
      }

      if (var8 == null) {
         if (var28 >= 0) {
            GL20.glUniform3f(var20, var6[0], var6[1], var6[2]);
         }

         var28 = var21;
      }

      if (var8 == null) {
         if (var28 >= 0) {
            GL20.glUniform3f(var21, var7[0], var7[1], var7[2]);
         }

         GL30.glBindVertexArray(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         GL11.glDrawArrays(5, 0, 4);
         GL30.glBindVertexArray(var13);
         ByteBuffer var29 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         Intrinsics.checkNotNull(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var29.position(0);
         ByteBuffer var30 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         Intrinsics.checkNotNull(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         ByteBuffer var41 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         Intrinsics.checkNotNull(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var30.limit(var41.capacity());
         ByteBuffer var10006 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         Intrinsics.checkNotNull(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         GL11.glReadPixels(0, 0, var9, var10, 6408, 5121, var10006);
         ByteBuffer var31 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         Intrinsics.checkNotNull(llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var31.position(0);
         GL20.glUseProgram(var12);
         GL30.glBindFramebuffer(36160, var11);
         var28 = var14[0];
      }

      GL11.glViewport(var28, var14[1], var14[2], var14[3]);
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final int a(float var1, float var2, float var3) {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var4 = d();
      int var10000 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var4 == null) {
         if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            this.b();
         }

         var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var4 == null) {
         if (var10000 == 0) {
            return 0;
         }

         var10000 = (int)var1;
      }

      int var5 = var10000;
      int var6 = (int)var2;
      int var7 = GL11.glGetInteger(36006);
      int var8 = GL11.glGetInteger(35725);
      int var9 = GL11.glGetInteger(34229);
      int[] var10 = new int[4];
      GL11.glGetIntegerv(2978, var10);
      this.a(var5, var6);
      GL30.glBindFramebuffer(36160, IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      GL11.glViewport(0, 0, var5, var6);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glClear(16384);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL20.glUseProgram(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      short var10001 = 32115;
      short var10002 = 6532;
      int var11 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "iResolution");
      var10001 = 32100;
      var10002 = -12902;
      int var12 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "iTime");
      var10000 = var11;
      if (var4 == null) {
         if (var11 >= 0) {
            GL20.glUniform2f(var11, var1, var2);
         }

         var10000 = var12;
      }

      if (var4 == null) {
         if (var10000 >= 0) {
            GL20.glUniform1f(var12, var3);
         }

         GL30.glBindVertexArray(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         GL11.glDrawArrays(5, 0, 4);
         GL30.glBindVertexArray(var9);
         GL20.glUseProgram(var8);
         GL30.glBindFramebuffer(36160, var7);
         GL11.glViewport(var10[0], var10[1], var10[2], var10[3]);
         var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      return var10000;
   }

   public final void b(float var1, float var2, float var3, @NotNull float[] var4, @NotNull float[] var5, @NotNull float[] var6, @NotNull float[] var7) {
      short var10001 = 32106;
      short var10002 = -18188;
      Intrinsics.checkNotNullParameter(var4, "color1");
      var10001 = 32105;
      var10002 = 2562;
      Intrinsics.checkNotNullParameter(var5, "color2");
      var10001 = 32102;
      var10002 = 32347;
      Intrinsics.checkNotNullParameter(var6, "color3");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var10000 = d();
      var10002 = 32097;
      short var10003 = 13987;
      Intrinsics.checkNotNullParameter(var7, "color4");
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var8 = var10000;
      int var22 =(( IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) ? 1 : 0);
      if (var8 == null) {
         if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            this.b();
         }

         var22 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      if (var8 == null) {
         if (var22 == 0) {
            return;
         }

         var22 = (int)var1;
      }

      int var9 = var22;
      int var10 = (int)var2;
      int var23 = var9;
      if (var8 == null) {
         if (var9 <= 0) {
            return;
         }

         var23 = var10;
      }

      if (var8 == null) {
         if (var23 <= 0) {
            return;
         }

         var23 = GL11.glGetInteger(35725);
      }

      int var11 = var23;
      int var12 = GL11.glGetInteger(34229);
      int[] var13 = new int[4];
      GL11.glGetIntegerv(2978, var13);
      int var24 = var13[2];
      if (var8 == null) {
         var24 = var24 > 0 ? var13[2] : var9;
      }

      int var14 = var24;
      int var25 = var13[3];
      if (var8 == null) {
         var25 = var25 > 0 ? var13[3] : var10;
      }

      int var15 = var25;
      GL11.glViewport(0, 0, var14, var15);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glClear(16384);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL20.glUseProgram(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      var10001 = 32098;
      var10002 = 27263;
      int var16 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "iResolution");
      var10001 = 32096;
      var10002 = -29967;
      int var17 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "iTime");
      var10001 = 32120;
      var10002 = -31279;
      int var18 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor1");
      var10001 = 32109;
      var10002 = 4969;
      int var19 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor2");
      var10001 = 32118;
      var10002 = 29722;
      int var20 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor3");
      var10001 = 32116;
      var10002 = -22317;
      int var21 = GL20.glGetUniformLocation(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "uColor4");
      int var26 = var16;
      if (var8 == null) {
         if (var16 >= 0) {
            GL20.glUniform2f(var16, var14, var15);
         }

         var26 = var17;
      }

      if (var8 == null) {
         if (var26 >= 0) {
            GL20.glUniform1f(var17, var3);
         }

         var26 = var18;
      }

      if (var8 == null) {
         if (var26 >= 0) {
            GL20.glUniform3f(var18, var4[0], var4[1], var4[2]);
         }

         var26 = var19;
      }

      if (var8 == null) {
         if (var26 >= 0) {
            GL20.glUniform3f(var19, var5[0], var5[1], var5[2]);
         }

         var26 = var20;
      }

      if (var8 == null) {
         if (var26 >= 0) {
            GL20.glUniform3f(var20, var6[0], var6[1], var6[2]);
         }

         var26 = var21;
      }

      if (var8 == null) {
         if (var26 >= 0) {
            GL20.glUniform3f(var21, var7[0], var7[1], var7[2]);
         }

         GL30.glBindVertexArray(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         GL11.glDrawArrays(5, 0, 4);
         GL30.glBindVertexArray(var12);
         GL20.glUseProgram(var11);
         var26 = var13[0];
      }

      GL11.glViewport(var26, var13[1], var13[2], var13[3]);
   }

   public final void c() {
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var1 = d();
      boolean var10000 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      if (var1 == null) {
         if (!IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) {
            return;
         }

         GL20.glDeleteProgram(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         GL30.glDeleteVertexArrays(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         GL30.glDeleteBuffers(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var10000 = false;
      }

      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var10000;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
   pxClinit: { // PX-FIX
      char[] var22 = null; // PX-FIX
      String[] var5 = new String[29];
      int var3 = 0;
      String var2 = "+ØÏ¨?\u0006:ì£p\u0000\u000f\u000bôÅ8ÓF¼ê.Ä×²\u0006qaÊÁ->\u0005¯Æ_k-\u0006ä\u000bx\u008c{\u0096\u0006h.é(I\u0003\u0007\u0010r1\t,\u0005æ\u0017 \u0002ËA¶\u0005êÜ;\u0093H_Ö\u001dueloK{9°Ä\u0006k\b\u0089ìE\u009a\u0006¶\u00192Î2Ý\u0006#\u0015\u0080Odè\u0007cQ_má\u0089Z\u0007¹F\u0004\u008f\u008aÕ4Î\u009cæ6\u0016\u009b Ô\u0002\u0013Wuhl\u008dêç=ÊåÄñ\u00966£=AX¿¥?HÃ{å\u0018\u000e,ì\u0088lÃ\u00120¼ÀL\u0004\u0011@z\u0001á\u0099Ì·r,\u009e\u008e\u0092í\u001eGý\u0095óé\u0097nc\u0011¡¢Ö\u009aH4à\u0086C?\u0093ææ+\fÍ\u009c(\u0005»*-50ó$\u0081\u0011²ók½\u000b\u0084)>çn8\u0016XãWÕÞ6h\u0017c\u009f ¨íF,\u0014H\u0019ÜÀ\u009e\u0088\u0082\u0018þ¡\u000f\u0087kÖE\u0096\u00101ËùVÖþü<.$ÈÄ8é\u0017\u001f\u0085Z±u\u009f5/wÍ\u0086v\u0004\u0098ìïZ¿ábñYu\u0003i¦öÎNß\u0098ò½ðm0r,¢\u0014Ìo\tú\u0000r¦6\u0081\u0004ïØ\u001b\u0084,'÷\u0015S\u0083G\t\u008a\u009eÊvò!\u008a àjPü¬\u0011Iãÿ\u0011»ÃÈ\t\u008f\u008eoßÁ\u007fj| óI²\u0094¼\u000e\u0088\u001a\u0080\u00078B4\u000f\u008cÅô\u001bý¿`öÃóD\rèDïÆX(²\nDkÍ\u001f)\f/'`ðsᇷ?\u0082B\u009a\u0015±\u00050)\u00112 \u0084\u0094÷Ä\u009e®\u0092\\q\\\u0089Mê³ÅWÂ.\u0084Ë\u0093\u0089J\u008eÛ`NÎ\u001aÙ.Ë¹VÂ+F\u0012í!ù3n´\u0003ëÙXny3Û¢àâº0y\u0005\u0019Q\u0002¦Qpñ°\u000b\u0083¬~éÊ3l£A\u001b\u0012SÏ¥<ÓÆÂg\u0003FÓ\u000e6×ÃôM[e\u0004\u0096°OÐ2\u0007Þ\u0015\u0090=ÒJ.M\u0017\u0098à±®\u0014I\u008fêÆl\u0099±~ÌÃÕKýc\u009b\tXt¥«á\u0007Â\u0014\u009c\u0019%\u0085È\u009f\u001aø£«Ô/Üx·×ß8þ\u0017Ø\u0011s>?1éð9¹@dø´ \u000b\u0094Ù#èÕÛ\u000f½MëCýgð¯_÷ðú\u009a<ð\u0012Ó}j¤£\u0093\u0082øn\u0080\u0093ñ\u0004\u001fRë×\u008a*ùAÕÁ\u0018:\u001c«\u0087\u0096\u0015FU\u0018\u0002\u0011£\u0002¥\u0090É^f\u0015\\ý£ÑõF2{\u0097\u0017Ý&¿ß\bë£¦Y\u0098ÈáÊl\u0019\u000e'd\u001b\u009cÏN\u0013E\u0081\u009aá\u0095\u001d3hÝ¾Pñ&r¸\u00adþtÔ£\u0005r\u0097Å[ÿD|Ú)7\råJ?H\u0004R\u0014½T\u0017N\u0004æ\u008aôé\u001dBNØÛ!\u008f§b\u0017\u0084#\u009bIì/½D½ \u000f\u0097\u009e\u0001Cò\\RÎG8#¹L\u0018X\u0007íS\u0094\u0010rÚw\u009b\u0092»YZªMª\u0018K3Fý\u0085+kaL\u0011\n}¬\u001e\u009bèG¤ßu0\u0010.-\u0000¡p\u0087'ØO\u0098àð+Ï\u000eÅEÝ\u0084\u0017At\tMêRî\u0096üh\u001eqO\u009d8Émö\u0011± ÿ¹Þô\u0010e±>S¨UyWÜ\u0087ÛÞÿ\u009fß\u0013õDÐÈl10!èT¶N|Æ6ñîÿ\u001a\r/~\u0082#n« \u0010\u0013ueæ¦è¡·4ü\u0005&MT¬\u009a\u009f\u0095+xõ\u001f\u0012>¨S¹\u0017\u0013ï|ÚÌØû\u008f\u0088!¹%\u0082á\u001dg¦_¿\bD\u0082å3\u0087î¢vQ¯r\u001e\u0098\u007fQúÄ#8`Íð\u0010\u0098AÏÝßÎCób¸\u0094Ý\u0002«ì¨w\u009bHLgø\u0092»>Z3ú\u009f5¯]=\u001d x·H¼Þ£\u009b\u001f®\nY\u008eWäûÀÖ,V6\u001b¨\u0000W\u0080ûÊ&0;¹ã+?´a·\u00ad&n\u000fsÉAü`½;\u0094&\"\ny\n\u008f\u0001ì\u0095¤z\u0087ü\u008d¹Þ{Â\u008c\u0016N\u008b2Ê:Õôkð\u000e\\A\u009aò\u001a$§N\u001dL\u0010ö$öÓGá4í®Ô\u001a_$ª<í¹¹\u001dÔ¾EýS\u0004<\f[PCc¤´Ñ5¢ÉO=zD\u0081Y¶\u001fGÖ\u000b\u0015°Zz:!,»\u009b©e\u0087£x¤´Ï\u0093J\u0019ª\u0090\u0084:¿Ä½j\u0083²XÏÆ»õ1J?\u00838+\u0012J±a\u0014ýM\u0015þ\bÒ.;Ð\n\u0081\u0092`\u0012\u008fF\u0012{\u0093G\u000b*µ\u009a\u0085}h\u00808B¬+xÍßÜÿ\\]Ýº\u0094ÞÛ\u0001`âµF¯vÓ\u008b©!u§ª\u0017æ3ô\u000fO.C\u009bÈF}ç¥_È%1fèñV\u009e\u008aÎäàO8\"¹l\u0018\u000e\u0007\"SÔ\u000f\u008cÊ\u0086+V.X&oÝE§wÿ\u000eaÅ2\u0005ö\\ÉpRíùl\u0017¢a\u0005\u0099ìcµ¨càJ8êqrO[\u008dä`\u001cqËcl\u008e$\u0096«Q,ãÀÂ0w×¯Uþ÷FÉ\u009a|`\u0000]ÌC?)Ø¯à\u0002Ìè\u0080¿\u0017GÆ\u008b\u0084\u008bXãÖ\u000e1\f\u0016åà.Æ\u0080Ó8VP\"QA\u0099CÐÛ\u008d\u001f_ä\u001d\u0016\u008a~ün|SluDØ¬L©\u0012é\u0093\u0015\u001bm¦Ê\u0095á\u0000\be} \u001cÕíÙÿ»î\u00ad\u009fô\\YzÈOÙc7;ÚÖ\u0087dØ£Þ<ù°\u001cW:i\u001fÎºMó9¤rP\u0095\f\u009d¬¥ÎF¨ZÏ\u000eòérj½gà\u0000\u0018ãô\u00adg\u009a\u0081YÐW´Â]ÀÄ\u0083D¡ RÑ._23¾I\u008f@\u00975J\t\u0015\u0088\u0096\u009dab\u0004c\u0003hÇÓ¬ÜÚ\u0082_IC\u001e8\u0083\u0084ts=¿\u008f\u0095\u001b6Ä\u0080I\u0096\bSÑ±ñ\u0088\u0016>\u001cé¼á)\u0014\nS\u0000Å\u000båø\u008bM0\u0095J@uC¨â\u009ahBLçG\u000b\t÷µ\n èÏ\u0001aâE\u000b\u0016.¾\u0013gn\u008f\u0091\u000búñÁ\u0002±\u0018w?£\u001d\u007fÈxÑ(ÇàW¢*¢Ìod\nGû\u009f¶ph&\"\u0004\u000f\u0006§Âåïs8\tF\u0099n\u001c\t\u0087lM^^çAá³à§4\u009dIvN\u008fqS\u0001*$\b9ÒÛM\u0080Âóëé\u0019Ó$\u008c\u000e´\u0010â-1¡\u0095\u0087:Ö(\u008d9*û\u0094Wû%ºÃ\u0016Ày7Uâúþ,Ô~!³¨ÅÄÖø\u0085½CMþµw¢êÊî&îùo;rÔ\u0013¤'ÃÑ\u0090â \u001eHj=Á\u0014éª\u0012ÖFp=¿\t\u0099é\rÜcJ\u0005R>ÑÊ\u0089\u008eE)¨!6\u008aÊÕngÂÉù\u0082E0r¤ß/R¢e×¨\u0019¦ò¨qC7á£ö7\u0089\n5¢\u0015\u0085\u008a\u009f\u0084²¬\u001aoi\u0087å\u0019{\u0090M{2\u008dJ\u0014âþtÈI\u0005\f\u0013OF\u0018\u0089D Q].K¢Oµ\"\bl.\u000eÁ\"\u008bÝYÈ¨ñ³ÆD\u0091sÈ\u0012\u0095ñc\u0016CAl\u0086>øïÜ;ÔgIéYjÇI\u001bÇ\u0098&SGnB8ù©D¿L\u0014õKÈM\\¿\rD\u0089 \u00ad\u0086\u0013\u0010\u0005ëð=\u009d£\u0002\u0082ÝÀ\u0018*\u001fw\u0015àu\u0010)\u0003\u0018\u0013ÛµV\u0010\u008b=û\\\u0088Z¹}\u0095{Iìbï£GoXVh\u0096÷\u001al\u009eÿ827\"ÄÖB\u009fCÛD,`Þ\thJîúO8£q£ôO\n\u001e\u0090k\"ÞIP%%ÏåÅñJwao÷\u000eS@ß)zâ¾r\bdè\u0006\u001b[¿ºß*=\rü\u009eÿã\u0019°ò\u001e´º\u009eçuáöÃÐ®\u0016\rÏ-Jta¡¯0[ô\u000e×äpÉí¥<\"ü¦\r=l\u0004gì\u009dóØá\u0005ð¸íÜ\u0000(0l\u009do½\u0007S1«YH{\u008bJª\u001f\b¢FE\u0011ñ&Þ£èçmT\bÊ\u0082]³\u0018§+\u0096§bvõ\u0016ÇíTé×ÚKäm@Û)\u008b\u00063gÉ'>`fë½þR}M\u001f\u008bÅ¥¼¾t¸òXJ$õE\u00adÃh\u0091\u0081ýL\u008a\u0096\u000e\u0092¼<KVAå«¸\u0096éB¡\u0006½Í\u0005\n^9Zð/k|Âôµ^@B3µ\u0081}\u0084Û¼\u0096F\u001b¦T±c\u008cê¹\u009bäÉ+ê\"_\u0015;dÇÍC\u0019ko\u008d9r\u00135\"%@N²+|oI5ã6ljP§\u0083_»?ySYÛ§\u0084úF[h ú\u0011UOZ\u0094dR{\u008f\u008b\u0015¾g°\u00ad®\u0017\u0097þnY-1ÁÈ?ïmÛpqåã\u008c\u0018³\u0091¬w\u009eÆÿ\u008f\u0017ªçæ\u0097?ApLà\u008eê[bÿ/=B£\u0004ÉrÅYC@\u008b»æ\u00132e°&/\u0015\u000e\u008dì»}\u0010gR¬É\u0091\u009cÎ\u009eWì ÞÓï<ÕÕ9\u0010ß£\u001b\\0\b\u008fð\t\u009f8×ï\u009dtsuvîMÙJ\u0088\u00989uâÊ9¾ÿ?Í¹W¹Æ~\u0090³û Óî\r\u0087\u0086\u000b»\u0082Ä\u0081°\u001f\u0095¡\u001dFö\u0012\u0098W\u0017UQ\u0088C\u008a\u008a]ô\u0000â(KÂu}\u001da\u0087Ý±ü'F½ÌWþÙL\\!Ûdø\u0088ü¢N|´IÙ'¬5NÀàt*qßçí¹¹ü\u0084M¸È\u0094§x\u0082Ü\u0000Û\u0083\u007f\u0093\\££\u000f÷0\u0000ß'È â\u007f¿\\{\u0089¶ÝÒX»\u009f\u0013dm9VPWHM³A\u009d×)33xlìý\u001c\u000b¢Á\u0096Òc®\u0001&\u009aêo\u0010\u0017\t\u0088ô¼¿ºÃ1\u001bz\u0099\u0087£nHDQÉ\u0016t8\u0085l\"EÔ1{a@¯OY?\u000f\u001c÷\u0097´%¢ì9R%\u0087ÂÁ|\u0010\n\u009aùâãâTs_/×©\u0000\u001fj+¤¢'x\u008dX\u000fD\u009d^\u0003Ã\tï\u0083Á\u0087ý\u0014ZD¯ê\u008f\tRýËéõáo\u0014\u0094DI\u0095±^nnco«^T¬pýSôùÐ2,~Íóô\u008cÖ¹zð¾0\b)í\u0011$Ï5î\u0095Á3Dê;\u008c\u0019û\u007f\u0085'>Ve¦\u0089\bÒAÂ¼\u001f\u0012\u008d\u0011A\u001a\u0097ÛeL\u0097Y\u0093@´\u001c&t'ÂÂp\u001d¦B5öáñ¿lQá\u0005?®+Ø \u008cÕUÚ1òÅÕ-\u008aLÒ\u0094üj\u00ad\u0004Nz\u009fÃ/©Í\u00155HØñ\u008e4ÏJ\u009aCw\u001fÓÌ\u0017ÑN\u0002±ï\u0097;¨>=î,\u001fÅ¦ÅEqáNØ$oÂ\u000eI\u0081ª4àp\u0012ØFª\u0083Ñ*|Ë¥úCõg\u0007Â¥kógZ\u0088wOµ\u008eå!\u0084\u009b\rä3âÛ\u0088\u0095Ð3fê\u007f\u008c\u0081òrÞ_\u0001·]®×K\u0019'¾¦pnæ0)O£JºYxY®\u0089×\u001dËhWÒÀ¶\u0089NÜY\u008c\n¼ºü´,\u0004âÈ6\u008a\u0083ñ¼|JoÇMí·\u0095\u0082?UËb¨|o{\u0016\u0001qéSe\r\u0005\u0010|¼§¸>UD\u009f\u000b\u0097\u0005\u0092Ä~E\u001e\u0012üc\u009cI\u0097\u008bðnòÉ½\u008afyãþ=p¬S\f]Æà\\FÍ]¤PÿéL±\u008bÅ\u009dÓPÉ\u008dTA÷\u0007?\u0018VjØ\u008döÅËlQ_æ\u0088Ö5¶¼«{\u001e\u008cp\th:\tÓ\u008d\u001cªÜÿ\u009a\u000e°\u0085\u0089¬\u0091\u0085~ï\u001dm\u008cÂÑNEhDeh0\tX\u0083ç{\u001cô\u0087d\u0006\u0016\u000b\u008c-ÉFv\u0001¸\u0004R\u009f\u009aBú\u000fpb\\êçrÿ^3\u001a#õµkØ\u00895yq\u000fí\u0097\u0096\u0097¤\u0007Lb\u009f\f¸·nP`®|Ó>¦yü\u0000\u0013\u000boQs\u0097©Ú÷/jT¡êÐ°nJJFá³q|µ\u0080¯pDåà*\u0012\u0080jÛÒ\u0094A§àÛV\u0011\u0088SËl\u0090eõ§b%dÂI<Lf\u0014¯N\u0016\u0002Mó¨F\u0098LØÛ®liçå\u001b?\u001fXË«ôv»ÊÕ[¥\u0087°\u0013¥³\u009cY\u001f î;M2ªüÿ3+^ÚB\u0086\u001eò%)=i\u0094j\u0098idMâ<tõ\u0084ôf\u000b\u0006\u008c\u000bü¼ø\u000e\u007fÝ¢Gà2æZ\u0093\u0095Ò½\u001d\u0098 \u0017çQ-AÅÌUí¿ißñ1\u0086\u00ade\u000e4\u00adì&ÌoÔÅï5Ø\u0086øÙT¤Jy=(nwâ7V#º\u0002¡;Ëí\u007fD9ªÒÁé\u0018Á\u0007¸\u008eR®\u009adÐËZúO¼ZFcèà÷}\fÆ\u0085×Þ¨whÊ\u0000O9¤-\u000fªÅ5\u008dAJ Ùâ4\u0086¶\u0013ô\u009d:\u001b«g\u0096_\u0003ÃO½¡\u0095\u0003\u0091!\u008d§/\u0017ø=0G8ì§}bñ\u00adH\u0094Û\u009cì²\u001a´Ñ&ñ\u0015\u000bÈ=âg\u00ad:Ý«*í³3\u0000\u00884º¡´üI\u0094À\u0018\u001e\u0098\u001fÂËwúê¼\u00ad\túçK^\u008fxÓné&?Mä;]ß\u009dç+OîÏÒ¹/\u001a\u0019õâ\u0006uÜ\u008e(\u008d-\u0086k¢%\u0015\u009b\u0007I\u001f£å\u008dj\u009b¡â\u00ad±\u0003$½7:Ák\u0094¼X÷]R\t?\u008bü\\NàE¯yÝ\u00008\u0004ë<B23\u008aóä,\u008fP3Ù+Þþéÿ\u0090Tí{ÐÈ|\u0090ÛS\u0083\u007f\u009bÏe\u0015¨A¦ùü\u0010_Ios«à_\u009f\u001cY\u008c\u0092©;Ñ\u008aNH\u0000ùL\fÎ\u008bý\u0017\u008fôrÃ£\u008bfK=§Õ¼û¨Ú/¤o\u0092\u0014\u0084¨|\u0084\u0016}p½W[&º\u008f¥ïãÒCP\u008ecüú\u0083Þ&W\u0018;+Hæ\r?\u001d9e\u0087kýB\u0084Ü$\r\u0015{T\u0094×´\u0098ô Ò¡ÙòHý\u0084r\u009a2¥\u00067Ä\u0005+qMGf-«äÍ\"ÓÏÔ2Ò±þÓ\u0000\u00172QyM\t\u0082E|f^\u001fêÇ\u008d#zÚgto\u008a\u000eâS;\"\r×äLMRÏu\u0095]G\u001d)\u001b\u0000uãF£å\u0098ÊÙõï\u0086BUÓ`ÕÕã«¿ä¿wî\u0017\u000eëÎ³f Ñ¡\u001bµ¤G»7|\u000f\u0017Ö\u0003\u0011Þ\nô\u009f°ÌÊ'qË¢rYv´g\u007f`Á-ä\u00994U\u0087\u0086èk\\b#&/ûðûyæOÀ£î9L\u001aþ\u0006Ss»\u0000\u0014B\u0002Y\u009ah\u001aªÏµ\r\u0005\u008dÄô\u0093£}\u008dy\u009dÏïýd\u0002Y§ÚwZB-1ÌÊhÀà©\u000e\u000frli¨\u0097Æ¢\u0098×\u0017_\u001dû\u000f¢\u000bÂæg£¤È\u0017àMÅð©Ý¨ùn\"\u008c*klq¯í®¸U¡\u0086Jm\u009aFnÔÇ<\u008dú\u009b\"\u009f/\u0010V\u009a¤\u001c\u0091Ë¼Fè\u0080¢\u0093\u009d\u009f\u0002øs\u0087\u0089\u0090^\u000fzM}aF\u0087\u0003$n0»·ý\u0003gâú\u001e+ªû.n\u007f@à(½H\u008d\u001br¤¿ícuÂäÙô{M\u0015éN9*×Ûµ½¢\u0015¤\f/\u001fÚgXÀ\u0005É\u008fwúåQ\u0005Ù\u0088\u0013ñì\u009e\u0093í\"ýÇ»X\u008b½°\u000f3÷\u0098\u0006tú¦\u009e\u001fjP\u009bFÐåwÑ\u007fëÀ1\u0011a|p\fIÁª<¹;\bÇa\u0096¤\u009eH\u0002!)ëà\u001a]û\u001b\u001f)At\u009b¤\u0003\u0006¸\u0093ícn\u009bãâ\u0003¿Êc: ¥ß\u000eH\tdEìÍ¸BÄ\u0018Ø\u0080\u001f°\u001f \"¬a\u0094ÏÒaÎkZ+È\u0097õ\u0099x'¡\u001fI}fiØ\u0083à\b\u0082àÐ+\u001cÔ_$Ã«©4\u009a\u008d\u000e(öB\u0095Ìèß\u0088æ·\u009dÉ9ÈÚÔ¸\u001fµý@ÿ©uBgËRQeÿíÃñ\u0082\u00160H¤Î'¤Âû\u0014ca\u009c»à\u0097Àü\u001blFGñÿ¬O[8äZ: \u0006ÂâáÅ.\u0092\u008e>\u0096µ\u008f\u0010õ\\\u0003y\u009c8hlî>\\ \u00ad?ÐËðµ}n^ìG\u008cLJ7|sBuFI»ªÔÄ\f&\u000b\u009e\u0011Fwê\u0011ÝÓì&\u0006\u0018\u0011+Kª¬2Ôþ8áZ\u0016¨\u0086°Ñ\u008e\u009c*·¤HÓ&ùÏÓ¤&ý©\u0010\u0087Mq\u0011i\r®ãz\u000e\u001a\u001b\u0005f¤a'SÂG\u0014õaoíÂ\u0095\u0014\u000baÍìF\u009aI/¥Ve¤ÏÖyËõ/\u0096¥Q\u001eÇrý^è'\u0019\u0007Ö}3\u0004\u0017í\u0085\u000emé,°\u0083:Ú\u0096J´½úÃëª\u009aCÐsè\näkË\u0081}ÓJî¾\f\u007f·|!sªeÖ@|d \u0087\u0012v\u0015ù\u001d\u009c\\µ\u0002°ÛÊªq9ÝGuó\u001f\u0099£°\u009a°lxüq;B@\u0082½U0H\u0097µPû+cÅh#°ðê¬\u008cþ\u001dlræ.:4w\f·ì\u0006àïÍ;\u0013\u0094\n\u0011\u00ad\u0084Ù¿0¹\u00821p\u0087CÖd\u009a\u009a-îv3èçap\u009fß\u008d\u0091íÈu\u0098\u0013_ã\u0085Þlh´`fqëÿ·JóÎ\u009c\u0012(ñ¯\u0018ùC)Eæ\u001dÙ$ØO\u0080Z\u009amvôÝÊ\u0095\u0086\u00989\u0099!\u0082øî7òjU@\u0094\u0098ø\u0010*ª¾ÂGÀü\fÛ(\u009b»[X¾Jë\u0004\u0087\u008e\u0088ïµ\u001eõ]Co²A\u0095\u0004F±IÐIWw\u009dé\u009cQç\u00adbËFT3á\u0085\u008f7\u009c\u0016îí\u001a[m¡\u0082G\u001bÞ;Sçeà\u008dæ¬VÙ®Mà$ñä«}\u0083ÐAúÊu\u000eBÅ«]á\\í#\u009eÑüj·\u0092:\u0083O\u009a\u0090[¢ÍIôÁ+[¿Ù\u009f\u0084³¾\u0084¯§E$\u0019\u0007d \u000f\u0010Tô\u0084H\u0094©ÒÎ8\bßa\u00adÃ\u000fc\u0010Û\bá¸\u0099\u00adJü©E1UÀ\u0084Ä¿!¼Î\u008chvZMR\u001ceÅ\u0084ï\u001d¹\u008f\u009c §|Ã-\u0099D\u008dÏ\u009ezØ£F9¥z\u009e\u0089®E\u001cï¬~Çi\u0094\u0002\u0091]þÈÕ=Í\u008a\u0096>\u0093rh]»a¯Qr´5\u0087V7ßÒJÙ\u000e{BkÍ\u008c\u0083æU¿íý\u0099È\u001e6¨\u0087)º×ª\u0093±\u009fBê\u0081é\u0011\u009dàY\u00adß\u000bÛêÝ6ú\u0000}¹6%ì\u0007ðÊ-\u001e¯ç\u0096-|ÿP§ìkÒÚ(ª¨t8÷eA7\u0098WKnmD\u0096À\u0088`\u001cÉýéÛ©\u00877~T\u0003èu\u0006`y\u008bs\u0007\fû²8\\#ï\u0007SuYé!\u0019@\u0007¤9§`þ(¹\u0006M-MHÝ\r\u0018l\u007fÆkäCÁqHYã\u009dÏÈÓþ\u001b2&[´DxÍ";
      int var4 = "+ØÏ¨?\u0006:ì£p\u0000\u000f\u000bôÅ8ÓF¼ê.Ä×²\u0006qaÊÁ->\u0005¯Æ_k-\u0006ä\u000bx\u008c{\u0096\u0006h.é(I\u0003\u0007\u0010r1\t,\u0005æ\u0017 \u0002ËA¶\u0005êÜ;\u0093H_Ö\u001dueloK{9°Ä\u0006k\b\u0089ìE\u009a\u0006¶\u00192Î2Ý\u0006#\u0015\u0080Odè\u0007cQ_má\u0089Z\u0007¹F\u0004\u008f\u008aÕ4Î\u009cæ6\u0016\u009b Ô\u0002\u0013Wuhl\u008dêç=ÊåÄñ\u00966£=AX¿¥?HÃ{å\u0018\u000e,ì\u0088lÃ\u00120¼ÀL\u0004\u0011@z\u0001á\u0099Ì·r,\u009e\u008e\u0092í\u001eGý\u0095óé\u0097nc\u0011¡¢Ö\u009aH4à\u0086C?\u0093ææ+\fÍ\u009c(\u0005»*-50ó$\u0081\u0011²ók½\u000b\u0084)>çn8\u0016XãWÕÞ6h\u0017c\u009f ¨íF,\u0014H\u0019ÜÀ\u009e\u0088\u0082\u0018þ¡\u000f\u0087kÖE\u0096\u00101ËùVÖþü<.$ÈÄ8é\u0017\u001f\u0085Z±u\u009f5/wÍ\u0086v\u0004\u0098ìïZ¿ábñYu\u0003i¦öÎNß\u0098ò½ðm0r,¢\u0014Ìo\tú\u0000r¦6\u0081\u0004ïØ\u001b\u0084,'÷\u0015S\u0083G\t\u008a\u009eÊvò!\u008a àjPü¬\u0011Iãÿ\u0011»ÃÈ\t\u008f\u008eoßÁ\u007fj| óI²\u0094¼\u000e\u0088\u001a\u0080\u00078B4\u000f\u008cÅô\u001bý¿`öÃóD\rèDïÆX(²\nDkÍ\u001f)\f/'`ðsᇷ?\u0082B\u009a\u0015±\u00050)\u00112 \u0084\u0094÷Ä\u009e®\u0092\\q\\\u0089Mê³ÅWÂ.\u0084Ë\u0093\u0089J\u008eÛ`NÎ\u001aÙ.Ë¹VÂ+F\u0012í!ù3n´\u0003ëÙXny3Û¢àâº0y\u0005\u0019Q\u0002¦Qpñ°\u000b\u0083¬~éÊ3l£A\u001b\u0012SÏ¥<ÓÆÂg\u0003FÓ\u000e6×ÃôM[e\u0004\u0096°OÐ2\u0007Þ\u0015\u0090=ÒJ.M\u0017\u0098à±®\u0014I\u008fêÆl\u0099±~ÌÃÕKýc\u009b\tXt¥«á\u0007Â\u0014\u009c\u0019%\u0085È\u009f\u001aø£«Ô/Üx·×ß8þ\u0017Ø\u0011s>?1éð9¹@dø´ \u000b\u0094Ù#èÕÛ\u000f½MëCýgð¯_÷ðú\u009a<ð\u0012Ó}j¤£\u0093\u0082øn\u0080\u0093ñ\u0004\u001fRë×\u008a*ùAÕÁ\u0018:\u001c«\u0087\u0096\u0015FU\u0018\u0002\u0011£\u0002¥\u0090É^f\u0015\\ý£ÑõF2{\u0097\u0017Ý&¿ß\bë£¦Y\u0098ÈáÊl\u0019\u000e'd\u001b\u009cÏN\u0013E\u0081\u009aá\u0095\u001d3hÝ¾Pñ&r¸\u00adþtÔ£\u0005r\u0097Å[ÿD|Ú)7\råJ?H\u0004R\u0014½T\u0017N\u0004æ\u008aôé\u001dBNØÛ!\u008f§b\u0017\u0084#\u009bIì/½D½ \u000f\u0097\u009e\u0001Cò\\RÎG8#¹L\u0018X\u0007íS\u0094\u0010rÚw\u009b\u0092»YZªMª\u0018K3Fý\u0085+kaL\u0011\n}¬\u001e\u009bèG¤ßu0\u0010.-\u0000¡p\u0087'ØO\u0098àð+Ï\u000eÅEÝ\u0084\u0017At\tMêRî\u0096üh\u001eqO\u009d8Émö\u0011± ÿ¹Þô\u0010e±>S¨UyWÜ\u0087ÛÞÿ\u009fß\u0013õDÐÈl10!èT¶N|Æ6ñîÿ\u001a\r/~\u0082#n« \u0010\u0013ueæ¦è¡·4ü\u0005&MT¬\u009a\u009f\u0095+xõ\u001f\u0012>¨S¹\u0017\u0013ï|ÚÌØû\u008f\u0088!¹%\u0082á\u001dg¦_¿\bD\u0082å3\u0087î¢vQ¯r\u001e\u0098\u007fQúÄ#8`Íð\u0010\u0098AÏÝßÎCób¸\u0094Ý\u0002«ì¨w\u009bHLgø\u0092»>Z3ú\u009f5¯]=\u001d x·H¼Þ£\u009b\u001f®\nY\u008eWäûÀÖ,V6\u001b¨\u0000W\u0080ûÊ&0;¹ã+?´a·\u00ad&n\u000fsÉAü`½;\u0094&\"\ny\n\u008f\u0001ì\u0095¤z\u0087ü\u008d¹Þ{Â\u008c\u0016N\u008b2Ê:Õôkð\u000e\\A\u009aò\u001a$§N\u001dL\u0010ö$öÓGá4í®Ô\u001a_$ª<í¹¹\u001dÔ¾EýS\u0004<\f[PCc¤´Ñ5¢ÉO=zD\u0081Y¶\u001fGÖ\u000b\u0015°Zz:!,»\u009b©e\u0087£x¤´Ï\u0093J\u0019ª\u0090\u0084:¿Ä½j\u0083²XÏÆ»õ1J?\u00838+\u0012J±a\u0014ýM\u0015þ\bÒ.;Ð\n\u0081\u0092`\u0012\u008fF\u0012{\u0093G\u000b*µ\u009a\u0085}h\u00808B¬+xÍßÜÿ\\]Ýº\u0094ÞÛ\u0001`âµF¯vÓ\u008b©!u§ª\u0017æ3ô\u000fO.C\u009bÈF}ç¥_È%1fèñV\u009e\u008aÎäàO8\"¹l\u0018\u000e\u0007\"SÔ\u000f\u008cÊ\u0086+V.X&oÝE§wÿ\u000eaÅ2\u0005ö\\ÉpRíùl\u0017¢a\u0005\u0099ìcµ¨càJ8êqrO[\u008dä`\u001cqËcl\u008e$\u0096«Q,ãÀÂ0w×¯Uþ÷FÉ\u009a|`\u0000]ÌC?)Ø¯à\u0002Ìè\u0080¿\u0017GÆ\u008b\u0084\u008bXãÖ\u000e1\f\u0016åà.Æ\u0080Ó8VP\"QA\u0099CÐÛ\u008d\u001f_ä\u001d\u0016\u008a~ün|SluDØ¬L©\u0012é\u0093\u0015\u001bm¦Ê\u0095á\u0000\be} \u001cÕíÙÿ»î\u00ad\u009fô\\YzÈOÙc7;ÚÖ\u0087dØ£Þ<ù°\u001cW:i\u001fÎºMó9¤rP\u0095\f\u009d¬¥ÎF¨ZÏ\u000eòérj½gà\u0000\u0018ãô\u00adg\u009a\u0081YÐW´Â]ÀÄ\u0083D¡ RÑ._23¾I\u008f@\u00975J\t\u0015\u0088\u0096\u009dab\u0004c\u0003hÇÓ¬ÜÚ\u0082_IC\u001e8\u0083\u0084ts=¿\u008f\u0095\u001b6Ä\u0080I\u0096\bSÑ±ñ\u0088\u0016>\u001cé¼á)\u0014\nS\u0000Å\u000båø\u008bM0\u0095J@uC¨â\u009ahBLçG\u000b\t÷µ\n èÏ\u0001aâE\u000b\u0016.¾\u0013gn\u008f\u0091\u000búñÁ\u0002±\u0018w?£\u001d\u007fÈxÑ(ÇàW¢*¢Ìod\nGû\u009f¶ph&\"\u0004\u000f\u0006§Âåïs8\tF\u0099n\u001c\t\u0087lM^^çAá³à§4\u009dIvN\u008fqS\u0001*$\b9ÒÛM\u0080Âóëé\u0019Ó$\u008c\u000e´\u0010â-1¡\u0095\u0087:Ö(\u008d9*û\u0094Wû%ºÃ\u0016Ày7Uâúþ,Ô~!³¨ÅÄÖø\u0085½CMþµw¢êÊî&îùo;rÔ\u0013¤'ÃÑ\u0090â \u001eHj=Á\u0014éª\u0012ÖFp=¿\t\u0099é\rÜcJ\u0005R>ÑÊ\u0089\u008eE)¨!6\u008aÊÕngÂÉù\u0082E0r¤ß/R¢e×¨\u0019¦ò¨qC7á£ö7\u0089\n5¢\u0015\u0085\u008a\u009f\u0084²¬\u001aoi\u0087å\u0019{\u0090M{2\u008dJ\u0014âþtÈI\u0005\f\u0013OF\u0018\u0089D Q].K¢Oµ\"\bl.\u000eÁ\"\u008bÝYÈ¨ñ³ÆD\u0091sÈ\u0012\u0095ñc\u0016CAl\u0086>øïÜ;ÔgIéYjÇI\u001bÇ\u0098&SGnB8ù©D¿L\u0014õKÈM\\¿\rD\u0089 \u00ad\u0086\u0013\u0010\u0005ëð=\u009d£\u0002\u0082ÝÀ\u0018*\u001fw\u0015àu\u0010)\u0003\u0018\u0013ÛµV\u0010\u008b=û\\\u0088Z¹}\u0095{Iìbï£GoXVh\u0096÷\u001al\u009eÿ827\"ÄÖB\u009fCÛD,`Þ\thJîúO8£q£ôO\n\u001e\u0090k\"ÞIP%%ÏåÅñJwao÷\u000eS@ß)zâ¾r\bdè\u0006\u001b[¿ºß*=\rü\u009eÿã\u0019°ò\u001e´º\u009eçuáöÃÐ®\u0016\rÏ-Jta¡¯0[ô\u000e×äpÉí¥<\"ü¦\r=l\u0004gì\u009dóØá\u0005ð¸íÜ\u0000(0l\u009do½\u0007S1«YH{\u008bJª\u001f\b¢FE\u0011ñ&Þ£èçmT\bÊ\u0082]³\u0018§+\u0096§bvõ\u0016ÇíTé×ÚKäm@Û)\u008b\u00063gÉ'>`fë½þR}M\u001f\u008bÅ¥¼¾t¸òXJ$õE\u00adÃh\u0091\u0081ýL\u008a\u0096\u000e\u0092¼<KVAå«¸\u0096éB¡\u0006½Í\u0005\n^9Zð/k|Âôµ^@B3µ\u0081}\u0084Û¼\u0096F\u001b¦T±c\u008cê¹\u009bäÉ+ê\"_\u0015;dÇÍC\u0019ko\u008d9r\u00135\"%@N²+|oI5ã6ljP§\u0083_»?ySYÛ§\u0084úF[h ú\u0011UOZ\u0094dR{\u008f\u008b\u0015¾g°\u00ad®\u0017\u0097þnY-1ÁÈ?ïmÛpqåã\u008c\u0018³\u0091¬w\u009eÆÿ\u008f\u0017ªçæ\u0097?ApLà\u008eê[bÿ/=B£\u0004ÉrÅYC@\u008b»æ\u00132e°&/\u0015\u000e\u008dì»}\u0010gR¬É\u0091\u009cÎ\u009eWì ÞÓï<ÕÕ9\u0010ß£\u001b\\0\b\u008fð\t\u009f8×ï\u009dtsuvîMÙJ\u0088\u00989uâÊ9¾ÿ?Í¹W¹Æ~\u0090³û Óî\r\u0087\u0086\u000b»\u0082Ä\u0081°\u001f\u0095¡\u001dFö\u0012\u0098W\u0017UQ\u0088C\u008a\u008a]ô\u0000â(KÂu}\u001da\u0087Ý±ü'F½ÌWþÙL\\!Ûdø\u0088ü¢N|´IÙ'¬5NÀàt*qßçí¹¹ü\u0084M¸È\u0094§x\u0082Ü\u0000Û\u0083\u007f\u0093\\££\u000f÷0\u0000ß'È â\u007f¿\\{\u0089¶ÝÒX»\u009f\u0013dm9VPWHM³A\u009d×)33xlìý\u001c\u000b¢Á\u0096Òc®\u0001&\u009aêo\u0010\u0017\t\u0088ô¼¿ºÃ1\u001bz\u0099\u0087£nHDQÉ\u0016t8\u0085l\"EÔ1{a@¯OY?\u000f\u001c÷\u0097´%¢ì9R%\u0087ÂÁ|\u0010\n\u009aùâãâTs_/×©\u0000\u001fj+¤¢'x\u008dX\u000fD\u009d^\u0003Ã\tï\u0083Á\u0087ý\u0014ZD¯ê\u008f\tRýËéõáo\u0014\u0094DI\u0095±^nnco«^T¬pýSôùÐ2,~Íóô\u008cÖ¹zð¾0\b)í\u0011$Ï5î\u0095Á3Dê;\u008c\u0019û\u007f\u0085'>Ve¦\u0089\bÒAÂ¼\u001f\u0012\u008d\u0011A\u001a\u0097ÛeL\u0097Y\u0093@´\u001c&t'ÂÂp\u001d¦B5öáñ¿lQá\u0005?®+Ø \u008cÕUÚ1òÅÕ-\u008aLÒ\u0094üj\u00ad\u0004Nz\u009fÃ/©Í\u00155HØñ\u008e4ÏJ\u009aCw\u001fÓÌ\u0017ÑN\u0002±ï\u0097;¨>=î,\u001fÅ¦ÅEqáNØ$oÂ\u000eI\u0081ª4àp\u0012ØFª\u0083Ñ*|Ë¥úCõg\u0007Â¥kógZ\u0088wOµ\u008eå!\u0084\u009b\rä3âÛ\u0088\u0095Ð3fê\u007f\u008c\u0081òrÞ_\u0001·]®×K\u0019'¾¦pnæ0)O£JºYxY®\u0089×\u001dËhWÒÀ¶\u0089NÜY\u008c\n¼ºü´,\u0004âÈ6\u008a\u0083ñ¼|JoÇMí·\u0095\u0082?UËb¨|o{\u0016\u0001qéSe\r\u0005\u0010|¼§¸>UD\u009f\u000b\u0097\u0005\u0092Ä~E\u001e\u0012üc\u009cI\u0097\u008bðnòÉ½\u008afyãþ=p¬S\f]Æà\\FÍ]¤PÿéL±\u008bÅ\u009dÓPÉ\u008dTA÷\u0007?\u0018VjØ\u008döÅËlQ_æ\u0088Ö5¶¼«{\u001e\u008cp\th:\tÓ\u008d\u001cªÜÿ\u009a\u000e°\u0085\u0089¬\u0091\u0085~ï\u001dm\u008cÂÑNEhDeh0\tX\u0083ç{\u001cô\u0087d\u0006\u0016\u000b\u008c-ÉFv\u0001¸\u0004R\u009f\u009aBú\u000fpb\\êçrÿ^3\u001a#õµkØ\u00895yq\u000fí\u0097\u0096\u0097¤\u0007Lb\u009f\f¸·nP`®|Ó>¦yü\u0000\u0013\u000boQs\u0097©Ú÷/jT¡êÐ°nJJFá³q|µ\u0080¯pDåà*\u0012\u0080jÛÒ\u0094A§àÛV\u0011\u0088SËl\u0090eõ§b%dÂI<Lf\u0014¯N\u0016\u0002Mó¨F\u0098LØÛ®liçå\u001b?\u001fXË«ôv»ÊÕ[¥\u0087°\u0013¥³\u009cY\u001f î;M2ªüÿ3+^ÚB\u0086\u001eò%)=i\u0094j\u0098idMâ<tõ\u0084ôf\u000b\u0006\u008c\u000bü¼ø\u000e\u007fÝ¢Gà2æZ\u0093\u0095Ò½\u001d\u0098 \u0017çQ-AÅÌUí¿ißñ1\u0086\u00ade\u000e4\u00adì&ÌoÔÅï5Ø\u0086øÙT¤Jy=(nwâ7V#º\u0002¡;Ëí\u007fD9ªÒÁé\u0018Á\u0007¸\u008eR®\u009adÐËZúO¼ZFcèà÷}\fÆ\u0085×Þ¨whÊ\u0000O9¤-\u000fªÅ5\u008dAJ Ùâ4\u0086¶\u0013ô\u009d:\u001b«g\u0096_\u0003ÃO½¡\u0095\u0003\u0091!\u008d§/\u0017ø=0G8ì§}bñ\u00adH\u0094Û\u009cì²\u001a´Ñ&ñ\u0015\u000bÈ=âg\u00ad:Ý«*í³3\u0000\u00884º¡´üI\u0094À\u0018\u001e\u0098\u001fÂËwúê¼\u00ad\túçK^\u008fxÓné&?Mä;]ß\u009dç+OîÏÒ¹/\u001a\u0019õâ\u0006uÜ\u008e(\u008d-\u0086k¢%\u0015\u009b\u0007I\u001f£å\u008dj\u009b¡â\u00ad±\u0003$½7:Ák\u0094¼X÷]R\t?\u008bü\\NàE¯yÝ\u00008\u0004ë<B23\u008aóä,\u008fP3Ù+Þþéÿ\u0090Tí{ÐÈ|\u0090ÛS\u0083\u007f\u009bÏe\u0015¨A¦ùü\u0010_Ios«à_\u009f\u001cY\u008c\u0092©;Ñ\u008aNH\u0000ùL\fÎ\u008bý\u0017\u008fôrÃ£\u008bfK=§Õ¼û¨Ú/¤o\u0092\u0014\u0084¨|\u0084\u0016}p½W[&º\u008f¥ïãÒCP\u008ecüú\u0083Þ&W\u0018;+Hæ\r?\u001d9e\u0087kýB\u0084Ü$\r\u0015{T\u0094×´\u0098ô Ò¡ÙòHý\u0084r\u009a2¥\u00067Ä\u0005+qMGf-«äÍ\"ÓÏÔ2Ò±þÓ\u0000\u00172QyM\t\u0082E|f^\u001fêÇ\u008d#zÚgto\u008a\u000eâS;\"\r×äLMRÏu\u0095]G\u001d)\u001b\u0000uãF£å\u0098ÊÙõï\u0086BUÓ`ÕÕã«¿ä¿wî\u0017\u000eëÎ³f Ñ¡\u001bµ¤G»7|\u000f\u0017Ö\u0003\u0011Þ\nô\u009f°ÌÊ'qË¢rYv´g\u007f`Á-ä\u00994U\u0087\u0086èk\\b#&/ûðûyæOÀ£î9L\u001aþ\u0006Ss»\u0000\u0014B\u0002Y\u009ah\u001aªÏµ\r\u0005\u008dÄô\u0093£}\u008dy\u009dÏïýd\u0002Y§ÚwZB-1ÌÊhÀà©\u000e\u000frli¨\u0097Æ¢\u0098×\u0017_\u001dû\u000f¢\u000bÂæg£¤È\u0017àMÅð©Ý¨ùn\"\u008c*klq¯í®¸U¡\u0086Jm\u009aFnÔÇ<\u008dú\u009b\"\u009f/\u0010V\u009a¤\u001c\u0091Ë¼Fè\u0080¢\u0093\u009d\u009f\u0002øs\u0087\u0089\u0090^\u000fzM}aF\u0087\u0003$n0»·ý\u0003gâú\u001e+ªû.n\u007f@à(½H\u008d\u001br¤¿ícuÂäÙô{M\u0015éN9*×Ûµ½¢\u0015¤\f/\u001fÚgXÀ\u0005É\u008fwúåQ\u0005Ù\u0088\u0013ñì\u009e\u0093í\"ýÇ»X\u008b½°\u000f3÷\u0098\u0006tú¦\u009e\u001fjP\u009bFÐåwÑ\u007fëÀ1\u0011a|p\fIÁª<¹;\bÇa\u0096¤\u009eH\u0002!)ëà\u001a]û\u001b\u001f)At\u009b¤\u0003\u0006¸\u0093ícn\u009bãâ\u0003¿Êc: ¥ß\u000eH\tdEìÍ¸BÄ\u0018Ø\u0080\u001f°\u001f \"¬a\u0094ÏÒaÎkZ+È\u0097õ\u0099x'¡\u001fI}fiØ\u0083à\b\u0082àÐ+\u001cÔ_$Ã«©4\u009a\u008d\u000e(öB\u0095Ìèß\u0088æ·\u009dÉ9ÈÚÔ¸\u001fµý@ÿ©uBgËRQeÿíÃñ\u0082\u00160H¤Î'¤Âû\u0014ca\u009c»à\u0097Àü\u001blFGñÿ¬O[8äZ: \u0006ÂâáÅ.\u0092\u008e>\u0096µ\u008f\u0010õ\\\u0003y\u009c8hlî>\\ \u00ad?ÐËðµ}n^ìG\u008cLJ7|sBuFI»ªÔÄ\f&\u000b\u009e\u0011Fwê\u0011ÝÓì&\u0006\u0018\u0011+Kª¬2Ôþ8áZ\u0016¨\u0086°Ñ\u008e\u009c*·¤HÓ&ùÏÓ¤&ý©\u0010\u0087Mq\u0011i\r®ãz\u000e\u001a\u001b\u0005f¤a'SÂG\u0014õaoíÂ\u0095\u0014\u000baÍìF\u009aI/¥Ve¤ÏÖyËõ/\u0096¥Q\u001eÇrý^è'\u0019\u0007Ö}3\u0004\u0017í\u0085\u000emé,°\u0083:Ú\u0096J´½úÃëª\u009aCÐsè\näkË\u0081}ÓJî¾\f\u007f·|!sªeÖ@|d \u0087\u0012v\u0015ù\u001d\u009c\\µ\u0002°ÛÊªq9ÝGuó\u001f\u0099£°\u009a°lxüq;B@\u0082½U0H\u0097µPû+cÅh#°ðê¬\u008cþ\u001dlræ.:4w\f·ì\u0006àïÍ;\u0013\u0094\n\u0011\u00ad\u0084Ù¿0¹\u00821p\u0087CÖd\u009a\u009a-îv3èçap\u009fß\u008d\u0091íÈu\u0098\u0013_ã\u0085Þlh´`fqëÿ·JóÎ\u009c\u0012(ñ¯\u0018ùC)Eæ\u001dÙ$ØO\u0080Z\u009amvôÝÊ\u0095\u0086\u00989\u0099!\u0082øî7òjU@\u0094\u0098ø\u0010*ª¾ÂGÀü\fÛ(\u009b»[X¾Jë\u0004\u0087\u008e\u0088ïµ\u001eõ]Co²A\u0095\u0004F±IÐIWw\u009dé\u009cQç\u00adbËFT3á\u0085\u008f7\u009c\u0016îí\u001a[m¡\u0082G\u001bÞ;Sçeà\u008dæ¬VÙ®Mà$ñä«}\u0083ÐAúÊu\u000eBÅ«]á\\í#\u009eÑüj·\u0092:\u0083O\u009a\u0090[¢ÍIôÁ+[¿Ù\u009f\u0084³¾\u0084¯§E$\u0019\u0007d \u000f\u0010Tô\u0084H\u0094©ÒÎ8\bßa\u00adÃ\u000fc\u0010Û\bá¸\u0099\u00adJü©E1UÀ\u0084Ä¿!¼Î\u008chvZMR\u001ceÅ\u0084ï\u001d¹\u008f\u009c §|Ã-\u0099D\u008dÏ\u009ezØ£F9¥z\u009e\u0089®E\u001cï¬~Çi\u0094\u0002\u0091]þÈÕ=Í\u008a\u0096>\u0093rh]»a¯Qr´5\u0087V7ßÒJÙ\u000e{BkÍ\u008c\u0083æU¿íý\u0099È\u001e6¨\u0087)º×ª\u0093±\u009fBê\u0081é\u0011\u009dàY\u00adß\u000bÛêÝ6ú\u0000}¹6%ì\u0007ðÊ-\u001e¯ç\u0096-|ÿP§ìkÒÚ(ª¨t8÷eA7\u0098WKnmD\u0096À\u0088`\u001cÉýéÛ©\u00877~T\u0003èu\u0006`y\u008bs\u0007\fû²8\\#ï\u0007SuYé!\u0019@\u0007¤9§`þ(¹\u0006M-MHÝ\r\u0018l\u007fÆkäCÁqHYã\u009dÏÈÓþ\u001b2&[´DxÍ"
         .length();
      b(null);
      char var1 = 5;
      int var8 = -1;

      label52:
      while (true) {
         short var10000 = 110;
         String var10001 = var2.substring(++var8, var8 + var1);
         byte var10002 = -1;

         while (true) {
            label47: {
               char[] var26 = var10001.toCharArray();
               int var10004 = var26.length;
               int var6 = 0;
               byte var29 = (byte)var10000;
               var22 = var26;
               int var15 = var10004;
               byte var34;
               char[] var38;
               int var10006;
               if (var10004 <= 1) {
                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               } else {
                  var29 = (byte)var10000;
                  var15 = var10004;
                  if (var10004 <= var6) {
                     break label47;
                  }

                  var38 = var26;
                  var34 = (byte)var10000;
                  var10006 = var6;
               }

               while (true) {
                  var38[var10006] = (char)(var38[var10006] ^ var34 ^ switch (var6 % 7) {
                     case 0 -> 32;
                     case 1 -> 71;
                     case 2 -> 32;
                     case 3 -> 75;
                     case 4 -> 64;
                     case 5 -> 125;
                     default -> 126;
                  });
                  var6++;
                  if (var29 == 0) {
                     var10006 = var29;
                     var38 = var22;
                     var34 = var29;
                  } else {
                     if (var15 <= var6) {
                        break;
                     }

                     var38 = var22;
                     var34 = var29;
                     var10006 = var6;
                  }
               }
            }

            String var31 = new String(var22).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var31;
                  if ((var8 += var1) >= var4) {
                     a = var5;
                     b = new String[29];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll();
                     var10000 = 32110;
                     short var17 = -4313;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "#version 330 core\nlayout (location = 0) in vec2 aPos;\nout vec2 fragCoord;\nuniform vec2 iResolution;\n\nvoid main() {\n    fragCoord = (aPos * 0.5 + 0.5) * iResolution;\n    gl_Position = vec4(aPos, 0.0, 1.0);\n}";
                     break pxClinit; // PX-FIX
                  }

                  var1 = var2.charAt(var8);
                  break;
               default:
                  var5[var3++] = var31;
                  if ((var8 += var1) < var4) {
                     var1 = var2.charAt(var8);
                     continue label52;
                  }

                  var2 = "Wló\u0013^;B\u0016üõôYu\u0094\në\u001c\u000bÇ×Î5µ*È/²\u0017êeA×!Q\u008d\u008c Ñê\u0081Åo\u0004\u0011\u009a\u0014\u0098¢\u0017©ò¸\u001cíh<¿k\u009e1r\u0005[\u0086`|h\u0004Ù\u0090\u0014=";
                  var4 = "Wló\u0013^;B\u0016üõôYu\u0094\në\u001c\u000bÇ×Î5µ*È/²\u0017êeA×!Q\u008d\u008c Ñê\u0081Åo\u0004\u0011\u009a\u0014\u0098¢\u0017©ò¸\u001cíh<¿k\u009e1r\u0005[\u0086`|h\u0004Ù\u0090\u0014="
                     .length();
                  var1 = '0';
                  var8 = -1;
            }

            var10000 = 104;
            var10001 = var2.substring(++var8, var8 + var1);
            var10002 = 0;
         }
      }
   } // PX-FIX end pxClinit
   }

   public static void b(lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var0;
   }

   public static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] d() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   private static String b(int var0, int var1) {
      int var2 = (var0 ^ 32096) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 255;
            case 1 -> 1;
            case 2 -> 243;
            case 3 -> 15;
            case 4 -> 42;
            case 5 -> 210;
            case 6 -> 203;
            case 7 -> 66;
            case 8 -> 250;
            case 9 -> 38;
            case 10 -> 7;
            case 11 -> 4;
            case 12 -> 166;
            case 13 -> 204;
            case 14 -> 144;
            case 15 -> 253;
            case 16 -> 223;
            case 17 -> 24;
            case 18 -> 75;
            case 19 -> 233;
            case 20 -> 219;
            case 21 -> 70;
            case 22 -> 121;
            case 23 -> 28;
            case 24 -> 6;
            case 25 -> 12;
            case 26 -> 185;
            case 27 -> 56;
            case 28 -> 11;
            case 29 -> 45;
            case 30 -> 73;
            case 31 -> 138;
            case 32 -> 115;
            case 33 -> 105;
            case 34 -> 245;
            case 35 -> 87;
            case 36 -> 143;
            case 37 -> 188;
            case 38 -> 22;
            case 39 -> 86;
            case 40 -> 55;
            case 41 -> 82;
            case 42 -> 88;
            case 43 -> 17;
            case 44 -> 13;
            case 45 -> 221;
            case 46 -> 217;
            case 47 -> 190;
            case 48 -> 111;
            case 49 -> 35;
            case 50 -> 230;
            case 51 -> 206;
            case 52 -> 154;
            case 53 -> 244;
            case 54 -> 49;
            case 55 -> 109;
            case 56 -> 33;
            case 57 -> 241;
            case 58 -> 98;
            case 59 -> 218;
            case 60 -> 37;
            case 61 -> 131;
            case 62 -> 41;
            case 63 -> 84;
            case 64 -> 162;
            case 65 -> 71;
            case 66 -> 227;
            case 67 -> 248;
            case 68 -> 60;
            case 69 -> 225;
            case 70 -> 52;
            case 71 -> 159;
            case 72 -> 222;
            case 73 -> 91;
            case 74 -> 196;
            case 75 -> 72;
            case 76 -> 3;
            case 77 -> 63;
            case 78 -> 116;
            case 79 -> 133;
            case 80 -> 189;
            case 81 -> 34;
            case 82 -> 176;
            case 83 -> 79;
            case 84 -> 29;
            case 85 -> 102;
            case 86 -> 197;
            case 87 -> 69;
            case 88 -> 226;
            case 89 -> 147;
            case 90 -> 173;
            case 91 -> 158;
            case 92 -> 92;
            case 93 -> 195;
            case 94 -> 202;
            case 95 -> 97;
            case 96 -> 150;
            case 97 -> 100;
            case 98 -> 169;
            case 99 -> 58;
            case 100 -> 127;
            case 101 -> 229;
            case 102 -> 235;
            case 103 -> 155;
            case 104 -> 10;
            case 105 -> 122;
            case 106 -> 216;
            case 107 -> 137;
            case 108 -> 16;
            case 109 -> 59;
            case 110 -> 163;
            case 111 -> 118;
            case 112 -> 149;
            case 113 -> 239;
            case 114 -> 0;
            case 115 -> 126;
            case 116 -> 140;
            case 117 -> 164;
            case 118 -> 146;
            case 119 -> 246;
            case 120 -> 252;
            case 121 -> 184;
            case 122 -> 141;
            case 123 -> 161;
            case 124 -> 101;
            case 125 -> 46;
            case 126 -> 26;
            case 127 -> 61;
            case 128 -> 238;
            case 129 -> 39;
            case 130 -> 145;
            case 131 -> 182;
            case 132 -> 160;
            case 133 -> 224;
            case 134 -> 93;
            case 135 -> 117;
            case 136 -> 200;
            case 137 -> 181;
            case 138 -> 64;
            case 139 -> 68;
            case 140 -> 83;
            case 141 -> 21;
            case 142 -> 198;
            case 143 -> 167;
            case 144 -> 193;
            case 145 -> 123;
            case 146 -> 142;
            case 147 -> 99;
            case 148 -> 237;
            case 149 -> 136;
            case 150 -> 192;
            case 151 -> 80;
            case 152 -> 179;
            case 153 -> 103;
            case 154 -> 156;
            case 155 -> 175;
            case 156 -> 48;
            case 157 -> 40;
            case 158 -> 65;
            case 159 -> 251;
            case 160 -> 211;
            case 161 -> 32;
            case 162 -> 9;
            case 163 -> 19;
            case 164 -> 14;
            case 165 -> 242;
            case 166 -> 157;
            case 167 -> 152;
            case 168 -> 76;
            case 169 -> 254;
            case 170 -> 209;
            case 171 -> 214;
            case 172 -> 81;
            case 173 -> 106;
            case 174 -> 170;
            case 175 -> 205;
            case 176 -> 249;
            case 177 -> 62;
            case 178 -> 108;
            case 179 -> 135;
            case 180 -> 234;
            case 181 -> 2;
            case 182 -> 153;
            case 183 -> 151;
            case 184 -> 43;
            case 185 -> 95;
            case 186 -> 172;
            case 187 -> 120;
            case 188 -> 107;
            case 189 -> 134;
            case 190 -> 8;
            case 191 -> 110;
            case 192 -> 74;
            case 193 -> 168;
            case 194 -> 47;
            case 195 -> 112;
            case 196 -> 44;
            case 197 -> 78;
            case 198 -> 240;
            case 199 -> 191;
            case 200 -> 129;
            case 201 -> 212;
            case 202 -> 236;
            case 203 -> 247;
            case 204 -> 51;
            case 205 -> 104;
            case 206 -> 23;
            case 207 -> 213;
            case 208 -> 25;
            case 209 -> 130;
            case 210 -> 54;
            case 211 -> 139;
            case 212 -> 207;
            case 213 -> 183;
            case 214 -> 5;
            case 215 -> 85;
            case 216 -> 119;
            case 217 -> 114;
            case 218 -> 148;
            case 219 -> 124;
            case 220 -> 30;
            case 221 -> 232;
            case 222 -> 113;
            case 223 -> 67;
            case 224 -> 94;
            case 225 -> 18;
            case 226 -> 178;
            case 227 -> 180;
            case 228 -> 220;
            case 229 -> 228;
            case 230 -> 199;
            case 231 -> 36;
            case 232 -> 186;
            case 233 -> 165;
            case 234 -> 50;
            case 235 -> 194;
            case 236 -> 215;
            case 237 -> 187;
            case 238 -> 57;
            case 239 -> 27;
            case 240 -> 77;
            case 241 -> 20;
            case 242 -> 128;
            case 243 -> 171;
            case 244 -> 90;
            case 245 -> 201;
            case 246 -> 177;
            case 247 -> 231;
            case 248 -> 89;
            case 249 -> 132;
            case 250 -> 96;
            case 251 -> 31;
            case 252 -> 174;
            case 253 -> 53;
            case 254 -> 125;
            default -> 208;
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

   // PX-FIX synth restored from jar bytecode
  public static java.nio.ByteBuffer a(me.octo.client.utils.IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll p0, float p1, float p2, float p3, float[] p4, float[] p5, float[] p6, float[] p7, int p8, java.lang.Object p9) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] pxmask = d();
      if ((pxmask != null) || (p8 & 8) != 0) { p4 = new float[] { 0.15f, 0.08f, 0.22f }; }
      if ((pxmask != null) || (p8 & 16) != 0) { p5 = new float[] { 0.08f, 0.12f, 0.3f }; }
      if ((pxmask != null) || (p8 & 32) != 0) { p6 = new float[] { 0.08f, 0.22f, 0.3f }; }
      if ((pxmask != null) || (p8 & 64) != 0) { p7 = new float[] { 0.04f, 0.08f, 0.2f }; }
      return p0.a(p1, p2, p3, p4, p5, p6, p7);
   }
   // PX-FIX synth restored from jar bytecode
   public static void b(me.octo.client.utils.IllllIIIIIIIIlllIlIllIIlllIlIIIlllIllllIIlIlIIIIllllIllIIllIIIIIIlIIllIllIIlIllIllIll p0, float p1, float p2, float p3, float[] p4, float[] p5, float[] p6, float[] p7, int p8, java.lang.Object p9) {
      me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[] pxmask = d();
      if ((pxmask != null) || (p8 & 8) != 0) { p4 = new float[] { 0.15f, 0.08f, 0.22f }; }
      if ((pxmask != null) || (p8 & 16) != 0) { p5 = new float[] { 0.08f, 0.12f, 0.3f }; }
      if ((pxmask != null) || (p8 & 32) != 0) { p6 = new float[] { 0.08f, 0.22f, 0.3f }; }
      if ((pxmask != null) || (p8 & 64) != 0) { p7 = new float[] { 0.04f, 0.08f, 0.2f }; }
      p0.b(p1, p2, p3, p4, p5, p6, p7);
      if (me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.f() == null) {
         b(new me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll[3]);
      }
   }
}
