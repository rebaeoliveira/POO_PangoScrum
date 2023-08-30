public class DadosPagamento {
    private String metodo;
    private String tipoCartao;
    private String numeroCartao;
    private String nomeTitular;
    private String codigoSeguranca;
    private String dataVencimento;

    public DadosPagamento(String metodo, String tipoCartao) {
        this.metodo = metodo;
        this.tipoCartao = tipoCartao;
    }

    // Métodos getters

    public String getMetodo() {
        return metodo;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    // Métodos setters

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
