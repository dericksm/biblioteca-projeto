/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import Modules.login.loginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import projetomdi.Classes.CadastroEmprestimo;
import projetomdi.Listener.EmprestimoLivroListener;

/**
 *
 * @author CLIENTE
 */
public class EmprestimoLivro extends javax.swing.JInternalFrame {

    CadastroEmprestimo emprestimo = new CadastroEmprestimo();
    EmprestimoLivroListener listener = new EmprestimoLivroListener(this);

    public EmprestimoLivro() {
        initComponents();

    }

    public void limpar() {

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja limpar todos os campos?", "Confirmação Limpar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            fdDevolucao.setText("");
            fdEmprestimo.setText("");
            fdObservacoes.setText("");
        }
    }

    public void concluir() {

        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Salvar?", "Confirmação Salvar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            emprestimo.setCliente(menuClientes.getSelectedItem().toString());
            emprestimo.setDataDevolucao(fdDevolucao.getText());
            //emprestimo.setDataSaque(); vai ser incrementado quando estiver com o banco
            emprestimo.setLivro(menuLivro.getSelectedItem().toString());
            emprestimo.setObservacoes(fdObservacoes.getText());
            emprestimo.setPrazo(Integer.parseInt((String) menuPrazo.getSelectedItem()));
        }
    }

    public void cancelar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar o cadastro de emprestimo?", "Confirmação Cancelar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cliente = new javax.swing.JLabel();
        menuClientes = new javax.swing.JComboBox<>();
        livro = new javax.swing.JLabel();
        menuLivro = new javax.swing.JComboBox<>();
        data = new javax.swing.JLabel();
        fdEmprestimo = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            fdEmprestimo = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        data1 = new javax.swing.JLabel();
        menuPrazo = new javax.swing.JComboBox<>();
        devolucao = new javax.swing.JLabel();
        fdDevolucao = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            fdDevolucao = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        observacoes = new javax.swing.JLabel();
        fdObservacoes = new javax.swing.JTextField();
        btnConcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cliente.setText("Cliente");

        livro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        livro.setText("Livro");

        data.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data.setText("Data do Empréstimo");

        fdEmprestimo.setText(" ");

        data1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        data1.setText("Prazo");

        menuPrazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7 Dias", "15 Dias", "30 Dias" }));

        devolucao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        devolucao.setText("Data da Devolução");

        fdDevolucao.setText(" ");

        observacoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        observacoes.setText("Observações");

        btnConcluir.addActionListener(listener);
        btnConcluir.setActionCommand("concluir");
        btnConcluir.setText("Concluir");

        btnLimpar.addActionListener(listener);
        btnLimpar.setActionCommand("limpar");
        btnLimpar.setText("Limpar");

        btnCancelar.addActionListener(listener);
        btnCancelar.setActionCommand("cancelar");
        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cliente)
                        .addGap(18, 18, 18)
                        .addComponent(menuClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(livro)
                        .addGap(18, 18, 18)
                        .addComponent(menuLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(data1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuPrazo, 0, 193, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(devolucao)
                        .addGap(18, 18, 18)
                        .addComponent(fdDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(observacoes)
                        .addGap(18, 18, 18)
                        .addComponent(fdObservacoes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente)
                    .addComponent(menuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(livro)
                    .addComponent(menuLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data)
                    .addComponent(fdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data1)
                    .addComponent(menuPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(devolucao)
                    .addComponent(fdDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(observacoes)
                    .addComponent(fdObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel data;
    private javax.swing.JLabel data1;
    private javax.swing.JLabel devolucao;
    private javax.swing.JTextField fdDevolucao;
    private javax.swing.JTextField fdEmprestimo;
    private javax.swing.JTextField fdObservacoes;
    private javax.swing.JLabel livro;
    private javax.swing.JComboBox<String> menuClientes;
    private javax.swing.JComboBox<String> menuLivro;
    private javax.swing.JComboBox<String> menuPrazo;
    private javax.swing.JLabel observacoes;
    // End of variables declaration//GEN-END:variables
}
