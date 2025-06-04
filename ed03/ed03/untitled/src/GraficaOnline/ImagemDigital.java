package GraficaOnline;

/*
implementacao ImagemDigital
    - nomeArquivo
    - resolucao

*/

// - Criando  ImagemDigital
public class ImagemDigital implements Imprimivel { // - implementa a interface chamada Imprimivel


    // - Atributos
    private String nomeArquivo; // - Com o uso de interfaces, não há herança de atributos
    private String resolucao; // - por isso private é usado


    // - Construtor
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    // - Método imprimir - Implementação interface Imprimivel
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo); // - Exibe o nome do arquivo
        System.out.println("Resolução: " + resolucao); // - Exibe a "resolução" da imagem
        System.out.println();
    }
}
