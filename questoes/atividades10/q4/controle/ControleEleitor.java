package questoes.atividades10.q4.controle;

import questoes.atividades10.q4.domínio.Eleitor;
import questoes.atividades10.q4.domínio.IdadeInvalidaException;

public class ControleEleitor {

    public static void main(String[] args) {

        Eleitor eleitor = new Eleitor();

        try {
            eleitor.cadastrar("João", 30);
            eleitor.cadastrar("Maria", 150);
            eleitor.cadastrar("Carlos", 25);

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}