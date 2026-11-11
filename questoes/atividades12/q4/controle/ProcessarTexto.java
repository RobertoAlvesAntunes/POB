package questoes.atividades12.q4.controle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import questoes.atividades12.q4.dominio.TransformadorTexto;

public class ProcessarTexto {

    public static List<String> processarLista(List<String> lista, TransformadorTexto regra) {
        return lista.stream()
                .map(regra::transformar)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> textos = Arrays.asList("Java", "Streams", "Lambda", "Programação");

        List<String> invertidos = processarLista(textos,
                texto -> new StringBuilder(texto).reverse().toString());

        System.out.println("Textos invertidos: " + invertidos);

        List<String> colchetes = processarLista(textos,
                texto -> "[" + texto + "]");

        System.out.println("Textos entre colchetes: " + colchetes);

        List<String> maiusculos = processarLista(textos,
                String::toUpperCase);

        System.out.println("Textos em maiúsculas: " + maiusculos);
    }
}