import java.io.*;
import java.util.*;

public class VisualizarAtividades {
    public static void main(String[] args) {
        // Carregue as atividades do arquivo JSON
        List<Atividade> atividades = carregarAtividades();

        // Exiba as atividades
        exibirAtividades(atividades);
    }

    public static List<Atividade> carregarAtividades() {
        List<Atividade> atividades = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("CadastrarAtividades.json");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Leia o arquivo JSON e converta-o em objetos de atividade
            StringBuilder jsonBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonBuilder.append(line);
            }

            // Implemente a lógica para converter o JSON de volta para objetos de atividade
            // ...

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Erro ao carregar atividades: " + e.getMessage());
        }

        return atividades;
    }

    public static void exibirAtividades(List<Atividade> atividades) {
        System.out.println("Atividades cadastradas no sistema:");

        for (Atividade atividade : atividades) {
            System.out.println("Nome da atividade: " + atividade.getNome());
            System.out.println("Descrição da atividade: " + atividade.getDescricao());
            System.out.println("Faixa etária indicada: " + atividade.getFaixaEtariaIndicada());
            System.out.println("Níveis de habilidade:");

            List<String> niveisHabilidade = atividade.getNiveisHabilidade();
            for (String nivel : niveisHabilidade) {
                System.out.println("- " + nivel);
            }

            System.out.println("Turmas disponíveis:");
            List<Turma> turmas = atividade.getTurmas();

            for (Turma turma : turmas) {
                System.out.println("Instrutor: " + turma.getInstrutor());
                System.out.println("Horários:");

                List<String> horarios = turma.getHorarios();
                for (String horario : horarios) {
                    System.out.println("- " + horario);
                }

                System.out.println("Dias da semana:");

                List<String> diasSemana = turma.getDiasSemana();
                for (String dia : diasSemana) {
                    System.out.println("- " + dia);
                }

                System.out.println();
            }

            System.out.println("---------------------------");
        }
    }
}
