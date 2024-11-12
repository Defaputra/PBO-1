/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_11;

import java.util.ArrayList;
import java.util.List;

class Pengarang {
    private String namaPengarang;

    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }

    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }
}

class Buku {
    private String judul;
    private Pengarang pengarang;

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang();
    }
}

class Perpustakaan {
    private List<Buku> bukuList;

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}

public class PraktikumPBO_11 {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Pengarang A");
        Pengarang pengarang2 = new Pengarang("Pengarang B");

        Buku buku1 = new Buku("Judul Buku 1", pengarang1);
        Buku buku2 = new Buku("Judul Buku 2", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}
