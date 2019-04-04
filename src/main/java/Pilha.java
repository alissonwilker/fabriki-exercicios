
import java.util.List;


public class Pilha {
	private List<Integer> pilha;
        
	public Integer getTamanho() {
		return this.pilha.size();
	}
	
	public void entrarNaPilha(Integer elemento) {
		
	}
	
	public Integer sairDaPilha() {
            return this.pilha.remove(this.pilha.size() - 1);
        }
        
	
	

	
	public Integer getTopo() {
		return 0;
	}


}
