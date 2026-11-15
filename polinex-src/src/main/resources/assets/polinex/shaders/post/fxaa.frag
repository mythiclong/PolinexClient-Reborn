#version 330 core

uniform sampler2D InSampler;

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

in vec2 texCoord;
out vec4 fragColor;

// Preset-controlled constants written at main() start from JfaParams.z (quality level).
float EDGE_THRESHOLD_MIN;
float EDGE_THRESHOLD_MAX;
int ITERATIONS;
float SUBPIXEL_QUALITY;

float quality(int i) {
    if (i < 5) return 1.0;
    if (i == 5) return 1.5;
    if (i < 10) return 2.0;
    if (i == 10) return 4.0;
    return 8.0;
}

float luma(vec3 rgb) {
    return dot(rgb, vec3(0.299, 0.587, 0.114));
}

void main() {
    int q = int(clamp(JfaParams.z, 0.0, 2.0));
    if (q <= 0) {
        EDGE_THRESHOLD_MIN = 0.0625; EDGE_THRESHOLD_MAX = 0.25;   ITERATIONS =  8; SUBPIXEL_QUALITY = 0.50;
    } else if (q == 1) {
        EDGE_THRESHOLD_MIN = 0.0312; EDGE_THRESHOLD_MAX = 0.125;  ITERATIONS = 12; SUBPIXEL_QUALITY = 0.75;
    } else {
        EDGE_THRESHOLD_MIN = 0.0156; EDGE_THRESHOLD_MAX = 0.0625; ITERATIONS = 24; SUBPIXEL_QUALITY = 1.00;
    }

    vec2 texSize = vec2(textureSize(InSampler, 0));
    vec2 inv = 1.0 / texSize;

    vec3 colorCenter = textureLod(InSampler, texCoord, 0.0).rgb;
    float lumaCenter = luma(colorCenter);

    float lumaDown  = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2( 0, -1)).rgb);
    float lumaUp    = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2( 0,  1)).rgb);
    float lumaLeft  = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2(-1,  0)).rgb);
    float lumaRight = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2( 1,  0)).rgb);

    float lumaMin = min(lumaCenter, min(min(lumaDown, lumaUp), min(lumaLeft, lumaRight)));
    float lumaMax = max(lumaCenter, max(max(lumaDown, lumaUp), max(lumaLeft, lumaRight)));
    float lumaRange = lumaMax - lumaMin;

    if (lumaRange < max(EDGE_THRESHOLD_MIN, lumaMax * EDGE_THRESHOLD_MAX)) {
        fragColor = vec4(colorCenter, 1.0);
        return;
    }

    float lumaDownLeft  = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2(-1, -1)).rgb);
    float lumaUpRight   = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2( 1,  1)).rgb);
    float lumaUpLeft    = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2(-1,  1)).rgb);
    float lumaDownRight = luma(textureLodOffset(InSampler, texCoord, 0.0, ivec2( 1, -1)).rgb);

    float lumaDownUp = lumaDown + lumaUp;
    float lumaLeftRight = lumaLeft + lumaRight;
    float lumaLeftCorners = lumaDownLeft + lumaUpLeft;
    float lumaDownCorners = lumaDownLeft + lumaDownRight;
    float lumaRightCorners = lumaDownRight + lumaUpRight;
    float lumaUpCorners = lumaUpRight + lumaUpLeft;

    float edgeHorizontal =
        abs(-2.0 * lumaLeft   + lumaLeftCorners)  +
        abs(-2.0 * lumaCenter + lumaDownUp)       * 2.0 +
        abs(-2.0 * lumaRight  + lumaRightCorners);
    float edgeVertical =
        abs(-2.0 * lumaUp     + lumaUpCorners)    +
        abs(-2.0 * lumaCenter + lumaLeftRight)    * 2.0 +
        abs(-2.0 * lumaDown   + lumaDownCorners);

    bool isHorizontal = edgeHorizontal >= edgeVertical;

    float luma1 = isHorizontal ? lumaDown : lumaLeft;
    float luma2 = isHorizontal ? lumaUp   : lumaRight;
    float gradient1 = luma1 - lumaCenter;
    float gradient2 = luma2 - lumaCenter;
    bool is1Steepest = abs(gradient1) >= abs(gradient2);
    float gradientScaled = 0.25 * max(abs(gradient1), abs(gradient2));

    float stepLength = isHorizontal ? inv.y : inv.x;
    float lumaLocalAverage;
    if (is1Steepest) {
        stepLength = -stepLength;
        lumaLocalAverage = 0.5 * (luma1 + lumaCenter);
    } else {
        lumaLocalAverage = 0.5 * (luma2 + lumaCenter);
    }

    vec2 currentUv = texCoord;
    if (isHorizontal) currentUv.y += stepLength * 0.5;
    else              currentUv.x += stepLength * 0.5;

    vec2 offset = isHorizontal ? vec2(inv.x, 0.0) : vec2(0.0, inv.y);
    vec2 uv1 = currentUv - offset;
    vec2 uv2 = currentUv + offset;

    float lumaEnd1 = luma(textureLod(InSampler, uv1, 0.0).rgb) - lumaLocalAverage;
    float lumaEnd2 = luma(textureLod(InSampler, uv2, 0.0).rgb) - lumaLocalAverage;
    bool reached1 = abs(lumaEnd1) >= gradientScaled;
    bool reached2 = abs(lumaEnd2) >= gradientScaled;
    bool reachedBoth = reached1 && reached2;

    if (!reached1) uv1 -= offset;
    if (!reached2) uv2 += offset;

    if (!reachedBoth) {
        for (int i = 2; i < ITERATIONS; i++) {
            if (!reached1) {
                lumaEnd1 = luma(textureLod(InSampler, uv1, 0.0).rgb) - lumaLocalAverage;
                reached1 = abs(lumaEnd1) >= gradientScaled;
            }
            if (!reached2) {
                lumaEnd2 = luma(textureLod(InSampler, uv2, 0.0).rgb) - lumaLocalAverage;
                reached2 = abs(lumaEnd2) >= gradientScaled;
            }
            if (!reached1) uv1 -= offset * quality(i);
            if (!reached2) uv2 += offset * quality(i);
            if (reached1 && reached2) break;
        }
    }

    float distance1 = isHorizontal ? (texCoord.x - uv1.x) : (texCoord.y - uv1.y);
    float distance2 = isHorizontal ? (uv2.x - texCoord.x) : (uv2.y - texCoord.y);
    bool isDirection1 = distance1 < distance2;
    float distanceFinal = min(distance1, distance2);
    float edgeThickness = (distance1 + distance2);
    float pixelOffset = -distanceFinal / edgeThickness + 0.5;

    bool isLumaCenterSmaller = lumaCenter < lumaLocalAverage;
    bool correctVariation = ((isDirection1 ? lumaEnd1 : lumaEnd2) < 0.0) != isLumaCenterSmaller;
    float finalOffset = correctVariation ? pixelOffset : 0.0;

    float lumaAverage = (1.0 / 12.0) * (2.0 * (lumaDownUp + lumaLeftRight) + lumaLeftCorners + lumaRightCorners);
    float subPixelOffset1 = clamp(abs(lumaAverage - lumaCenter) / lumaRange, 0.0, 1.0);
    float subPixelOffset2 = (-2.0 * subPixelOffset1 + 3.0) * subPixelOffset1 * subPixelOffset1;
    float subPixelOffsetFinal = subPixelOffset2 * subPixelOffset2 * SUBPIXEL_QUALITY;

    finalOffset = max(finalOffset, subPixelOffsetFinal);

    vec2 finalUv = texCoord;
    if (isHorizontal) finalUv.y += finalOffset * stepLength;
    else              finalUv.x += finalOffset * stepLength;

    float strength = clamp(JfaParams.x, 0.0, 1.0);
    if (strength <= 0.0) {
        fragColor = vec4(colorCenter, 1.0);
        return;
    }
    vec3 finalColor = textureLod(InSampler, finalUv, 0.0).rgb;
    fragColor = vec4(mix(colorCenter, finalColor, strength), 1.0);
}
