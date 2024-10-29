/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmodul9;

/**
 *
 * @author USER
 */
public class TugasModul9 {

    public interface Pembayaran {
        double hitungPajak(double harga);
    }

    static class Elektronik implements Pembayaran {
        @Override
        public double hitungPajak(double harga) {
            return harga * 0.10; 
        }
    }

    static class Makanan implements Pembayaran {
        @Override
        public double hitungPajak(double harga) {
            return harga * 0.05; 
        }
    }

    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 200000;
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(hargaElektronik)); 

        Pembayaran makanan = new Makanan();
        double hargaMakanan = 50000;
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(hargaMakanan)); 
    }
}
