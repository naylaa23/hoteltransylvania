package com.mycompany.transylvaniahotel;

// Import DAO dari Pertemuan 4
import com.mycompany.transylvania.hotel.dao.BaseDAO;
import com.mycompany.transylvania.hotel.dao.GenericDAO;

import com.mycompany.transylvaniahotel.model.Tamu;
import com.mycompany.transylvaniahotel.model.LogAbsensi;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Project Transylvania: Sistem Manajemen Hotel RFID ===");
        
        // 1. Inisialisasi Universal Adapter (Generic DAO)
        // Perhatikan bagaimana satu kelas GenericDAO bisa menangani dua tipe berbeda
        BaseDAO<Tamu> tamuRepo = new GenericDAO<>(Tamu.class);
        BaseDAO<LogAbsensi> logRepo = new GenericDAO<>(LogAbsensi.class);

        // 2. Simulasi Data Tamu (Data dari Pertemuan 3)
        Tamu tamuBaru = new Tamu("RFID-998877", "BK-001", "Dracula", "Room 666");
        
        // 3. Test Simpan Data Tamu
        System.out.println("\n--- Menguji DAO Tamu ---");
        tamuRepo.save(tamuBaru);

        // 4. Simulasi Log Absensi RFID
        LogAbsensi logMasuk = new LogAbsensi("LOG-01", "RFID-998877", LocalDateTime.now(), "IN");
        
        // 5. Test Simpan Data Log
        System.out.println("\n--- Menguji DAO Log Absensi ---");
        logRepo.save(logMasuk);
        
        System.out.println("\nStatus: Integrasi Pertemuan 3 & 4 Berhasil!");
    }
}