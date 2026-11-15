#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    float u_width = JfaParams.y;
    int radius = int(clamp(u_width, 1.0, 64.0));
    vec2 step = vec2(1.0 / float(textureSize(MaskSampler, 0).x), 0.0);

    float sigma = max(u_width * 0.5, 0.5);
    float twoSigmaSq = 2.0 * sigma * sigma;

    vec4 center = texture(MaskSampler, texCoord);
    center.rgb *= center.a;
    vec4 sum = center;
    float weightSum = 1.0;

    for (int j = 0; j < 32; j++) {
        int i0 = 1 + j * 2;
        if (i0 > radius) break;
        int i1 = i0 + 1;
        float w0 = exp(-float(i0 * i0) / twoSigmaSq);
        float w1 = (i1 <= radius) ? exp(-float(i1 * i1) / twoSigmaSq) : 0.0;
        float wPair = w0 + w1;
        float t = (float(i0) * w0 + float(i1) * w1) / wPair;

        vec4 sp = texture(MaskSampler, texCoord + step * t);
        sp.rgb *= sp.a;
        vec4 sn = texture(MaskSampler, texCoord - step * t);
        sn.rgb *= sn.a;
        sum += (sp + sn) * wPair;
        weightSum += 2.0 * wPair;
    }

    if (weightSum < 0.0001) {
        fragColor = vec4(0.0);
        return;
    }
    fragColor = sum / weightSum;
}
