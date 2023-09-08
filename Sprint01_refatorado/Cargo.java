
// Definido uma enumeração chamada Cargo
// Com a enumeração, consigo representar um conjunto fixo de valores constantes, que nesse caso será usado para nível de cargos de funcionários.

//Lógica pensada para cada nível de acordo com o cargo:
// NívelA = Permissão Total - Cadastros / Consultas / Relatórios
// NívelB = Permissão Parcial - Permite alguns cadastros e acesso a toda as consultas
// NívelC = Permissão limitada - Apenas consultas e presença em chamada

public enum Cargo {
    GERENTE("Gerente", "NívelA"),
    ADMINISTRATIVO("Administrativo", "NívelB"),
    INSTRUTOR("Instrutor", "NívelC");

    private String nome;
    private String nivel;

    private Cargo(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    // Método setNível vai permitirdefinir o nível de acesso do cargo quando chamado. Posso atualizar o valor da variável nivel com o novo nível passado como argumento.
    public void setNivel(String novoNivel) {
        this.nivel = novoNivel;
    }
}
