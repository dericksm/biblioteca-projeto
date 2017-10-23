/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Listener;

import Modules.login.loginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CLIENTE
 */
public class LoginListener implements ActionListener {
    
    private loginView login;

    public LoginListener(loginView login) {
        this.login = login;
    }      
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if("login".equals(e.getActionCommand())) {
            login.login();
        } else if("cancelar".equals(e.getActionCommand())){
            login.cancelar();
        }
    }
    
    
}
