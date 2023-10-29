import java.util.ArrayList;
import java.util.List;

class Associado extends Pessoa {
    private String carteirinhaAssociado;
    private List<Associado> dependentes;
    private DadosPagamento dadosPagamento;
    private boolean receberNotificacoes;

    public Associado(String nome, String rg, String cpf, String endereco, String telefone, String email, String carteirinhaAssociado) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.carteirinhaAssociado = carteirinhaAssociado;
        this.dependentes = new ArrayList<>();
        this.receberNotificacoes = true;
    }

    public void adicionarDependente(Associado dependente) {
        this.dependentes.add(dependente);
    }

    public String getCarteirinhaAssociado() {
        return carteirinhaAssociado;
    }

    public DadosPagamento getDadosPagamento() {
        return dadosPagamento;
    }

    public void setDadosPagamento(DadosPagamento dadosPagamento) {
        this.dadosPagamento = dadosPagamento;
    }

    public List<Associado> getDependentes() {
        return dependentes;
    }

    public boolean isReceberNotificacoes() {
        return receberNotificacoes;
    }

    public void setReceberNotificacoes(boolean receberNotificacoes) {
        this.receberNotificacoes = receberNotificacoes;
    }

}
