/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmodul11;

/**
 *
 * @author USER
 */
public class TUGASMODUL11 {

    static class Pengarang {
        private String namaPengarang;

        public Pengarang(String namaPengarang) {
            this.namaPengarang = namaPengarang;
        }

        public String getNamaPengarang() {
            return namaPengarang;
        }

        public void infoPengarang() {
            System.out.println("Nama Pengarang: " + namaPengarang);
        }
    }

    static class Buku {
        private String judul;
        private Pengarang pengarang;  

        public Buku(String judul, Pengarang pengarang) {
            this.judul = judul;
            this.pengarang = pengarang;
        }

        public String getJudul() {
            return judul;
        }

        public Pengarang getPengarang() {
            return pengarang;
        }

        public void infoBuku() {
            System.out.println("Judul Buku: " + judul);
            pengarang.infoPengarang();  
        }
    }

    static class Perpustakaan {
        private Buku[] daftarBuku;
        private int jumlahBuku;

        public Perpustakaan(int kapasitas) {
            daftarBuku = new Buku[kapasitas];
            jumlahBuku = 0;
        }

        public void tambahBuku(Buku buku) {
            if (jumlahBuku < daftarBuku.length) {
                daftarBuku[jumlahBuku++] = buku;
            } else {
                System.out.println("Perpustakaan sudah penuh!");
            }
        }

        public void infoPerpustakaan() {
            System.out.println("Informasi Buku di Perpustakaan:");
            for (int i = 0; i < jumlahBuku; i++) {
                daftarBuku[i].infoBuku();
                System.out.println("----------");
            }
        }
    }

    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Budi Santoso");
        Pengarang pengarang2 = new Pengarang("Siti Aisyah");

        Buku buku1 = new Buku("Pemrograman Java", pengarang1);
        Buku buku2 = new Buku("Desain Sistem", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}
