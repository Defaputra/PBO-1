/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas3;

/**
 *
 * @author ASUS
 */
public class Tugas3 {

    static class Manusia {
        private String nama;  // Private modifier
        protected int usia;   // Protected modifier
        public String pekerjaan;  // Public modifier

        public Manusia(String nama, int usia, String pekerjaan) {
            this.nama = nama;
            this.usia = usia;
            this.pekerjaan = pekerjaan;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }

    static class Pekerja extends Manusia {
        private double gaji;  
        public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
            super(nama, usia, pekerjaan);
            this.gaji = gaji;
        }

        public double getGaji() {
            return gaji;
        }

        public void setGaji(double gaji) {
            this.gaji = gaji;
        }

        // Override metode toString()
        @Override
        public String toString() {
            return "Nama: " + getNama() + ", Usia: " + usia + ", Pekerjaan: " + pekerjaan + ", Gaji: " + gaji;
        }
    }
