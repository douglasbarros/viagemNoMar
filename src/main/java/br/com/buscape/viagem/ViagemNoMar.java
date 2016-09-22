package br.com.buscape.viagem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe para enviar comando para Submarino
 * 
 * @author Douglas
 *
 */
public class ViagemNoMar {

	public static void main(String[] args) throws IOException {
		System.out.println("Ola cientista! Digite as suas coordenadas:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String comandos = reader.readLine();

		while (comandos == null || comandos.isEmpty()) {
			System.out.println("Ah, digite alguma coisa, por favor... :)");
			comandos = reader.readLine();
		}

		Submarino submarino = new Submarino();
		submarino.navegar(comandos);
	}

}
