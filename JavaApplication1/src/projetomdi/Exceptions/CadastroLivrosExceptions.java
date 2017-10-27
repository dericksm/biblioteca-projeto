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
public class CadastroLivrosExceptions extends Exception{
    
    public CadastroLivrosExceptions() {
        super("Erro desconhecido");
    }
    
    public CadastroLivrosExceptions(Throwable thr) {
        super(thr);
    }

    public CadastroLivrosExceptions(String mensagem) {
        super(mensagem);
    }
    
     public CadastroLivrosExceptions(String mensagem, Throwable thr) {
        super(mensagem, thr);
    }
    
}
