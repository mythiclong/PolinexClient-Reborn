#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;
uniform sampler2D OriginalMaskSampler;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    float u_cutout = JfaParams.y;
    float u_offset = JfaParams.z;
    float u_intensity = JfaParams.w;
    if (u_intensity <= 0.0) u_intensity = 1.0;

    vec2 in_texel_size = 1.0 / vec2(textureSize(MaskSampler, 0));

    bool isFinalPass = u_cutout > 0.5;
    float alphaScale = 1.0;
    if (isFinalPass) {
        float maskAlpha = texture(OriginalMaskSampler, texCoord).a;
        if (maskAlpha >= 1.0) {
            fragColor = vec4(0.0);
            return;
        }
        alphaScale = (1.0 - maskAlpha) * u_intensity;
    }

    #define MUL(x) x = vec4(x.rgb * x.a, x.a)

    vec4 color = texture(MaskSampler, texCoord + vec2(-in_texel_size.x * 2.0, 0.0) * u_offset);
    MUL(color);

    vec4 t1 = texture(MaskSampler, texCoord + vec2(-in_texel_size.x, in_texel_size.y) * u_offset);
    MUL(t1); color += t1 * 2.0;

    vec4 t2 = texture(MaskSampler, texCoord + vec2(0.0, in_texel_size.y * 2.0) * u_offset);
    MUL(t2); color += t2;

    vec4 t3 = texture(MaskSampler, texCoord + vec2(in_texel_size.x, in_texel_size.y) * u_offset);
    MUL(t3); color += t3 * 2.0;

    vec4 t4 = texture(MaskSampler, texCoord + vec2(in_texel_size.x * 2.0, 0.0) * u_offset);
    MUL(t4); color += t4;

    vec4 t5 = texture(MaskSampler, texCoord + vec2(in_texel_size.x, -in_texel_size.y) * u_offset);
    MUL(t5); color += t5 * 2.0;

    vec4 t6 = texture(MaskSampler, texCoord + vec2(0.0, -in_texel_size.y * 2.0) * u_offset);
    MUL(t6); color += t6;

    vec4 t7 = texture(MaskSampler, texCoord + vec2(-in_texel_size.x, -in_texel_size.y) * u_offset);
    MUL(t7); color += t7 * 2.0;

    #undef MUL

    vec4 final_color = color / 12.0;
    if (final_color.a < 0.0001) {
        fragColor = vec4(0.0);
        return;
    }
    fragColor = vec4(final_color.rgb / final_color.a, clamp(final_color.a * alphaScale, 0.0, 1.0));
}
