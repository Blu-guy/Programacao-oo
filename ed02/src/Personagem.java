public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome,int hp, int ataqueBase){
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
}
    public void atacar(Personagem inimigo) {
        inimigo.defender(this.ataqueBase);
    }

    public void defender(int dano) {
        this.hp -= dano;
}

    public void usarHabilidadeEspecial() {
        System.out.println(nome + " habilidade especial liberada!");
    }

    public void status() {
        System.out.println(nome + "-HP:" + hp + ", Ataque Base: " + ataqueBase);
    }
}


