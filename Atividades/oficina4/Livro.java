public class Livro{
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
    
    //construtor 
    
     public Livro(){
        
       this.titulo = "Titulo não definido";
        this.autor = "autor desconhecido";
        this.anoPublicacao = 0;
     }
    
    public Livro(String titulo,String autor ,int anoPublicacao){
        
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        
    }
    
    public void exibir(){
        
       System.out.printf("titulo: %s\n", titulo);
       
        System.out.printf("autor: %s\n", autor);
        
         System.out.printf("ano de publicacao: %d\n", anoPublicacao);
        
    }
    
    
    
}