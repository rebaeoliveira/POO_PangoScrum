import java.util.*;


class Atividade {
    private String nome;
    private String descricao;
    private String habilidade;
    

    private List<String> niveisHabilidade;
    private List<Turma> turmas;
    private List<Associado> associados;

    public Atividade(String nome, String descricao, String habilidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.habilidade = habilidade;
        this.niveisHabilidade = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.associados = new ArrayList<>(); // Inicialize a lista de associados.
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String gethabilidadeAtividade() {
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

     // Adicionado o método getAssociados()
     public List<Associado> getAssociados() {
         return associados; 
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



public class VisualizarAtividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Atividade> atividades = new ArrayList<>();
        int opcao;
        
    
        // Verifique as credenciais do funcionário (adicione lógica apropriada aqui)

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("3 - Visualizar atividades cadastradas");

            System.out.println("5 - Adicionar nova atividade");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 3:
                    visualizarAtividadesCadastradas(atividades);
                    break;
                case 5:
                    adicionarNovaAtividade(atividades);
                    break;
            }
        } while (opcao != 0);
    }


    public static void visualizarAtividadesCadastradas(List<Atividade> atividades) {
        System.out.println("Atividades cadastradas:");

        for (int i = 0; i < atividades.size(); i++) {
            System.out.println(i + " - " + atividades.get(i).getNome() + " - " + atividades.get(i).getDescricao() + " - " + atividades.get(i).gethabilidadeAtividade());
        }
    }
   

    public static void adicionarNovaAtividade(List<Atividade> atividades) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da nova atividade:");
        String nomeAtividade = scanner.next();

        System.out.println("Digite a descrição da nova atividade:");
        String descricaoAtividade = scanner.next();

        System.out.println("Digite a habilidade para a nova atividade:");
        String habilidade = scanner.next();


        Atividade novaAtividade = new Atividade(nomeAtividade, descricaoAtividade, habilidade);
        atividades.add(novaAtividade);



        System.out.println("Nova atividade adicionada com sucesso.");
    }

}
