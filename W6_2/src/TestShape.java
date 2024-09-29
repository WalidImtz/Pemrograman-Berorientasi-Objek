public class TestShape {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape1 = new Shape();
        System.out.println(shape1);  // A Shape with color of green and filled

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);  // A Shape with color of blue and Not filled

        // Test Circle class
        Circle circle = new Circle(2.5, "red", true);
        System.out.println(circle);  // A Circle with radius=2.5, which is a subclass of A Shape with color of red and filled
        System.out.println("Area: " + circle.getArea());  // Area of the circle
        System.out.println("Perimeter: " + circle.getPerimeter());  // Perimeter of the circle

        // Test Rectangle class
        Rectangle rectangle = new Rectangle(2.0, 4.0, "yellow", false);
        System.out.println(rectangle);  // A Rectangle with width=2.0 and length=4.0, which is a subclass of A Shape with color of yellow and Not filled
        System.out.println("Area: " + rectangle.getArea());  // Area of the rectangle
        System.out.println("Perimeter: " + rectangle.getPerimeter());  // Perimeter of the rectangle

        // Test Square class
        Square square = new Square(5.0, "purple", true);
        System.out.println(square);  // A Square with side=5.0, which is a subclass of A Rectangle with width=5.0 and length=5.0, which is a subclass of A Shape with color of purple and filled
        System.out.println("Area: " + square.getArea());  // Area of the square
        System.out.println("Perimeter: " + square.getPerimeter());  // Perimeter of the square
    }
}
