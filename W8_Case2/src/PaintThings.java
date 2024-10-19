//****************************************************
// PaintThings.java
//
// Program to compute the amount of paint needed
// to paint various shapes.
//****************************************************
public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350);

        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        double deckAmount = paint.amount(deck);
        double bigBallAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        System.out.println("Amount of paint needed for the deck: " + deckAmount + " gallons");
        System.out.println("Amount of paint needed for the big ball: " + bigBallAmount + " gallons");
        System.out.println("Amount of paint needed for the tank: " + tankAmount + " gallons");
    }
}
