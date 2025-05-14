
import java.util.ArrayList;


public class Placar {

    private ArrayList<Jogador> ranking;

    public  Placar(){
        this.ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        ranking.add(jogador);

    }
public void mostrarRanking(){
        System.out.println("PLAYERS RANKING");
        for (Jogador jogador : ranking) {
           System.out.println(jogador.getNome() + " " + jogador.getPontos() + " Score");

        }
    }
}
