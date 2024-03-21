package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta1;

		System.out.println("Digite seu nome: ");
		String nomeCliente = sc.nextLine();
		conta1 = new Conta(nomeCliente);


		while (true) {

			try {

				System.out.println(msgOption());
				Integer opcao = sc.nextInt();

				if (opcao == 1) {
					System.out.println("Valor a sacar: ");
					Double valorSaque = sc.nextDouble();
					System.out.println();
					conta1.sacarSaldo(valorSaque);

				} else if (opcao == 2) {
					System.out.println("Valor a depositar: ");
					Double valorDeposito = sc.nextDouble();
					conta1.depositarSaldo(valorDeposito);
					System.out.println();
					System.out.println("----------------------------------------------");
					System.out.println("Informações atualizadas: ");
					msgConta(conta1);
					System.out.println("----------------------------------------------");

				} else if (opcao == 3) {
					System.out.println("Certo! Saindo.............................................");
					break;
				} else {
					throw new IllegalArgumentException();
				}

			} catch (Exception e) {
				System.out.println("Opção indisponivel!!!" + "\n" + "Opções disponiveis: " + "\n" + msgOption());
				sc.nextLine();
			}

		}

		System.out.println(conta1);
		sc.close();

	}

	public static void msgConta(Object conta1) {
		System.out.println(conta1);
	}

	public static String msgOption() {
		return "1 - Sacar" + "\n" + "2 - Depositar" + "\n" + "3 - Sair";
	}

}
