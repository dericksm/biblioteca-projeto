/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import static config.config.LOG_FILE;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import projetomdi.Classes.CadastroCliente;
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

    public ConcluirEmprestimo(String user) {
        this.emprestimoDao = new EmprestimosDao(currentUser);
        initComponents();
        setCurrentUser(user);
        

    }
    
    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public void conclui(){
        emprestimoDao.delete(emprestimoDao.getCadastroEmprestimo(Integer.parseInt(emprestimoCodigo.getText())));
    }
    
    public void verEmprestimo() {
        List<CadastroEmprestimo> emprestimos = emprestimoDao.getAll();
        String clienteMessage = "";
        for (CadastroEmprestimo emprestimo : emprestimos) {
            clienteMessage += "Código Empréstimo: " + emprestimo.getCodigo()+ " - Código Cliente: " + emprestimo.getCodigo_cliente() + "\n";
        }
        JOptionPane.showMessageDialog(this, clienteMessage, "Empréstimos em Aberto", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Sair?", "Confirmação Sair", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }
    
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConcluir = new javax.swing.JButton();
        cliente2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        verEmprestimo = new javax.swing.JButton();
        emprestimoCodigo = new javax.swing.JTextField();

        btnConcluir.addActionListener(listener);
        btnConcluir.setActionCommand("concluir");
        btnConcluir.setText("Concluir");

        cliente2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cliente2.setText("Código");

        btnSair.addActionListener(listener);
        btnSair.setActionCommand("sair");
        btnSair.setText("Sair");

        verEmprestimo.addActionListener(listener);
        verEmprestimo.setActionCommand("verEmprestimo");
        verEmprestimo.setText("Ver emprestimos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cliente2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emprestimoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente2)
                    .addComponent(verEmprestimo)
                    .addComponent(emprestimoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnConcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel cliente2;
    private javax.swing.JTextField emprestimoCodigo;
    private javax.swing.JButton verEmprestimo;
    // End of variables declaration//GEN-END:variables
}
