import java.util.Random;

public class Jogo {

    private Jogador jogador;
    private int numeroSecreto;



    public Jogo(Jogador jogador){
        this.jogador = jogador;

        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100)+1;
    }
    public boolean jogar(int tent) {
        jogador.addTent();
        if (tent < numeroSecreto) {
            System.out.println("Muito baixo, tente outra vez. ");
            return false;
        } else if (tent > numeroSecreto) {
            System.out.println("Grande demais, tente outra vez. ");
            return false;
        } else {
            int pontos = 100 - jogador.getTent() * 10;

            jogador.attPontos(pontos);

            jogador.attPontos(Math.max(pontos, 0));

            System.out.println("Resposta Certa!");
            return true;

        }
    }

    }

