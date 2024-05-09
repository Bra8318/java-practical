package P2;
import P1.shape;

public class rectangle extends shape{
    double length;
    double width;


public rectangle (double length,double width){
    this.length = length;
    this.width = width;
}
public double area(){
    return length * width;
}

}