package condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double planoBasico = 50.00;
		Double planoComMulta = 0.0;
		Integer minutosLimite = 100;
		Double multa = 2.00;
		Integer minutosLigados;

		System.out.println("Minutos usados");
		minutosLigados = sc.nextInt();

		if (minutosLigados > minutosLimite) {
			planoComMulta = planoBasico += (minutosLigados - minutosLimite) * multa;
			System.out.println("Valor a pagar: " + planoComMulta);

		} else {
			System.out.println("Valor a pagar: " + planoBasico);
		}

		sc.close();
	}

}
