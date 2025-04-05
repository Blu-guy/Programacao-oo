public class Main{
    public static void Main(String[] args) {
         Pessoa d1 = new Pessoa("João", 25);
        Pessoa d2 = new Pessoa("Ana", 30);

        d1.exibir();
        d2.exibir();
        System.out.printf("\n-----------\n");
        
        Livro l1 = new Livro();
        Livro l2 = new Livro("Don Quixote","Miguel de cervantes",1605);

        l1.exibir();
        l2.exibir();
        
        System.out.printf("\n-----------\n");
        
        Produto p1 = new Produto("Caderno");
        Produto p2 = new Produto("Mouse", 89.90, 10);

        p1.exibir();
        p2.exibir();
       
       System.out.printf("\n-----------\n");
       
        Conta c1 = new Conta("001", 500);
        Conta c2 = new Conta("002", -100); // saldo deve ser 0

        c1.exibir();
        c2.exibir();
        
    }
}
