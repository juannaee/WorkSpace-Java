package repetitiva;

public class Repetitiva_1 {

	public static void main(String[] args) {
		
		Integer contador = 1;

		while(contador < 5) {
			System.out.println(contador);
			contador += 1;
			
		}
		System.out.println("--------------------------------");
		
		for(int i = 0; i<5;i+=1) {
			System.out.println(i);
			
		}
		System.out.println("--------------------------------");
		
		do {
			contador+=1;
			System.out.println(contador);
		}while(contador < 5);
			
	
		
	}

}
