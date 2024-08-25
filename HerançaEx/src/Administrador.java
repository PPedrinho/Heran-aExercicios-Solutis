public class Administrador extends Empregado {
    private double ajudaCusto;

    //construtores
    public Administrador(String nome, String numero, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaCusto) {
        super(nome, numero, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaCusto = ajudaCusto;
    }

    public Administrador(){
    }

    //get e set
    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    //metodos
    public double calcSalarioAdm(){
        return (super.calcSalario() + ajudaCusto);
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Numero: " + getNumero());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Imposto (%): " + getImposto());
        System.out.println("Ajuda Custo: " + getAjudaCusto());
        System.out.println("Salario administrador: " + calcSalarioAdm());
    }
}
