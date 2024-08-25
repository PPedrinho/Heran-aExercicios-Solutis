public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //construtores
    public Empregado(String nome, String numero, String endereco, int codigoSetor, double salarioBase, double imposto) {
        super(nome, numero, endereco);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(){
    }

    //get e set
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //metodos
    public double calcSalario(){
        return (salarioBase * (1 - (imposto/100)));
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Enderecço: " + getEndereco());
        System.out.println("Número: " + getNumero());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Imposto (%): " + getImposto());
        System.out.println("Salario: " + calcSalario());
    }
}
