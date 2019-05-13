
import java.util.List;

public class BuscaBinaria {

    private List<Integer> lista;

    public BuscaBinaria(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getLista() {
        return lista;
    }

    public void setLista(List<Integer> lista) {
        this.lista = lista;
    }

    public int buscar(Integer valor) {
        return buscaBinaria(valor, 0, this.lista.size());

    }

    private int buscaBinaria(Integer valor, int inicio, int fim) {
        return 0;

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
