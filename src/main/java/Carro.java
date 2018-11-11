public class Carro extends Automovel{

    public Carro() {
        qtdePneus = 4;
        
    }

    public void moverParaTras(){
            if(getVelocidade()==2){
                --velocidade;
            }
            setLigado(true);
            engatarMarchaARe();
            estaEmMovimento();
           
        
    }
    
    public void engatarMarchaARe(){
       if(marchaAFrente){
        
           marchaAFrente = false;
          
       }
    }
}
