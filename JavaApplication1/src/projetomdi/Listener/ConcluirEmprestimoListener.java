/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetomdi.Frames.ConcluirEmprestimo;

/**
 *
 * @author CLIENTE
 */
public class ConcluirEmprestimoListener implements ActionListener {

    private ConcluirEmprestimo conclui;

    public ConcluirEmprestimoListener(ConcluirEmprestimo concluiEmprestimo) {
        this.conclui = concluiEmprestimo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("sair".equals(e.getActionCommand())) {
            conclui.sair();
        }  else if ("verEmprestimo".equals(e.getActionCommand())) {
            conclui.verEmprestimo();
        } else if ("concluir".equals(e.getActionCommand())) {
            conclui.conclui();
        }

    }

}
