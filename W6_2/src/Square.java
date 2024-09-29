public class Square extends Rectangle {
    // No-arg constructor
    public Square() {
        super(1.0, 1.0);  // Call to Rectangle(double, double)
    }

    // Constructor with side
    public Square(double side) {
        super(side, side);  // Call to Rectangle(double, double)
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // Call to Rectangle(double, double)
    }

    // Override setWidth to set both width and length
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);  // Ensure the square remains a square
    }

    // Override setLength to set both width and length
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);  // Ensure the square remains a square
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
