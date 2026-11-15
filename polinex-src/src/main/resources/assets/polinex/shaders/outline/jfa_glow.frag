#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    vec2 texelSize = 1.0 / vec2(textureSize(MaskSampler, 0));

    float radius = clamp(JfaParams.z, 1.0, 48.0);
    int radiusInt = int(radius);
    float falloff = JfaParams.w;
    if (falloff <= 0.0) falloff = 1.0;

    vec3 accumColor = vec3(0.0);
    float accumWeight = 0.0;
    float maxIntensity = 0.0;

    for (int ix = -48; ix <= 48; ix++) {
        if (abs(ix) > radiusInt) continue;
        for (int iy = -48; iy <= 48; iy++) {
            if (abs(iy) > radiusInt) continue;

            vec2 offset = vec2(float(ix), float(iy));
            float dist = length(offset);
            if (dist > radius) continue;

            vec2 samplePos = texCoord + offset * texelSize;
            vec4 sampled = textureLod(MaskSampler, samplePos, 0.0);
            if (sampled.a < 0.5) continue;

            float t = dist / radius;
            float weight = exp(-(t * t) * 4.0);
            accumColor += sampled.rgb * weight;
            accumWeight += weight;
            maxIntensity = max(maxIntensity, weight);
        }
    }

    if (accumWeight < 0.0001) discard;

    vec3 finalColor = accumColor / accumWeight;
    float intensity = clamp(maxIntensity * falloff, 0.0, 1.0);

    vec4 here = textureLod(MaskSampler, texCoord, 0.0);
    if (here.a > 0.5) {
        fragColor = vec4(here.rgb, 0.0);
        return;
    }

    fragColor = vec4(finalColor, intensity);
}
