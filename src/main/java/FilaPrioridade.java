import java.util.ArrayList;
import java.util.List;

public class FilaPrioridade {

	private List<Elemento> fila;

	/**
	 * Constrói uma fila.
	 */
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
	 * Quanto MENOR a prioridade do elemento, mais ele deve ser colocado no início da fila.
	 * Se a prioridade for igual, a preferência é do elemento mais antigo na fila.
	 * @param elemento o elemento adicionado.
	 */
	public void entrarNaFila(Elemento elemento) {
		
		Integer tamanho = getTamanho();
		if (tamanho == 0) {
			this.fila.add(elemento);
		} else {
			int indice = 0;
			boolean entrouNaFila = false;
			
			while (!entrouNaFila) {
				Integer prioridadeElementoIndice = this.fila.get(indice).getPrioridade();
				Integer prioridadeElemento = elemento.getPrioridade();
				
				if (prioridadeElementoIndice > prioridadeElemento) {
					
					this.fila.add(indice, elemento);
					entrouNaFila = true;
					
				} else {
					if (indice == tamanho - 1) {
						this.fila.add(elemento);
						entrouNaFila = true;
					} else {
						indice++;						
					}
				}
			}
		}
	}

	/**
	 * Retira um elemento da fila.
	 * @return o elemento retirado.
	 * @throws Exception exceção levantada caso a fila esteja vazia.
	 */
	public Elemento sairDaFila() throws Exception {
		if (getTamanho() > 0) {
			return this.fila.remove(0);
		} else {
			throw new Exception("A lista está vazia");
		}
	}

	public Integer getPosicaoNaFila(Elemento elemento) {
		return this.fila.indexOf(elemento);
	}

	public Elemento getElementoDaPosicao(Integer posicao) throws IndexOutOfBoundsException {

		if (posicao < 0 || posicao >= getTamanho()) {
			throw new IndexOutOfBoundsException("Posição inválida para a busca");
		}

		return this.fila.get(posicao);

	}
}
