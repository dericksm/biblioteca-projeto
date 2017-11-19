/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import static config.config.LOG_FILE;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projetomdi.Classes.CadastroCliente;
import projetomdi.Classes.CadastroEmprestimo;
import projetomdi.Classes.CadastroLivro;
import projetomdi.Exceptions.BibliotecaException;
import projetomdi.Listener.EmprestimoLivroListener;
import projetomdi.LogFile.LogFiles;
import projetomdi.Service.ClientesDAO;
import projetomdi.Service.EmprestimosDao;
import projetomdi.Service.LivrosDao;

/**
 *
 * @author CLIENTE
 */
public class EmprestimoLivro extends javax.swing.JInternalFrame {

    EmprestimoLivroListener listener = new EmprestimoLivroListener(this);
    EmprestimosDao emprestimoDao;
    ClientesDAO clienteDao;
    LivrosDao livrosDao;
    private String currentUser;

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public EmprestimoLivro(String user) {
        this.emprestimoDao = new EmprestimosDao(currentUser);
        this.clienteDao = new ClientesDAO(currentUser);
        this.livrosDao = new LivrosDao(currentUser);
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
    
    public void verCliente() {
        List<CadastroCliente> clientes = clienteDao.getAll();
        String clienteMessage = "";
        for (CadastroCliente cliente1 : clientes) {
            clienteMessage += cliente1.getCodigo() + " - " + cliente1.getNome() + "\n";
                    }
        JOptionPane.showMessageDialog(this, clienteMessage, "Clientes Disponíveis", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
    public void verLivro() {
        List<CadastroLivro> livros = livrosDao.getAll();
        String livrosMessage = "";
        for (CadastroLivro livro : livros) {
            livrosMessage += livro.getCodigo()+ " - " + livro.getNome()+ "\n";
                    }
        JOptionPane.showMessageDialog(this, livrosMessage, "Livros Disponíveis", JOptionPane.INFORMATION_MESSAGE);
        
        
    }

    private CadastroEmprestimo getEmprestimo() {
        CadastroEmprestimo emprestimo = new CadastroEmprestimo();

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
        codigoCliente = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            fdEmprestimo = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        codigoLivro = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            fdEmprestimo = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        verClientes = new javax.swing.JButton();
        verLivros = new javax.swing.JButton();

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

        codigoCliente.setText(" ");

        codigoLivro.setText(" ");

        verClientes.addActionListener(listener);
        verClientes.setActionCommand("verCliente");
        verClientes.setText("Ver clientes");

        verLivros.addActionListener(listener);
        verLivros.setActionCommand("verLivro");
        verLivros.setText("Ver livros");

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
                        .addComponent(devolucao)
                        .addGap(18, 18, 18)
                        .addComponent(fdDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(livro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(codigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verLivros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cliente)
                    .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verClientes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(livro)
                    .addComponent(codigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verLivros))
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
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel cliente;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JTextField codigoLivro;
    private javax.swing.JLabel data;
    private javax.swing.JLabel data1;
    private javax.swing.JLabel devolucao;
    private javax.swing.JTextField fdDevolucao;
    private javax.swing.JTextField fdEmprestimo;
    private javax.swing.JTextField fdObservacoes;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel livro;
    private javax.swing.JComboBox<String> menuPrazo;
    private javax.swing.JLabel observacoes;
    private javax.swing.JButton verClientes;
    private javax.swing.JButton verLivros;
    // End of variables declaration//GEN-END:variables
}
