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
        for (int i = 0; i < this.lista.size(); i++) {
            int y = this.lista.size() - 1;
            for (int x = 0; x < this.lista.size() - 1; x++) {
                if (this.lista.get(x) > this.lista.get(x + 1)) {
                    troca(x, x + 1);
                }
                for (; this.lista.get(x) < this.lista.get(y); y--) {
                    if (y == 1) {
                        return;
                    }
                }
            }
        }
    }

    private void troca(int i, int j) {
        int aux = this.lista.get(i);
        this.lista.set(i, this.lista.get(j));
        this.lista.set(j, aux);
    }
}
