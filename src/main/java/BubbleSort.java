
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
        for (i = 0; i < lista; i++){
        for (j = 0; j < lista -1;; j++){
            if (lista[j] > lista[j+1]){
                troca(j, j + 1);
               }
}
	}

	private void troca(int i, int j) {
        troca(i, j){
            aux = lista[i];
            lista[i] = lista[i + 1];
            lista[i + 1] = aux;
	}
}
