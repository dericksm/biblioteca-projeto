
package projetomdi.Classes;

public class CadastroLivro {
    
    int codigo;
    String nome;
    String autor;
    int ano;
    int num_paginas;
    String genero;
    String editora;
    int quantidade;
    
    public void imprimir() {
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(autor);
        System.out.println(ano);
        System.out.println(num_paginas);
        System.out.println(genero);
        System.out.println(editora);
        System.out.println(quantidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNum_paginas() {
        return num_paginas;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
