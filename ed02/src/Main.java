public class Main { //main fornecido pelo professor
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);//os tipos de conta diferente com dados
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200);//acoes que as contas vao realizar
        cp.sacar(100);
        cs.transferir(cc, 300);

        cc.aplicarJurosDiarios();// aplicacao de jurosde cada classe
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
