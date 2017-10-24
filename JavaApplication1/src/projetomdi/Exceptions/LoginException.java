/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Exceptions;

/**
 *
 * @author CLIENTE
 */
public class LoginException extends Exception {

    public LoginException() {
        super("Login ou senha inválidos");
    }

    public LoginException(String mensagem) {
        super(mensagem);
    }

}
