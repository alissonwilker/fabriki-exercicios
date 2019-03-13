
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
        for (int i = 0; i < lista.size(); i++) {
            int inicio = lista.get(0);
        }
        
        for (int i = 0; i < lista.size() - 1; i++) {
            
            if( lista.get(i) < lista.get(i) + 1) {
                troca(i,inicio);
            } else inicio = lista.get(i+1);
        }
    }

    private void troca(int i, int j) {
        
        lista.set(i, lista.get(i + 1));
        
        lista.set(i + 1 , j);
    }
}
