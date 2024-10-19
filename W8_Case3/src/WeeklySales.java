import java.util.Arrays;
import java.util.Scanner;

//public class WeeklySales {
//
//    public static void main(String[] args) {
//        Salesperson[] staff = new Salesperson[5];
//
//        staff[0] = new Salesperson("John", "Doe", 300);
//        staff[1] = new Salesperson("Jane", "Smith", 450);
//        staff[2] = new Salesperson("Bob", "Johnson", 300);
//        staff[3] = new Salesperson("Alice", "Brown", 250);
//        staff[4] = new Salesperson("Charlie", "Davis", 450);
//
//        // Menggunakan insertionSort dengan compareTo untuk mengurutkan
//        Sorting.insertionSort(staff, false); // false = descending order
//
//        System.out.println("Salespeople diurutkan berdasarkan total sales dan nama belakang:");
//        for (Salesperson person : staff) {
//            System.out.println(person);
//        }
//    }
//}


public class WeeklySales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many salespeople?");
        int num = scan.nextInt();
        scan.nextLine();

        Salesperson[] staff = new Salesperson[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter first name, last name, and total sales for person " + (i + 1) + ":");
            String firstName = scan.nextLine();
            String lastName = scan.nextLine();
            int totalSales = scan.nextInt();
            scan.nextLine();
            staff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(staff, false);

        System.out.println("Salespeople sorted by total sales and last name:");
        for (Salesperson person : staff) {
            System.out.println(person);
        }

        scan.close();
    }
}
