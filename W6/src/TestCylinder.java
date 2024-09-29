public class TestCylinder { // save as "TestCylinder.java"
    public static void main (String[] args) {
        // Declare and allocate a new instance of Cylinder with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " surface area=" + c1.getArea()  // This will call the overridden getArea() in Cylinder
                + " volume=" + c1.getVolume());    // Uses the base area (from Circle's getArea)
        System.out.println(c1.toString()); // Prints using Cylinder's overridden toString()

        // Declare and allocate a new instance of Cylinder, specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("\nCylinder 2:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " surface area=" + c2.getArea()  // This will call the overridden getArea() in Cylinder
                + " volume=" + c2.getVolume());    // Uses the base area (from Circle's getArea)
        System.out.println(c2.toString()); // Prints using Cylinder's overridden toString()

        // Declare and allocate a new instance of Cylinder, specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("\nCylinder 3:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " surface area=" + c3.getArea()  // This will call the overridden getArea() in Cylinder
                + " volume=" + c3.getVolume());    // Uses the base area (from Circle's getArea)
        System.out.println(c3.toString()); // Prints using Cylinder's overridden toString()
    }
}
