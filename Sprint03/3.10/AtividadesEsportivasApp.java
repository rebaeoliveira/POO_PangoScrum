import java.util.*;

class Atividade {
    private String nome;
    private String descricao;
    private List<Turma> turmas;

    public Atividade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.turmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}

class Turma {
    private String atividade;
    private String instrutor;
    private List<String> horarios;
    private List<String> diasSemana;

    public Turma(String atividade, String instrutor) {
        this.atividade = atividade;
        this.instrutor = instrutor;
        this.horarios = new ArrayList<>();
        this.diasSemana = new ArrayList<>();
    }

    public String getAtividade() {
        return atividade;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adicionarHorario(String horario) {
        this.horarios.add(horario);
    }

    public void adicionarDiaSemana(String diaSemana) {
        this.diasSemana.add(diaSemana);
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public List<String> getDiasSemana() {
        return diasSemana;
    }
}

public class AtividadesEsportivasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Atividade> atividades = new ArrayList<>();

        System.out.println("Digite o nome da atividade:");
        String nomeAtividade = scanner.nextLine();

        System.out.println("Digite a descrição da atividade:");
        String descricaoAtividade = scanner.nextLine();

        Atividade atividade = new Atividade(nomeAtividade, descricaoAtividade);

        System.out.println("Digite o nome do instrutor da turma:");
        String instrutor = scanner.nextLine();

        Turma turma = new Turma(nomeAtividade, instrutor);

        System.out.println("Digite os horários disponíveis (digite 'fim' para parar):");
        String horario;
        while (!(horario = scanner.nextLine()).equalsIgnoreCase("fim")) {
            turma.adicionarHorario(horario);
        }

        System.out.println("Digite os dias da semana (digite 'fim' para parar):");
        String diaSemana;
        while (!(diaSemana = scanner.nextLine()).equalsIgnoreCase("fim")) {
            turma.adicionarDiaSemana(diaSemana);
        }

        atividade.adicionarTurma(turma);
        atividades.add(atividade);

        System.out.println("Nova turma adicionada com sucesso.");
    }
}
