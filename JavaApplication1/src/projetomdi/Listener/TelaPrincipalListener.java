/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetomdi.Frames.TelaPrincipal;

/**
 *
 * @author CLIENTE
 */
public class TelaPrincipalListener implements ActionListener{

    private TelaPrincipal telaPrincipal;

    public TelaPrincipalListener(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

   
    public void actionPerformed(ActionEvent e) {
         if ("menuLivros".equals(e.getActionCommand())) {
            telaPrincipal.abrirCadastroLivros();
        } else if ("menuEmprestimo".equals(e.getActionCommand())) {
            telaPrincipal.abrirEmprestimoLivro();
        } else if ("menuCliente".equals(e.getActionCommand())) {
            telaPrincipal.abrirCadastroCliente();
        }
        
    }
    
}
