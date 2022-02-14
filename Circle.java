package com.company;

public class Circle extends Shape {
    private double radius = 1;

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double result = Math.PI * radius * radius;
        return result;
    }
    public double getPerimeter(){
        double result = 2 * radius * Math.PI;
        return result;
    }

    public String toString(){
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
}

