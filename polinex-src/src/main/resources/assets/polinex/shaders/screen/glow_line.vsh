#version 330 core

in vec3 Position;
in vec2 UV0;
in vec4 Color;

out vec4 vertexColor;
out vec2 vertexUV;

void main() {
    gl_Position = vec4(Position, 1.0);
    vertexColor = Color;
    vertexUV = UV0;
}
