class Pessoa {
    protected String nome;
    protected String rg;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String rg, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getEmail() {
        return email;
    }
}