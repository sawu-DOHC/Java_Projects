package Classes;

public class Circle extends GeometricShape {

    // attributes
    private double radius = 1;

    // constructor
    public Circle( double newRadius ) {
        this.radius = newRadius;
        setName("Circle");
    }

    // accessors
    public double getRadius() {
        return radius;
    }

    // mutators
    public void setRadius( double newRadius ) {
        this.radius = radius;
    }

    // other
    @Override
    public double getArea() {

        double area;

        area = Math.PI * Math.pow(radius, 2);

        return area;
    }
    @Override
    public double getPerimeter() {

        double circumference;

        circumference = 2 * Math.PI * this.radius;

        return circumference;
    }


}
