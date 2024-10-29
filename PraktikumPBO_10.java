/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.praktikumpbo_10;

/**
 *
 * @author USER
 */
public class PraktikumPBO_10 {

    // Interface OperasiHitung
    public interface OperasiHitung {
        int hitung(int a, int b);
    }

    // Kelas Penjumlahan
    static class Penjumlahan implements OperasiHitung {
        @Override
        public int hitung(int a, int b) {
            return a + b;
        }
    }

    // Kelas Pengurangan
    static class Pengurangan implements OperasiHitung {
        @Override
        public int hitung(int a, int b) {
            return a - b;
        }
    }

    // Kelas Main
    public static void main(String[] args) {
        // Objek Penjumlahan
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5)); // Output: 15

        // Objek Pengurangan
        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5)); // Output: 5
    }
}
