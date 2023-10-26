import java.util.ArrayList;
import java.util.List;

class Associado extends Pessoa {
    private String carteirinhaAssociado;
    private List<Associado> dependentes;

    public Associado(String nome, String rg, String cpf, String endereco, String telefone, String email, String carteirinhaAssociado) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.carteirinhaAssociado = carteirinhaAssociado;
        this.dependentes = new ArrayList<>();
    }

    public void adicionarDependente(Associado dependente) {
        this.dependentes.add(dependente);
    }

    public String getCarteirinhaAssociado() {
        return carteirinhaAssociado;
    }

    public List<Associado> getDependentes() {
        return dependentes;
    }

}
