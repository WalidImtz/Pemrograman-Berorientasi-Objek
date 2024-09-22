package com.polban.jtk.jurusan;

import java.util.ArrayList;

public class Jurusan {
    private String nama;
    private ArrayList<Prodi> prodilist;

    public Jurusan(String nama) {
        this.nama = nama;
        this.prodilist = new ArrayList<>();
    }

    public void addprodi(Prodi prodi){
        prodilist.add(prodi);
    }

    public String getNama() {
        return nama;
    }

    public void display(){
        System.out.println("Jurusan: " + nama);
        for (Prodi prodi : prodilist){
            prodi.display();
        }
    }
}
