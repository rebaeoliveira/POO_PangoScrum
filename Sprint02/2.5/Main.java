public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("NomeInicial", "SenhaInicial", "email@example.com", "123-456-7890");
        InterfaceFuncionario interfaceFuncionario = new InterfaceFuncionario(funcionario);
        interfaceFuncionario.exibirMenu();
    }
}
