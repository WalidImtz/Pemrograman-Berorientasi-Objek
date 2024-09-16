package com.polban.jtk;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }
    public int getStok() {
        return stok;
    }
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Penambahan stok tidak valid!");
        }
    }
    public String getNamaBarang() {
        return nama_barang;
    }
}
