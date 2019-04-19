
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
            for(int i = 0 ; i < this.lista.size() - 1 ; i++){
                int eleito = i;
                int menor = eleito;
                for(int j = i + 1 ; j < this.lista.size() ; j++){
                    if(this.lista.get(menor) > this.lista.get(j)){
                        menor = j;
                    }
                    
                }
                if(eleito != menor){
                    troca(eleito, menor);
                }
            }
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
