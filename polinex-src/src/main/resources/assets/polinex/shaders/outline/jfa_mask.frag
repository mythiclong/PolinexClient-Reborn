#version 330 core

uniform sampler2D InSampler;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    vec4 color = textureLod(InSampler, texCoord, 0.0);
    fragColor = vec4(texCoord.x, texCoord.y, 0.0, step(0.0039, color.a));
}
