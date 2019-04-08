
import java.util.List;

public class BuscaSequencial {

	private List<Object> lista;

	public BuscaSequencial(List<Object> lista) {
		this.lista = lista;
	}

	public List<Object> getLista() {
		return lista;
	}

	public void setLista(List<Object> lista) {
		this.lista = lista;
	}

	public int busca(Object o) {

		for (int i = 0; i < lista.size(); i++) {
			if (o.equals(lista.get(i))) {
				return i;
			}
		}

		return -1;
	}

	public int buscaRecursiva(Object o, int indice) {
		if (this.lista == null) {
			return -1;
		} else if (this.lista.size() == 0) {
			return -1;
		} else if (indice >= this.lista.size()) {
			return -1;
		} else {
			if (o.equals(this.lista.get(indice))) {
				return indice;
			} else {
				return this.buscaRecursiva(o, ++indice);
			}
		}
	}
}
