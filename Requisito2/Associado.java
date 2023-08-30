import java.util.ArrayList;
import java.util.List;

class Associado extends Pessoa {
    private String carteirinhaAssociado;
    private List<Associado> dependentes;
    private List<Associado> atividadesEsportivas;
    private DadosPagamento dadosPagamento;

    public Associado(String nome, String rg, String cpf, String endereco, String telefone, String email, String carteirinhaAssociado) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.carteirinhaAssociado = carteirinhaAssociado;
        this.dependentes = new ArrayList<>();
        this.atividadesEsportivas = new ArrayList<>();
    }

    public void adicionarDependente(Associado dependente) {
        this.dependentes.add(dependente);
    }

    public void adicionarAtividadeEsportiva(Associado atividadeEsportiva) {
        this.atividadesEsportivas.add(atividadeEsportiva);
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

    public List<Associado> getAtividadesEsportivas() {
        return atividadesEsportivas;
    }

    public void setEndereco(String string) {
    }

    public String getRg() {
        return null;
    }

    public String getCpf() {
        return null;
    }

    public String getDescricaoAtividadeEsportiva() {
        return null;
    }

    public void setNome(String novoNome) {
    }

    public void setTelefone(String novoTelefone) {
    }

    public void setEmail(String novoEmail) {
    }
}
