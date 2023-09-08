public class Funcionario extends Pessoa {
    private Cargo cargo;
    private double salario;

    public Funcionario(String nome, String rg, String cpf, String endereco, String telefone, String email, Cargo cargo, double salario) {
        super(nome, rg, cpf, endereco, telefone, email);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void definirNivelAcesso(String nivel) {
        this.cargo.setNivel(nivel);
    }
    
  
}

