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
import projetomdi.Classes.CadastroLivro;
import projetomdi.Listener.CadastroLivroListener;

/**
 *
 * @author CLIENTE
 */
public class CadastroLivros extends javax.swing.JInternalFrame {

    CadastroLivro novoLivro = new CadastroLivro();
    CadastroLivroListener listener = new CadastroLivroListener(this);

    public CadastroLivros() {
        initComponents();

    }

    public void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Sair?", "Confirmação Sair", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    public void salvar() {

        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Salvar?", "Confirmação Salvar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            
            novoLivro.setAno(Integer.parseInt(fdAno.getText()));
            novoLivro.setAutor(fdAutor.getText());
            novoLivro.setCodigoLivro(Integer.parseInt(fdCodigoLivro.getText()));
            novoLivro.setEditora(fdEditora.getText());
            novoLivro.setGenero(fdGenero.getText());
            novoLivro.setNome(fdNome.getText());
            novoLivro.setQuantidade(Integer.parseInt(fdQuantidade.getText()));
            novoLivro.setnPaginas(Integer.parseInt(fdPaginas.getText()));
            novoLivro.imprimir();
        }

    }

    public void limpar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja limpar todos os campos?", "Confirmação Limpar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            fdAno.setText("");
            fdAutor.setText("");
            fdCodigoLivro.setText("");
            fdEditora.setText("");
            fdGenero.setText("");
            fdNome.setText("");
            fdPaginas.setText("");
            fdQuantidade.setText("");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fdCodigoLivro = new javax.swing.JTextField();
        codigoLivro = new javax.swing.JLabel();
        fdNome = new javax.swing.JTextField();
        codigoLivro1 = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        fdAutor = new javax.swing.JTextField();
        ano = new javax.swing.JLabel();
        fdAno = new javax.swing.JTextField();
        ano1 = new javax.swing.JLabel();
        fdPaginas = new javax.swing.JTextField();
        fdGenero = new javax.swing.JTextField();
        genero = new javax.swing.JLabel();
        fdEditora = new javax.swing.JTextField();
        editora = new javax.swing.JLabel();
        fdQuantidade = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        btnSalvarLivro = new javax.swing.JButton();
        btnLimparLivro = new javax.swing.JButton();
        btnSairLivro = new javax.swing.JButton();

        codigoLivro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigoLivro.setText("Código Livro");

        codigoLivro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigoLivro1.setText("Nome");

        autor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        autor.setText("Autor");

        ano.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ano.setText("Ano");

        ano1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ano1.setText("N Páginas");

        genero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        genero.setText("Gênero");

        editora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        editora.setText("Editora");

        quantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quantidade.setText("Quantidade de Livros");

        btnSalvarLivro.addActionListener(listener);
        btnSalvarLivro.setActionCommand("salvar");
        btnSalvarLivro.setText("Salvar");

        btnLimparLivro.addActionListener(listener);
        btnLimparLivro.setActionCommand("limpar");
        btnLimparLivro.setText("Limpar");

        btnSairLivro.addActionListener(listener);
        btnSairLivro.setActionCommand("sair");
        btnSairLivro.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigoLivro)
                        .addGap(18, 18, 18)
                        .addComponent(fdCodigoLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codigoLivro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(autor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdAutor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(genero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdGenero))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdEditora))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdQuantidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ano)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdAno, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ano1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSairLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarLivro)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLivro)
                    .addComponent(fdCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLivro1)
                    .addComponent(fdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autor)
                    .addComponent(fdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ano)
                    .addComponent(fdAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ano1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genero)
                    .addComponent(fdGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editora)
                    .addComponent(fdEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantidade)
                    .addComponent(fdQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarLivro)
                    .addComponent(btnLimparLivro)
                    .addComponent(btnSairLivro))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ano;
    private javax.swing.JLabel ano1;
    private javax.swing.JLabel autor;
    private javax.swing.JButton btnLimparLivro;
    private javax.swing.JButton btnSairLivro;
    private javax.swing.JButton btnSalvarLivro;
    private javax.swing.JLabel codigoLivro;
    private javax.swing.JLabel codigoLivro1;
    private javax.swing.JLabel editora;
    private javax.swing.JTextField fdAno;
    private javax.swing.JTextField fdAutor;
    private javax.swing.JTextField fdCodigoLivro;
    private javax.swing.JTextField fdEditora;
    private javax.swing.JTextField fdGenero;
    private javax.swing.JTextField fdNome;
    private javax.swing.JTextField fdPaginas;
    private javax.swing.JTextField fdQuantidade;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel quantidade;
    // End of variables declaration//GEN-END:variables
}
