/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import static config.config.LOG_FILE;
import javax.swing.JOptionPane;
import projetomdi.Classes.CadastroLivro;
import projetomdi.Exceptions.BibliotecaException;
import projetomdi.Listener.CadastroLivroListener;
import projetomdi.LogFile.LogFiles;
import projetomdi.Service.LivrosDao;

/**
 *
 * @author CLIENTE
 */
public class CadastroLivros extends javax.swing.JInternalFrame {

    CadastroLivro novoLivro = new CadastroLivro();
    CadastroLivroListener listener = new CadastroLivroListener(this);
    LivrosDao livrosDao;
    private String currentUser;

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public CadastroLivros(String user) {
        this.livrosDao = new LivrosDao(currentUser);
        initComponents();
        setCurrentUser(user);

    }

    public void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Sair?", "Confirmação Sair", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    public void salvar() throws BibliotecaException {

        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Salvar?", "Confirmação Salvar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            try {
                ValidaVazio();
            } catch (Exception e) {
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);

            }
            try {
                novoLivro.setAno(Integer.parseInt(fdAno.getText()));
                novoLivro.setQuantidade(Integer.parseInt(fdQuantidade.getText()));
                novoLivro.setNum_paginas(Integer.parseInt(fdPaginas.getText()));
            } catch (NumberFormatException e) {
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
            }

            novoLivro.setAutor(fdAutor.getText());
            novoLivro.setEditora(fdEditora.getText());
            novoLivro.setGenero(fdGenero.getText());
            novoLivro.setNome(fdNome.getText());
            novoLivro.imprimir();

            try {
                livrosDao.insert(novoLivro);
                JOptionPane.showMessageDialog(this, "Livro cadastrado");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar, por favor, tente novamente");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
            }

            LogFiles.setFileContentAsStackTrace(LOG_FILE, "Usuário " + currentUser + " cadastrou um Livro");
        }

    }

    public void limpar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja limpar todos os campos?", "Confirmação Limpar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            fdAno.setText("");
            fdAutor.setText("");
            fdEditora.setText("");
            fdGenero.setText("");
            fdNome.setText("");
            fdPaginas.setText("");
            fdQuantidade.setText("");

        }
    }

    public void ValidaVazio() throws BibliotecaException {
        if (fdAno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Ano");
            throw new BibliotecaException("Campo Ano Vazio");

        }
        if (fdAutor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Autor");
            throw new BibliotecaException("Campo Autor Vazio");

        }
        if (fdEditora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Editora");
            throw new BibliotecaException("Campo Editora Vazio");

        }
        if (fdGenero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Gênero");
            throw new BibliotecaException("Campo Gênero Vazio");

        }
        if (fdNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Nome");
            throw new BibliotecaException("Campo Nome Vazio");

        }
        if (fdPaginas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Paginas");
            throw new BibliotecaException("Campo Paginas Vazio");

        }
        if (fdQuantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Quantidade Paginas");
            throw new BibliotecaException("Campo Quantidade Paginas Vazio");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fdNome = new javax.swing.JTextField();
        codigoLivro1 = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        fdAutor = new javax.swing.JTextField();
        ano = new javax.swing.JLabel();
        ano1 = new javax.swing.JLabel();
        fdGenero = new javax.swing.JTextField();
        genero = new javax.swing.JLabel();
        fdEditora = new javax.swing.JTextField();
        editora = new javax.swing.JLabel();
        fdQuantidade = new javax.swing.JTextField();
        quantidade = new javax.swing.JLabel();
        btnSalvarLivro = new javax.swing.JButton();
        btnLimparLivro = new javax.swing.JButton();
        btnSairLivro = new javax.swing.JButton();
        fdAno = new javax.swing.JFormattedTextField();
        fdPaginas = new javax.swing.JFormattedTextField();

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

        try {
            fdAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdPaginas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(fdAno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ano1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(22, 22, 22)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ano1)
                        .addComponent(fdAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(21, Short.MAX_VALUE))
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
    private javax.swing.JLabel codigoLivro1;
    private javax.swing.JLabel editora;
    private javax.swing.JFormattedTextField fdAno;
    private javax.swing.JTextField fdAutor;
    private javax.swing.JTextField fdEditora;
    private javax.swing.JTextField fdGenero;
    private javax.swing.JTextField fdNome;
    private javax.swing.JFormattedTextField fdPaginas;
    private javax.swing.JTextField fdQuantidade;
    private javax.swing.JLabel genero;
    private javax.swing.JLabel quantidade;
    // End of variables declaration//GEN-END:variables
}
