package P3;

import P1.shape;

public class circle extends shape{
    double radius;

    public circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}