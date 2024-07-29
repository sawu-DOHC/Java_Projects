package Classes;

public class Rectangle extends GeometricShape {

    // attributes
    private double width = 1;
    private double height = 1;


    // constructors
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        setName("Rectangle");
        setColor("Default Color");
    }


    // accessors
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }


    // mutators
    public void setWidth( double new_width ) {
        this.width = new_width;
    }

    public void setHeight( double new_height ) {
        this.height = new_height;
    }


    // other
    @Override
    public double getPerimeter() {

        double perimeter;

        perimeter = 2 * width + 2 * height;

        return perimeter;
    }

    @Override
    public double getArea() {

        double area;

        area = width * height;

        return area;
    }
}
