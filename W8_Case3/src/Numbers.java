import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to sort?");
        int num = scan.nextInt();
        Integer[] numbers = new Integer[num];

        System.out.println("Enter " + num + " integers:");
        for (int i = 0; i < num; i++) {
            numbers[i] = scan.nextInt();
        }


        Sorting.selectionSort(numbers);

        System.out.println("\nYour numbers in sorted order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scan.close();
    }
}
