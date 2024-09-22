package com.polban.jtk.akademik;

import com.polban.jtk.jurusan.Dosen;

public class Matakuliah {
    private String nama;
    private  Dosen dosen;

    public Matakuliah(String nama, Dosen dosen) {
        this.nama = nama;
        this.dosen = dosen;
    }

    public String getNama() {
        return nama;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void display(){
        System.out.println("Matakuliah: " + nama + " - Dosen: " + dosen.getNama());
    }
}
