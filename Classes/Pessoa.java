import java.util.ArrayList;
import java.util.List;

// Superclasse Pessoa

public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    public Pessoa(String nome, String rg, String cpf,String endereco, String telefone, String email) {
        this.nome = nome;
        this.nome = rg;
        this.nome = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}

// Subclasses de Pessoa

class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, String salario, String endereco, String telefone, String email, String cargo, double salario) {
        super(nome, cargo, salario, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }


class Associado extends Pessoa {
    private String carteirinhaassocido;
    private List<Associado> dependentes;
    

    public Associado(String nome, String carteirinhaassocido, String endereco, String telefone, String email, String carteirinhaassocido) {
        super(nome, carteirinhaassocido, endereco, telefone, email);
        this.carteirinhaassocido = carteirinhaassocido;
        this.dependentes = new ArrayList<>();
       
    }

    public void adicionarDependente(Associado dependente) {
        this.dependentes.add(dependente);
    }
}
}

class Gerente extends Funcionario {
    public Gerente(String nome, String endereco, String telefone, String email, double salario) {
        super(nome, endereco, telefone, email, "Gerente", salario);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        // método para cadastrar um novo funcionário no sistema
    }

    public void definirPermissoes(Funcionario funcionario) {
        // método para definir as permissões de acesso de um funcionário
    }
}

// Superclasse Atividade
class Atividade {
    private String nome;
    private String descricao;
    private int faixaEtariaIndicada;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;
    private List<String> horariosdisponives;


    public Atividade(String nome, String descricao, int faixaEtariaIndicada) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtariaIndicada = faixaEtariaIndicada;
        this.niveisHabilidade = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.horariosdisponives = new ArrayList<>();
    }

    public void adicionarNivelHabilidade(String nivelHabilidade) {
        this.niveisHabilidade.add(nivelHabilidade);
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void adicionarHoraDisponivel(String horaDisponivel) {
        this.horariosdisponives.add(horaDisponivel);
    }
}


// Subclasses de Atividade

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

    public void adicionarHorario(String horario) {
        this.horarios.add(horario);
    }

    public void adicionarDiaSemana(String diaSemana) {
        this.diasSemana.add(diaSemana);
    }
}

class DadosPagamento {
  // Falta implementar dados da classe DadosPagamento
}

class Matricula {
  // Falta implementar dados da classe Matricula
}

