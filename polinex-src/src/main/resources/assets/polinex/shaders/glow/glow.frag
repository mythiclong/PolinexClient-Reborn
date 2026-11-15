/**
 * Author: ccetl
 * Created: 2024
 * License: GPL-3.0
 */
#version 330 core

in vec2 texCoord;
out vec4 fragColor;

uniform sampler2D texture0;

uniform sampler2D image;

layout(std140) uniform ItemChamsData {
    int useImage;

    float alpha;
    vec4 blendColor;

    float sampleMul;
    vec4 glowColor;
    float falloff;
    int layerCount;
};

vec3 applyGlow(vec3 base, vec2 uv) {
    if (glowColor.a <= 0.0) return base;

    vec2 texelSize = vec2(1.0) / textureSize(texture0, 0).xy;
    float weightSum = 0.0;
    int radius = max(layerCount, 1);

    for (int ix = -radius; ix <= radius; ix++) {
        for (int iy = -radius; iy <= radius; iy++) {
            float x = sampleMul * float(ix);
            float y = sampleMul * float(iy);
            float distance = length(vec2(x, y));
            float weight = max(0.0, 1.0 - (distance / max(falloff, 0.0001)));
            weightSum += weight;
        }
    }

    float intensity = clamp(weightSum / float((2 * radius + 1) * (2 * radius + 1)), 0.0, 1.0);
    return mix(base, glowColor.rgb, glowColor.a * intensity);
}

vec4 getFinalColor(vec4 color, vec2 uv) {
    vec3 rgb;
    if (blendColor.a == 0.0) {
        rgb = color.rgb;
    } else {
        rgb = (color.rgb * vec3(1.0 - blendColor.a)) + (blendColor.rgb * vec3(blendColor.a));
    }
    rgb = applyGlow(rgb, uv);
    return vec4(rgb, alpha);
}

void main() {
    vec2 uv = texCoord.xy;
    vec2 pos = gl_FragCoord.xy;

    vec4 color = textureLod(texture0, uv, 0.0);
    if (color.a != 0.0) {
        if (useImage == 1) {
            fragColor = getFinalColor(textureLod(image, uv, 0.0), uv);
            return;
        }

        fragColor = getFinalColor(color, uv);
        return;
    }

    if (glowColor.a == 0.0) {
        discard;
    }

    vec2 texelSize = vec2(1.0) / textureSize(texture0, 0).xy;
    float alpha = 0.0;

    for (int ix = -layerCount; ix <= layerCount; ix++) {
        for (int iy = -layerCount; iy <= layerCount; iy++) {
            if (ix == 0 && iy == 0) {
                continue;
            }

            float x = sampleMul * float(ix);
            float y = sampleMul * float(iy);

            float distance = length(vec2(x, y));
            float weight = max(0.0, 1.0 - (distance / falloff));
            vec2 offset = vec2(texelSize.x * x, texelSize.y * y);
            float positionAlpha = textureLod(texture0, uv + offset, 0.0).a;

            alpha += positionAlpha * weight;
        }
    }

    if (alpha == 0.0) {
        discard;
    }

    vec4 outColor = vec4(glowColor.rgb, alpha * glowColor.a);
    fragColor = outColor;
}
