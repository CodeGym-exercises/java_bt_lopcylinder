package com.codegym.circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getVolume(){
        return Math.PI*Math.pow(this.radius,2)*this.height;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.printf("\nheight: %e\nvolume: %e",this.height,this.getVolume());
    }
}
