package com.polban.jtk.jurusan;

public abstract class Person {
    protected String nama;
    protected String id;

    public Person(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public abstract void display();

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
