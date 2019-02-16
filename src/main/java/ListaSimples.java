import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valtersales
 */
public class ListaSimples {

    private List<Integer> lista;

    public ListaSimples() {
        lista = new ArrayList<>();
    }

    public void insere(Integer valor) {
        if (valor != null) {
            this.lista.add(valor);
        }
    }

    public void insereInicio(Integer valor) {
        if (valor != null) {
            this.lista.add(0, valor);
        }
    }

    public void insereIndice(Integer valor, int indice) {
        if (valor != null) {
            this.lista.add(indice, valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            this.lista.remove(valor);
        }
    }

    public void removeIndice(int indice) {
        if (indice >= 0 || indice < this.lista.size()) {
            this.lista.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }

    public boolean existe(Integer valor) {
        return this.lista.contains(valor);
    }

    public Integer recuperar(int indice) {
        return this.lista.get(indice);
    }

    public Integer recuperarPosicao(Integer valor) {
        return this.lista.indexOf(valor);
    }
    
    public int recuperarTamanho() {
        return this.lista.size();
    }
    
    public String toString() {
        return this.lista.toString();
    }
}
