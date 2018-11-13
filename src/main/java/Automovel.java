public abstract class Automovel extends Veiculo {
    
    private boolean ligado;
    protected boolean marchaAFrente;

    public boolean isLigado() {
        return ligado;
    }

    public boolean isMarchaAFrente() {
        return marchaAFrente;
    }

    @Override
    public void moverParaFrente() {
        super.moverParaFrente(); //To change body of generated methods, choose Tools | Templates.
    }

    public void ligar() {
       this.ligado = true;
    }
    
    public void desligar() {
        this.ligado = false;
    }
     
    /**
     * @return
     */
    public boolean estaLigado() {
        return this.ligado;
    }
    
    public boolean estaEmMarchaAFrente() {
        return this.marchaAFrente;
    }
    
    public void engatarMarchaAFrente() {
     
      this.marchaAFrente = true;
        
    }
    
    
}
    
