package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Olá Mundo"); System.out.println("----------------");
		 * 
		 * String x; int y; double a; System.out.print("Digite nome: "); x = sc.next();
		 * System.out.println("Você digitou: " + x);
		 * System.out.print("Digite numero: "); y = sc.nextInt();
		 * System.out.println("Você digitou: " + y);
		 * System.out.print("Digite numero flutuante: "); a = sc.nextDouble();
		 * System.out.printf("Você digitou %.2f%n: " , a);
		 * System.out.println("----------------");
		 */

		int numero1;
		String texto1;
		String texto2;
		numero1 = sc.nextInt();
		sc.nextLine();
		texto1 = sc.nextLine();
		texto2 = sc.nextLine();
		System.out.println(texto1 + texto2 + numero1);
		sc.close();


	}

}
