package com.mfaziz.perbankanApp.entity;

public class Bank {
    private Nasabah[] nasabah = new Nasabah[100];
    private int jumlahNasabah = 0;
    
    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if(jumlahNasabah==100){
            System.out.println("nasabah sudah penuh");
            return;
        }
        
        Nasabah nasabahBaru = new Nasabah(namaAwal,namaAkhir);
        Tabungan tabunganBaru = new Tabungan(0);
        nasabahBaru.setTabungan(tabunganBaru);
        nasabah[jumlahNasabah] = nasabahBaru;
        jumlahNasabah++;
    }
    
    public int getJumlahNasabah() {
        return jumlahNasabah;
    }
    
    public Nasabah getNasabah(int index) {
        return nasabah[index];
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
}
