/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetomdi.Exceptions.BibliotecaException;
import projetomdi.Frames.Cadastro;



public class CadastroListener implements ActionListener{
    
    private Cadastro cad;

    public CadastroListener(Cadastro cad) {
        this.cad = cad;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("cancelar".equals(e.getActionCommand())) {
            cad.cancelar();
        } else if("limpar".equals(e.getActionCommand())){
            cad.limpar();
        } else if("sair".equals(e.getActionCommand())){
            cad.sair();
        } else if("salvar".equals(e.getActionCommand())){
            try {
                cad.salvar();
            } catch (BibliotecaException ex) {
                System.out.println(ex.getMessage());
            }
        } else if("atualizar".equals(e.getActionCommand())){
            cad.atualizar();
        } 
    }
    
    
}
