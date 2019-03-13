
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
        int aux = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    lista.set(j, lista.get(j));
                    lista.set(j, lista.get(j + 1));
                      lista.set(j+1, aux);

                }
            }
        

        }
    }

    private void troca(int i, int j) {
    }
}
