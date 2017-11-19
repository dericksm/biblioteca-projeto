/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import static config.config.LOG_FILE;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import projetomdi.Classes.CadastroEmprestimo;
import projetomdi.Listener.ConcluirEmprestimoListener;
import projetomdi.LogFile.LogFiles;
import projetomdi.Service.EmprestimosDao;

/**
 *
 * @author CLIENTE
 */
public class ConcluirEmprestimo extends javax.swing.JInternalFrame {

   
    ConcluirEmprestimoListener listener = new ConcluirEmprestimoListener(this);
    EmprestimosDao emprestimoDao;
    private String currentUser;
    
    DefaultListModel model = new DefaultListModel();

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public ConcluirEmprestimo(String currentUser) {
        this.emprestimoDao = new EmprestimosDao(currentUser);
        initComponents();
        listaEmprestimo.setModel(model);
        atualizarLista();
    }
    
    public void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Sair?", "Confirmação Sair", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    
    
    public void excluir(){
        
        int index = listaEmprestimo.getSelectedIndex();        
        CadastroEmprestimo emprestimoLivro = emprestimoDao.getCadastroCliente(listaEmprestimo.getSelectedIndex());
        model.remove(index);
        try {
            emprestimoDao.delete(emprestimoLivro);
        } catch (Exception e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, currentUser + " Concluiu um Emprestimo");
        }
        atualizarLista();
                        
        
    }
    
    private void atualizarLista() {
        try {
            listaEmprestimo.setListData(new Vector(emprestimoDao.getAll()));
        } catch (Exception e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);

        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaEmprestimo = new javax.swing.JList<>();
        btnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        listaEmprestimo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaEmprestimo);

        btnFechar.addActionListener(listener);
        btnFechar.setActionCommand("fechar");
        btnFechar.setText("Fechar");

        btnExcluir.addActionListener(listener);
        btnExcluir.setActionCommand("excluir");
        btnExcluir.setText("Concluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnFechar)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaEmprestimo;
    // End of variables declaration//GEN-END:variables
}
