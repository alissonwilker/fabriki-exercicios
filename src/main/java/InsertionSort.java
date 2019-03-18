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
	for (int i = 0; i < lista.size(); i++) {
            int nova = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) >= nova) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, nova);
        }
}
}
