mport java.util.List;

public class QuickSort {

	private List<Integer> lista;

	public QuickSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
	        this.ordena();
		return lista;
	
                
        private void ordena(){
            for(int i = 1; i < this.lista.size(); i++){
                
                int aux = this.lista.get(i);
                int j =i;
                
                while((j > 0) &&(this.lista.get(j-1) > aux)){
                    this.lista.set(j, this.lista.get(j-1));
                    
                    j -= 1;
                }
                
                this.lista.set(j, aux);
                
            }
        }        

	private void ordena(int inicio, int fim) {
            
           Integer aux = lista.get(inicio); 
           lista.set(inicio,lista.get(fim));
           lista.set(fim, aux);
        
	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
