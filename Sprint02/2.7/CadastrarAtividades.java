// Como funcionário, gostaria de ter a capacidade de cadastrar novas atividades no sistema
//  do clube recreativo, fornecendo informações como nome da atividade, descrição, 
// faixa etária indicada, níveis de habilidade, turmas e horários disponíveis incluindo
//  dias da semana e horários de início e término das aulas.

import java.io.*;
import java.util.*;

public class CadastrarAtividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.println("Digite o cargo do funcionário: ");
        String cargoFuncionario = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario, null, null, null, null, null, cargoFuncionario, 0.0);

        System.out.println("Digite o número de atividades que deseja cadastrar: ");
        int numAtividades = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        List<Atividade> atividades = new ArrayList<>();

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

        // Salvar as atividades em um arquivo JSON
        try {
            FileWriter fileWriter = new FileWriter("CadastrarAtividades.json");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
            // Construir uma representação JSON manualmente (incluindo nome do funcionário e cargo)
            bufferedWriter.write("{");
            bufferedWriter.write("\"nomeFuncionario\":\"" + funcionario.getNome() + "\",");
            bufferedWriter.write("\"cargoFuncionario\":\"" + funcionario.getCargo() + "\",");
            bufferedWriter.write("\"atividades\":[");
            for (int i = 0; i < atividades.size(); i++) {
                Atividade atividade = atividades.get(i);
                bufferedWriter.write("{");
                bufferedWriter.write("\"nome\":\"" + atividade.getNome() + "\",");
                bufferedWriter.write("\"descricao\":\"" + atividade.getDescricao() + "\",");
                bufferedWriter.write("\"faixaEtariaIndicada\":" + atividade.getFaixaEtariaIndicada() + ",");
                bufferedWriter.write("\"niveisHabilidade\":[");
                List<String> niveisHabilidade = atividade.getNiveisHabilidade();
                for (int j = 0; j < niveisHabilidade.size(); j++) {
                    bufferedWriter.write("\"" + niveisHabilidade.get(j) + "\"");
                    if (j < niveisHabilidade.size() - 1) {
                        bufferedWriter.write(",");
                    }
                }
                bufferedWriter.write("],");
                bufferedWriter.write("\"turmas\":[");
                List<Turma> turmas = atividade.getTurmas();
                for (int j = 0; j < turmas.size(); j++) {
                    Turma turma = turmas.get(j);
                    bufferedWriter.write("{");
                    bufferedWriter.write("\"atividade\":\"" + turma.getAtividade() + "\",");
                    bufferedWriter.write("\"instrutor\":\"" + turma.getInstrutor() + "\",");
                    bufferedWriter.write("\"horarios\":[");
                    List<String> horarios = turma.getHorarios();
                    for (int k = 0; k < horarios.size(); k++) {
                        bufferedWriter.write("\"" + horarios.get(k) + "\"");
                        if (k < horarios.size() - 1) {
                            bufferedWriter.write(",");
                        }
                    }
                    bufferedWriter.write("],");
                    bufferedWriter.write("\"diasSemana\":[");
                    List<String> diasSemana = turma.getDiasSemana();
                    for (int k = 0; k < diasSemana.size(); k++) {
                        bufferedWriter.write("\"" + diasSemana.get(k) + "\"");
                        if (k < diasSemana.size() - 1) {
                            bufferedWriter.write(",");
                        }
                    }
                    bufferedWriter.write("]}");
                    if (j < turmas.size() - 1) {
                        bufferedWriter.write(",");
                    }
                }
                bufferedWriter.write("]}");
                if (i < atividades.size() - 1) {
                    bufferedWriter.write(",");
                }
            }
            bufferedWriter.write("]}");
        
            bufferedWriter.close();
            System.out.println("Atividades cadastradas com sucesso e salvas em CadastrarAtividades.json.");
        
        } catch (IOException e) {
            System.err.println("Erro ao salvar atividades em CadastrarAtividades.json: " + e.getMessage());
        }
        
    }
}