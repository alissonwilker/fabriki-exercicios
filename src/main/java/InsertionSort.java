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
            for (int i = 1; i < this.lista.size(); i++) { 
                int eleito = this.lista.get(i);
                int j = i;
            while(j>0 && this.lista.get(j-1)> eleito){
            this.lista.set(j)=this.lista.get(j-1);
            j--;
            this.lista.set(j)=eleito;
                }
            }
        }
}    


    
