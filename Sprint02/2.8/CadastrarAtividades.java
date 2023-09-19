import java.util.*;

public class CadastrarAtividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Atividade> atividades = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Atividades");
            System.out.println("2. Visualizar Atividades");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome completo do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();

                    System.out.println("Digite o cargo do funcionário: ");
                    String cargoFuncionario = scanner.nextLine();

                    System.out.println("Digite o número de atividades que deseja cadastrar: ");
                    int numAtividades = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    for (int i = 0; i < numAtividades; i++) {
                        System.out.println("Digite o nome da atividade: ");
                        String nome = scanner.nextLine();

                        System.out.println("Digite a descrição da atividade: ");
                        String descricao = scanner.nextLine();

                        System.out.println("Digite a faixa etária indicada: ");
                        int faixaEtaria = scanner.nextInt();
                        scanner.nextLine(); // Consumir a nova linha

                        Atividade atividade = new Atividade(nome, descricao, faixaEtaria);

                        System.out.println("Digite os níveis de habilidade (digite 'fim' para parar): ");
                        String nivelHabilidade;
                        while (!(nivelHabilidade = scanner.nextLine()).equalsIgnoreCase("fim")) {
                            atividade.adicionarNivelHabilidade(nivelHabilidade);
                        }

                        // Crie as turmas e horários disponíveis
                        System.out.println("Digite o número de turmas que deseja cadastrar: ");
                        int numTurmas = scanner.nextInt();
                        scanner.nextLine(); // Consumir a nova linha

                        for (int j = 0; j < numTurmas; j++) {
                            System.out.println("Digite o nome do instrutor da turma: ");
                            String instrutor = scanner.nextLine();

                            Turma turma = new Turma(nome, instrutor);

                            System.out.println("Digite os horários disponíveis (digite 'fim' para parar): ");
                            String horario;
                            while (!(horario = scanner.nextLine()).equalsIgnoreCase("fim")) {
                                turma.adicionarHorario(horario);
                            }

                            System.out.println("Digite os dias da semana (digite 'fim' para parar): ");
                            String diaSemana;
                            while (!(diaSemana = scanner.nextLine()).equalsIgnoreCase("fim")) {
                                turma.adicionarDiaSemana(diaSemana);
                            }

                            atividade.adicionarTurma(turma);
                        }

                        atividades.add(atividade);
                    }
                    break;
                case 2:
                    System.out.println("Atividades cadastradas:");

                    for (Atividade atividade : atividades) {
                        System.out.println("Nome da atividade: " + atividade.getNome());
                        System.out.println("Descrição: " + atividade.getDescricao());
                        System.out.println("Faixa Etária Indicada: " + atividade.getFaixaEtariaIndicada());
                        System.out.println("Níveis de Habilidade: " + atividade.getNiveisHabilidade());

                        System.out.println("Turmas:");

                        for (Turma turma : atividade.getTurmas()) {
                            System.out.println("Instrutor da Turma: " + turma.getInstrutor());
                            System.out.println("Horários Disponíveis: " + turma.getHorarios());
                            System.out.println("Dias da Semana: " + turma.getDiasSemana());
                        }

                        System.out.println(); // Adicione uma linha em branco para separar as atividades
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
