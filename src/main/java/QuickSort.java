import java.util.List;

public class QuickSort {

	private List<Integer> lista;

	public QuickSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena(0, this.lista.size() - 1);
		return lista;
	}

	private void ordena(int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(inicio, fim);
			ordena(inicio, posicaoPivo - 1);
			ordena(posicaoPivo + 1, fim);
		}
	}

	private int separar(int inicio, int fim) {
		int pivo = lista.get(inicio);
		int i = inicio + 1;
		int f = fim;

		while (i <= f) {
			if (lista.get(i) <= pivo) {
				i++;
			} else if (pivo < lista.get(f)) {
				f--;
			} else {
				troca(i, f);
				i++;
				f--;
			}
		}
		
		lista.set(inicio, lista.get(f));
		lista.set(f, pivo);
		
		return f;
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
