public class Produto{
    
    private String nome;
    private double preco;
    private int quantidade;
    
    
    
    //construtor 
    
    
      public Produto(String nome){
        
        this.nome = nome;
        this.preco = 0;
        this.quantidade = 0;
        
        //ou this(nome,0.0,0); faz o mesmo com menos linhas 
    }
    
    public Produto(String nome,double preco ,int quantidade){
        
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
    
    public void exibir(){
        
       System.out.printf("nome: %s\n", nome);
       
        System.out.printf("preco: %.2f\n", preco);
        
         System.out.printf("quantidade em estoque: %d\n", quantidade);
        
    }
    
    
    
}