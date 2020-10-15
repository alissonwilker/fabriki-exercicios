public abstract class Automovel extends Veiculo {

    protected boolean marchaAFrente;
    private boolean ligado;

    public Automovel() {
    }

    @Override
    void moverParaFrente() {
        System.out.println("Liga o carro se necessario, engata marcha a frente se ja nao estiver engatada, e coloca o carro em movimento se estiver parado.");
    }

    void ligar() {
        System.out.println("Liga o automovel se estiver desligado.");
    }

    void desligar() {
        System.out.println("Se estiver ligado, para o automovel se necessario, e desliga-o.Se estiver ligado, para o automovel se necessario, e desliga-o.");
    }

    boolean estaLigado() {
        return true;
    }

    boolean estaEmMarchaAFrente() {
        return true;
    }
    
    protected void engatarMarchaAFrente(){
        System.out.println("Se a marcha a frente nao estiver engatada, para o carro se necessario, e engata a marcha a frente.");
    }

}
