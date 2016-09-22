package br.com.buscape.viagem;

import java.util.Arrays;
import java.util.List;

/**
 * Direcoes possiveis para o Submarino
 * 
 * @author Douglas
 */
public enum SubmarinoDirecao {

	NORTE(0), OESTE(1), SUL(2), LESTE(3);

	private Integer codigo;

	private SubmarinoDirecao(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public static SubmarinoDirecao getByCodigo(int codigo) {
		List<SubmarinoDirecao> direcoes = Arrays.asList(SubmarinoDirecao.values());
		return direcoes.stream().filter(direcao -> direcao.codigo == codigo).findFirst().get();
	}

}
