package com.polban.jtk.jurusan;

public class Dosen extends Person {
        public Dosen(String nama, String id){
            super(nama, id);
        }

    @Override
    public void display(){
        System.out.println("Dosen: " + nama + " - " + id);
    }
}



