
import java.util.List;

public class BubbleSort {

	private List<Integer> lista;
	
	public BubbleSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
		int n = lista.size();
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (lista.get(j - 1) > lista.get(j)) {
					temp = lista.get(j - 1);
					lista.set(j - 1, lista.get(j));					
					lista.set(j, temp);
				}

			}
		}
	}
}
