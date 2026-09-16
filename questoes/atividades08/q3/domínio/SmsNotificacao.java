package questoes.atividades08.q3.domínio;

public class SmsNotificacao extends Notificacao {

    public SmsNotificacao(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para o número " + getDestinatario() + ": " + mensagem);
    }
}