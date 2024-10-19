import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many strings do you want to sort?");
        int num = scan.nextInt();
        scan.nextLine();

        String[] strings = new String[num];

        System.out.println("Enter " + num + " strings:");
        for (int i = 0; i < num; i++) {
            strings[i] = scan.nextLine();
        }


        Sorting.selectionSort(strings);

        System.out.println("\nYour strings in sorted order:");
        for (String str : strings) {
            System.out.println(str);
        }

        scan.close();
    }
}
