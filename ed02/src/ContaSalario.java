//subclasse conta salario

public class ContaSalario extends Conta { //heranca sendo extendida

    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo); 
    }

    @Override
    public void aplicarJurosDiarios(){
        // contas salarios não tem juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Salário: ");
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("-----------------------------------------");
    }
}
