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

	}

	private void ordena() {

		for (int i = 0; i < lista.size; i++) 
        {
                int a = array[i];
                for (int j = i - 1; j >= 0 && this.lista.size[j] > a; j--)
                {
                        this.lista.get[j + 1] = this.lista.get[j];
                        troca[j] = a;
                }                       
        }               

	}
}
