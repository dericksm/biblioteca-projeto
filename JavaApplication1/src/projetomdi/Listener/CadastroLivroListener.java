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
import projetomdi.Frames.Cadastro;
import projetomdi.Frames.CadastroLivros;
import projetomdi.LogFile.LogFiles;

/**
 *
 * @author comp8
 */
public class CadastroLivroListener implements ActionListener {

    private CadastroLivros cadLivro;

    public CadastroLivroListener(CadastroLivros cadLivro) {
        this.cadLivro = cadLivro;
    }

    public void actionPerformed(ActionEvent e) {
        if ("limpar".equals(e.getActionCommand())) {
            cadLivro.limpar();
        } else if ("sair".equals(e.getActionCommand())) {
            cadLivro.sair();
        } else if ("salvar".equals(e.getActionCommand())) {
            try {
                cadLivro.salvar();
            } catch (BibliotecaException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
