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
		int i = inicio;
		int j = fim;
		int pivot = (i + j) / 2;

		while (i <= j) {

			if (this.lista.get(i) < this.lista.get(pivot)) {
				i++;
			} else if (this.lista.get(j) > this.lista.get(pivot)) {
				j--;
			} else {
				troca(i, j);
				i++;
				j--;
			}
		}

		if (i < fim) {
			ordena(i, fim);
		}

		if (j > inicio) {
			ordena(inicio, j);
		}
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
