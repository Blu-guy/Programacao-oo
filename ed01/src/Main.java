
//O número de tentativas deve ser contabilizado.

// Um placar deve armazenar a pontuação de cada jogador.

//Deve ser possível cadastrar jogadores com nomes distintos.
// Aluno : João gabriel castro de oliveira
// POO , 3º periodo.

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Placar placar = new Placar();
        boolean continuar = true;

        while (continuar) {

        System.out.printf("\n digite o nome:");
        String nome = scanner.nextLine();

        Jogador jogador = new Jogador(nome);

       System.out.printf("jogador cadastrado:  " + jogador.getNome());
       boolean acerto = false;

       while(!acerto){
           System.out.println("digite um numero de 1 a 100: ");
           if (Jogo.jogar(scanner.nextInt())){
               System.out.println("Chutes: " +jogador.getTent());

               System.out.println("Pontuacao final: "+jogador.getPontos());
            placar.adicionarJogador(jogador);

            scanner.nextLine();
            acerto = true;
           }
       }
       System.out.println("Mais um jogo? (S/N) ");
       String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")){
                continuar = false;
            }
    }

    }
    scanner.close();
}