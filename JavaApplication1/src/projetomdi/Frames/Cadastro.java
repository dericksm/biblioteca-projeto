/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Frames;

import static config.config.LOG_FILE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projetomdi.Classes.CadastroCliente;
import projetomdi.Exceptions.CadastroException;
import projetomdi.Listener.CadastroListener;
import projetomdi.LogFile.LogFiles;

public class Cadastro extends javax.swing.JInternalFrame {

    CadastroCliente cliente = new CadastroCliente();
    CadastroListener listener = new CadastroListener(this);

    public Cadastro() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo = new javax.swing.JLabel();
        fdCodigo = new javax.swing.JTextField();
        rbFisica = new javax.swing.JRadioButton();
        rbJuridica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fdNome = new javax.swing.JTextField();
        fdEndereco = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        fdNumero = new javax.swing.JTextField();
        fdBairro = new javax.swing.JTextField();
        bairro = new javax.swing.JLabel();
        fdReferencia = new javax.swing.JTextField();
        referencia = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        fdCidade = new javax.swing.JTextField();
        fdCEP = new javax.swing.JTextField();
        CEP = new javax.swing.JLabel();
        UF = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox<>();
        fixo = new javax.swing.JLabel();
        fdFixo = new javax.swing.JTextField();
        fixo1 = new javax.swing.JLabel();
        fdCelular = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        fdEmail = new javax.swing.JTextField();
        RG = new javax.swing.JLabel();
        fdRG = new javax.swing.JTextField();
        fdCPF = new javax.swing.JTextField();
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

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigo.setText("Código");

        fdCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        rbFisica.setText("Física");
        rbFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFisicaActionPerformed(evt);
            }
        });

        rbJuridica.setText("Jurídica");
        rbJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbJuridicaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Pessoa");

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
                                .addGap(18, 18, 18)
                                .addComponent(fdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFisica)
                                .addGap(18, 18, 18)
                                .addComponent(rbJuridica)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fdRG, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CPF)
                                .addGap(18, 18, 18)
                                .addComponent(fdCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addGap(38, 38, 38)
                                .addComponent(nascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(referencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdReferencia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCidade)
                                .addGap(18, 18, 18)
                                .addComponent(CEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fdCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
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
                    .addComponent(fdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFisica)
                    .addComponent(rbJuridica)
                    .addComponent(jLabel2))
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
                    .addComponent(fdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairro)
                    .addComponent(fdBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referencia)
                    .addComponent(fdReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade)
                    .addComponent(fdCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP)
                    .addComponent(fdCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UF)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fixo)
                    .addComponent(fdFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fixo1)
                    .addComponent(fdCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(fdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RG)
                    .addComponent(fdRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF)
                    .addComponent(fdCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nascimento)
                    .addComponent(fdNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void rbFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFisicaActionPerformed
        rbJuridica.setSelected(false);
        RG.setText("CNPJ");
        CPF.setText("CPF");

    }//GEN-LAST:event_rbFisicaActionPerformed

    private void rbJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbJuridicaActionPerformed
        rbFisica.setSelected(false);
        RG.setText("RG");
        CPF.setText("CPF");
    }//GEN-LAST:event_rbJuridicaActionPerformed
    public void salvar() throws CadastroException {
        int resposta = JOptionPane.showConfirmDialog(null, "Realmente deseja Salvar?", "Confirmação Salvar", JOptionPane.YES_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            ValidacaoCadastro();

            try {
                cliente.setCodigo(Integer.parseInt(fdCodigo.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo Codigo com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }

            try {
                cliente.setNumero(Integer.parseInt(fdNumero.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo Numero com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }

            try {
                cliente.setCep(Integer.parseInt(fdCEP.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo CEP com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }

            try {
                cliente.setRg(Integer.parseInt(fdRG.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo RG com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }

            try {
                cliente.setCpf(Integer.parseInt(fdCPF.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo CPF com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }

            try {
                cliente.setTelFixo(Integer.parseInt(fdFixo.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo Telefone Fixo com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }
            try {
                cliente.setCel(Integer.parseInt(fdCelular.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha o campo Celular com números");
                LogFiles.setFileContentAsStackTrace(LOG_FILE, e);
            }

            cliente.setNome(fdNome.getText());
            cliente.setEndereco(fdEndereco.getText());
            cliente.setBairro(fdBairro.getText());
            cliente.setReferencia(fdReferencia.getText());
            cliente.setEmail(fdEmail.getText());
            cliente.setObs(fdObservacoes.getText());
            cliente.setUf(UF.getText());
            cliente.imprimir();

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
            fdCEP.setText("");
            fdEmail.setText("");
            fdRG.setText("");
            fdCPF.setText("");
            fdObservacoes.setText("");
            rbFisica.setSelected(false);
            rbJuridica.setSelected(false);
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

    private void ValidacaoCadastro() throws CadastroException {
        if (fdBairro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Bairro");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Bairro vazio");
            throw new CadastroException ("Campo Bairro vazio");
            
        }
        if (fdCEP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo CEP");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo CEP vazio");
            throw new CadastroException("Campo CEP vazio");

        }
        if (fdCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo CPF");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo CPF vazio");
            throw new CadastroException("Campo CPF vazio");

        }
        if (fdCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Celular");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Celular vazio");
            throw new CadastroException("Campo Celular vazio");

        }
        if (fdCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Cidade");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Cidade vazio");
            throw new CadastroException("Campo Cidade vazio");

        }
        if (fdCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Codigo");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Codigo vazio");
            throw new CadastroException("Campo Codigo vazio");

        }
        if (fdEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo E-mail");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo E-mail vazio");
            throw new CadastroException("Campo E-mail vazio");

        }
        if (fdEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Endereco");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Endereço vazio");
            throw new CadastroException("Campo Endereco vazio");

        }
        if (fdFixo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Telefone Fixo");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Telefone Fixo vazio");
            throw new CadastroException("Campo Telefone Fixo vazio");

        }
        if (fdNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Data Nascimento");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Data Nascimento vazio");
            throw new CadastroException("Campo Data Nascimento vazio");

        }
        if (fdNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Nome");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Nome vazio");
            throw new CadastroException("Campo Nome vazio");

        }
        if (fdNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo Numero");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo Numero vazio");
            throw new CadastroException("Campo Numero vazio");

        }
        if (fdRG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o campo RG");
            LogFiles.setFileContentAsText(LOG_FILE, "Campo RG vazio");
            throw new CadastroException("Campo RG vazio");

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
    private javax.swing.JTextField fdCEP;
    private javax.swing.JTextField fdCPF;
    private javax.swing.JTextField fdCelular;
    private javax.swing.JTextField fdCidade;
    private javax.swing.JTextField fdCodigo;
    private javax.swing.JTextField fdEmail;
    private javax.swing.JTextField fdEndereco;
    private javax.swing.JTextField fdFixo;
    private javax.swing.JTextField fdNascimento;
    private javax.swing.JTextField fdNome;
    private javax.swing.JTextField fdNumero;
    private javax.swing.JTextField fdObservacoes;
    private javax.swing.JTextField fdRG;
    private javax.swing.JTextField fdReferencia;
    private javax.swing.JLabel fixo;
    private javax.swing.JLabel fixo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nascimento;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel observacoes;
    private javax.swing.JRadioButton rbFisica;
    private javax.swing.JRadioButton rbJuridica;
    private javax.swing.JLabel referencia;
    // End of variables declaration//GEN-END:variables

    
}
