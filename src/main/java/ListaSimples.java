import java.util.ArrayList;
import java.util.List;

public class ListaSimples {

	private List<Integer> lista;

	/**
	 * Constrói uma ListaSimples de números inteiros, iniciando o atributo lista com
	 * uma lista vazia.
	 */
	public ListaSimples() {
		lista = new ArrayList<Integer>();
	}

	/**
	 * Insere um número inteiro no fim da lista.
	 * 
	 * @param valor O número inteiro a ser inserido.
	 */
	public void insere(Integer valor) {
		if (valor != null) {
			this.lista.add(valor);
		}
	}

	/**
	 * Insere um número inteiro no início da lista.
	 * 
	 * @param valor O número inteiro a ser inserido.
	 */
	public void insereInicio(Integer valor) {
		if (valor != null) {
			this.lista.add(0, valor);
		}
	}

	/**
	 * Insere um número inteiro no índice especificado.
	 * 
	 * @param valor  O número inteiro a ser inserido.
	 * @param indice O índice especificado.
	 */
	public void insereIndice(Integer valor, int indice) {
		if (valor != null) {
			this.lista.add(indice, valor);
		}
	}

	/**
	 * Remove um número inteiro da lista.
	 * 
	 * @param valor O valor a ser removido.
	 */
	public void remove(Integer valor) {
		if (valor != null) {
			this.lista.remove(valor);
		}
	}

	/**
	 * Remove o número inteiro localizado no índice especificado.
	 * 
	 * @param valor O índice do número inteiro a ser removido.
	 */
	public void removeIndice(int indice) {
		if (indice >= 0 || indice < this.lista.size()) {
			this.lista.remove(indice);
		} else {
			throw new IndexOutOfBoundsException("Índice inválido");
		}
	}

	/**
	 * Verifica se um número está presente na lista.
	 * 
	 * @param valor O número a ser verificado.
	 * @return true se o número estiver presente.
	 */
	public boolean existe(Integer valor) {
		return this.lista.contains(valor);
	}

	/**
	 * Recupera o número localizado no índice especificado.
	 * 
	 * @param indice O índice especificado.
	 * @return O número localizado no índice especificado.
	 */
	public Integer recuperar(int indice) {
		return this.lista.get(indice);
	}

	/**
	 * Recupera o índice de um número inteiro na lista.
	 * 
	 * @param valor O número inteiro a ser pesquisado.
	 * @return O índice do elemento, caso ele esteja presente na lista. -1, caso não esteja presente.
	 */
	public Integer recuperarPosicao(Integer valor) {
		return this.lista.indexOf(valor);
	}

	/**
	 * Recupera o tamanho da lista.
	 * @return
	 */
	public int recuperarTamanho() {
		return this.lista.size();
	}

	/**
	 * Representação da lista em uma String.
	 */
	public String toString() {
		return this.lista.toString();
	}
}
