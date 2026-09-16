public class Solicitacao {
private int codigo;
private String solicitante;
private String descricao;
private String categoria;
private int prioridade;
private String status;

public Solicitacao(int codigo, String solicitante, String descricao,
                   String categoria, int prioridade, String status) {

                    this.codigo = codigo;
                    this.solicitante = solicitante;
                    this.descricao = descricao;
                    this.categoria = categoria;
                    this.prioridade = prioridade;
                    this.status = status;
                }
                public int getCodigo() {
                    return codigo;
                }

                public String getSolicitante() {
                    return solicitante;
                }

                public String getDescricao() {
                    return descricao;
                }

                public String getCategoria() {
                    return categoria;
                }

                public int getPrioridade() {
                    return prioridade;
                }

                public String getStatus() {
                    return status;
                }

            }
