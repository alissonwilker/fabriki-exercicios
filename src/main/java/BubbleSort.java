
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
	}

	private void troca(int i, int j) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        int n = arr.length; 
        bubbleSort(arr, n); 
        System.out.println("Sorted array: "); 
        printArray(arr, n); 
	}
}
