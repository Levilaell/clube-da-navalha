import java.sql.Date;

public class Relatorio {

    private int id_relatorio;
    private String tipo;
    private Date periodo_inicio;
    private Date periodo_fim;
    private Date data_geracao;
    private String conteudo;
    
    
    public Relatorio(){
        tipo = new String();
        conteudo = new String();
     }
    public Relatorio(int id_relatorio, String tipo, Date periodo_inicio, Date periodo_fim, Date data_geracao,
            String conteudo) {
        this.id_relatorio = id_relatorio;
        this.tipo = tipo;
        this.periodo_inicio = periodo_inicio;
        this.periodo_fim = periodo_fim;
        this.data_geracao = data_geracao;
        this.conteudo = conteudo;
    }

    public int getId_relatorio() {
        return id_relatorio;
    }
    public void setId_relatorio(int id_relatorio) {
        this.id_relatorio = id_relatorio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Date getPeriodo_inicio() {
        return periodo_inicio;
    }
    public void setPeriodo_inicio(Date periodo_inicio) {
        this.periodo_inicio = periodo_inicio;
    }
    public Date getPeriodo_fim() {
        return periodo_fim;
    }
    public void setPeriodo_fim(Date periodo_fim) {
        this.periodo_fim = periodo_fim;
    }
    public Date getData_geracao() {
        return data_geracao;
    }
    public void setData_geracao(Date data_geracao) {
        this.data_geracao = data_geracao;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    
    
}
