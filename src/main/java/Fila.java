import java.util.ArrayList;
import java.util.List;

public class Fila extends Elemento {

	private List<Elemento> fila;

	public Fila() {
		this.fila = new ArrayList();
	}

	/**
	 * Retorna o tamanho da fila.
	 * 
	 * @return o tamanho da fila.
	 */
	public Integer getTamanho() {
		return fila.size();
	}

	/**
	 * Adiciona um elemento na fila.
	 * 
	 * @param elemento
	 *            o elemento adicionado.
	 */
	public void entrarNaFila(Elemento elemento) {
		this.fila.add(elemento);

	}

	/**
	 * Retira um elemento da fila.
	 * 
	 * @return o elemento retirado.
	 * @throws Exception
	 *             exceÃ§Ã£o levantada caso a fila esteja vazia.
	 */
	public Elemento sairDaFila() throws Exception {
		if (!fila.isEmpty()) {
			return (Elemento) fila.remove(0);
		} else {
			throw new Exception("Fila vazia");
		}
	}

	/**
	 * Retorna a posiÃ§Ã£o do elemento na fila.
	 * 
	 * @param elemento
	 *            o elemento.
	 * @return a posiÃ§Ã£o do elemento na fila.
	 */
	public Integer getPosicaoNaFila(Elemento elemento) {
		return fila.indexOf(elemento);
	}

	/**
	 * Retorna o elemento da posiÃ§Ã£o especificada.
	 * 
	 * @param i
	 *            a posiÃ§Ã£o especificada.
	 * @return o elemento da posiÃ§Ã£o especificada.
	 * @throws IndexOutOfBoundsException
	 *             exceÃ§Ã£o lanÃ§ada caso a posiÃ§Ã£o seja < 0 ou >= tamanho da
	 *             fila.
	 */
	public Elemento getElementoDaPosicao(Integer index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= getTamanho()) {
			throw new IndexOutOfBoundsException();
		}
		return this.fila.get(index);

	}

}
