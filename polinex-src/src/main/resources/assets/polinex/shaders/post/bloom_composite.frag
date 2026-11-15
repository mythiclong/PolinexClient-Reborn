#version 330 core

uniform sampler2D InSampler;

layout(std140) uniform u_BloomParams {
    vec4 BloomParams;
};

in vec2 texCoord;
out vec4 fragColor;

void main() {
    float intensity = BloomParams.x;
    vec3 bloom = texture(InSampler, texCoord).rgb;

    // Reinhard tonemap soft-clamps the halo so stacked white pixels don't
    // blow out additive composite. preserves chroma of colored bloom while
    // taming the white-on-white pile-up that makes whites feel too strong
    // vs colored borders/text.
    vec3 toneMapped = bloom / (bloom + vec3(1.0));

    fragColor = vec4(toneMapped * intensity, 1.0);
}
