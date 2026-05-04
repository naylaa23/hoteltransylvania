
package com.mycompany.transylvaniahotel.model;
public class Tamu {
    
    private String uidRfid;      
    private String idPemesanan;  
    private String namaTamu;     
    private String nomorKamar;   

    
    public Tamu () {}
    public Tamu(String uidRfid, String idPemesanan, String namaTamu, String nomorKamar) {
        this.uidRfid = uidRfid;
        this.idPemesanan = idPemesanan;
        this.namaTamu = namaTamu;
        this.nomorKamar = nomorKamar;
    }

    
    public String getUidRfid() { return uidRfid; }
    public void setUidRfid(String uidRfid) { this.uidRfid = uidRfid; }

    public String getIdPemesanan() { return idPemesanan; }
    public void setIdPemesanan(String idPemesanan) { this.idPemesanan = idPemesanan; }

    public String getNamaTamu() { return namaTamu; }
    public void setNamaTamu(String namaTamu) { this.namaTamu = namaTamu; }

    public String getNomorKamar() { return nomorKamar; }
    public void setNomorKamar(String nomorKamar) { this.nomorKamar = nomorKamar; }
}