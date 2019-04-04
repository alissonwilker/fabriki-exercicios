
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

public class Pilha {

    private List<Integer> pilha = new ArrayList<Integer>();

    public Integer getTamanho() {
        return this.pilha.size();
    }

    public void entrarNaPilha(Integer elemento) {
        this.pilha.add(elemento);

    }

    public Integer sairDaPilha() throws IndexOutOfBoundsException {
        if (getTamanho() != 0) {
            return this.pilha.remove(getTamanho() -1);
        } else {
            throw new IndexOutOfBoundsException("pilha está vazia");
        }

    }

    public Integer getTopo() {
        Integer getTopo = this.pilha.size() -1;
        return pilha.get(getTopo);
        
    }

}
