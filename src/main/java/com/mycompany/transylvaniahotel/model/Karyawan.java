package com.mycompany.transylvaniahotel.model;

import org.bson.codecs.pojo.annotations.BsonProperty;

/**
 *
 * @author alfathrev
 */
public class Karyawan {
    private String username;
    private String password;
    private String namaKaryawan;
    private String jabatan;
    
    public Karyawan(){
    }    
    
    public Karyawan(String username, String password, String namaKaryawan){
        this.username = username;
        this.password = password;
        this.namaKaryawan = namaKaryawan;
        this.jabatan = "Resepsionis";
    }

    @BsonProperty("username") // <--- Paksa mapping ke field di Compass
    public String getUsername(){ return username; }
    @BsonProperty("username")
    public void setUsername(String username) { this.username = username; }
    
    @BsonProperty("password") // <--- Paksa mapping ke field di Compass
    public String getPassword(){ return password; }
    @BsonProperty("password")
    public void setPassword(String password) { this.password = password; }
    
    @BsonProperty("namaKaryawan") // <--- Paksa mapping ke field di Compass
    public String getNamaKaryawan () { return namaKaryawan; }
    @BsonProperty("namaKaryawan")
    public void setNamaKaryawan(String namaKaryawan) { this.namaKaryawan = namaKaryawan; }
    
    @BsonProperty("jabatan") // <--- Paksa mapping ke field di Compass
    public String getJabatan() { return jabatan; }
    @BsonProperty("jabatan")
    public void setJabatan(String Jabatan) { this.jabatan = Jabatan; }
}