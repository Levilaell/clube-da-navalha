import java.sql.Date;

public class Notificacao {

    private int id_notificacao;
    private String tipo;
    private String mensagem;
    private Date enviada_em;
    private int cliente_id;
    private int agendamento_id;
    
    
    public Notificacao() {
        tipo = new String();
        mensagem = new String();
    }


    public Notificacao(int id_notificacao, String tipo, String mensagem, Date enviada_em, int cliente_id,
            int agendamento_id) {
        this.id_notificacao = id_notificacao;
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.enviada_em = enviada_em;
        this.cliente_id = cliente_id;
        this.agendamento_id = agendamento_id;
    }


    public int getId_notificacao() {
        return id_notificacao;
    }


    public void setId_notificacao(int id_notificacao) {
        this.id_notificacao = id_notificacao;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getMensagem() {
        return mensagem;
    }


    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


    public Date getEnviada_em() {
        return enviada_em;
    }


    public void setEnviada_em(Date enviada_em) {
        this.enviada_em = enviada_em;
    }


    public int getCliente_id() {
        return cliente_id;
    }


    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }


    public int getAgendamento_id() {
        return agendamento_id;
    }


    public void setAgendamento_id(int agendamento_id) {
        this.agendamento_id = agendamento_id;
    }

    
    
}
