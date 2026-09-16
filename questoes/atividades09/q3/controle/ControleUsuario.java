package questoes.atividades09.q3.controle;

import questoes.atividades09.q3.domínio.Administrador;
import questoes.atividades09.q3.domínio.Usuario;

public class ControleUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("joao", "1234");

        Administrador administrador = new Administrador("admin", "abcd", 1);

        System.out.println("Usuário:");
        System.out.println("Autenticado: " + usuario.autenticar("1234"));

        System.out.println();

        System.out.println("Administrador:");
        System.out.println("Autenticado: " + administrador.autenticar("abcd"));
        System.out.println(administrador.exportarJSON());
    }
}