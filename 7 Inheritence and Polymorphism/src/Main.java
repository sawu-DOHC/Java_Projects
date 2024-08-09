import Classes.Circle;
import Classes.Rectangle;
import Classes.Triangle;

public class Main {

    public static void main(String[] args) {

        // create a new Circle object with radius 5
        Circle newCircle = new Circle(5);

        // create a new Rectangle object with width 2 and height 5
        Rectangle newRectangle = new Rectangle(2, 5);

        // create a new Triangle object with base 3 and height 4
        Triangle newTriangle = new Triangle(3, 4);

        // print details of the Circle object
        System.out.println("Circle 1: " + newCircle.toString());               // invokes toString method from GeometricShape
        System.out.println(" Radius: " + newCircle.getRadius());               // invokes getRadius method from Circle
        System.out.println(" Area: " + newCircle.getArea());                   // invokes getArea method from Circle
        System.out.println(" Circumference: " + newCircle.getPerimeter());     // invokes getPerimeter method from Circle

        System.out.println();                                                    // prints a line for formatting

        // print details of the Rectangle object
        System.out.println("Rectangle 1: " + newRectangle.toString());          // invokes toString method from GeometricShape
        System.out.println(" Height: " + newRectangle.getHeight());             // invokes getHeight method from Rectangle
        System.out.println(" Width: " + newRectangle.getWidth());               // invokes getWidth method from Rectangle
        System.out.println(" Area: " + newRectangle.getArea());                 // invokes getArea method from Rectangle
        System.out.println(" Perimeter: " + newRectangle.getPerimeter());       // invokes getPerimeter method from Rectangle

        System.out.println();                                                    // prints a line for formatting

        // print details of the Triangle object
        System.out.println("Triangle 1: " + newTriangle.toString());            // invokes toString method from GeometricShape
        System.out.println(" Base: " + newTriangle.getBase());                  // invokes getBase method from Triangle
        System.out.println(" Height: " + newTriangle.getHeight());              // invokes getHeight method from Triangle
        System.out.println(" Area: " + newTriangle.getArea());                  // invokes getArea method from Triangle
        System.out.println(" Perimeter: " + newTriangle.getPerimeter());        // invokes getPerimeter method from Triangle
    }
}
