public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 100, 20); // mais vida que os outros (n foi pedido mas faz sentido)
    }

    @Override
    public void defender(int dano) {
        // metade do dano recebido
        super.defender(dano / 2);
    }

    @Override
    public void usarHabilidadeEspecial() {
        // Golpe Duplo eu ainda prefiro furia do 5e
        System.out.println(nome + " ataca com Golpe Duplo ! Dano: " + (ataqueBase * 2));
    }
}