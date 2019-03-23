import java.util.List;

public class InsertionSort {

	private List<Integer> lista;

	public InsertionSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
		int x, i;

		for (int j = 1; j < lista.size(); j++) {

			x = lista.get(j);
			i = j - 1;
			while (i >= 0 && lista.get(i) > x) {
				lista.set(i + 1, lista.get(i));
				i = i - 1;
			}
			lista.set(i + 1, x);
		}
	}
}
