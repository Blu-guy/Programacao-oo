package aula13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ContatoController {
    private static ContatoView view = new ContatoView();
    public void executar() throws IOException {
        // Cria uma lista de contatos
        List<Contato> contatos = new ArrayList<>();

        // Cria a nossa view responsável pela tela



        ContatoDAO dao = new ContatoDAO();

        boolean saida = false;
        do {

            // Exibe o menu de opções
            view.exibirMenu();

            // Usuário escolhe a opção
            int opt = view.lerOpcao();

            switch (opt) {
                // Se opção 1 -> exibe a tela de listar
                case 1:
                    view.exibirListarContatos(contatos);
                    break;

                // Se opção 2 -> exibe a tela de adicionar
                case 2:
                    adicionarPessoaFisica(contatos,dao);
                    break;

                // Se opção 3 -> exibe a tela de adicionar
                case 3:
                    adicionarPessoaJuridica(contatos);

                    break;

                // Se opção 4 -> exibe a tela de remover
                case 4:
                    //view.exibirRemover();
                    break;

                // Se opção 5 -> termina o programa
                case 5:
                    saida = true;
                    break;

                // Senão erro
                default:
                    //view.exibirMensagemErro();
            }

        } while (!saida);
    }

    private void adicionarPessoaJuridica(List<Contato> contatos) {
    }

    private static void adicionarPessoaFisica(List<Contato> contatos, ContatoDAO dao) throws IOException {
       try {
           Contato contatoPF = view.exibirAdicionarPessoaFisica();
           contatos.add(contatoPF);

           ContatoDAO dao = new ContatoDAO();
           dao.salvar(contatoPF);
       }
       catch (IOException ex){
           view.exibirMensagemDeErro("erro ao abrir o arquivo");
       }
    }

}