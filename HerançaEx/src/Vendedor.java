public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    //construtores
    public Vendedor(String nome, String numero, String endereco, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, numero, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(){
    }

    //get e set
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    //metodos
    public double calcSalarioVend(){
        return (super.calcSalario() + (valorVendas * (comissao/100)));
    }

    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Numero: " + getNumero());
        System.out.println("Setor: " + getCodigoSetor());
        System.out.println("Salario Base: " + getSalarioBase());
        System.out.println("Imposto (%): " + getImposto());
        System.out.println("Valor Vendas: " + getValorVendas());
        System.out.println("Comissão: " + getComissao());
        System.out.println("Salario vendedor: " + calcSalarioVend());
    }
}
