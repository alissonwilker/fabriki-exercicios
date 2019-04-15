
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
                  
            for (int j = 1; j < lista.size(); j++){
                int key = lista.get(j);
                int i = j -1;
                while (i >= 0 && lista.get(i) >= key){
                    lista.set(i + 1, lista.get(i)); 
                    i--;
                    
                    
                }
                
                lista.set(i + 1, key);
                
            }
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
                for(int fixo = 0; fixo < lista.size() - 1; fixo++){
                    int menor = fixo;
                    
                    for(i = menor +1; i < lista.size(); i++){
                        if(lista.get[i] < lista.get[menor]){
                            menor = i;
                        }
                    }
                    if (menor != fixo){
                        int t = lista.get(fixo);
                        lista.get[fixo] = lista.set[menor];
                        lista.set[menor] = t;
                    }
                }
	}

}
