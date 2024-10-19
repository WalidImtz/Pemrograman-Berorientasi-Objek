//************************************************
// Shape.java
//
// Represents a geometric shape.
//************************************************
public abstract class Shape {
    protected String shapeName;

    //---------------------------------
    // Constructor: Sets up the shape with the specified name.
    //---------------------------------
    public Shape(String name) {
        shapeName = name;
    }

    //------------------------------------------------------
    // Abstract method that must be implemented by derived classes
    // to calculate the area of the shape.
    //------------------------------------------------------
    public abstract double area();

    //------------------------------------------------------
    // Returns the name of the shape as a String.
    //------------------------------------------------------
    public String toString() {
        return shapeName;
    }
}
