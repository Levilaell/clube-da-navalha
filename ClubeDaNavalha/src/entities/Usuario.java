public abstract class Usuario {

    private int id; 

    private String nome; 

    private String email; 

    private boolean ativo; 


    public Usuario(){
        id = 0;
        nome = new String();
        email = new String();
    }

    public Usuario(int id, String nome, String email, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public boolean isAtivo() {
        return ativo;
    }


    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
