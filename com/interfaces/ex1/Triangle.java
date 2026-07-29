package com.interfaces.ex1;

public class Triangle implements Shape{

    private double length;
    private double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * length * height;
    }
}
