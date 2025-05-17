public abstract class Conta {//para possuir metodos abstratos a classe deve ser abstrata


    protected String cliente;//protected so aqueles que se extendem delas vão ter acesso a ela
    protected double saldo;


    public Conta(String cliente, double saldo) {
        this.cliente = cliente;//declaracao dos dados
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
            saldo -= valor;//informa o sucesso do saque
            System.out.println("saque realizado com sucesso!");

        }
        return saldo;
    }
    public void transferir(Conta destino, double valor) {
        if (saldo >= valor){//verifica o saldo e informa se a tranferencia falhar
            this.saldo -= valor;
            destino.depositar(valor);
        } else {
            System.out.println("Falha na Tranferência!");
        }
    }
    public abstract void imprimirExtrato();//metodos abstratos para serem usados pelas classes filhas

    public abstract void aplicarJurosDiarios();


}
