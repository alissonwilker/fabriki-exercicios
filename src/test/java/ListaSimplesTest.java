import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ListaSimplesTest {

	@Test
	public void testInsere() {
		System.out.println("insere");
		Integer valor = 10;
		ListaSimples instance = new ListaSimples();
		instance.insere(valor);

		assertTrue(instance.recuperarTamanho() != 0);
		assertEquals(instance.recuperar(0), valor);
	}

	@Test
	public void testInsereInicio() {
		System.out.println("insereInicio");
		Integer valor = 10;
		ListaSimples instance = new ListaSimples();
		instance.insereInicio(valor);

		assertTrue(instance.recuperarTamanho() != 0);
		assertEquals(instance.recuperar(0), valor);

		Integer valor2 = 20;
		instance.insereInicio(valor2);

		assertTrue(instance.recuperarTamanho() == 2);
		assertEquals(instance.recuperar(0), valor2);
	}

	@Test
	public void testInsereIndice() {
		System.out.println("insereIndice");
		Integer valor = 10;
		int indice = 0;
		ListaSimples instance = new ListaSimples();
		instance.insereIndice(valor, indice);

		assertTrue(instance.recuperarTamanho() == 1);
		assertEquals(instance.recuperar(0), valor);

		Integer valor2 = 20;
		instance.insereIndice(valor2, indice);

		assertTrue(instance.recuperarTamanho() == 2);
		assertEquals(instance.recuperar(0), valor2);
	}

	@Test
	public void testRemove() {
		System.out.println("remove");
		Integer valor = 10;
		ListaSimples instance = new ListaSimples();
		instance.insere(valor);

		assertTrue(instance.recuperarTamanho() != 0);
		assertEquals(instance.recuperar(0), valor);

		instance.remove(valor);

		assertTrue(instance.recuperarTamanho() == 0);
		assertEquals(instance.existe(valor), false);

	}

	@Test
	public void testRemoveIndice() {
		System.out.println("removeIndice");
		Integer valor1 = 10;
		Integer valor2 = 20;
		Integer valor3 = 30;

		ListaSimples instance = new ListaSimples();
		instance.insere(valor1);
		instance.insere(valor2);
		instance.insere(valor3);

		assertTrue(instance.recuperarTamanho() == 3);
		assertEquals(instance.recuperar(0), valor1);
		assertEquals(instance.recuperar(1), valor2);
		assertEquals(instance.recuperar(2), valor3);

		instance.removeIndice(1);

		assertTrue(instance.recuperarTamanho() == 2);
		assertEquals(instance.recuperar(0), valor1);
		assertEquals(instance.recuperar(1), valor3);
		assertFalse(instance.existe(valor2));
	}

	@Test
	public void testExiste() {
		System.out.println("existe");
		Integer valor1 = 10;
		Integer valor2 = 20;
		Integer valor3 = 30;

		ListaSimples instance = new ListaSimples();
		instance.insere(valor1);
		instance.insere(valor2);
		instance.insere(valor3);

		assertTrue(instance.recuperarTamanho() == 3);
		assertTrue(instance.existe(valor1));
		assertTrue(instance.existe(valor2));
		assertTrue(instance.existe(valor3));
	}

	@Test
	public void testRecuperar() {
		System.out.println("recuperar");
		ListaSimples instance = new ListaSimples();

		Integer valor1 = 10;
		Integer valor2 = 20;
		Integer valor3 = 30;

		instance.insere(valor1);
		instance.insere(valor2);
		instance.insere(valor3);

		assertEquals(valor1, instance.recuperar(0));
		assertEquals(valor2, instance.recuperar(1));
		assertEquals(valor3, instance.recuperar(2));

	}

	@Test
	public void testRecuperarPosicao() {
		System.out.println("recuperarPosicao");
		ListaSimples instance = new ListaSimples();

		Integer valor1 = 10;
		Integer valor2 = 20;
		Integer valor3 = 30;

		instance.insereInicio(valor1);
		instance.insereInicio(valor2);
		instance.insereInicio(valor3);

		assertTrue(instance.recuperarPosicao(valor1) == 2);
		assertTrue(instance.recuperarPosicao(valor2) == 1);
		assertTrue(instance.recuperarPosicao(valor3) == 0);

	}

	@Test
	public void testRecuperarTamanho() {
		System.out.println("recuperarTamanho");
		ListaSimples instance = new ListaSimples();

		Integer valor1 = 10;
		Integer valor2 = 20;
		Integer valor3 = 30;

		assertTrue(instance.recuperarTamanho() == 0);

		instance.insereInicio(valor1);
		assertTrue(instance.recuperarTamanho() == 1);

		instance.insereInicio(valor2);
		assertTrue(instance.recuperarTamanho() == 2);

		instance.insereInicio(valor3);
		assertTrue(instance.recuperarTamanho() == 3);

	}

}
