package aplicacao;

import entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Double total1;
		Triangulo x;
		
		x = new Triangulo();
	
		
		x.ladoA = 20.5;
		x.ladoB= 30.6;
		x.ladoC = 59.6;
		
		total1 = x.soma();
		System.out.println(total1);
		
		

	}

}
