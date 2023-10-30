import java.util.ArrayList;
import java.util.List;

class Associado extends Pessoa {
    private List<Associado> dependentes;
    private List<Consumo> consumos;

    public Associado(String nome, String rg, String cpf, String endereco, String telefone, String email, String carteirinhaAssociado) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.dependentes = new ArrayList<>();
        this.consumos = new ArrayList<>();
    }

    public void adicionarDependente(Associado dependente) {
        this.dependentes.add(dependente);
    }

    public void registrarConsumo(double valor) {
        Consumo consumo = new Consumo(valor);
        this.consumos.add(consumo);
    }

    public List<Consumo> getConsumos() {
        return consumos;
    }
}