package condicional;

import java.util.Scanner;

public class Condicional_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("F - FEMININO / M - MASCULINO");
        String sx = sc.next();
        sx = (sx.equalsIgnoreCase("F")) ? "Feminino" : (sx.equalsIgnoreCase("M") ? "Masculino" : "N/D");

        System.out.println(sx);

        sc.close();
    }
}
