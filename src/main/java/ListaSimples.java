
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class ListaSimples {
   

	private List<Integer> lista;
       

	/**
	 * ConstrÃ³i uma ListaSimples de nÃºmeros inteiros, iniciando o atributo lista com
	 * uma lista vazia.
	 */
	public ListaSimples() {
           lista = new ArrayList<Integer>();
           
	}

	/**
	 * Insere um nÃºmero inteiro no fim da lista.
	 * 
	 * @param valor O nÃºmero inteiro a ser inserido.
	 */
	public void insere(Integer valor) {
            lista = new ArrayList<Integer>(); 
            lista.add(new Integer("10"));
            lista.add(lista.size() , new Integer("final"));
            
	}

	/**
	 * Insere um nÃºmero inteiro no inÃ­cio da lista.
	 * 
	 * @param valor O nÃºmero inteiro a ser inserido.
	 */
	public void insereInicio(Integer valor) {
	}

	/**
	 * Insere um nÃºmero inteiro no Ã­ndice especificado.
	 * 
	 * @param valor  O nÃºmero inteiro a ser inserido.
	 * @param indice O Ã­ndice especificado.
	 */
	public void insereIndice(Integer valor, int indice) {
	}

	/**
	 * Remove um nÃºmero inteiro da lista.
	 * 
	 * @param valor O valor a ser removido.
	 */
	public void remove(Integer valor) {
	}

	/**
	 * Remove o nÃºmero inteiro localizado no Ã­ndice especificado.
	 * 
	 * @param valor O Ã­ndice do nÃºmero inteiro a ser removido.
	 */
	public void removeIndice(int indice) {
	}

	/**
	 * Verifica se um nÃºmero estÃ¡ presente na lista.
	 * 
	 * @param valor O nÃºmero a ser verificado.
	 * @return true se o nÃºmero estiver presente.
	 */
	public boolean existe(Integer valor) {
	}

	/**
	 * Recupera o nÃºmero localizado no Ã­ndice especificado.
	 * 
	 * @param indice O Ã­ndice especificado.
	 * @return O nÃºmero localizado no Ã­ndice especificado.
	 */
	public Integer recuperar(int indice) {
	}

	/**
	 * Recupera o Ã­ndice de um nÃºmero inteiro na lista.
	 * 
	 * @param valor O nÃºmero inteiro a ser pesquisado.
	 * @return O Ã­ndice do elemento, caso ele esteja presente na lista. -1, caso nÃ£o esteja presente.
	 */
	public Integer recuperarPosicao(Integer valor) {
	}

	/**
	 * Recupera o tamanho da lista.
	 * @return
	 */
	public int recuperarTamanho() {
	}

	/**
	 * RepresentaÃ§Ã£o da lista em uma String.
	 */
	public String toString() {
	}
}
