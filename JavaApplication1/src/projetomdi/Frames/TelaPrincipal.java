/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import Modules.login.LoginView;
import static config.config.LOG_FILE;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuLivros = new javax.swing.JMenuItem();
        updateCliente = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuEmprestimo = new javax.swing.JMenuItem();
        concluirEmprestimo = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");

        menuCliente.setMnemonic('o');
        menuCliente.addActionListener(listener);
        menuCliente.setActionCommand("menuCliente");
        menuCliente.setText("Cliente");
        fileMenu.add(menuCliente);

        menuLivros.setText("Livros");
        menuLivros.addActionListener(listener);
        menuLivros.setActionCommand("menuLivros");
        fileMenu.add(menuLivros);

        menuBar.add(fileMenu);

        updateCliente.setText("Atualizar");

        jMenuItem2.setText("Atualizar Cliente");
        jMenuItem2.addActionListener(listener);
        jMenuItem2.setActionCommand("updateCliente");
        updateCliente.add(jMenuItem2);

        menuBar.add(updateCliente);

        jMenu5.setText("Eprestimo");

        menuEmprestimo.setMnemonic('a');
        menuEmprestimo.addActionListener(listener);
        menuEmprestimo.setActionCommand("menuEmprestimo");
        menuEmprestimo.setText("Emprestimo");
        jMenu5.add(menuEmprestimo);

        concluirEmprestimo.setText("Concluir Emprestimo");
        concluirEmprestimo.addActionListener(listener);
        concluirEmprestimo.setActionCommand("concluirEmprestimo");
        jMenu5.add(concluirEmprestimo);

        menuBar.add(jMenu5);

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
    
    public void abrirAtualizaCliente(){
        AtualizarCliente atualiza = new AtualizarCliente(currentUser);
        atualiza.setVisible(true);
        add(atualiza);
        LogFiles.setFileContentAsStackTrace(LOG_FILE, currentUser + " acessou Atualiza Cliente");
    }
    
     public void abrirConcluirEmprestimo(){
        ConcluirEmprestimo concluirEmprestimo = new ConcluirEmprestimo(currentUser);
        concluirEmprestimo.setVisible(true);
        add(concluirEmprestimo);
        LogFiles.setFileContentAsStackTrace(LOG_FILE, currentUser + " acessou Concluir Emprestimo");
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
    private javax.swing.JMenuItem concluirEmprestimo;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuEmprestimo;
    private javax.swing.JMenuItem menuLivros;
    private javax.swing.JMenu updateCliente;
    // End of variables declaration//GEN-END:variables

}
