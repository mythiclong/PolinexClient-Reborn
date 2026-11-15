#version 330 core

uniform sampler2D InSampler;

layout(std140) uniform u_BloomParams {
    vec4 BloomParams;
};

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec2 stepDir = BloomParams.xy;
    float sigma = max(BloomParams.z, 0.001);
    int kernel = int(clamp(BloomParams.w, 1.0, 32.0));
    float twoSigSq = 2.0 * sigma * sigma;

    vec3 sum = texture(InSampler, texCoord).rgb;
    float weightSum = 1.0;
    for (int i = 1; i <= kernel; ++i) {
        float w = exp(-float(i * i) / twoSigSq);
        sum += texture(InSampler, texCoord + stepDir * float(i)).rgb * w;
        sum += texture(InSampler, texCoord - stepDir * float(i)).rgb * w;
        weightSum += 2.0 * w;
    }
    fragColor = vec4(sum / weightSum, 1.0);
}
