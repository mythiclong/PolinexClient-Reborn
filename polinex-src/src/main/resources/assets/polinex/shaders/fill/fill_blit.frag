#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;

in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec4 src = textureLod(MaskSampler, texCoord, 0.0);
    if (src.a < 0.0039) discard;
    fragColor = src;
}
