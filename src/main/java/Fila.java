import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fila {

	/**
	 * ConstrÃ³i uma fila.
	 */
	public Fila() {
            
            List<Fila> fila = new LinkedList<Fila>();
	}

	/**
	 * Retorna o tamanho da fila.
	 * @return o tamanho da fila.
	 */
	public Integer getTamanho() {
	}

	/**
	 * Adiciona um elemento na fila.
	 * @param elemento o elemento adicionado.
	 */
	public void entrarNaFila(Elemento elemento) {
	}

	/**
	 * Retira um elemento da fila.
	 * @return o elemento retirado.
	 * @throws Exception exceÃ§Ã£o levantada caso a fila esteja vazia.
	 */
	public Elemento sairDaFila() throws Exception {
	}

	/**
	 * Retorna a posiÃ§Ã£o do elemento na fila. 
	 * @param elemento o elemento.
	 * @return a posiÃ§Ã£o do elemento na fila.
	 */
	public Integer getPosicaoNaFila(Elemento elemento) {
	}

	/**
	 * Retorna o elemento da posiÃ§Ã£o especificada.
	 * @param posicao a posiÃ§Ã£o especificada.
	 * @return o elemento da posiÃ§Ã£o especificada.
	 * @throws IndexOutOfBoundsException exceÃ§Ã£o lanÃ§ada caso a posiÃ§Ã£o seja < 0 ou >= tamanho da fila.
	 */
	public Elemento getElementoDaPosicao(Integer posicao) throws IndexOutOfBoundsException {
	}
}
