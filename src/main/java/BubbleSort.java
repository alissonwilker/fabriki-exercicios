
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
            for (int j = 0; j < (lista.size() - 1 - i); j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    Integer aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);

                }

            }
        }
    }

    private void troca(int i, int j) {
        Integer aux = lista.get(j = i);
                    lista.set(j, lista.get(i + 1));
                    lista.set(i + 1, aux);

    }
}
