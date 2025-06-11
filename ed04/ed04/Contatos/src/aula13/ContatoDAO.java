package aula13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    public void salvar(Contato contato) throws IOException {
        // Manipulação de arquivos
        // Caminhos (Path)
        //  - Absoluto: informa o caminho do arquivo a partir
        //              da raiz do sistema
        //              /home/chaua/poo/teste.txt
        //              C:\Users\chaua\poo\teste.txt
        //
        //  - Relativo: informa o caminho do arquivo a partir
        //              do diretorio de execucao
        //              poo/teste.txt

        List<String> lista = new ArrayList<>();
        lista.add(contato.toCSV());

        // Excecoes!!!
        //a funcao write lanca IOExeption = exceção tratada
        //ou trata ou joga pra cima
        Files.write(Paths.get("contatos.txt"),
                lista,
                StandardOpenOption.APPEND);

    }

    public void salvar(List<Contato> contatos)throws IOException {
        List<String> lista = new ArrayList<>();
        for (Contato contato : contatos) {
            lista.add(contato.toCSV());
        }

        Files.write(Paths.get("contatos.txt"),
                lista,
                StandardOpenOption.APPEND);
    }

    Path arquivo = Paths.get("contatos.txt");
    if (!Files.exist(arquivo)){
        try {
            Files.createFile(arquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Contato> carregar() {

        return List.of();
    }


}