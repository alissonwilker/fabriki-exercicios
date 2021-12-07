public abstract class Cliente extends java.lang.Object {
    //atributos
    private java.lang.String nome;
    
    //métodos especiais

    /**
     *
     * @param nome
     */
    protected Cliente(java.lang.String nome) {
        this.setNome(nome);
    }

    public java.lang.String getNome(){
        return nome;
    }
    public void setNome(java.lang.String nome){
        this.nome = nome;
    }
}
