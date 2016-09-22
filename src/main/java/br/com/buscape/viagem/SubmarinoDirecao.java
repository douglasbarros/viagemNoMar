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

	private static final List<SubmarinoDirecao> DIRECOES = Arrays.asList(SubmarinoDirecao.values());

	private SubmarinoDirecao(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	private  SubmarinoDirecao getByCodigo(int codigo) {
		return DIRECOES.stream().filter(direcao -> direcao.codigo == codigo).findFirst().get();
	}

	/**
	 * @return direcao esquerda da atual
	 */
	public SubmarinoDirecao getEsquerda() {
		SubmarinoDirecao esquerda = NORTE;
		if (codigo < 3) {
			esquerda = getByCodigo(codigo + 1);
		}
		return esquerda;
	}

	/**
	 * @return direcao direita da atual
	 */
	public SubmarinoDirecao getDireita() {
		SubmarinoDirecao direita = LESTE;
		if (codigo > 0) {
			direita = getByCodigo(codigo - 1);
		}
		return direita;
	}

}
