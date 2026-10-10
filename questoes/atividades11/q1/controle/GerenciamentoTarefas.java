package controle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GerenciamentoTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            tarefas.add(sc.nextLine());
        }

        System.out.println("\nTarefas cadastradas:");
        System.out.println(tarefas);

        System.out.print("\nDigite o nome da tarefa que deseja remover: ");
        String tarefaRemover = sc.nextLine();

        if (tarefas.contains(tarefaRemover)) {
            tarefas.remove(tarefaRemover);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }

        System.out.print("\nDigite uma tarefa para verificar se existe: ");
        String tarefaBuscar = sc.nextLine();

        if (tarefas.contains(tarefaBuscar)) {
            System.out.println("A tarefa existe na lista.");
        } else {
            System.out.println("A tarefa não existe na lista.");
        }

        Collections.sort(tarefas);

        System.out.println("\nTarefas em ordem alfabética:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(tarefas.get(i));
        }

        sc.close();
    }
}