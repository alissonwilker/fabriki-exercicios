import java.util.ArrayList;
import java.util.List;

public class Fila {

    private List<Elemento> fila;
    
        
	/**
	 * ConstrÃ³i uma fila.
	 */
	public Fila() {
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
	 * Adiciona um elemento na fila.
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
          if(getTamanho() != 0){
            return this.fila.remove(0);  
          } else {
              throw new Exception("Mano, a fila está vazia");
          }
            
          
        }
	

	/**
	 * Retorna a posiÃ§Ã£o do elemento na fila. 
	 * @param elemento o elemento.
	 * @return a posiÃ§Ã£o do elemento na fila.
	 */
	public Integer getPosicaoNaFila(Elemento elemento){
            return this.fila.indexOf(elemento);
	}

	/**
	 * Retorna o elemento da posiÃ§Ã£o especificada.
	 * @param posicao a posiÃ§Ã£o especificada.
	 * @return o elemento da posiÃ§Ã£o especificada.
	 * @throws IndexOutOfBoundsException exceÃ§Ã£o lanÃ§ada caso a posiÃ§Ã£o seja < 0 ou >= tamanho da fila.
	 */
	public Elemento getElementoDaPosicao(Integer posicao) throws IndexOutOfBoundsException {
            if(posicao < 0 || posicao >= getTamanho()){
                throw new IndexOutOfBoundsException("Mano, indice. Liga-se");
            }
            return fila.get(posicao);
	}

}
