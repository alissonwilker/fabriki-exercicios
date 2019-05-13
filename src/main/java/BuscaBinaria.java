
import java.util.List;

public class BuscaBinaria {

	private List<Integer> lista;

	public BuscaBinaria(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	public int buscar(Integer valor) {

		if (lista != null && lista.size() > 0) {
			this.ordena();
			return this.buscaBinaria(valor, 0, this.lista.size() - 1);
		}

		return -1;
	}

	private int buscaBinaria(Integer valor, int inicio, int fim) {
		
		if (inicio > fim) { 
			return -1;
		}

		int meio = (inicio + fim) / 2;

		if (valor == lista.get(meio)) {
			return meio;
		} else {
			if (valor < lista.get(meio)) {
				return buscaBinaria(valor, 0, meio - 1);
			} else {
				return buscaBinaria(valor, meio + 1, fim);
			}
		}
	}

	private void ordena() {

		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista.size() - 1; j++) {
				if (lista.get(j) > lista.get(j + 1)) {
					troca(j, j + 1);
				}
			}
		}
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}
}
