package com.mfaziz.perbankanApp.entity;

public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    
    public void ambilUang(int jumlah) throws Exception {
        if(saldo < jumlah) throw new Exception("not enough balance");
        saldo -= jumlah;
    }
}
