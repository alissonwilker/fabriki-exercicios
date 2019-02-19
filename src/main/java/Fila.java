import java.util.ArrayList;
import java.util.List;

public class Fila {

	private List<Integer> fila;

	public Fila() {
		fila = new ArrayList<Integer>();
	}

	public Integer getTamanho() {
		return this.fila.size();
	}

	public void entrarNaFila(Integer numero) {
		this.fila.add(numero);
	}

	public Integer sairDaFila() {

		if (getTamanho() == 0)
			return -1;
		
		return this.fila.remove(0);
	}

	public Integer getPosicaoNaFila(Integer elemento) {
		return this.fila.indexOf(elemento);
	}

	public Integer getElementoDaPosicao(Integer posicao) {

		if (getTamanho() == 0)
			return -1;
		
		if (posicao < 0 || posicao >= this.fila.size())
			throw new IllegalArgumentException("Valor de posição inválido");
			
		return this.fila.get(posicao);
	}
}
