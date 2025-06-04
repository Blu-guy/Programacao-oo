package GraficaOnline;
/*
 implementação da interface:
    - Classe GraficoEstatistico com os atributos:
        - titulo (String)
        - tipoGrafico (String)
        - imprimir()
*/

// - Criando  GraficoEstatistico
public class GraficoEstatistico implements Imprimivel {


    // - Atributos
    private String titulo;
    private String tipoGrafico;


    // - Construtor  - inicializa título e tipo
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    // - Implementação do  imprimir
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase());
        System.out.println("Título: " + titulo.toUpperCase());
        System.out.println();
    }
}