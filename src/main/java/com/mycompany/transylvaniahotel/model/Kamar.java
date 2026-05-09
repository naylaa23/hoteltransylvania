package com.mycompany.transylvaniahotel.model;

public class Kamar {
    private String nomorKamar;
    private String tipeKamar;
    private String status;

    
    public Kamar() {
    }

    
    public Kamar(String nomorKamar, String tipeKamar, String status) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.status = status;
    }

    
    public String getNomorKamar() { return nomorKamar; }
    public void setNomorKamar(String nomorKamar) { this.nomorKamar = nomorKamar; }

    public String getTipeKamar() { return tipeKamar; }
    public void setTipeKamar(String tipeKamar) { this.tipeKamar = tipeKamar; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}