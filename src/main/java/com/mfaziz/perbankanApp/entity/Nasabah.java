package com.mfaziz.perbankanApp.entity;

public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAkhir = namaAkhir;
        this.namaAwal = namaAwal;
    }
    
    public Nasabah(String namaAwal, String namaAkhir, Tabungan tabungan) {
        this.namaAkhir = namaAkhir;
        this.namaAwal = namaAwal;
        this.tabungan = tabungan;
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
}
