
package projetomdi.Classes;


public class CadastroEmprestimo {
    
    int codigo;
    int codigo_cliente;
    int codigo_livro;
    String data_emprestimo;
    String data_devolucao;
    int prazo;
    String observacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public int getCodigo_livro() {
        return codigo_livro;
    }

    public void setCodigo_livro(int codigo_livro) {
        this.codigo_livro = codigo_livro;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public void imprimir() {
        System.out.println(codigo);
        System.out.println(codigo_cliente);
        System.out.println(codigo_livro);
        System.out.println(data_emprestimo);
        System.out.println(data_devolucao);
        System.out.println(prazo);
        System.out.println(observacao);
    }
}
