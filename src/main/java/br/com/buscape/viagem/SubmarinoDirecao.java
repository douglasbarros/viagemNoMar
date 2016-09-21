package br.com.buscape.viagem;

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
		for (SubmarinoDirecao submarinoDirecao : SubmarinoDirecao.values()) {
			if (submarinoDirecao.codigo == codigo) {
				return submarinoDirecao;
			}
		}
		return null;
	}

}
