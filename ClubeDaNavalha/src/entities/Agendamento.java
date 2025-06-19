import java.sql.Date;
import java.sql.Time;

public class Agendamento {
    private int id; 

    private int clienteId; 
    
    private Date data; 

    private Time hora; 

    private String status; 

    private Date dataCriacao; 

    private int profissionalId; 

    private Date dataAtualizacao; 

    private String motivoCancelamento; 

    private int servicoId;
    
    public Agendamento(){
        status = new String();
        motivoCancelamento = new String();
    }

    public Agendamento(int id, int clienteId, Date data, Time hora, String status, Date dataCriacao, int profissionalId,
            Date dataAtualizacao, String motivoCancelamento, int servicoId) {
        this.id = id;
        this.clienteId = clienteId;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.dataCriacao = dataCriacao;
        this.profissionalId = profissionalId;
        this.dataAtualizacao = dataAtualizacao;
        this.motivoCancelamento = motivoCancelamento;
        this.servicoId = servicoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getProfissionalId() {
        return profissionalId;
    }

    public void setProfissionalId(int profissionalId) {
        this.profissionalId = profissionalId;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    public int getServicoId() {
        return servicoId;
    }

    public void setServicoId(int servicoId) {
        this.servicoId = servicoId;
    }

    
}
