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
		int pivot = this.lista.get((inicio + fim) / 2);
		int i = inicio;
		int j = fim;

		while (i <= j) {
			while (this.lista.get(i) < pivot) i++;
			while (this.lista.get(j) > pivot) j--;

			if (this.lista.get(i) >= this.lista.get(j)) {
				troca(i, j);
				i++;
				j--;
			}

		}

		if (j > inicio) ordena(inicio, j);

		if(i < fim) ordena(i, fim);
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
