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
public class BibliotecaException extends Exception{
    
    public BibliotecaException() {
        super("Erro desconhecido");
    }
    
    public BibliotecaException(Throwable thr) {
        super(thr);
    }

    public BibliotecaException(String mensagem) {
        super(mensagem);
    }
    
     public BibliotecaException(String mensagem, Throwable thr) {
        super(mensagem, thr);
    }
    
    
   
    }

