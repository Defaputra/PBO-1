/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo5tugas2;

/**
 *
 * @author LEGION
 */

class Kendaraan {
    private String merek;
    private String model;

    public Kendaraan(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String info() {
        return merek + " " + model;
    }
}

class KendaraanDarat extends Kendaraan {
    private int jumlahRoda;

    public KendaraanDarat(String merek, String model, int jumlahRoda) {
        super(merek, model);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public String info() {
        return super.info() + ", Jumlah Roda: " + jumlahRoda;
    }
}

class Mobil extends KendaraanDarat {
    private String jenisMesin;

    public Mobil(String merek, String model, int jumlahRoda, String jenisMesin) {
        super(merek, model, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public String info() {
        return super.info() + ", Jenis Mesin: " + jenisMesin;
    }
}

class SepedaMotor extends KendaraanDarat {
    private String tipeSuspensi;

    public SepedaMotor(String merek, String model, int jumlahRoda, String tipeSuspensi) {
        super(merek, model, jumlahRoda);
        this.tipeSuspensi = tipeSuspensi;
    }

    @Override
    public String info() {
        return super.info() + ", Tipe Suspensi: " + tipeSuspensi;
    }
}

public class PBO5tugas2 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Camry", 4, "Bensin");
        SepedaMotor sepedaMotor = new SepedaMotor("Yamaha", "R15", 2, "Telescopic");

        System.out.println(mobil.info());
        System.out.println(sepedaMotor.info()); 
    }
}
