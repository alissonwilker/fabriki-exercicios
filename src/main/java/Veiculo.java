public class Veiculo extends java.lang.Object{

	protected int qtdePneus;
	protected int velocidade=0;



	void velocidade(int velocidade) {
		this.velocidade = velocidade;		
	}

	void aumentarVelocidade() {
		if (velocidade>0) {
			velocidade++;
		}
	}

	int getVelocidade() {
		return velocidade;
	}

	protected boolean estaEmMovimento() {
		if(velocidade>0) {
			return true;
		}
		else {
			return false;
		}

	}

	void moverParaFrente() {
		if (velocidade==0) {
			velocidade++;
		}


	}


	void frear() {
		if(velocidade>0) {
			velocidade--;
		}

	}

	void parar() {
		while(velocidade>0) {
			velocidade--;
		}

	}

	int getQtdePneus() {
		return qtdePneus;

	}

	protected void mover() {
		if (velocidade==0) {
			velocidade++;
		}
	}


}
