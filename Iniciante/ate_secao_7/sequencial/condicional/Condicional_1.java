package condicional;

public class Condicional_1 {

	public static void main(String[] args) {
		Double numero1 = 10.0;
		Double numero2 = 30.60;

		if (numero1 < numero2) {
			System.out.println(numero1 + " < " + numero2);

		} else if (numero1 > numero2) {
			System.out.println(numero1 + " > " + numero2);
		} else {
			System.out.println(numero1 + "=" + numero2);
		}

	}

}
