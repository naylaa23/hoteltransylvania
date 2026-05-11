package com.mycompany.transylvaniahotel.model;

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
    public String getUsername(){ return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword(){ return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getNamaKaryawan () { return namaKaryawan; }
    public void setNamaKaryawan(String namaKaryawan) { this.namaKaryawan = namaKaryawan; }
    
    public String getJabatan() { return jabatan; }
    public void setJabatan(String Jabatan) { this.jabatan = Jabatan; }
}
