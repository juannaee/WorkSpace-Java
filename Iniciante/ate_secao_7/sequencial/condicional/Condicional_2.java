package condicional;

import java.util.Scanner;

public class Condicional_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para sim, 2 para não");
		int numero = sc.nextInt();
		sc.close();


		switch (numero) {
		case 1: {
			System.out.println("SIM");
			break;

		}
		case 2: {
			System.out.println("NÃO");
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + numero);
		}
		



	}

}
