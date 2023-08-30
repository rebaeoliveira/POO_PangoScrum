import java.util.*;

class Gerente extends Funcionario {
    public Gerente(String nome, String rg, String cpf, String endereco, String telefone, String email, double salario) {
        super(nome, rg, cpf, endereco, telefone, email, "Gerente", salario);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        // Lógica para cadastrar um novo funcionário no sistema
        System.out.println("Sistema de Cadastro");
        System.out.println(" Funcionário cadastrado: \n "  + "Nome: "    + funcionario.getNome()  + 
                        "\nEndereÇo: " + funcionario.getEndereco() + "\n Email:  " + funcionario.getEmail() + "\n Telefone: " + funcionario.getTelefone() + "\n Cargo:  " + funcionario.getCargo() + " \nSalario: " + funcionario.getSalario());
        
    }

    public void definirPermissoes(Funcionario funcionario) {
        // Lógica para definir as permissões de acesso de um funcionário
        System.out.println("Permissões definidas para: " + funcionario.getNome());
    }
}
class Atividade {
    private String nome;
    private String descricao;
    private int faixaEtariaIndicada;
    private List<String> niveisHabilidade;
    private List<Turma> turmas;
    private List<String> horariosDisponiveis;

    public Atividade(String nome, String descricao, int faixaEtariaIndicada) {
        this.nome = nome;
        this.descricao = descricao;
        this.faixaEtariaIndicada = faixaEtariaIndicada;
        this.niveisHabilidade = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.horariosDisponiveis = new ArrayList<>();
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

    public void adicionarHorarioDisponivel(String horarioDisponivel) {
        this.horariosDisponiveis.add(horarioDisponivel);
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
}

class DadosPagamento {
    private String metodo;
    private String numero;
    private String tipoCartao; // Para armazenar "credito", "debito" ou "dinheiro"
    private String numeroCartao; // Número do cartão
    private String nomeTitular; // Nome do titular do cartão
    private String codigoSeguranca; // Código de segurança do cartão
    private String dataVencimento; // Data de vencimento no formato "MM/AA"

    public DadosPagamento(String metodo, String numero) {
        this.metodo = metodo;
        this.numero = numero;
        this.tipoCartao = null;
        this.numeroCartao = null;
        this.nomeTitular = null;
        this.codigoSeguranca = null;
        this.dataVencimento = null;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}

class Matricula {
    private Associado associado;
    private Turma turma;
    private Date dataMatricula;
    private double valorMatricula;

    public Matricula(Associado associado, Turma turma, Date dataMatricula, double valorMatricula) {
        this.associado = associado;
        this.turma = turma;
        this.dataMatricula = dataMatricula;
        this.valorMatricula = valorMatricula;
    }

    public Associado getAssociado() {
        return associado;
    }

    public Turma getTurma() {
        return turma;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }
}
