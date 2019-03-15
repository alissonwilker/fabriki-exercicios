
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

        for (int contador = 1; contador < this.lista.size() - 1; contador++) {

            for (int i = 0; i < this.lista.size(); i++) {

                if (this.lista.get(i) > this.lista.get(i + 1)) {

                    troca(i, i + 1);

                }
            }
        }

    }

    private void troca(int i, int j) {

        this.lista.set(i, this.lista.get(i + 1));

        this.lista.set(i + 1, j);
    }

}
