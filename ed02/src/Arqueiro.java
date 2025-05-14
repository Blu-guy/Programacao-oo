public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 70, 25); // meio termo entre os 2
    }

    @Override
    public void defender(int dano) {
        // boa AC mas não diminue o dano
        super.defender(dano);
    }

    @Override
    public void usarHabilidadeEspecial() {
        // Chuva de Flechas: Realiza 3 ataques
        System.out.println(nome + " Chuva de Flechas liberadas !  3 ataques feitos .");
        for (int i = 0; i < 3; i++) {//realiza 3 ataques
            System.out.println("Ataque " + (i + 1) + ": Dano " + ataqueBase);
        }
    }
}