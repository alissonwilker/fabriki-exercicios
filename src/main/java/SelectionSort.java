import java.util.List;

public class SelectionSort {

	private List<Integer> lista;

	public SelectionSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
         for (int i = 0; i < lista.size() -1; i++){
             int min= i;
             for(int j = i +1; j < lista.size(); j++)
                 if(lista.get(j) < lista.get(min))
                     min = j;
             
             int temp = lista.get(min);
             lista.set(min, lista.get(i));
             lista.set(i, temp);
            }
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
                
                    }
                }
	
