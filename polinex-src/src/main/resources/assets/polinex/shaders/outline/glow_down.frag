#version 330 core

layout(std140) uniform u_JfaParams {
    vec4 JfaParams;
};

uniform sampler2D MaskSampler;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    float u_offset = JfaParams.z;
    vec2 in_texel_size = 1.0 / vec2(textureSize(MaskSampler, 0));

    #define MUL(x) x = vec4(x.rgb * x.a, x.a)

    vec4 color = texture(MaskSampler, texCoord);
    MUL(color);
    color *= 4.0;

    vec4 t1 = texture(MaskSampler, texCoord - in_texel_size * u_offset);
    MUL(t1);
    color += t1;

    vec4 t2 = texture(MaskSampler, texCoord + in_texel_size * u_offset);
    MUL(t2);
    color += t2;

    vec4 t3 = texture(MaskSampler, texCoord + vec2(in_texel_size.x, -in_texel_size.y) * u_offset);
    MUL(t3);
    color += t3;

    vec4 t4 = texture(MaskSampler, texCoord - vec2(in_texel_size.x, -in_texel_size.y) * u_offset);
    MUL(t4);
    color += t4;

    #undef MUL

    vec4 final_color = color / 8.0;
    if (final_color.a < 0.0001) {
        fragColor = vec4(0.0);
    } else {
        fragColor = vec4(final_color.rgb / final_color.a, final_color.a);
    }
}
