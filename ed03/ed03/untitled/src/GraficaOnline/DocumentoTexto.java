package GraficaOnline;

/*
 Implementando  a classe DocumentoTexto
    - titulo
    - conteudo

*/

// - Criando a classe DocumentoTexto
public class DocumentoTexto implements Imprimivel { // -  implementa a interface" Imprimivel"
    // - implementar os métodos definidos lá

    // - Atributos
    private String titulo;    // - são private pq não precisa de herança aqui
    private String conteudo; // -  interface sem atributos


    // - Construtor  inicializa valores/dados
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    // - Metodo da interface Imprimivel
    @Override // - Sobrescrita de métodos
    public void imprimir() {
        System.out.println(titulo.toUpperCase()); // - Exibe o título em letras maiúsculas
        System.out.println(conteudo); // - Conteúdo do texto
        System.out.println(); // - Linha usada para separar os dados
    }
}