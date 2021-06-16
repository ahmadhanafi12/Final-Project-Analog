package guiproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame{

    /**
     * Creates new form Login
     */
    public static String username;
    public static String password;
    
    public Login() {
        initComponents();
    }    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Login = new javax.swing.JButton();
        jButton_Register = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 159, 128));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 86, 86));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selamat Datang");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(86, 86, 86));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("di Adventure Shop");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 40, 250, 40);

        jPanel2.setLayout(null);

        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Login);
        jButton_Login.setBounds(80, 140, 90, 23);

        jButton_Register.setText("Register");
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Register);
        jButton_Register.setBounds(240, 140, 90, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Username");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 30, 55, 14);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(180, 30, 150, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 80, 55, 15);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(180, 80, 150, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\Background\\mountains-1412683__340.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-130, 0, 540, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().equals(Register.username)&&(jPasswordField1.getText().equals(Register.password))){
            Transaksi tr = new Transaksi();
            tr.setTitle("Adventure Shop");
            tr.setLocationRelativeTo(null);
            tr.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            tr.setVisible(true);
            dispose();
            Transaksi.jNoHP.setText(Register.NoHP.getText());
            Transaksi.jAlamat.setText(Register.Alamat.getText());
        }
        else if(jTextField1.getText().equals("Ahmad")&&jPasswordField1.getText().equals("12345")){
            Transaksi tr = new Transaksi();
            tr.setTitle("Adventure Shop");
            tr.setLocationRelativeTo(null);
            tr.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
            tr.setVisible(true);
            dispose();
            Transaksi.jNoHP.setText("081234567890");
            Transaksi.jAlamat.setText("Jalan Pramuka No. 76,Singkawang");
        }
        else{
           JOptionPane.showMessageDialog(this, "Username atau Password anda tidak valid");
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
        Register rg = new Register();
        rg.setTitle("Adventure Shop");
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        rg.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_RegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login lg = new Login();
                lg.setTitle("Adventure Shop");
                lg.setLocationRelativeTo(null);
                lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
                lg.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
