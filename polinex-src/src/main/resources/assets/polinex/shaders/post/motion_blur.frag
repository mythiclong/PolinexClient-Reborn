#version 330 core

uniform sampler2D InSampler;
uniform sampler2D DepthSampler;

layout(std140) uniform MotionBlurUbo {
    mat4 transform;
    vec4 params;
};

in vec2 texCoord;
out vec4 fragColor;

float hash12(vec2 p) {
    vec3 q = fract(vec3(p.xyx) * 0.1031);
    q += dot(q, q.yzx + 33.33);
    return fract((q.x + q.y) * q.z);
}

vec2 clampVelocity(vec2 v) {
    float lenSq = dot(v, v);
    return lenSq > 0.16 ? v * (0.4 * inversesqrt(lenSq)) : v;
}

void main() {
    float depth = texelFetch(DepthSampler, ivec2(gl_FragCoord.xy), 0).x;
    float nearCutoff = params.w;
    if (depth < nearCutoff) {
        fragColor = vec4(texture(InSampler, texCoord).rgb, 1.0);
        return;
    }

    vec4 ndcCurr = vec4(texCoord * 2.0 - 1.0, depth * 2.0 - 1.0, 1.0);
    vec4 prevH = transform * ndcCurr;
    vec2 prevUv = (prevH.xy / prevH.w) * 0.5 + 0.5;

    int samples = int(params.x);
    int halfN = int(params.y);
    float strength = params.z;
    float invN = 1.0 / float(samples);

    vec2 velocity = clampVelocity(texCoord - prevUv);
    vec2 step = velocity * strength * invN;

    vec2 seed = texCoord * vec2(textureSize(InSampler, 0));
    vec3 accum = vec3(0.0);
    for (int i = 0; i < samples; ++i) {
        float fi = float(i);
        float jitter = hash12(seed + vec2(fi * 1.7, fi + 0.3));
        float idx = fi - float(halfN);
        vec2 sampleUv = texCoord + (idx + jitter) * step;
        accum += texture(InSampler, sampleUv).rgb;
    }
    fragColor = vec4(accum * invN, 1.0);
}
