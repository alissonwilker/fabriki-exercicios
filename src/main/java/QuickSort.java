import java.util.List;

public class QuickSort {

    private List<Integer> lista;

    public QuickSort(List<Integer> lista) {
        this.lista = lista;
    }

    public List<Integer> getListaOrdenada() {
        this.ordena(0, this.lista.size() - 1);
        return lista;
    }

    private void ordena(int inicio, int fim) {

        int meio;

        if (inicio < fim) {

            meio = partition(this.lista, inicio, fim);

            quicksort(this.lista, inicio, meio);

            quicksort(this.lista, meio + 1, fim);

        
         while (inicio <= fim) {
               if (this.lista.get(inicio) < meio) {
                inicio++;
            }
            while (this.lista.get(fim) > meio) {
                fim--;
            }
            if (inicio <= meio) {
                troca(inicio, fim);
                inicio++;
                fim++;

            
            }
        }

        if (fim < inicio)
            quickSort(this.lista, fim);
        if (inicio < fim)
            quickSort(this.lista, inicio);
    }
    }
 




    private void troca(int i, int j) {
        Integer aux = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, aux);
    }

    private int partition(List<Integer> lista, int inicio, int fim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quicksort(List<Integer> lista, int inicio, int eixo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

    private void quickSort(List<Integer> lista, int inicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    }
