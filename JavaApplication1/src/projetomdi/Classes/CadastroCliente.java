
package projetomdi.Classes;


public class CadastroCliente {
    
    int codigo;
    String nome;
    String endereco;
    String pontoRef;
    String cidade;
    int cep;
    String uf;
    int telFixo;
    int cel;
    String email;
    int rg;
    int cpf;
    String data;
    String obs;
    int numero;
    String bairro;
    String referencia;
    
    public void imprimir() {
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(pontoRef);
        System.out.println(cidade);
        System.out.println(cep);
        System.out.println(uf);
        System.out.println(telFixo);
        System.out.println(cel);
        System.out.println(email);
        System.out.println(rg);
        System.out.println(cpf);
        System.out.println(data);
        System.out.println(obs);
        System.out.println(numero);
        System.out.println(bairro);
        System.out.println(referencia);
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(int telFixo) {
        this.telFixo = telFixo;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
    
    
}
