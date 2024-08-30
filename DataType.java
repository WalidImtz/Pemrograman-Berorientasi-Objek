import java.math.BigInteger;
import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan jumlah nilai: ");
        int nilai = Input.nextInt();
        BigInteger[] array = new BigInteger[nilai];

        // Menginput nilai dan menyimpannya dalam array
        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan Angka ke-" + (i + 1) + ": ");
            String input = Input.next();
            try {
                array[i] = new BigInteger(input);  // Mengonversi String ke BigInteger
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan angka yang valid.");
                i--; // Mengulang input untuk indeks yang sama
            }
        }

        // Menampilkan dan memeriksa setiap nilai
        for (int i = 0; i < nilai; i++) {
            System.out.println("Nilai ke-" + (i + 1) + ": " + array[i]);
            checkValueRange(array[i]);
        }

        Input.close();
    }

    private static void checkValueRange(BigInteger value) {
        System.out.println("Bisa masuk ke dalam:");

        // Periksa apakah value dapat masuk ke dalam tipe data byte
        try {
            value.byteValueExact();
            System.out.println("- byte");
        } catch (ArithmeticException e) {
            // Tidak dapat dimasukkan dalam byte
        }

        // Periksa apakah value dapat masuk ke dalam tipe data short
        try {
            value.shortValueExact();
            System.out.println("- short");
        } catch (ArithmeticException e) {
            // Tidak dapat dimasukkan dalam short
        }

        // Periksa apakah value dapat masuk ke dalam tipe data int
        try {
            value.intValueExact();
            System.out.println("- int");
        } catch (ArithmeticException e) {
            // Tidak dapat dimasukkan dalam int
        }

        // Periksa apakah value dapat masuk ke dalam tipe data long
        try {
            value.longValueExact();
            System.out.println("- long");
        } catch (ArithmeticException e) {
            System.out.println("- can't be fitted anywhere. ");
        }
    }
}