public  class Jogador {

    private String nome;
    private int pontos;
    private int tent;

    public Jogador(String nome  ){

        this.nome =nome;
        this.pontos = 0;
        this.tent =0;
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPontos(){
        return pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

    public int getTent(){
        return tent;
    }
    public void setTent(int tent){
        this.tent = tent;
    }


    public void addTent(){
        this.tent++;
    }

    public  void attPontos(int valor){
        this.pontos+= valor;
    }

}