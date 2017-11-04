package projetomdi.Listener;

import Modules.login.LoginView;
import static config.config.LOG_FILE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projetomdi.Exceptions.BibliotecaException;
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
        if ("login".equals(e.getActionCommand())) {
            try {
                login.login();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else if ("cancelar".equals(e.getActionCommand())) {
            login.cancelar();
        }
    }

}
