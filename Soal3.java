import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int B = scanner.nextInt();
        
        int result = 0;
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(result);

        scanner.close();
    }
}
