
public class Pessoa{

    private String nome;
    private int idade;



    //construtor 

    public Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    public void exibir(){

        System.out.printf("nome: %s\n", nome);

        System.out.printf("idade: %d\n", idade);

    }



}
