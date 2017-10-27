/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import Modules.login.LoginView;
import static config.config.LOG_FILE;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import projetomdi.Classes.CadastroCliente;
import projetomdi.Listener.TelaPrincipalListener;
import projetomdi.LogFile.LogFiles;

/**
 *
 * @author comp8
 */
public class TelaPrincipal extends javax.swing.JFrame {

    TelaPrincipalListener listener = new TelaPrincipalListener(this);
    private String currentUser;

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }
    
   
    public TelaPrincipal(String user) {
        initComponents();
        setTitle("Biblioteca Corvo Guaraná");
        ImageIcon img = new ImageIcon("iconeBiblioteca.png");
        setIconImage(img.getImage());
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setCurrentUser(user);
        SwingUtilities.updateComponentTreeUI(this);
        updateComponentTreeUI(this);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuEmprestimo = new javax.swing.JMenuItem();
        menuLivros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");

        menuCliente.setMnemonic('o');
        menuCliente.addActionListener(listener);
        menuCliente.setActionCommand("menuCliente");
        menuCliente.setText("Cliente");
        fileMenu.add(menuCliente);

        menuEmprestimo.setMnemonic('a');
        menuEmprestimo.addActionListener(listener);
        menuEmprestimo.setActionCommand("menuEmprestimo");
        menuEmprestimo.setText("Emprestimo");
        fileMenu.add(menuEmprestimo);

        menuLivros.setText("Livros");
        menuLivros.addActionListener(listener);
        menuLivros.setActionCommand("menuLivros");
        fileMenu.add(menuLivros);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
     public void abrirCadastroCliente() {
        Cadastro cdCliente = new Cadastro(currentUser);
        cdCliente.setVisible(true);
        add(cdCliente);
        LogFiles.setFileContentAsStackTrace(LOG_FILE, currentUser + " acessou Cadastro");
    }
    
    
    public void abrirEmprestimoLivro() {
        EmprestimoLivro cdLivro = new EmprestimoLivro(currentUser);
        cdLivro.setVisible(true);
        add(cdLivro);
        LogFiles.setFileContentAsStackTrace(LOG_FILE, currentUser + " acessou Emprestimo Livro");
    }
    
    public void abrirCadastroLivros(){
        CadastroLivros cdEmprestimo = new CadastroLivros(currentUser);
        cdEmprestimo.setVisible(true);
        add(cdEmprestimo);
        LogFiles.setFileContentAsStackTrace(LOG_FILE, currentUser + " acessou Cadastro Livro");
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEmprestimo;
    private javax.swing.JMenuItem menuLivros;
    // End of variables declaration//GEN-END:variables

}
