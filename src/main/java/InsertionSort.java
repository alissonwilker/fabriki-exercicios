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
		
		for(int j = 1; j < this.lista.size(); j++) {
			if(j > 0) {				
				for (int i = j; i > 0; i--) {
					int posUm = this.lista.get(i - 1);
					int posDois = this.lista.get(i);

					if (posDois < posUm) {
						this.lista.set(i - 1, posDois);
						this.lista.set(i, posUm);
						System.out.println("Troca " + posUm + " por " + posDois);
					}
				}
			}		
		}		
	}
}
