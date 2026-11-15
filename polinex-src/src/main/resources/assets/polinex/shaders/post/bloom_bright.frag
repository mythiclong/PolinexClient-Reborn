#version 330 core

uniform sampler2D InSampler;

layout(std140) uniform u_BloomParams {
    vec4 BloomParams;
};

in vec2 texCoord;
out vec4 fragColor;

void main() {
    float threshold = BloomParams.x;
    float softKnee = max(BloomParams.y, 0.001);
    vec3 c = texture(InSampler, texCoord).rgb;

    float maxC = max(c.r, max(c.g, c.b));
    float minC = min(c.r, min(c.g, c.b));
    float over = maxC - threshold;
    float soft = clamp(over + softKnee, 0.0, 2.0 * softKnee);
    soft = soft * soft / (4.0 * softKnee);
    float factor = max(soft, over) / max(maxC, 0.0001);

    // saturation-aware boost so colored bloom isn't drowned by white.
    // sat=0 (gray/white) → 0.7x weight, sat=1 (pure color) → 1.3x weight.
    // tames "white text glows insanely, colored borders barely glow".
    float sat = (maxC - minC) / max(maxC, 0.0001);
    float chromaBoost = mix(0.7, 1.3, sat);

    fragColor = vec4(c * factor * chromaBoost, 1.0);
}
