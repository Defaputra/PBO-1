/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_11pt2;

/**
 *
 * @author USER
 */
package com.mycompany.praktikumpbo_11pt2;

import java.util.ArrayList;
import java.util.List;

class Anggota {
    private String nama;

    public Anggota(String nama) {
        this.nama = nama;
    }

    public void infoAnggota() {
        System.out.println("Nama Anggota: " + nama);
    }
}

class Klub {
    private String namaKlub;
    private List<Anggota> anggotaList;

    public Klub(String namaKlub) {
        this.namaKlub = namaKlub;
        this.anggotaList = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) {
        anggotaList.add(anggota);
    }

    public void infoKlub() {
        System.out.println("Nama Klub: " + namaKlub);
        System.out.println("Daftar Anggota:");
        for (Anggota anggota : anggotaList) {
            anggota.infoAnggota();
        }
    }
}

public class PraktikumPBO_11pt2 {
    public static void main(String[] args) {
        // Membuat objek anggota
        Anggota anggota1 = new Anggota("Johan");
        Anggota anggota2 = new Anggota("Mulyadi");

        // Membuat objek klub
        Klub klub = new Klub("Klub nonton anime");

        // Menambahkan anggota ke dalam klub
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);

        // Menampilkan informasi klub dan anggota
        klub.infoKlub();
    }
}
