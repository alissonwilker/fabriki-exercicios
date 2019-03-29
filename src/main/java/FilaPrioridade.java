
import java.util.ArrayList;
import java.util.List;

public class FilaPrioridade {

	/**
	 * ConstrÃ³i uma fila.
	 */
    private List<Elemento> fila;
    
	public FilaPrioridade() {
            this.fila = new ArrayList<Elemento>();
	}

	/**
	 * Retorna o tamanho da fila.
	 * @return o tamanho da fila.
	 */
	public Integer getTamanho() {
             return this.fila.size();
	}

	/**
	 * Adiciona um elemento na fila de acordo com a sua prioridade. 
	 * Quanto MENOR a prioridade do elemento, mais ele deve ser colocado no inÃ­cio da fila.
	 * Se a prioridade for igual, a preferÃªncia Ã© do elemento mais antigo na fila.
	 * @param elemento o elemento adicionado.
	 */
	public void entrarNaFila(Elemento elemento) {
            
            this.fila.add(elemento);	
}

	/**
	 * Retira um elemento da fila.
	 * @return o elemento retirado.
	 * @throws Exception exceÃ§Ã£o levantada caso a fila esteja vazia.
	 */
	public Elemento sairDaFila() throws Exception {
        return null;
	}

	/**
	 * Retorna a posiÃ§Ã£o do elemento na fila. 
	 * @param elemento o elemento.
	 * @return a posiÃ§Ã£o do elemento na fila.
	 */
	public Integer getPosicaoNaFila(Elemento elemento) {
        return null;
	}

	/**
	 * Retorna o elemento da posiÃ§Ã£o especificada.
	 * @param posicao a posiÃ§Ã£o especificada.
	 * @return o elemento da posiÃ§Ã£o especificada.
	 * @throws IndexOutOfBoundsException exceÃ§Ã£o lanÃ§ada caso a posiÃ§Ã£o seja < 0 ou >= tamanho da fila.
	 */
	public Elemento getElementoDaPosicao(Integer posicao) throws IndexOutOfBoundsException {
        return null;
	}
}
