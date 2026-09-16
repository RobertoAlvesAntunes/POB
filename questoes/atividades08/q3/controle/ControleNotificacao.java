package questoes.atividades08.q3.controle;

import questoes.atividades08.q3.domínio.EmailNotificacao;
import questoes.atividades08.q3.domínio.Notificacao;
import questoes.atividades08.q3.domínio.PushNotificacao;
import questoes.atividades08.q3.domínio.SmsNotificacao;

public class ControleNotificacao {

    public static void main(String[] args) {

        Notificacao email = new EmailNotificacao("joao@email.com");
        Notificacao sms = new SmsNotificacao("21999999999");
        Notificacao push = new PushNotificacao("Dispositivo123");

        processarEnvio(email, "Olá, João!");
        processarEnvio(sms, "Sua mensagem chegou.");
        processarEnvio(push, "Você recebeu uma nova notificação.");
    }

    public static void processarEnvio(Notificacao notificacao, String texto) {
        notificacao.enviar(texto);
    }
}