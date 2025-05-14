public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 40, 45); // menos hp mas mais dano q os outros
    }

    @Override
    public void defender(int dano) {
        // sem redução de dano
        super.defender(dano);
    }

    @Override
    public void usarHabilidadeEspecial() {
        //  FIREBALL 8d6 dano de fogo
        System.out.println(nome + "  Bola de Fogo lançada! Dano: " + (ataqueBase * 3));
    }
}
