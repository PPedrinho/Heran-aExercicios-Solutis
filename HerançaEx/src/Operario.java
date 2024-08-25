public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    //construtores
    public Operario(String nome, String numero, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, numero, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(){
    }

    //get e set
    public double getValorProducao() {
        return valorProducao;
    }   

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    //metodos
    public double calcSalarioOp(){
        return (super.calcSalario() + (valorProducao * (comissao/100)));
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Numero: " + getNumero());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Imposto (%): " + getImposto());
        System.out.println("Valor Produção: " + getValorProducao());
        System.out.println("Comissão: " + getComissao());
        System.out.println("Salario operário: " + calcSalarioOp());
    }
}
