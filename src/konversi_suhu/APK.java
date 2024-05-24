package konversi_suhu;

import java.awt.AWTEvent;

public class APK extends javax.swing.JFrame {

    public APK() {
        initComponents();
        reset();
    }

    void reset() {
        tsuhuasal.setText(null);
        vhasil.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tsuhuasal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tskalaasal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        tsklatujuan = new javax.swing.JComboBox<>();
        bkonversi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        vhasil = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        bclose = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUHU ASAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KONVERSI SUHU");

        tsuhuasal.setBackground(new java.awt.Color(255, 255, 204));
        tsuhuasal.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        tsuhuasal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUHU ASAL");

        tskalaasal.setBackground(new java.awt.Color(255, 255, 204));
        tskalaasal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELCIUS", "KELVIN", "FAHRENHEIT", " " }));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("KONVERSI KE"));
        jPanel2.setForeground(new java.awt.Color(255, 255, 102));

        tsklatujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CELCIUS", "KELVIN", "FAHRENHEIT" }));
        tsklatujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsklatujuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tsklatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tsklatujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        bkonversi.setBackground(new java.awt.Color(153, 255, 0));
        bkonversi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bkonversi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konversi_suhu/search.png"))); // NOI18N
        bkonversi.setText("KONVERSI");
        bkonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkonversiActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL"));
        jPanel3.setLayout(new java.awt.BorderLayout());

        vhasil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vhasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vhasil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vhasil.setFocusTraversalPolicyProvider(true);
        vhasil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vhasil.setInheritsPopupMenu(false);
        jPanel3.add(vhasil, java.awt.BorderLayout.PAGE_START);

        breset.setBackground(new java.awt.Color(153, 255, 0));
        breset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        breset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konversi_suhu/refresh-arrow.png"))); // NOI18N
        breset.setText("RESET");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });

        bclose.setBackground(new java.awt.Color(153, 255, 0));
        bclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/konversi_suhu/undo.png"))); // NOI18N
        bclose.setText("CLOSE");
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tskalaasal, 0, 129, Short.MAX_VALUE)
                                    .addComponent(tsuhuasal)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(breset)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bclose))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bkonversi)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tsuhuasal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tskalaasal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bkonversi)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bclose)
                    .addComponent(breset))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        reset();
    }//GEN-LAST:event_bresetActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        dispose();
    }//GEN-LAST:event_bcloseActionPerformed

    private void bkonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkonversiActionPerformed
        double suhu_asal = Double.parseDouble(tsuhuasal.getText());
        String skla_asal = tskalaasal.getSelectedItem().toString();
        String skala_tujuan = tsklatujuan.getSelectedItem().toString();
        double hasil = 0;
        if (skla_asal.equals("CELCIUS") && skala_tujuan.equals("CELCIUS")) {
            hasil = suhu_asal;
        } else if (skla_asal.equals("CELCIUS") && skala_tujuan.equals("KELVIN")) {
            hasil = suhu_asal + 273.15;
        } else if (skla_asal.equals("CELCIUS") && skala_tujuan.equals("FAHRENHEIT")) {
            hasil = (suhu_asal * 9 / 5) + 32;
        } else if (skla_asal.equals("KELVIN") && skala_tujuan.equals("CELCIUS")) {
            hasil = suhu_asal - 273.15;
        } else if (skla_asal.equals("KELVIN") && skala_tujuan.equals("KELVIN")) {
            hasil = suhu_asal;
        } else if (skla_asal.equals("KELVIN") && skala_tujuan.equals("FAHRENHEIT")) {
            hasil = (suhu_asal - 273.15) * 9 / 5 + 32;
        } else if (skla_asal.equals("FAHRENHEIT") && skala_tujuan.equals("CELCIUS")) {
            hasil = (suhu_asal - 32) * 5 / 9;
        } else if (skla_asal.equals("FAHRENHEIT") && skala_tujuan.equals("KELVIN")) {
            hasil = (suhu_asal - 32) * 5 / 9 + 273.15;
        } else if (skla_asal.equals("FAHRENHEIT") && skala_tujuan.equals("FAHRENHEIT")) {
            hasil = suhu_asal;
        }

        String skala = skala_tujuan.substring(0, 1);
        vhasil.setText(String.format("%.2f", hasil) + "\u00B0 " + skala);


    }//GEN-LAST:event_bkonversiActionPerformed

    private void tsklatujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsklatujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsklatujuanActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bclose;
    private javax.swing.JButton bkonversi;
    private javax.swing.JButton breset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> tskalaasal;
    private javax.swing.JComboBox<String> tsklatujuan;
    private javax.swing.JTextField tsuhuasal;
    private javax.swing.JLabel vhasil;
    // End of variables declaration//GEN-END:variables
}
