package com.mycompany.transylvaniahotel;

public class MainApp {

    public static void main(String[] args) {
        // Mengatur tema/tampilan UI biar mengikuti sistem operasi (Windows/Mac)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Memanggil dan memunculkan Form Login dari package cobacobi
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Sesuai struktur di screenshot-mu, Login.java ada di package cobacobi
                com.mycompany.transylvaniahotel.gui.Login loginForm = new com.mycompany.transylvaniahotel.gui.Login();
                loginForm.setVisible(true);
            }
        });
    }
}
