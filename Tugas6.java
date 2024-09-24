/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas6;

import java.util.ArrayList;
import java.util.List;

// Kelas abstrak Produk
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungDiskon();
}

// Kelas turunan Buku
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return this.harga * 0.9;  // Diskon 10%
    }
}

// Kelas turunan Elektronik
class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return this.harga * 0.8;  // Diskon 20%
    }
}

// Kelas turunan Pakaian
class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return this.harga * 0.85;  // Diskon 15%
    }
}

// Kelas KeranjangBelanja
class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        this.produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        this.produkList.add(produk);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }
}

// Main Class
public class Tugas6 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java", 100000);
        Elektronik elektronik1 = new Elektronik("Smartphone", 5000000);
        Pakaian pakaian1 = new Pakaian("Jaket", 300000);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);

        double totalHarga = keranjang.hitungTotal();
        System.out.println("Total harga setelah diskon: Rp" + totalHarga);
    }
}
