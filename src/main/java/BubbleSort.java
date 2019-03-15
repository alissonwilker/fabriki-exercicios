import java.util.List;

public class BubbleSort {

	private List<Integer> lista;

	public BubbleSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {
            for(int i=0; i < this.lista.size();i++){
                for(int y = 0; y < this.lista.size()-1; y++){
                    if(this.lista.get(y) > this.lista.get(y+1)){
                        troca (y, y +1);
                    }
                    
                }
            }
	}

	private void troca(int i, int j) {
            int aux = this.lista.get(i);
          this.lista.set(i,this.lista.get(j));
          this.lista.set(j, aux);
	}
}
