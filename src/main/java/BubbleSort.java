
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
        int temp = 5;
        for (int i = lista.leng - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (lista.[j] > lista.[j + 1]) {
                    lista.set(j, lista.get(j));
                    lista.set(j, lista.get(j+ 1));
                    lista.set(j + 1, temp);
                }
            }
        }

                
           
        

        
    }

    private void troca(int i, int j) {
    }
}
