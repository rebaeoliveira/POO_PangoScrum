import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {
        Associado associado1 = new Associado("João", "1234567", "012345601", "Endereco1", "123456789", "joao@examplo.com", "Carteirinha1");
        Associado associado2 = new Associado("Maria", "890189", "101123456", "Endereco2", "987654321", "maria@examplo.com", "Carteirinha2");

        try (
        Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu da Lanchonete");
                System.out.println("1. Registrar Consumo");
                System.out.println("2. Sair");
                System.out.print("Escolha uma opção: ");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                if (escolha == 1) {
                    System.out.print("Digite o nome do associado: ");
                    String nomeAssociado = scanner.nextLine();
                    System.out.print("Digite o valor consumido: ");
                    double valorConsumido = scanner.nextDouble();

                    Associado associadoEncontrado = null;
                    if (nomeAssociado.equals(associado1.getNome())) {
                        associadoEncontrado = associado1;
                    } else if (nomeAssociado.equals(associado2.getNome())) {
                        associadoEncontrado = associado2;
                    }

                    if (associadoEncontrado != null) {
                        associadoEncontrado.registrarConsumo(valorConsumido);
                        System.out.println("Consumo registrado com sucesso.");
                    } else {
                        System.out.println("Associado não encontrado.");
                    }
                } else if (escolha == 2) {
                    System.out.println("Saindo do programa.");
                    break;
                }
            }
        }
    }
}
