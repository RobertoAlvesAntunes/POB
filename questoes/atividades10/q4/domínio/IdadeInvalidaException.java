package questoes.atividades10.q4.domínio;

public class IdadeInvalidaException extends RuntimeException {

    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}