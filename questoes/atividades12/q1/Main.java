package questoes.atividades12.q1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("ana", "carlos", "beatriz", "antonio", "amanda", "bernardo");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.toLowerCase().startsWith("a"))
                .map(nome -> nome.toUpperCase())
                .sorted()
                .toList();

        System.out.println(resultado);
    }
}