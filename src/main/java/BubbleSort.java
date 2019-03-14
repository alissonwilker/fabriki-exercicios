import java.util.List;

public class BubbleSort {
        int i = 0;
        int aux = 0;
        int[] lista = {3,2,4,5,1};
	private List<Integer> lista;

	public BubbleSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
        for (i = 0; i<5;; i++){
            for (int j = 0; j<4; j++){
            if (lista[j] > lista[j + 1]){
                aux = lista(j);
                lista(j) = lista(j + 1);
                lista[j+1] = aux;
               }
            }
	}

	private void troca(int i, int j) {
        
	
}
