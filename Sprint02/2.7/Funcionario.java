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