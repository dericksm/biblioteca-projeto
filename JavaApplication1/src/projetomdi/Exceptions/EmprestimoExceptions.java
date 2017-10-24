/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomdi.Exceptions;

/**
 *
 * @author comp1
 */
public class EmprestimoExceptions extends Exception{
    
    public EmprestimoExceptions() {
        super("Erro desconhecido");
    }
    
    public EmprestimoExceptions(Throwable thr) {
        super(thr);
    }

    public EmprestimoExceptions(String mensagem) {
        super(mensagem);
    }
    
     public EmprestimoExceptions(String mensagem, Throwable thr) {
        super(mensagem, thr);
    }
    
}
