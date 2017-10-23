
package projetomdi.Classes;


public class CadastroLivro {
    
    int codigoLivro;
    int ano;
    int nPaginas;
    int quantidade;
    String nome;
    String autor;
    String genero;
    String editora;

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
    public void imprimir() {
        System.out.println(codigoLivro);
        System.out.println(nome);
        System.out.println(autor);
        System.out.println(ano);
        System.out.println(nPaginas);
        System.out.println(genero);
        System.out.println(editora);
        System.out.println(quantidade);
        
    }
    
}
