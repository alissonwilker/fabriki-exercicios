import java.util.ArrayList;
import java.util.List;

public class BuscaSequencial {

	private List<Object> lista = new ArrayList<Object>();
        
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
           for (int i = 0; i < this.lista.size(); i++) {
               if(this.lista.get(i).equals(o)){
                   return this.lista.indexOf(o);
        }
           }
                   return -1;
        }
	public int buscaRecursiva(Object o, int indice) {
                         if(this.lista.get(indice).equals(o)) {
                           return indice;
                } else if (indice == this.lista.size() -1) {
                        return -1;
        } else {
             return buscaRecursiva (o, ++indice);
}
}
}
