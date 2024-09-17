/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo5;

/**
 *
 * @author LEGION
 */

class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
 
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis);
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Kucing ini bernama " + nama);
    }

    // Metode untuk menampilkan suara khas kucing
    public void suara() {
        System.out.println("Meong!");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Anjing ini bernama " + nama);
    }

    public void suara() {
        System.out.println("Guk-guk!");
    }
}

public class PBO5 {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        Anjing anjing = new Anjing("Buddy");

        kucing.tampilkanInfo();
        kucing.suara();

        anjing.tampilkanInfo();
        anjing.suara();
    }
}

