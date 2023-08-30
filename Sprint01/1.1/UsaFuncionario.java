import java.util.*;

public class UsaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Associado do Clube Recreativo");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Número da carteirinha do associado: ");
        String carteirinhaAssociado = scanner.nextLine();

        Associado associado = new Associado(nome, "", "", endereco, telefone, email, carteirinhaAssociado);

        System.out.print("Deseja adicionar dependentes? (S/N): ");
        String adicionarDependentes = scanner.nextLine();
        while (adicionarDependentes.equalsIgnoreCase("S")) {
            System.out.print("Nome do dependente: ");
            String nomeDependente = scanner.nextLine();
            System.out.print("Endereço do dependente: ");
            String enderecoDependente = scanner.nextLine();
            System.out.print("Telefone do dependente: ");
            String telefoneDependente = scanner.nextLine();
            System.out.print("E-mail do dependente: ");
            String emailDependente = scanner.nextLine();

            Associado dependente = new Associado(nomeDependente, "", "", enderecoDependente, telefoneDependente, emailDependente, "");
            associado.adicionarDependente(dependente);

            System.out.print("Deseja adicionar mais dependentes? (S/N): ");
            adicionarDependentes = scanner.nextLine();
        }

        System.out.print("Método de pagamento (cartao/dinheiro): ");
        String metodoPagamento = scanner.nextLine();

        DadosPagamento dadosPagamento = new DadosPagamento(metodoPagamento, "");

        if (metodoPagamento.equalsIgnoreCase("cartao")) {
            System.out.print("Tipo de cartao (credito/debito): ");
            String tipoCartao = scanner.nextLine();
            dadosPagamento.setTipoCartao(tipoCartao);

            if (tipoCartao.equalsIgnoreCase("credito") || tipoCartao.equalsIgnoreCase("debito")) {
                System.out.print("Número do cartao: ");
                String numeroCartao = scanner.nextLine();
                System.out.print("Nome do titular do cartao: ");
                String nomeTitular = scanner.nextLine();
                System.out.print("Código de seguranca: ");
                String codigoSeguranca = scanner.nextLine();
                System.out.print("Data de vencimento (MM/AA): ");
                String dataVencimento = scanner.nextLine();

                dadosPagamento.setNumeroCartao(numeroCartao);
                dadosPagamento.setNomeTitular(nomeTitular);
                dadosPagamento.setCodigoSeguranca(codigoSeguranca);
                dadosPagamento.setDataVencimento(dataVencimento);
            }
        }

        System.out.println("Associado cadastrado com sucesso:");
        System.out.println("Nome: " + associado.getNome());
        System.out.println("Endereço: " + associado.getEndereco());
        System.out.println("Telefone: " + associado.getTelefone());
        System.out.println("E-mail: " + associado.getEmail());
        System.out.println("Número da carteirinha do associado: " + associado.getCarteirinhaAssociado());

        List<Associado> dependentes = associado.getDependentes();
        if (!dependentes.isEmpty()) {
            System.out.println("Dependentes:");
            for (Associado dependente : dependentes) {
                System.out.println("Nome: " + dependente.getNome());
                System.out.println("Endereço: " + dependente.getEndereco());
                System.out.println("Telefone: " + dependente.getTelefone());
                System.out.println("E-mail: " + dependente.getEmail());
            }
        }
        System.out.println("Método de pagamento: " + dadosPagamento.getMetodo());
        if (dadosPagamento.getTipoCartao() != null) {
            System.out.println("Tipo de cartao: " + dadosPagamento.getTipoCartao());
            if (dadosPagamento.getNumeroCartao() != null) {
                System.out.println("Número do cartao: " + dadosPagamento.getNumeroCartao());
                System.out.println("Nome do titular: " + dadosPagamento.getNomeTitular());
                System.out.println("Código de seguranca: " + dadosPagamento.getCodigoSeguranca());
                System.out.println("Data de vencimento: " + dadosPagamento.getDataVencimento());
            }
        }
        scanner.close();
    }
}
