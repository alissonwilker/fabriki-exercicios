import java.util.ArrayList;
import java.util.List;

public class FilaPrioridade {

        private List<Elemento> fila;
	public FilaPrioridade() {
            this.fila = new ArrayList <Elemento> ();
	}

	public Integer getTamanho() {
            return this.fila.size();
	}

	public void entrarNaFila(Elemento elemento) {
            if (getTamanho() == 0) {
                this.fila.add(elemento);
            }
            for (int i = 0; i < getTamanho(); i++) {
                if (elemento.getPrioridade() < this.fila.get(i).getPrioridade()) {
                    this.fila.add(i, elemento);
                }
                break;
        }
        if(this.fila.contains(elemento) == false){
            this.fila.add(elemento);
        }
	}
	public Elemento sairDaFila() throws Exception {
            if(getTamanho() != 0) {
			return this.fila.remove(0);
		}else {
			throw new Exception("fila vazia.");
		}
	}

	/**
	 * Retorna a posiÃ§Ã£o do elemento na fila. 
	 * @param elemento o elemento.
	 * @return a posiÃ§Ã£o do elemento na fila.
	 */
	public Integer getPosicaoNaFila(Elemento elemento) {
            return this.fila.indexOf(elemento);
	}

	public Elemento getElementoDaPosicao(Integer posicao) throws IndexOutOfBoundsException {
            if(posicao < 0 || posicao >= getTamanho()) {
			throw new IndexOutOfBoundsException();
			
		}
		return this.fila.get(posicao);
	}
}
