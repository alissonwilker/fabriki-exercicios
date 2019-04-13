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
           for (int i = 0; i < lista.size(); i++) {
               if(getLista(i).equals (o)){
                   return this.lista.indexOf(o);
        }
           }
                    return i;
        }
	public int buscaRecursiva(Object o, int indice) {
                         if(lista.get(indice).equals(o)) {
                           return indice;
                } else if (indice == lista.size() -1) {
                        return -1;
        } else {
             return buscaRecursiva (o, ++indice);
}
}
}
