
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuscaSequencialTest {

	private List<Object> lista;

	@Before
	public void setUp() {

		Elemento e1 = new Elemento(1, "nome1", 1);
		Elemento e2 = new Elemento(2, "nome2", 2);
		Elemento e3 = new Elemento(3, "nome3", 3);
		Elemento e4 = new Elemento(4, "nome4", 4);
		Elemento e5 = new Elemento(5, "nome5", 5);
		Elemento e6 = new Elemento(6, "nome6", 6);
		Elemento e7 = new Elemento(7, "nome7", 7);
		Elemento e8 = new Elemento(8, "nome8", 8);
		Elemento e9 = new Elemento(9, "nome9", 9);
		Elemento e10 = new Elemento(10, "nome10", 10);

		this.lista = new ArrayList<Object>();
		this.lista.add(e10);
		this.lista.add(e4);
		this.lista.add(e2);
		this.lista.add(e8);
		this.lista.add(e1);
		this.lista.add(e9);
		this.lista.add(e3);
		this.lista.add(e7);
		this.lista.add(e5);
		this.lista.add(e6);

	}

	@Test
	public void buscaTest() {
		BuscaSequencial buscaSequencial = new BuscaSequencial(this.lista);

		Elemento elemento = new Elemento(7, "nome7", 7);
		int resultado = buscaSequencial.busca(elemento);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 7);

		elemento = new Elemento(3, "nome3", 3);
		resultado = buscaSequencial.busca(elemento);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 6);

		elemento = new Elemento(11, "nome11", 11);
		resultado = buscaSequencial.busca(elemento);
		Assert.assertTrue(resultado == -1);

		elemento = new Elemento(3, "nome1", 4);
		resultado = buscaSequencial.busca(elemento);
		Assert.assertTrue(resultado == -1);

		this.lista = null;
		elemento = new Elemento(3, "nome1", 4);
		resultado = buscaSequencial.busca(elemento);
		Assert.assertTrue(resultado == -1);

		this.lista = new ArrayList<Object>();
		elemento = new Elemento(3, "nome1", 4);
		resultado = buscaSequencial.busca(elemento);
		Assert.assertTrue(resultado == -1);

	}

	@Test
	public void buscaRecursivaTest() {
		BuscaSequencial buscaSequencial = new BuscaSequencial(this.lista);

		Elemento elemento = new Elemento(7, "nome7", 7);
		int resultado = buscaSequencial.buscaRecursiva(elemento, 0);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 7);

		elemento = new Elemento(3, "nome3", 3);
		resultado = buscaSequencial.buscaRecursiva(elemento, 0);
		Assert.assertTrue(resultado != -1);
		Assert.assertTrue(resultado == 6);

		elemento = new Elemento(11, "nome11", 11);
		resultado = buscaSequencial.buscaRecursiva(elemento, 0);
		Assert.assertTrue(resultado == -1);

		elemento = new Elemento(3, "nome1", 4);
		resultado = buscaSequencial.buscaRecursiva(elemento, 0);
		Assert.assertTrue(resultado == -1);

		this.lista = null;
		elemento = new Elemento(3, "nome1", 4);
		resultado = buscaSequencial.buscaRecursiva(elemento, 0);
		Assert.assertTrue(resultado == -1);

		this.lista = new ArrayList<Object>();
		elemento = new Elemento(3, "nome1", 4);
		resultado = buscaSequencial.buscaRecursiva(elemento, 0);
		Assert.assertTrue(resultado == -1);
	}

}
