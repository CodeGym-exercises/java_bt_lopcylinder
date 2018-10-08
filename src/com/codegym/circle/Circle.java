package com.codegym.circle;

public class Circle {
    protected double radius;
    protected String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "White";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.printf("\nRadius: %e\nColor: %s",this.radius,this.color);
    }
}
