package com.circle;

public class Cylinder extends Circle{
    private double height ;

    public double getVolume(){
        return this.height*super.getArea();
    }
    public String toString(){
        return "hình trụ có bán kính là:" + super.getRadius() + " thể tích là: " + this.getVolume();
    }
}
