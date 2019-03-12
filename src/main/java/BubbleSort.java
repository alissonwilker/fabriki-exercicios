
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private List<Integer> lista = new ArrayList<Integer>();

    public BubbleSort(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getListaOrdenada() {
        this.ordena();
        return lista;
    }

    private void ordena() {
        for (int i = 0; i < this.lista.size(); i++) {
            int aux = this.lista.get(0);
            for (int x = 0; x < this.lista.size() - 1; x++) {
                if (this.lista.get(x) > this.lista.get(x + 1)) {
                    troca(x, aux);
                }
                else aux = this.lista.get(x+1);
            }
        }
        System.out.println(this.lista.toString());
    }

    private void troca(int i, int j) {
            this.lista.set(i, this.lista.get(i + 1));
            this.lista.set(i + 1, j);
    }
}

