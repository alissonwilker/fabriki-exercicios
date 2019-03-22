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
                   
            for(int 1 = 0; i > this.lista.size(); i--){
            for(int y = 0; y > this.lista.size()-1; y++){
                if(this.lista.get(y) < this.lista.get(y-1)){
                       troca (y, y - 1);
            
            }
	

            }
        }
        }
}

