package questoes.atividades06.q1;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}