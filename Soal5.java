import java.util.Scanner;

public class Soal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mobil1 = scanner.next();
        String mobil2 = scanner.next();
        String mobil3 = scanner.next();
        String mobil4 = scanner.next();

        String gabunganPlat = mobil1 + mobil2 + mobil3 + mobil4;

        long angkaGabungan = Long.parseLong(gabunganPlat);

        long hasil = angkaGabungan - 999999;

        if (hasil % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }

        scanner.close();
    }
}
