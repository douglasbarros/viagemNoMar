package br.com.buscape.viagem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Testes para viagens do Submarino
 * 
 * @author Douglas
 *
 */
public class TesteViagem {

	@Test
	public void testNotNull() {
		Submarino submarino = new Submarino();

		assertNotNull(submarino);
		assertNotNull(submarino.getX());
		assertNotNull(submarino.getY());
		assertNotNull(submarino.getZ());
		assertNotNull(submarino.getDirecao());
	}

	@Test
	public void testPosicaoInicial() {
		Submarino submarino = new Submarino();

		assertEquals(0, submarino.getX().intValue());
		assertEquals(0, submarino.getY().intValue());
		assertEquals(0, submarino.getZ().intValue());
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
	}

	@Test
	public void testNavegacaoVazia() {
		Submarino submarino = new Submarino();
		submarino.navegar("");

		assertEquals(0, submarino.getX().intValue());
		assertEquals(0, submarino.getY().intValue());
		assertEquals(0, submarino.getZ().intValue());
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
	}

	@Test
	public void testNavegacaoInvalida() {
		Submarino submarino = new Submarino();
		submarino.navegar("ABC");

		assertEquals(0, submarino.getX().intValue());
		assertEquals(0, submarino.getY().intValue());
		assertEquals(0, submarino.getZ().intValue());
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
	}

	@Test
	public void testNavegacaoValida() {
		Submarino submarino = new Submarino();
		submarino.navegar("RMMLMMMDDLL");

		assertEquals(2, submarino.getX().intValue());
		assertEquals(3, submarino.getY().intValue());
		assertEquals(-2, submarino.getZ().intValue());
		assertEquals(SubmarinoDirecao.SUL, submarino.getDirecao());
	}

}
