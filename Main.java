import java.util.Scanner;
import P1.shape;
import P2.rectangle;
import P3.circle;

public class Main{

    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the type of shape (Rectangle/Circle):");
        String shapeType = Scanner.nextLine();

        shape shape;
        if (shapeType.equalsIgnoreCase("Rectangle")) {
           // if (shapeType == "Rectangle"){
            System.out.println("Enter length and width of the rectangle:");
            double length = Scanner.nextDouble();
            double width = Scanner.nextDouble();
            shape = new rectangle(length, width);
        } 
       else if (shapeType.equalsIgnoreCase("Circle")) {
            //else if (shapeType == "Circle"){
            System.out.println("Enter radius of the circle:");
            double radius = Scanner.nextDouble();
            shape = new circle(radius);
        } else {
            System.out.println("Invalid shape type entered.");
            return;
        }

        System.out.println("Area of the " + shapeType + " is: " + shape.area());
    }
}

    

