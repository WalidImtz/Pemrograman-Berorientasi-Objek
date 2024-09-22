package com.polban.jtk.jurusan;

public class Mahasiswa extends Person {
    public Mahasiswa(String nama, String id){
        super(nama, id);
    }

    @Override
    public  void display(){
        System.out.println("Mahasiswa: " + nama +  " - " + id);
    }
}
