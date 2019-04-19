import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void ordenaTest() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(7);
		lista.add(5);
		lista.add(8);
		lista.add(4);
		lista.add(20);

		SelectionSort selectionSort = new SelectionSort(lista);
		List<Integer> listaOrdenada = selectionSort.getListaOrdenada();

		Assert.assertTrue(listaOrdenada.get(0) == 4);
		Assert.assertTrue(listaOrdenada.get(1) == 5);
		Assert.assertTrue(listaOrdenada.get(2) == 7);
		Assert.assertTrue(listaOrdenada.get(3) == 8);
		Assert.assertTrue(listaOrdenada.get(4) == 10);
		Assert.assertTrue(listaOrdenada.get(5) == 20);
	}

	@Test
	public void ordenaPiorCasoTest() {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(1);

		SelectionSort selectionSort = new SelectionSort(lista);
		List<Integer> listaOrdenada = selectionSort.getListaOrdenada();

		Assert.assertTrue(listaOrdenada.get(0) == 1);
		Assert.assertTrue(listaOrdenada.get(1) == 2);
		Assert.assertTrue(listaOrdenada.get(2) == 3);
		Assert.assertTrue(listaOrdenada.get(3) == 4);
		Assert.assertTrue(listaOrdenada.get(4) == 5);
	}

}
