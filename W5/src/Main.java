import com.polban.jtk.jurusan.*;
import com.polban.jtk.akademik.*;


public class Main {
    public static void main(String[] args){

        Jurusan jurusan = new Jurusan("Teknik Informatika");
        Prodi prodi = new Prodi("Informatika");
        jurusan.addprodi(prodi);

        prodi.addperson(new Mahasiswa("Ahmad", "231511033"));
        prodi.addperson(new Mahasiswa("Alanna", "231511034"));
        prodi.addperson(new Mahasiswa("Alya", "231511035"));
        prodi.addperson(new Mahasiswa("Azka", "231511036"));
        prodi.addperson(new Mahasiswa("Bandyaga", "231511037"));
        prodi.addperson(new Mahasiswa("Daffa", "231511038"));
        prodi.addperson(new Mahasiswa("Daiva", "231511039"));
        prodi.addperson(new Mahasiswa("Dhea", "231511040"));
        prodi.addperson(new Mahasiswa("Dhira", "231511041"));
        prodi.addperson(new Mahasiswa("Dwika", "231511042"));

        Dosen dosen1 = new Dosen("Pak Yudi", "KO013N");
        Dosen dosen2 = new Dosen("Bu Ade", "KO060N");
        Dosen dosen3 = new Dosen("Pak Wendi", "KO079N");
        Dosen dosen4 = new Dosen("Bu Santi", "KO009N");
        Dosen dosen5 = new Dosen("Pak Yadhi", "KO052N");
        Dosen dosen6 = new Dosen("Pak Zulkifli", "KO061");
        Dosen dosen7 = new Dosen("Pak Rizqi", "KO074N");
        Dosen dosen8 = new Dosen("Bu Siti", "KO075N");
        Dosen dosen9 = new Dosen("Pak Ade", "KO001N");
        Dosen dosen10 = new Dosen("Pak Trisna", "KO078N");

        prodi.addperson(dosen1);
        prodi.addperson(dosen2);
        prodi.addperson(dosen3);
        prodi.addperson(dosen4);
        prodi.addperson(dosen5);
        prodi.addperson(dosen6);
        prodi.addperson(dosen7);
        prodi.addperson(dosen8);
        prodi.addperson(dosen9);
        prodi.addperson(dosen10);

        Matakuliah matkul1 = new Matakuliah("Komputer Grafik Te", dosen1);
        Matakuliah matkul2 = new Matakuliah("Basis Data Pr", dosen2);
        Matakuliah matkul3 = new Matakuliah("Proyek 3", dosen3);
        Matakuliah matkul4 = new Matakuliah("PRPL Te", dosen4);
        Matakuliah matkul5 = new Matakuliah("PRPL Pr", dosen5);
        Matakuliah matkul6 = new Matakuliah("PBO", dosen6);
        Matakuliah matkul7 = new Matakuliah("Aljabar Linear", dosen7);
        Matakuliah matkul8 = new Matakuliah("Matematika Diskrit 2", dosen8);
        Matakuliah matkul9 = new Matakuliah("Basis Data Te", dosen9);
        Matakuliah matkul10 = new Matakuliah("Komputer Grafik Pr", dosen10);

        Jadwal jadwal1 = new Jadwal("Senin", "D105-Kelas", matkul1);
        Jadwal jadwal2 = new Jadwal("Selasa", "D106-Lab. SDB", matkul2);
        Jadwal jadwal3 = new Jadwal("Rabu", "D116-Lab. PJBL-2", matkul3);
        Jadwal jadwal4 = new Jadwal("Kamis", "D105-Kelas", matkul4);
        Jadwal jadwal5 = new Jadwal("Jumat", "D116-Lab. PJBL-2", matkul5);
        Jadwal jadwal6 = new Jadwal("Senin", "D102-Lab. MT", matkul6);
        Jadwal jadwal7 = new Jadwal("Selasa", "D101-Kelas", matkul7);
        Jadwal jadwal8 = new Jadwal("Rabu", "D116-Lab. PJBL-2", matkul8);
        Jadwal jadwal9 = new Jadwal("Kamis", "D116-Lab. PJBL-2", matkul9);
        Jadwal jadwal10 = new Jadwal("Jumat", "D116-Lab. PJBL-2", matkul10);

        jurusan.display();

        System.out.println("\nJadwal Perkuliahan:");
        jadwal1.display();
        jadwal2.display();
        jadwal3.display();
        jadwal4.display();
        jadwal5.display();
        jadwal6.display();
        jadwal7.display();
        jadwal8.display();
        jadwal9.display();
        jadwal10.display();
    }
}