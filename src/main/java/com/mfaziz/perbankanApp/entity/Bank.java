package com.mfaziz.perbankanApp.entity;

import java.util.LinkedList;

public class Bank {
    private LinkedList<Nasabah> nasabah = new LinkedList<Nasabah>();
    private String adminNamaAwal = "admin";
    private String adminNamaAkhir = "admin";
    private int jumlahNasabah = 0;

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if(jumlahNasabah==100){
            System.out.println("nasabah sudah penuh");
            return;
        }
        
        Nasabah nasabahBaru = new Nasabah(namaAwal,namaAkhir);
        Tabungan tabunganBaru = new Tabungan(0);
        nasabahBaru.setTabungan(tabunganBaru);
        nasabah.add(nasabahBaru);
        jumlahNasabah++;
    }
    
    public void tambahNasabah(String namaAwal, String namaAkhir, int saldo) {
        if(jumlahNasabah==100){
            System.out.println("nasabah sudah penuh");
            return;
        }
        
        Nasabah nasabahBaru = new Nasabah(namaAwal,namaAkhir);
        Tabungan tabunganBaru = new Tabungan(saldo);
        nasabahBaru.setTabungan(tabunganBaru);
        nasabah.add(nasabahBaru);
        jumlahNasabah++;
    }
    
    public void removeNasabah(int index) {
        this.nasabah.remove(index);
        this.jumlahNasabah -= 1;
    }
    
    public void updateNasabah(int index, Nasabah nasabah) {
        this.nasabah.remove(index);
        this.nasabah.add(index, nasabah);
    }
    
    public int getJumlahNasabah() {
        return this.jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index) {
        return this.nasabah.get(index);
    }
    
    public int getIndexNasabah(String namaAwal, String namaAkhir) throws Exception {
        int index = 0;
        for(Nasabah nasabah :this.nasabah) {
            if(nasabah.getNamaAwal().equals(namaAwal) && nasabah.getNamaAkhir().equals(namaAkhir)) {
                return index;
            }
            index++;
        }
        
        throw new Exception("not found");
    }
    
    public String getAdminNamaAwal() {
        return adminNamaAwal;
    }

    public String getAdminNamaAkhir() {
        return adminNamaAkhir;
    }
    
}
