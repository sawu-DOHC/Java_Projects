package Classes;

public class Triangle extends GeometricShape {

    // attributes
    private double base = 1; // using equilateral triangle for simplicity
    private double height = 1;

    // constructors and destructors
    public Triangle( double base, double height ) {
        this.base = base;
        this.height = height;
        setName("Triangle");
        setColor("Default Color");
    }

    // accessors
    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }

    // mutators
    public void setBase( double new_base ) {
        this.base = new_base;
    }
    public void setHeight( double new_height ) {
        this.height = new_height;
    }

    // other
    @Override
    public double getArea() {
        double baseTimesHeight;
        double area;

        baseTimesHeight = base * height;
        area = 0.5 * baseTimesHeight;

        return area;
    }
    @Override
    public double getPerimeter() {
        double perimeter;

        perimeter = 3 * base;

        return perimeter;
    }
}
