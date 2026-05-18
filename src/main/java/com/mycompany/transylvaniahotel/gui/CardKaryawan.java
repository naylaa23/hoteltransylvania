package com.mycompany.transylvaniahotel.gui;

/**
 *
 * @author alfathrev
 */
import com.mycompany.transylvaniahotel.model.Karyawan;

public class CardKaryawan extends javax.swing.JPanel {

    private Karyawan karyawan;
    private Dashboard dashboard;

    
    public CardKaryawan() {
        initComponents();
    }

    public CardKaryawan(Karyawan karyawan, Dashboard dashboard) {
        initComponents();
        this.karyawan = karyawan;
        this.dashboard = dashboard;

        if (karyawan != null) {
            lblUsername.setText(karyawan.getUsername());
            lblJabatan.setText(karyawan.getJabatan());
        }

        this.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardMouseClicked(evt);
            }
        });
    }

    private void cardMouseClicked(java.awt.event.MouseEvent evt) {
        if (dashboard != null && karyawan != null) {
            dashboard.setFormKaryawan(karyawan);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Icon = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblJabatan = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(220, 224, 233)));
        setMaximumSize(new java.awt.Dimension(256, 128));
        setMinimumSize(new java.awt.Dimension(256, 128));
        setPreferredSize(new java.awt.Dimension(256, 128));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lgogohotel.png"))); // NOI18N
        Icon.setPreferredSize(new java.awt.Dimension(24, 24));
        add(Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, -1, -1));

        lblUsername.setBackground(new java.awt.Color(0, 0, 0));
        lblUsername.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("Username");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 24, 180, -1));

        lblJabatan.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblJabatan.setForeground(new java.awt.Color(194, 148, 233));
        lblJabatan.setText("Jabatan");
        add(lblJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 58, 180, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icon;
    public javax.swing.JLabel lblJabatan;
    public javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
