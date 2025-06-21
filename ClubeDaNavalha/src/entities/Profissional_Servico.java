public class Profissional_Servico {

    private int id_profissional_servico;
    private int profissional_id;
    private int servico_id;
    private boolean ativo;
    
    public Profissional_Servico() {
    }

    public Profissional_Servico(int id_profissional_servico, int profissional_id, int servico_id, boolean ativo) {
        this.id_profissional_servico = id_profissional_servico;
        this.profissional_id = profissional_id;
        this.servico_id = servico_id;
        this.ativo = ativo;
    }

    public int getId_profissional_servico() {
        return id_profissional_servico;
    }

    public void setId_profissional_servico(int id_profissional_servico) {
        this.id_profissional_servico = id_profissional_servico;
    }

    public int getProfissional_id() {
        return profissional_id;
    }

    public void setProfissional_id(int profissional_id) {
        this.profissional_id = profissional_id;
    }

    public int getServico_id() {
        return servico_id;
    }

    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
    
}
