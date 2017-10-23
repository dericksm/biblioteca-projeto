package Modules.login;

import config.config;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetomdi.Frames.TelaPrincipal;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import projetomdi.Listener.LoginListener;
import projetomdi.LogFile.LogFiles;
import projetomdi.LogFile.UserFile;

public class loginView extends javax.swing.JFrame implements config {

    LoginController loginCtrl = new LoginController();
    LoginListener listener = new LoginListener(this);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldSenha = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        lbSenha = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        fieldUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botaoLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoLogin.addActionListener(listener);
        botaoLogin.setActionCommand("login");
        botaoLogin.setText("Login");

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCancelar.addActionListener(listener);
        botaoCancelar.setActionCommand("cancelar");
        botaoCancelar.setText("Cancelar");

        lbSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSenha.setText("Senha");

        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUsuario.setText("Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(botaoCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbUsuario)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSenha)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLogin)
                    .addComponent(botaoCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public loginView() {
        initComponents();
        setTitle(LoginController.TITLE);
        ImageIcon img = new ImageIcon(LoginController.ICON);
        setIconImage(img.getImage());

        LoginListener listener = new LoginListener(this);
        
        

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(loginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(loginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(loginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.updateComponentTreeUI(this);
        updateComponentTreeUI(this);
        
        UserFile lastUser = new UserFile();
        try {
            fieldUsuario.setText(lastUser.recuperaUsuario());
        } catch (Exception e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void login() throws IOException {
        
        UserFile lastUser = new UserFile();
        
        String account = fieldUsuario.getText();
        String password = String.valueOf(fieldSenha.getPassword());
        try {
            loginCtrl.login(account, password);
        } catch (LoginException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }
        lastUser.salvarUsuario(account);
        this.dispose();
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
    }

    public void cancelar() {
        JOptionPane.showMessageDialog(null, loginCtrl.CANCEL_MESSAGE);
        System.exit(0);
    }

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
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoLogin;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
