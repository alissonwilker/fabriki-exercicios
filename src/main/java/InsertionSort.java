import java.util.List;

public class InsertionSort {
	
	private List<Integer> lista;

	public InsertionSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	//private void ordena() {
   public static void insertionSort(int[] array) 
         {
                for (int i = 0; i < array.length; i++) 
                {
                        int a = array[i];
                        for (int j = i - 1; j >= 0 && array[j] > a; j--)
                        {
                                array[j + 1] = array[j];
                                array[j] = a;
                        }                       
                }               
        }
}
