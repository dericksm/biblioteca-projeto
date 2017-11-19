/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import static config.config.LOG_FILE;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import projetomdi.Classes.CadastroEmprestimo;
import projetomdi.Exceptions.BibliotecaException;

import projetomdi.Listener.EmprestimoLivroListener;
import projetomdi.LogFile.LogFiles;
import projetomdi.Service.EmprestimosDao;

/**
 *
 * @author CLIENTE
 */
public class EmprestimoLivro extends javax.swing.JInternalFrame {

    EmprestimoLivroListener listener = new EmprestimoLivroListener(this);
    EmprestimosDao emprestimoDao;
    private String currentUser;
    
    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public EmprestimoLivro(String user) {
        this.emprestimoDao = new EmprestimosDao(currentUser);
        initComponents();
        setCurrentUser(user);

    }

    public void limpar() {

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja limpar todos os campos?", "Confirmação Limpar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            fdDevolucao.setText("");
            fdEmprestimo.setText("");
            fdObservacoes.setText("");
        }
    }

    private CadastroEmprestimo getEmprestimo() {
        CadastroEmprestimo emprestimo = new CadastroEmprestimo();

        //emprestimo.setCodigo_cliente(listaClientes.getSelectedIndex());
        //emprestimo.setCodigo_livro(listaLivros.getSelectedValuesList());
        emprestimo.setData_emprestimo(fdEmprestimo.getText());
        emprestimo.setData_devolucao(fdDevolucao.getText());
        emprestimo.setObservacao(fdObservacoes.getText());
        
        try {
            emprestimo.setPrazo(Integer.parseInt((String) menuPrazo.getSelectedItem()));
        } catch (NumberFormatException e) {
            LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
        }

        return emprestimo;
    }

    public void concluir() throws BibliotecaException {

        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Salvar?", "Confirmação Salvar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            ValidaVazio();
            CadastroEmprestimo emprestimo = getEmprestimo();
            emprestimoDao.insert(emprestimo);
            LogFiles.setFileContentAsStackTrace(LOG_FILE, "Usuário " + currentUser + " cadastrou um Emprestimo");
        }
    }

    public void cancelar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar o cadastro de emprestimo?", "Confirmação Cancelar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    private void ValidaVazio() throws BibliotecaException {
        if (fdDevolucao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Devolucão");
            throw new BibliotecaException("Campo Devolucão Vazio");

        }
        if (fdEmprestimo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Emprestimo");
            throw new BibliotecaException("Campo Emprestimo Vazio");

        }
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        cliente = new javax.swing.JLabel();
        livro = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaLivros = new javax.swing.JList<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

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

        listaClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaClientes);

        listaLivros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaLivros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fdEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(data1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menuPrazo, 0, 193, Short.MAX_VALUE))
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
                        .addComponent(btnConcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cliente)
                            .addComponent(livro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(devolucao)
                        .addGap(18, 18, 18)
                        .addComponent(fdDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cliente))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(livro))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JList<String> listaLivros;
    private javax.swing.JLabel livro;
    private javax.swing.JComboBox<String> menuPrazo;
    private javax.swing.JLabel observacoes;
    // End of variables declaration//GEN-END:variables
}
