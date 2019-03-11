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
        public int[]bubbleSort (int[]list){
            int i;
            int j;
            int temp;
            for(i=0;i < list.length -1; i++){
                if(list[j] > list[list[j + 1]]) {
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                }
            return list;
            }
       
