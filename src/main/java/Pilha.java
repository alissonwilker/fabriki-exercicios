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

    public Integer sairDaPilha() throws Exception {
        if (getTamanho() != 0) {
            return this.pilha.remove(pilha.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("Mano, a fila está vazia");
        }
    
    }
	

    public Integer getTopo() {  
        Integer posicaoUltimoElemento = this.pilha.size() - 1;
        return pilha.get(posicaoUltimoElemento);

    }

}
