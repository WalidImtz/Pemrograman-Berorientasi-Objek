//************************************************
// Cylinder.java
//
// Represents a cylinder.
//************************************************
public class Cylinder extends Shape {
    private double radius;
    private double height;

    //---------------------------------
    // Constructor: Sets up the cylinder.
    //---------------------------------
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    //----------------------------------------
    // Returns the surface area of the cylinder.
    //----------------------------------------
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    //----------------------------------------
    // Returns the cylinder as a String.
    //----------------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
