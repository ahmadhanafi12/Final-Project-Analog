package guiproject;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.util.Locale;;
import java.text.NumberFormat;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Transaksi extends javax.swing.JFrame {
    
    public void Tagl(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Tgl.setText(sdf.format(d));
    }
    NumberFormat Indo = NumberFormat.getCurrencyInstance(new Locale("in","ID"));
    
    public void TextField(){
        Tgl.setEnabled(false);
    }
    
       
    public Transaksi() {
        initComponents();
        Tagl();
        TextField();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMerek = new javax.swing.JComboBox<>();
        jUkuran = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jHarga = new javax.swing.JTextField();
        jButton_Back = new javax.swing.JButton();
        jKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTambah = new javax.swing.JButton();
        jWarna = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jJumlah2 = new javax.swing.JTextField();
        jHapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jAlamat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jNoHP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jMetode = new javax.swing.JComboBox<>();
        jKirim = new javax.swing.JButton();
        Tgl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(192, 159, 128));
        setPreferredSize(new java.awt.Dimension(630, 520));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Merek");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 75, 80, 14);

        jMerek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Eiger", "Consina", "Rei" }));
        jMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMerekActionPerformed(evt);
            }
        });
        jPanel1.add(jMerek);
        jMerek.setBounds(40, 90, 80, 30);

        jUkuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "35L", "45L", "50L", "60L" }));
        jUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUkuranActionPerformed(evt);
            }
        });
        jPanel1.add(jUkuran);
        jUkuran.setBounds(40, 150, 80, 30);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Jumlah");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 75, 80, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Warna");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 205, 80, 14);

        jHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jHargaKeyTyped(evt);
            }
        });
        jPanel1.add(jHarga);
        jHarga.setBounds(190, 90, 80, 30);

        jButton_Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Back.setText("<=");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Back);
        jButton_Back.setBounds(40, 435, 53, 23);

        jKeluar.setText("Keluar");
        jKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(jKeluar);
        jKeluar.setBounds(510, 430, 80, 23);

        jScrollPane1.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Merek", "Ukuran", "Warna", "Jumlah", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setPreferredSize(new java.awt.Dimension(451, 401));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 580, 130);

        jTambah.setText("Tambah");
        jTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTambahActionPerformed(evt);
            }
        });
        jPanel1.add(jTambah);
        jTambah.setBounds(310, 260, 80, 23);

        jWarna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hitam", "Merah", "Biru", "Jingga" }));
        jPanel1.add(jWarna);
        jWarna.setBounds(40, 220, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ukuran");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 135, 80, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Adventure Shop");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 10, 210, 40);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 690, 60);

        jJumlah2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jJumlah2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jJumlah2KeyTyped(evt);
            }
        });
        jPanel1.add(jJumlah2);
        jJumlah2.setBounds(340, 90, 80, 30);

        jHapus.setText("Hapus");
        jHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusActionPerformed(evt);
            }
        });
        jPanel1.add(jHapus);
        jHapus.setBounds(410, 260, 80, 23);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Harga Satuan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 75, 80, 14);

        jTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTotalKeyTyped(evt);
            }
        });
        jPanel1.add(jTotal);
        jTotal.setBounds(310, 430, 140, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Alamat");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(190, 205, 80, 14);

        jAlamat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jAlamat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jAlamatKeyTyped(evt);
            }
        });
        jPanel1.add(jAlamat);
        jAlamat.setBounds(190, 220, 230, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("No HP");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(190, 135, 80, 14);

        jNoHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNoHPKeyTyped(evt);
            }
        });
        jPanel1.add(jNoHP);
        jNoHP.setBounds(190, 150, 230, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Pembayaran");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 135, 180, 14);

        jMetode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "COD", "Indomaret" }));
        jPanel1.add(jMetode);
        jMetode.setBounds(490, 150, 90, 30);

        jKirim.setText("Kirim");
        jKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKirimActionPerformed(evt);
            }
        });
        jPanel1.add(jKirim);
        jKirim.setBounds(510, 260, 80, 23);
        jPanel1.add(Tgl);
        Tgl.setBounds(490, 90, 90, 30);

        jButton1.setText("Total:");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 435, 80, 23);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMerekActionPerformed
        // TODO add your handling code here:
        if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("35L")){
            jHarga.setText("500000");
        }
        else if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("45L")){
            jHarga.setText("700000");
        }
        else if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("50L")){
            jHarga.setText("800000");
        }
        else if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("60L")){
            jHarga.setText("1000000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("35L")){
            jHarga.setText("550000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("45L")){
            jHarga.setText("750000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("50L")){
            jHarga.setText("850000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("60L")){
            jHarga.setText("1050000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("35L")){
            jHarga.setText("450000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("45L")){
            jHarga.setText("650000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("50L")){
            jHarga.setText("750000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("60L")){
            jHarga.setText("950000");
        }
        else{
            jHarga.setText("");
        }
    }//GEN-LAST:event_jMerekActionPerformed

    private void jUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUkuranActionPerformed
        // TODO add your handling code here:
        if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("35L")){
            jHarga.setText("500000");
        }
        else if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("45L")){
            jHarga.setText("700000");
        }
        else if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("50L")){
            jHarga.setText("800000");
        }
        else if(jMerek.getSelectedItem().equals("Eiger")&& jUkuran.getSelectedItem().equals("60L")){
            jHarga.setText("1000000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("35L")){
            jHarga.setText("550000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("45L")){
            jHarga.setText("750000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("50L")){
            jHarga.setText("850000");
        }
        else if(jMerek.getSelectedItem().equals("Consina")&& jUkuran.getSelectedItem().equals("60L")){
            jHarga.setText("1050000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("35L")){
            jHarga.setText("450000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("45L")){
            jHarga.setText("650000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("50L")){
            jHarga.setText("750000");
        }
        else if(jMerek.getSelectedItem().equals("Rei")&& jUkuran.getSelectedItem().equals("60L")){
            jHarga.setText("950000");
        }
        else{
            jHarga.setText("");
        }
    }//GEN-LAST:event_jUkuranActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        if(JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin kembali?\nData yang ditambahkan akan direfresh", "Kembali?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        lg.setTitle("Adventure Shop");
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        lg.setVisible(true);
        dispose();      
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void jKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKeluarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Keluar?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_jKeluarActionPerformed

    private void jTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTambahActionPerformed
        // Memasukkan/menginput data kedalam tabel
        if(jMerek.getSelectedItem().equals("Pilih")){
            JOptionPane.showMessageDialog(null, "Pilih merek");
        }
        else if(jUkuran.getSelectedItem().equals("Pilih")){
            JOptionPane.showMessageDialog(null, "Pilih ukuran");
        }
        else if(jJumlah2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Atur jumlah");
        }
        
        Double total;
        Double jumlah = Double.parseDouble(jJumlah2.getText());
        Double harga = Double.parseDouble(jHarga.getText());
        total = (jumlah*harga);
                        
        DefaultTableModel dataModel = (DefaultTableModel) jTable1.getModel();
            List list = new ArrayList<>();
            jTable1.setAutoCreateColumnsFromModel(true);
            list.add(jMerek.getSelectedItem());
            list.add(jUkuran.getSelectedItem());
            list.add(jWarna.getSelectedItem());
            list.add(jJumlah2.getText());           
            list.add(Indo.format(total));
            dataModel.addRow(list.toArray());
    }//GEN-LAST:event_jTambahActionPerformed

    private void jHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int baris = jTable1.getSelectedRow();
        if(baris>=0){
        int YES=JOptionPane.showConfirmDialog(null, "Yakin menghapus data?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(YES==0){
        model.removeRow(baris);
            }  
        }
    }//GEN-LAST:event_jHapusActionPerformed

    private void jKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKirimActionPerformed
        // TODO add your handling code here:
        if(jMetode.getSelectedItem().equals("Pilih")){
            JOptionPane.showMessageDialog(null, "Mohon untuk memilih metode pembayaran");
        }
        else if(JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengirim data?", "Kirim?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "Data anda telah terkirim\nTerima Kasih telah membeli tas di Adventure Shop");
    }//GEN-LAST:event_jKirimActionPerformed

    private void jJumlah2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jJumlah2KeyReleased
        // TODO add your handling code here:
        String input = jJumlah2.getText();
        int a = 2;
        if(input.length()>a){
            JOptionPane.showMessageDialog(null, "Jumlah melebihi batas");
            jJumlah2.setText("");
        }
    }//GEN-LAST:event_jJumlah2KeyReleased

    private void jTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTotalKeyTyped
        // TODO add your handling code here:
        jTotal.setEnabled(false);
    }//GEN-LAST:event_jTotalKeyTyped

    private void jHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jHargaKeyTyped
        // TODO add your handling code here:
        char b = evt.getKeyChar();
        if(!(Character.isDigit(b) && Character.isAlphabetic(b))){
            evt.consume();
        }
    }//GEN-LAST:event_jHargaKeyTyped

    private void jJumlah2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jJumlah2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_jJumlah2KeyTyped

    private void jNoHPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNoHPKeyTyped
        // TODO add your handling code here:
        char E = evt.getKeyChar();
        if(!(Character.isDigit(E) && Character.isAlphabetic(E))){
            evt.consume();
        }
    }//GEN-LAST:event_jNoHPKeyTyped

    private void jAlamatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAlamatKeyTyped
        // TODO add your handling code here:
        char A = evt.getKeyChar();
        if(!(Character.isDigit(A) && Character.isAlphabetic(A))){
            evt.consume();
        }
    }//GEN-LAST:event_jAlamatKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int jumlahBaris = jTable1.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        TableModel tabelModel;
        tabelModel = jTable1.getModel();
        for (int i=0; i<jumlahBaris; i++){
        jumlahBarang = Integer.parseInt(tabelModel.getValueAt(i, 3).toString());
        hargaBarang = Integer.parseInt(jHarga.getText());
        totalBiaya = totalBiaya + (jumlahBarang*hargaBarang);
        }
        
        jTotal.setText(Indo.format(totalBiaya));
    }//GEN-LAST:event_jButton1ActionPerformed
         
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tgl;
    public static javax.swing.JTextField jAlamat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JButton jHapus;
    private javax.swing.JTextField jHarga;
    private javax.swing.JTextField jJumlah2;
    private javax.swing.JButton jKeluar;
    private javax.swing.JButton jKirim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JComboBox<String> jMerek;
    private javax.swing.JComboBox<String> jMetode;
    public static javax.swing.JTextField jNoHP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jTambah;
    private javax.swing.JTextField jTotal;
    private javax.swing.JComboBox<String> jUkuran;
    private javax.swing.JComboBox<String> jWarna;
    // End of variables declaration//GEN-END:variables
}
