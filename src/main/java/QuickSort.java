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
		int f = fim;

		while (i <= f) {
			while(this.lista.get(i)< pivot) ++i;
				while(this.lista.get(f) > pivot) --f;
		}
	

	if(this.lista.get(i)>this.lista.get(f));

	troca(i ,f);
				i++;
				f--;
				
				if(i > inicio)  ordena (inicio, i);
				if(i < fim)  ordena (i , fim);
				

	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
