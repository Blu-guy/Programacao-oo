// subclasse poupanca
public class ContaPoupanca extends Conta {// heranca da conta poupanca

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);//chamada de metodo de default da classe pai
    }

    @Override
    public void aplicarJurosDiarios(){
        saldo += saldo * 0.0008; // 0,08% de juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Poupança: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------");
    }
}
