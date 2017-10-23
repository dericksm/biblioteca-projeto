
package projetomdi.Classes;


public class CadastroEmprestimo {
    
    String cliente;
    String livro;
    String dataSaque;
    String dataDevolucao;
    String observacoes;
    int prazo;
    
    
    public void imprimir() {
        System.out.println(cliente);
        System.out.println(livro);
        System.out.println(dataSaque);
        System.out.println(dataDevolucao);
        System.out.println(observacoes);
        System.out.println(prazo);
    }
    
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getDataSaque() {
        return dataSaque;
    }

    public void setDataSaque(String dataSaque) {
        this.dataSaque = dataSaque;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
    
    
    
}
