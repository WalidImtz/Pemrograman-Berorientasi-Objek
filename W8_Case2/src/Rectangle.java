//************************************************
// Rectangle.java
//
// Represents a rectangle.
//************************************************
public class Rectangle extends Shape {
    private double length;
    private double width;

    //---------------------------------
    // Constructor: Sets up the rectangle.
    //---------------------------------
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    //----------------------------------------
    // Returns the area of the rectangle.
    //----------------------------------------
    public double area() {
        return length * width;
    }

    //----------------------------------------
    // Returns the rectangle as a String.
    //----------------------------------------
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
