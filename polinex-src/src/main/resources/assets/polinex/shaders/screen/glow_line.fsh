#version 330 core

in vec4 vertexColor;
in vec2 vertexUV;
out vec4 fragColor;

void main() {
    float d = abs(vertexUV.y);

    float core = 1.0 - smoothstep(0.18, 0.32, d);

    float halo = exp(-d * d * 6.0);

    float cap = smoothstep(0.0, 0.04, vertexUV.x) * smoothstep(1.0, 0.96, vertexUV.x);

    float alpha = clamp((core + halo * 0.55) * cap, 0.0, 1.0);

    vec3 rgb = vertexColor.rgb + vec3(core) * 0.35;
    fragColor = vec4(rgb, vertexColor.a * alpha);
}
