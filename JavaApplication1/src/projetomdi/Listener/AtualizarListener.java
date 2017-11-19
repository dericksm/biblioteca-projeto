/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetomdi.Frames.AtualizarCliente;

/**
 *
 * @author CLIENTE
 */
public class AtualizarListener implements ActionListener{

    
    private AtualizarCliente at;

    public AtualizarListener(AtualizarCliente at) {
        this.at = at;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if ("sair".equals(e.getActionCommand())) {
            at.sair();
        } else if ("buscar".equals(e.getActionCommand())) {
            at.buscar();
        } else if ("verCliente".equals(e.getActionCommand())) {
            at.verCliente();
        }
    }
    
}
