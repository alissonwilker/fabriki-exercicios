
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

            for (int j = 0; j < this.lista.size() - 1; j++) {

                if (this.lista.get(j) > this.lista.get(j + 1)) {

                    troca(j, j+ 1);

                }
            }
        }
    }

    private void troca(int x, int y) {
        int aux = this.lista.get(x);
       
        this.lista.set(x, this.lista.get(y));
        this.lista.set(y, aux);
   
    }

}
