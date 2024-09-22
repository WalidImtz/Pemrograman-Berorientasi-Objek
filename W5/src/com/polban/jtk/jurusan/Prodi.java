package com.polban.jtk.jurusan;

import java.util.ArrayList;

public class Prodi {
    private String nama;
    private ArrayList<Person> personlist;

    public Prodi(String nama) {
        this.nama = nama;
        this.personlist = new ArrayList<>();
    }

    public void addperson(Person person){
        personlist.add(person);
    }

    public void display(){
        System.out.println("Prodi: " + nama);
        for (Person person : personlist){
            person.display();
        }
    }
}
