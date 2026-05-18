package com.mycompany.transylvaniahotel;
/**
 *
 * @author alfathrev
 */
public class MainApp {

    public static void main(String[] args) {
        
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

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                com.mycompany.transylvaniahotel.gui.Login loginForm = new com.mycompany.transylvaniahotel.gui.Login();
                loginForm.setVisible(true);
            }
        });
    }
}
