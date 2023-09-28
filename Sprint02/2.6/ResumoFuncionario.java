import java.util.ArrayList;
import java.util.List; 



public class ResumoFuncionario {
    private List<Funcionario> funcionarios;

    public ResumoFuncionario() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void visualizarResumoFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());

        System.out.println("Histórico de Empregos Anteriores:");
        for (String historico : funcionario.getHistoricoEmpregos()) {
            System.out.println("- " + historico);
        }

        System.out.println("Treinamentos Concluídos:");
        for (String treinamento : funcionario.getTreinamentosConcluidos()) {
            System.out.println("- " + treinamento);
        }

        System.out.println("Feedbacks Recebidos:");
        for (String feedback : funcionario.getFeedbacks()) {
            System.out.println("- " + feedback);
        }
    }

    public static void main(String[] args) {
        ResumoFuncionario gerenteRH = new ResumoFuncionario();

        Funcionario funcionario1 = new Funcionario("João", "12345", "123456789", "Endereço 1", "123-456-7890",
                "joao@email.com", "Analista", 5000.0);
        funcionario1.adicionarHistoricoEmprego("Analista na Empresa A");
        funcionario1.adicionarTreinamentoConcluido("Treinamento de Vendas");
        funcionario1.adicionarFeedback("Ótimo trabalho!");

        gerenteRH.adicionarFuncionario(funcionario1);

        gerenteRH.visualizarResumoFuncionario(funcionario1);
    }
}
