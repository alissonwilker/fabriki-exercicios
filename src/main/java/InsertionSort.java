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
            for (int i = 1; i < lista.size; i++){
			
			int aux = lista.get(i);
			int j = i;
			
			while ((j > 0) && (lista.get(j-1) > aux)){
				lista.set(j, lista.get(j-1));
				j -= 1;
			}
			lista.set(j, aux);
                
		}
	
	}
        }
