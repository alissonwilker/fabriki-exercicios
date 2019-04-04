import java.util.ArrayList;
import java.util.List;

public class Pilha {
	
	private List<Integer> pilha;
	
	public Pilha() {
		this.pilha = new ArrayList<Integer>();
	}
	
	public Integer getTamanho() {
		return this.pilha.size();
	}
	
	public void entrarNaPilha(Integer elemento) {
		this.pilha.add(elemento);
	}
	
	public Integer sairDaPilha() throws IndexOutOfBoundsException{
		
		if (getTamanho() == 0) {
			throw new IndexOutOfBoundsException("Pilha vazia");
		}
		
		return this.pilha.remove(getTamanho() - 1);
	}
	
	public Integer getTopo() {
		return this.pilha.get(getTamanho() - 1);
	}

}
