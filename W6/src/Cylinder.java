public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius, and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Override getArea() to compute the surface area of the cylinder
    @Override
    public double getArea() {
        double radius = getRadius(); // retrieve the radius from Circle
        return 2 * Math.PI * radius * height + 2 * super.getArea(); // Surface area formula
    }

    // A public method for computing the volume of the cylinder
    // Use the base area from the Circle class
    public double getVolume() {
        return super.getArea() * height; // Use base area from Circle class
    }

    // Override toString() method to include height
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
