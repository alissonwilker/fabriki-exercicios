import java.util.ArrayList;
import java.util.List;

public class BuscaSequencial {

	private List<Object> lista;
        
	public BuscaSequencial(List<Object> lista) {
		this.lista = new ArrayList<Object>();
	}

	public List<Object> getLista() {
            this.getLista();
            return lista;
	}

	public void setLista(List<Object> lista) {
		this.lista = lista;
	}

	public int busca(Object o) {
           for (int i = 0; i < lista.size(); i++) {
               if(getLista() == o ){            
        }
               return i;
           }
           return -1;
        }
        
	public int buscaRecursiva(Object o, int indice) {
               
               
            if(this.lista.get(indice) .equals(o)){
                    return indice;
                }else if(indice == lista.size() -1){
                    return -1;
                } else{
                    return buscaRecursiva (indice++, this.lista.indexOf(o));
                }
            
        }
        }
       
