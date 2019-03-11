
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
	}

	private void troca(int i, int j) {
	}
        public static void main(String [] args){
        int number [] = {1,2,3,4,5};
                       //0,1,2,3,4
                       
        int temp;
        boolean fixed=false;
        
        while(fixed==false){
            fixed=true;
        }
        for(int i=0; i<number.length-1 ; i++){
                if(number[i] > number[i+1]){
                    
        temp = number [i+1];
        number[i +1]= number[i];
        number[i]=temp;
        fixed=false;
        
}
        }
        }
  
}
