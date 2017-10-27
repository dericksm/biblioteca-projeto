/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import Modules.login.LoginView;
import static config.config.LOG_FILE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projetomdi.Classes.CadastroCliente;
import projetomdi.Exceptions.BibliotecaException;
import projetomdi.Listener.CadastroListener;
import projetomdi.LogFile.LogFiles;

public class Cadastro extends javax.swing.JInternalFrame {

    CadastroCliente cliente = new CadastroCliente();
    CadastroListener listener = new CadastroListener(this);
    private String currentUser;

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }
    
    

    public Cadastro(String user) {
        initComponents();
        setCurrentUser(user);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fdNome = new javax.swing.JTextField();
        fdEndereco = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        fdBairro = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        fdReferencia = new javax.swing.JTextField();
        referencia = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        fdCidade = new javax.swing.JTextField();
        CEP = new javax.swing.JLabel();
        UF = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        fixo = new javax.swing.JLabel();
        fixo1 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        fdEmail = new javax.swing.JTextField();
        RG = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        fdNascimento = new javax.swing.JTextField();
        try{  
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");  
            fdNascimento = new javax.swing.JFormattedTextField(data);  
        }  
        catch (Exception e){  
        }
        nascimento = new javax.swing.JLabel();
        fdObservacoes = new javax.swing.JTextField();
        observacoes = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        fdCodigo = new javax.swing.JFormattedTextField();
        fdNumero = new javax.swing.JFormattedTextField();
        fdCEP = new javax.swing.JFormattedTextField();
        fdFixo = new javax.swing.JFormattedTextField();
        fdCelular = new javax.swing.JFormattedTextField();
        fdCPF = new javax.swing.JFormattedTextField();
        fdRG = new javax.swing.JFormattedTextField();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigo.setText("Código");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome");

        endereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        endereco.setText("Endereço");

        numero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        numero.setText("Número");

        bairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bairro.setText("Bairro");

        fdReferencia.setToolTipText("");

        referencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        referencia.setText("Ponto de Referência");

        cidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cidade.setText("Cidade");

        CEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CEP.setText("CEP");

        UF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        UF.setText("UF");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "PR", "SP" }));

        fixo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fixo.setText("Telefone Fixo");

        fixo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fixo1.setText("Celular");

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        email.setText("E-mail");

        RG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RG.setText("RG");

        CPF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CPF.setText("CPF");

        fdNascimento.setText(" ");

        nascimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nascimento.setText("Data Nascimento");

        observacoes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        observacoes.setText("Observações");

        btnSalvar.addActionListener(listener);
        btnSalvar.setActionCommand("salvar");
        btnSalvar.setText("Salvar");

        btnLimpar.addActionListener(listener);
        btnLimpar.setActionCommand("limpar");
        btnLimpar.setText("Limpar");

        btnCancelar.addActionListener(listener);
        btnCancelar.setActionCommand("cancelar");
        btnCancelar.setText("Cancelar");

        btnSair.addActionListener(listener);
        btnSair.setActionCommand("sair");
        btnSair.setText("Sair");

        try {
            fdCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            fdRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(fdNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endereco)
                                .addGap(18, 18, 18)
                                .addComponent(fdEndereco))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdRG, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(referencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCidade)
                                .addGap(18, 18, 18)
                                .addComponent(CEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UF)
                                .addGap(18, 18, 18)
                                .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fixo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fixo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCelular))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(email)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(observacoes)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fdEmail)
                                    .addComponent(fdObservacoes))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(fdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(fdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero)
                    .addComponent(bairro)
                    .addComponent(fdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referencia)
                    .addComponent(fdReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade)
                    .addComponent(fdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP)
                    .addComponent(UF)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fixo)
                    .addComponent(fixo1)
                    .addComponent(fdFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(fdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RG)
                    .addComponent(CPF)
                    .addComponent(nascimento)
                    .addComponent(fdNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fdRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(observacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSair))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void salvar() throws BibliotecaException {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Salvar?", "Confirmação Salvar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            ValidacaoCadastro();

            try {
                cliente.setCodigo(Integer.parseInt(fdCodigo.getText()));
                cliente.setNumero(Integer.parseInt(fdNumero.getText()));
                cliente.setCep(Integer.parseInt(fdFixo.getText().replaceAll("[.-]", "")));
                cliente.setCpf(Integer.parseInt(fdCPF.getText().replaceAll("[.-]", "")));
                cliente.setRg(Integer.parseInt(fdRG.getText().replaceAll("[.]", "")));
                cliente.setCel(Integer.parseInt(fdCelular.getText().replaceAll("[()-]", "")));
                cliente.setTelFixo(Integer.parseInt(fdFixo.getText().replaceAll("[()-]", "")));
                
            } catch (NumberFormatException e) {
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e, currentUser);
            }

            cliente.setNome(fdNome.getText());
            cliente.setEndereco(fdEndereco.getText());
            cliente.setBairro(fdBairro.getText());
            cliente.setReferencia(fdReferencia.getText());
            cliente.setEmail(fdEmail.getText());
            cliente.setObs(fdObservacoes.getText());
            cliente.setUf(UF.getText());
            cliente.imprimir();
            
            LogFiles.setFileContentAsStackTrace(LOG_FILE, "Usuário " + currentUser + " cadastrou um Usuario");
        }

    }

    public void limpar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja limpar todos os campos?", "Confirmação Limpar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            fdCodigo.setText("");
            fdNome.setText("");
            fdEndereco.setText("");
            fdNumero.setText("");
            fdBairro.setText("");
            fdReferencia.setText("");
            fdCidade.setText("");
            fdFixo.setText("");
            fdEmail.setText("");
            fdRG.setText("");
            fdCPF.setText("");
            fdObservacoes.setText("");
            
        }
    }

    public void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Sair?", "Confirmação Sair", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    public void cancelar() {

        JOptionPane.showMessageDialog(null, "Cadastro de Cliente Cancelado");
        dispose();

    }

    private void ValidacaoCadastro() throws BibliotecaException {
        if (fdBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Bairro");
            throw new BibliotecaException("Campo Bairro vazio");

        }
        if (fdFixo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo CEP");
            throw new BibliotecaException("Campo CEP vazio");

        }
        if (fdCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo CPF");
            throw new BibliotecaException("Campo CPF vazio");

        }
        if (fdCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Celular");
            throw new BibliotecaException("Campo Celular vazio");

        }
        if (fdCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Cidade");
            throw new BibliotecaException("Campo Cidade vazio");

        }
        if (fdCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Codigo");
            throw new BibliotecaException("Campo Codigo vazio");

        }
        if (fdEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo E-mail");
            throw new BibliotecaException("Campo E-mail vazio");

        }
        if (fdEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Endereco");
            throw new BibliotecaException("Campo Endereco vazio");

        }
        if (fdFixo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Telefone Fixo");
            throw new BibliotecaException("Campo Telefone Fixo vazio");

        }
        if (fdNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Data Nascimento");
            throw new BibliotecaException("Campo Data Nascimento vazio");

        }
        if (fdNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Nome");
            throw new BibliotecaException("Campo Nome vazio");

        }
        if (fdNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Numero");
            throw new BibliotecaException("Campo Numero vazio");

        }
        if (fdRG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo RG");
            throw new BibliotecaException("Campo RG vazio");

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel RG;
    private javax.swing.JLabel UF;
    private javax.swing.JLabel bairro;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel email;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField fdBairro;
    private javax.swing.JFormattedTextField fdCEP;
    private javax.swing.JFormattedTextField fdCPF;
    private javax.swing.JFormattedTextField fdCelular;
    private javax.swing.JTextField fdCidade;
    private javax.swing.JFormattedTextField fdCodigo;
    private javax.swing.JTextField fdEmail;
    private javax.swing.JTextField fdEndereco;
    private javax.swing.JFormattedTextField fdFixo;
    private javax.swing.JTextField fdNascimento;
    private javax.swing.JTextField fdNome;
    private javax.swing.JFormattedTextField fdNumero;
    private javax.swing.JTextField fdObservacoes;
    private javax.swing.JFormattedTextField fdRG;
    private javax.swing.JTextField fdReferencia;
    private javax.swing.JLabel fixo;
    private javax.swing.JLabel fixo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nascimento;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel observacoes;
    private javax.swing.JLabel referencia;
    // End of variables declaration//GEN-END:variables

}
