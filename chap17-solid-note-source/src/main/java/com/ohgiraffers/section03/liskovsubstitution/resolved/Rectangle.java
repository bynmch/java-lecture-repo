package com.ohgiraffers.section03.liskovsubstitution.resolved;

public class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
