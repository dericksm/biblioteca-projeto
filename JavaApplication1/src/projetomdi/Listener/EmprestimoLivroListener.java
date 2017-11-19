/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import static config.config.LOG_FILE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetomdi.Exceptions.BibliotecaException;
import projetomdi.Frames.CadastroLivros;
import projetomdi.Frames.EmprestimoLivro;
import projetomdi.LogFile.LogFiles;

/**
 *
 * @author comp8
 */
public class EmprestimoLivroListener implements ActionListener {
    
    
    private EmprestimoLivro emprestimoLivro;

    public EmprestimoLivroListener(EmprestimoLivro emprestimoLivro) {
        this.emprestimoLivro = emprestimoLivro;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            emprestimoLivro.cancelar();
        } else if ("verLivro".equals(e.getActionCommand())) {
            emprestimoLivro.verLivro();
        } else if ("verCliente".equals(e.getActionCommand())) {
            emprestimoLivro.verCliente();
        } else if ("limpar".equals(e.getActionCommand())) {
            emprestimoLivro.limpar();
        } else if ("concluir".equals(e.getActionCommand())) {
            try {
                emprestimoLivro.concluir();
            } catch (BibliotecaException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
     
     
     

    
    
}
