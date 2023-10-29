import java.util.*;

class Atividade {
    private String nome;
    private String descricao;
    private String habilidade;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;

    public Atividade(String nome, String descricao, String habilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.habilidade = habilidade;
        this.niveisHabilidade = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void adicionarNivelHabilidade(String nivelHabilidade) {
        this.niveisHabilidade.add(nivelHabilidade);
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public List<String> getNiveisHabilidade() {
        return niveisHabilidade;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}

class Turma {
    private String instrutor;
    private List<String> horarios;
    private List<String> diasSemana;

    public Turma(String instrutor) {
        this.instrutor = instrutor;
        this.horarios = new ArrayList<>();
        this.diasSemana = new ArrayList<>();
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

public class VisualizarAtividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Atividade> atividades = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("3 - Visualizar atividades cadastradas");
            System.out.println("5 - Adicionar nova atividade");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 3:
                    visualizarAtividadesCadastradas(atividades);
                    break;
                case 5:
                    adicionarNovaAtividade(atividades);
                    break;
            }
        } while (opcao != 0);

        scanner.close(); // Fechando o Scanner ao sair do programa
    }

    public static void visualizarAtividadesCadastradas(List<Atividade> atividades) {
        System.out.println("Atividades esportivas cadastradas:");

        for (Atividade atividade : atividades) {
            System.out.println("Nome da Atividade: " + atividade.getNome());
            System.out.println("Descrição: " + atividade.getDescricao());
            System.out.println("Habilidade: " + atividade.getHabilidade());

            List<Turma> turmas = atividade.getTurmas();
            System.out.println("Turmas Disponíveis:");

            for (Turma turma : turmas) {
                System.out.println("Instrutor: " + turma.getInstrutor());
                System.out.println("Horários: " + turma.getHorarios());
                System.out.println("Dias da Semana: " + turma.getDiasSemana());
                System.out.println("Níveis de Habilidade: " + atividade.getNiveisHabilidade());
                System.out.println();
            }

            System.out.println();
        }
    }

    public static void adicionarNovaAtividade(List<Atividade> atividades) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da nova atividade esportiva:");
        String nomeAtividade = scanner.nextLine();

        System.out.println("Digite a descrição da nova atividade:");
        String descricaoAtividade = scanner.nextLine();

        System.out.println("Digite a habilidade necessária para a nova atividade:");
        String habilidade = scanner.nextLine();

        Atividade novaAtividade = new Atividade(nomeAtividade, descricaoAtividade, habilidade);
        atividades.add(novaAtividade);

        System.out.println("Nova atividade esportiva adicionada com sucesso.");

        scanner.close(); // Fechando o Scanner após a entrada de dados
    }
}
