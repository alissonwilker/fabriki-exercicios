import java.util.ArrayList;
import java.util.List;

public class ListaSimples {

    private List<Integer> lista;

    /**
     * Constrói uma ListaSimples de números inteiros, iniciando o atributo lista
     * com uma lista vazia.
     */
    public ListaSimples() {
	lista = new ArrayList();
    }

    /**
     * Insere um número inteiro no fim da lista.
     * 
     * @param valor
     *            O número inteiro a ser inserido.
     */
    public void insere(Integer valor) {
	lista.add(valor);

    }

    /**
     * Insere um número inteiro no início da lista.
     * 
     * @param valor
     *            O número inteiro a ser inserido.
     */
    public void insereInicio(Integer valor) {
	lista.add(0, valor);
    }

    /**
     * Insere um número inteiro no índice especificado.
     * 
     * @param valor
     *            O número inteiro a ser inserido.
     * @param indice
     *            O índice especificado.
     */
    public void insereIndice(Integer valor, int indice) {
	lista.add(indice, valor);
    }

    /**
     * Remove um número inteiro da lista.
     * 
     * @param valor
     *            O valor a ser removido.
     */
    public void remove(Integer valor) {
	lista.remove(valor);
    }

    /**
     * Remove o número inteiro localizado no índice especificado.
     * 
     * @param valor
     *            O índice do número inteiro a ser removido.
     */
    public void removeIndice(int indice) {
	lista.remove(indice);
    }

    /**
     * Verifica se um número está presente na lista.
     * 
     * @param valor
     *            O número a ser verificado.
     * @return true se o número estiver presente.
     */
    public boolean existe(Integer valor) {
	return lista.contains(valor);
    }

    /**
     * Recupera o número localizado no índice especificado.
     * 
     * @param indice
     *            O índice especificado.
     * @return O número localizado no índice especificado.
     */
    public Integer recuperar(int indice) {
	return lista.get(indice);
    }

    /**
     * Recupera o índice de um número inteiro na lista.
     * 
     * @param valor
     *            O número inteiro a ser pesquisado.
     * @return O índice do elemento, caso ele esteja presente na lista. -1, caso
     *         não esteja presente.
     */
    public Integer recuperarPosicao(Integer valor) {
	return lista.indexOf(valor);
    }

    /**
     * Recupera o tamanho da lista.
     * 
     * @return
     */
    public int recuperarTamanho() {
	return lista.size();
    }

    /**
     * Representação da lista em uma String.
     */
    @Override
    public String toString() {
	return "ListaSimples [lista=" + lista + "]";
    }

}
