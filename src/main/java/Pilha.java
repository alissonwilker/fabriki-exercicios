
import java.util.ArrayList;
import java.util.List;


public class Pilha {
       private List<Integer> pilha;
       
	
	public Integer getTamanho() {
		return this.pilha.size();
	}
	
	public void entrarNaPilha(Integer elemento) {
           this.pilha.add(elemento);
		
	}
	
	public Integer sairDaPilha() throws Exception {
            if(getTamanho() != 0){
            return this.pilha.remove(0);  
          } else {
              throw new Exception("Mano, a fila está vazia");
    }
    }
	
	public Integer getTopo() {
		return this.pilha.indexOf(pilha);
	}

}
