public abstract class Conta {


    protected String cliente;
    protected double saldo;


    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;

    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {
            this.saldo += valor;
            return saldo;

    }
    public double sacar(double valor) {
        if (saldo < valor) { //verifica se existe saldo suficiente para o saque
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("saque realizado com sucesso!");

        }
        return saldo;
    }
    public void transferir(Conta destino, double valor) {
        if (saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Falha na Tranferência!");
        }
    }
    public abstract void imprimirExtrato();

    public abstract void aplicarJurosDiarios();


}
