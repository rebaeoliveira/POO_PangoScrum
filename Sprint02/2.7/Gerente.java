import java.util.*;

class Gerente extends Funcionario {
    public Gerente(String nome, String rg, String cpf, String endereco, String telefone, String email, double salario) {
        super(nome, rg, cpf, endereco, telefone, email, "Gerente", salario);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        // Lógica para cadastrar um novo funcionário no sistema
        System.out.println("Funcionário cadastrado: " + funcionario.getNome());
    }

    public void definirPermissoes(Funcionario funcionario) {
        // Lógica para definir as permissões de acesso de um funcionário
        System.out.println("Permissões definidas para: " + funcionario.getNome());
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
