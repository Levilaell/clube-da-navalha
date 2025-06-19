import java.sql.Date;

public final class Cliente extends Usuario{

    private String telefone; 

    private Date dataCadastro; 


    public Cliente(){
        telefone = new String();
    }


    public Cliente(int id, String nome, String email, boolean ativo, String telefone, Date dataCadastro) {
        super(id, nome, email, ativo);
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public Date getDataCadastro() {
        return dataCadastro;
    }


    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    
    



    
}
