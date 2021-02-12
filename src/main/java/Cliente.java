public abstract class Cliente {

    private Integer id;

    private String nome; 

  
protected Cliente() {}

    protected Cliente(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
