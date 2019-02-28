import java.util.ArrayList;
import java.util.List;

public class ListaSimples {

	private List<Integer> listInteiro = new ArrayList();

	public ListaSimples() {
	}

	public void insere(Integer valor) {
		listInteiro.add(valor);
	}

	public void insereInicio(Integer valor) {
		listInteiro.add(0, valor);
	}

	public void insereIndice(Integer valor, int indice) {
		listInteiro.add(indice, valor);

	}

	public void remove(Integer valor) {
		listInteiro.remove(valor);
	}

	public void removeIndice(int indice) {
		listInteiro.remove(indice);
	}

	public boolean existe(Integer valor) {
		return listInteiro.contains(valor);
	}

	public Integer recuperar(int indice) {
		return listInteiro.get(indice);
	}

	/**
	 * Recupera o Ã­ndice de um nÃºmero inteiro na lista.
	 * 
	 * @param valor
	 *            O nÃºmero inteiro a ser pesquisado.
	 * @return O Ã­ndice do elemento, caso ele esteja presente na lista. -1, caso
	 *         nÃ£o esteja presente.
	 */
	public Integer recuperarPosicao(Integer valor) {
		return listInteiro.indexOf(valor);
	}

	public int recuperarTamanho() {
		return listInteiro.size();
	}

	@Override
	public String toString() {
		return "ListaSimples [listInteiro=" + listInteiro + "]";
	}

}
