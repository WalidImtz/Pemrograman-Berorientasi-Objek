public class Analisis
{
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);

        System.out.println("Hasil 1 "+hasil);
    }
}

// Hasil output yang dikeluarkan adalah: Hasil 1 -125\
// dengan menjumblahan angka1 dan angka2 yaitu 125 dan 6 akan menghasilkan 131
// dikarenakan tipe data byte hanya bisa menampung nilai dari -128 hingga 127, hasil 131 akan overflow
// ketika nilai byte overflow, hasilnya akan melingkar kembali ke nilai negatif sesuai dengan aturan two's complement
// two's complement adalah metode yang digunakan dalam komputasi untuk merepresentasikan bilangan bulat negatif dalam sistem biner
// dalam kasus ini, nilai 125 adalah 01111101 dan nilai 6 adalah 00000110
// dengan menambahkan nilai-nilai tersebut dalam sistem biner 8-bit, hasil yang akan dikeluarkan adalah 10000011
// 10000011 dalam two's complement adalah -125

//ref: google, w3schools, chatgpt