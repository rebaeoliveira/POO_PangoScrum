public class DefinirPermissoes {
    // Método "verficarPermissao" criado para verificar se um funcionário tem permissão para usar uma rotina
    public static boolean verificarPermissao(Funcionario funcionario) {
        // Verifica se o cargo do funcionário é do tipo GERENTE
        if (funcionario.getCargo() == Cargo.GERENTE) {
            // Se o cargo for do tipo GERENTE, será exibido uma mensagem informando que o funcionário tem permissão
            System.out.println("O funcionário " + funcionario.getNome() + " possui permissão para usar essa rotina.");
            return true; // Retorna true para indicar que o funcionário tem permissão
        } else {
            // Se o cargo não for do tipo GERENTE, exibe uma mensagem informando que o funcionário não tem permissão
            System.out.println("O funcionário " + funcionario.getNome() + " não possui permissão para usar essa rotina.");
            return false; // Retorna false para indicar que o funcionário não tem permissão
        }
    }
}