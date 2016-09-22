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

		assertEquals(Integer.valueOf(0), submarino.getX());
		assertEquals(Integer.valueOf(0), submarino.getY());
		assertEquals(Integer.valueOf(0), submarino.getZ());
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
	}

	@Test
	public void testNavegacaoVazia() {
		Submarino submarino = new Submarino();
		submarino.navegar("");

		assertEquals(Integer.valueOf(0), submarino.getX());
		assertEquals(Integer.valueOf(0), submarino.getY());
		assertEquals(Integer.valueOf(0), submarino.getZ());
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
	}

	@Test
	public void testNavegacaoInvalida() {
		Submarino submarino = new Submarino();
		submarino.navegar("ABC");

		assertEquals(Integer.valueOf(0), submarino.getX());
		assertEquals(Integer.valueOf(0), submarino.getY());
		assertEquals(Integer.valueOf(0), submarino.getZ());
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
	}

	@Test
	public void testAlteraDirecoes() {
		Submarino submarino = new Submarino();
		
		submarino.navegar("R");
		assertEquals(SubmarinoDirecao.LESTE, submarino.getDirecao());
		
		submarino.navegar("R");
		assertEquals(SubmarinoDirecao.SUL, submarino.getDirecao());
		
		submarino.navegar("R");
		assertEquals(SubmarinoDirecao.OESTE, submarino.getDirecao());
		
		submarino.navegar("R");
		assertEquals(SubmarinoDirecao.NORTE, submarino.getDirecao());
		
		submarino.navegar("L");
		assertEquals(SubmarinoDirecao.OESTE, submarino.getDirecao());

		assertEquals(Integer.valueOf(0), submarino.getX());
		assertEquals(Integer.valueOf(0), submarino.getY());
		assertEquals(Integer.valueOf(0), submarino.getZ());
	}

	@Test
	public void testNavegacaoValida() {
		Submarino submarino = new Submarino();
		submarino.navegar("RMMLMMMDDLL");

		assertEquals(Integer.valueOf(2), submarino.getX());
		assertEquals(Integer.valueOf(3), submarino.getY());
		assertEquals(Integer.valueOf(-2), submarino.getZ());
		assertEquals(SubmarinoDirecao.SUL, submarino.getDirecao());
	}

}
