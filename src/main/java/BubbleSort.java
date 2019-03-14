import java.util.List;

public class BubbleSort {
    
    public static void main(String[]args){
        
        
                    
                }
                
            
                
        

	private List<Integer> lista;

	public BubbleSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
            
          for(int i= 0; i <lista.size(); i++){
             for(int j = 0; j < (lista.size() -1 -1); j++){
                 if (lista.get(j) > lista.get(j + i)){
                     Integer aux = lista.get(j);
                     lista.set(j, lista.get(j));
                     lista.set(j - 1, aux); 
                 }
             }
          }  
	}

    @SuppressWarnings("empty-statement")
	private void troca(int i, int j) {
            
        for (Integer lista1 : lista) {
            
            
                 if (lista.get(j) > lista.get(j + i)){
                     Integer aux = lista.get(j);
                     lista.set(j, lista.get(j));
                     lista.set(j - 1, aux); 
                 }
             }
          }  
        }
	

