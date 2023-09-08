import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastrarFuncionario {
    public static void main(String[] args) {
        //Criando uma lista para armazenar funcionários. Essa lista será usada posteriomente para verificar o nível de acesso do funcionário.
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        // Aqui estou criando três objetos Funcionario apenas de exmeplo e repassando os valores. No cargo,e estou buscando os cargos fixos que defini no arquivo cargo.ja e por isso usa-se "Cargo." para setar.
        Funcionario funcionario1 = new Funcionario("Funcionario1", "123456789", "333.333.333-33", "Rua Teste 1", "(45) 99999-9999", "f1@email.com", Cargo.ADMINISTRATIVO, 2150.0);
        Funcionario funcionario2 = new Funcionario("Funcionario2", "987654321", "444.444.444-44", "Rua Teste 2", "(45) 98888-8888", "f2@email.com", Cargo.GERENTE , 4800.0);
        Funcionario funcionario3 = new Funcionario("Funcionario3", "555444333", "555.555.555-55", "Rua Teste 3", "(45) 97777-7777", "f3@email.com", Cargo.INSTRUTOR, 2600.0);

        // Adicionando os funcionários acima na lista
        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario2);
        listaFuncionarios.add(funcionario3);

        // usando o for, estou fazendo uma iteração sobre a lista de funcionários e retornando print apenas do nome, cargo e salário de cada um cadastrado na lista.
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo() + ", Salário R$: " + funcionario.getSalario());
        }

        // Usando um Scanner para entrada de dados do usuário.
        // Aqui deve informar qual o funcionário que vai usar a rotina de definir permissões. 
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome do funcionário que deseja usar a rotina de definir permissões?");
        String nome = sc.nextLine();

        // Chamando aqui o método buscarFuncionario para encontrar um funcionário.
        // A busca será pelo nome do funcionário
        Funcionario funcionario = buscarFuncionario(nome, listaFuncionarios);

        // if para verificar se o funcionário foi encontrado
        if (funcionario != null) {
            // if para verificar se o funcionário tem permissão para definir o nível de acesso
            if (DefinirPermissoes.verificarPermissao(funcionario)) {
                System.out.println("Funcionário tem permissão para definir o nível de acesso (A, B ou C).");
                System.out.println("Digite o novo nível de acesso (A, B ou C): ");               
                String novoNivel = sc.nextLine();
                 // Chamando aqui o método definirNivelAcesso para atualizar o nível de acesso
                funcionario.definirNivelAcesso(novoNivel);
                System.out.println("Nível de acesso atualizado com sucesso.");
            } else {
                System.out.println("Funcionário não tem permissão para definir o nível de acesso.");
            }
        } else {
            System.out.println("Funcionário não encontrado.");
        }
        // Fechando  o Scanner
        sc.close();
    }

    // Método 'buscarFuncionario" criado para buscar um funcionário na lista. Busca será pelo nome.
    public static Funcionario buscarFuncionario(String nome, List<Funcionario> lista) {
        for (Funcionario f : lista) {
            if (f.getNome().equals(nome)) {
                return f; // retorna o funcionario encontrado
            }
        }

        // se não encontrar o funcionário, retornar null
        return null;
    }
}
