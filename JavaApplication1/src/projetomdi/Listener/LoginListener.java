/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import Modules.login.LoginView;
import static config.config.LOG_FILE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetomdi.LogFile.LogFiles;

/**
 *
 * @author CLIENTE
 */
public class LoginListener implements ActionListener {
    
    private LoginView login;

    public LoginListener(LoginView login) {
        this.login = login;
    }      
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if("login".equals(e.getActionCommand())) {
            try {
                login.login();
            } catch (IOException ex) {
                LogFiles.setFileContentAsStackTrace(LOG_FILE, ex);
            }
        } else if("cancelar".equals(e.getActionCommand())){
            login.cancelar();
        }
    }
    
    
}
