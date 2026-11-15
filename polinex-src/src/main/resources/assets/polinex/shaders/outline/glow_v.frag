#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;
uniform sampler2D OriginalMaskSampler;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    float u_cutout = JfaParams.y;
    float u_radius = JfaParams.z;
    float u_intensity = JfaParams.w;
    if (u_intensity <= 0.0) u_intensity = 1.0;

    int radius = int(clamp(u_radius, 1.0, 64.0));
    vec2 step = vec2(0.0, 1.0 / float(textureSize(MaskSampler, 0).y));

    float sigma = u_radius * 0.5;
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

    if (weightSum < 0.0001 || sum.a < 0.0001) {
        fragColor = vec4(0.0);
        return;
    }
    sum /= weightSum;

    vec3 rgb = sum.rgb / sum.a;
    float alpha = sum.a * u_intensity;

    if (u_cutout > 0.5) {
        vec2 d = 0.5 / vec2(textureSize(OriginalMaskSampler, 0));
        float m = 0.25 * (
            texture(OriginalMaskSampler, texCoord + vec2(-d.x, -d.y)).a +
            texture(OriginalMaskSampler, texCoord + vec2( d.x, -d.y)).a +
            texture(OriginalMaskSampler, texCoord + vec2(-d.x,  d.y)).a +
            texture(OriginalMaskSampler, texCoord + vec2( d.x,  d.y)).a);
        alpha *= mix(1.0, 0.15, smoothstep(0.0, 1.0, m));
    }

    fragColor = vec4(rgb, clamp(alpha, 0.0, 1.0));
}
