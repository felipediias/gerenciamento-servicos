public class Operacao {
    private String tipo;
    private Solicitacao solicitacao;
    public String getTipo() {
    return tipo;
    }
    public Solicitacao getSolicitacao() {
    return solicitacao;
    }
    public Operacao(String tipo, Solicitacao solicitacao) {
        this.tipo = tipo;
        this.solicitacao = solicitacao;
    }
}