import java.util.List;

public class InsertionSort {
	
	private final List<Integer> lista;

	public InsertionSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
            int n = 0;
            
            for (int j = 1; j < n; ++j) {
                int[] v = null;
                int x = v[j];
           for (int i = j-1; i >= 0 && v[i] > x; --i) {
           v[i+1] = v[i];
           v[i] = x; } }
	
        }
}
