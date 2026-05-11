package com.mycompany.transylvaniahotel.config.koneksi;

import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mycompany.transylvaniahotel.config.MongoManager;
import com.mycompany.transylvaniahotel.dao.BaseDAO;
import com.mycompany.transylvaniahotel.dao.GenericDAO;
import com.mycompany.transylvaniahotel.model.Karyawan;
import com.mycompany.transylvaniahotel.model.Tamu;
import com.mycompany.transylvaniahotel.model.LogAbsensi; // IMPORT BARU
import java.time.LocalDateTime;

public class TesKoneksi {

    public static void main(String[] args) {
        try {
            System.out.println("Sedang mencoba menghubungkan ke database...");

            MongoDatabase database = MongoManager.getDatabase();
            database.runCommand(new Document("ping", 1));

            System.out.println("=========================================");
            System.out.println("STATUS: KONEKSI BERHASIL!");
            System.out.println("Terhubung ke Database: " + database.getName());
            System.out.println("=========================================");

            // 1. SETUP DATA KARYAWAN
            System.out.println("\n[1] Menjalankan Setup Data Karyawan...");
            BaseDAO<Karyawan> karyawanRepo = new GenericDAO<>("karyawan", Karyawan.class);
            Karyawan adminPertama = new Karyawan("Count Dracula", "admin123", "Mavis");
            karyawanRepo.save(adminPertama);
            System.out.println("STATUS: DATA KARYAWAN BERHASIL DIDAFTARKAN!");

            // 2. SETUP DATA TAMU
            System.out.println("\n[2] Menjalankan Setup Data Tamu...");
            BaseDAO<Tamu> tamuRepo = new GenericDAO<>("tamu", Tamu.class);

            String kodeBooking = java.util.UUID.randomUUID().toString().substring(0, 5).toUpperCase();
            LocalDateTime masuk = LocalDateTime.now();
            LocalDateTime keluar = masuk.plusDays(3);

            Tamu tamuBaru = new Tamu(
                    "RFID-001", 
                    "TRX-" + kodeBooking,
                    "Lazuardi Augian Pratama",
                    "001",
                    "IN",
                    masuk,
                    keluar
            );

            tamuRepo.save(tamuBaru);
            System.out.println("STATUS: DATA TAMU BERHASIL DIDAFTARKAN!");
            System.out.println("Kode Booking Tamu: TRX-" + kodeBooking);

            // 3. SETUP LOG ABSENSI (RIWAYAT TAP)
            System.out.println("\n[3] Mencatat Log Absensi (Initial Tap)...");
            BaseDAO<LogAbsensi> logRepo = new GenericDAO<>("log_absensi", LogAbsensi.class);
            
            // Membuat ID Log acak
            String idLog = "LOG-" + java.util.UUID.randomUUID().toString().substring(0, 5).toUpperCase();
            LogAbsensi logMasuk = new LogAbsensi(idLog, "RFID-001", LocalDateTime.now(), "IN");
            
            logRepo.save(logMasuk);
            System.out.println("STATUS: LOG ABSENSI BERHASIL DICATAT: " + idLog);

            // 4. VERIFIKASI DATA
            System.out.println("\n--- Verifikasi Data di Database ---");
            Tamu cek = tamuRepo.getById("uidRfid", "RFID-001");
            if (cek != null) {
                System.out.println("Nama dari DB  : " + cek.getNamaTamu());
                System.out.println("Status        : " + cek.getStatus());
            }

            System.out.println("\nDaftar Koleksi Saat Ini:");
            for (String name : database.listCollectionNames()) {
                System.out.println("- " + name);
            }

        } catch (Exception e) {
            System.err.println("=========================================");
            System.err.println("STATUS: ERROR TERJADI!");
            System.err.println("Pesan Error: " + e.getMessage());
            e.printStackTrace(); // Menampilkan baris mana yang salah jika ada error
            System.err.println("=========================================");
        }
    }
}