

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

