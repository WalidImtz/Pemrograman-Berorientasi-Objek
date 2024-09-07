import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);

        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
