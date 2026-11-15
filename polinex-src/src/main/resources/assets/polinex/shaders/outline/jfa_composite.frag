#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;
uniform sampler2D JfaSampler;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec4 here = textureLod(MaskSampler, texCoord, 0.0);
    if (here.a > 0.5) discard;

    vec4 jfa = textureLod(JfaSampler, texCoord, 0.0);
    if (jfa.a < 0.5) discard;

    vec2 seed = jfa.xy;
    vec2 screenSize = vec2(textureSize(MaskSampler, 0));
    float distPixels = distance(texCoord * screenSize, seed * screenSize);

    float width = clamp(JfaParams.y, 1.0, 64.0);
    if (distPixels > width) discard;

    vec4 seedColor = textureLod(MaskSampler, seed, 0.0);
    float alpha = clamp(width - distPixels + 1.0, 0.0, 1.0);
    fragColor = vec4(seedColor.rgb, seedColor.a * alpha);
}
