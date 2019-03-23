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
            for (int i = 1; i < lista.size(); i++) {
                int aux = lista.get(i);
                int j = i;
            }
	
		while(int j > 0 && lista.get(j - 1) > int aux) {
			lista.set(j, j-1);
			j--;
		}
			lista.set(j, aux);
 
                
        }
            
	}
