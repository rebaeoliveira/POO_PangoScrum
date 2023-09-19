public class DadosPagamento {
    private String metodo;
    private String numero;
    private String tipoCartao; // Para armazenar "credito", "debito" ou "dinheiro"
    private String numeroCartao; // Número do cartão
    private String nomeTitular; // Nome do titular do cartão
    private String codigoSeguranca; // Código de segurança do cartão
    private String dataVencimento; // Data de vencimento no formato "MM/AA"

    public DadosPagamento(String metodo, String numero) {
        this.metodo = metodo;
        this.numero = numero;
        this.tipoCartao = null;
        this.numeroCartao = null;
        this.nomeTitular = null;
        this.codigoSeguranca = null;
        this.dataVencimento = null;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
