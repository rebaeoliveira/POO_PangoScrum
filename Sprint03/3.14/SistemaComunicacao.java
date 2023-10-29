import java.util.List;

// Classe criada com objetivo de gerenciar a comunicação com os associados
public class SistemaComunicacao {
    private List<Associado> associados;

    // Construtor para receber a lista de associados
    public SistemaComunicacao(List<Associado> associados) {
        this.associados = associados;
    }

    // Método para enviar notificações
    public void enviarNotificacoes(String mensagem, boolean enviarNotificacaoNovaAtividade) {
        for (Associado associado : associados) {
            // Verifica se a notificação deve ser enviada apenas quando houver nova atividade esportiva
            if (enviarNotificacaoNovaAtividade && !associado.isReceberNotificacoes()) {
                continue; // Ignora associados que não desejam receber notificações
            }

            // Chamando o método para enviar a notificação ao associado
            enviarNotificacao(associado, mensagem);
        }
    }

    // Método para enviar a notificação
    private void enviarNotificacao(Associado associado, String mensagem) {
        // Código fictício para envio de notificação por e-mail
        System.out.println("Enviando e-mail para " + associado.getEmail() + ": " + mensagem);
        System.out.println("E-mail enviado com sucesso.");
    }
}
