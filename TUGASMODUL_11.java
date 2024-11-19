/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas.modul_11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TUGASMODUL_11 {

    static class Buku implements Serializable {
        private String judul;
        private String pengarang;
        private int tahunTerbit;

        public Buku(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        public void tampilkanInfo() {
            System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
        }

        @Override
        public String toString() {
            return judul + "," + pengarang + "," + tahunTerbit;
        }
    }

    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File Serial");
            System.out.println("4. Tampilkan Buku dari File Teks");
            System.out.println("5. Tampilkan Buku dari File Serial");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanDariFileTeks();
                case 5 -> tampilkanDariFileSerial();
                case 6 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();

        daftarBuku.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : daftarBuku) {
                writer.write(buku + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(daftarBuku);
            System.out.println("Data buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileTeks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            System.out.println("Buku dalam file teks:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Judul: " + data[0] + ", Pengarang: " + data[1] + ", Tahun Terbit: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file teks.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> bukuDariFile = (List<Buku>) ois.readObject();
            System.out.println("Buku dalam file serial:");
            for (Buku buku : bukuDariFile) {
                buku.tampilkanInfo();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca file serial.");
            e.printStackTrace();
        }
    }
}
