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
	  int el,j;
        for (int i=1;i<lista.size();i++){
            el = lista.size();
            j=i-1;
            while (j>=0 && el < lista.get(j)){
                lista.set(j+1, lista.get(j));
                j--;
            }
            lista.set(j+1, el);
        }

        }
}
