package entidade;

import java.util.UUID;

public class Conta {

	private Double saldo;
	private UUID id;
	private String nomeCliente;

	public Conta() {
		this.id = UUID.randomUUID();

	}

	public Conta(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.id = UUID.randomUUID();
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public UUID getId() {
		return this.id;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void depositar(Double saldo) {
		this.saldo += saldo;
	}

	public void sacar(Double saldo) {
		if (saldo > this.saldo) {
			System.out.println("Valor de saque indisponivel");
		} else {
			this.saldo -= saldo;
		}
	}

}
