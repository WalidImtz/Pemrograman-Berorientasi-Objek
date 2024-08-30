import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner Tugas = new Scanner(System.in);
        System.out.println("Nilai Tugas: ");
        Float ntugas = Tugas.nextFloat();
        Scanner UTS = new Scanner(System.in);
        System.out.println("Nilai UTS: ");
        Float nuts = UTS.nextFloat();
        Scanner UAS = new Scanner(System.in);
        System.out.println("Nilai UAS: ");
        Float nuas = UAS.nextFloat();

        Float nakhir = ((20 * ntugas) / 100) + ((35 * nuts) / 100) + ((45 * nuas) / 100);
        char grade;
        if (nakhir >= 80) {
            grade = 'A';
        } else if (nakhir >= 75 & nakhir < 80 ) {
            grade = 'B';
        } else if (nakhir >= 65 & nakhir < 75) {
            grade = 'C';
        } else if (nakhir >= 49 & nakhir < 65) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Nilai Akhir: " + nakhir);
        System.out.println("Grade: " + grade);
    }

}
