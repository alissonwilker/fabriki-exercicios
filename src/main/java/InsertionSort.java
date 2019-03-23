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
            for (int i = 1; i < this.lista.size(); i++) {
                int eleito = int valor(i);
                j=i;
            while(j>0 and valo(j-1)>eleito)}
            valor(j)=valor(j-1);
            j--;
            valor(j)= eleito;
                }
            }
