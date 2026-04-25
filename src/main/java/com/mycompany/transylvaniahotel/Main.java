package com.mycompany.transylvaniahotel;


import com.mycompany.transylvania.hotel.dao.BaseDAO;
import com.mycompany.transylvania.hotel.dao.GenericDAO;

import com.mycompany.transylvaniahotel.model.Tamu;
import com.mycompany.transylvaniahotel.model.LogAbsensi;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Project Transylvania: Sistem Manajemen Hotel RFID ===");
        
       
        BaseDAO<Tamu> tamuRepo = new GenericDAO<>(Tamu.class);
        BaseDAO<LogAbsensi> logRepo = new GenericDAO<>(LogAbsensi.class);

       
        Tamu tamuBaru = new Tamu("RFID-998877", "BK-001", "Dracula", "Room 666");
        
       
        System.out.println("\n--- Menguji DAO Tamu ---");
        tamuRepo.save(tamuBaru);

       
        LogAbsensi logMasuk = new LogAbsensi("LOG-01", "RFID-998877", LocalDateTime.now(), "IN");
        
       
        System.out.println("\n--- Menguji DAO Log Absensi ---");
        logRepo.save(logMasuk);
        
        System.out.println("\nStatus: Integrasi Pertemuan 3 & 4 Berhasil!");
    }
}