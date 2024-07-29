package Classes;

public abstract class GeometricShape {

    // attributes
    private String name = "Default Name";
    private String color = "Default Color";


    // constructors
    GeometricShape() {
    }

    // accessors
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    // mutators
    public void setColor( String newColor ) {
        this.color = newColor;
    }
    public void setName( String newName ) {
        this.name = newName;
    }

    // other methods
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){

        String new_string = name + " " + color;

        return new_string;
    }

}
