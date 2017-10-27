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
import javax.swing.JOptionPane;
import projetomdi.Exceptions.CadastroException;
import projetomdi.Frames.Cadastro;
import projetomdi.LogFile.LogFiles;



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
            } catch (CadastroException ex) {
                LogFiles.setFileContentAsStackTrace(LOG_FILE, ex);
            }
        }
    }
    
    
}
