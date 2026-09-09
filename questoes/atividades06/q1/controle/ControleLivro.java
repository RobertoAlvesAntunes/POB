package questoes.atividades06.q1.controle;

import questoes.atividades06.q1.domínio.Livro;

public class ControleLivro {
    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 310);

        System.out.println("Dados do primeiro livro:");
        livro1.exibirInformacoes();

        System.out.println();

        System.out.println("Dados do segundo livro:");
        livro2.exibirInformacoes();
    }
}