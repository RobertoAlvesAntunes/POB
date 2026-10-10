package questoes.atividades11.q3.controle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> frequencia = new HashMap<String, Integer>();

        System.out.println("Digite um texto:");
        String texto = sc.nextLine();

        texto = texto.toLowerCase();

        String[] palavras = texto.split("\\s+");

        for (int i = 0; i < palavras.length; i++) {
            String palavra = palavras[i];

            if (frequencia.containsKey(palavra)) {
                frequencia.put(palavra, frequencia.get(palavra) + 1);
            } else {
                frequencia.put(palavra, 1);
            }
        }

        System.out.println("\nFrequência das palavras:");

        for (Map.Entry<String, Integer> entrada : frequencia.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        sc.close();
    }
}