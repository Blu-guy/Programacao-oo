// subclasse conta corrente

public class ContaCorrente extends Conta {//heranca sendo extendida 

    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override //override usado pois a classe filha age diferente da classe pai
    public void aplicarJurosDiarios(){
        saldo += saldo * 0.001; //0,1% de juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------");
    }
}
