public class Pessoa {
    private String nome;
    private String numero;
    private String endereco;

    //construtores
    public Pessoa(String nome, String numero, String endereco) {
        this.nome = nome;
        this.numero = numero;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public Pessoa (String nome){
        this.nome = nome;
    }

    public Pessoa(){

    } 

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() { 
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
