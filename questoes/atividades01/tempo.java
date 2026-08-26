package questoes.atividades01;

import java.util.Scanner;

public class tempo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite os segundos: ");
        int segundos = sc.nextInt();

        int hora = segundos / 3600;

        segundos = segundos % 3600;

        int minutos = segundos / 60;

        segundos = segundos % 60;

        System.out.println(hora + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)");

        sc.close();
    }
}