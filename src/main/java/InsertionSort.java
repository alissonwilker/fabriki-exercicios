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
		for(i = 1; i < lista.size(); i++) {
		int aux = lista.get(i);
		j = i;

		}
		while (j > 0; && lista.get(j - 1) > aux) {
			lista.get(j) = lista.get(j - 1);
			j--;
		}
		lista.get(j) = aux;
	}
}
