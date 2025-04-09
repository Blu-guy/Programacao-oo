public class Conta{
    
    private String numero;
    private double saldoinicial;
  
    
    
    //construtor 
    
    
   
    public Conta(String numero,double saldoinicial ){
        
        this.numero = numero;
        this.saldoinicial = saldoinicial;
        
    }
    
    
    public void exibir(){
        
       System.out.printf("numero: %s\n", numero);
       
        System.out.printf("saldo: %.2f\n", saldoinicial);
        
         
        
    }
    
    
    
}
