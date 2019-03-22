import java.util.List;

public class InsertionSort {
	
	private List<Integer> lista;

	public InsertionSort(List<Integer> lista) {
           {
		this.lista = lista;
	}

    public List<Integer> getListaOrdenada() {
            
		this.ordena();
		return lista;
	}

	private void ordena() {
         {
                int[] array = null;
                for (int i = 0; i < array.length; i++) 
                {
                        int a = array[i];
                        for (int j = i - 1; j >= 0 ; j--){  
    if(array[j] > a){
        array[j + 1] = array[j];  
        array[j] = a;  
    }else{
        break;
    }

        }
}
}
        }
}
    }
