package com.polban.jtk.akademik;

import com.polban.jtk.akademik.Matakuliah;

public class Jadwal {
    private String hari;
    private String ruangan;
    private Matakuliah matakuliah;

    public Jadwal(String hari, String ruangan, Matakuliah matakuliah) {
        this.hari = hari;
        this.ruangan = ruangan;
        this.matakuliah = matakuliah;
    }

    public void display(){
        System.out.println("Jadwal: " + hari + " - Ruangan: " + ruangan + " - Matakuliah: " + matakuliah.getNama() + " - Dosen: " + matakuliah.getDosen().getNama());
    }
}
