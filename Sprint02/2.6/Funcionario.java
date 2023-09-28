import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private List<String> historicoEmpregos;
    private List<String> treinamentosConcluidos;
    private List<String> feedbacks;

    public Funcionario(String nome, String rg, String cpf, String endereco, String telefone, String email,
                       String cargo, double salario) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
        this.historicoEmpregos = new ArrayList<>();
        this.treinamentosConcluidos = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public List<String> getHistoricoEmpregos() {
        return historicoEmpregos;
    }

    public void adicionarHistoricoEmprego(String historico) {
        historicoEmpregos.add(historico);
    }

    public List<String> getTreinamentosConcluidos() {
        return treinamentosConcluidos;
    }

    public void adicionarTreinamentoConcluido(String treinamento) {
        treinamentosConcluidos.add(treinamento);
    }

    public List<String> getFeedbacks() {
        return feedbacks;
    }

    public void adicionarFeedback(String feedback) {
        feedbacks.add(feedback);
    }
}