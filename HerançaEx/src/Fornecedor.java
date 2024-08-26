public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDebito;

    //construtor
    public Fornecedor(String nome, String numero, String endereco, double valorCredito, double valorDebito) {
        super(nome, numero, endereco);
        this.valorCredito = valorCredito;
        this.valorDebito = valorDebito;
    }

    //get e set
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDebito() {
        return valorDebito;
    }

    public void setValorDebito(double valorDebito){
        this.valorDebito = valorDebito;
    }

    //metodos
    public double obterSaldo(){
        return valorCredito - valorDebito;
    }

    @Override
    public void imprime(){
        System.out.println("Nome: " + getNome());
        System.out.println("EnderecÇo: " + getEndereco());
        System.out.println("NuÚmero: " + getNumero());
        System.out.println("Valor de Credito: " + getValorCredito());
        System.out.println("Valor de Debito: " + getValorDebito());
        System.out.println("Saldo: " + obterSaldo());
    }

}
