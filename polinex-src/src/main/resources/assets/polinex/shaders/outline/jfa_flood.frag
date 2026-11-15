#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D InSampler;

in vec2 texCoord;

out vec4 fragColor;

vec4 jump(vec4 best, vec2 current, vec2 offset) {
    vec2 samplePos = current + offset;
    if (clamp(samplePos, 0.0, 1.0) != samplePos) return best;

    vec4 sampled = textureLod(InSampler, samplePos, 0.0);
    if (sampled.a < 0.5) return best;

    vec2 seed = sampled.xy;
    vec2 screenSize = vec2(textureSize(InSampler, 0));
    float dist = distance(floor(current * screenSize), floor(seed * screenSize));

    if (dist < best.z) {
        return vec4(seed, dist, 1.0);
    }
    return best;
}

void main() {
    vec2 screenSize = vec2(textureSize(InSampler, 0));
    vec2 step = round(JfaParams.x) / screenSize;

    vec4 best = vec4(0.0, 0.0, 9999999.0, 0.0);

    best = jump(best, texCoord, vec2( 0.0,  0.0) * step);
    best = jump(best, texCoord, vec2( 0.0,  1.0) * step);
    best = jump(best, texCoord, vec2( 1.0,  1.0) * step);
    best = jump(best, texCoord, vec2( 1.0,  0.0) * step);
    best = jump(best, texCoord, vec2( 1.0, -1.0) * step);
    best = jump(best, texCoord, vec2( 0.0, -1.0) * step);
    best = jump(best, texCoord, vec2(-1.0, -1.0) * step);
    best = jump(best, texCoord, vec2(-1.0,  0.0) * step);
    best = jump(best, texCoord, vec2(-1.0,  1.0) * step);

    fragColor = vec4(best.xy, 0.0, best.w);
}
