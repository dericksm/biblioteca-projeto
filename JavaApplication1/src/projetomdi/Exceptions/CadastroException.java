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
public class CadastroException extends Exception{
    
    public CadastroException() {
        super("Erro desconhecido");
    }
    
    public CadastroException(Throwable thr) {
        super(thr);
    }

    public CadastroException(String mensagem) {
        super(mensagem);
    }
    
     public CadastroException(String mensagem, Throwable thr) {
        super(mensagem, thr);
    }
    
    
   
    }

