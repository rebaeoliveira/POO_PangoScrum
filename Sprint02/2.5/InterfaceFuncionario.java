import java.util.Scanner;

public class InterfaceFuncionario {
    private Funcionario funcionario;

    public InterfaceFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Visualizar informações pessoais");
            System.out.println("2. Atualizar nome");
            System.out.println("3. Atualizar senha");
            System.out.println("4. Atualizar email");
            System.out.println("5. Atualizar telefone");
            System.out.println("6. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirInformacoesPessoais();
                    break;
                case 2:
                    atualizarNome(scanner);
                    break;
                case 3:
                    atualizarSenha(scanner);
                    break;
                case 4:
                    atualizarEmail(scanner);
                    break;
                case 5:
                    atualizarTelefone(scanner);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void exibirInformacoesPessoais() {
        System.out.println("Informações Pessoais:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Senha: " + funcionario.getSenha());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Telefone: " + funcionario.getTelefone());
    }

    public void atualizarNome(Scanner scanner) {
        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();
        funcionario.atualizarNome(novoNome);
        System.out.println("Nome atualizado com sucesso!");
    }

    public void atualizarSenha(Scanner scanner) {
        System.out.print("Nova senha: ");
        String novaSenha = scanner.nextLine();
        funcionario.atualizarSenha(novaSenha);
        System.out.println("Senha atualizada com sucesso!");
    }

    public void atualizarEmail(Scanner scanner) {
        System.out.print("Novo email: ");
        String novoEmail = scanner.nextLine();
        funcionario.atualizarEmail(novoEmail);
        System.out.println("Email atualizado com sucesso!");
    }

    public void atualizarTelefone(Scanner scanner) {
        System.out.print("Novo telefone: ");
        String novoTelefone = scanner.nextLine();
        funcionario.atualizarTelefone(novoTelefone);
        System.out.println("Telefone atualizado com sucesso!");
    }
}
