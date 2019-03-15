
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
		for(Integer i = 0; i < this.lista.size(); i++ ) {
			if(i + 1 < this.lista.size()) {
				Integer posUm = this.lista.get(i);
				Integer posDois = this.lista.get(i + 1);
				if(posDois < posUm ) {
					this.troca(i, posDois );
					this.troca(i + 1, posUm );
					i = 0;
				}				
			}
		}
	}

	private void troca(int i, int j) {
		this.lista.set(i, j);		
	}
}
