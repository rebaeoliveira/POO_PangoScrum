import java.util.*;

public class PainelAdministrativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Painel Administrativo - Clube Recreativo");

        Associado associado = null;
        DadosPagamento dadosPagamento = null;

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1) Visualizar dados");
            System.out.println("2) Atualizar dados");
            System.out.println("3) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    if (associado != null) {
                        System.out.println("\nDados do Associado:");
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

                        List<Associado> atividadesEsportivas = associado.getAtividadesEsportivas();
                        if (!atividadesEsportivas.isEmpty()) {
                            System.out.println("Atividades esportivas:");
                            for (Associado atividadeEsportiva : atividadesEsportivas) {
                                System.out.println("Atividade esportiva: " + atividadeEsportiva.getNome());
                                System.out.println("Descrição da atividade esportiva: " + atividadeEsportiva.getDescricaoAtividadeEsportiva());
                            }
                        }

                        System.out.print("Método de pagamento: ");
                        String metodoPagamento = scanner.nextLine();
                        dadosPagamento = new DadosPagamento(metodoPagamento, "");

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

                    } else {
                        System.out.println("Nenhum associado cadastrado.");
                    }
                    break;

                    case 2:
                    if (associado != null) {
                        System.out.println("\nAtualização de Dados do Associado:");
                        
                        System.out.print("Novo Nome: ");
                        String novoNome = scanner.nextLine();
                        associado.setNome(novoNome);
                        
                        System.out.print("Novo Endereço: ");
                        String novoEndereco = scanner.nextLine();
                        associado.setEndereco(novoEndereco);
                        
                        System.out.print("Novo Telefone: ");
                        String novoTelefone = scanner.nextLine();
                        associado.setTelefone(novoTelefone);
                        
                        System.out.print("Novo E-mail: ");
                        String novoEmail = scanner.nextLine();
                        associado.setEmail(novoEmail);

                        System.out.println("Dados atualizados com sucesso.");
                    } else {
                        System.out.println("Nenhum associado cadastrado.");
                    }
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Escolha uma opção válida.");
                    break;
            }
        }

        System.out.println("Encerrando o Painel Administrativo.");
        scanner.close();
    }
}
