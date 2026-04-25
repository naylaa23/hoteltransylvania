
package com.mycompany.transylvaniahotel.model;

import java.time.LocalDateTime; // Standar Java 8+ untuk presisi waktu [cite: 255]

public class LogAbsensi {
    // 1. Deklarasi Atribut Private
    private String idLog;            // UUID unik [cite: 126]
    private String uidRfid;          // Foreign key identitas tamu [cite: 127]
    private LocalDateTime waktuTap;  // Timestamp aktivitas [cite: 128]
    private String status;           // Status "IN" (Check-in) atau "OUT" (Check-out) [cite: 128]

    // 2. Constructor Berparameter
    public LogAbsensi(String idLog, String uidRfid, LocalDateTime waktuTap, String status) {
        this.idLog = idLog;
        this.uidRfid = uidRfid;
        this.waktuTap = waktuTap;
        this.status = status;
    }

    // 3. Accessors (Getter & Setter)
    public String getIdLog() { return idLog; }
    public void setIdLog(String idLog) { this.idLog = idLog; }

    public String getUidRfid() { return uidRfid; }
    public void setUidRfid(String uidRfid) { this.uidRfid = uidRfid; }

    public LocalDateTime getWaktuTap() { return waktuTap; }
    public void setWaktuTap(LocalDateTime waktuTap) { this.waktuTap = waktuTap; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}