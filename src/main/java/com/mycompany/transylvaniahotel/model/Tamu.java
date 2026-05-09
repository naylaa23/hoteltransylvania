package com.mycompany.transylvaniahotel.model;

import java.time.LocalDateTime;

public class Tamu {

    private String uidRfid;
    private String idPemesanan;
    private String namaTamu;
    private String nomorKamar;
    private String status;
    private LocalDateTime tglCheckIn;
    private LocalDateTime tglCheckOut;

    public Tamu() {
    }

    public Tamu(String uidRfid, String idPemesanan, String namaTamu, String nomorKamar, String status, LocalDateTime tglCheckIn, LocalDateTime tglCheckOut) {
        this.uidRfid = uidRfid;
        this.idPemesanan = idPemesanan;
        this.namaTamu = namaTamu;
        this.nomorKamar = nomorKamar;
        this.status = status;
        this.tglCheckIn = tglCheckIn;
        this.tglCheckOut = tglCheckOut;
    }

    // --- GETTER & SETTER WAJIB (Jangan Ada yang Ketinggalan) ---
    public String getUidRfid() {
        return uidRfid;
    }

    public void setUidRfid(String uidRfid) {
        this.uidRfid = uidRfid;
    }

    public String getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(String idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getTglCheckIn() {
        return tglCheckIn;
    }

    public void setTglCheckIn(LocalDateTime tglCheckIn) {
        this.tglCheckIn = tglCheckIn;
    }

    public LocalDateTime getTglCheckOut() {
        return tglCheckOut;
    }

    public void setTglCheckOut(LocalDateTime tglCheckOut) {
        this.tglCheckOut = tglCheckOut;
    }
}
