
import java.util.List;
import static javax.management.Query.value;

public class BuscaSequencial {

    private List<Object> lista;

    public BuscaSequencial(List<Object> lista) {
        this.lista = lista;
    }

    public List<Object> getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }

    public int busca(Object o) {
        for (int i = 0; i < lista.size(); i++) {
            
            if (getLista() == o) {
                return i;
            }

        }
        return -1;
    }

    public int buscaRecursiva(Object o, int indice) {
        return 0;
    }
}
