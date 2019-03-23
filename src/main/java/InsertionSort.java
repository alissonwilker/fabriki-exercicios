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
        for (int contadorQualquer = 0; contadorQualquer < this.lista.size(); contadorQualquer++) {
            for (int contImportante = 0; contImportante < this.lista.size() - 1; contImportante++) {                
                if (this.lista.get(contImportante) > this.lista.get(contImportante + 1)) {
                    troca(contImportante, contImportante + 1);
                }
            }
        }
    }
}

