package GraficaOnline;

/* - Gráfica Online:
 - Modelar um sistema que permita a impressão de diversos tipos de conteúdo digital
 - (documentos, imagens, gráficos, relatórios)
 - Cada tipo possui uma lógica de apresentação própria.
 - Para isso, será utilizada uma interface Imprimivel com um método comum,
 - a ser sobrescrito por todas as classes.

 Criar uma interface chamada Imprimivel:

*/

// - Interface Imprimivel- Qualquer classe que implementar essa interface deve fornecer uma implementação do método imprimir()
// - Garante que várias classes diferentes tenham métodos com o mesmo nome e propósito.
public interface Imprimivel {
    void imprimir(); // - Método obrigatório para qualquer classe que queira ser "imprimível"
}