#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;
uniform sampler2D OriginalMaskSampler;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    float u_width = JfaParams.y;
    int radius = int(clamp(u_width, 1.0, 64.0));
    vec2 step = vec2(0.0, 1.0 / float(textureSize(MaskSampler, 0).y));

    float sigma = max(u_width * 0.5, 0.5);
    float twoSigmaSq = 2.0 * sigma * sigma;

    vec4 sum = texture(MaskSampler, texCoord);
    float weightSum = 1.0;

    for (int j = 0; j < 32; j++) {
        int i0 = 1 + j * 2;
        if (i0 > radius) break;
        int i1 = i0 + 1;
        float w0 = exp(-float(i0 * i0) / twoSigmaSq);
        float w1 = (i1 <= radius) ? exp(-float(i1 * i1) / twoSigmaSq) : 0.0;
        float wPair = w0 + w1;
        float t = (float(i0) * w0 + float(i1) * w1) / wPair;
        sum += (texture(MaskSampler, texCoord + step * t) + texture(MaskSampler, texCoord - step * t)) * wPair;
        weightSum += 2.0 * wPair;
    }

    if (weightSum < 0.0001 || sum.a < 0.0001) discard;
    sum /= weightSum;

    float originalA = texture(OriginalMaskSampler, texCoord).a;
    if (originalA >= 0.5) discard;

    if (sum.a < 0.001) discard;

    vec3 rgb = sum.rgb / max(sum.a, 0.0001);

    // Glow-line-style smooth composite: crisp AA'd core + soft shoulder.
    // `a` acts like a distance field: high near the silhouette edge, fades out.
    float a = sum.a;
    float core = smoothstep(0.03, 0.22, a);
    float shoulder = pow(a, 0.55);
    float alpha = clamp(max(core, shoulder * 0.6), 0.0, 1.0);

    fragColor = vec4(rgb, alpha);
}
