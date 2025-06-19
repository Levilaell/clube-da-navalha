import java.math.BigDecimal;

public class Servico {

    private int id; 

    private String nome; 

    private String tipo; 

    private int duracaoMinutos; 

    private BigDecimal preco; 

    private boolean ativo; 

    public Servico(){
        id = 0;
        nome = new String();
        tipo = new String();
        duracaoMinutos = 0;
    }

    public Servico(int id, String nome, String tipo, int duracaoMinutos, BigDecimal preco, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.duracaoMinutos = duracaoMinutos;
        this.preco = preco;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
}
