package cobacobi;

import com.mycompany.transylvaniahotel.gui.*;

/**
 *
 * @author alfathrev
 */
public class wawberhasil extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(wawberhasil.class.getName());

    private final com.mycompany.transylvaniahotel.dao.BaseDAO<com.mycompany.transylvaniahotel.model.Karyawan> karyawanDAO;

    public wawberhasil() {
        this.karyawanDAO = new com.mycompany.transylvaniahotel.dao.GenericDAO<>("karyawan", com.mycompany.transylvaniahotel.model.Karyawan.class);
        initComponents();
        loadDataKaryawan(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        SidebarPanel = new javax.swing.JPanel();
        BagianAtas = new javax.swing.JPanel();
        LogoFont = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnKaryawan = new javax.swing.JButton();
        btnKamar = new javax.swing.JButton();
        btnDaftar = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        BagianBawah = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        PanelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PanelKaryawan = new javax.swing.JPanel();
        ManajemenKaryawan = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        namaKaryawan = new javax.swing.JLabel();
        txtnamaKaryawan = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        jabatan = new javax.swing.JLabel();
        txtJabatan = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        scrollPaneKaryawan = new javax.swing.JScrollPane();
        containerKaryawan = new javax.swing.JPanel();
        PanelMKamar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SidebarPanel.setBackground(new java.awt.Color(26, 26, 26));
        SidebarPanel.setPreferredSize(new java.awt.Dimension(264, 1024));
        SidebarPanel.setLayout(new java.awt.GridBagLayout());

        BagianAtas.setBackground(new java.awt.Color(26, 26, 26));
        BagianAtas.setPreferredSize(new java.awt.Dimension(264, 650));
        BagianAtas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/looghotel 1.png"))); // NOI18N
        BagianAtas.add(LogoFont, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        btnHome.setBackground(new java.awt.Color(26, 26, 26));
        btnHome.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setPreferredSize(new java.awt.Dimension(200, 27));
        btnHome.addActionListener(this::btnHomeActionPerformed);
        BagianAtas.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, -1));

        btnKaryawan.setBackground(new java.awt.Color(26, 26, 26));
        btnKaryawan.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btnKaryawan.setText("Manajemen Karyawan");
        btnKaryawan.setBorderPainted(false);
        btnKaryawan.setContentAreaFilled(false);
        btnKaryawan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKaryawan.addActionListener(this::btnKaryawanActionPerformed);
        BagianAtas.add(btnKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnKamar.setBackground(new java.awt.Color(26, 26, 26));
        btnKamar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnKamar.setForeground(new java.awt.Color(255, 255, 255));
        btnKamar.setText("Manajemen Kamar");
        btnKamar.setBorderPainted(false);
        btnKamar.setContentAreaFilled(false);
        btnKamar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKamar.addActionListener(this::btnKamarActionPerformed);
        BagianAtas.add(btnKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btnDaftar.setBackground(new java.awt.Color(26, 26, 26));
        btnDaftar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setText("Daftar Kamar");
        btnDaftar.setBorderPainted(false);
        btnDaftar.setContentAreaFilled(false);
        btnDaftar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDaftar.addActionListener(this::btnDaftarActionPerformed);
        BagianAtas.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        btnSetting.setBackground(new java.awt.Color(26, 26, 26));
        btnSetting.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(255, 255, 255));
        btnSetting.setText("Setting");
        btnSetting.setBorderPainted(false);
        btnSetting.setContentAreaFilled(false);
        btnSetting.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSetting.addActionListener(this::btnSettingActionPerformed);
        BagianAtas.add(btnSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        SidebarPanel.add(BagianAtas, new java.awt.GridBagConstraints());

        BagianBawah.setBackground(new java.awt.Color(26, 26, 26));
        BagianBawah.setPreferredSize(new java.awt.Dimension(264, 374));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/BagianBawah.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(264, 594));

        javax.swing.GroupLayout BagianBawahLayout = new javax.swing.GroupLayout(BagianBawah);
        BagianBawah.setLayout(BagianBawahLayout);
        BagianBawahLayout.setHorizontalGroup(
            BagianBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BagianBawahLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BagianBawahLayout.setVerticalGroup(
            BagianBawahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BagianBawahLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SidebarPanel.add(BagianBawah, gridBagConstraints);

        getContentPane().add(SidebarPanel, java.awt.BorderLayout.LINE_START);

        CenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        CenterPanel.setPreferredSize(new java.awt.Dimension(1130, 1024));
        CenterPanel.setLayout(new java.awt.CardLayout());

        PanelHome.setBackground(new java.awt.Color(255, 255, 255));
        PanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Home");
        PanelHome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(194, 148, 233));
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(44, 44));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        PanelHome.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Cari...");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setPreferredSize(new java.awt.Dimension(480, 44));
        PanelHome.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(194, 148, 233));
        jPanel1.setPreferredSize(new java.awt.Dimension(1094, 352));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Data Tamu Tiap Bulan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(855, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        PanelHome.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 1050, -1));

        jPanel2.setPreferredSize(new java.awt.Dimension(538, 300));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        PanelHome.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 530, -1));

        jPanel3.setPreferredSize(new java.awt.Dimension(538, 300));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        PanelHome.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 510, -1));

        CenterPanel.add(PanelHome, "cardHome");

        PanelKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        PanelKaryawan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManajemenKaryawan.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        ManajemenKaryawan.setForeground(new java.awt.Color(0, 0, 0));
        ManajemenKaryawan.setText("Manajemen Karyawan");
        PanelKaryawan.add(ManajemenKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 17, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setText("Cari...");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setPreferredSize(new java.awt.Dimension(532, 44));
        PanelKaryawan.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 80, -1, -1));

        btnSearch.setBackground(new java.awt.Color(194, 148, 233));
        btnSearch.setPreferredSize(new java.awt.Dimension(44, 44));
        btnSearch.addActionListener(this::btnSearchActionPerformed);
        PanelKaryawan.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 80, -1, -1));

        username.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setText("Username");
        PanelKaryawan.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsername.setPreferredSize(new java.awt.Dimension(244, 44));
        txtUsername.addActionListener(this::txtUsernameActionPerformed);
        PanelKaryawan.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        namaKaryawan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        namaKaryawan.setForeground(new java.awt.Color(0, 0, 0));
        namaKaryawan.setText("Nama Karyawan");
        PanelKaryawan.add(namaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtnamaKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        txtnamaKaryawan.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtnamaKaryawan.setForeground(new java.awt.Color(0, 0, 0));
        txtnamaKaryawan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnamaKaryawan.setPreferredSize(new java.awt.Dimension(244, 44));
        PanelKaryawan.add(txtnamaKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        password.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("Password");
        PanelKaryawan.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jabatan.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jabatan.setForeground(new java.awt.Color(0, 0, 0));
        jabatan.setText("Jabatan");
        PanelKaryawan.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        txtJabatan.setBackground(new java.awt.Color(255, 255, 255));
        txtJabatan.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtJabatan.setForeground(new java.awt.Color(0, 0, 0));
        txtJabatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtJabatan.setPreferredSize(new java.awt.Dimension(240, 44));
        txtJabatan.addActionListener(this::txtJabatanActionPerformed);
        PanelKaryawan.add(txtJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        txtPassword1.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPassword1.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword1.setPreferredSize(new java.awt.Dimension(240, 44));
        txtPassword1.addActionListener(this::txtPassword1ActionPerformed);
        PanelKaryawan.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        btnSave.setBackground(new java.awt.Color(56, 140, 250));
        btnSave.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorderPainted(false);
        btnSave.setPreferredSize(new java.awt.Dimension(97, 48));
        btnSave.addActionListener(this::btnSaveActionPerformed);
        PanelKaryawan.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, -1, -1));

        btnEdit.setBackground(new java.awt.Color(255, 206, 78));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setBorderPainted(false);
        btnEdit.setPreferredSize(new java.awt.Dimension(97, 48));
        btnEdit.addActionListener(this::btnEditActionPerformed);
        PanelKaryawan.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, -1, -1));

        btnRefresh.setBackground(new java.awt.Color(13, 203, 73));
        btnRefresh.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorderPainted(false);
        btnRefresh.setPreferredSize(new java.awt.Dimension(97, 48));
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);
        PanelKaryawan.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        btnDelete.setBackground(new java.awt.Color(210, 30, 47));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.setPreferredSize(new java.awt.Dimension(97, 48));
        btnDelete.addActionListener(this::btnDeleteActionPerformed);
        PanelKaryawan.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        scrollPaneKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneKaryawan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        containerKaryawan.setBackground(new java.awt.Color(255, 255, 255));
        containerKaryawan.setMinimumSize(new java.awt.Dimension(1100, 600));
        containerKaryawan.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        scrollPaneKaryawan.setViewportView(containerKaryawan);

        PanelKaryawan.add(scrollPaneKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1000, 850));

        CenterPanel.add(PanelKaryawan, "cardKaryawan");

        javax.swing.GroupLayout PanelMKamarLayout = new javax.swing.GroupLayout(PanelMKamar);
        PanelMKamar.setLayout(PanelMKamarLayout);
        PanelMKamarLayout.setHorizontalGroup(
            PanelMKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1176, Short.MAX_VALUE)
        );
        PanelMKamarLayout.setVerticalGroup(
            PanelMKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1167, Short.MAX_VALUE)
        );

        CenterPanel.add(PanelMKamar, "card4");

        getContentPane().add(CenterPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKamarActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) CenterPanel.getLayout();
        cl.show(CenterPanel, "cardHome");
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btnKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaryawanActionPerformed
        java.awt.CardLayout cl = (java.awt.CardLayout) CenterPanel.getLayout();
        cl.show(CenterPanel, "cardKaryawan");
    }//GEN-LAST:event_btnKaryawanActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtnamaKaryawan.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJabatanActionPerformed

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String usernameText = txtUsername.getText().trim();
        if (usernameText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data karyawan yang ingin dihapus!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int konfirmasi = javax.swing.JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus karyawan dengan username: " + usernameText + "?",
                "Konfirmasi Hapus", javax.swing.JOptionPane.YES_NO_OPTION);

        if (konfirmasi == javax.swing.JOptionPane.YES_OPTION) {
            try {
                karyawanDAO.delete("username", usernameText);
                javax.swing.JOptionPane.showMessageDialog(this, "Data Karyawan berhasil dihapus!");
                bersihkanForm();
                loadDataKaryawan(null);
            } catch (Exception ex) {
                logger.log(java.util.logging.Level.SEVERE, "Gagal menghapus data", ex);
                javax.swing.JOptionPane.showMessageDialog(this, "Gagal menghapus data: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String usernameText = txtUsername.getText().trim();
        String nama = txtnamaKaryawan.getText().trim();
        String pass = txtPassword1.getText().trim();
        String jab = txtJabatan.getText().trim();

        if (usernameText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih data karyawan terlebih dahulu melalui kartu!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            com.mycompany.transylvaniahotel.model.Karyawan k = new com.mycompany.transylvaniahotel.model.Karyawan();
            k.setUsername(usernameText);
            k.setNamaKaryawan(nama);
            k.setPassword(pass);
            k.setJabatan(jab);

            karyawanDAO.save(k);

            javax.swing.JOptionPane.showMessageDialog(this, "Data Karyawan berhasil diperbarui!");
            bersihkanForm();
            loadDataKaryawan(null);
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Gagal memperbarui data", ex);
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal memperbarui data: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        bersihkanForm();
        jTextField2.setText("Cari..."); // Reset kolom pencarian karyawan
        loadDataKaryawan(null);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String usernameText = txtUsername.getText().trim();
        String nama = txtnamaKaryawan.getText().trim();
        String pass = txtPassword1.getText().trim();
        String jab = txtJabatan.getText().trim();

        // Validasi sederhana
        if (usernameText.isEmpty() || nama.isEmpty() || pass.isEmpty() || jab.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Semua kolom harus diisi!", "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            com.mycompany.transylvaniahotel.model.Karyawan k = new com.mycompany.transylvaniahotel.model.Karyawan();
            k.setUsername(usernameText);
            k.setNamaKaryawan(nama);
            k.setPassword(pass);
            k.setJabatan(jab);

            karyawanDAO.save(k);

            javax.swing.JOptionPane.showMessageDialog(this, "Data Karyawan berhasil disimpan!");
            bersihkanForm();
            loadDataKaryawan(null);
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, "Gagal menyimpan data", ex);
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal menyimpan data: " + ex.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        String keyword = jTextField2.getText().trim();

        // Jika kolom kosong atau masih berisi placeholder default, load semua data
        if (keyword.isEmpty() || keyword.equals("Cari...")) {
            loadDataKaryawan(null);
        } else {
            loadDataKaryawan(keyword);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    public void loadDataKaryawan(String keyword) {
        // 1. Bersihkan kontainer sebelum load ulang
        containerKaryawan.removeAll();

        java.util.List<com.mycompany.transylvaniahotel.model.Karyawan> listKaryawan;

        // 2. Logika Filter Pencarian (Keyword)
        if (keyword == null || keyword.isEmpty() || keyword.equals("Cari...")) {
            listKaryawan = karyawanDAO.getAll();
        } else {
            listKaryawan = karyawanDAO.getManyByPropertyRegex("namaKaryawan", keyword);
        }

        // 3. Looping untuk masukin CardKaryawan ke panel
        for (com.mycompany.transylvaniahotel.model.Karyawan kar : listKaryawan) {
            CardKaryawan card = new CardKaryawan(kar, this);
            containerKaryawan.add(card);
        }

        // ====================================================================
        // TRICK DINAMIS FLOWLAYOUT (PAS MAKSIMAL 4 KOLOM & LAZUR MAU TURUN):
        // ====================================================================
        int totalData = listKaryawan.size();

        // Hitung berapa baris yang dibutuhkan (1 baris maksimal 4 kartu)
        int jumlahBaris = (int) Math.ceil((double) totalData / 4);

        // Tinggi 1 kartu lu (silakan ganti ke 180 atau 200 kalau kartunya agak kepotong bawahnya)
        int tinggiPerBaris = 170;
        int totalTinggiPanel = jumlahBaris * tinggiPerBaris;

        // Paksa containerKaryawan melar ke bawah biar FlowLayout otomatis mematahkan baris ke-5
        containerKaryawan.setPreferredSize(new java.awt.Dimension(containerKaryawan.getWidth(), totalTinggiPanel));

        // PENTING: Gambar ulang komponen Swing biar langsung realtime muncul di layar
        containerKaryawan.revalidate();
        containerKaryawan.repaint();
    }

    private void bersihkanForm() {
        txtUsername.setText("");
        txtUsername.setEditable(true);
        txtnamaKaryawan.setText("");
        txtPassword1.setText("");
        txtJabatan.setText("");
    }

    public void setFormKaryawan(com.mycompany.transylvaniahotel.model.Karyawan k) {
        txtUsername.setText(k.getUsername());
        txtUsername.setEditable(false); // Kunci username karena ini Primary Key (tidak boleh diedit)
        txtnamaKaryawan.setText(k.getNamaKaryawan());
        txtPassword1.setText(k.getPassword());
        txtJabatan.setText(k.getJabatan());
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new wawberhasil().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BagianAtas;
    private javax.swing.JPanel BagianBawah;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JLabel LogoFont;
    private javax.swing.JLabel ManajemenKaryawan;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelKaryawan;
    private javax.swing.JPanel PanelMKamar;
    private javax.swing.JPanel SidebarPanel;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnKamar;
    private javax.swing.JButton btnKaryawan;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetting;
    private javax.swing.JPanel containerKaryawan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jabatan;
    private javax.swing.JLabel namaKaryawan;
    private javax.swing.JLabel password;
    private javax.swing.JScrollPane scrollPaneKaryawan;
    private javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtPassword1;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtnamaKaryawan;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
