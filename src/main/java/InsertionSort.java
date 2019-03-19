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
            
            for (int j = 1; j < lista.size(); j++){
                int key = lista.get(j);
                int i = j -1;
                while (j >= 0 && lista.get(i) >= key){
                    lista.set(j + 1, lista.get(j)); 
                    j--;
                    
                    
                }
                
                lista.set(j + 1, key);
                
                
            }
	}
}
