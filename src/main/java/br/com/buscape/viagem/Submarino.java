package br.com.buscape.viagem;

/**
 * Representa o Submarino e suas funcoes
 * 
 * @author Douglas
 */
public class Submarino {

	private Integer x;
	private Integer y;
	private Integer z;

	private SubmarinoDirecao direcao;

	public Submarino() {
		this.x = 0;
		this.y = 0;
		this.z = 0;

		this.direcao = SubmarinoDirecao.NORTE;
	}

	/**
	 * Recebe e executa os comandos possiveis:<br />
	 * L / R => direita / esquerda <br />
	 * M => vai pra frente no sentido da direcao <br />
	 * U / D => sobe / desce
	 * 
	 * @param comandos - Lista de comandos para o Submarino
	 */
	public void navegar(String comandos) {
		for (int i = 0; i < comandos.length(); i++) {
			char comando = comandos.charAt(i);
			mover(comando);
		}
		System.out.println(this);
	}

	/**
	 * Realiza um movimento possivel
	 * 
	 * @param comando
	 */
	private void mover(char comando) {
		switch (comando) {
		case 'L':
			girarEsquerda();
			break;
		case 'R':
			girarDireita();
			break;
		case 'M':
			andar();
			break;
		case 'U':
			z++;
			break;
		case 'D':
			z--;
			break;

		default:
			break;
		}
	}

	/**
	 * Anda no sentido da direcao
	 */
	private void andar() {
		switch (direcao) {
		case NORTE:
			y++;
			break;
		case SUL:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;

		default:
			break;
		}
	}

	public void girarEsquerda() {
		if (direcao.getCodigo() < 3) {
			direcao = SubmarinoDirecao.getByCodigo(direcao.getCodigo() + 1);
		} else {
			direcao = SubmarinoDirecao.getByCodigo(0);
		}
	}

	public void girarDireita() {
		if (direcao.getCodigo() > 0) {
			direcao = SubmarinoDirecao.getByCodigo(direcao.getCodigo() - 1);
		} else {
			direcao = SubmarinoDirecao.getByCodigo(3);
		}
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public SubmarinoDirecao getDirecao() {
		return direcao;
	}

	public void setDirecao(SubmarinoDirecao direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return "Submarino [x=" + x + ", y=" + y + ", z=" + z + ", direcao=" + direcao + "]";
	}

}
