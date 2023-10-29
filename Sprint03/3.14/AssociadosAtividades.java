import java.util.*;

class Pessoa {
    protected String nome;
    protected String rg;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String rg, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}

class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String rg, String cpf, String endereco, String telefone, String email, String cargo, double salario) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}

class Atividade {
    private String nome;
    private String descricao;
    private int faixaEtariaIndicada;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;
    private List<Associado> associados;

    public Atividade(String nome, String descricao, int faixaEtariaIndicada) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtariaIndicada = faixaEtariaIndicada;
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

    public int getFaixaEtariaIndicada() {
        return faixaEtariaIndicada;
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

class Associado extends Pessoa { 
     public Associado(String nome, String rg, String cpf, String string, String string2, String string3, String string4) { 
         super(nome, rg, cpf, "", "", ""); 
     }

    public boolean isReceberNotificacoes() {
        return false;
    } 
}

public class AssociadosAtividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Atividade> atividades = new ArrayList<>();
        List<Associado> associados = new ArrayList<>();
        int opcao;
        
        // Solicite o nome, matrícula e senha do funcionário
        System.out.println("Digite o nome do funcionário:");
        String nomeFuncionario = scanner.nextLine();
        System.out.println("Digite a matrícula do funcionário:");
        String matricula = scanner.next();
        System.out.println("Digite a senha do funcionário:");
        String senha = scanner.next();

        // Verifique as credenciais do funcionário (adicione lógica apropriada aqui)

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar associado");
            System.out.println("2 - Adicionar associado a uma atividade");
            System.out.println("3 - Visualizar atividades cadastradas");
            System.out.println("4 - Visualizar onde o associado está cadastrado");
            System.out.println("5 - Adicionar nova atividade");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarAssociado(associados);
                    break;
                case 2:
                    adicionarAssociadoAtividade(atividades, associados);
                    break;
                case 3:
                    visualizarAtividadesCadastradas(atividades);
                    break;
                case 4:
                    visualizarAssociadoCadastrado(atividades);
                    break;
                case 5:
                    adicionarNovaAtividade(atividades);
                    break;
            }
        } while (opcao != 0);
    }

    public static void adicionarAssociado(List<Associado> associados) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o nome do associado:");
        String nome = scanner.nextLine(); // Use nextLine() para ler todo o nome, incluindo espaços em branco.
        System.out.println("Digite o RG do associado:");
        String rg = scanner.next();
        System.out.println("Digite o CPF do associado:");
        String cpf = scanner.next();
    
        Associado novoAssociado = new Associado(nome, rg, cpf, "", "", "", ""); // Preencha os campos em branco com valores padrão ou ajuste conforme necessário.
        associados.add(novoAssociado);
    
        System.out.println("Associado adicionado com sucesso.");
    }
    
    public static void adicionarAssociadoAtividade(List<Atividade> atividades, List<Associado> associados) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o nome do associado:");
        String nomeAssociado = scanner.next();
    
        Associado associado = encontrarAssociado(associados, nomeAssociado);
    
        if (associado == null) {
            System.out.println("Associado não encontrado.");
            return;
        }
    
        System.out.println("Escolha a atividade para adicionar o associado:");
        visualizarAtividadesCadastradas(atividades);
    
        int opcaoAtividade = scanner.nextInt();
    
        if (opcaoAtividade >= 0 && opcaoAtividade < atividades.size()) {
            Atividade atividadeSelecionada = atividades.get(opcaoAtividade);
            atividadeSelecionada.getAssociados().add(associado);
    
            System.out.println("Associado adicionado com sucesso à atividade.");
        } else {
            System.out.println("Atividade não encontrada.");
        }
    }
    

    public static void visualizarAtividadesCadastradas(List<Atividade> atividades) {
        System.out.println("Atividades cadastradas:");

        for (int i = 0; i < atividades.size(); i++) {
            System.out.println(i + " - " + atividades.get(i).getNome());
        }
    }

    public static void visualizarAssociadoCadastrado(List<Atividade> atividades) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o nome do associado:");
        String nomeAssociado = scanner.next();
    
        boolean associadoEncontrado = false;
    
        for (Atividade atividade : atividades) {
            for (Associado associado : atividade.getAssociados()) {
                if (associado.getNome().equals(nomeAssociado)) {
                    if (!associadoEncontrado) {
                        System.out.println("Associado " + nomeAssociado + " está cadastrado nas seguintes atividades:");
                        associadoEncontrado = true;
                    }
                    System.out.println("- " + atividade.getNome());
                }
            }
        }
    
        if (!associadoEncontrado) {
            System.out.println("Associado não encontrado em nenhuma atividade.");
        }
    }
    

    public static void adicionarNovaAtividade(List<Atividade> atividades) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da nova atividade:");
        String nomeAtividade = scanner.next();

        System.out.println("Digite a descrição da nova atividade:");
        String descricaoAtividade = scanner.next();

        System.out.println("Digite a faixa etária indicada para a nova atividade:");
        int faixaEtaria = scanner.nextInt();

        Atividade novaAtividade = new Atividade(nomeAtividade, descricaoAtividade, faixaEtaria);
        atividades.add(novaAtividade);

        System.out.println("Nova atividade adicionada com sucesso.");
    }

    public static Associado encontrarAssociado(List<Associado> associados, String nome) {
        for (Associado associado : associados) {
            if (associado.getNome().equals(nome)) {
                return associado;
            }
        }
        return null;
    }
}
