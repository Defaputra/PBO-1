/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts.defaaugistamontainedhanartoputera;

/**
 * Kelas Produk
 */
class Produk {
    // Atribut private
    private String namaProduk;
    private double harga;

    // Konstruktor
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Metode untuk menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

/**
 * Kelas Elektronik (turunan dari Produk)
 */
class Elektronik extends Produk {
    private int garansi; // Atribut tambahan

    // Konstruktor
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    // Getter dan Setter
    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    // Override metode tampilkanInfo untuk menambahkan informasi garansi
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

/**
 * Kelas Makanan (turunan dari Produk)
 */
class Makanan extends Produk {
    private String tanggalKadaluarsa; // Atribut tambahan

    // Konstruktor
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Getter dan Setter
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    // Override metode tampilkanInfo untuk menambahkan informasi tanggal kadaluarsa
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}

/**
 * Kelas Pegawai
 */
class Pegawai {
    // Atribut private
    private String namaPegawai;
    private double gaji;

    // Konstruktor
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    // Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Metode untuk menampilkan informasi pegawai
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

/**
 * Kelas PegawaiTetap (turunan dari Pegawai)
 */
class PegawaiTetap extends Pegawai {
    private double tunjangan; // Atribut tambahan

    // Konstruktor
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    // Getter dan Setter
    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Override metode tampilkanInfo untuk menambahkan informasi tunjangan
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

/**
 * Kelas PegawaiKontrak (turunan dari Pegawai)
 */
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // Atribut tambahan

    // Konstruktor
    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    // Getter dan Setter
    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    // Override metode tampilkanInfo untuk menambahkan informasi lama kontrak
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

/**
 * Kelas utama untuk menjalankan program
 */
public class ResponsiUTSDefaAugistaMontaineDhanartoPutera {

    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Produk elektronik = new Elektronik("Laptop", 15000000, 2);
        Produk makanan = new Makanan("Roti", 15000, "2024-01-01");

        // Membuat objek PegawaiTetap dan PegawaiKontrak
        Pegawai pegawaiTetap = new PegawaiTetap("Andi", 7000000, 2000000);
        Pegawai pegawaiKontrak = new PegawaiKontrak("Budi", 5000000, 12);

        // Polimorfisme: Memanggil metode menggunakan referensi kelas induk
        System.out.println("Informasi Produk:");
        elektronik.tampilkanInfo();
        System.out.println();
        makanan.tampilkanInfo();

        System.out.println("\nInformasi Pegawai:");
        pegawaiTetap.tampilkanInfo();
        System.out.println();
        pegawaiKontrak.tampilkanInfo();
    }
}
