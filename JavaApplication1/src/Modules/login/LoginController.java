/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules.login;


import config.config;
import static config.config.LOG_FILE;
import java.io.Serializable;
import javax.swing.JOptionPane;
import projetomdi.Exceptions.BibliotecaException;
import projetomdi.Frames.TelaPrincipal;
import projetomdi.LogFile.LogFiles;
import projetomdi.Service.UserAuth;

/**
 *
 * @author comp8
 */
public class LoginController {

    LogFiles logFiles = new LogFiles();

    static final String TITLE = "Login";
    static final String ICON = "iconeBiblioteca.png";
    static final String SUCCESS_MESSAGE = "Logado com sucesso";
    static final String ERROR_MESSAGE = "Login ou senha inválido";
    static final String CANCEL_MESSAGE = "Login cancelado, saindo do sistema";
    

    public void login(String account, String password) throws BibliotecaException {
        if (!UserAuth.autenticaUsuario(account, password))
            throw new BibliotecaException(ERROR_MESSAGE);
    }  
}
