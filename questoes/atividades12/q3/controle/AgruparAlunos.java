package questoes.atividades12.q3.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import questoes.atividades12.q3.dominio.Aluno;

public class AgruparAlunos {
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("Ana", "Sistemas de Informação", 9.0));
        alunos.add(new Aluno("Carlos", "Engenharia", 6.5));
        alunos.add(new Aluno("Beatriz", "Sistemas de Informação", 8.0));
        alunos.add(new Aluno("Pedro", "Engenharia", 5.0));
        alunos.add(new Aluno("Mariana", "Administração", 7.5));
        alunos.add(new Aluno("João", "Administração", 6.0));
        alunos.add(new Aluno("Lucas", "Sistemas de Informação", 7.0));

        Map<String, List<Aluno>> cursos = alunos.stream()
                .collect(Collectors.groupingBy(aluno -> aluno.getCurso()));

        System.out.println("ALUNOS AGRUPADOS POR CURSO:");

        for (Map.Entry<String, List<Aluno>> entrada : cursos.entrySet()) {

            System.out.println("\nCurso: " + entrada.getKey());

            List<Aluno> listaAlunos = entrada.getValue();

            for (int i = 0; i < listaAlunos.size(); i++) {
                Aluno aluno = listaAlunos.get(i);

                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Nota: " + aluno.getNotaFinal());
            }
        }

        Map<Boolean, List<Aluno>> resultado = alunos.stream()
                .collect(Collectors.partitioningBy(aluno -> aluno.getNotaFinal() > 7.0));

        System.out.println("\nALUNOS APROVADOS:");

        List<Aluno> aprovados = resultado.get(true);

        for (int i = 0; i < aprovados.size(); i++) {
            Aluno aluno = aprovados.get(i);

            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota: " + aluno.getNotaFinal());
        }

        System.out.println("\nALUNOS REPROVADOS:");

        List<Aluno> reprovados = resultado.get(false);

        for (int i = 0; i < reprovados.size(); i++) {
            Aluno aluno = reprovados.get(i);

            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota: " + aluno.getNotaFinal());
        }
    }
}