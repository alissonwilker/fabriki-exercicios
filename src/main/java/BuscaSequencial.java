
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
		return this.lista.indexOf(o);
	}

	public int buscaRecursiva(Object o, int indice) {
		if (this.lista.get(indice).equals(o)) {
			return indice;
		}else {						
			if (++indice >= this.lista.size()) {
				return -1;				
			}else {				
				return this.buscaRecursiva(o, indice);				
			}
		}
	}
}
